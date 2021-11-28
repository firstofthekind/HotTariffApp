package com.firstofthekind.HotTariff.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.firstofthekind.HotTariff.model.Tariff;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class TariffService {

    private static final String GET_SCHEDULE_URI = "http://localhost:8000/hottariff";
    private Client client;

    private final ObjectMapper mapper;

    public List<Tariff> getTariff() throws JsonProcessingException {
        Client client = getClient();
        WebTarget target = client.target(GET_SCHEDULE_URI);
        String response = target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);
        return mapper.readValue(response, new TypeReference<>() {
        });
    }

    public List<Tariff> getTariff(String response) throws JsonProcessingException {
        return mapper.readValue(response, new TypeReference<>() {});
    }

    private Client getClient() {
        if ( Objects.isNull(client)) {
            client = ClientBuilder.newClient();
        }
        return client;
    }
}
