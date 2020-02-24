public class Chapter {
    /**
     * Класс главы
     */
    private String name; //Поле не может быть null, Строка не может быть пустой
    private int marinesCount; //Значение поля должно быть больше 0, Максимальное значение поля: 1000
    private String world; //Поле не может быть null

    public Chapter(String name, int marinesCount, String world) {
        this.name = name;
        this.marinesCount = marinesCount;
        this.world = world;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", marinesCount=" + marinesCount +
                ", world='" + world + '\'' +
                '}';
    }
}
