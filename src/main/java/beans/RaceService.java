package beans;

public interface RaceService {

    void addHorse(Horse horse);

    void initial();

    void choiceHorse();

    void toPrint();

    void printHorses();

    void startRace() throws InterruptedException;
}
