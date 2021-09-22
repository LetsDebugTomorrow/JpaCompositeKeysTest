package com.example.jpacompositekeystest;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Id;

@Data
@javax.persistence.Entity
public class Entity {

    @Id
    @SuppressWarnings("JpaAttributeTypeInspection")
    @Convert(converter = JpaConverterJson.class)
    @Column(name = "section_key")
    private SectionKey sectionKey;
}
