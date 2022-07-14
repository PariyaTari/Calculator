package com.company;

import java.util.Collections;
import java.util.Scanner;

public interface IArray {
    Scanner input = new Scanner(System.in);

    void insert();

    void doubleArray();

    void print();

    <T> void get(T index);

    <T> void getIndex(T element);

    <T> void deleteIndex(T index);

    <T> void  delete(T element);
}
