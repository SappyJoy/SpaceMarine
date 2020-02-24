import java.util.Map;
import java.util.Scanner;

public class CommandRemoveKey implements Command {
    /**
     * Удаляет элемент по ключу
     */
    private Map<Integer, SpaceMarine> lhm;
    public CommandRemoveKey(Map<Integer, SpaceMarine> lhm) {
        this.lhm = lhm;
    }

    @Override
    public void execute(Scanner sc) {
        int removeKey = sc.nextInt();
        for (Integer key : lhm.keySet()) {
            if (key.equals(removeKey)) {
                lhm.remove(removeKey);
                System.out.println("Element has been removed");
                return;
            }
        }
        System.out.printf("Key %d not found\n", removeKey);
    }
}
