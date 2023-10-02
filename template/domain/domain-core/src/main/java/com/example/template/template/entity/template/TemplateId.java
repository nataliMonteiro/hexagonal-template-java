package com.example.template.template.entity.template;

import com.example.template.template.valueobject.BaseId;

import java.util.UUID;

public class TemplateId extends BaseId<UUID> {

    public TemplateId(UUID value) {
        super(value);
    }
}
