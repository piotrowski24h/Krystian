package com.kodilla.testing.forum.statistics;

public class Calculate {

    public int userMr;
    public int postsCount;
    public int commentsCount;
    public double avaNumberPostPerUser;
    public double avaNumberCommentsPerUser;
    public double avaCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        userMr = statistics.userMr().size();
        commentsCount = statistics.commentsCount();
        postsCount = statistics.postsCount();
        if (userMr != 0) {
            avaNumberPostPerUser = (double) postsCount / (double) userMr;
        } else {
            postsCount = 0;
        }

        if (userMr != 0) {
            avaNumberCommentsPerUser = (double) commentsCount / (double) userMr;

        } else {
            commentsCount = 0;

            }

        if (postsCount != 0) {
            avaCommentsPerPost = (double) postsCount / (double) commentsCount;
        } else {
            commentsCount =0;
        }
        }


        public int getUserMr() {
            return userMr;
        }
        public double getAvaNumberPostPerUser() {
            return (int) avaNumberPostPerUser;
        }
        public double getAvaNumberCommentsPerUser() {
            return avaNumberPostPerUser;
        }
        public double getAvaCommentsPerPost() {
            return avaCommentsPerPost;
        }
        public int getPostsCount() {
            return postsCount;
        }
        public int getcommentsCount () {
            return commentsCount;
        }
        public void showStatistics () {
            System.out.println("We have " + userMr + " users exeist");
            System.out.println("Users written" + postsCount);
            System.out.println("Users written" + commentsCount);
            System.out.println("The average "+ avaNumberPostPerUser);
            System.out.println("The average"+ avaCommentsPerPost);
            System.out.println("On average each post /comments" +avaCommentsPerPost);
        }
    }

