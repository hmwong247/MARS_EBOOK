package com.mars_ebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mars_ebook.R;

import java.util.ArrayList;
import java.util.List;

public class ChapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);

        List<Chapter> ChapterList = new ArrayList<Chapter>();
        ChapterList.add(new Chapter("Ch1", "Getting Started", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", 123, 62));
        ChapterList.add(new Chapter("Ch2", "Getting Started", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", 123, 67));
        ChapterList.add(new Chapter("Ch3", "Getting Good", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", 69, 88));
        ChapterList.add(new Chapter("Ch4", "Getting Great", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", 169, 69));
        ChapterList.add(new Chapter("Ch5", "Keep it on", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", 66, 48));

        RecyclerView bookRecycler = (RecyclerView) findViewById(R.id.recycler_book);
        bookRecycler.setLayoutManager(new LinearLayoutManager(this));
        bookRecycler.setAdapter(new ChapterListAdapter(this, ChapterList));

    }
}