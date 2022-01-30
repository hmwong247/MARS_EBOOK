package com.mars_ebook;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.BookViewHolder>{

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

    public class BookViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_title, tv_author, tv_publisher;
        private ImageView img_fav;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            this.tv_author = (TextView) itemView.findViewById(R.id.tv_author);
            this.tv_publisher = (TextView) itemView.findViewById(R.id.tv_publisher);
            this.img_fav = (ImageView) itemView.findViewById(R.id.img_fav);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookListAdapter.this.context, ChapterActivity.class);
                    BookListAdapter.this.context.startActivity(intent);
                }
            });
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
}
