import java.util.*;
import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(50);
        list.add(153);
        list.add(123);
        List<Integer> temp = new ArrayList<>();
        for (int itVar : list)
        {
            if(itVar%2==0){
                temp.add(itVar);
        }
        }
        list.removeAll(temp);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(list.stream().mapToDouble(a->a).average());
    }
}