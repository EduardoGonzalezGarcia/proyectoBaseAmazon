package com.hfc.demo.support;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.rest;

public class RequestHelper {

    public static Response getInformationFromAPI() {
        RequestSpecification request = rest();

        Map<String, String> parameters = new HashMap<>();
        parameters.put("foo1", "bar1");
        parameters.put("foo2", "bar2");
        request.queryParams(parameters);
        request.baseUri(Configuration.POSTMAN_BASE_PATH);

        return ServicesSupport.executeRequest(request, "GET", "/get");
    }
}
