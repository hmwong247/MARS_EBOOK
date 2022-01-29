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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Chapter> ChapterList = new ArrayList<Chapter>();
        ChapterList.add(new Chapter("1", "aa", "a1", 1, 1));
        ChapterList.add(new Chapter("2", "bb", "a2", 1, 1));
        ChapterList.add(new Chapter("3", "cc", "a3", 1, 1));
        ChapterList.add(new Chapter("4", "dd", "a4", 1, 1));
        ChapterList.add(new Chapter("5", "ee", "a5", 1, 1));

        RecyclerView bookRecycler = (RecyclerView) findViewById(R.id.recycler_book);
        bookRecycler.setLayoutManager(new LinearLayoutManager(this));
        bookRecycler.setAdapter(new ChapterListAdapter(this, ChapterList));

        final Button button = findViewById(R.id.loginButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,loginActivity.class);
                startActivity(intent);
            }
});
}
}