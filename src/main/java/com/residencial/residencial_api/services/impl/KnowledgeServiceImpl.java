package com.residencial.residencial_api.services.impl;

import com.residencial.residencial_api.entities.Knowledge;
import com.residencial.residencial_api.repositories.KnowledgeRepository;
import com.residencial.residencial_api.services.IKnowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class KnowledgeServiceImpl implements IKnowledge {

    @Autowired
    private KnowledgeRepository repository;

    @Override
    public List<Knowledge> getAllKnowledge() {
        return repository.findAll();
    }

    @Override
    public Optional<Knowledge> getKnowledgeById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Knowledge saveKnowledge(Knowledge knowledge) {
        return repository.save(knowledge);
    }

    @Override
    public void deleteKnowledge(Long id) {
        repository.deleteById(id);
    }

}
