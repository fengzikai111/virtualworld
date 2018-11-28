package com.virtualworld.core.life;

import com.virtualworld.core.lifeobject.Person.EarlyPerson;
import com.virtualworld.core.lifeobject.Person.Person;

public class InitVirtualWorld {
    public    void unkown(){
        int i=1;
        while(true){
            EarlyPerson person= new EarlyPerson();
            person.bear(person);
            System.out.println("# init  "+ i);
            i--;
            if(i<=0) {
                try {
                    Thread.sleep(1000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
