package src.arrayLists;

import java.util.ArrayList;

public class tst {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //Shtimi i antarve ne ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        //Iterrimi ne list
        for(String fruts :list){
            System.out.println(fruts);
        }

        //Modifikimi i antareve ne list
        list.set(1,"Grapes");

        //Largimi i nje antari nga ArrayLista
        list.remove(2);
        System.out.println("Gjatesina: "+ list.toArray().length);
    }
}
