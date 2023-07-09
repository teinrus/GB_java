/*Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов. */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] fio = new String[]{"Иванов", "Петров",
                "Сидоров", "Иванько", "Немцев",
                "Рожнов", "Савлучинский", "Кравец"};
        Integer[] numbers = new Integer[]{1256256865, 123578963, 123412352, 2133214215, 123124512,
                123454657, 235473743, 235325552};
        Map<Integer, String> phonehash = new HashMap<>();
        for (int i = 0; i < fio.length; i++) {
            phonehash.put(numbers[i], fio[i]);
        }
        System.out.println(phonehash);
        System.out.println("");
        phonehash.entrySet().stream().sorted(Map.Entry.comparingByKey((o1, o2) -> o2 - o1)).forEach(System.out::println);

    }
}