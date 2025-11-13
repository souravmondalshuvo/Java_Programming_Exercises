import java.util.ArrayList;
public class SchoolClass {
    
    private String class_name;
    private Teacher teacher;
    private ArrayList<Student1> students;

    public SchoolClass(String class_name, Teacher teacher) {
        this.class_name = class_name;
        this.teacher = teacher;
        this.students = new ArrayList<Student1>();
    }

    public String getClassName() {
        return class_name;
    }

    public void setClassName(String class_name) {
        this.class_name = class_name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student1> getStudents() {
        return students;
    }

    public void addStudent(Student1 student) {
        students.add(student);
    }

    public void removeStudent(Student1 student) {
        students.remove(student);
    }
}