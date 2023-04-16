package com.epam.training.student_Samvel_Danielyan.validations;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {

        boolean b = false, b1 = false;
        if(color == null || color.length() == 0){
            return false;
        }
        String s2 = color.substring(1, color.length());
        if (color.length() == 7) {
            if (color.charAt(0) == '#') {
                b1 = true;
            }
        } else if(color.length() == 4){
            if(color.charAt(0) == '#'){
                b1 = true;
            }
        }
        if (b1)
            for (int i = 0; i < s2.length(); i++) {
                char c = s2.charAt(i);
                if (c != '#') {
                    if (s2.matches("[A-Fa-f0-9]{6}|[A-Fa-f0-9]{3}"))
                        b = true;
                    else {
                        b = false;
                        break;
                    }
                }
            }
        return b;

    }
}





