package com.epam.training.student_Samvel_Danielyan.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        if (email == null) {
            return false;
        }
        Pattern pattern = Pattern.compile("[^_][a-z]*_[a-z-][^_]*[\\d]?@epam.com");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}





