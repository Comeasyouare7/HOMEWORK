package com.example.hasee.homework3;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1= (Button) findViewById(R.id.button);
        Button btn2= (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.button){
            fragment1 fragment1=new fragment1();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction transaction=fragmentManager.beginTransaction();
            transaction.replace(R.id.frameLayout,fragment1);
            transaction.commit();
        }else {
            fragment2 fragment2=new fragment2();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction transaction=fragmentManager.beginTransaction();
            transaction.replace(R.id.frameLayout,fragment2);
            transaction.commit();
        }
    }
}
