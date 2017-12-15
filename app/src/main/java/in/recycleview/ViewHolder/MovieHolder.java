package in.recycleview.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import in.recycleview.R;

/**
 * Created by HP on 15-Dec-17.
 */

public class MovieHolder extends RecyclerView.ViewHolder {

    public TextView title, year, genre;


    public MovieHolder(View itemView) {
        super(itemView);


        title = itemView.findViewById(R.id.title);
        year = itemView.findViewById(R.id.year);
        genre = itemView.findViewById(R.id.genre);
    }
}
