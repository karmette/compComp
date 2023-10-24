// SLHS 2023 Kickoff
// Message in a Bottle
// Status: Definetely doesn't work

import java.util.Scanner;
public class MessageBottle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String correct = s.nextLine();
        int tests = s.nextInt();
        int[] results = new int[tests];
        for(int i = 0; i<tests; i++){
            
            String testString = s.nextLine();
            String[] testArray = new String[correct.length()-1];

            int cursor = 0;

            while(cursor < testArray.length){
                String testChar = testString.substring(cursor, cursor+1);
                if(testChar.equals("#")){

                    cursor--;

                }else{
                    testArray[cursor] = testChar;
                }
            }
            
        }
    }
}
