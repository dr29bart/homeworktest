package com.homework.util;

import io.restassured.response.Response;


import com.homework.TestException;

/**
 * Utility class for response validation
 */
public class ResponseChecker {

    private ResponseChecker() {
    }

    /**
     * Checks if response code is expected one
     *
     * @throws TestException with response body if response code is unexpected
     */
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
