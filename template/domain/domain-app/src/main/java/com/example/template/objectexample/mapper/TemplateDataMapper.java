package com.example.template.objectexample.mapper;

import com.example.template.objectexample.dto.create.CreateTemplateCommand;
import com.example.template.objectexample.dto.create.CreateTemplateResponse;
import com.example.template.template.entity.template.Template;
import org.springframework.stereotype.Component;

@Component
public class TemplateDataMapper {


    public Template createTemplateCommandToTemplate(CreateTemplateCommand createTemplateCommand) {
        return new Template();
    }

    public CreateTemplateResponse templateToCreateTemplateResponse(Template template) {
        return new CreateTemplateResponse();
    }
}
