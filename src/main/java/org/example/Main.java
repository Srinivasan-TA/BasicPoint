package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

class Point implements Cloneable{
    Logger e = Logger.getLogger("com.api.jar");
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display(){
        e.info("value of x " + x);
        e.info("value of y " + y);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            return x ==y;
        } else {
            return false;
        }
    }


    public Point clone() {
        return new Point(x, y);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Logger e = Logger.getLogger("com.api.jar");
        e.info("enter the x co-ordinate:");
        int x = se.nextInt();
        e.info("enter the y co-ordinate:");
        int y = se.nextInt();
        Point p1 = new Point(x,y);
        Point p2 = p1.clone();
        e.info(p1.equals(p2));
        p2.display();
    }
}
