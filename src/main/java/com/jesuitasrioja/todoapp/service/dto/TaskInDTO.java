package com.jesuitasrioja.todoapp.service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskInDTO {
    private String title;
    private String description;
    private LocalDateTime eta;

}
