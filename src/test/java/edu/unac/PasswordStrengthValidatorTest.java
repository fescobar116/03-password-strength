package edu.unac;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static edu.unac.PasswordStrengthValidator.PasswordStrengthEnum;
import static edu.unac.PasswordStrengthValidator.getPasswordStrength;

class PasswordStrengthValidatorTest {
    @Test
    void weakPasswordTest() {
        PasswordStrengthEnum result = getPasswordStrength("123");
        assertEquals(PasswordStrengthEnum.WEAK, result);

        result = getPasswordStrength("1234567890");
        assertEquals(PasswordStrengthEnum.WEAK, result);

        result = getPasswordStrength("abcdefghijk");
        assertEquals(PasswordStrengthEnum.WEAK, result);
    }

    @Test
    void mediumPasswordTest(){
        PasswordStrengthEnum result = getPasswordStrength("1234abcd");
        assertEquals(PasswordStrengthEnum.MEDIUM, result);
    }

    @Test
    void strongPasswordTest(){
        PasswordStrengthEnum result = getPasswordStrength("1234abc*/");
        assertEquals(PasswordStrengthEnum.STRONG, result);
    }
}