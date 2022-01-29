package com.mars_ebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookListAdapter extends RecyclerView.Adapter<BookViewHolder>{

    private Context context;
    private List<Book> cardList;

    public BookListAdapter(Context mainActivity, List<Book> cardList) {
        this.context = mainActivity;
        this.cardList = cardList;
    }

    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_book_recycler, parent, false);
        return new BookViewHolder(view);
    }

    /**
     * @TODO add image
     */

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        final Book card = cardList.get(position);
        holder.getTv_title().setText(String.valueOf(card.getTitle()));
        holder.getTv_author().setText(String.valueOf(card.getAuthor()));
        holder.getTv_publisher().setText(String.valueOf(card.getPublisher()));
//        holder.getImg_fav().setImageDrawable();
    }

    @Override
    public int getItemCount() {return cardList.size();}
}
