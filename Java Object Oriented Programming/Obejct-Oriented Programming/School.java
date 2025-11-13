import java.util.ArrayList;
public class School {
    
    private ArrayList<Student1> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<SchoolClass> classes;

    public School() {
        this.students = new ArrayList<Student1>();
        this.teachers = new ArrayList<Teacher>();
        this.classes = new ArrayList<SchoolClass>();
    }

    public void addStudent(Student1 student) {
        students.add(student);
    }

    public void removeStudent(Student1 student) {
        students.remove(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teachers);
    }

    public void addClass(SchoolClass school_class) {
        classes.add(school_class);
    }

    public void removeClass(SchoolClass school_class) {
        classes.remove(school_class);
    }

    public ArrayList<Student1> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<SchoolClass> getClasses() {
        return classes;
    }
}