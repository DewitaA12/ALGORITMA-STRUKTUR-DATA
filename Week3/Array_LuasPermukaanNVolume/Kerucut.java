package Array_LuasPermukaanNVolume;

public class Kerucut {
    public int jari;
    public int sisiMiring;
    public int tinggi;
    double phi = 3.14;

public  Kerucut (int r, int s, int t)
{
    jari = r;
    sisiMiring = s;
    tinggi = t;
}

public double hitungLuasPermukaanKerucut()
{
 return phi*jari*(sisiMiring+jari);
}

public double hitungVolumeKerucut()
{
 double vol = 0;
 vol = (1.0/3.0)*phi*jari*jari*tinggi;
 return vol;
}

}
