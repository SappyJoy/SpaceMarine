import java.util.HashMap;

public class CommandManager {
    /**
     * Менеджер команд - исполняет комаду, соответствующую вводу
     */
    HashMap<String, Command> hm = new HashMap<>();

    void addCommand(String name, Command cmd) {
        hm.put(name, cmd);
    }

    Command getCommand(String name) {
        return hm.get(name);
    }
}
