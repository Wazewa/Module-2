package academy.mediasoft.team;

import java.util.*;

public class Task2 {
    static List<String> createListModel() {
        List<String> list = new ArrayList<>();

        list.add("Toyota RAV4");
        list.add("BMW X5");
        list.add("Peugeot 207");
        list.add("Lada Priora");
        list.add("VAZ 2110");
        list.add("Peugeot 207");
        list.add("Tesla Model S");
        list.add("Ford Sierra");
        list.add("VAZ 2110");

        return list;
    }

    static List<String> removingDuplicates(List<String> list) {
        List<String> uniqueModel = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for(String model: list) {
            if(!map.containsKey(model)) {
                map.put(model, 1);
                uniqueModel.add(model);
            }
        }

        return uniqueModel;
    }

    static void sortedModel(List<String> list) {
        list.sort(Comparator.reverseOrder());
    }

    static Set<String> convertToSet(List<String> list) {
        return new HashSet<>(list);
    }

    static void replaceTesla(Set<String> set) {
        List<String> teslaList = new ArrayList<>();

        for(String model: set) {
            if (model.contains("Tesla")) {
                teslaList.add(model);
            }
        }

        for(String model: teslaList) {
            set.remove(model);
            set.add("ELECTRO_CAR");
        }

    }
    static void main() {
        List<String> nameModel = createListModel();

        nameModel = removingDuplicates(nameModel);

        sortedModel(nameModel);

        nameModel.forEach(System.out::println);

        Set<String> setModel = convertToSet(nameModel);

        replaceTesla(setModel);

    }
}
