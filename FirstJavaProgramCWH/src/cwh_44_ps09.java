class Cylinder{
    int radius;
    int height;

    public Cylinder(int h, int r) {
        height = h;
        radius = r;
    }

//    public void setRadius(int r){
//        radius = r;
//    }
//    public void setHeight(int h){
//        height = h;
//    }
//    public int getRadius(){
//        return radius;
//    }
//    public int getHeight(){
//        return height;
//    }
    public double getArea(){
        return (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
    }
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }
}

public class cwh_44_ps09 {
    public static void main(String[] args) {
        Cylinder cl = new Cylinder(30, 10);
//        cl.setHeight(30);
//        cl.setRadius(10);
//        System.out.println(cl.getHeight());
//        System.out.println(cl.getRadius());
        System.out.println("Cylinder are is: " + cl.getArea() + " and cylinder volume is: " + cl.getVolume());
    }
}
