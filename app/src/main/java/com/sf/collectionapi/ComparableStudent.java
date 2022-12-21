package com.sf.collectionapi;

public class ComparableStudent implements Comparable<ComparableStudent>{

    int rollNo;
    int marks;

    public ComparableStudent(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ComparableStudent{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(ComparableStudent comparableStudent) {
        return this.marks>comparableStudent.marks?-1:0;
    }
}
