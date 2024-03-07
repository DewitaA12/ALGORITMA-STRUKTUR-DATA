package Array_LuasPermukaanNVolume;

public class Bola {
    public int jari2;
    double phi = 3.14;

public  Bola (int r)
{
    jari2 = r;
}

public double hitungLuasPermukaanBola()
{
 double lp = 0;
 double luasAlas = phi*jari2*jari2;
 lp = 4*luasAlas;
 return lp;
}

public double hitungVolumeBola()
{
 double vol = 0;
 double luasAlas = phi*jari2*jari2;
 vol = (4.0/3.0)*luasAlas*jari2;
 return vol;
}
}
