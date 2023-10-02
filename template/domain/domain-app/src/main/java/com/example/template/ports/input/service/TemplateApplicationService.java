package com.example.template.ports.input.service;

import com.example.template.dto.create.CreateTemplateCommand;
import com.example.template.dto.create.CreateTemplateResponse;

public interface TemplateApplicationService {
    CreateTemplateResponse createTemplateExample(CreateTemplateCommand createTemplateCommand);
}
