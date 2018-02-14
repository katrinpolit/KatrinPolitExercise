package com.example.katrinpolitexercise.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Катюша on 14.02.2018.
 */

public class CommonUtils {

    private CommonUtils(){}
    public static boolean isEmailValid(String email) {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
