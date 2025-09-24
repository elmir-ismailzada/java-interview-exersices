package com.albs.inerview.jpa.config;

import com.albs.inerview.jpa.domain.Child;
import com.albs.inerview.jpa.domain.Parent;
import com.albs.inerview.jpa.repo.ParentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(ParentRepository parentRepository) {
        return args -> {
            if (parentRepository.count() == 0) {
                Parent parent = new Parent();
                parent.setName("Parent A");

                Child c1 = new Child();
                c1.setName("Child 1");

                Child c2 = new Child();
                c2.setName("Child 2");

                parent.addChild(c1);
                parent.addChild(c2);

                parentRepository.save(parent);

                Parent parentB = new Parent();
                parentB.setName("Parent B");

                Child c3 = new Child();
                c3.setName("Child 3");

                Child c4 = new Child();
                c4.setName("Child 4");

                parentB.addChild(c3);
                parentB.addChild(c4);

                parentRepository.save(parentB);
            }
        };
    }
}


