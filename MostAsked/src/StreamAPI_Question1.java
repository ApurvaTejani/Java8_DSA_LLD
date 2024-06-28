import java.util.*;
import java.util.stream.Collectors;

//EPAM- COMBINE ANIMAL & CITIES AND REMOVE/SKIP THE FRUITS, AND ANIMAL != SPARROW AND CITY! NEW YORK
//
//        Use JAVA- 8 STREAMS
//
//        - Cities should be distinct (if occur two times, remove entry) but Animal can be duplicates
//
//        - For cities length of city should be greater than 3 char
class StreamAPI_Question1 {
    public static void main(String[] args) {
        Map<String, List<String>> maps = new HashMap<>();
        List<String> animalList = Arrays.asList("Tiger", "Dog", "Cat", "Deer", "Monkey", "SPARROW", "Tiger", "Cat");
        List<String> fruitList = Arrays.asList("apple", "mango", "banana", "chiku");
        List<String> cities = Arrays.asList("Hyderabad", "Pune", "Mumbai", "New York", "Goa", "Chennai", "Pune");
        maps.put("Animals", animalList);
        maps.put("Fruits", fruitList);
        maps.put("Cities", cities);
        List<String> result = maps.entrySet().stream()
                .filter(map -> !map.getKey().contains("Fruits"))
                .flatMap(map -> map.getKey().equalsIgnoreCase("Cities")
                        ? map.getValue().stream().distinct().filter(c -> c.length() > 3)
                        : map.getValue().stream())
                .filter(animalString -> !animalString.contains("SPARROW"))
                .filter(cityString -> !cityString.contains("New York"))
                .collect(Collectors.toList());
        System.out.println(result);


    }
}

