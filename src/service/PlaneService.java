package service;

import model.Plane;

import java.util.Scanner;

interface planeServiceInt {
    void planeInfo(Plane plane);

    void costTopSpeedOrModelCountry(Plane plane);

    Plane newerPlane(Plane plane1, Plane plane2);

    Plane biggerWingspan(Plane plane1, Plane plane2);

    void smallestSeatsCount(Plane plane1, Plane plane2, Plane plane3);

    void notMilitaryPlanes(Plane[] planes);

    void militaryPlanes100Hours(Plane[] planes);

    Plane minWeight(Plane[] planes);

    Plane minCostFromALlMilitaryPlanes(Plane[] planes);

    public void printPlanesAscendingOrder(Plane[] planes);

    Plane createPlane();

}

public class PlaneService implements planeServiceInt {

    public void planeInfo(Plane plane) {
        System.out.println("Model: " + plane.getModel());
        System.out.println("Plane: " + plane.getCountry());
        System.out.println("Year: " + plane.getYear());
        System.out.println("hours: " + plane.getHours());
        System.out.println("isMilitary: " + plane.isMilitary());
        System.out.println("Weight: " + plane.getWeight());
        System.out.println("Wingspan: " + plane.getWingspan());
        System.out.println("TopSpeed: " + plane.getTopSpeed());
        System.out.println("Seats: " + plane.getSeats());
        System.out.println("Cost: " + plane.getCost());
    }

    public void costTopSpeedOrModelCountry(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println(plane.getCost());
            System.out.println(plane.getTopSpeed());
        } else {
            System.out.println(plane.getModel());
            System.out.println(plane.getCountry());
        }
    }

    public Plane newerPlane(Plane plane1, Plane plane2) {
        if (plane1.getYear() >= plane2.getYear()) {
            return plane1;
        } else {
            return plane2;
        }
    }

    public Plane biggerWingspan(Plane plane1, Plane plane2) {
        if (plane2.getWingspan() >= plane1.getWingspan()) {
            return plane2;
        } else {
            return plane1;
        }
    }

    public void smallestSeatsCount(Plane plane1, Plane plane2, Plane plane3) {
        if (plane1.getSeats() <= plane2.getSeats() && plane1.getSeats() <= plane3.getSeats()) {
            System.out.println(plane1.getCountry());
        } else if (plane2.getSeats() < plane1.getSeats() && plane2.getSeats() <= plane3.getSeats()) {
            System.out.println(plane2.getCountry());
        } else if (plane3.getSeats() < plane1.getSeats() && plane3.getSeats() <= plane2.getSeats()) {
            System.out.println(plane3.getCountry());
        }
    }

    public void notMilitaryPlanes(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane == null) {
                break;
            } else if (!plane.isMilitary()) {
                planeInfo(plane);
            }
        }
    }

    public void militaryPlanes100Hours(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane == null) {
                break;
            } else if (plane.isMilitary() && plane.getHours() > 100) {
                planeInfo(plane);
            }
        }
    }

    public Plane minWeight(Plane[] planes) {
        Plane min = planes[0];

        for (int i = 1; i < planes.length; i++) {
            if (planes[i] == null) {
                break;
            } else if (planes[i].getWeight() <= min.getWeight()) {
                min = planes[i];
            }
        }
        return min;
    }

    public Plane minCostFromALlMilitaryPlanes(Plane[] planes) {
        Plane min = null;

        for (Plane plane : planes) {
            if (plane == null) {
                break;
            }
            if (min == null) {
                if (plane.isMilitary()) {
                    min = plane;
                }
            } else if (plane.isMilitary() && plane.getCost() < min.getCost()) {
                min = plane;
            }
        }

        if (min == null) {
            System.out.println("There are no military planes");
        }
        return min;
    }



    public void planesAscendingOrder(Plane[] planes) {
        int countOfPlanes = notEmptyElements(planes);
        for (int i = 0; i < countOfPlanes; i++) {
            for (int j = 1; j < countOfPlanes - i; j++) {
                if (planes[j].getYear() < planes[j - 1].getYear()) {
                    Plane temp = planes[j];
                    planes[j] = planes[j - 1];
                    planes[j - 1] = temp;
                }
            }
        }
    }
    private int notEmptyElements(Plane[] planes) {
        int countOfPlanes = 0;
        for (Plane plane : planes) {
            if(plane != null) {
                countOfPlanes++;
            }
        }
        return countOfPlanes;
    }




    public void printPlanesAscendingOrder(Plane[] planes) {
        planesAscendingOrder(planes);
        for (Plane plane : planes) {
            if (plane == null) {
                break;
            } else {
                planeInfo(plane);
            }
        }
    }

    @Override
    public Plane createPlane() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("\nCountry: ");
        String country = scanner.nextLine();
        System.out.print("\nYear: ");
        int year = scanner.nextInt();
        System.out.print("\nHours: ");
        int hours = scanner.nextInt();
        System.out.print("\nMilitary: ");
        boolean military = scanner.nextBoolean();
        System.out.print("\nWeight: ");
        int weight = scanner.nextInt();
        System.out.print("\nWingspan: ");
        int wingspan = scanner.nextInt();
        System.out.print("\ntopSpeed: ");
        int topSpeed = scanner.nextInt();
        System.out.print("\nSeats: ");
        int seats = scanner.nextInt();
        System.out.print("\nCost: ");
        int cost = scanner.nextInt();

        return new Plane(model, country, year, hours, military, weight, wingspan, topSpeed, seats, cost);
    }

}
