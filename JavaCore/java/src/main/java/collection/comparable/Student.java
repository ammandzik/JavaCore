package collection.comparable;

import lombok.Builder;
import lombok.Data;

import java.util.Comparator;

@Data
@Builder
class Student implements Comparable<Student>, Comparator<Student> {

    private Integer age;
    private String name;
    private Integer points;


    //Comparable
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(this.points, o2.points);
    }

    //Comparator
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.points, o.points);
    }
}
