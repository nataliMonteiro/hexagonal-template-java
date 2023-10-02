package com.example.template.repository;


import com.example.template.entity.TemplateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface TemplateJpaRepository extends JpaRepository<TemplateEntity, UUID> {
}
