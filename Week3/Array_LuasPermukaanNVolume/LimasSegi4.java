package Array_LuasPermukaanNVolume;

public class LimasSegi4 {
    public int sisiS4;
    public int tinggi;
    public int sisiM;

public  LimasSegi4 (int sS4, int t, int sM)
{
    sisiS4 = sS4;
    tinggi = t;
    sisiM  = sM;
}

public double hitungLuasPermukaanLimasSegi4()
{
 return (sisiS4*sisiS4)+(4*((0.5)*sisiS4*sisiM))*10;
}

public double hitungVolumeLimasSegi4()
{
 return (0.33)*(sisiS4*sisiS4)*tinggi;
}

}
