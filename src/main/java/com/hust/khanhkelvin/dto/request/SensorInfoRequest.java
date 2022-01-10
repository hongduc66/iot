package com.hust.khanhkelvin.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SensorInfoRequest {
    @NotBlank
    private Long id;

    @NotBlank
    private Integer quantity;
}
