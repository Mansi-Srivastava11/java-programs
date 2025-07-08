class circle{
    int radius;
    public int getRadius() {
        return radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
}
class cylinderVolume extends circle{
    int height;
    public int getHeight() {
        return height;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }

}
public class inheritCircleCylinder {
    public static void main(String[] args) {
        cylinderVolume obj = new cylinderVolume();

        obj.radius = 4;
        obj.height = 8;
        System.out.println(obj.getRadius());
        System.out.println(obj.getHeight());

        double area = obj.area();
        System.out.println(area);
        double volume = obj.volume();
        System.out.println(volume);
    }
}
