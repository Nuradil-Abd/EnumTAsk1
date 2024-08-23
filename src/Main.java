
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Write type of transport: ");
            TransportType transport = (TransportType.valueOf(scan.nextLine().toUpperCase().replace(" ", "")));
            System.out.print("Write distance: ");
            double distance = scan.nextDouble();

            switch (transport) {
                case CAR -> System.out.println(Math.round(TransportType.CAR.calculateTravelCost(distance)) + " $");
                case BUS -> System.out.println(Math.round(TransportType.BUS.calculateTravelCost(distance)) + " $");
                case TRUCK -> System.out.println(Math.round(TransportType.TRUCK.calculateTravelCost(distance)) + " $");
                default -> System.err.println("Invalid type of transport!!!");

            }
        }
    }
}