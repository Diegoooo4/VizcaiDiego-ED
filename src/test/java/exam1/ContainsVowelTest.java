package exam1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Nested
class ContainsVowelTest {
    @Test
    @DisplayName("Text with out vowels mayus")
    void ShouldRturnWithOutVowelsMays(){
        //Arrange
        String str = "HLL WRLD";
        boolean expected = false;

        //Act
        boolean actual = ContainsVowel.containsVowel(str);

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Text with out vowels minus")
    void ShouldRturnWithOutVowels(){
        //Arrange
        String str = "Hll wrld";
        boolean expected = false;

        //Act
        boolean actual = ContainsVowel.containsVowel(str);

        //Assert
        assertEquals(expected, actual);
    }
}

