package com.neyena.hotmodels;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Slider extends AppCompatActivity {
    ViewFlipper v_flip;
    int images[]={R.raw.sunny, R.raw.mia, R.raw.poonam, R.raw.radhika};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

        v_flip=findViewById(R.id.bflip);

       /* for (int i=0; i<images.length; i++){
            slider(images[i]);
        } */

       for(int image: images){
            slider(image);
       }

    }

    public void slider(int image){

        ImageView immageView= new ImageView(this);
        immageView.setBackgroundResource(image);
        v_flip.addView(immageView);
        v_flip.setFlipInterval(2000);
        v_flip.setAutoStart(true);

        v_flip.setInAnimation(this, android.R.anim.slide_in_left);
        v_flip.setOutAnimation(this, android.R.anim.slide_out_right);

    }
}
