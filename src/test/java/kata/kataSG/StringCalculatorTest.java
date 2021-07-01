package kata.kataSG;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	
	@Test
    public void should_return_0_for_an_empty_input() {

        // Given
        StringCalculator stringCalculator = new StringCalculator();
        String input = "";
        int expectedResult = 0;

        // When
        int result = stringCalculator.add(input);

        // Then
        assertSame(result, expectedResult);
    }

    @Test
    public void should_return_1_for_an_input_of_1() {

        // Given
        StringCalculator stringCalculator = new StringCalculator();
        String input = "1";
        int expectedResult = 1;

        // When
        int result = stringCalculator.add(input);

        // Then
        assertSame(result, expectedResult);
    }

    @Test
    public void should_return_2_for_an_input_of_2() {

        // Given
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2";
        int expectedResult = 2;

        // When
        int result = stringCalculator.add(input);

        // Then
        assertSame(result, expectedResult);
    }

    @Test
    public void should_return_3_for_an_input_of_1_coma_2() {

        // Given
        StringCalculator stringCalculator = new StringCalculator();
        String input = "1,2";
        int expectedResult = 3;

        // When
        int result = stringCalculator.add(input);

        // Then
        assertSame(result, expectedResult);
    }

    @Test
    public void should_return_5_for_an_input_of_2_coma_3() {

        // Given
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2,3";
        int expectedResult = 5;

        // When
        int result = stringCalculator.add(input);

        // Then
        assertSame(result, expectedResult);
    }

    @Test
    public void should_return_5_for_an_input_of_2_new_line_3() {

        // Given
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2\n3";
        int expectedResult = 5;

        // When
        int result = stringCalculator.add(input);

        // Then
        assertSame(result, expectedResult);
    }

    @Test
    public void should_return_5_for_an_input_of_2_custom_separator_3_and_custom_separator_is_semicolon() {

        // Given
        StringCalculator stringCalculator = new StringCalculator();
        String input = "//;\n2;3";
        int expectedResult = 5;

        // When
        int result = stringCalculator.add(input);

        // Then
        assertSame(result, expectedResult);
    }

    @Test
    public void should_return_3_for_an_input_of_1_custom_separator_2_and_custom_separator_is_semicolon() {

        // Given
        StringCalculator stringCalculator = new StringCalculator();
        String input = "//;\n1;2";
        int expectedResult = 3;

        // When
        int result = stringCalculator.add(input);

        // Then
        assertSame(result, expectedResult);
}

}
