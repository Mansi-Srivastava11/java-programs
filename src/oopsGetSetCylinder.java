class cylinder{
    float radius;
    float height;

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public float getHeight() {
        return height;
    }
    public double surfaceArea(){
        return 2*3.14*radius*radius+2*3.14*radius*height;
    }
    public double volume(){
        return 3.14*radius*radius/height;
    }
}
public class oopsGetSetCylinder {
    public static void main(String[] args) {
        cylinder cylndr = new cylinder();
        cylndr.setRadius(4.0f);
        cylndr.setHeight(10.0f);
        System.out.println(cylndr.getRadius());
        System.out.println(cylndr.getHeight());

        System.out.println(cylndr.surfaceArea());
        System.out.println(cylndr.volume());
    }
}
