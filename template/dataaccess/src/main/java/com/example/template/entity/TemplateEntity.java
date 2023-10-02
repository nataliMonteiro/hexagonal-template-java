package com.example.template.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class TemplateEntity {

    @Id
    private UUID id;
}
