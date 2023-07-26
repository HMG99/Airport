package model;

public class Plane {

    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean military;
    private int weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    public Plane(String model, String country, int year, int hours, boolean military, int weight, int wingspan,
                 int topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        setYear(year);
        setHours(hours);
        this.military = military;
        setWeight(weight);
        setWingspan(wingspan);
        setTopSpeed(topSpeed);
        setSeats(seats);
        setCost(cost);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2021) {
            this.year = year;
        } else {
            System.out.println("Invalid year");
        }

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 10000) {
            this.hours = hours;
        } else {
            System.out.println("Invalid hours");
        }

    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 10000 && weight <= 160000) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 10 && wingspan <= 45) {
            this.wingspan = wingspan;
        } else {
            System.out.println("Invalid wingspan");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if(topSpeed >= 0 && topSpeed <= 1000) {
            this.topSpeed = topSpeed;
        }
        else {
            System.out.println("Invalid top speed");
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if(seats >= 0) {
            this.seats = seats;
        }
        else {
            System.out.println("Invalid seats number");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost >= 0) {
            this.cost = cost;
        }
        else {
            System.out.println("Invalid cost");
        }
    }
}
