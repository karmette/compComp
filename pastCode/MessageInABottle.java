// Made by my mom lol


import java.util.Scanner;
public class MessageInABottle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String exactMessage = s.nextLine();
        String[] exactMessageArray = exactMessage.split("");

        int writers = Integer.parseInt(s.nextLine());;
        double[] allWriterSpeed = new double[writers];
        double maxSpeed = 0;

        for(int i = 0; i < writers; i++){
            String writerString = s.nextLine();
            int writerTime = Integer.parseInt(s.nextLine());
//            allWriterSpeed[i] = wordsPerMin(exactMessageArray, writerString, writerTime);
            allWriterSpeed[i] = wordsPerMin(exactMessage, writerString, writerTime);
            if (allWriterSpeed[i] > maxSpeed){
                maxSpeed = allWriterSpeed[i];
            }
        }

        s.close();
        for (int i = 0; i<writers; i++){
            System.out.println(allWriterSpeed[i]);
        }
        System.out.print("The highest pirate words per minute is ");
        System.out.printf("%.2f\n", maxSpeed);


    }
    public static double wordsPerMin(String[] correctArray, String typedString, int speed){
        String[] typedArray = typedString.split("");
        int cursor = 0;
        String[] finalArray = typedString.split("");
        for(int l = 0; l < typedArray.length; l++){
            if(typedArray[l].equals("#")) {
                cursor = cursor -1;
                if (cursor<0) cursor = 0;
            }else{
                finalArray[cursor] = typedArray[l];
                cursor++;
//                System.out.println(cursor);
            }
        }

        int correctWords = 0;
        for(int j = 0; j < cursor; j++){
            if (j >= correctArray.length){ 
                break;
            }
            if (finalArray[j].equals(correctArray[j])){
//                System.out.println(finalArray[j]);
                correctWords++;
            }
        }
        //System.out.println(correctWords);
        return (double) (correctWords/5)/(speed/60);
    }

    public static double wordsPerMin(String exactMessage, String writerString, int speed){
        int startIndex = 0;


        while (writerString.indexOf("#", startIndex)!=-1){
            int eraseIndex = writerString.indexOf("#", startIndex);
            writerString = writerString.substring(startIndex, eraseIndex-1) + writerString.substring(eraseIndex+1);
        }

        int correctWords = 0;
        String[] finalArray = writerString.split("");
        String[] correctArray = exactMessage.split("");
        for(int j = 0; j < finalArray.length; j++){
            if (j >= correctArray.length){
                break;
            }
            if (finalArray[j].equals(correctArray[j])){
//                System.out.println(finalArray[j]);
                correctWords++;
            }
        }
        return (double) correctWords*60/(5*speed);
    }
}
