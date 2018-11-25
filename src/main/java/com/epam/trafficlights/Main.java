package com.epam.trafficlights;

import java.util.Scanner;

/*
 * Task:
 * Make a traffic light with a color output in the console. You enter a minute
 * (from zero to n) and access which light is on at the traffic lights.
 * The first two minutes are red, then three minutes are yellow and five minutes is green.
 */
public class Main {
    public static void main(String[] args) {
        int trafficTime;
        String light;
        TrafficLights tLight = new TrafficLights();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Input number: ");
            if (in.hasNextInt()) {
                trafficTime = in.nextInt();
                light = tLight.changeLight(trafficTime);
                switch (light) {
                    case "red":
                        System.out.println("Current light is " + light);
                        break;
                    case "yellow":
                        System.out.println("Current light is " + light);
                        break;
                    case "green":
                        System.out.println("Current light is " + light);
                        break;
                    case "Invalid number":
                        System.out.println("Error! " + light + "!");
                        break;
                    default:
                        System.out.println("Error!");
                        break;
                }
            } else {
                if (in.next().equals("exit")) {
                    break;
                }
                System.out.println("Error! Entered value is not a number (integer)");
            }
        }
    }
}