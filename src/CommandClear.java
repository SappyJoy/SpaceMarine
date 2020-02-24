import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandClear implements Command {
    /**
     * Команда, стирающая всю коллекцию
     */
    private Map<Integer, SpaceMarine> lhm;
    public CommandClear(Map<Integer, SpaceMarine> lhm) {
        this.lhm = lhm;
    }

    @Override
    public void execute(Scanner sc) {
        for (int key : lhm.keySet()) {
            lhm.remove(key);
        }
    }
}
