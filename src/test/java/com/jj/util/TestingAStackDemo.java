package com.jj.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("A stack")
public class TestingAStackDemo {

        Stack<Object> stack;

        @Test
        @DisplayName("is instantiated with new Stack()")
        void isInstantiatedWithNew() {

                new Stack<>();
        }

        @Nested
        @DisplayName("when new")
        class WhenNew {

                @BeforeEach
                void createNewStack() {
                        stack = new Stack<>();
                }

                @Test
                @DisplayName("is empty")
                void isEmpty() {
                        assertTrue(stack.isEmpty());
                }
        }
}
