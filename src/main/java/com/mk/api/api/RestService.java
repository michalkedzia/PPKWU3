package com.mk.api.api;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class RestService {
    final String uri = "http://localhost:8080/api/v1/{parameter}";

    public StringResponse getStringInformation(String parameter){
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("parameter", parameter);
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class, uriVariables);
        Gson gson = new Gson();
        return gson.fromJson(result,StringResponse.class);
    }
}
