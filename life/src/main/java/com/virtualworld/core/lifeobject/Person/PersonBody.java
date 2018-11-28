package com.virtualworld.core.lifeobject.Person;

import com.virtualworld.core.lifeobject.Body;
import lombok.Data;

@Data
public class PersonBody  extends Body {
    public PersonBody(){
        this.personHeart=new PersonHeart();
    }
    PersonBrow personBrow;
    PersonEar personEar;
    PersonEye personEye;
    PersonMouth personMouth;
    PersonNose personNose;
    PersonHeart personHeart;
}
