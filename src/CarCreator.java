import java.util.Scanner;

public class CarCreator {

    private static Scanner sc = new Scanner(System.in);


    public static Car createCar(){
        System.out.println("Podaj nazwe:");
        String name = sc.nextLine();

        System.out.println("Podaj rok produkcji:");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.println("Podaj moc:");
        double power = sc.nextDouble();
        sc.nextLine();

        return new Car(name,year,power);
    }
}
