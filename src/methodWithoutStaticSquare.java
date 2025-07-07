class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
    public int getSide(){
        return side;
    }
}

public class methodWithoutStaticSquare {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.getSide());
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }
}
