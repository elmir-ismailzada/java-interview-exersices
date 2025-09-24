package com.albs.inerview.mapping;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    private final ManualUserMapper mapper = new ManualUserMapper();

    @Test
    void toEntity_mapsAllFields() {
        UserDto dto = new UserDto();
        dto.id = 42L;
        dto.firstName = "Ada";
        dto.lastName = "Lovelace";
        dto.email = "ada@example.com";

        User entity = mapper.toEntity(dto);

        assertNotNull(entity);
        assertEquals(42L, entity.getId());
        assertEquals("Ada", entity.getFirstName());
        assertEquals("Lovelace", entity.getLastName());
        assertEquals("ada@example.com", entity.getEmail());
    }

    @Test
    void toDto_mapsAllFields() {
        User entity = new User();
        entity.setId(7L);
        entity.setFirstName("Grace");
        entity.setLastName("Hopper");
        entity.setEmail("grace@example.com");

        UserDto dto = mapper.toDto(entity);

        assertNotNull(dto);
        assertEquals(7L, dto.id);
        assertEquals("Grace", dto.firstName);
        assertEquals("Hopper", dto.lastName);
        assertEquals("grace@example.com", dto.email);
    }
}



