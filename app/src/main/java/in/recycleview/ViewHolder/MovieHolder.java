package in.recycleview.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import in.recycleview.R;

/**
 * Created by HP on 15-Dec-17.
 */

public class MovieHolder extends RecyclerView.ViewHolder {

    public ImageView image;
    public TextView title, year, rating;


    public MovieHolder(View itemView) {
        super(itemView);

        image = itemView.findViewById(R.id.image);
        title = itemView.findViewById(R.id.title);
        year = itemView.findViewById(R.id.year);
        rating = itemView.findViewById(R.id.rating);
    }
}
