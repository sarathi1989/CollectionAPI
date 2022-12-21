package com.sf.collectionapi;

import android.util.Log;

import java.util.ArrayList;

public class Container<T extends  Number>{

    public static final String TAG = Container.class.getSimpleName();
    T value;
    void show() {
        Log.v(TAG, "Container Class :: " + value.getClass().getSimpleName() +" values :: "+value);
    }


    void demo(ArrayList<? extends T> obj){

    }
}
