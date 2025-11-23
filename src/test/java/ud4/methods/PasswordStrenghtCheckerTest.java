package ud4.methods;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
    class PasswordStrenghtCheckerTest {
        @Nested
        class PasswordStrengtInvalid {
            @Test
            @DisplayName("Prueba de contraseña null")
            void InvalidoShouldReturnNull() {
                //Arange
                String password = null;
                PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.INVALID;
                //ACT
                PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);

                //Assert
                assertEquals(actual, expected);
            }
            @Test
            @DisplayName("Prueba de contraseña error")
            void InvalidoShouldReturnError(){
                //Arange
                String password = "123abc_";
                PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.INVALID;
                //ACT
                PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);

                //Assert
                assertEquals(actual, expected);
            }
            @Test
            @DisplayName("Prueba de contraseña vacio")
            void InvalidoShouldReturnVacio(){
                //Arange
                String password = "";
                PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.INVALID;
                //ACT
                PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);

                //Assert
                assertEquals(actual, expected);
            }
        }
    }
