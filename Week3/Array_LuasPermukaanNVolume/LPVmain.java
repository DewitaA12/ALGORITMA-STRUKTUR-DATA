package Array_LuasPermukaanNVolume;
import java.util.Scanner;

public class LPVmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kerucut krc[] = new Kerucut[3];
        LimasSegi4 lim[] = new LimasSegi4[4];
        
        for (int i = 0; i<3, i++)
        {
            System.out.println("r kerucut : ");
            int rKerucut = sc.nextInt();
            System.out.println("sm kerucut : ");
            int smKerucut = sc.nextInt 
            krc[i] = new Kerucut (rKerucut, smKerucut);//bikin objek limas dan dimasukkan ke array nya index ke i
        }
    }
}
