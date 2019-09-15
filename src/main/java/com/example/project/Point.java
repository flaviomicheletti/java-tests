package com.example.project;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    String string() {
        return "(" + x + "," + y + ")";
    }

    Point center(Point other) {
        // Returns the center between this point the other point
        // Notice we are using integer, we wan't get an accurate value
        return new Point((x + other.x) / 2, (y + other.y) / 2);
	}
}