class rectangle{
    int length;
    int breadth;
     public rectangle(){
        this.length = length;
        this.breadth = breadth;
    }
    public rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class overloadConstructorRect {
    public static void main(String[] args) {
        rectangle rect = new rectangle(4,8);
        System.out.println(rect.getLength());
        System.out.println(rect.getBreadth());

        System.out.println(rect.area());
        System.out.println(rect.perimeter());
    }
}
