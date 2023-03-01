package org.example;

import java.util.Scanner;
import java.util.logging.Logger;


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
        System.out.println(p1.x+ p1.y);
        Point p2 = p1.clone();
        System.out.println(p2.x+ p2.y);
        String a =String.valueOf(p1.equalling(p2));
        e.info(a);
        p2.display();
    }
}
