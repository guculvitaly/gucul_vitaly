package ordersystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by insomnia on 08.09.17.
 */
public class Main {


    public static void main(String[] args) {

        /*
        *Create Polish Cuisines and main course
        */
        List <GenericMainCourse<String, Integer>> polish = new ArrayList();

        polish.add(new GenericMainCourse("Soup", 25));
        polish.add(new GenericMainCourse("Milk", 15));
        polish.add(new GenericMainCourse("Bread", 5));

        /*
        *Add dessert for polish
        */
        List <GenericMainCourse<String, Integer>> polishDessert = new ArrayList();
        polishDessert.add(new GenericMainCourse("dessert1", 40));
        polishDessert.add(new GenericMainCourse("desser2", 10));
        polishDessert.add(new GenericMainCourse("dessert3", 20));

        /**
         * Create Italian Cuisines and main course
         */
        List <GenericMainCourse<String, Integer>> italian = new ArrayList();
        italian.add(new GenericMainCourse("pizza", 50));
        italian.add(new GenericMainCourse("coffe", 30));
        italian.add(new GenericMainCourse("pizza", 20));

        /**
         * Add dessert for Italian
         */
        List <GenericMainCourse<String, Integer>> italianDessert = new ArrayList();
        italianDessert.add(new GenericMainCourse("dessert1", 40));
        italianDessert.add(new GenericMainCourse("desser2", 10));
        italianDessert.add(new GenericMainCourse("dessert3", 20));

        /**
         * Create Mexican Cuisines and main course
         */
        List <GenericMainCourse<String, Integer>> mexican = new ArrayList();
        mexican.add(new GenericMainCourse("tea", 50));
        mexican.add(new GenericMainCourse("soup", 30));
        mexican.add(new GenericMainCourse("cake", 20));

        /**
         * Add dessert for Mexican
         */
        List <GenericMainCourse<String, Integer>> mexicanDessert = new ArrayList();
        mexicanDessert.add(new GenericMainCourse("dessert1", 40));
        mexicanDessert.add(new GenericMainCourse("desser2", 10));
        mexicanDessert.add(new GenericMainCourse("dessert3", 20));

        /**
         * Use scanner for our cuisines and desserts
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleace choice kitchen (polish, italian or mexican ) : ");
        String cous = scanner.nextLine();

        switch (cous){
            case "polish" :
                System.out.println("your choice " + polish);

            case "dessert" :
                System.out.println("Would you like order dessert? yes or no? : " );
                cous = scanner.nextLine();
            if (cous.equalsIgnoreCase("yes")){
                System.out.println("your dessert " + polishDessert);
            }
                break;


            case "italian" :
                System.out.println("your choice " + italian);

            case "dessert2" :
                System.out.println("Would you like order dessert? yes or no? : " );
                cous = scanner.nextLine();
                if (cous.equalsIgnoreCase("yes")) {
                    System.out.println("your dessert " + italianDessert);
                }
                    break;
            case "mexican" :
                System.out.println("you choice " + mexican);

            case "dessert3" :
                System.out.println("Would you like order dessert? yes or no? : " );
                cous = scanner.nextLine();
                if (cous.equalsIgnoreCase("yes")) {
                    System.out.println("your dessert : " + mexicanDessert);
                }
                    break;
        }


}
}
