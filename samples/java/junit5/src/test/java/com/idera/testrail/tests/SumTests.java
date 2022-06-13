package com.idera.testrail.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTests {

    @Test
    @DisplayName("Add Two Numbers")
    void AddTwoNumbers() {
        assertEquals(3, 1+2, "1 + 2 should equal 3");
    }

    @Test
    @DisplayName("Add Two Numbers With Decimals")
    void AddTwoNumbersWithDecimals() {
        assertEquals(3, 1.5+1.4, "1.5+1.4 should equal 3");
    }

    @Nested
    class AddMoreNumbersTests {

        @Test
        @DisplayName("Add Three Numbers")
        void AddThreeNumbers() {
            assertEquals(3, 1+1+1, "1+1+1 should equal 3");
        }
    }
}