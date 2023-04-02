package Zajecia5_Cw1_;

import java.util.Scanner;

public class Results {
    private static Squere squere;

    public static void main(String[] args) {
        Run();
    }

    public static void Run() {
        while (true) {
            Menu();
        }
    }

    public static void Menu() {
        //int[] tab = returnArray();

        System.out.println("WYBIERZ: 1.Kolo 2.Kwadrat 3.Prostokat 4.Szescian 5.Prostopadłościan 6.Kula 7.Stożek 8.Wyjdz ");
        int num = InputInt();
        switch (num) {
            case 1 -> kolo();
            case 2 -> kwadrat();
            case 3 -> prostokat();
            case 4 -> szescian();
            case 5 -> prostopadloscian();
            case 6 -> kula();
            case 7 -> stozek();
            case 8 -> Close();

        }

        String cont = "";
        while (!(cont.equals("t")) || !(cont.equals("n"))) {
            System.out.println("kontynuowac?: t/n");
            cont = inputStr();
            if (cont.equals("t")) {
                Menu();
            } else if (cont.equals("n")) {
                Close();
            }
        }
    }


    public static String inputStr () {
        Scanner skaner_str = new Scanner(System.in);
        String tekst = skaner_str.nextLine();
        return tekst;
    }
    public static int InputInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static void kolo(){
        System.out.println("Podaj promień: ");
        int a = InputInt();
        Circle circle1 = new Circle(a);
        circle1.Field(a);
        circle1.Obw(a);
        System.out.println(circle1.toString());
    }
    public static void kwadrat(){
        System.out.println("Poraj długość boku: ");
        int a = InputInt();
        Squere squere = new Squere(a);
        squere.field(a);
        squere.Cirum(a);
        System.out.println(squere.toString());
    }
    public static void prostokat(){
        System.out.println("Podaj Długość boku a: ");
        int a = InputInt();
        System.out.println("Podaj długość boku b: ");
        int b = InputInt();
        Rectangle rectangle = new Rectangle(a,b);
        rectangle.Field(a,b);
        rectangle.Circum(a,b);
        System.out.println(rectangle.toString());
    }
    public static void szescian(){
        System.out.println("Podaj bok: ");
        int a = InputInt();
        Cube cube = new Cube(a);
        cube.Surfece(a);
        cube.Vaulme(a);
        System.out.println(cube.toString());

    }

    public static void prostopadloscian(){
        System.out.println("Podaj jeden z boków podstawy: ");
        int a = InputInt();
        System.out.println("Podaj drugi z boków podstawy: ");
        int b = InputInt();
        System.out.println("Podaj wyskość prostopadłościanu: ");
        int c = InputInt();

        Cuboid cuboid = new Cuboid(a,b,c);
        cuboid.Surfece(a,b,c);
        cuboid.Vaulme(a,b,c);
        System.out.println(cuboid.toString());
    }
    public static void kula(){
        System.out.println("Podaj Promien: ");
        int a = InputInt();
        Ball ball = new Ball(a);
        ball.Surface(a);
        ball.Valume(a);
        System.out.println(ball.toString());
    }
    public static void stozek(){
        System.out.println("Podaj Promień: ");
        int a = InputInt();
        System.out.println("Podaj Wysokość: ");
        int b = InputInt();
        System.out.println("Podaj tworzaca: ");
        int c = InputInt();
        Cone cone = new Cone(a,b,c);
        cone.Surface(a,b);
        cone.Valume(a,c);
        System.out.println(cone.toString());
    }
    public static void Close(){
        System.out.println("trzymaj sie");
        System.exit(0);
    }

}

