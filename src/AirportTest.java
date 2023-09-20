import model.Plane;
import service.PlaneService;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PlaneService planeService = new PlaneService();

        Plane plainFirst = new Plane();
        System.out.println("Input model: ");
        plainFirst.setModel(scanner.next());
        System.out.println("Input country: ");
        plainFirst.setCountry(scanner.next());
        System.out.println("Input year: ");
        plainFirst.setYear(scanner.nextInt());
        System.out.println("Input hours: ");
        plainFirst.setHours(scanner.nextInt());
        System.out.println("Input military: ");
        plainFirst.setMilitary(scanner.nextBoolean());
        System.out.println("Input weight: ");
        plainFirst.setWeight(scanner.nextInt());
        System.out.println("Input wingspan: ");
        plainFirst.setWingspan(scanner.nextInt());
        System.out.println("Input topSpeed: ");
        plainFirst.setTopSpeed(scanner.nextInt());
        System.out.println("Input seats: ");
        plainFirst.setSeats(scanner.nextInt());
        System.out.println("Input cost: ");
        plainFirst.setCost(scanner.nextDouble());

        Plane plainSecond = new Plane();
        System.out.println("Input model: ");
        plainSecond.setModel(scanner.next());
        System.out.println("Input country: ");
        plainSecond.setCountry(scanner.next());
        System.out.println("Input year: ");
        plainSecond.setYear(scanner.nextInt());
        System.out.println("Input hours: ");
        plainSecond.setHours(scanner.nextInt());
        System.out.println("Input military: ");
        plainSecond.setMilitary(scanner.nextBoolean());
        System.out.println("Input weight: ");
        plainSecond.setWeight(scanner.nextInt());
        System.out.println("Input wingspan: ");
        plainSecond.setWingspan(scanner.nextInt());
        System.out.println("Input topSpeed: ");
        plainSecond.setTopSpeed(scanner.nextInt());
        System.out.println("Input seats: ");
        plainSecond.setSeats(scanner.nextInt());
        System.out.println("Input cost: ");
        plainSecond.setCost(scanner.nextDouble());

        Plane plainThird = new Plane();
        System.out.println("Input model: ");
        plainThird.setModel(scanner.next());
        System.out.println("Input country: ");
        plainThird.setCountry(scanner.next());
        System.out.println("Input year: ");
        plainThird.setYear(scanner.nextInt());
        System.out.println("Input hours: ");
        plainThird.setHours(scanner.nextInt());
        System.out.println("Input military: ");
        plainThird.setMilitary(scanner.nextBoolean());
        System.out.println("Input weight: ");
        plainThird.setWeight(scanner.nextInt());
        System.out.println("Input wingspan: ");
        plainThird.setWingspan(scanner.nextInt());
        System.out.println("Input topSpeed: ");
        plainThird.setTopSpeed(scanner.nextInt());
        System.out.println("Input seats: ");
        plainThird.setSeats(scanner.nextInt());
        System.out.println("Input cost: ");
        plainThird.setCost(scanner.nextDouble());

        Plane plainFourth = new Plane();
        System.out.println("Input model: ");
        plainFourth.setModel(scanner.next());
        System.out.println("Input country: ");
        plainFourth.setCountry(scanner.next());
        System.out.println("Input year: ");
        plainFourth.setYear(scanner.nextInt());
        System.out.println("Input hours: ");
        plainFourth.setHours(scanner.nextInt());
        System.out.println("Input military: ");
        plainFourth.setMilitary(scanner.nextBoolean());
        System.out.println("Input weight: ");
        plainFourth.setWeight(scanner.nextInt());
        System.out.println("Input wingspan: ");
        plainFourth.setWingspan(scanner.nextInt());
        System.out.println("Input topSpeed: ");
        plainFourth.setTopSpeed(scanner.nextInt());
        System.out.println("Input seats: ");
        plainFourth.setSeats(scanner.nextInt());
        System.out.println("Input cost: ");
        plainFourth.setCost(scanner.nextDouble());

        Plane[] arrayPlane = {plainFirst, plainSecond, plainThird, plainFourth};

        System.out.println("Print all information of the plane");
        planeService.Task1(plainSecond);
        System.out.println("Print cost and topSpeed if the plane is military otherwise print model and country");
        planeService.Task2(plainFirst);
        System.out.println("Return the plane which one is newer (if they have the same age return first one)");
        planeService.Task1(planeService.Task3(plainFirst, plainSecond));
        System.out.println("return the model of the plane which has  bigger wingspan (if they have the same - return second one)");
        System.out.println(planeService.Task4(plainThird, plainFourth));
        System.out.println("Print country of the plane whit smallest seats count(if they have the same - print first)");
        planeService.Task5(plainFirst, plainSecond, plainThird);
        System.out.println("Print all not military planes");
        planeService.Task6(arrayPlane);
        System.out.println("Print all military planes which were in air more then 100 hours");
        planeService.Task7(arrayPlane);
        System.out.println("Return the plane whit minimal weight (if there are some of them return last one)");
        planeService.Task1(planeService.Task8(arrayPlane));
        System.out.println("Return the plane whit minimal cost from all military planes");
        planeService.Task1(planeService.Task9(arrayPlane));
        System.out.println("Print planes in ascending form order by year");
        planeService.Task10(arrayPlane);
    }
}