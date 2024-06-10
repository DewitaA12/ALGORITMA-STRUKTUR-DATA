package Week12.DaftarFilm;

public class Film {
    private String id;
    private String judul;
    private double rating;
    private Film next;
    private Film prev;

    public Film(String id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public double getRating() {
        return rating;
    }

    public Film getNext() {
        return next;
    }

    public Film getPrev() {
        return prev;
    }

    public void setNext(Film next) {
        this.next = next;
    }

    public void setPrev(Film prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "ID \t: " + id + "\nJudul \t: " + judul + "\nRating \t: " + rating;
    }
}
