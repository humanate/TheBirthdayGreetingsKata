package Utils;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static org.junit.Assert.*;

public class FileUtilTest {

    @Test
    public void getEmployeeDataFromFile() {
        //given 注意文件中行数不应该超过阻塞队列长度，否则将阻塞
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(100);
        //when
        boolean result = false;
        try {
            result = FileUtil.getEmployeeDataFromFile(Constant.FILE_PATH,queue);
        }catch (Exception e){
            e.printStackTrace();
        }
        //then
        assertTrue(result);
    }
}