package com.example.template.template.event.template;

import com.example.template.template.entity.template.Template;

import java.time.ZonedDateTime;

public class TemplateCreatedEvent extends TemplateEvent {
    public TemplateCreatedEvent(Template template, ZonedDateTime createdAt) {
        super(template, createdAt);
    }
}
