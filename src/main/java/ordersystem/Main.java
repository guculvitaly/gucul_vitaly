package ordersystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by insomnia on 08.09.17.
 */
public class Main  {




    public static void main(String[] args) {



        List <PolishCuisines <String, Integer> > polishCuisinesList = new ArrayList<>();

        polishCuisinesList.add(new PolishCuisines<>("Bear", 25));
        polishCuisinesList.add(new PolishCuisines<>("MainCourse", 50));
        polishCuisinesList.add(new PolishCuisines<>("Dessert", 15));



        List <MexicanCuisines <String, Integer> > mexicanCuisinesList = new ArrayList<>();

        mexicanCuisinesList.add(new MexicanCuisines<>("Tea", 15));
        mexicanCuisinesList.add(new MexicanCuisines<>("MainCouse", 45));
        mexicanCuisinesList.add(new MexicanCuisines<>("Dessert", 25));

        //mexicanCuisinesList.forEach(x -> System.out.println("mexican : " + mexicanCuisinesList));

        Scanner in = new Scanner(System.in);

        System.out.println("Please choise cuisines: Italian, Mexican or Polish: " );



    }
}
