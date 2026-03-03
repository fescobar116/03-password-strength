package edu.unac;

public class PasswordStrengthValidator {
    public enum PasswordStrengthEnum {
        WEAK, MEDIUM, STRONG
    }

    public static PasswordStrengthEnum getPasswordStrength(String password) {
        if (password.length() < 8
                || password.matches("[0-9]+")
                || password.matches("[a-z]+")) {
            return PasswordStrengthEnum.WEAK;
        }
        else {
            if (password.matches("[0-9a-z]+")) {
                return PasswordStrengthEnum.MEDIUM;
            } else {
                return PasswordStrengthEnum.STRONG;
            }
        }
    }
}
