package padphone.launchmodetest;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by sunqi on 2018/6/7.
 */

public class MyTest {

    public static void main(String args[]) {
        String[] strings = {"1", "2", "3", "4", "5", "6", "7"};

//        for (String string : strings) {
//            if (Math.random() > 0.5)
//                continue;
//
//            System.out.println("string is=========" + string);
//        }

        MyTest test = new MyTest();
//        System.out.println(test.getI());

//        test.testThreadPool();


    }

    private int getI(){
        int i=1;
        try{
            i=2;
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            i=3;
            return i;
        }

//        return i;

    }

    private void testThreadPool(){
        ThreadPoolExecutor poolExecutor1 = new ThreadPoolExecutor(3,6, 5,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(10));

        poolExecutor1.execute(runnable);
        poolExecutor1.execute(runnable);
        poolExecutor1.execute(runnable);
        poolExecutor1.execute(runnable);
        poolExecutor1.execute(runnable);
        poolExecutor1.execute(runnable);
        poolExecutor1.execute(runnable);


    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run");
        }
    };

}
