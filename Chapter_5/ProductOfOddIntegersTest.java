package com.timbuchalka;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfOddIntegersTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatOnlyOddIntegersCanBeCalculated(){
        int result = ProductOfOddIntegers.oddNumCalc();
        assertEquals(2_027_025, result);
    }
}