package academy.mediasoft.team;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    static List<Car> initializeListCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("WBA65921",
                "X5",
                "BMW",
                2002,
                39999,
                BigDecimal.valueOf(1200000)));

        list.add(new Car("WBA65922",
                "X5",
                "BMW",
                2003,
                23000,
                BigDecimal.valueOf(499999)));

        list.add(new Car("WBA65923",
                "X5",
                "BMW",
                2004,
                78900,
                BigDecimal.valueOf(15000000)));

        list.add(new Car("XTA2110364563",
                "2110",
                "VAZ",
                2000,
                24568,
                BigDecimal.valueOf(870000)));

        return list;
    }

    static void printMostExpensiveCars(int countCars, List<Car> list) {
        list.stream()
                .filter(x -> x.getMileage() < 50000)
                .sorted((o1, o2) -> o2.getPrice().compareTo(o1.getPrice()))
                .limit(countCars)
                .forEach(System.out::println);
    }

    static double findAverageMileage(List<Car> list) {
        Optional<Double> average = list.stream()
                .map(x -> x.getMileage() / list.size())
                .reduce(Double::sum);
        return average.orElse(0.0);
    }

    static Map<String, List<Car>> groupingToMap(List<Car> list) {

        return list.stream()
                .collect(Collectors.groupingBy(Car::getProducer));
    }

    static void main() {
        List<Car> listCars = initializeListCars();

        int countCars = 3;

        printMostExpensiveCars(countCars, listCars);

        double average = findAverageMileage(listCars);

        System.out.println(average);

        System.out.println(groupingToMap(listCars));
    }
}
