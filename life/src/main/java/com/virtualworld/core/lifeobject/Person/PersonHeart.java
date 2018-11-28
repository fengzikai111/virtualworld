package com.virtualworld.core.lifeobject.Person;

import com.virtualworld.core.lifeobject.Heart;

public class PersonHeart extends Thread  implements Heart {

    public void heartbeat(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                int count=0;
                while(true){
                    for(int i=0;i<count;i++){
                        System.out.print("/\\/\\/\\");
                    }
                    count++;
                    if(count==20){
                        count=0;
                    }
                    System.out.println();
                    try {
                        Thread.sleep(1000l);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}
