package com.example.userregistration.registration;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class EmailValidator {

    // Adding regex from https://mkyong.com/regular-expressions/how-to-validate-email-address-with-regular-expression/
    private static final String EMAIL_PATTERN = "^(.+)@(\\S+)$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public static boolean validEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

