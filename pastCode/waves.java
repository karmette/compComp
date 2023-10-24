// SLHS 2023 Kickoff
// We're In For Some Chop!
// Status: Works

import java.util.Scanner;
public class waves {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int tests = s.nextInt();
        for(int i = 0; i < tests; i++){
            int waves = s.nextInt();
            int[] waveHeights = new int[waves];
            int peaks = 0;
            for(int w = 0; w < waves; w++){
                int wH = s.nextInt();
                waveHeights[w] = wH;
            }
            for(int l = 1; l < waves-1; l++){
                if((waveHeights[l-1] < waveHeights[l]) && (waveHeights[l + 1] < waveHeights[l])){
                    peaks++;
                }
            }
            System.out.println(peaks);
        }
    }
}
