public class Theatre {
    public static void main(String[] args) {

        // ===== Создание актёров =====
        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor actor2 = new Actor("Анна", "Смирнова", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Ольга", "Кузнецова", Gender.FEMALE, 170);

        // ===== Создание режиссёров =====
        Director director1 = new Director("Сергей", "Иванов",
                Gender.MALE, 10);
        Director director2 = new Director("Елена", "Волкова",
                Gender.FEMALE, 7);

        // ===== Создание спектаклей =====
        Show drama = new Show("Гамлет", 120, director1);

        Opera opera = new Opera(
                "Травиата",
                150,
                director2,
                "Джузеппе Верди",
                "История о любви и трагедии.",
                40
        );

        Ballet ballet = new Ballet(
                "Лебединое озеро",
                140,
                director1,
                "П.И. Чайковский",
                "Сказочный балет с трагическим финалом.",
                "Мариус Петипа"
        );

        // ===== Добавление актёров =====
        drama.addActor(actor1);
        drama.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        // Дубликат для проверки equals/hashCode
        drama.addActor(actor2);  // Должно показать предупреждение

        // ===== Вывод списка актёров =====
        System.out.println("\n=== Состав актёров ===");
        drama.printActors();
        opera.printActors();
        ballet.printActors();

        // ===== Вывод режиссёров =====
        System.out.println("=== Режиссёры спектаклей ===");
        drama.printDirector();
        opera.printDirector();
        ballet.printDirector();

        // ===== Замена актёра =====
        System.out.println("\n=== Замена актёра в 'Гамлете' ===");
        drama.replaceActor("Смирнова", actor3);
        drama.printActors();

        // Попытка заменить несуществующего
        System.out.println("\n=== Попытка заменить отсутствующего актёра в балете ===");
        ballet.replaceActor("Несуществующий", actor1);

        // ===== Вывод либретто =====
        System.out.println("\n=== Либретто музыкальных спектаклей ===");
        opera.printLibretto();
        ballet.printLibretto();

        // ===== Вывод общей информации =====
        System.out.println("=== Информация о музыкальных спектаклях ===");
        System.out.println(opera);
        System.out.println(ballet);

        System.out.println("\n=== Репертуар сформирован. Театр готов к представлениям! ===");
    }
}