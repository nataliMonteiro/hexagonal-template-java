package com.example;

import com.example.ports.input.service.TemplateApplicationService;
import com.example.dto.create.CreateTemplateCommand;
import com.example.dto.create.CreateTemplateResponse;
import com.example.mapper.TemplateDataMapper;
import com.example.event.template.TemplateCreatedEvent;

public class TemplateApplicationServiceImpl implements TemplateApplicationService {

    private final TemplateCreatorHelper templateCreatorHelper;
    private final TemplateDataMapper templateDataMapper;

    public TemplateApplicationServiceImpl(TemplateCreatorHelper templateCreatorHelper, TemplateDataMapper templateDataMapper) {
        this.templateCreatorHelper = templateCreatorHelper;
        this.templateDataMapper = templateDataMapper;
    }


    @Override
    public CreateTemplateResponse createTemplateExample(CreateTemplateCommand createTemplateCommand) {
        TemplateCreatedEvent templateExample = templateCreatorHelper.createTemplateExample(createTemplateCommand);
        return templateDataMapper.templateToCreateTemplateResponse(templateExample.getTemplate());
    }

}
