package in.recycleview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import in.recycleview.R;
import in.recycleview.ViewHolder.MovieHolder;
import in.recycleview.model.Movie;

/**
 * Created by HP on 15-Dec-17.
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieHolder> {
    private final Context context;
    private List<Movie> items;

    public MovieAdapter(List<Movie> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public MovieHolder onCreateViewHolder(ViewGroup parent,
                                          int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);
        return new MovieHolder(v);
    }

    @Override
    public void onBindViewHolder(MovieHolder holder, int position) {
        Movie item = items.get(position);
        holder.title.setText(item.getTitle());
        holder.rating.setText(item.getRating());
        holder.year.setText(item.getYear());
        holder.image.setBackgroundResource(item.getImage());

    }

    @Override
    public int getItemCount() {
        if (items == null) {
            return 0;
        }
        return items.size();
    }
}