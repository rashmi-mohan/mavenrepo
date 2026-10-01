package com.example.Average;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	App app = new App();

    /**
     * Rigorous Test :-)
     */
    @Test
    public void averageofTwoNumber() {
        assertEquals(1,app.AverageofTwo(1, 2));
    }
    @Test
    public void averageofThreeNumber() {
        assertEquals(2,app.AverageofThree(1, 2,3));
    }
}
