package com.hgy.utils;

import com.hgy.beans.Employee;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularUtil {
    public static boolean filterAndLoadAEmployee(String contant, Employee employee) {
        Pattern pattern = Pattern.compile(Constant.REGEX);
        Matcher matcher = pattern.matcher(contant);
        if (matcher.find()) {
            int year = Integer.parseInt(matcher.group("year"));
            int month = Integer.parseInt(matcher.group("month"));
            int day = Integer.parseInt(matcher.group("day"));
            if (dataIsSame(year, month, day)) {
                employee.setFirstName(matcher.group("firstname"));
                employee.setLastName(matcher.group("lastname"));
                Calendar date = Calendar.getInstance();
                date.set(year, month, day);
                employee.setDate(date);
                employee.setEmail(matcher.group("email"));
                return true;
            }
        }
        return false;
    }

    public static boolean dataIsSame(int year, int month, int day) {
        if (month != Constant.MONTH_OF_TODAY || day != Constant.DAY_OF_TODAY)
            return false;
        return true;
    }
}
