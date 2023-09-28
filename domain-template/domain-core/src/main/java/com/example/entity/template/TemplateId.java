package com.example.entity.template;

import com.example.valueobject.BaseId;

import java.util.UUID;

public class TemplateId extends BaseId<UUID> {

    public TemplateId(UUID value) {
        super(value);
    }
}
