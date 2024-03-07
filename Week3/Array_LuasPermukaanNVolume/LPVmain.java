package Array_LuasPermukaanNVolume;
import java.util.Scanner;

public class LPVmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kerucut krc[] = new Kerucut[3];
        LimasSegi4 lim[] = new LimasSegi4[3];
        Bola bl[] = new Bola[3];
        
        for (int i = 0; i<3; i++)
        {
            System.out.print("Jari Kerucut Ke-" +(i + 1)+ " = ");
            int rKerucut = sc.nextInt();
            System.out.print("Sisi Miring Kerucut = ");
            int sKerucut = sc.nextInt();
            sc.nextLine(); 
            krc[i] = new Kerucut(rKerucut, sKerucut);

            System.out.print("Sisi Alas Limas Ke-" +(i + 1)+ " = ");
            int aLimas = sc.nextInt();
            System.out.print("Tinggi Limas = ");
            int tLimas = sc.nextInt();
            sc.nextLine(); 
            lim[i] = new LimasSegi4(aLimas, tLimas);
            
            System.out.print("Jari bola Ke-" +(i + 1)+ " = ");
            int rBola = sc.nextInt(); 
            bl[i] = new Bola(rBola);
            System.out.println( );

            
        }

        for(int i=0;i<3;i++){
            System.out.println("Volume kerucut ke-"+(i + 1)+" = "+krc[i].hitungVolumeKerucut());
            System.out.println("Luas kerucut ke-"+(i + 1)+" = "+krc[i].hitungLuasPermukaanKerucut());
            System.out.println("Volume limas ke-"+(i + 1)+" = "+lim[i].hitungVolumeLimasSegi4());
            System.out.println("Luas limas ke-"+(i + 1)+" = "+lim[i].hitungLuasPermukaanLimasSegi4());
            System.out.println("Volume Bola ke-"+(i + 1)+" = "+bl[i].hitungVolumeBola());
            System.out.println("Luas Bola ke-"+(i + 1)+" = "+bl[i].hitungLuasPermukaanBola());
        }
        sc.close();
        //volume kerucut terbesar
        /* double maxVol = krc[0].hitungVolumeKerucut();
        int maxVolIdx = 0;
        for(int i=1;i<3;i++){
            if(krc[i].hitungVolumeKerucut()>maxVol){
                maxVol = krc[i].hitungVolumeKerucut();
                maxVolIdx = i;
            }
        } 

        System.out.println("Max volume = "+maxVol);
        System.out.println("Jari-jari = "+krc[maxVolIdx].jari);
        System.out.println("Sisi miring = "+krc[maxVolIdx].sisiMiring);
        //volume terbesar melalui method
        maxVol(krc);
    }

    static void maxVol(Kerucut[] x){
        //volume kerucut terbesar
        double maxVol = x[0].hitungVolumeKerucut();
        int maxVolIdx = 0;
        for(int i=1;i<3;i++){
            if(x[i].hitungVolumeKerucut()>maxVol){
                maxVol = x[i].hitungVolumeKerucut();
                maxVolIdx = i;
            }
        }
        
        System.out.println("Max volume = "+maxVol);
        System.out.println("Jari-jari = "+x[maxVolIdx].jari);
        System.out.println("Sisi miring = "+x[maxVolIdx].sisiMiring); */
    }
}   
