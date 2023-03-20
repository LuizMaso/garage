package br.com.maso.service;

import br.com.maso.mapper.UserMapper;
import br.com.maso.model.request.UserRequest;
import br.com.maso.repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.Valid;

@Singleton
public class UserService {
    @Inject
    private UserRepository repository;
    @Inject
    private UserMapper mapper;

    public void create(@Valid UserRequest request) {
        var entity = mapper.from(request);
        repository.create(entity);
    }
}
