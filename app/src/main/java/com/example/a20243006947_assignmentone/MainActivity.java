package com.example.a20243006947_assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnFacilities = findViewById(R.id.btnFacilities);
        ImageButton btnEvents = findViewById(R.id.btnEvents);
        ImageButton btnClubs = findViewById(R.id.btnClubs);
        ImageButton btnSupport = findViewById(R.id.btnSupport);

        btnFacilities.setOnClickListener(v -> {
            Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
            openDetail(0);
        });

        btnEvents.setOnClickListener(v -> {
            Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
            openDetail(1);
        });

        btnClubs.setOnClickListener(v -> {
            Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
            openDetail(2);
        });

        btnSupport.setOnClickListener(v -> {
            Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
            openDetail(3);
        });
    }

    private void openDetail(int topicIndex) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_TOPIC_INDEX, topicIndex);
        startActivity(intent);
    }
}