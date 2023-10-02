package com.example.template.mapper;

import com.example.template.entity.TemplateEntity;
import com.example.template.template.entity.template.Template;
import org.springframework.stereotype.Component;

@Component
public class TemplateDataAccessMapper {

    public TemplateEntity templateToTemplateEntity(Template template) {
        return new TemplateEntity();
    }

    public Template templateEntityToTemplate(TemplateEntity templateEntity) {
        return new Template();
    }
}
