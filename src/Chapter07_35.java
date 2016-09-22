import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by scott_000 on 9/20/2016.
 */
public class Chapter07_35 {
    public static void main(String[] args) {
        String[] wordsArray = {"bells", "jingle", "santa", "snow", "chestnut"};


        //Randomly choose a word
        int random = new Random().nextInt(wordsArray.length);
        //System.out.println(wordsArray[random]);
        String randomWord = wordsArray[random];
        char[] charArray = randomWord.toCharArray();
        char[] answerArray = new char[randomWord.length()];
        starAnswerArray(answerArray, charArray);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String ltr = input.next();
        char c = ltr.charAt(0);
        checkCharacter(charArray, answerArray, c);

        guessChar(charArray, answerArray, c);


        int miss = 0;

        //compare the character to each letter in the word
        checkCharacter(charArray, answerArray, c);

    }

    //fill answer array with stars
    public static void starAnswerArray(char[] answerArray, char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            answerArray[i] = '*';
        }
        System.out.println(answerArray);
    }


    //Check character against string

    public static void checkCharacter(char[] charArray, char[] answerArray, char c) {
        int miss = 0;
        for (int i = 0; i < charArray.length; i++) {//compare character to each character in randomWord
            if (charArray[i] == c) {
                answerArray[i] = c;
                System.out.print(answerArray);
                //guessChar(charArray, answerArray, c);
            } else
                miss = miss + 1;
            //guessChar(charArray, answerArray, c);

        }
        guessChar(charArray, answerArray, c);
    }


    public static void guessChar(char[] charArray, char[] answerArray, char c) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a letter: ");
        String ltr = input.next();
        c = ltr.charAt(0);
        checkCharacter(charArray, answerArray, c);

    }

}