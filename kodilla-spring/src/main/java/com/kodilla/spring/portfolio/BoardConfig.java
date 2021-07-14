package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(),getTaskInProgressList(),getTaskDoneList());
    }

    @Bean(name = "testToDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }


    @Bean(name = "taskInProgressList")
    @Scope("prototype")
    public TaskList getTaskInProgressList() {
        return new TaskList();
    }

    @Bean(name = "taskDonList")
    @Scope("prototype")
    public TaskList getTaskDoneList() {
        return new TaskList();
    }

}
