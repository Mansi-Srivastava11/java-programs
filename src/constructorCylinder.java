class Cylinder{
    float radius;
    float height;
    public Cylinder(float radius,float height){
        this.radius = radius;
        this.height = height;
    }
    public double surfaceArea(){
        return 2*3.14*radius*radius+2*3.14*radius*height;
    }
    public double volume(){
        return 3.14*radius*radius/height;
    }
    public float getRadius() {
        return radius;
    }

    public float getHeight() {
        return height;
    }
}
public class constructorCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4,10);
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getHeight());

        System.out.println(cylinder.surfaceArea());
        System.out.println(cylinder.volume());
    }
}
