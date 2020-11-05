package com.jj.util;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BeforeAfterTest {

        List<String> data;

        @BeforeEach
        void loadData() {

                data = new ArrayList<>();
                System.out.println("BeforeEach Data size: " + data.size());
        }

        @Test
        void data_size_should_be_2() {

                this.data.add("first");
                this.data.add("second");
                System.out.println("Data size Test1: " + data.size());
                assertEquals(2, data.size());
        }

        @Test
        void data_size_should_be_3() {

                this.data.add("first");
                this.data.add("second");
                this.data.add("third");
                System.out.println("Data size Test2: " + data.size());
                assertEquals(3, data.size());
        }

        @AfterEach
        public void clearData() {

                System.out.println("Afterall called");
        }
}
