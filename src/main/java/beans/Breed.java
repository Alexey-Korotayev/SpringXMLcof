package beans;

public class Breed {
    private String name;
    private int id;

    public Breed() {
    }

    public String getName() {
        return name;
    }

    public Breed(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Breed(String s) {
    }

    @Override
    public String toString() {
        return "Breed{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
