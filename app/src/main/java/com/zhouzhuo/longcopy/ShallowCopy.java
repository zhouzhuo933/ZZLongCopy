package com.zhouzhuo.longcopy;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by zhouzhuo on 2017/11/15.
 */

public class ShallowCopy implements Cloneable{
    public String text;

    public ArrayList<String> list = new ArrayList<>();
    public ShallowCopy(){
        Log.d("zhouzhuo","------ShallowCopy 构造函数------");
    }

    public void show(){
        Log.d("zhouzhuo","text=="+text);
        for (int i=0;i<list.size();i++){
            Log.d("zhouzhuo","list=="+list.get(i));
        }
    }

    public void add(String text){
        list.add(text);
    }

    @Override
    protected ShallowCopy clone() {
        try {
            ShallowCopy copy = (ShallowCopy) super.clone();
            copy.text = this.text;
            copy.list = this.list;//如果
            return copy;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
