package ud4.methods;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
    class PasswordStrenghtCheckerTest {
        @Nested
        class PasswordStrengtMedium {


            @Test
            @DisplayName("Prueba de contraseña medio minuscula mayuscula")
            void MediumShouldReturnMedioMinMay() {
                //Arrange
                String password ="abcdEFGH";
                PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.MEDIUM;
                //Act
                PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);
                //Assert
                assertEquals(actual, expected);
            }
            @Test
            @DisplayName("Prueba de contraseña medio minuscula simbolo")
            void MediumShouldReturnMedioMinSimb() {
                //Act
                String password ="abcd!·$%";
                PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.MEDIUM;
                //Arange
                PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);
                //Assert
                assertEquals(actual, expected);
            }
            @Test
            @DisplayName("Prueba de contraseña medio caracter mayuscula")
            void MediumShouldReturnMedioMaySimb() {
                //Act
                String password ="ABCD&/()";
                PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.MEDIUM;
                //Arange
                PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);
                //Assert
                assertEquals(actual, expected);
            }
        }
    }
