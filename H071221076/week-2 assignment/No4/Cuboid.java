class Cuboid {
    double length;
    double width;
    double height;

    double getVolume() {
        return length * width * height;
    }

//public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.length = 15.0; //or 36.0, 30.0
        cuboid.width = 20.0; //or 25.0, 15.0
        cuboid.height = 15.0; //or 5.0, 10.0
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }  
}