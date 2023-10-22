import java.util.Scanner;
public class repeatingStr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String test=sc.next();
        String newStr ="";
        
        for(int i=0;i<test.length();i++){
            
            for(int z=0;z<((test.length())/(i+1));z++){
                newStr+=test.substring(0,i+1);
                
            }
            if(newStr.equals(test)){
                System.out.println("The smallest repeating string is: "+test.substring(0,i+1));
                break;

            } else{System.out.println(newStr);}
            newStr="";
        }
        
    }
