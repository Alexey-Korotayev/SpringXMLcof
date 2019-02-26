package beans;

public class Horse {
    private String name;
    private int endurance;
    private int speed;
    private Breed breed;
    private int position;
    private int number;

    public Horse(String name, int endurance, int speed) {
        this.name = name;
        this.endurance = endurance;
        this.speed = speed;
    }

    public Horse(String name, int endurance, int speed, Breed breed) {
        this.name = name;
        this.endurance = endurance;
        this.speed = speed;
        this.breed = breed;
    }

    public Horse() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String toStringShort() {
        return "Horse: " + name;
    }

    public String toStringPosition() {
        return number +
                ": name='" + name + '\'' +
                ", endurance=" + endurance +
                ", speed=" + speed +
                ", position=" + position +
                '}';
    }

    @Override
    public String toString() {
        return "Horse{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", endurance=" + endurance +
                ", speed=" + speed +
                ", breed=" + breed.getName() +
                ", position=" + position +
                '}';
    }
}
