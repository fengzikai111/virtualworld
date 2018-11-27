package com.virtualworld.core.lifeobject.Person;

import com.virtualworld.core.lifeobject.Body;
import lombok.Data;

@Data
public class PersonBody  extends Body {
    PersonBrow personBrow;
    PersonEar personEar;
    PersonEye personEye;
    PersonMouth personMouth;
    PersonNose personNose;
}
