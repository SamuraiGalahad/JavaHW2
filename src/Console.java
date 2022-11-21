import java.util.ArrayList;
import java.util.Scanner;

/*
Класс консоли для взаимодействия с пользователем.
 */
class Console {
    public static Scanner scanner;

    public Console() {
        scanner = new Scanner(System.in);
    }
    /*
    Меню выбора.
     */
    public void getCommands() {
        boolean exit_flag = Boolean.FALSE;
        System.out.print(DataClass.startLines);
        CommandsClass.getHelp();
        while (!exit_flag) {
            String line = scanner.next();
            switch (line) {
                case "/r" -> CommandsClass.markRandom();
                case "/a" -> CommandsClass.getAllStudents();
                case "/l" -> CommandsClass.getStudents();
                case "/h" -> CommandsClass.getHelp();
                case "/e" -> exit_flag = Boolean.TRUE;
                default -> {
                    System.out.print(DataClass.helpLines);
                }
            }
        }
    }
    /*
    Вывод выбранного студента.
     */
    public static void printStudentChoice(String name) {
        System.out.println("Выбран студент " + name + "!");
    }
    /*
    Метод парсинга числа из консоли.
     */
    public static int getIntFromUser() {
        while (true) {
            String line = scanner.next();
            if (null == line || !isInt(line)) {
                System.out.println("Не число! Введите заново: ");
            } else {
                return Integer.parseInt(line);
            }
        }
    }
    /*
    Проверка, является ли числом.
     */
    private static boolean isInt(String arg) {
        try {
            Integer.parseInt(arg);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
