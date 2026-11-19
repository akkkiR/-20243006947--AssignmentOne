package com.example.a20243006947_assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout cardFacilities = findViewById(R.id.cardFacilities);
        LinearLayout cardEvents = findViewById(R.id.cardEvents);
        LinearLayout cardClubs = findViewById(R.id.cardClubs);
        LinearLayout cardSupport = findViewById(R.id.cardSupport);

        cardFacilities.setOnClickListener(v -> {
            Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
            openDetail(0);
        });

        cardEvents.setOnClickListener(v -> {
            Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
            openDetail(1);
        });

        cardClubs.setOnClickListener(v -> {
            Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
            openDetail(2);
        });

        cardSupport.setOnClickListener(v -> {
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
