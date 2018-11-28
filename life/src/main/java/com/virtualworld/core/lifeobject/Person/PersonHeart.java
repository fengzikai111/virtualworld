package com.virtualworld.core.lifeobject.Person;

import com.virtualworld.core.lifeobject.Heart;

public class PersonHeart extends Thread  implements Heart {
    Person person=null;

    public PersonHeart heartbeat(Person person){
        this.person=person;
        person.getBody().getPersonEar().start();
        person.getBody().getPersonEye().start();
        return this;
    }
    public void run() {
        int count=0;
        while(true){
            for(int i=0;i<count;i++){
                System.out.print("/\\/\\/\\");
                person.biologicalclock();
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
