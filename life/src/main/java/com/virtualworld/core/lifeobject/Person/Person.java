package com.virtualworld.core.lifeobject.Person;

import com.virtualworld.core.lifeobject.Body;
import com.virtualworld.core.lifeobject.Spirit;
import lombok.Data;

@Data
public abstract class Person {
    static long biologicalclock=0l;
    public void biologicalclock(){
        this.biologicalclock=this.biologicalclock+1l;
        System.out.print(this.biologicalclock);
    }

    PersonBody body;
    PersonSpirit spirit;

    abstract void bear(Person person);

    abstract void hear();

    abstract void see();

    abstract void touch();

    abstract void smell();

    abstract void taste();
}
