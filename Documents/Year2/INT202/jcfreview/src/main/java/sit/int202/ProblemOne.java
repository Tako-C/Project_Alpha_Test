package sit.int202;

import java.util.*;


public class ProblemOne {
        public static void main(String[] args) {
//            System.out.println(s1.hashCode());
//            System.out.println(s2.hashCode());
//            System.out.println(s1.equals(s2));
            // when we have 100 students
            // Set<Student> studentSet = new HashSet<>(200 , 0.5f);
            Set<Student> studentSet = new HashSet<>(125 , 0.75f);
            studentSet.add(new Student(10001, "Somsri", 3.25));
            studentSet.add(new Student(10002, "Somsak", 3.00));
            studentSet.add(new Student(10009, "Somchai", 3.26));
            studentSet.add(new Student(10007, "Somsiri", 3.25));
            studentSet.add(new Student(100037, "Sirisopaphan", 3.25));
            for (Student s : studentSet) {
                System.out.println(s);
            }
            System.out.println("--------------------");

            Set<Student> studentSet2 = new TreeSet<>();
            studentSet2.add(new Student(1001,"somsri",3.25));
            studentSet2.add(new Student(1002,"somsak",3.00));
            studentSet2.add(new Student(1009,"somchai",3.26));
            studentSet2.add(new Student(1007,"somsiri",3.25));
            studentSet2.add(new Student(1037,"sirisopaphan",3.25));
            for (Student s : studentSet2) {
                System.out.println(s);
            }
            List<Student> tmp = studentSet.stream().sorted(Student.COMPARE_BY_GPAX).toList();
//            Collections.sort(tmp);
            System.out.println("--------------------");
            for (Student s : tmp) {
                System.out.println(s);
            }
        }
    }


