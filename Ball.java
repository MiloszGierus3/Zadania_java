package Zajecia5_Cw1_;

public class Ball {
    int radius;
    double surface;
    double valume;
    public Ball(int radius){
        this.radius = radius;
    }
    public void Surface(int a){
        surface = Math.round(4*Math.PI*Math.pow(radius,2));
    }
    public void Valume(int a){
        valume = Math.round((4/3)*Math.PI*Math.pow(radius,3));
    }

    @Override
    public String toString() {
        return "Koło {" +
                "Promień = " + radius +
                ", Pole = " + surface +
                ", Objetość = " + valume +
                '}';
    }
}
