package src.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class tst {
    public static void main(String[] args) {
        listInt();
        listString();
    }

    public static void listString(){
        List<String> emrat = new ArrayList<>();

        //emra e klases
        emrat.add("Yllin");
        emrat.add("Kastrioti");
        emrat.add("vetoni");
        System.out.println(emrat.get(2));
        System.out.println("Gjateisa: "+emrat.size());
        System.out.println("Antari i pare : "+emrat.getFirst());
        System.out.println("Antari i pare : "+emrat.getLast());
        emrat.remove(1);
        System.out.println(emrat);
    }

    public static void listInt(){
        List<Integer> mosha = new ArrayList<>();

        //SHTIMI I VLERABVE
        mosha.add(25);
        mosha.add(15);
        mosha.add(45);
        mosha.add(65);
//        System.out.println(mosha);
        for (int i = 0; i < mosha.toArray().length; i++) {
            System.out.println(mosha.toArray()[i]);
        }


    }
}
