package com.mars_ebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mars_ebook.R;

import java.util.List;

public class ChapterListAdapter extends RecyclerView.Adapter<ChapterListAdapter.ChapterViewHolder> {

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

    public class ChapterViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_chapterNum, tv_chapterName, tv_link, tv_like, tv_dislike;

        public ChapterViewHolder(View itemView) {
            super(itemView);
            this.tv_chapterNum = (TextView) itemView.findViewById(R.id.tv_chapterNum);
            this.tv_chapterName = (TextView) itemView.findViewById(R.id.tv_chapterName);
            this.tv_link = (TextView) itemView.findViewById(R.id.tv_link);
            this.tv_like = (TextView) itemView.findViewById(R.id.tv_like);
            this.tv_dislike = (TextView) itemView.findViewById((R.id.tv_dislike));

        }

        public TextView getTv_chapterNum() {
            return (TextView) this.tv_chapterNum;
        }

        public TextView getTv_chapterName() {
            return tv_chapterName;
        }

        public TextView getTv_link() {
            return tv_link;
        }

        public TextView getTv_like() {
            return tv_like;
        }

        public TextView getTv_dislike() {
            return tv_dislike;
        }

        public void setTv_chapterNum(TextView tv_chapterNum) {
            this.tv_chapterNum = tv_chapterNum;
        }

        public void setTv_chapterName(TextView tv_chapterName) {
            this.tv_chapterName = tv_chapterName;
        }

        public void setTv_link(TextView tv_link) {
            this.tv_link = tv_link;
        }

        public void setTv_like(TextView tv_like) {
            this.tv_like = tv_like;
        }

        public void setTv_dislike(TextView tv_dislike) {
            this.tv_dislike = tv_dislike;
        }
    }

}
