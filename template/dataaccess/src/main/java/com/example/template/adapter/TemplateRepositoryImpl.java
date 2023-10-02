package com.example.template.adapter;


import com.example.template.objectexample.ports.output.repository.TemplateRepository;
import com.example.template.template.entity.template.Template;
import com.example.template.mapper.TemplateDataAccessMapper;
import com.example.template.repository.TemplateJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TemplateRepositoryImpl implements TemplateRepository {

    private final TemplateJpaRepository templateJpaRepository;
    private final TemplateDataAccessMapper templateDataAccessMapper;

    @Override
    public Template save(Template template) {
        return templateDataAccessMapper.templateEntityToTemplate(templateJpaRepository
                .save(templateDataAccessMapper.templateToTemplateEntity(template)));
    }

}
