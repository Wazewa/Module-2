package academy.mediasoft.team;

import java.math.BigDecimal;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Set<Car> setCars = new HashSet<>();

        setCars.add(new Car("WBA65921",
                "X5",
                "BMW",
                2002,
                239000,
                BigDecimal.valueOf(499999)));

        setCars.add(new Car("WBA65922",
                "X5",
                "BMW",
                2003,
                220000,
                BigDecimal.valueOf(500000)));

        setCars.add(new Car("WBA65923",
                "X5",
                "BMW",
                2004,
                220000,
                BigDecimal.valueOf(500000)));

        setCars.add(new Car("WBA65923",
                "X5",
                "BMW",
                2004,
                220000,
                BigDecimal.valueOf(500000)));

        List<Car> listCars = new ArrayList<>(setCars);

        Collections.sort(listCars);

        listCars.forEach(System.out::println);
    }
}
