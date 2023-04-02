package Zajecia5_Cw1_;

public class Cone {
    int radius;
    int high;
    int generatrix;
    double surface;
    double valume;
    public Cone(int radius, int high, int generatrix){
        this.radius = radius;
        this.high = high;
        this.generatrix = generatrix;
    }
    public void Surface(int a,int b){
        surface = Math.round((Math.PI* Math.pow(radius,2))+(Math.PI*radius*generatrix));
    }
    public void Valume(int a,int c){
        valume = Math.round((1/3)* Math.PI* Math.pow(radius,2)*high);
    }

    @Override
    public String toString() {
        return "Stożek {" +
                "Promień = " + radius +
                ", Wyskokść = " + high +
                ", Tworząca = " + generatrix +
                ", Pole = " + surface +
                ", Objetość = " + valume +
                '}';
    }
}
