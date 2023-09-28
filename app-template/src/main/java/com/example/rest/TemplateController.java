package com.example.rest;

import com.example.dto.create.CreateTemplateCommand;
import com.example.ports.input.service.TemplateApplicationService;

public class TemplateController {

    private final TemplateApplicationService templateApplicationService;

    public TemplateController(TemplateApplicationService templateApplicationService) {
        this.templateApplicationService = templateApplicationService;
    }

    public void createTemplateExample(CreateTemplateCommand createTemplateCommand) {
        templateApplicationService.createTemplateExample(createTemplateCommand);
    }
}
