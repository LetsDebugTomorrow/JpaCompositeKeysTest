package com.example.jpacompositekeystest;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.AttributeConverter;
import java.io.Serializable;

@Slf4j
class JpaConverterJson implements AttributeConverter<Object, String>, Serializable {

    ObjectMapper mapper = new ObjectMapper();

    @SneakyThrows
    @Override
    public String convertToDatabaseColumn(Object o) {
        return mapper.writeValueAsString(o);
    }

    @SneakyThrows
    @Override
    public Object convertToEntityAttribute(String s) {
        return mapper.readValue(s, Object.class);
    }
}
