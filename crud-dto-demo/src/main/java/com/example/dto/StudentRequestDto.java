package com.example.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class StudentRequestDto {
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @Email (message = "Email should be valid")
    private String email;

    public StudentRequestDto() {
    }

    public StudentRequestDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
