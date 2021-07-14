package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BoardConfig.class);

        Board board = (Board) applicationContext.getBean("testToDoList");
        board.getToDoList().getTasks().add("Sprzątanie");
        board.getDoneList().getTasks().add("Wymiana szyby");

        Assertions.assertEquals(1, board.getToDoList().getTasks().size());
        Assertions.assertEquals("Sprzątanie", board.getToDoList().getTasks().get(0));

        Assertions.assertEquals(1, board.getDoneList().getTasks().size());

    }
}
