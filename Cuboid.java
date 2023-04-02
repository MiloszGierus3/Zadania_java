package Zajecia5_Cw1_;

public class Cuboid {

    int a,b,c;
    double surfce;
    double volume;
    public Cuboid(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void Surfece(int a,int b,int c){
        surfce = Math.round((2 * a * b) + (2 * a * c) + (2 * b * c));
    }
    public void Vaulme(int a,int b,int c){
        volume = a*b*c;
    }

    @Override
    public String toString() {
        return "Prostopadłościan {" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", Pole = " + surfce +
                ", Objętość = " + volume +
                '}';
    }
}
