package com.example.template.rest;

import com.example.template.objectexample.dto.create.CreateTemplateCommand;
import com.example.template.objectexample.dto.create.CreateTemplateResponse;
import com.example.template.objectexample.ports.input.service.TemplateApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TemplateController {

    private final TemplateApplicationService templateApplicationService;

    @PostMapping("/template")
    public CreateTemplateResponse createTemplateExample(CreateTemplateCommand createTemplateCommand) {
        return templateApplicationService.createTemplateExample(createTemplateCommand);
    }
}
