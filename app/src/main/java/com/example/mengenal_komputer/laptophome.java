package com.example.mengenal_komputer;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class laptophome extends AppCompatActivity {
    RelativeLayout rlylp;
    AnimationDrawable anmtDrwb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptophome);
        Button sej = findViewById(R.id.btsejarah);
        Button kom = findViewById(R.id.btkomponen);
        rlylp = (RelativeLayout) findViewById(R.id.rllaptophome);
        anmtDrwb = (AnimationDrawable) rlylp.getBackground();
        anmtDrwb.setEnterFadeDuration(4000);
        anmtDrwb.setExitFadeDuration(2000);
        sej.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),sejarahlaptop.class);
                startActivity(a);
            }
        });
        kom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getApplicationContext(),komponenlaptop.class);
                startActivity(b);
            }
        });
    }
    @Override
    protected void onPause() {
        super.onPause();

        if (anmtDrwb != null && anmtDrwb.isRunning()){
            anmtDrwb.stop();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (anmtDrwb!= null && !anmtDrwb.isRunning()){
            anmtDrwb.start();
        }
    }
}
