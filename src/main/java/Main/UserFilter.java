package Main;

import Bean.Employee;
import Utils.EmailUtil;
import Utils.RegularUtil;

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
