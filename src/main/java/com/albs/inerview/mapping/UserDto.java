package com.albs.inerview.mapping;

import lombok.Data;

@Data
public class UserDto {
    public Long id;
    public String firstName;
    public String lastName;
    public String email;
}
