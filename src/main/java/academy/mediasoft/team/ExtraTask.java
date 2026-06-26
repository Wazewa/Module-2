package academy.mediasoft.team;

import java.math.BigDecimal;
import java.util.List;

public class ExtraTask {

    static void main() {
        CarDealership carDealership = new CarDealership(List.of(
                new Car("WBA65921",
                        "X5",
                        "BMW",
                        2002,
                        239000,
                        BigDecimal.valueOf(499999),
                        Type.SUV),

                new Car("SVG65693432",
                        "RAV4",
                        "Toyota",
                        1998,
                        67980,
                        BigDecimal.valueOf(399999),
                        Type.SUV),

                new Car("WBS213500346",
                        "M4",
                        "BMW",
                        2023,
                        200,
                        BigDecimal.valueOf(8999999),
                        Type.CABRIOLET),

                new Car("XTA211236555",
                        "2112",
                        "VAZ",
                        2001,
                        212000,
                        BigDecimal.valueOf(130000),
                        Type.HATCHBACK)

        ));

        carDealership.addCar(new Car("WBA65921",
                "X5",
                "BMW",
                2002,
                239000,
                BigDecimal.valueOf(499999),
                Type.SUV));

        System.out.println("Подзадача 1\n");
        System.out.println(carDealership);

        System.out.println("\nПодзадача 2\n");
        carDealership.findAllCarsByProducer("BMW").forEach(System.out::println);

        System.out.println("\nПодзадача 3\n");
        System.out.println(carDealership.findAveragePriceByTypeCar(Type.SUV));

        System.out.println("\nПодзадача 4\n");
        System.out.println(carDealership.getSortedByYearCars());

        System.out.println("\nПодзадача 5\n");
        carDealership.getStatistics();
    }
}
