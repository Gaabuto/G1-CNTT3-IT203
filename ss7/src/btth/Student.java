package btth;



public class Student {
    private String id;
    private String name;

    public static final String SCHOOL_NAME = "ABC University";
    public static int studentCount = 0;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }

    public void display(){
        System.out.println("--------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("School: " + SCHOOL_NAME);
        System.out.println("--------------------------------");
    }

    public static void displayStudentCount(){
        System.out.println("Total students: " + studentCount);
    }
}
