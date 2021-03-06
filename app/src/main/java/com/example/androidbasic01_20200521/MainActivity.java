package com.example.androidbasic01_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import com.example.androidbasic01_20200521.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }


//이벤트 처리 코드 모아두는 곳
    void  setupEvents(){
        binding.goToFirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FirstActivity로 이동.

//                비행기 티켓 발권.
                Intent  myIntent = new Intent(MainActivity.this, FirstActivity.class);
//               startActivity를 이용하여 출발함.
                startActivity(myIntent);

//                이 액티비티를 종료하는 코드 (이동처럼 보이도록 처리.)
//                finish();

            }
        });
    }

//    화면에 나와야할 데이터 세팅 코드 모아두는 곳곳
    void setValues(){

    }
}
