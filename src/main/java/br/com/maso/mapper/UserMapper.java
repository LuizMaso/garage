package br.com.maso.mapper;

import br.com.maso.model.Entity.UserEntity;
import br.com.maso.model.request.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "jsr330")
public interface UserMapper {

    @Mapping( target = "id", source = "request.id")
    @Mapping(target = "nome", source = "request.nome")
    @Mapping(target = "cpf", source = "request.cpf")
    UserEntity from(UserRequest request);
}
