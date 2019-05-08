public class Rectangle {
    int length;
    int breadth;
    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int Area() {
        return length*breadth;
    }

    public int Perimeter() {
        return 2*(length+breadth);
    }
}
