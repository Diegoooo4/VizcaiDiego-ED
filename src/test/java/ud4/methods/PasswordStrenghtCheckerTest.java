package ud4.methods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PasswordStrenghtCheckerTest {
    @Nested
    class PasswordStrengtInvalid{
        @Test
        @DisplayName("Prueba de contraseña invalida")
        void InvalidoShouldReturnInvalid(){
            //Arange
            String password = null;
            PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.INVALID;
            //ACT
            PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);

            //Assert
            assertEquals(actual, expected);
        }
    }
    @Nested
    class PasswordStrengtWeak {


        @Test
        @DisplayName("Prueba de contraseña debil minuscula")
        void WeakShouldReturnDebilMinuscula() {
            //Arrange
            String password ="abcdefgh";
            PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.WEAK;
            //Act
            PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);
            //Assert
            assertEquals(actual, expected);
        }
        @Test
        @DisplayName("Prueba de contraseña debil mayusculas")
        void WeakShouldReturnDebilMayuscula() {
            //Act
            String password ="ABCDEFGH";
            PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.WEAK;
            //Arange
            PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);
            //Assert
            assertEquals(actual, expected);
        }
        @Test
        @DisplayName("Prueba de contraseña debil caracter")
        void WeakShouldReturnDebilCaracter() {
            //Act
            String password ="!·$%&/()";
            PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.WEAK;
            //Arange
            PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);
            //Assert
            assertEquals(actual, expected);
        }
    }
    @Nested
    class PasswordStrengtMedium {


        @Test
        @DisplayName("Prueba de contraseña medio minuscula mayuscula")
        void WeakShouldReturnMedioMinMay() {
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
        void WeakShouldReturnMedioMinSimb() {
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
        void WeakShouldReturnMedioMaySimb() {
            //Act
            String password ="ABCD&/()";
            PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.MEDIUM;
            //Arange
            PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);
            //Assert
            assertEquals(actual, expected);
        }
    }
    @Nested
    class PasswordStrengtStrong {


        @Test
        @DisplayName("Prueba de contraseña fuerte de todas")
        void WeakShouldReturnFuerteMinMaySimb   () {
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
