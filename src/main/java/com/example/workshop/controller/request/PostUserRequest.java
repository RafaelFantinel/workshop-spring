package com.example.workshop.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
@Data
public class PostUserRequest {
    @NotBlank(message = "Valor invalido")
    @JsonProperty("name")
    private String name;

    @NotBlank(message = "Valor invalido")
    @JsonProperty("email")
    private String email;
}
