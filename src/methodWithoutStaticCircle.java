class Circle{
    float radius;
    public double area(){
        return 3.14*radius*radius;
    }
    public double circumference(){
        return 2*3.14*radius;
    }

    public float getRadius() {
        return radius;
    }
}
public class methodWithoutStaticCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 4.0f;
        System.out.println(circle.getRadius());
        System.out.println(circle.area());
        System.out.println(circle.circumference());
    }
}
