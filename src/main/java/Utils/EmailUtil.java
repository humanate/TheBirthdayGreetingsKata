package Utils;

import Bean.Email;
import Bean.Employee;

public class EmailUtil {
    public static boolean sendEmailToAEmployee(Employee employee) {
        Email email = new Email(employee.getFirstName());
        System.out.println(email.toString());
        return true;
    }
}
