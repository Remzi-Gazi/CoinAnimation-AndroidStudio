package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
	AnimationDrawable coin_animation;
	ImageView imageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imageView = (ImageView)findViewById(R.id.coin_animation);
		imageView.setImageResource(R.drawable.coin_animation);
		
		coin_animation=(AnimationDrawable)imageView.getDrawable();
		//coin_animation = imageView.getBackground();
		
		
	}
	
	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		imageView.setMaxWidth(imageView.getWidth());
		
		coin_animation.start();
		
		
		
		
	}
	
	
	
	
}
