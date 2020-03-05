import java.util.*;
import java.util.stream.Collectors;

public class HashTableCombo {
    private static Map<String, List<String>> menu;

    static {
        menu = new HashMap<>();
        menu.put("Starters", Arrays.asList("peas", "beans", "dips"));
        menu.put("Lunch", Arrays.asList("burrito", "sandwich", "salad", "pie"));
        menu.put("Dinner", Arrays.asList("pasta", "pizza", "casserole", "stew"));
    }

    private static Map<String, List<String>> available;

    static {
        available = new HashMap<>();
        available.put("Starters", Arrays.asList("peas", "beans"));
        available.put("Lunch", Arrays.asList("burrito", "salad", "pie"));
        available.put("Dinner", Arrays.asList("pasta", "stew"));
    }

    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("-----");
        System.out.println();

        System.out.println("Starters");
        getAvailableFor("Starters");
        System.out.println();
        System.out.println();

        System.out.println("Lunch");
        getAvailableFor("Lunch");
        System.out.println();
        System.out.println();

        System.out.println("Dinner");
        getAvailableFor("Dinner");
        System.out.println();
    }

    private static void getAvailableFor(String category) {
        List list = menu.get(category);

        String commaSeparated = list.stream().filter(s -> available.get(category).contains(s))
                .collect(Collectors.joining(", ")).toString();

        StringBuilder sb = new StringBuilder(commaSeparated);
        int lastIdx = sb.lastIndexOf(",");
        sb.replace(lastIdx, lastIdx + 1, " and");
        System.out.print(sb);
    }
}

/*
notes:

String.join(", ", list);

 */