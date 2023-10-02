package com.example.template.template.service.template;

import com.example.template.template.entity.template.Template;
import com.example.template.template.event.template.TemplateCreatedEvent;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@Component
public class TemplateDomainServiceImpl implements TemplateDomainService {

    @Override
    public TemplateCreatedEvent validateAndInitiateTemplate(Template template) {
        return new TemplateCreatedEvent(template, ZonedDateTime.now());
    }
}
