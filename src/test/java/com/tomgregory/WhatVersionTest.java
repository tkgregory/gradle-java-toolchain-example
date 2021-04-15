package com.tomgregory;

import org.junit.Test;

public class WhatVersionTest {
    @Test
    public void whatVersionTest() {
        String version = System.getProperty("java.version");
        System.out.printf("Tests running on Java version = %s%n", version);
    }
}