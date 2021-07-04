package com.example.mengenal_komputer;

import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;

public class videokomponenlaptop extends AppCompatActivity {
    RelativeLayout rlyout;
    AnimationDrawable anmtDrwb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videokomponenlaptop);
        rlyout = (RelativeLayout) findViewById(R.id.komponenlaptopvidrlyout);
        anmtDrwb = (AnimationDrawable) rlyout.getBackground();
        anmtDrwb.setEnterFadeDuration(4000);
        anmtDrwb.setExitFadeDuration(2000);
        VideoView view = findViewById(R.id.videokomlap);
        String vidpath = "android.resource://"+getPackageName()+"/"+R.raw.komponenlaptop;
        Uri u = Uri.parse(vidpath);
        view.setVideoURI(u);

        MediaController mc = new MediaController(this);
        view.setMediaController(mc);
        mc.setAnchorView(view);
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
