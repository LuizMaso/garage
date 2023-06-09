package br.com.maso.model.Entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "TB_USER")
public class UserEntity {
    @DynamoDBAutoGeneratedKey
    @DynamoDBHashKey(attributeName = "id")
    private String id;
    @DynamoDBRangeKey
    @DynamoDBAttribute(attributeName = "cpf")
    private String cpf;
    @DynamoDBAttribute(attributeName = "nome")
    private String nome;



}