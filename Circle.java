package Zajecia5_Cw1_;

public class Circle {
    int radius;
    double surface;
    double circumference;
    public Circle(int radius){
        this.radius = radius;
    }
     public void Field(int a){
          surface = Math.round(Math.PI*(Math.pow(a,2)));
    }
    public void Obw(int a){
        circumference = Math.round(2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return "Koło{" +
                "Promień=" + radius +
                ", Pole=" + surface +
                ", Obwód=" + circumference +
                '}';
    }



}
