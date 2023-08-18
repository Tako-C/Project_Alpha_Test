package sit.int202;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class test {
    private int id;
    private String name;
    private String gpax;

    public static void main(String[] args) {
        Student student = new Student(1001,"somchai",4.5);
        System.out.println(student);
    }

}
