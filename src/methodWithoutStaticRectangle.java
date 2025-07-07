class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
    public int getLength(){
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class methodWithoutStaticRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 4;
        rect.breadth = 8;
        System.out.println(rect.getLength());
        System.out.println(rect.getBreadth());
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
    }
}
