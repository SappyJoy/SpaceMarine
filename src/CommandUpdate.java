import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

public class CommandUpdate implements Command {
    /**
     * Изменяет элемент по заданному id
     */
    private Map<Integer, SpaceMarine> lhm;
    public CommandUpdate(Map<Integer, SpaceMarine> lhm) {
        this.lhm = lhm;
    }

    @Override
    public void execute(Scanner sc) {
        int id = sc.nextInt();
        SpaceMarine sm = new SpaceMarine();
        sm.scan(sc);
        sm.setId(id);
        // Необходимо найти элемент в коллекции по id
        // Здесь будет реализовано полным перебором, впоследствии возможны изменения
        for (Integer key : lhm.keySet()) {
            SpaceMarine value = lhm.get(key);
            if (value.getId() == id) {
                lhm.put(key, sm);
                return;
            }
        }
        System.out.println("Not found any elements with the given id");
    }
}
