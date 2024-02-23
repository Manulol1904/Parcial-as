package com.example.parcial_as;

import static org.junit.Assert.*;

import org.junit.Test;

public class v2Test {

    @Test
    public void count() {
        int result = v2.count(5);
        assertEquals(6,result,0);
    }
}