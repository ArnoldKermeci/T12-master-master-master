package rs.aleph.android.example12.activities.model;

public class Jelo {

    private int id;
    private String image;
    private String name;
    private String description;
    private String category;
    Sastojci sastojci;
    private int calories;
    private float cena;

    public Jelo(String image, String name, String description, String category, Sastojci sastojci, int calories, float cena) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.category = category;
        this.sastojci = sastojci;
        this.calories = calories;
        this.cena = cena;
    }

    public int getId() {        return id;    }

    public String getImage() {        return image;    }

    public void setImage(String image) {        this.image = image;    }

    public String getName() {        return name;    }

    public void setName(String name) {        this.name = name;    }

    public String getDescription() {        return description;    }

    public void setDescription(String description) {        this.description = description;    }

    public String getCategory() {        return category;    }

    public void setCategory(String category) {        this.category = category;    }

    public Sastojci getSastojci() {        return sastojci;    }

    public void setSastojci(Sastojci sastojci) {        this.sastojci = sastojci;    }

    public int getCalories() {        return calories;    }

    public void setCalories(int calories) {        this.calories = calories;    }

    public float getCena() {        return cena;    }

    public void setCena(float cena) {        this.cena = cena;    }

    @Override
    public String toString() {
        return "Jelo{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", sastojci='" + sastojci + '\'' +
                ", calories=" + calories +
                ", cena=" + cena +
                '}';
    }
}
