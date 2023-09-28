package com.example.adapter;


import com.example.ports.output.repository.TemplateRepository;
import com.example.entity.template.Template;
import com.example.mapper.TemplateDataAccessMapper;
import com.example.repository.TemplateJpaRepository;

public class TemplateRepositoryImpl implements TemplateRepository {

    private final TemplateJpaRepository templateJpaRepository;
    private final TemplateDataAccessMapper templateDataAccessMapper;

    public TemplateRepositoryImpl() {
        this.templateJpaRepository = new TemplateJpaRepository();
        this.templateDataAccessMapper = new TemplateDataAccessMapper();
    }

    @Override
    public Template save(Template template) {
        return templateDataAccessMapper.templateEntityToTemplate(templateJpaRepository
                .save(templateDataAccessMapper.templateToTemplateEntity(template)));
    }

}
