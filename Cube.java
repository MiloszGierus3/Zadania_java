package Zajecia5_Cw1_;

public class Cube {

    int a;
    double surfce;
    double volume;
    public Cube(int a){
        this.a = a;
    }
public void Surfece(int a){
        surfce = Math.round((6*Math.pow(a,2)));
}
public void Vaulme(int a){
        volume = Math.round(Math.pow(a,3));
}


    @Override
    public String toString() {
        return "Sześcian {" +
                "a=" + a +
                ", Pole = " + surfce +
                ", Objętość = " + volume +
                '}';
    }
}
