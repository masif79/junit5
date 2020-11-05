package com.jj.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class StringUtilTest {

        @Test
        public void convertFirstCharacterToCapital_should_return_true_if_first_char_is_cap(){

                final StringUtil stringUtil = new StringUtil();
                String value = stringUtil.convertFirstCharacterToCapital("JUnit");
                assertTrue(Character.isUpperCase(value.charAt(0)));
        }

        @Test
        public void testInAllEnvironments(){

                final StringUtil stringUtil = new StringUtil();
                String value = stringUtil.convertFirstCharacterToCapital("JUnit");

                assumingThat(System.getenv("PATH").startsWith("C:/"),
                        () -> {
                                assertFalse(Character.isUpperCase(value.charAt(0)));
                        });

                assertTrue(Character.isUpperCase(value.charAt(0)));
        }
}
