package rs.aleph.android.example12.activities.model;

public class Sastojci {
    public int id;
    public String Naziv;

    public Sastojci(String naziv) {
        Naziv = naziv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return Naziv;
    }

    public void setNaziv(String naziv) {
        Naziv = naziv;
    }

    @Override
    public String toString() {
        return "Sastojci{" +
                "id=" + id +
                ", Naziv='" + Naziv + '\'' +
                '}';
    }
}
