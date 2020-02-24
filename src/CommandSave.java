import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;

public class CommandSave implements Command{
    /**
     * Сохраняет коллекцию в файл в виде toString()
     */
    Map<Integer, SpaceMarine> lhm;
    File file;

    public CommandSave(Map<Integer, SpaceMarine> lhm, File file) {
        this.lhm = lhm;
        this.file = file;
    }

    @Override
    public void execute(Scanner sc) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        pw.flush();
        for (int i : lhm.keySet()) {
            pw.write(i + " " + lhm.get(i) + "\n");
        }
        pw.close();
    }
}
