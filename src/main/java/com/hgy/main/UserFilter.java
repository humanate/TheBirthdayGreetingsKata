package com.hgy.main;

import com.hgy.beans.Employee;
import com.hgy.utils.EmailUtil;
import com.hgy.utils.RegularUtil;

import java.util.concurrent.BlockingQueue;

public class UserFilter implements Runnable {
    private BlockingQueue<String> queue;
    public static volatile boolean READ_OVER = false;

    public UserFilter(BlockingQueue<String> queue) {
        this.queue = queue;
    }


    public void run() {
        try {
            while (true) {
                if (READ_OVER && queue.isEmpty()) {
                    break;
                }
                if (!queue.isEmpty()) {
                    String employeeData = queue.poll();
                    Employee employee = new Employee();
                    if (RegularUtil.filterAndLoadAEmployee(employeeData, employee)) {
                        EmailUtil.sendEmailToAEmployee(employee);
                    }
                }
            }
            System.out.println("Comsumer thread stop");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
