package com.bootcoding.hackerRank;

public class StrongPassword {
    public static void main(String[] args) {
        int n=11;
        String password="#HackerRank";
        int res = minimumNumber(n, password);
        System.out.println(res);

    }

    public static int minimumNumber(int n, String password) {
        int minLength = 6;
        int missingChars = 0;

        if (password.length() < minLength)
            missingChars = minLength - password.length();

        int missingTypes = 0;

        boolean hasDigit = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c))
                hasDigit = true;
            else if (Character.isLowerCase(c))
                hasLowerCase = true;
            else if (Character.isUpperCase(c))
                hasUpperCase = true;
            else
                hasSpecialChar = true;
        }

        if (!hasDigit)
            missingTypes++;
        if (!hasLowerCase)
            missingTypes++;
        if (!hasUpperCase)
            missingTypes++;
        if (!hasSpecialChar)
            missingTypes++;

        return Math.max(missingChars, missingTypes);
    }


}
