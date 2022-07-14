package com.company;

import java.util.Collections;

public class IntegerArray implements IArray {

    int [] intArray = new int[5];
    int indexInt = 0;

    @Override
    public void insert() {
        System.out.println("Enter the intArray values:");
        for (int i=0;i<5;i++){
            if (indexInt == intArray.length)
                doubleArray();
            System.out.print("intArray["+indexInt+"]= ");
            intArray[indexInt] = input.nextInt();
            indexInt++;
        }
        System.out.println();
    }

    @Override
    public void doubleArray() {
        int [] newArray = new int[intArray.length * 2];
        for (int i=0;i<intArray.length;i++){
            newArray[i]=intArray[i];
        }
        intArray=newArray;
    }

    @Override
    public void print() {
        System.out.print("print intArray: ");
        for (int i=0;i<intArray.length;i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }

    @Override
    public <T> void get(T index) {
        if((int)index < intArray.length)
            System.out.println("number = "+ intArray[(int)index]);
        else
            System.out.println("does not exist!");
    }

    @Override
    public <T> void getIndex(T element){
        boolean bool = false;
        for (int i=0;i<intArray.length;i++){
            if((int)element == intArray[i]){
                System.out.println("index "+element+" = "+ i);
                bool = true;
            }
        }
        if(!bool)
            System.out.println("does not exist!");
    }

    @Override
    public <T> void deleteIndex(T index) {
        int [] newArray = new int[intArray.length - 1];
        for(int i=0;i<newArray.length;i++){
            if(i < (int)index)
                newArray[i] = intArray[i];
            else
                newArray[i] = intArray[i+1];
        }
        intArray = newArray;
    }

    @Override
    public <T> void delete(T element) {
        int counter = 0;
        for (int i=0;i<intArray.length;i++){
            if((int)element == intArray[i])
                counter++;
        }
        int [] newArray = new int[intArray.length - counter];
        int j = 0;
        for (int i=0;i<newArray.length;i++){
            if((int)element != intArray[j]) {
                newArray[i] = intArray[j];
            } else{
                newArray[i] = intArray[j+1];
                i--;
            }
            j++;
        }
        intArray = newArray;
    }
}
