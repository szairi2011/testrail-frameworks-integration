package com.idera.testrail.tests;

import com.testrail.junit.customjunitxml.annotations.TestRail;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTests {

    @Test
    @TestRail(id="C2195", description = "Divide two numbers")
    public void DivideTwoNumbers(){
        assertEquals(2, 4/2);
    }
}
