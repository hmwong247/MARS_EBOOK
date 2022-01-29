package com.mars_ebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mars_ebook.R;

import java.util.List;

public class ChapterListAdapter extends RecyclerView.Adapter<ChapterViewHolder> {

    private Context context;
    private List<Chapter> cardList;

    public ChapterListAdapter(Context mainActivity, List<Chapter> cardList) {
        this.context = mainActivity;
        this.cardList = cardList;
    }

    @Override
    public ChapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_chapter_recycler, parent, false);
        return new ChapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ChapterViewHolder holder, int position) {
        final Chapter card = cardList.get(position);
        holder.getTv_chapterNum().setText(String.valueOf(card.getChapterNum()));
        holder.getTv_chapterName().setText(String.valueOf(card.getChapterName()));
        holder.getTv_link().setText(String.valueOf(card.getLink()));
        holder.getTv_like().setText(String.valueOf(card.getLike()));
        holder.getTv_dislike().setText(String.valueOf(card.getDislike()));
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }

}
