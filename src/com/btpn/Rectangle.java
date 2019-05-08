package com.btpn;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(int length) {
        this.length = length;
        this.breadth = length;
    }

    static Rectangle createRectangle(int length, int breadth) {
        return new Rectangle(length, breadth);
    }

    static Rectangle createSquare(int side) {
        return new Rectangle(side);
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }
}
