package br.com.maso.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import jakarta.annotation.Generated;
import lombok.Data;

@Data
@Introspected
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequest {
    @JsonProperty("id")
    private  String id;
    @JsonProperty("cpf")
    private  String cpf;
    @JsonProperty("nome")
    private String nome;
}
