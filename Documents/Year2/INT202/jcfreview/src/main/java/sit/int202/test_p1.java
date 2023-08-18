package sit.int202;

import java.util.HashSet;
import java.util.Set;

public class test_p1 {
    public static void main(String[] args) {
        Set<Student> studentsSet = new HashSet<>(125,75);
        studentsSet.add(new Student(1001,"Tako",3.25));
        studentsSet.add(new Student(1002,"Mahiru",3.25));
        studentsSet.add(new Student(1003,"Uro",3.00));
        for (Student s: studentsSet) {
            System.out.println(s);
        }

    }
}
