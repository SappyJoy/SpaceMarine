import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = "data/";
        if (args.length > 0)
            fileName = args[0];

        File file;
        while (true) {
            String relativePath = makePath(fileName);
            file = new File(relativePath);
            try {
                file = new File(relativePath);
                file.createNewFile();
                break;
            } catch (IOException e) {
                System.err.println("Wrong input");
                fileName = getFileName();
            }
        }

        LinkedHashMap<Integer, SpaceMarine> lhm = new LinkedHashMap<>();
        CommandManager commandManager = new CommandManager();
        commandManager.addCommand("insert", new CommandInsert(lhm));
        commandManager.addCommand("show", new CommandShow(lhm));
        commandManager.addCommand("update", new CommandUpdate(lhm));
        commandManager.addCommand("remove_key", new CommandRemoveKey(lhm));
        commandManager.addCommand("clear", new CommandClear(lhm));
        commandManager.addCommand("save", new CommandSave(lhm, file));
        commandManager.addCommand("execute_script", new CommandExecuteScript(file));

        while(true) {
            String name = sc.next();
            Command cmd = commandManager.getCommand(name);
            cmd.execute(sc);
        }
    }

    private static String makePath(String fileName) {
        return "files/" + fileName + ".json";
    }

    private static String getFileName() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }
}

class WorkWithFile {

}