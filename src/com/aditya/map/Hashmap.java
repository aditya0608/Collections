package com.aditya.map;

/* By default equals method returns true if two objects have same memory locations otherwise false
   But this nature can be overriden by the equals method
   hashcode method returns different hashcodes if the objects are same or different as defined by the equals method
   but it is not necessary as diff object can also return same hascode
   but when hascode is called on same object infinite times it mjust return same hascode
 */
import java.util.*;

public class Hashmap {


    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        map.put(null,2);
        map.put(1,2);
        map.put(null,5);

        System.out.println(map);

        Set<Person> set=new HashSet<>();
        Person p=new Person(1,"adi");
        set.add(new Person(1,"adi"));
        set.add(new Person(1,"adi"));
        set.add(p);
        set.add(p);
        int hashcode=new Person(1,"adi").hashCode();
        System.out.println(p.hashCode()+" "+ hashcode);
        System.out.println(set.size());
    }
}
class Person
{
    int id;
    String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Person)) return false;
//        Person person = (Person) o;
//        //return id == person.id && Objects.equals(name, person.name);
//        return this==o;
//    }

}