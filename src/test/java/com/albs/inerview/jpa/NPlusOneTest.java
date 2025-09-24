package com.albs.inerview.jpa;

import com.albs.inerview.jpa.domain.Parent;
import com.albs.inerview.jpa.repo.ParentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class NPlusOneTest {

    @Autowired
    private ParentRepository parentRepository;

    @Test
    @Transactional
    void loadingParentsThenAccessingChildrenTriggersNPlusOne() {
        List<Parent> parents = parentRepository.findAll();
        assertEquals(2, parents.size());

        int totalChildren = parents.stream()
                .mapToInt(p -> p.getChildren().size())
                .sum();
        assertEquals(4, totalChildren);
    }
}


