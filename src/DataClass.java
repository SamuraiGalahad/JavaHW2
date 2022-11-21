import java.util.ArrayList;
import java.util.Arrays;

/*
Класс хранения данных.
 */
public class DataClass {
    public static final String helpLines = """
                                                       
            __________________________________________
                                        
                Такой команды не существует!
                Воспользуйтесь командой '/n',
                чтобы узнать список команд!
                                        
            __________________________________________
                                        
            """;

    public static final String startLines = """
                        
            __________________________________________
                        
                Электронный журнал V 0.1
                        
            __________________________________________
            """;

    public static ArrayList<Student> students =
            new ArrayList<>(
                    Arrays.asList(
                            new Student("Boris Britva", 12),
                            new Student("Ivan Turetsky", 13),
                            new Student("Djeff Lebovski", 14),
                            new Student("Dana Scully", 13),
                            new Student("Fox Mulder", 14),
                            new Student("Marty McFly", 14)
                            ));

    public static ArrayList<Student> markedStudents = new ArrayList<Student>();
}
