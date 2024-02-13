package src.math;

public class NumratTek {

    public static void main(String[] args) {
        int []array = {2,3,5,4,6,3,345,36,4356,456,4,6,35,23,4,346,45,634,563,45,6,35,3,45,345,3,45,2,3,2,43,54,63,4};
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                System.out.println("Numri eshte cift: "+array[i]);
            }
            else{
                System.out.println("Numri eshte tek: " +array[i]);
            }
        }
    }
}
