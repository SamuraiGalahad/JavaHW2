import java.io.*;

/*
    Класс с командами взаимодействия со студентами.
 */
class CommandsClass {
    /*
     Метод генерации рандомного числа.
     */
    private static int getRandomInt() {
        return (int) (Math.random() * DataClass.students.size());
    }
    /*
    Метод рандомного выбора студента, чтобы затем поставить ему оценку.
     */
    public static void markRandom() {
        int randomStudentIndex = getRandomInt();
        Student currentStudent = DataClass.students.get(randomStudentIndex);
        Console.printStudentChoice(currentStudent.getName());
        if (currentStudent.getMark() != -1) {
            System.out.println("Студент уже был оценен!");
        } else {
            setMarkForStudent(currentStudent);
            System.out.println(currentStudent);
        }
    }
    /*
    Метод, чтобы поставить оценку студенту.
     */
    private static void setMarkForStudent(Student student) {
        System.out.println("Введите оценку от 0 до 10 включительно: ");
        while (true) {
            int mark = Console.getIntFromUser();
            if (mark < 0 || mark > 10) {
                System.out.println("Оценка в неправильном диапазоне!");
                continue;
            }
            student.setMark(mark);
            DataClass.markedStudents.add(student);
            return;
        }
    }
    /*
    Вывод оцененых студентов.
     */
    public static void getStudents() {
        if (DataClass.markedStudents.size() == 0) {
            System.out.println("Список пуст!");
        }
        for (int i = 0; i < DataClass.markedStudents.size(); i++) {
            System.out.println(DataClass.markedStudents.get(i));
        }
    }
    /*
     Вывод всех студентов.
     */
    public static void getAllStudents() {
        for (int i = 0; i < DataClass.students.size(); i++) {
            System.out.println(DataClass.students.get(i));
        }
    }
    /*
    Вывод помощи.
     */
    public static void getHelp() {
        try (FileReader reader = new FileReader("src/help.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
