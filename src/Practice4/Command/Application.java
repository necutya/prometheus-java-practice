package Practice4.Command;

public class Application {

    static private class Printer {
        static public void print(Object obj) {
            System.out.println(obj);
        }

    }

    static private class HelpCommand
    implements Command {
        public void execute() {
            Printer.print("Help executed");
        }

    }

    static private class EchoCommand
    implements Command {
        String arg;

        EchoCommand(String arg) {
            this.arg = arg;
        }
        public void execute() {
            Printer.print(arg);
        }
    }

    static private class DateNowCommand
    implements Command {
        public void execute() {
            Printer.print(System.currentTimeMillis());
        }
    }

    static private class ExitCommand
    implements Command {
        public void execute() {
            Printer.print("Goodbye!");
        }
    }



    public static void main(String[] args){
        Command command;

        if(args == null || args.length == 0 ) {
            Printer.print("Error");
        }
        else {
            switch (args[0]) {
                case "help":
                    if (args.length == 1) {
                        command = new HelpCommand();
                        command.execute();
                    } else {
                        Printer.print("Error");
                    }
                    break;

                case "echo":
                    if (args.length == 2) {
                        command = new EchoCommand(args[1]);
                        command.execute();
                    } else {
                        Printer.print("Error");
                    }
                    break;

                case "date":
                    if (args.length == 2 && args[1].equals("now")) {
                        command = new DateNowCommand();
                        command.execute();
                    } else {
                        Printer.print("Error");
                    }
                    break;

                case "exit":
                    if (args.length == 1) {
                        command = new ExitCommand();
                        command.execute();
                    } else {
                        Printer.print("Error");
                    }
                    break;

                default:
                    Printer.print("Error");
                    break;
            }
        }
    }

}
