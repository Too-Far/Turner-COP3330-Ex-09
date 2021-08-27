/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Turner
 */
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class App
{
    public static void compileMessage(int sqFt, int gallonsNeeded)
    {
        System.out.println(
                "You will need to purchase " + gallonsNeeded + " gallons of paint to cover "
                + sqFt +" square Feet."
        );
    }

    public static void performCalcs(Map<String, Integer> info)
    {
        float gallonPerSqFt = 350.000F;
        int sqFt = info.get("width") * info.get("length");
        int gallonsNeeded = (int) Math.ceil(sqFt / gallonPerSqFt);
        compileMessage(sqFt, gallonsNeeded);
    }

    public static void gatherInfo() throws IOException {
        Map<String, Integer> info = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is the length of the room to be painted? ");
        info.put("length", Integer.parseInt(reader.readLine()));

        System.out.println("What is the width of the room to be painted? ");
        info.put("width", Integer.parseInt(reader.readLine()));

        performCalcs(info);
    }

    public static void main( String[] args ) throws IOException {
        gatherInfo();
    }
}
