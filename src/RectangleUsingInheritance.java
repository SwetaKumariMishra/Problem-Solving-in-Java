//Q.Create a Rectangle and use inheritance to create another class cuboid

class Rectangle1{
    public int width;
    public int length;

    Rectangle1()
    {
        System.out.println("Nothing");
    }
    Rectangle1(int length, int width)
    {
        this.length=length;
        this.width=width;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public float area(){
        return this.length*this.width;
    }
}
class Cuboid extends Rectangle1{
    public int height;

    Cuboid(int height,int length, int width){
        super(length,width);
        this.height=height;
        this.width=width;
        this.length=length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float volume(){
        return this.length*this.width*this.height;
    }
}

public class RectangleUsingInheritance {
    public static void main(String[] args) {
        Rectangle1 r= new Rectangle1(2,3);
        System.out.println(r.area());
        Cuboid cb= new Cuboid(2,3,4);
        System.out.println(cb.volume());

    }
}
