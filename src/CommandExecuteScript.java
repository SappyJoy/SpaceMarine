import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CommandExecuteScript implements Command {
    /**
     * Класс для исполнения команд из файла
     */


    public CommandExecuteScript() {

    }

    @Override
    public void execute(Scanner sc) throws FileNotFoundException {
        String fileName = sc.next();
        // Создать новый файл, если имя файла указано некорректно запросить повторить ввод
        InputStreamReader isr = new InputStreamReader();
    }
}
