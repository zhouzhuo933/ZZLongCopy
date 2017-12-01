package com.zhouzhuo.longcopy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //深浅拷贝只有引用类型  浅拷贝是一模一样，一个改变会改变另一个，深拷贝不是一模一样
    //深浅拷贝只是针对引用类型的
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void deep(View view){
        Toast.makeText(MainActivity.this,"deep",Toast.LENGTH_SHORT).show();
        DeepCopy deepCopy = new DeepCopy();
        deepCopy.text = "deepCopy 之前";
        deepCopy.add("00000");

        DeepCopy deepCopy1 = deepCopy.clone();
        deepCopy1.text ="deepCopy 之后";
        deepCopy1.add("111");
        Log.d("zhouzhuo","============");
        deepCopy.show();
        Log.d("zhouzhuo","============");
        deepCopy1.show();
        Log.d("zhouzhuo","============");

    }


    public void shallow(View view){
        Toast.makeText(MainActivity.this,"shallow",Toast.LENGTH_SHORT).show();

        ShallowCopy shallowCopy = new ShallowCopy();
        shallowCopy.text = "shallowCopy 之前";
        shallowCopy.add("00000");
        ShallowCopy shallowCopy1 = shallowCopy.clone();
        shallowCopy1.text ="shallowCopy 之后";
        shallowCopy1.add("111");
        Log.d("zhouzhuo","============");
        shallowCopy.show();
        Log.d("zhouzhuo","============");
        shallowCopy1.show();
        Log.d("zhouzhuo","============");
    }


    public void jump(View view){
        Intent intent = new Intent();
        intent.setClass(this,OneActivity.class);
        Intent intent1 = (Intent) intent.clone();
        intent1.setClass(this,TwoActivity.class);
        startActivity(intent);

    }


}
