package academy.mediasoft.team;

import java.util.*;
import java.util.stream.Collectors;

public class CarDealership {
    private final List<Car> listCars;

    public CarDealership(List<Car> listCars) {
        this.listCars = new ArrayList<>(listCars);
    }

    public void addCar(Car car) {
        if(!listCars.contains(car)){
            listCars.add(car);
        }
    }

    public List<Car> findAllCarsByProducer(String producer) {
        return listCars.stream()
                .filter(x -> x.getProducer().equals(producer))
                .toList();
    }

    public double findAveragePriceByTypeCar(Type type) {
        return listCars.stream()
                .filter(x -> x.getType().equals(type))
                .map(x -> x.getPrice().doubleValue() / listCars.size())
                .reduce(Double::sum).orElse(0.0);

    }

    public List<Car> getSortedByYearCars() {
        return listCars.stream()
                .sorted(Comparator.comparingInt(Car::getYearProduction))
                .toList().reversed();
    }

    public void getStatistics() {
        System.out.println("СТАТИСТИКА\n");

        System.out.println("ТИПЫ МАШИН И ИХ КОЛИЧЕСТВО:\n");
        getCarsByTypeAndCount();

        getOldestAndNewestCars();
    }

    @Override
    public String toString() {
        return listCars.toString();
    }

    private void getCarsByTypeAndCount() {
        Map<Type, Integer> map = new HashMap<>();
        for(Car c: listCars) {
            map.put(c.getType(), map.getOrDefault(c.getType(),0) + 1);
        }

        for(Type k: map.keySet()) {
            System.out.println("Тип: " + k + ", Число авто данного типа: " + map.get(k));
        }
    }

    private void getOldestAndNewestCars() {
        List<Car> list = getSortedByYearCars();

        System.out.println("\nСАМАЯ НОВАЯ МАШИНА:\n" + list.getFirst());

        System.out.println("\nСАМАЯ СТАРАЯ МАШИНА:\n" + list.getLast());

    }
}
