package com.albs.inerview.mapping;

public class ManualUserMapper {

    public User toEntity(UserDto dto) {
        if (dto == null) return null;
        User u = new User();
        u.setId(dto.id);
        u.setFirstName(dto.firstName);
        u.setLastName(dto.lastName);
        u.setEmail(dto.email);
        return u;
    }

    public UserDto toDto(User entity) {
        if (entity == null) return null;
        UserDto dto = new UserDto();
        dto.id = entity.getId();
        dto.firstName = entity.getFirstName();
        dto.lastName = entity.getLastName();
        dto.email = entity.getEmail();
        return dto;
    }
}


