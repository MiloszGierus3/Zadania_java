package Zajecia5_Cw1_;

public class Rectangle {

    int a,b;
    double surface;
    double circumference;
    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void Field(int a,int b){
        surface = a*b;
    }
    public void Circum(int a,int b){
        circumference = 2*a+2*b;
    }

    @Override
    public String toString() {
        return "Prostokąt {" +
                "a=" + a +
                ", b=" + b +
                ", Pole =" + surface +
                ", Obwód =" + circumference +
                '}';
    }
}
