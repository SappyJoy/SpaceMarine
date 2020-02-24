import java.io.FileNotFoundException;
import java.util.Scanner;

public interface Command {
    void execute(Scanner sc) throws FileNotFoundException;
}
