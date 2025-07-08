class rect{
    int length;
    int breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
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
}
class cuboid extends rect{
    int width;
    int height;
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int volume(){
        return length*width*height;
    }
}
public class inheritRectCuboid {
    public static void main(String[] args) {
        cuboid cube = new cuboid();
        cube.setLength(5);
        cube.setBreadth(10);
        cube.setWidth(2);
        cube.setHeight(8);

        System.out.println(cube.getLength());
        System.out.println(cube.getBreadth());
        System.out.println(cube.getWidth());
        System.out.println(cube.getHeight());

        System.out.println(cube.area());
        System.out.println(cube.volume());
    }
}
