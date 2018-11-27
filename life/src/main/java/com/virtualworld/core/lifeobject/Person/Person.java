package com.virtualworld.core.lifeobject.Person;

import com.virtualworld.core.lifeobject.Body;
import com.virtualworld.core.lifeobject.Spirit;
import lombok.Data;

@Data
public abstract class Person {
    PersonBody body;
    PersonSpirit spirit;

    abstract void hear();

    abstract void see();

    abstract void touch();

    abstract void smell();

    abstract void taste();
}
