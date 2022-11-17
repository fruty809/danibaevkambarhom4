import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя : " );
            names.add(scanner.nextLine());
            System.out.println("Имя: "  + names.get(i) + ": A " + names);
        }

        ArrayList<String> names2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя : " );
            names.add(scanner.nextLine());
            System.out.println("Имя: "  + names2.get(i) + ": Имя " + names2);
        }


        ArrayList<String> namesC = new ArrayList<>();
        int namesS = 5;
        for (int i = 0; i < 5; i++) {
            namesC.add(names.get(i));
            namesS = namesS -1;
            namesC.add(names2.get(namesS));
        }
        System.out.println(namesC);
        Collections.sort(namesC, Comparator.comparing(String :: length));
        System.out.println(namesC);
    }
}
