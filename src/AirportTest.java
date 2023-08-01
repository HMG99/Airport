import model.Plane;
import service.PlaneService;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        PlaneService service = new PlaneService();

        System.out.println("------------------------MENU---------------------------");

        boolean isFinished = false;
        Plane[] planesArr = new Plane[10];
        int count = 0;
        while (!isFinished) {
            System.out.println("0. Create Plane");
            System.out.println("1. Print Plane information");
            System.out.println("2. Print cost and topSpeed if the plane is" +
                            " military otherwise print model and country");
            System.out.println("3. Return the newer plane");
            System.out.println("4. Return the biggerWingspan plane");
            System.out.println("5. Print the smallest seats count plane");
            System.out.println("6. Print all not military planes");
            System.out.println("7. Print all military planes which were in air more then 100 hours");
            System.out.println("8. return the plane whit minimal weight" +
                    "(if there are some of them return last one)");
            System.out.println("9. return the plane with minimal cost from all military planes ");
            System.out.println("10. Print planes in ascending  form order by year");
            System.out.println("11. Exit");
            int choice = scanner.nextInt();
            int checkingPlane1;
            int checkingPlane2;
            int checkingPlane3;
            switch (choice) {
                case 0:
                    if(count < 9) {
                        Plane plane = service.createPlane();
                        planesArr[count++] = plane;
                    }
                    else {
                        System.out.println("The plane array is full");
                    }
                    break;
                case 1:
                    System.out.print("Which plane: ");
                    checkingPlane1 = scanner.nextInt();
                    if(planesArr[checkingPlane1] != null) {
                        service.planeInfo(planesArr[checkingPlane1]);
                    } else {
                        System.out.println("The element of the specified index is empty");
                    }
                    break;
                case 2:
                    System.out.print("Which plane: ");
                    checkingPlane1 = scanner.nextInt();
                    if(planesArr[checkingPlane1].isMilitary()) {
                        System.out.println(planesArr[checkingPlane1].getCost() + " " +
                                planesArr[checkingPlane1].getTopSpeed());
                    } else {
                        System.out.println(planesArr[checkingPlane1].getModel() + " " +
                                planesArr[checkingPlane1].getCountry());
                    }
                    break;
                case 3:
                    System.out.println("Which planes to compare from the array");
                    System.out.print("Enter first plane number from array: ");
                    checkingPlane1 = scanner.nextInt();
                    System.out.print("Enter second plane number from array: ");
                    checkingPlane2 = scanner.nextInt();
                    if(planesArr[checkingPlane1] == null) {
                        System.out.println("the plane from first index is empty");
                        break;
                    }
                    if(planesArr[checkingPlane2] == null) {
                        System.out.println("the plane from second index is empty");
                        break;
                    }
                    Plane newerPlane = service.newerPlane(planesArr[checkingPlane1], planesArr[checkingPlane2]);
                    System.out.println("The newer plane info is shown below");
                    service.planeInfo(newerPlane);
                    break;
                case 4:
                    System.out.println("Which planes' wings to compare from the array");
                    System.out.print("Enter first plane number from array: ");
                    checkingPlane1 = scanner.nextInt();
                    System.out.print("Enter second plane number from array: ");
                    checkingPlane2 = scanner.nextInt();
                    if(planesArr[checkingPlane1] == null) {
                        System.out.println("the plane from first index is empty");
                        break;
                    }
                    if(planesArr[checkingPlane2] == null) {
                        System.out.println("the plane from second index is empty");
                        break;
                    }
                    Plane biggerWingspan = service.newerPlane(planesArr[checkingPlane1], planesArr[checkingPlane2]);
                    System.out.println("The biggerWingspan plane info is shown below");
                    service.planeInfo(biggerWingspan);
                    break;
                case 5:
                    System.out.println("Which planes' wings to compare from the array");
                    System.out.print("Enter first plane number from array: ");
                    checkingPlane1 = scanner.nextInt();
                    System.out.print("Enter second plane number from array: ");
                    checkingPlane2 = scanner.nextInt();
                    System.out.print("Enter third plane number from array: ");
                    checkingPlane3 = scanner.nextInt();
                    if(planesArr[checkingPlane1] == null) {
                        System.out.println("the plane from first index is empty");
                        break;
                    }
                    if(planesArr[checkingPlane2] == null) {
                        System.out.println("the plane from second index is empty");
                        break;
                    }
                    if(planesArr[checkingPlane3] == null) {
                        System.out.println("the plane from third index is empty");
                        break;
                    }
                    service.smallestSeatsCount(planesArr[checkingPlane1],
                            planesArr[checkingPlane2],planesArr[checkingPlane3]);
                    break;
                case 6:
                    service.notMilitaryPlanes(planesArr);
                    break;
                case 7:
                    service.militaryPlanes100Hours(planesArr);
                    break;
                case 8:
                    Plane minWeight = service.minWeight(planesArr);
                    System.out.println("The minimum weight plane is shown below");
                    service.planeInfo(minWeight);
                    break;
                case 9:
                    Plane minCostPlane = service.minCostFromALlMilitaryPlanes(planesArr);
                    System.out.println("The minimum cost plane is shown below");
                    service.planeInfo(minCostPlane);
                    break;
                case 10:
                    System.out.println("Planes printed in ascending order");
                    service.printPlanesAscendingOrder(planesArr);
                    break;
                case 11:
                    isFinished = true;
                    break;
            }
        }



    }


}
