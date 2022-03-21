import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultTest {

    @Test
    @DisplayName("test test_gradingStudents")
    void test_gradingStudents() {
        List<Integer> testList = new ArrayList<>() {
        };
        testList.add(33);
        testList.add(84);
        testList.add(29);
        testList.add(57);

        List<Integer> actual = Result.gradingStudents(testList);
        List<Integer> expectedList = new ArrayList<>() {
        };
        expectedList.add(85);
        expectedList.add(57);
        assertEquals(actual, expectedList);
    }

    @Test
    @DisplayName("Testing test_ListSizeOfValidGrades method")
    void test_ListSizeOfValidGrades() {
        int actual = 2;
        List<Integer> testList = new ArrayList<>() {
        };
        testList.add(33);
        testList.add(84);
        testList.add(29);
        testList.add(57);
        int expected = Result.gradingStudents(testList).size();
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Testing test_checkValidityOfRange_under_40 method")
    void test_checkValidityOfRange_under_40() {
        int numToTest = 24;
        boolean actual = false;
        boolean expected = Result.checkValidityOfRange(numToTest);
        assertEquals(actual, expected, "Test for number " + numToTest);

    }

    @Test
    @DisplayName("Testing test_checkValidityOfRange_over_40 method")
    void test_checkValidityOfRange_over_40() {
        int numToTest = 65;
        boolean actual = true;
        boolean expected = Result.checkValidityOfRange(numToTest);
        assertEquals(actual, expected, "Test for number " + numToTest);

    }

    @Test
    @DisplayName("Testing test_checkValidityOfRange_over_100 method")
    void test_checkValidityOfRange_over_100() {
        int numToTest = 122;
        boolean actual = false;
        boolean expected = Result.checkValidityOfRange(numToTest);
        assertEquals(actual, expected, "Test for number " + numToTest);

    }
}
