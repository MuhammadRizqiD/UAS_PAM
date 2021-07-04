package com.example.mengenal_komputer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class videosejarahlaptop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videosejarahlaptop);
        VideoView view = findViewById(R.id.vidlaptop);
        String vidpath = "android.resource://"+getPackageName()+"/"+R.raw.sejarahlaptop;
        Uri u = Uri.parse(vidpath);
        view.setVideoURI(u);

        MediaController mc = new MediaController(this);
        view.setMediaController(mc);
        mc.setAnchorView(view);
    }
}
