package com.example.klacz.myapplication.board;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by klacz on 25.01.2017.
 */

public class Circle {

    public int number;
    public Map<Circle, Circle> outgoingConnection = new HashMap<>();
    public Map<Circle, Circle> incomingConnection = new HashMap<>();

    public Circle(int number, Map<Circle, Circle> outgoingConnection, Map<Circle, Circle> incomingConnection) {
        this.number = number;
        this.outgoingConnection = outgoingConnection;
        this.incomingConnection = incomingConnection;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Map<Circle, Circle> getOutgoingConnection() {
        return outgoingConnection;
    }

    public void setOutgoingConnection(Map<Circle, Circle> outgoingConnection) {
        this.outgoingConnection = outgoingConnection;
    }

    public Map<Circle, Circle> getIncomingConnection() {
        return incomingConnection;
    }

    public void setIncomingConnection(Map<Circle, Circle> incomingConnection) {
        this.incomingConnection = incomingConnection;
    }
}
