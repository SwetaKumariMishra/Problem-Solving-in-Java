package pack;

class Square1{
    int side;
    public int area()
    {
        return side*side ;
    }

    public int perimeter()
    {
        return 4*side;
    }

    public void hit()
    {
        System.out.println("hitting...");
    }
}

public class Square {
    public static void main(String[] args) {

        Square1 sq = new Square1();
        sq.side=5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        sq.hit();

    }
}
