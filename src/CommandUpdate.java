import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

public class CommandUpdate implements Command {
    private Map<Integer, SpaceMarine> lhm;
    public CommandUpdate(Map<Integer, SpaceMarine> lhm) {
        this.lhm = lhm;
    }

    @Override
    public void execute(Scanner sc) {
        int id = sc.nextInt();
        SpaceMarine sm = new SpaceMarine();
        sm.scan(sc);
        // Необходимо найти элемент в коллекции по id
        // Здесь будет реализовано полным перебором, впоследствии возможны изменения
        for (SpaceMarine v : lhm.values()) {
            if (v.getId() == id) {
                v = sm;
                return;
            }
        }
        System.out.println("Not found any elements with the given id");
    }
}
