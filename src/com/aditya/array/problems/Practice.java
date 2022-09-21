package com.aditya.array.problems;

public  class Practice   implements  Cloneable{

    String name="ADITYA";
    public Practice() {
        super();
    }
    @Override
    public boolean equals(Object practice) {
        return ((Practice) practice).name.equalsIgnoreCase(this.name)?true:false;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    public Practice copy() throws CloneNotSupportedException {
        return (Practice)this.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Practice practice=new Practice();
        Practice practice2= practice.copy();
        practice2.name="ADITY";

        practice.name="ADITYA";
        System.out.println(practice.equals(practice2));

    }
}
