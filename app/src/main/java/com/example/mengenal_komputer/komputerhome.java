package com.example.mengenal_komputer;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class komputerhome extends AppCompatActivity {
    RelativeLayout rlyout;
    AnimationDrawable anmtDrwb;
    Button sejarah,komponen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komputerhome);
        sejarah = (Button) findViewById(R.id.btnsejarah);
        komponen = (Button) findViewById(R.id.btnkomponen);
        rlyout = (RelativeLayout) findViewById(R.id.rlkhome);
        anmtDrwb = (AnimationDrawable) rlyout.getBackground();
        anmtDrwb.setEnterFadeDuration(4000);
        anmtDrwb.setExitFadeDuration(2000);
        sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),SejarahKomputer.class);
                startActivity(a);
            }
        });
        komponen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getApplicationContext(),komponenkomputer.class);
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
