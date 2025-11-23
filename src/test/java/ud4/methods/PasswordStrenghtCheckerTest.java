package ud4.methods;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    class PasswordStrenghtCheckerTest {
        @Nested
        class PasswordStrengtInvalid {
            @Test
            @DisplayName("Prueba de contraseña invalida")
            void InvalidoShouldReturnInvalid() {
                //Arange
                String password = null;
                PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.INVALID;
                //ACT
                PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);
                //assert
                assertEquals(actual, expected);
            }
            @Test
            @DisplayName("Prueba de contraseña error")
            void InvalidoShouldReturnERror() {
                //Arange
                String password = "123abc_";
                PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.INVALID;
                //ACT
                PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);
            }
            @Test
            @DisplayName("Prueba de contraseña vacia")
            void InvalidoShouldReturnvacio () {
                //Arange
                String password = "";
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
                        String password = "abcdefgh";
                        PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.WEAK;
                        //Act
                        PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);

                        //Assert
                        assertEquals(actual, expected);
                    }


                        @Test
                        @DisplayName("Prueba de contraseña debil mayusculas")
                        void WeakShouldReturnDebilMayuscula () {
                            //Act
                            String password = "ABCDEFGH";
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
                                String password = "!·$%&/()";
                                PasswordStrenghtChecker.PasswordStrength expected = PasswordStrenghtChecker.PasswordStrength.WEAK;
                                //Arange
                                PasswordStrenghtChecker.PasswordStrength actual = PasswordStrenghtChecker.checkStrength(password);

                                //Assert
                                assertEquals(actual, expected);
                            }

                    }
                }

