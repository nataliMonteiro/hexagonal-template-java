package com.example.template.objectexample;

import com.example.template.objectexample.ports.input.service.TemplateApplicationService;
import com.example.template.objectexample.dto.create.CreateTemplateCommand;
import com.example.template.objectexample.dto.create.CreateTemplateResponse;
import com.example.template.objectexample.mapper.TemplateDataMapper;
import com.example.template.template.event.template.TemplateCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TemplateApplicationServiceImpl implements TemplateApplicationService {

    private final TemplateCreatorHelper templateCreatorHelper;
    private final TemplateDataMapper templateDataMapper;

    @Override
    public CreateTemplateResponse createTemplateExample(CreateTemplateCommand createTemplateCommand) {
        TemplateCreatedEvent templateExample = templateCreatorHelper.createTemplateExample(createTemplateCommand);
        return templateDataMapper.templateToCreateTemplateResponse(templateExample.getTemplate());
    }

}
