package com.example.jeremy.anews.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jeremy.anews.R;

import java.util.List;

/**
 * Created by Jeremy on 12/14/2016.
 */

public class NewsDataAdapter extends RecyclerView.Adapter<NewsDataAdapter.ViewHolder> {

    private List<News> _news;

    public NewsDataAdapter(List<News> news)
    {
        _news = news;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        News news = _news.get(position);
        holder.title.setText(news.getTitle());
        holder.description.setText(news.getDescription());
        holder.fullNews.setText(news.getFullNews());
    }

    @Override
    public int getItemCount() {
        return _news.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView title, description, fullNews;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);
            fullNews = (TextView) itemView.findViewById(R.id.fullNews);
        }
    }
}
