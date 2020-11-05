package com.jj.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("A calculator test case")
public class CalculatorTest {

        @Test
        void add_should_add_two_number() {

                final Calculator calculator = new Calculator();

                assertEquals(5, calculator.addition(2, 3));
        }

        @Test
        @DisplayName("Test case to add two numbers")
        void add_should_add_two_number_with_displayname() {

                final Calculator calculator = new Calculator();

                assertEquals(5, calculator.addition(2, 3));
        }
}
