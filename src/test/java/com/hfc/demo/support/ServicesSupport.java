package com.hfc.demo.support;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ServicesSupport {

    public static Response executeRequest (RequestSpecification request, String operation, String endpoint)  {
        Response response;
        switch (operation.toUpperCase()) {
            case ("POST"):
                response = request.post(endpoint);
                break;
            case ("GET"):
                response = request.get(endpoint);
                break;
            case ("PUT"):
                response = request.put(endpoint);
                break;
            case ("PATCH"):
                response = request.patch(endpoint);
                break;
            case ("DELETE"):
                response = request.delete(endpoint);
                break;
            default:
                response = request.get(endpoint);
                break;
        }
        return response;
    }
}
