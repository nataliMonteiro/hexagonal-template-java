package com.example.mapper;

import com.example.entity.TemplateEntity;
import com.example.entity.template.Template;

public class TemplateDataAccessMapper {

    public TemplateEntity templateToTemplateEntity(Template template) {
        return new TemplateEntity();
    }

    public Template templateEntityToTemplate(TemplateEntity templateEntity) {
        return new Template();
    }
}
