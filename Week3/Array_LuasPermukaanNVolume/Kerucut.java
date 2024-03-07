package Array_LuasPermukaanNVolume;

public class Kerucut {
    public int jari;
    public int sisiMiring;
    double phi = 3.14;

public  Kerucut (int r, int s)
{
    jari = r;
    sisiMiring = s;
    
}

public double hitungLuasPermukaanKerucut()
{
    double lp = 0 ;
    lp = phi*jari*(sisiMiring+jari);
    return lp;
}

public double hitungVolumeKerucut()
{
 double vol = 0;
 double luasAlas = phi*jari*jari;
 double tinggi = Math.sqrt(Math.pow(sisiMiring, 2)-
                Math.pow(jari, 2));
 vol = (1.0/3.0)*luasAlas*tinggi;
 return vol;
}

}
