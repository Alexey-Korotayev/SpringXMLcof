package beans;

import java.util.*;

public class RaceServiceImp implements RaceService{

    private int yourChoise;
    private Horse yourHorse;
    private Track track;
    private int step = 0;
    private int win = 0;

    static Random random = new Random();

    private List<Horse> horses = new ArrayList<Horse>();

    public RaceServiceImp() {
    }

    public RaceServiceImp(Track track) {
        this.track = track;
    }

    public void initial() {
        for (Horse hor:horses) {
            hor.setSpeed(hor.getSpeed()+random.nextInt(20)-10 );
            hor.setEndurance(hor.getEndurance()+random.nextInt(30)-20 );
        }
    }

    public void addHorse(Horse horse) {
        horse.setNumber(horses.size()+1);
        horses.add(horse);
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    public void choiceHorse() {
        //toPrint();
        System.out.println("You can choose one of the horses (1-"+horses.size()+")");
        Scanner scan = new Scanner(System.in);
        yourChoise = scan.nextInt();
        yourHorse = horses.get(yourChoise-1);
		System.out.println ("You choose; " + yourHorse.toStringShort());
    }

    public void startRace() throws InterruptedException {
        System.out.println("Стиарт гонки");
        while ( win == 0 ) {
            stepRace();
            Thread.sleep(1000);
        }
        System.out.println("Конец гонки");
    }

    private void stepRace() {
        step++;
        printTimePoint();
        horses.sort(Comparator.comparing(Horse::getPosition));
        for (Horse hor:horses) {
            hor.setPosition(hor.getPosition()+(hor.getSpeed()*hor.getEndurance()/100));
            hor.setEndurance(hor.getEndurance()-track.getDifficulty());
            if (hor.getEndurance() < 1) {
                hor.setEndurance(1);
            }
            System.out.println(hor.toStringPosition());
            if (hor.getPosition()> track.getLength()) {
                win = 1;
                printWinner(hor);
                break;
            }
        }
    }

    private void printWinner(Horse horse) {
        System.out.println("Winner: "+horse.toStringShort()+" !!! ");
        if (horse.getName().equals(yourHorse.getName())) {
            System.out.println("You won!!!");
        } else {
            System.out.println("You are a loser...");
        }
    }

    private void printTimePoint() {
        System.out.println("  Секунда: "+step);
    }

    public int getYourChoise() {
        return yourChoise;
    }

    public void setYourChoise(int yourChoise) {
        this.yourChoise = yourChoise;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public void printHorses() {
        System.out.println("--- Horses: ---");
        for (Horse hor:horses) {
            System.out.println(hor.toString());
        }
    }

    public void toPrint() {
        System.out.println("--- Race: ---");
        System.out.println(track.toString());
        printHorses();
        System.out.println("STEP "+step);
        System.out.println();
        return;
    }
}
