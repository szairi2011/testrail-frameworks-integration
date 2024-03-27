package com.idera.testrail.tests;

import com.testrail.junit.customjunitxml.annotations.TestRail;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MultiplicationTests {

    @Test
    @TestRail(id="C2192", description = "Multiply two numbers")
    public void MultiplyTwoNumbers() {
        assertEquals(4, 2*2, "Should equal 4");
    }
}