package com.fdln.nol19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fdln.myandroidlibiv.MyClassIV;
import com.fdln.myandroidlibv.MyClassV;
import com.fdln.myjavalibiv.MyClass;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    MyClassIV myClassIV = new MyClassIV();
    MyClass myClass = new MyClass();
    MyClassV myClassV = new MyClassV();
  }
}