package com.example.ports.input.service;

import com.example.dto.create.CreateTemplateCommand;
import com.example.dto.create.CreateTemplateResponse;

public interface TemplateApplicationService {
    CreateTemplateResponse createTemplateExample(CreateTemplateCommand createTemplateCommand);
}
