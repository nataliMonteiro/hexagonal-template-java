package com.example;

import com.example.dto.create.CreateTemplateCommand;
import com.example.mapper.TemplateDataMapper;
import com.example.ports.output.repository.TemplateRepository;
import com.example.entity.template.Template;
import com.example.event.template.TemplateCreatedEvent;
import com.example.service.template.TemplateDomainService;

public class TemplateCreatorHelper {

    private final TemplateRepository templateRepository;
    private final TemplateDataMapper templateDataMapper;
    private final TemplateDomainService templateDomainService;

    public TemplateCreatorHelper(TemplateRepository templateRepository, TemplateDataMapper templateDataMapper, TemplateDomainService templateDomainService) {
        this.templateRepository = templateRepository;
        this.templateDataMapper = templateDataMapper;
        this.templateDomainService = templateDomainService;
    }


    public TemplateCreatedEvent createTemplateExample(CreateTemplateCommand createTemplateCommand) {
        return persistTemplate(createTemplateCommand);
    }

    private TemplateCreatedEvent persistTemplate(CreateTemplateCommand createTemplateCommand) {
        Template template = templateDataMapper.createTemplateCommandToTemplate(createTemplateCommand);
        TemplateCreatedEvent templateCreatedEvent = templateDomainService.validateAndInitiateTemplate(template);
        saveTemplate(template);
        return templateCreatedEvent;
    }

    private void saveTemplate(Template template) {
        templateRepository.save(template);
    }
}
