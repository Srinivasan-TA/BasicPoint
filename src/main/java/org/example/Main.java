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
        String s ="value of x " + x;
        e.info(s);
        String r ="value of y " + y;
        e.info(r);
    }

    public boolean equalling(Object obj) {
        if (obj instanceof Point) {
            return x ==y;
        } else {
            return false;
        }
    }


    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Scanner se = new Scanner(System.in);
        Logger e = Logger.getLogger("com.api.jar");
        String s="enter the x co-ordinate:";
        e.info(s);
        int x = se.nextInt();
        String r="enter the y co-ordinate:";
        e.info(r);
        int y = se.nextInt();
        Point p1 = new Point(x,y);
        Point p2 = (Point)p1.clone();
        String a =String.valueOf(p1.equalling(p2));
        e.info(a);
        p2.display();
    }
}
