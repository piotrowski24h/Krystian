package com.kodilla.com.kodilla.spring.library;


import com.kodilla.spring.library.LibraryConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class LibraryTestSuite {

@Test
void testContext() {
    ApplicationContext context =
            new AnnotationConfigApplicationContext(LibraryConfig.class);
    //When & Then
    System.out.println("===== Beans list: ==== >>");
    Arrays.stream(context.getBeanDefinitionNames())
            .forEach(System.out::println);
    System.out.println("<< ===== Beans list ====");
}
}