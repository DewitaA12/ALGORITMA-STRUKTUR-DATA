package Array_LuasPermukaanNVolume;

public class LimasSegi4 {
    public int sisiS4;
    public int tinggi;
   
public  LimasSegi4 (int sS4, int t)
{
    sisiS4 = sS4;
    tinggi = t;
}

double hitungLuasPermukaanLimasSegi4()
{
    double lp = 0;
    double luasAlas = sisiS4*sisiS4;
    double sisiMiring = Math.sqrt(Math.pow(tinggi,2)+
                        Math.pow(0.5*sisiS4,2));
    double luasSelimut = 4*(0.5*0.5*sisiS4*sisiMiring);
    lp = luasAlas+luasSelimut;
    return lp;
}

double hitungVolumeLimasSegi4()
{
    double vol = 0;
    double luasAlas = sisiS4*sisiS4;
    vol = 1.0/3.0*luasAlas*tinggi;
    return vol;
}

}
