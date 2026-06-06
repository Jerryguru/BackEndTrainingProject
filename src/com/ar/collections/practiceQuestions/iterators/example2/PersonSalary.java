package com.ar.collections.practiceQuestions.iterators.example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonSalary {
public static void main(String[] args) {
    List<Person> person = new ArrayList<>();
    person.add(new Person(101,"jerry",55000));
    person.add(new Person(102,"guru",50000));
    person.add(new Person(103,"Paramesh",65000));
    person.add(new Person(104,"Jerryy",55000));
    person.add(new Person(105,"yadhav",45000));
    person.add(new Person(106,"Sree",40000));
    Iterator<Person> p = person.iterator();

    while (p.hasNext()){
        Person p1 = p.next();
        if (p1.getSalary()> 50000){
            double incementSalary = p1.getSalary()+ (p1.getSalary()* 20/100);
            p1.setSalary(incementSalary);
        }
    }
    System.out.println("After Incremant");
    for(Person p1 : person){
        System.out.println(p1);
    }
}
}
