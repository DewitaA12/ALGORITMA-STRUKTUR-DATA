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
 return 4*phi*jari2*jari2;
}

public double hitungVolumeKerucut()
{
 return (4.0/3.0)*phi*jari2*jari2*jari2;
}
}
