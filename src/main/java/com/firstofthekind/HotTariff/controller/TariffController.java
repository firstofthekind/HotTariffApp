package com.firstofthekind.HotTariff.controller;

import com.firstofthekind.HotTariff.handler.JMSListener;
import com.firstofthekind.HotTariff.model.Tariff;
import com.firstofthekind.HotTariff.service.TariffService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.Response;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class TariffController {
    private final TariffService tariffService;
    private  final SimpMessagingTemplate simpMessagingTemplate;
    @ModelAttribute("tariffs")
    public List<Tariff> tariffList() {
        return JMSListener.list;
    }

    @GetMapping("/")
    public String prepareProduct(ModelMap model) {
        return "/hot.ftl";}

    @GetMapping("/index")
    public String prepareProduct1(ModelMap model) {
        return "hot.ftl";
    }
}
