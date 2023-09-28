package com.example.mapper;

import com.example.dto.create.CreateTemplateCommand;
import com.example.dto.create.CreateTemplateResponse;
import com.example.entity.template.Template;

public class TemplateDataMapper {


    public Template createTemplateCommandToTemplate(CreateTemplateCommand createTemplateCommand) {
        return new Template();
    }

    public CreateTemplateResponse templateToCreateTemplateResponse(Template template) {
        return new CreateTemplateResponse();
    }
}
