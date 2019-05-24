package com.cmpundhir.cm.lottieanimationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView animation_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animation_view = findViewById(R.id.animation_view);

        animation_view.addAnimatorListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animation) {
                super.onAnimationCancel(animation);
                Log.d("animation_view","onAnimationCancel");
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                Log.d("animation_view","onAnimationEnd");
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                super.onAnimationRepeat(animation);
                Log.d("animation_view","onAnimationRepeat");
            }

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
                Log.d("animation_view","onAnimationStart");
            }

            @Override
            public void onAnimationPause(Animator animation) {
                super.onAnimationPause(animation);
                Log.d("animation_view","onAnimationPause");
            }

            @Override
            public void onAnimationResume(Animator animation) {
                super.onAnimationResume(animation);
                Log.d("animation_view","onAnimationResume");
            }
        });
        animation_view.playAnimation();
        //animation_view.cancelAnimation();
        //animation_view.setProgress(0.5f);
        animation_view.setRepeatCount(2);
        animation_view.setSpeed(2.5f);
        //animation_view.setAnimation("https://assets8.lottiefiles.com/packages/lf20_tkM0Bo.json");
    }
}
