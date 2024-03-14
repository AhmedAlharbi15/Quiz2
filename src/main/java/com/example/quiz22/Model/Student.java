package com.example.quiz22.Model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    @NotNull(message = "All should not be empty")
    private int id;
    @NotEmpty(message = "All should not be empty")
    private String name;
    @NotNull(message = "All should not be empty")
    private int age;
    @NotEmpty(message = "All should not be empty")
    private String major;
}
