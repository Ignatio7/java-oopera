public class Actor extends Person {
    private final int height; // рост актёра в сантиметрах

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + getHeight() + " см)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor actor)) return false;
        return height == actor.height &&
                name.equals(actor.name) &&
                surname.equals(actor.surname);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode() + height;
    }
}