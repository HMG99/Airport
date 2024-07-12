package model;

public class Plane {
    private String model;
    private String country;
    private int year = 1903;
    private int hours;
    private boolean isMilitary;
    private int weight = 10000;
    private int wingspan = 10;
    private int topSpeed;
    private int seats;
    private double cost;


    public Plane(String model, String country, int year, int hours, boolean isMilitary, int weight, int wingspan, int topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.isMilitary = isMilitary;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
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
            System.out.println("Year must be between 1903 and 2021");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 10000) {
            this.hours = hours;
        } else {
            System.out.println("Hours must be between 0 and 10000");
        }
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 10000 && weight <= 160000) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be between 10000KG and 160000KG");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 10 && wingspan <= 45) {
            this.wingspan = wingspan;
        } else {
            System.out.println("Wingspan must be between 10 and 45");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed >= 0 && topSpeed <= 1000) {
            this.topSpeed = topSpeed;
        } else {
            System.out.println("Top speed must be non negative value that is less than 1000km/h");
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats >= 0) {
            this.seats = seats;
        } else {
            System.out.println("seats number cannot be equal to negative number");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            System.out.println("Cost must be non negative value");
        }
    }

    public void printInfo() {
        System.out.println("Model: " + model);
        System.out.println("Country: " + country);
        System.out.println("Year: " + year);
        System.out.println("Hours: " + hours);
        System.out.println("Military: " + isMilitary);
        System.out.println("Weight: " + weight);
        System.out.println("Wingspan: " + wingspan);
        System.out.println("TopSpeed: " + topSpeed);
        System.out.println("Seats: " + seats);
        System.out.println("Cost: " + cost);
    }

}
