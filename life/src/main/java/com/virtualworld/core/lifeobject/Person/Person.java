package com.virtualworld.core.lifeobject.Person;

import com.virtualworld.core.lifeobject.Body;
import com.virtualworld.core.lifeobject.Spirit;
import lombok.Data;

@Data
public class Person {
    PersonBody body;
    PersonSpirit spirit;
}
