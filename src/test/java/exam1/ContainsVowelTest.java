package exam1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Nested
class ContainsVowelTest {
    @Test
    @DisplayName("Text with vowels minus")
    void ShouldRturnWithVowels() {
        //Arrange
        String str = "Hello world";
        boolean expected = true;

        //Act
        boolean actual = ContainsVowel.containsVowel(str);

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Text with vowels mayus")
    void ShouldRturnWithVowelsMays(){
        //Arrange
        String str = "HELLO WORLD";
        boolean expected = true;

        //Act
        boolean actual = ContainsVowel.containsVowel(str);
        //Assert
        assertEquals(expected, actual);
    }
}
