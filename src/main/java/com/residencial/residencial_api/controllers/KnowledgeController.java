package com.residencial.residencial_api.controllers;

import com.residencial.residencial_api.entities.Knowledge;
import com.residencial.residencial_api.services.IKnowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
@RequestMapping("/api/knowledge")
public class KnowledgeController {

    @Autowired
    private IKnowledge knowledgeService;

    @GetMapping
    public List<Knowledge> getAllKnowledge() {
        return knowledgeService.getAllKnowledge();
    }

    @GetMapping("/{id}")
    public Optional<Knowledge> getKnowledgeById(@PathVariable Long id) {
        return knowledgeService.getKnowledgeById(id);
    }

    @PostMapping
    public Knowledge createKnowledge(@RequestBody Knowledge knowledge) {
        return knowledgeService.saveKnowledge(knowledge);
    }

    @PutMapping("/{id}")
    public Knowledge updateKnowledge(@PathVariable Long id, @RequestBody Knowledge knowledge) {
        knowledge.setId(id);
        return knowledgeService.saveKnowledge(knowledge);
    }

    @DeleteMapping("/{id}")
    public void deleteKnowledge(@PathVariable Long id) {
        knowledgeService.deleteKnowledge(id);
    }

}
