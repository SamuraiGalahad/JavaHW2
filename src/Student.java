/*
Класс Cтудент.
Не знаю, зачем сделал поле возраста, но пусть будет.
Вдруг в будущем понадобиться!
 */
class Student {
    private final String name;
    private final Integer age;
    private Integer mark = -1;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        if (mark == -1) {
            return "Студент " + name + "пока без оценки!";
        } else {
            return "Студент " + name + " получил оценку " + mark.toString() + " !";
        }
    }
}
