import model.Plane;
import service.PlaneService;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {

        boolean isActive = true;
        Plane plane1 = new Plane("model1", "USA", 1980, 5600, true, 35_000, 20, 650, 25, 2_000_000);
        Plane plane2 = new Plane("model2", "Russia", 1950, 7800, false, 80_000, 30, 500, 80, 1_500_000);
        Plane plane3 = new Plane("model3", "China", 2005, 3000, true, 70_000, 35, 450, 70, 1_800_000);
        Plane[] planes = {plane1, plane2, plane3};

        Scanner scanner = new Scanner(System.in);
        PlaneService service = new PlaneService();


        while (isActive) {
            System.out.println("1: print all information of the plane");
            System.out.println("2: print cost and topSpeed if the plane is military otherwise print model and country");
            System.out.println("3: return the plane which one is newer (if they have the same age return first one)");
            System.out.println("4: return the model of the plane which has bigger wingspan (if they have the same - return second one)");
            System.out.println("5: print country of the plane with smallest seats count(if they have the same - print first)");
            System.out.println("6: print all not military planes");
            System.out.println("7: print all military planes which were in air more then 100 hours");
            System.out.println("8: return the plane with minimal weight (if there are some of them return last one)");
            System.out.println("9: return the plane with minimal cost from all military planes");
            System.out.println("10: print planes in ascending  form order by year");
            System.out.println("11: Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    service.task1(plane1);
                    break;
                case 2:
                    service.task2(plane1);
                    break;
                case 3:
                    Plane newerPlane = service.task3(plane1, plane2);
                    newerPlane.printInfo();
                    break;
                case 4:
                    String model = service.task4(plane1, plane2);
                    System.out.println("The model of the plane with bigger wingspan: " + model);
                    break;
                case 5:
                    service.task5(plane1, plane2, plane3);
                    break;
                case 6:
                    service.task6(planes);
                    break;
                case 7:
                    service.task7(planes);
                    break;
                case 8:
                    Plane minWeightPlane = service.task8(planes);
                    minWeightPlane.printInfo();
                    break;
                case 9:
                    Plane minCostMilitary = service.task9(planes);
                    minCostMilitary.printInfo();
                    break;
                case 10:
                    service.task10(planes);
                    break;
                case 11:
                    isActive = false;

            }
        }

    }
}
