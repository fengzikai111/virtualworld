package com.virtualworld.core.lifeobject.Person;

public class EarlyPerson extends Person {
    public EarlyPerson(){
        this.body=new PersonBody();
        this.spirit=new PersonSpirit();
    }

    @Override
   public  void bear(Person person) {
       person.getBody().getPersonHeart().heartbeat();
    }

    @Override
    void hear() {

    }

    @Override
    void see() {

    }

    @Override
    void touch() {

    }

    @Override
    void smell() {

    }

    @Override
    void taste() {

    }
}
