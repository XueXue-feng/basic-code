package cn.itcast.dayweb.demo01.demo17WaitAndNotify.BaoZi;

public class Restaurant implements Runnable {

    Resource resource;
   // Customer customer;

    @Override
    public void run() {
        staticRun();
    }

    public void staticRun() {

            synchronized (resource) {
                int count = 1;
                while (true) {
                if (resource.baoZi == true) {
                    try {
                        System.out.println("我是包子店老板有包子了我要睡觉");
                        resource.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("我是包子店老板没有包子了我要开始做包子了");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(count % 2 == 0){
                        System.out.println("我要做冰皮月亮馅儿的包子");
                    }else{
                        System.out.println("我要做猪肉大葱馅儿的包子");
                    }
                    count += 1;
                    resource.baoZi = true;
                    /*customer.*/resource.notify();
                }
            }
        }
    }
}

