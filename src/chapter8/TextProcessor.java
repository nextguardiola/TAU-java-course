package chapter8;

public class TextProcessor {

    public static void main(String[] args) {
        //countWords("I love Test Automation University");
        //countWords("avacado");
        //reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'sMeAngie");
    }

    /**
     * Splits a string into an array by tokenizing it
     * Count words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text){
        //var words = text.split(" ");
        var words = text.split("a");
        int numberOfWords = words.length;

        String message = String.format("Your string contains %d words:", numberOfWords);
        System.out.println(message);

        for(int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a string in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text){
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }

    }

    /**
     * Add spaces before each upper case letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){

        var modifiedText = new StringBuilder(text);

        for(int i=0; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }
}
