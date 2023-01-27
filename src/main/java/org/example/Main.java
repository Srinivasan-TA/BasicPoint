package org.example;

class Point implements Cloneable{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display(){
        logger.log("value of x " + x);
        logger.log("value of y " + y);
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
        Point p1 = new Point(3, 36);
        Point p2 = p1.clone();
        logger.log(p1.equals(p2));
        p2.display();
    }
}
