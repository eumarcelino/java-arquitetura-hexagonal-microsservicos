package com.diego.hexagonal.adapters.in.controller.handler;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StandardError {

    private Long timestamp;
    private String status;
    private String message;
    private String path;
}
