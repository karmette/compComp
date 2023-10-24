import java.util.Scanner;
public class InfPirate {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int tests = s.nextInt();
        int fails = 0;
        for(int i = 0; i<tests+1; i++){
            
            String test = s.nextLine();
            boolean isVocab = true;
            
            for(int c = 0; c<test.length(); c++){
                String lowerChar = test.substring(c,c+1).toLowerCase();
                isVocab = InfPirate.testChar(lowerChar.charAt(0));
                if(!isVocab)
                    fails++;
            }
            
            
        }
        if(fails > 0){
                System.out.println("No");

            }else{
                System.out.println("Yes");
            }
    }

    public static boolean testChar(char e){
        if((e == 'a')||(e == 'r')||(e == 'g')||(e == 'h')||(e == ' ')||(e == 'm')||(e == 't')||(e == 'e')||(e == 'y')){
            return true;
        }else{
            return false;
        }
    }
}
