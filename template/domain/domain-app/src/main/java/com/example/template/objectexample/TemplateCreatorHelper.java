package com.example.template.objectexample;

import com.example.template.objectexample.ports.output.repository.TemplateRepository;
import com.example.template.objectexample.dto.create.CreateTemplateCommand;
import com.example.template.objectexample.mapper.TemplateDataMapper;
import com.example.template.template.entity.template.Template;
import com.example.template.template.event.template.TemplateCreatedEvent;
import com.example.template.template.service.template.TemplateDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TemplateCreatorHelper {

    private final TemplateRepository templateRepository;
    private final TemplateDataMapper templateDataMapper;
    private final TemplateDomainService templateDomainService;


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
