package com.example.template.template.event.template;

import com.example.template.template.entity.template.Template;
import com.example.template.template.event.DomainEvent;

import java.time.ZonedDateTime;

public abstract class TemplateEvent implements DomainEvent<Template> {

    private final Template template;
    private final ZonedDateTime createdAt;

    protected TemplateEvent(Template template, ZonedDateTime createdAt) {
        this.template = template;
        this.createdAt = createdAt;
    }

    public Template getTemplate() {
        return template;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }
}
