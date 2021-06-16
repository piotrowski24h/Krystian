package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

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

        assertEquals(0,forumStatistics.getTotalPostsNumber());
    }
    @Test
    void testWhilePostNumberIsOne(){
        when(statistics.postsCount()).thenReturn(1000);
        forumStatistics.calculateAdvStatistics(statistics);

        assertEquals(1000,forumStatistics.getTotalPostsNumber());
    }

    @Test
    void assertThatPostNumberIsZero(){
        when(statistics.commentsCount()).thenReturn(0);
        forumStatistics.calculateAdvStatistics(statistics);
        assertEquals(0,forumStatistics.getTotalCommentsNumber());

    }  @Test
    void assertThatCommentsIsMoreThanPosts(){
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(1);
        forumStatistics.calculateAdvStatistics(statistics);
        assertTrue(forumStatistics.getTotalCommentsNumber() > forumStatistics.getTotalPostsNumber());
    }

    @Test
    void assertThatCommentsIsLessThanPosts(){
        when(statistics.commentsCount()).thenReturn(1);
        when(statistics.postsCount()).thenReturn(10);
        forumStatistics.calculateAdvStatistics(statistics);
        assertTrue(forumStatistics.getTotalCommentsNumber() < forumStatistics.getTotalPostsNumber());
    }

    @Test
    void assertThatUsersDoesntExists(){
        List<String> list = mock(statistics.userNames().getClass());
        when(list.size()).thenReturn(0);
        forumStatistics.calculateAdvStatistics(statistics);
        assertEquals(0,forumStatistics.getTotalUsersNumber());
    }

    @Test
    void assertThatUsersAre100(){
        List<String> strings = statistics.userNames();
        verify(strings).add("asd");
        when(statistics.userNames()).thenReturn(strings);


        System.out.println(strings);

    }





}