package chapter7_arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays_LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args){
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i=0; i<LENGTH; i++){
            int randomNumber;
            /*
             * Generate random number then search,
             * to make sure it doesn't already exist in the array.
             * If it does, regenerate & search again.
             */
            //Sequential Search in Array
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) +1;
            }while (search(ticket, randomNumber));
            // Number is unique if we get here. Add it to the array.
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return True if found, False if not
     */
    public static boolean search(int[] array, int numberToSearchFor){

        /*
         * This is called an enhanced loop.
         * It iterates through 'array' and search time assigns the current element to 'value'.
         */
        for (int value : array){
            if (value == numberToSearchFor){
                return true;
            }
        }
        /*
         * If we've reached this point, then the entire array was searched,
         * and the value was not found;
         */
        return false;
    }

    //Binary Search in Array
    public static boolean binarySearch(int[] array, int numberToSearchFor){

        //Array must be sorted first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index >= 0){
            return true;
        }
        else return false;
    }

    public static void printTicket(int ticket[]){
        for (int i=0; i<LENGTH; i++){
            System.out.println(ticket[i] + " ");
        }

    }
}
