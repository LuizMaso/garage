package br.com.maso.controller;


import br.com.maso.model.request.UserRequest;
import br.com.maso.service.UserService;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.validation.Validated;

import javax.inject.Inject;
import javax.validation.Valid;

@Validated
@Controller(value = "uses")
public class UserController {

    @Inject
    private  UserService service;


    @Post
    public HttpResponse<?> create(@Body @Valid UserRequest request) {
        try {
            service.create(request);
            return HttpResponse.created(request);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.serverError();
        }
    }


}
