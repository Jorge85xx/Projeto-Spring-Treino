package io.github.jorge85xx.course.repositories.exceptions;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
@Data
public class StandartError implements Serializable {
    private static final long serialVersionUID = 1L;

    private Instant timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandartError() {
    }

    public StandartError(Instant timestamp, Integer status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }
}
