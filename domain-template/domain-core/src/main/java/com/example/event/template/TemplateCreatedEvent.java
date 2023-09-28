package com.example.event.template;

import com.example.entity.template.Template;

import java.time.ZonedDateTime;

public class TemplateCreatedEvent extends TemplateEvent {
    public TemplateCreatedEvent(Template template, ZonedDateTime createdAt) {
        super(template, createdAt);
    }
}
