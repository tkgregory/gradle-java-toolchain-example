package com.tomgregory;

public class WhatVersion {
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.out.printf("Java version = %s%n", version);
    }
}
