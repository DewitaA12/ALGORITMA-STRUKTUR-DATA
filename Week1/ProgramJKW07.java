public class ProgramJKW07 {
    
    double kecepatan, jarak, waktu;

    public ProgramJKW07(double v, double s, double t){
        kecepatan = v;
        jarak = s;
        waktu = t;
    }

    double hitungKecepatan(){
        return jarak / waktu;
    }

    double hitungJarak(){
        return kecepatan * waktu;
    }

    double hitungWaktu(){
        return jarak / kecepatan;
    }

}
