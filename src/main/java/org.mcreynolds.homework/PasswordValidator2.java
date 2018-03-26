package org.mcreynolds.homework;

import java.util.regex.Pattern;

/**
 * Created by cs186081 on 26/03/2018.
 */
public class PasswordValidator2 {
    public static boolean isValid(String pass) {
        String pattern = "[a-zA-Z0-9!@#$%^&*]{5,8}";
        return Pattern.matches(pattern, pass);

    }
}
