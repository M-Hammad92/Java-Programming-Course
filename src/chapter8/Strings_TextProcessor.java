package chapter8;

public class Strings_TextProcessor {

    public static void main(String[] args){
        //countWords("I Test Automation");
        //reverseString("Hello People");
        addSpaces("HeyWorld!It'sMeHammad");
    }

    /**
     * Splits a string into an array by tokenizing it.
     * Count words & prints them.
     * @param text Full string to be split
     */
    public static void countWords(String text){
        String[] words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }

    public static void reverseString(String text){
        for (int i=text.length()-1; i>=0; i--){
            System.out.println(text.charAt(i));
        }
    }

    /**
     * Add spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){
        StringBuilder modifiedText = new StringBuilder(text);

        for (int i=0; i<modifiedText.length(); i++){
            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);

    }
}
