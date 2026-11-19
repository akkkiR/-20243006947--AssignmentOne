package com.example.a20243006947_assignmentone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_TOPIC_INDEX = "extra_topic_index";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int index = getIntent().getIntExtra(EXTRA_TOPIC_INDEX, 0);

        String[] titles = getResources().getStringArray(R.array.topic_titles);
        String[] details = getResources().getStringArray(R.array.topic_details);
        String[] imageNames = getResources().getStringArray(R.array.topic_images);

        // 防止 index 越界，不使用 if/switch
        index = Math.max(0, Math.min(index, titles.length - 1));

        TextView headerTitle = findViewById(R.id.detail_header_title);
        TextView contentTitle = findViewById(R.id.detail_content_title);
        TextView content = findViewById(R.id.detail_content);
        ImageView icon = findViewById(R.id.detail_icon);

        headerTitle.setText(titles[index]);
        contentTitle.setText(titles[index]);
        content.setText(details[index]);

        int imageResId = getResources().getIdentifier(
                imageNames[index],
                "drawable",
                getPackageName()
        );
        icon.setImageResource(imageResId);
    }
}