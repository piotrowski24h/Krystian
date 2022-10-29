package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ForumStatisticsTest {
    private Statistics statistics;
    private ForumStatistics forumStatistics;

    @BeforeEach
    void setUp() {
        statistics = mock(Statistics.class);
        forumStatistics = new ForumStatistics();
    }

    @Test
    void assertThatPostDoesntEXIST(){
        when(statistics.postsCount()).thenReturn(0);
        forumStatistics.calculateAdvStatistics(statistics);
         //then
        assertEquals(0,forumStatistics.getTotalPostsNumber());
    }
    @Test
    void testWhilePostNumberIsOne(){
        when(statistics.postsCount()).thenReturn(1000);
        forumStatistics.calculateAdvStatistics(statistics);
//then
        assertEquals(1000,forumStatistics.getTotalPostsNumber());
    }

    @Test
    void assertThatPostNumberIsZero(){
        when(statistics.commentsCount()).thenReturn(0);
        forumStatistics.calculateAdvStatistics(statistics);
        //then
        assertEquals(0,forumStatistics.getTotalCommentsNumber());

    }  @Test
    void assertThatCommentsIsMoreThanPosts(){
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(1);
        forumStatistics.calculateAdvStatistics(statistics);
        //then
        assertTrue(forumStatistics.getTotalCommentsNumber() > forumStatistics.getTotalPostsNumber());
    }

    @Test
    void assertThatCommentsIsLessThanPosts(){
        when(statistics.commentsCount()).thenReturn(1);
        when(statistics.postsCount()).thenReturn(10);
        forumStatistics.calculateAdvStatistics(statistics);
        //then
        assertTrue(forumStatistics.getTotalCommentsNumber() < forumStatistics.getTotalPostsNumber());
    }

    @Test
    void assertThatUsersDoesntExists(){
        List<String> list = mock(statistics.userNames().getClass());
        when(list.size()).thenReturn(0);
        forumStatistics.calculateAdvStatistics(statistics);
        //then
        assertEquals(0,forumStatistics.getTotalUsersNumber());
    }

    @Test   // - zmiana koncepcji
    void assertThatUsersAre100(){
        List<String> topUsers =new ArrayList<>();// inaczej niz string rzeczywiste dane. (string.add("Wojtek");
        topUsers.add("Wojtek");
        topUsers.add("Adam");
        topUsers.add("Ola");
        topUsers.add("Adrian");


        //verify(string).add("abc");
        when(statistics.userNames()).thenReturn(topUsers);
        forumStatistics.calculateAdvStatistics(statistics);
  //then
        Assertions.assertEquals(4 ,forumStatistics.getTotalUsersNumber());

        System.out.println(topUsers);

    }
//    @Test
//    void assertThatUsersAre100(){
//        double commentPerUser= 100;
//        private int totalPostsNumber = 100;
//        List <String> usersList = new ArrayList<String>()
//                for (int i = 0; i <100; i++) {
//                    usersList.add("Users" +i);
//                }
//  when(statistics.userNames()).thenReturn(usersList);
//          //then
//        int
//    }




}