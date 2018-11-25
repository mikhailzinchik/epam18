package com.epam.trafficlights;

public class TrafficLights {
    String changeLight(int trafficTime) {
        if (trafficTime < 0) {
            return "Invalid number";
        }
        if (trafficTime >= 10) {
            trafficTime = trafficTime % 10;
        }
        if (trafficTime <= 2) {
            return "red";
        } else {
            if (trafficTime <= 5) {
                return "yellow";
            } else {
                return "green";
            }
        }
    }
}
