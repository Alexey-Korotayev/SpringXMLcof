package beanDefinition;

import beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class RaceTrack {
    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
/*
        Breed breed1 = context.getBean("breed1",Breed.class);
        System.out.println(breed1.toString());
        Breed breed2 = context.getBean("breed2",Breed.class);
        System.out.println(breed2.toString());
*/

        RaceService race  = context.getBean("race", RaceServiceImp.class);
        Horse horse1 = (Horse)context.getBean("horse1");
        race.addHorse(horse1);

/*        System.out.println(horse1.toString());
        horse1.setSpeed(horse1.getSpeed()+random.nextInt(20)-10 );
        System.out.println(horse1.toString());
*/
        Horse horse2 = context.getBean("horse2", Horse.class);
        race.addHorse(horse2);
/*
        System.out.println(horse2.toString());
        horse2.setSpeed(horse2.getSpeed()+random.nextInt(20)-10);
        horse2.setEndurance(horse2.getEndurance()+random.nextInt(30)-15);
        System.out.println(horse2.toString());
*/
        Horse horse3 = context.getBean("horse3", Horse.class);
        race.addHorse(horse3);
        /*
        System.out.println(horse3.toString());
        horse3.setSpeed(horse3.getSpeed()+random.nextInt(20)-10);
        System.out.println(horse3.toString());
        System.out.println(horse3.toStringShort());
        System.out.println(horse3.toStringPosition());
*/

        race.toPrint();
        race.initial();
        //race.toPrint();
        race.choiceHorse();
        race.startRace();

    }
}


