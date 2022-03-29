package com.example.workshop.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PostUserResponse {
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
}
