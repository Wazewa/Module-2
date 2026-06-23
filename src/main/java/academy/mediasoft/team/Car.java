package academy.mediasoft.team;

import java.math.BigDecimal;
import java.util.Objects;

public class Car implements Comparable<Car> {
    private String VIN;
    private String model;
    private String producer;
    private int yearProduction;
    private double mileage;
    private BigDecimal price;

    public Car() {}

    public Car (String VIN, String model, String producer, int yearProduction, double mileage, BigDecimal price) {
        this.VIN = VIN;
        this.model = model;
        this.producer = producer;
        this.yearProduction = yearProduction;
        this.mileage = mileage;
        this.price = price;
    }

    public String getVIN() {
        return VIN;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public double getMileage() {
        return mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(VIN);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return this.VIN.equals(car.getVIN());
    }

    @Override
    public String toString() {
        return "VIN-номер: " + VIN
                + "\n Марка: " + producer
                + "\n Модель: " + model
                + "\n Год выпуска: " + yearProduction
                + "\n Пробег: " + mileage
                + "\n Цена: " + price;
    }

    @Override
    public int compareTo(Car o) {
        if(yearProduction < o.yearProduction) {
            return 1;
        }
        else if(yearProduction > o.yearProduction) {
            return -1;
        }
        return 0;
    }
}
