import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

public class task2 {
    public static void main(String[] args) {
        Map<String, String> staff = new HashMap<>();
        staff.put("Иванов", "Иван");
        staff.put("Петрова", "Светлана");
        staff.put("Белова", "Кристина");
        staff.put("Мусина", "Анна");
        staff.put("Крутова", "Анна");
        staff.put("Юрин", "Иван");
        staff.put("Лыков", "Петр");
        staff.put("Чернов", "Павел");
        staff.put("Чернышов", "Петр");
        staff.put("Федорова", "Мария");
        staff.put("Светлова", "Марина");
        staff.put("Савина", "Мария");
        staff.put("Рыкова", "Мария");
        staff.put("Лугова", "Марина");
        staff.put("Владимирова", "Анна");
        staff.put("Мечников", "Иван");
        staff.put("Петин", "Петр");
        staff.put("Ежов", "Иван");
        System.out.println("Полный список сотрудников: "+staff+"\n");

        Map<String, Integer> doubleStaff = new TreeMap<>();
        for (String name : staff.values()) {
            if (!doubleStaff.containsKey(name)) {
                if (Collections.frequency(staff.values(), name) > 1) {
                    doubleStaff.put(name, Collections.frequency(staff.values(), name));
                }
            }
        }System.out.println("Список повторяющихся имен: "+doubleStaff+"\n");
        
        Map<String, Integer> sortedStaff = doubleStaff.entrySet().stream() 
        .sorted(Comparator.comparingInt(e -> -e.getValue())) 
        .collect(Collectors.toMap( 
        Map.Entry::getKey, 
        Map.Entry::getValue, 
        (a, b) -> { throw new AssertionError(); }, 
        LinkedHashMap::new 
        )); 
        
        sortedStaff.entrySet().forEach(System.out::println);
        }
    }

