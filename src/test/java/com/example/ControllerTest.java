package com.example;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

@MicronautTest
class ControllerTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void testControllerA() {
        var response = client.toBlocking().exchange(HttpRequest.POST("/entity", Map.of("field", "value")));
        Assertions.assertEquals(HttpStatus.CREATED, response.getStatus());
    }
}
