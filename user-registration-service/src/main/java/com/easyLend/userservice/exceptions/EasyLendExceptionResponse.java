package com.easyLend.userservice.exceptions;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EasyLendExceptionResponse {
    private String time;
    private String message;

    private Integer statusCode;
}