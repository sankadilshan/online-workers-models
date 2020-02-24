package com.onlineworkers.models;


import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.Size;

@Data
public class PostUserDto {
    private String username;
    private String password;
    @Email
    private String email;
    @Size(max = 10)
    private String contactNo;
    private String role;
}
