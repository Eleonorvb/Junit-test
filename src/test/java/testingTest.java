import org.junit.Test;

import java.util.Random;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class testingTest {
Testing test=new Testing();
Random random=new Random();

public static final Logger LOG=Logger.getLogger(Testing.class.getName());


    @Test
    public void addition() {
       assertEquals(test.addition(2,2),4,0);
    }

    @Test
    public void add2() {
        int tempRandomValue=0;
        int tempResult=0;
        for (int i = 0; i <100 ; i++) {
            tempRandomValue=random.nextInt(10);
            LOG.info("testing the method with " + tempRandomValue);
            tempResult=tempRandomValue+1;
            assertEquals(test.addition2(tempRandomValue,tempRandomValue),tempResult*2-1,0);
        }

    }
}