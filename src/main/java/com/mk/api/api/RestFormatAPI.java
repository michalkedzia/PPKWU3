package com.mk.api.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class RestFormatAPI {

    @Autowired
    public RestService restService;

    @GetMapping("/text/{parameter}")
    public String responseAsText(@PathVariable("parameter") String parameter) {
        return restService.getResponseAsText(parameter);
    }

    @GetMapping("/json/{parameter}")
    public String responseAsJSON(@PathVariable("parameter") String parameter) {
        return restService.getResponseAsJSON(parameter);
    }

    @GetMapping(value = "/xml/{parameter}", produces = MediaType.APPLICATION_XML_VALUE)
    public String responseAsXML(@PathVariable("parameter") String parameter) {
        String xml;
        try {
            xml = restService.getResponseAsXML(parameter);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(parameter).toString();
        }
        return xml;
    }

    @GetMapping("/csv/{parameter}")
    public String responseAsCSV(@PathVariable("parameter") String parameter) {
        return restService.getResponseAsCSV(parameter);
    }
}
