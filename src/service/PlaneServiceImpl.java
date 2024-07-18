package service;

import model.Plane;

public class PlaneServiceImpl implements PlaneService {

    @Override
    public void task1(Plane plane) {
        System.out.println("Model: " + plane.getModel());
        System.out.println("Country: " + plane.getCountry());
        System.out.println("Year: " + plane.getYear());
        System.out.println("Hours: " + plane.getHours());
        System.out.println("Military: " + plane.isMilitary());
        System.out.println("Weight: " + plane.getWeight());
        System.out.println("Wingspan: " + plane.getWingspan());
        System.out.println("TopSpeed: " + plane.getTopSpeed());
        System.out.println("Seats: " + plane.getSeats());
        System.out.println("Cost: " + plane.getCost());
    }

    @Override
    public void task2(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println("Cost: " + plane.getCost());
            System.out.println("TopSpeed: " + plane.getTopSpeed());
        } else {
            System.out.println("Model: " + plane.getModel());
            System.out.println("Country: " + plane.getCountry());
        }
    }

    @Override
    public Plane task3(Plane p1, Plane p2) {
        return p1.getYear() >= p2.getYear() ? p1 : p2;
    }

    @Override
    public String task4(Plane p1, Plane p2) {
        return p1.getWingspan() > p2.getWingspan() ? p1.getModel() : p2.getModel();
    }

    @Override
    public void task5(Plane p1, Plane p2, Plane p3) {
        if (p1.getSeats() <= p2.getSeats() && p1.getSeats() <= p3.getSeats()) {
            System.out.println("Country with smallest seats count: " + p1.getCountry());
        } else if (p2.getSeats() < p1.getSeats() && p2.getSeats() <= p3.getSeats()) {
            System.out.println("Country with smallest seats count: " + p2.getCountry());
        } else {
            System.out.println("Country with smallest seats count: " + p3.getCountry());
        }
    }

    @Override
    public void task6(Plane[] planes) {
        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                task1(plane);
            }
        }
    }

    @Override
    public void task7(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.isMilitary() && plane.getHours() > 100) {
                task1(plane);
            }
        }
    }

    @Override
    public Plane task8(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() <= min.getWeight()) {
                min = planes[i];
            }
        }
        return min;
    }

    @Override
    public Plane task9(Plane[] planes) {
        Plane minCostPlane = null;

        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()) {

                if (minCostPlane == null) {
                    minCostPlane = planes[i];
                } else {
                    if (planes[i].getCost() < minCostPlane.getCost()) {
                        minCostPlane = planes[i];
                    }
                }

            }
        }

        return minCostPlane;
    }

    @Override
    public void task10(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            for (int j = 1; j < planes.length - i; j++) {
                if (planes[j].getYear() < planes[j - 1].getYear()) {
                    Plane temp = planes[j];
                    planes[j] = planes[j - 1];
                    planes[j - 1] = temp;
                }
            }
        }

        for (Plane plane : planes) {
            task1(plane);
        }
    }
}