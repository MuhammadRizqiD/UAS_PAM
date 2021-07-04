package com.example.mengenal_komputer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SejarahKomputer extends AppCompatActivity {
Button back,video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah_komputer);
        back = (Button) findViewById(R.id.btback);
        video = (Button) findViewById(R.id.btvid);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getApplicationContext(),videosejarahkomputer.class);
                startActivity(b);
            }
        });
    }
}
