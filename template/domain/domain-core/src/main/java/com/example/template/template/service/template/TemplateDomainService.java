package com.example.template.template.service.template;

import com.example.template.template.entity.template.Template;
import com.example.template.template.event.template.TemplateCreatedEvent;

public interface TemplateDomainService {

    TemplateCreatedEvent validateAndInitiateTemplate(Template template);
}
