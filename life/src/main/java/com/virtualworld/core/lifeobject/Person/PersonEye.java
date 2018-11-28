package com.virtualworld.core.lifeobject.Person;

import com.virtualworld.core.lifeobject.Eye;
import com.virtualworld.core.lifeobject.Organ;

public class PersonEye extends Thread  implements Eye {
    Person person=null;

    public PersonEye work(Person person){
        this.person=person;
        return this;
    }
    public void run() {
        int count=0;
        while(true){
            for(int i=0;i<count;i++){
                System.out.println("I See");
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
}
