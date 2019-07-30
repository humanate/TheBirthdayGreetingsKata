package com.hgy.main;

import com.hgy.utils.Constant;
import com.hgy.utils.FileUtil;

import java.util.concurrent.BlockingQueue;

public class FileReader implements Runnable {
    private BlockingQueue<String> queue;

    public FileReader(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            if (FileUtil.getEmployeeDataFromFile(Constant.FILE_PATH, queue)) {
                System.out.println("producer thread stop");
                UserFilter.READ_OVER = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
