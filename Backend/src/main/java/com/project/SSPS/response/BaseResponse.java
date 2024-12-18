package com.project.SSPS.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.javafaker.Bool;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseResponse {
    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;

    private String message;
    private Boolean success;
}
