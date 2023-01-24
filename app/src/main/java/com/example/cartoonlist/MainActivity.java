package com.example.cartoonlist;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView horizontalRecyclerView = findViewById(R.id.horizontalRecyclerView);
        recyclerView.setHasFixedSize(true);
        horizontalRecyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));


        CartoonData[] myCartoonData = new CartoonData[]{
                new CartoonData("Doraemon","I am a Robot",R.drawable.doraemon),
                new CartoonData("Mario","I am Adventurous",R.drawable.mario),
                new CartoonData("Pooh","I am Fat",R.drawable.pooh),
                new CartoonData("Krishna","I am from Mathura",R.drawable.krishna),
                new CartoonData("Tom","I am a Cat",R.drawable.tom),
                new CartoonData("Mermaid","I am a mermaid",R.drawable.mermaid),
                new CartoonData("Super Mario","I play Games",R.drawable.super_mario),
                new CartoonData("Tweety","I am Cute",R.drawable.tweety),
                new CartoonData("Winnie The Pooh","I love my Friends",R.drawable.winnie),
        };

        CartoonAdaptor myCartoonAdaptor = new CartoonAdaptor(myCartoonData,MainActivity.this);
        PhotosAdaptor myPhotosAdaptor = new PhotosAdaptor(myCartoonData,MainActivity.this);
        recyclerView.setAdapter(myCartoonAdaptor);
        horizontalRecyclerView.setAdapter(myPhotosAdaptor);

    }
}