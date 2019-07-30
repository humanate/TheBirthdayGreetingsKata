package com.hgy.utils;

public class Constant {
    public static int MONTH_OF_TODAY = 9;
    public static int DAY_OF_TODAY = 11;

    public static String FILE_PATH = "src/main/resources/employee_records.txt";

    public static String REGEX = "^(?<lastname>[A-Za-z]+),\\s(?<firstname>[A-Za-z]+),\\s(?<year>\\d{4})/" +
            "(?<month>\\d{2})/(?<day>\\d{2}),\\s(?<email>\\w+([_+.]\\w+)*@(\\w+([-.]\\w+)*\\.\\w+)*)$";
}
