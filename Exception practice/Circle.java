public class Circle {
    private  double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public  void  setRadius(double radius){
        if (radius<0){
            throw new IllegalArgumentException("Radius cannot be negative");
        } else {
            this.radius = radius;
        }
    }
}
