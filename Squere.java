package Zajecia5_Cw1_;

public class Squere {
    int a;
    double surface;
    double circumference;
    public Squere(int a){
        this.a = a;
    }
    public void field(int a){
        surface = a*a;
    }
    public void Cirum(int a){
    circumference = a*4;
    }

    @Override
    public String toString() {
        return "Kwadrat {" +
                "a=" + a +
                ", Pole=" + surface +
                ", Obwód=" + circumference +
                '}';
    }
}
