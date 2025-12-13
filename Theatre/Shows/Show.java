package Shows;

import People.Actor;
import People.Director;

import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printDirector() {
        System.out.println("Режиссёр спектакля \"" + title + "\": " + director);
    }

    public void printActors() {
        System.out.println("\nАктёры спектакля \"" + title + "\":");
        if (listOfActors.isEmpty()) {
            System.out.println(" (актёров нет)");
            return;
        }
        for (Actor actor : listOfActors) {
            System.out.println(" - " + actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле!");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр с фамилией \"" + surname + "\" заменён.");
                return;
            }
        }
        System.out.println("Актёр с фамилией \"" + surname + "\" не найден.");
    }
}