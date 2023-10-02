package com.example.template.mapper;

import com.example.template.dto.create.CreateTemplateCommand;
import com.example.template.dto.create.CreateTemplateResponse;
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
