package com.homework.util;

import io.restassured.response.Response;


import com.homework.TestException;

public class ResponseChecker {

    private ResponseChecker() {
    }

    public static void assertStatusCode(Response response, int... expectedCodes) {
        int statusCode = response.getStatusCode();
        for (int code : expectedCodes) {
            if (statusCode == code) {
                return;
            }
        }
        String errMsg = String.format("Response has unexpected status code [%s]. Actual body [%s],",
                statusCode, response.asString());
        throw new TestException(errMsg);
    }
}
