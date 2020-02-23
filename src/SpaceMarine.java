import java.util.Collection;
import java.util.Scanner;

public class SpaceMarine {
    /**
     * @param
     */
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private float health; //Значение поля должно быть больше 0
    private boolean loyal;
    private Weapon weaponType = null; //Поле может быть null
    private MeleeWeapon meleeWeapon = null; //Поле может быть null
    private Chapter chapter; //Поле не может быть null

    public SpaceMarine(String name, Coordinates coordinates, float health, boolean loyal, Chapter chapter) {
        this.name = name;
        this.coordinates = coordinates;
        this.health = health;
        this.loyal = loyal;
        this.chapter = chapter;
    }

    public SpaceMarine() {
    }

    public int getId() {
        return id;
    }

    void scan(Scanner sc) {
        name = sc.next();
        coordinates = new Coordinates(sc.nextLong(), sc.nextLong());
        health = sc.nextFloat();
        loyal = sc.nextBoolean();
        chapter = new Chapter(sc.next(), sc.nextInt(), sc.next());
    }

    @Override
    public String toString() {
        return "SpaceMarine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", health=" + health +
                ", loyal=" + loyal +
                ", weaponType=" + weaponType +
                ", meleeWeapon=" + meleeWeapon +
                ", chapter=" + chapter +
                '}';
    }
}

