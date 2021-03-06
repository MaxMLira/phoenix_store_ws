package com.maxtech.phoenix.store.resources.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer status;
    private String message;
    private Long timeStamp;


}
