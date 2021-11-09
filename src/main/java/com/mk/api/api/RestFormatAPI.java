package com.mk.api.api;

import org.springframework.beans.factory.annotation.Autowired;
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
        return "text " + parameter;
    }

    @GetMapping("/json/{parameter}")
    public String responseAsJSON(@PathVariable("parameter") String parameter) {
        return "text " + parameter;
    }

    @GetMapping("/xml/{parameter}")
    public String responseAsXML(@PathVariable("parameter") String parameter) {
        return "text " + parameter;
    }

    @GetMapping("/csv/{parameter}")
    public String responseAsCSV(@PathVariable("parameter") String parameter) {
        return "text " + parameter;
    }


}
