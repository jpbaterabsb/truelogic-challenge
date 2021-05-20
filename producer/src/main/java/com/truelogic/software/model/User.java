package com.truelogic.software.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 6498634433041144984L;
    private String name;
    private String email;
}
