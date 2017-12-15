package in.recycleview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import in.recycleview.R;
import in.recycleview.adapter.MovieAdapter;
import in.recycleview.model.Movie;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle);

        movieAdapter = new MovieAdapter(movieList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(movieAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Movie movie = new Movie("James Bond : Dr.No", "8/10", "1962", R.drawable.jb_1);
        movieList.add(movie);

        movie = new Movie("James Bond : From Russia with love", "9/10", "1963", R.drawable.jb_2);
        movieList.add(movie);

        movie = new Movie("James Bond : Goldfinger", "8.5 / 10", "1964", R.drawable.jb_3);
        movieList.add(movie);

        movie = new Movie("James Bond : Thunderball", "6/10", "1965", R.drawable.jb_4);
        movieList.add(movie);

        movie = new Movie("James Bond : You only Live Twice", "6/10", "1967", R.drawable.jb_5);
        movieList.add(movie);

        movie = new Movie("James Bond : On her Majesty Secret Service", "8/10", "1969", R.drawable.jb_6);
        movieList.add(movie);

        movie = new Movie("James Bond : Diamonds are Forever", "7/10", "1971", R.drawable.jb_7);
        movieList.add(movie);

        movie = new Movie("James Bond : Live and Let Die", "6.5/10", "1973", R.drawable.jb_8);
        movieList.add(movie);

        movie = new Movie("James Bond : Man with Golden Gun", "8.4/10", "1974", R.drawable.jb_9);
        movieList.add(movie);

        movieAdapter.notifyDataSetChanged();
    }
}

