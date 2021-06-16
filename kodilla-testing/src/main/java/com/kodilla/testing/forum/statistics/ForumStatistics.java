package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int totalUsersNumber;
    private int totalPostsNumber;
    private int totalCommentsNumber;
    private double postPerUser;
    private double commentPerUser;
    private double commentPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        totalUsersNumber = statistics.userNames().size();
        totalPostsNumber = statistics.postsCount();
        totalCommentsNumber = statistics.commentsCount();
        postPerUser = (double) statistics.postsCount() / statistics.userNames().size();
        commentPerPost = (double) statistics.commentsCount() / statistics.userNames().size();
        commentPerPost = (double) statistics.commentsCount() / statistics.postsCount();
    }


    public void showStatistics() {
        System.out.println("ForumStatistics{" +
                "totalUsersNumber=" + totalUsersNumber +
                ", totalPostsNumber=" + totalPostsNumber +
                ", totalCommentsNumber=" + totalCommentsNumber +
                ", postPerUser=" + postPerUser +
                ", commentPerUser=" + commentPerUser +
                ", commentPerPost=" + commentPerPost +
                '}');
    }

    public int getTotalUsersNumber() {
        return totalUsersNumber;
    }

    public int getTotalPostsNumber() {
        return totalPostsNumber;
    }

    public int getTotalCommentsNumber() {
        return totalCommentsNumber;
    }

    public double getPostPerUser() {
        return postPerUser;
    }

    public double getCommentPerUser() {
        return commentPerUser;
    }

    public double getCommentPerPost() {
        return commentPerPost;
    }






}
