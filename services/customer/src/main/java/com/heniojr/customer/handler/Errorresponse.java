package com.heniojr.customer.handler;

import java.util.Map;

public record Errorresponse(
        Map<String, String> errors
) {}
