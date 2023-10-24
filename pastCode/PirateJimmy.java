import java.util.Scanner;

public class PirateJimmy{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        if(input.toLowerCase().equals("gold coin"))
            System.out.println("yes");
        else
            System.out.println("no");

    }
}