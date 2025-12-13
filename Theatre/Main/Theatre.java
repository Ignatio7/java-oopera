package Main;

import People.*;
import Shows.*;

public class Theatre {
    public static void main(String[] args) {

        Actor a1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor a2 = new Actor("Анна", "Смирнова", Gender.FEMALE, 165);
        Actor a3 = new Actor("Ольга", "Кузнецова", Gender.FEMALE, 170);

        Director d1 = new Director("Сергей", "Иванов", Gender.MALE, 10);
        Director d2 = new Director("Елена", "Волкова", Gender.FEMALE, 7);

        Show drama = new Show("Гамлет", 120, d1);

        Opera opera = new Opera(
                "Травиата", 150, d2,
                "Джузеппе Верди",
                "История о любви и трагедии.",
                40
        );

        Ballet ballet = new Ballet(
                "Лебединое озеро", 140, d1,
                "П. И. Чайковский",
                "Сказочный балет с трагическим финалом.",
                "Мариус Петипа"
        );

        drama.addActor(a1);
        drama.addActor(a2);
        drama.addActor(a2); // проверка equals

        opera.addActor(a2);
        opera.addActor(a3);

        ballet.addActor(a1);
        ballet.addActor(a3);

        drama.printActors();
        opera.printActors();
        ballet.printActors();

        drama.printDirector();
        opera.printDirector();
        ballet.printDirector();

        drama.replaceActor("Смирнова", a3);
        drama.printActors();

        opera.printLibretto();
        ballet.printLibretto();

        System.out.println(opera);
        System.out.println(ballet);
    }
}