import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandInsert implements Command {
    private Map<Integer, SpaceMarine> lhm;
    public CommandInsert(Map<Integer, SpaceMarine> lhm) {
        this.lhm = lhm;
    }

    @Override
    public void execute(Scanner sc) {
        int key = sc.nextInt();
        SpaceMarine sm = new SpaceMarine();
        sm.scan(sc);
        lhm.put(key, sm);
        System.out.printf("Object with key %d has been inserted\n", key);
    }
}
