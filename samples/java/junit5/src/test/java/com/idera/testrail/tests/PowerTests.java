package com.idera.testrail.tests;

import com.testrail.junit.customjunitxml.annotations.TestRail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerTests {
    @Test
//    @TestRail(id="C2206")
    void squareOfNumber() {
        Assertions.assertEquals(9, 3*3, "Should equal 9");
    }

    @Test
    @TestRail(id="C2205")
    void powerOfTwoNumbers() {
        Assertions.assertEquals(8, Math.pow(2, 3), "Should equal 8");
    }
}
