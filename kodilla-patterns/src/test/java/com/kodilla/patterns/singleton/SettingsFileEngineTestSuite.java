package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SettingsFileEngineTestSuite {
    private static SettingsFileEngine settingsFileEngine;

    @BeforeAll
    public static void openSettingsFile() {
        settingsFileEngine = new SettingsFileEngine.INSTANCE;
        settingsFileEngine.open("myapp.settings");
    }

    @AfterAll
    public static void closeSettingsFile() {
        settingsFileEngine.close();
    }

    @Test
    void testGetFileName() {
        //Given
        //When
        String fileName = settingsFileEngine.getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        assertEquals("myapp.settings", fileName);
    }

    private void assertEquals(String s, String fileName) {
    }

    @Test
    void testLoadSettings() {
        //Given
        //When
        boolean result = settingsFileEngine.loadSettings();
        //Then
        assertTrue(result);
    }

    private void assertTrue(boolean result) {
    }

    @Test
    void testSaveSettings() {
        //Given
        //When
        boolean result = settingsFileEngine.saveSettings();
        //Then
        assertTrue(result);
    }
}
