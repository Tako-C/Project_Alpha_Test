package sit.int202;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Student student = new Student(1001,"Somchai",4.5);
        System.out.println(student.getName());
        System.out.println(student);
        String[] s = {"Somchai", "Somsri"};
        for (String x : s) {
            System.out.println(x);
        }
    }
}