package com.company;

public class StringArray implements IArray{

    String [] strArray = new String[5];
    int indexStr = 0;



    @Override
    public void insert() {
        System.out.println("Enter the strArray values:");
        for (int i=0;i<5;i++){
            if (indexStr == strArray.length)
                doubleArray();
            System.out.print("strArray["+indexStr+"]= ");
            strArray[indexStr] = input.nextLine();
            indexStr++;
        }
        System.out.println();
    }

    @Override
    public void doubleArray() {
        String [] newArray = new String[strArray.length * 2];
        for (int i=0;i<strArray.length;i++){
            newArray[i]=strArray[i];
        }
        strArray=newArray;
    }

    @Override
    public void print() {
        System.out.print("print strArray: ");
        for (String s : strArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    @Override
    public <T> void get(T element) {
        if((int)element < strArray.length)
            System.out.println("text = "+ strArray[(int)element]);
        else
            System.out.println("does not exist!");
    }

    @Override
    public <T> void getIndex(T element) {
        boolean b = false;
        for (int i=0;i<strArray.length;i++){
            if(strArray[i].equals(element)){
                System.out.println("index "+element+" = "+ i);
                b = true;
            }
        }
        if(!b)
            System.out.println("does not exist!");
    }

    @Override
    public <T> void deleteIndex(T index) {
        String [] newArray = new String[strArray.length - 1];
        for(int i=0;i<newArray.length;i++){
            if(i < (int)index)
                newArray[i] = strArray[i];
            else
                newArray[i] = strArray[i+1];
        }
        strArray = newArray;
    }

    @Override
    public <T> void delete(T element) {
        int counter = 0;
        for (String s : strArray) {
            if (s.equals(element))
                counter++;
        }
        String [] newArray = new String[strArray.length - counter];
        int j = 0;
        for (int i=0;i<newArray.length;i++) {
            if (strArray[j].equals(element)){
                newArray[i] = strArray[j + 1];
                i--;
            }
            else{
                newArray[i] = strArray[j];
            }
            j++;
        }
        strArray = newArray;
    }
}
