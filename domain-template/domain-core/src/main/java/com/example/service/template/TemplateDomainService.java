package com.example.service.template;

import com.example.entity.template.Template;
import com.example.event.template.TemplateCreatedEvent;

public interface TemplateDomainService {

    TemplateCreatedEvent validateAndInitiateTemplate(Template template);
}
