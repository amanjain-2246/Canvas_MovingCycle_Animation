package com.example.daivansh.drawcanvas;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MovingCycle extends AppCompatActivity {
    ImageView cycle,tyre1,tyre2;
    Button move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moving_cycle);
        cycle=(ImageView)findViewById(R.id.imageView);
        tyre1=(ImageView)findViewById(R.id.imageView2);
        tyre2=(ImageView)findViewById(R.id.imageView3);
        move=(Button)findViewById(R.id.button);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animator=ObjectAnimator.ofFloat(cycle,"x",800,-50);
                animator.setDuration(2000);
               // animator.start();
                ObjectAnimator animator2=ObjectAnimator.ofFloat(tyre1,"x",860,0);
                ObjectAnimator animatorrotate1=ObjectAnimator.ofFloat(tyre1,"rotation",360,0);
                animatorrotate1.setDuration(2000);
                animator2.setDuration(2000);
               // animator2.start();
                ObjectAnimator animator3=ObjectAnimator.ofFloat(tyre2,"x",1560,680);
                ObjectAnimator animatorrotate2=ObjectAnimator.ofFloat(tyre2,"rotation",360,0);
                animatorrotate2.setDuration(2000);
                animator3.setDuration(2000);
                //animator3.start();
                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(animator,animator2,animator3,animatorrotate1,animatorrotate2);
                animatorSet.start();
            }
        });
    }
}
