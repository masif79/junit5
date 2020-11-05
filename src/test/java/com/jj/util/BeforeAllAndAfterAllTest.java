package com.jj.util;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeforeAllAndAfterAllTest {

        @BeforeAll
        static void createDatabase() {

                System.out.println("BeforeAll called");
        }

        @Test
        void test1() {

                System.out.println("Test 1 called");
        }

        @Test
        void test2() {

                System.out.println("Test 2 called");
        }

        @AfterAll
        static void releaseDatabase() {

                System.out.println("AfterAll called");
        }
}
