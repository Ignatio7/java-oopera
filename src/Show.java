import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void printActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("No actors in this show.");
            return;
        }
        System.out.println("Actors in \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println(" - " + actor);
        }
        System.out.println();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Actor " + actor + " already exists in this show!");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(String surnameToReplace, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("Actor replaced.\n");
                return;
            }
        }
        System.out.println("No actor with surname \"" + surnameToReplace + "\" found.\n");
    }
}
