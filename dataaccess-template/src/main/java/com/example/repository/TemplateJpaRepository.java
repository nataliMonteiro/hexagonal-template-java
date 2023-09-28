package com.example.repository;


import com.example.entity.TemplateEntity;

//public interface TemplateJpaRepository extends BaseJpaRepository<TemplateEntity, UUID>
public class TemplateJpaRepository {

    public TemplateEntity save(TemplateEntity templateEntity) {
        return new TemplateEntity();
    }
}
