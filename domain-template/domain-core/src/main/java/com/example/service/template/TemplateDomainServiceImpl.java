package com.example.service.template;

import com.example.entity.template.Template;
import com.example.event.template.TemplateCreatedEvent;

import java.time.ZonedDateTime;

public class TemplateDomainServiceImpl implements TemplateDomainService {

    @Override
    public TemplateCreatedEvent validateAndInitiateTemplate(Template template) {
        return new TemplateCreatedEvent(template, ZonedDateTime.now());
    }
}
