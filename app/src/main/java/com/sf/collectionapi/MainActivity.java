package com.sf.collectionapi;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

//Collection 1.2
//Generic 1.5

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*int[] values1 = new int[50];
        values1[0] = 10;
        values1[1] = 90;
        values1[2] = 90;
        //values1[3] = "Sarathi";

        for (int i = 0; i<values1.length; i++) {
            Log.v(TAG, "integer value : : " + values1[i]);
        }*/


       /* Object[] values = new Object[100];
        values[0] = 10;
        values[1] = "sarathi";
*/
       /* for (int i = 0; i<values.length; i++) {
            Log.v(TAG, "object  value : : " + values[i]);
        }*/


        //Collection

       /* [Collection<Integer> collection = new ArrayList<Integer>();
        collection.add(100);
       // collection.add("Collection item 1");
        //collection.add("Collection item 2");
        //collection.add(4.5f);
        //collection.add(9.0);

        Iterator iterator = collection.iterator();

        Log.v(TAG, "Iterator " );
        while (iterator.hasNext()){
            Log.v(TAG, "Collection == Iterator  value : : " +iterator.next());
        }]*/




        //Generic

        /* Container<Number> obj =new Container<>();
         obj.value = 89.0;
         obj.show();
         obj.demo(new ArrayList<Integer>());*/

        List<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(-100);

        Collections.sort(list);
       // Collections.reverse(list);

        //list.add(1,-100);

        //list.remove(20);

       // list.remove(5);


        /*Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            Log.v(TAG, "List == Iterator  value : : " +iterator.next());
        }*/

        for(int i=0;i<list.size();i++){
            Log.v(TAG, "List == Enhanced  value : : " +list.get(i));
        }

       /* list.forEach(i-> {
                    Log.v(TAG, "List == Enhanced  value ==>: : " +i);
                }
                );*/



        //Vector

        ArrayList v1 = new ArrayList();
        Log.v(TAG, "List == capacity ==>: : " +v1.size());


        Vector v = new Vector();
        v.add(101);
        v.add(101);
        v.add(101);
        v.add(101);
        v.add(101);
        v.add(101);
        v.add(101);
        v.add(101);
        v.add(101);

        v.add(101);
        v.add(101);
        v.add(101);
        v.add(101);
        v.add(101);
        v.add(101);
        v.add(101);
        v.add(101);
        v.add(101);
        v.add(101);
        v.add(101);

        v.add(101);
        v.add(101);




        Log.v(TAG, "Vector == capacity ==>: : " +v.capacity());




        List<Student> students = new ArrayList<>();
        students.add(new Student(1,55));
        students.add(new Student(2,85));
        students.add(new Student(3,35));
        students.add(new Student(4,95));
        students.add(new Student(5,65));

       // Comparator<Student> com = new Comparatorimpl();

       /* Comparator<Student> com = ( s1,  s2) -> {

                *//*if(s1.marks<s2.marks){
                    return 1;
                }
                return -1;*//*
            return s1.marks<s2.marks?1:-1;

        };*/

        Collections.sort(students, ( s1,  s2) -> s1.marks<s2.marks?1:-1);

        for(Student i : students) {
            Log.v(TAG, "Student list data : : " +i);
        }


        List<ComparableStudent> comparableStudentList = new ArrayList<ComparableStudent>();
        comparableStudentList.add(new ComparableStudent(1,75));
        comparableStudentList.add(new ComparableStudent(2,95));
        comparableStudentList.add(new ComparableStudent(3,65));
        comparableStudentList.add(new ComparableStudent(4,85));
        comparableStudentList.add(new ComparableStudent(5,55));

        Collections.sort(comparableStudentList);


        for(ComparableStudent i : comparableStudentList) {
            Log.v(TAG, "Student list data(Comparable) : " +i);
        }

        //Set interface
        // -> It doest not contains any duplicate value
        // -> return true when add new element false when add duplicate element
        // -> Hashset -> there is no sequential order in the list
        // -> Treeset -> there is a sequential order in the list

        // set can be used below program
        // find the array has duplicate element

        //Ex:

        Set<Integer> val = new HashSet<>();
        Log.v(TAG, "HashSet value is  : " +val.add(10));
        Log.v(TAG, "HashSet value is  : " +val.add(20));
        Log.v(TAG, "HashSet value is  : " +val.add(30));
        Log.v(TAG, "HashSet value is  : " +val.add(30));



        for(int i : val){
            Log.v(TAG, "HashSet value is  : " +i);
        }


        Set<Integer> vals = new TreeSet<>();
        Log.v(TAG, "TreeSet value is  : " +vals.add(100));
        Log.v(TAG, "TreeSet value is  : " +vals.add(20));
        Log.v(TAG, "TreeSet value is  : " +vals.add(30));
        Log.v(TAG, "TreeSet value is  : " +vals.add(30));



        for(int i : vals){
            Log.v(TAG, "Treeset value is  : " +i);
        }

    }

}

