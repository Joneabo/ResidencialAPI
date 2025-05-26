package com.residencial.residencial_api.services;

import com.residencial.residencial_api.entities.Knowledge;
import java.util.*;

public interface IKnowledge {

    List<Knowledge> getAllKnowledge();
    Optional<Knowledge> getKnowledgeById(Long id);
    Knowledge saveKnowledge(Knowledge knowledge);
    void deleteKnowledge(Long id);

}
