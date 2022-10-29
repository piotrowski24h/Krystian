package com.kodilla.testing.forum.statistics;
////
////import org.junit.jupiter.api.*;
////import org.junit.jupiter.api.extension.ExtendWith;
////import org.mockito.InjectMocks;
////import org.mockito.Mock;
////import org.mockito.junit.jupiter.MockitoExtension;
////
////import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.Mockito.when;
//
//@DisplayName("TDD: Forum Statistic Test Suite.")
//@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite<Calculate> {
//
//    private static int testCounter = 0;
//
//    @BeforeAll
//    public static void beforeAllTests() {
//        System.out.println("Start test");
//    }
//
//    @AfterEach
//    public void afterAllTest() {
//        System.out.println("Finished test #" + testCounter);
//    }
//
//    @InjectMocks
//    Calculate calculate;
//    @Mock
//    Statistics statisticsMock;
//
//    @Test
//    void testStatisticNoPost() {
//        //Given
//        int posts = 0;
//        int comments = 10;
//        List<String> usersMrList = new ArrayList<>(String);
//        for (int i = 0; i < 100; i++) {
//            usersMrList.add("Person" + 1);
//
//        }
//        when(statisticsMock.userMr()).thenReturn(usersMrList);
//        when(statisticsMock.commentsCount()).thenReturn(comments);
//        when(statisticsMock.postsCount()).thenReturn(posts);
//        //when
//        calculate.calculateAdvStatistics(statisticsMock);
//        int apply100Users = calculate.getUserMr();
//        int writtenPosts = calculate.getPostsCount();
//        int writtenComments = calculate.getAvaNumberPostPerUser;
//        double UMsrednia = calculate.getUserMr();
//        double PCsrednia = calculate.getAvaCommentsPerPost();
//        double CUsrednia = calculate.getAvaNumberPostPerUser();
//
//        //Then
//        Assertions.assertEquals(1000, apply100Users);
//        Assertions.assertEquals(0, writtenPosts);
//        Assertions.assertEquals(0, writtenComments);
//        Assertions.assertEquals(0, UMsrednia);
//        Assertions.assertEquals(0.2, PCsrednia);
//        Assertions.assertEquals(0, CUsrednia);
//        calculate.showStatistics();
//    }
////
////    @Test
//    void testStatistic1000() {
//        //Given
//        int posts = 1000;
//        int comments = 0;
//        List<String> usersMrList = new ArrayList<>(String);
//        for (int i = 0; i < 100; i++) {
//            usersMrList.add("Person" + 1);
//        }
//        when(statisticsMock.userMr()).thenReturn((usersMrList));
//        when(statisticsMock.commentsCount()).thenReturn(comments);
//        when(statisticsMock.postsCount()).thenReturn(posts);
//        //when
//        calculate.calculateAdvStatistics(statisticsMock);
//        int apply100Users = calculate.getUserMr();
//        int writtenPosts = calculate.getPostsCount();
//        int writtenComments = calculate.getAvaNumberPostPerUser;
//        double UMsrednia = calculate.getUserMr();
//        double PCsrednia = calculate.getAvaCommentsPerPost();
//        double CUsrednia = calculate.getAvaNumberPostPerUser();
//        //then
//        Assertions.assertEquals(100, apply100Users);
//        Assertions.assertEquals(1000, writtenPosts);
//        Assertions.assertEquals(0, writtenComments);
//        Assertions.assertEquals(10, UMsrednia);
//        Assertions.assertEquals(0, PCsrednia);
//        Assertions.assertEquals(0, CUsrednia);
//    }
}