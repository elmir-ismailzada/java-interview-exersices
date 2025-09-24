 package com.albs.inerview.jpa;
 
 import com.albs.inerview.jpa.domain.Parent;
 import com.albs.inerview.jpa.service.ParentService;
 import org.junit.jupiter.api.Test;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.test.context.SpringBootTest;
 import org.springframework.transaction.annotation.Transactional;

 import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class LazyInitTest {

    @Autowired
    private ParentService parentService;

    @Test
    void accessingLazyCollectionOutsideTxShouldWork_butCurrentlyFails() {
        Parent parent = parentService.getById(1L);
        // Expecting children to be accessible here  – will currently fail due to LazyInitializationException
        assertEquals(2, parent.getChildren().size());
    }
}


