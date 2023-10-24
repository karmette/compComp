// SLHS 2023 Kickoff
// Cannonball Run
// Status: Works

import java.util.Scanner;
public class Cannon {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int tests = s.nextInt();
        for(int i = 0; i < tests; i++){
            int cannons = s.nextInt();
            int max = s.nextInt();
            int needed = 0;
            for(int c = 0; c<cannons; c++){
                needed += max-s.nextInt();
            }
            double cost = s.nextInt();
            double hasStock = s.nextInt();
            double stock = Math.ceil(needed/hasStock);
            System.out.println((int)(cost*stock) + " coins");
        }
    }
}
