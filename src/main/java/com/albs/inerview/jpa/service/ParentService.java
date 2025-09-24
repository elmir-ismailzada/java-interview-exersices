package com.albs.inerview.jpa.service;

import com.albs.inerview.jpa.domain.Parent;
import com.albs.inerview.jpa.repo.ParentRepository;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ParentService {

    private final ParentRepository parentRepository;

    public Parent getById(Long id) {
        return parentRepository.findById(id).orElseThrow();
    }
}
