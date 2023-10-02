package com.example.template.objectexample.ports.input.service;

import com.example.template.objectexample.dto.create.CreateTemplateCommand;
import com.example.template.objectexample.dto.create.CreateTemplateResponse;

public interface TemplateApplicationService {
    CreateTemplateResponse createTemplateExample(CreateTemplateCommand createTemplateCommand);
}
