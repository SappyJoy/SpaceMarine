import java.util.Map;
import java.util.Scanner;

public class CommandShow implements Command {
    /**
     * Выводит в консоль всю коллекцию
     */
    private Map<Integer, SpaceMarine> lhm;
    public CommandShow(Map<Integer, SpaceMarine> lhm) {
        this.lhm = lhm;
    }

    @Override
    public void execute(Scanner sc) {
        for (int i : lhm.keySet()) {
            System.out.println(i + " " + lhm.get(i));
        }
    }
}
