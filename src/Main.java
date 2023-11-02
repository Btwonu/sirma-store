import com.store.cli.CommandRouter;
import com.store.util.Input;

import java.util.Scanner;

public class Main {
    public static boolean isRunning = true;

    public static void main(String[] args) {
        CommandRouter router = new CommandRouter();
        Scanner scanner = new Scanner(System.in);

        while (isRunning) {
            String line = scanner.nextLine();
            Input input = new Input(line);
            String command = input.getCommand();
            String[] arguments = input.getArguments();

            router.route(command, arguments);
        }
    }
}