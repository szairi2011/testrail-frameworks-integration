package com.idera.testrail.tests;

import com.testrail.junit.customjunitxml.annotations.TestRail;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractionTests {

    @Test
    @TestRail(id="C2194", description = "Subtract two numbers")
    void SubtractTwoNumbers() {
        assertEquals(1, 2-1, "Should equal 1");
    }
}
