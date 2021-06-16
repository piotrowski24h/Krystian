package com.kodilla.testing.forum.statistics;

import java.util.List;

    public interface Statistics {
        List<String> userNames();   //lista uzytkowników
        int postsCount();           // calkowita liczba postów
        int commentsCount();        // calkowita liczba komentarzy


    }

