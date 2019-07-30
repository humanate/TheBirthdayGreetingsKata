package com.hgy.utils;

import com.hgy.beans.Email;
import com.hgy.beans.Employee;

public class EmailUtil {
    public static boolean sendEmailToAEmployee(Employee employee) {
        Email email = new Email(employee.getFirstName());
        System.out.println(email.toString());
        return true;
    }
}
