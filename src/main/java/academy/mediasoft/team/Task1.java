package academy.mediasoft.team;

import java.util.Random;

public class Task1 {
    static int[] createdArrayOfProductionYear(int count) {
        Random rnd = new Random();

        int[] arr = new int[count];

        int minYear = 2000;
        int maxYear = 2025;

        for(int i = 0; i < count; i++) {
            arr[i] = rnd.nextInt(minYear, maxYear);
        }

        return arr;
    }

    static void printCarsAfterYear(int yearOfProduction, int[] arr) {
        for(int year: arr) {
            if(year > yearOfProduction) {
                System.out.println(year);
            }
        }
    }

    static void getAverageAge(int count, int[] arr) {
        double averageAge = 0.0;

        int currentYear = 2026;

        for(int model: arr) {
            averageAge += currentYear - model;
        }
        averageAge /= count;

        System.out.println("Средний возраст равен: " + averageAge);
    }

    static void main() {
        int count = 50;

        int[] arr = createdArrayOfProductionYear(count);

        int yearOfProduction = 2015;

        printCarsAfterYear(yearOfProduction, arr);

        getAverageAge(count, arr);

    }
}
