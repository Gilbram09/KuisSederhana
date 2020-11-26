package com.example.kuissederhana;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityLevel extends AppCompatActivity {
    ListView listView;

    String[] judulList2 = {
            "Level 2",

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        listView = findViewById(R.id.listview);

        CustomActivityLevel adapter = new CustomActivityLevel(this, judulList2);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int ii, long l) {
                Intent jancuk = new Intent(ActivityLevel.this, Main4Activity.class);
                startActivity(jancuk);
                Toast.makeText(getApplicationContext(),  judulList2[ii],
                        Toast.LENGTH_SHORT).show();
            }

        });


    }
}
