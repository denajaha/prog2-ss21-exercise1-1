import java.util.ArrayList;
import java.util.List;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 40) {
                grades.remove(i);
            }
            int normalMod5 = grades.get(i) % 5;
            if (normalMod5 == 3) {
                grades.set(i, grades.get(i) + 2);
            }
            if (normalMod5 == 4) {
                grades.set(i, grades.get(i) + 1);
            }
            // if we want to round down it would be done like this:
            // else grades.set(i, grades.get(i) + 5 - normalMod5);
        }
        return grades;
    }
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>() {};
        test.add(33);
        test.add(84);
        test.add(29);
        test.add(57);
        gradingStudents(test);
        System.out.println(test);
    }
}
