import model.Plane;
import service.PlaneService;
import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Plane plane1 = new Plane("model1", "Russia", 1990, 150, false,80000,
                40, 400, 60, 5_000_000);
        Plane plane2 = new Plane("model2", "USA", 1995, 200, true,10000,
                20, 700, 10, 2_000_000);
        Plane plane3 = new Plane("model3", "China", 2000, 350, true,15000,
                15, 650, 15, 2_500_000);

        PlaneService service = new PlaneService();

        Plane[] planes = new Plane[]{plane1, plane2, plane3};

        for(Plane plane : planes) {
            service.planeInfo(plane);
            System.out.println();
        }
        System.out.println();
        service.costTopSpeedOrModelCountry(plane1);
        System.out.println();
        service.costTopSpeedOrModelCountry(plane2);
        System.out.println();

        Plane newerPlane = service.newerPlane(plane1, plane2);
        System.out.println("Newer plane between plane1 and plane2: ");
        service.planeInfo(newerPlane);
        System.out.println();

        Plane biggerWingspan = service.biggerWingspan(plane1, plane2);
        System.out.println("Bigger wingspan plane between plane1 and plane2: ");
        service.planeInfo(biggerWingspan);
        System.out.println();


        System.out.print("Country with smallest number of seats: ");
        service.smallestSeatsCount(plane1, plane2, plane3);
        System.out.println();


        System.out.println("Not military planes are: ");
        service.notMilitaryPlanes(planes);
        System.out.println();

        System.out.println("All military planes which were in air more then 100 hours");
        service.militaryPlanes100Hours(planes);
        System.out.println();


        Plane minWeightPlane = service.minWeight(planes);
        System.out.println("Min weight plane is: ");
        service.planeInfo(minWeightPlane);
        System.out.println();

        Plane minCostPlane = service.minCostFromALlMilitaryPlanes(planes);
        System.out.println("Plane with minimal cost from all military planes ");
        service.planeInfo(minCostPlane);
        System.out.println();


        System.out.println("Planes ascending order: ");
        service.printPlanesAscendingOrder(planes);





    }
}
