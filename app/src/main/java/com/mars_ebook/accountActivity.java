package com.mars_ebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class accountActivity extends AppCompatActivity {
    private Button chapterButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        List<Book> BookList = new ArrayList<Book>();
        BookList.add(new Book("1", "aa", "a1", 1356));
        BookList.add(new Book("2", "aa", "a1", 1356));
        BookList.add(new Book("3", "aa", "a1", 1356));
        BookList.add(new Book("4", "aa", "a1", 1356));
        BookList.add(new Book("5", "aa", "a1", 1356));
        BookList.add(new Book("6", "aa", "a1", 1356));
        BookList.add(new Book("7", "aa", "a1", 1356));

        RecyclerView bookRecycler = (RecyclerView) findViewById(R.id.recycler_book);
        bookRecycler.setLayoutManager(new LinearLayoutManager(this));
        bookRecycler.setAdapter(new BookListAdapter(this, BookList));
//        chapterButton=(Button)findViewById(R.id.chapterButton) ;
//        chapterButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent =new Intent(accountActivity.this,ChapterActivity.class);
//                startActivity(intent);
//            }
//        });
}
}
