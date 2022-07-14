package com.company;

public class Main {

    public static void main(String[] args) {
        StringArray strClass = new StringArray();
        IntegerArray intClass = new IntegerArray();

        intClass.insert();
        intClass.print();
        intClass.get(2);
        intClass.getIndex(5);
        intClass.print();
        intClass.deleteIndex(3);
        intClass.print();
        intClass.delete(66);
        intClass.print();

        strClass.insert();
        strClass.print();
        strClass.get(2);
        strClass.getIndex("java");
        strClass.print();
        strClass.deleteIndex(2);
        strClass.print();
        strClass.delete("java js");
        strClass.print();
    }
}
