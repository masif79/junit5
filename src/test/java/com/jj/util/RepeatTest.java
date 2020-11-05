package com.jj.util;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatTest {

        @RepeatedTest(5)
        void repeatedTest() {

                System.out.println("RepeatedTest called");
        }

        @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
        void repeatedTestWithCustomName() {

                System.out.println("Executing repeated test with long name");

                assertEquals(2, Math.addExact(1, 1), "1 + 1 should equal 2");
        }
}
