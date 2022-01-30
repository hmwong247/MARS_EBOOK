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
        BookList.add(new Book("Interpersonal communication", "Peter Hartley.", "2nd ed. London ; New York : Routledge, 1999"));
        BookList.add(new Book("Physics", "John D. Cutnell & Kenneth W. Johnson.", "7th ed. Hoboken, NJ : Wiley, c2007"));
        BookList.add(new Book("Sybase architecture and administration", "John Kirkwood.", "New York ; London : Ellis Horwood, 1993"));
        BookList.add(new Book("Critical and clinical cartographies : architecture, robotics, medicine, philosophy", "edited by Andrej Radman and Heidi Sohn.", "Edinburgh : Edinburgh University Press, 2017"));
        BookList.add(new Book("Mathematics for Computer Graphics", "by John Vince.", "4th ed. 2014. London : Springer London : Imprint: Springer, 2014"));
        BookList.add(new Book("Materials science and design for engineers", "Zainul Huda and Robert Bulpett.", "Zurich-Durnten, Switzerland ; Enfield, New Hampshire : Trans Tech Publications, 2012"));
        BookList.add(new Book("Combinatorial materials science", "edited by Balaji Narasimhan, Surya K. Mallapragada, Marc D. Porter.", "Hoboken, N.J. : Wiley-Interscience, c2007"));

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
