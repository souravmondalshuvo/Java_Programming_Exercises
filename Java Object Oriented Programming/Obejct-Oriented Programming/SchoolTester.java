public class SchoolTester {
    public static void main(String[] args) {
        
        School school = new School();

        Student1 student1 = new Student1("Mats Yatzil", 15);
        Student1 student2 = new Student1("Karolina Ralf", 16);
        Student1 student3 = new Student1("Felicie Anuschka", 16);
        Student1 student4 = new Student1("Norbert Micha", 15);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);

        Teacher teacher1 = new Teacher("Jens Amalia", "Math");
        Teacher teacher2 = new Teacher("Elise Giiwedin", "English");
        Teacher teacher3 = new Teacher("Angelika Lotta", "Science");

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);

        SchoolClass math_class = new SchoolClass("Mathematics", teacher1);

        math_class.addStudent(student1);
        math_class.addStudent(student2);
        math_class.addStudent(student3);
        math_class.addStudent(student4);

        SchoolClass english_class = new SchoolClass("English", teacher2);

        english_class.addStudent(student1);
        english_class.addStudent(student2);
        english_class.addStudent(student3);

        SchoolClass science_class = new SchoolClass("Science", teacher3);

        science_class.addStudent(student1);
        science_class.addStudent(student2);
        science_class.addStudent(student3);
        science_class.addStudent(student4);

        school.addClass(math_class);
        school.addClass(english_class);
        school.addClass(science_class);

        System.out.println("School information: ");
        System.out.println("Number of students: " + school.getStudents().size());
        System.out.println("Number of teachers: " + school.getTeachers().size());
        System.out.println("Number of classes: " + school.getClasses().size());
        System.out.println();

        System.out.println("Math class information: ");
        System.out.println("Class name: " + math_class.getClassName());
        System.out.println("Teacher: " + math_class.getTeacher().getName());
        System.out.println("Number of students: " + math_class.getStudents().size());
        System.out.println();

        System.out.println("English class information: ");
        System.out.println("Class name: " + english_class.getClassName());
        System.out.println("Teacher: " + english_class.getTeacher().getName());
        System.out.println("Number of students: " + english_class.getStudents().size());
        System.out.println();

        System.out.println("Science class information: ");
        System.out.println("Class name: " + science_class.getClassName());
        System.out.println("Teacher: " + science_class.getTeacher().getName());
        System.out.println("Number of students: " + science_class.getStudents().size());
        System.out.println();

        school.removeStudent(student1);
        school.removeTeacher(teacher2);
        school.removeClass(math_class);

        System.out.println("School information after removing one student, teacher and class: ");
        System.out.println("Number of students: " + school.getStudents().size());
        System.out.println("Number of teachers: " + school.getTeachers().size());
        System.out.println("Number of classes: " + school.getClasses().size());
    }
}