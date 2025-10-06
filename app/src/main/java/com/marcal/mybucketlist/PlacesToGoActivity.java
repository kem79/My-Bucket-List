package com.marcal.mybucketlist;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] placesToGo = {
                new BucketListEntry("Vietnam",
                        "Hoi An, Hanoi",
                        R.drawable.kilimanjaro,
                        4),
                new BucketListEntry("Costa Rica",
                        "Rainforest of Central America.",
                        R.drawable.northern_lights,
                        4.5f),
                new BucketListEntry("Yosemite, US",
                        "Experience american wilderness.",
                        R.drawable.road_trip,
                        5),
                new BucketListEntry("Rome",
                        "Home of christianity.",
                        R.drawable.scubadive,
                        3.5f),
                new BucketListEntry("Corsica",
                        "Jewel of the mediterranean sea.",
                        R.drawable.skydive,
                        4.5f)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);
    }
}