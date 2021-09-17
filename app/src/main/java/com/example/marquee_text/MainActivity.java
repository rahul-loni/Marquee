package com.example.marquee_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView,text2;
    Button btn_animation1,btn_animation2;
    Animation animUp,animDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView=(TextView) findViewById(R.id.marquee);
        text2=findViewById(R.id.marquee2);

        textView.setSelected(true);
        text2.setSelected(true);


        btn_animation1=(Button)findViewById(R.id.btn1);
        btn_animation2=(Button)findViewById(R.id.btn2);

        animUp= AnimationUtils.loadAnimation(this,R.anim.anim_up);
        animDown= AnimationUtils.loadAnimation(this,R.anim.anim_down);


        btn_animation1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP){
                    btn_animation1.startAnimation(animUp);

                }else if(event.getAction()==MotionEvent.ACTION_DOWN){
                    btn_animation1.startAnimation(animDown);

                }

                return true;
            }
        });


        btn_animation2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP){
                    btn_animation2.startAnimation(animUp);

                }else if(event.getAction()==MotionEvent.ACTION_DOWN){
                    btn_animation2.startAnimation(animDown);

                }

                return true;
            }
        });








    }
}