package com.virtualworld.core.lifeobject.Person;

import com.virtualworld.core.lifeobject.Body;
import lombok.Data;

@Data
public class PersonBody  extends Body {
    public PersonBody(){
        this.personHeart=new PersonHeart();
        this.personEar=new PersonEar();
        this.personEye=new PersonEye();
        this.personMouth=new PersonMouth();
    }
    PersonBrow personBrow;
    PersonEar personEar;
    PersonEye personEye;
    PersonMouth personMouth;
    PersonNose personNose;
    PersonHeart personHeart;
}
