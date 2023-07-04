import java.awt.*;
import java.security.Key;
import java.util.*;

public class Seminar_4 {
    static Scanner scanner;
    static ArrayList<String> namesandages = new ArrayList<>();

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ArrayList<String> fio = new ArrayList<>();

        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> sex = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
        while (true) {
            System.out.println("Введите отчество -> ");
            fio.add(scanner.nextLine());
            System.out.println("Введите возраст -> ");
            age.add(Integer.valueOf(scanner.nextLine()));
            System.out.println("Введите пол -> ");
            sex.add(scanner.nextLine());
            id.add(sex.size()-1);
            System.out.println("Продолжить ввод да/нет? -> ");
            String tmp = scanner.nextLine();
            if (tmp.toLowerCase().contains("нет")) break;
        }
        for (int i = 0; i < fio.size(); i++) {
            String[] tmp= fio.get(i).split(" ");
            System.out.println(tmp[0]+ " "+ tmp[1].toUpperCase().charAt(0)+"."+ tmp[1].toUpperCase().charAt(0)+"."+" "+age.get(i)+" "+(sex.get(i)));
        }

        System.out.println("Сортировать по возрасту да/нет? -> ");
        String tmp = scanner.nextLine();
        if (tmp.toLowerCase().contains("да")){
            id.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {

                    return age.get(o1)-age.get(o2);
                }



            });
            id.sort(new Comparator<Integer>() {
                @Override


                public int compare(Integer o1, Integer o2) {
                    if (sex.get(o1).equals("ж") && (sex.get(o2).equals("ж"))){
                        return 0;
                    };
                    if (sex.get(o1).equals("м") && (sex.get(o2).equals("м"))){
                        return 0;
                    };
                    if (sex.get(o1).equals("м") && (sex.get(o2).equals("ж"))){
                        return -1;
                    };


                    return 1;
                }

            });

            for (int i = 0; i < id.size(); i++) {
                System.out.println(fio.get(id.get(i)).split(" ")[0]+" "
                        +fio.get(id.get(i)).split(" ")[1].toUpperCase().charAt(0)+"."
                        +fio.get(id.get(i)).split(" ")[2].toUpperCase().charAt(0) +"."
                        +" "+age.get(id.get(i))+" "+(sex.get(id.get(i))));
            }


        }





    }
}