package ud4.methods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
    class PasswordStrenghtCheckerTest {
        @Nested
        class PasswordStrengtStrong {


            @Test
            @DisplayName("Prueba de contraseña fuerte de todas")
            void StrongShouldReturnFuerteMinMaySimb   () {
                //Arrange
                String password ="abcdEF··";
                PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.STRONG;
                //Act
                PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);
                //Assert
                assertEquals(actual, expected);
            }

        }
    }
