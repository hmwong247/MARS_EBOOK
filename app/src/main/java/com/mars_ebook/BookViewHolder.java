package com.mars_ebook;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolder extends RecyclerView.ViewHolder {

    private TextView tv_title, tv_author, tv_publisher;
    private ImageView img_fav;

    public BookViewHolder(@NonNull View itemView) {
        super(itemView);
        this.tv_title = (TextView) itemView.findViewById(R.id.tv_title);
        this.tv_author = (TextView) itemView.findViewById(R.id.tv_author);
        this.tv_publisher = (TextView) itemView.findViewById(R.id.tv_publisher);
        this.img_fav = (ImageView) itemView.findViewById(R.id.img_fav);
    }

    public TextView getTv_title() {
        return tv_title;
    }

    public TextView getTv_author() {
        return tv_author;
    }

    public TextView getTv_publisher() {
        return tv_publisher;
    }

    public ImageView getImg_fav() {
        return img_fav;
    }


    public void setTv_title(TextView tv_title) {
        this.tv_title = tv_title;
    }

    public void setTv_author(TextView tv_author) {
        this.tv_author = tv_author;
    }

    public void setTv_publisher(TextView tv_publisher) {
        this.tv_publisher = tv_publisher;
    }

    public void setImg_fav(ImageView img_fav) {
        this.img_fav = img_fav;
    }
}
