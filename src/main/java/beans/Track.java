package beans;

import java.util.Random;

public class Track {
    private String name;
    private int length;
    private int difficulty;

    private Random random = new Random();

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
        difficulty = random.nextInt(4)+1;
    }

    public Track() {
        difficulty = random.nextInt(4)+1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", difficulty=" + difficulty +
                '}';
    }
}
