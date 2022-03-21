import java.util.ArrayList;
import java.util.List;

public class Result {

    protected static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> validGrades = new ArrayList<>();

        for (Integer grade : grades) {
            if (checkValidityOfRange(grade)) {
                validGrades.add(grade);
            }
        }
        for (int i = 0; i < validGrades.size(); i++) {
            int normalMod5 = validGrades.get(i) % 5;
            if (normalMod5 == 3) {
                validGrades.set(i, validGrades.get(i) + 2);
            } else if (normalMod5 == 4) {
                validGrades.set(i, validGrades.get(i) + 1);
            }
        }
        return validGrades;
    }

    protected static boolean checkValidityOfRange(int value) {
        return (value > 40 && value <= 100);
    }
}
