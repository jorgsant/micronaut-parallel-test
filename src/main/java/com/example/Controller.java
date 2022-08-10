package com.example;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Status;

import java.util.Map;

@io.micronaut.http.annotation.Controller("/entity")
public class Controller {

    @Post
    @Status(HttpStatus.CREATED)
    public void postEntity(@Body Map<String, Object> entityDto) {}
}
