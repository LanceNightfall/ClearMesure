import java.util.Scanner;

/**
 * Created by cdude on 5/11/2017.
 */
public class ClearMeasureCode {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("What number do you want to start on?");
        int countStart = kb.nextInt();
        System.out.println("What number do you want to end on?");
        int countEnd = kb.nextInt();
        System.out.println("What number do you want it to be divisible by>");
        int divNum = kb.nextInt();
        System.out.println("What do you want to word to be?");
        kb.nextLine();
        String modWord = kb.nextLine();
        if(countStart<countEnd && !modWord.isEmpty())
        {
        while (countStart <= countEnd) {
            if (countStart % divNum == 0) {
                System.out.println(modWord);
            } else if (countStart % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(countStart);
            }
            countStart++;
        }
        }
        else
        {
            System.out.println("There is a error with your numbers or your word.");
        }
    }
}
