package com.mars_ebook;

import android.os.Bundle;

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

//        List<Chapter> ChapterList = new ArrayList<Chapter>();
//        ChapterList.add(new Chapter("1", "aa", "a1", 1, 1));
//        ChapterList.add(new Chapter("2", "bb", "a2", 21, 1));
//        ChapterList.add(new Chapter("3", "cc", "a3", 1, 1));
//        ChapterList.add(new Chapter("4", "dd", "a4", 1, 3));
//        ChapterList.add(new Chapter("5", "ee", "a5", 1, 1));
//        ChapterList.add(new Chapter("6", "ff", "a6", 7, 1));
//        ChapterList.add(new Chapter("7", "gg", "a7", 1, 0));

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
    }
}