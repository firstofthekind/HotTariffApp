package com.firstofthekind.HotTariff.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.firstofthekind.HotTariff.config.JMSConfig;
import com.firstofthekind.HotTariff.controller.TariffController;
import com.firstofthekind.HotTariff.model.Tariff;
import com.firstofthekind.HotTariff.service.TariffService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class JMSListener {

    public static List<Tariff> list;

    private final JMSConfig receiverConfigBean;
    private final TariffService service;
    private final SimpMessagingTemplate messageTemplate;
    private final TariffController tariffController;

    @JmsListener(destination = "QUEUE", containerFactory = "jmsConnectionFactory")
    public void updateTariff(String response) throws Exception {
        list = service.getTariff(response);
        log.info("Tariff update > " + list);
        Thread.sleep(2000);
        messageTemplate.convertAndSend("/message","Update");
        log.warn("updated");
    }

    @PostConstruct
    public void initTariff() throws JsonProcessingException {
        receiverConfigBean.connectionFactory();
       try {
           list = service.getTariff();
           log.info("Tariffs init  > " + list);
       } catch (Exception e){
           log.warn("ошибка "+e.getMessage());
       }

    }
}
