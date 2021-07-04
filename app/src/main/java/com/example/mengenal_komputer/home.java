package com.example.mengenal_komputer;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class home extends AppCompatActivity {
    RelativeLayout rlyout;
    AnimationDrawable anmtDrwb;
    ImageButton komputer,laptop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button keluar = findViewById(R.id.btnkeluarhome);
        komputer = (ImageButton) findViewById(R.id.imgbtnkomp);
        laptop = (ImageButton) findViewById(R.id.imgbtnlptp);
        rlyout = (RelativeLayout) findViewById(R.id.rlyouthome);
        anmtDrwb = (AnimationDrawable) rlyout.getBackground();
        anmtDrwb.setEnterFadeDuration(5000);
        anmtDrwb.setExitFadeDuration(2000);

        komputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),komputerhome.class);
                startActivity(a);
            }
        });
        laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getApplicationContext(),laptophome.class);
                startActivity(b);
            }
        });
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
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

    public void onBackPressed()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah kamu yakin ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })

                .setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
