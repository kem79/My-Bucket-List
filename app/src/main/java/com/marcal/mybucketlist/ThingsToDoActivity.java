package com.marcal.mybucketlist;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] thingsToDo = {
                new BucketListEntry("Climb Mt Kilimanjaro",
                        "Do it the difficult way.",
                        R.drawable.kilimanjaro,
                        5),
                new BucketListEntry("Experience the Northern Light",
                        "Somewhere in the Arctic circle, probably Norway.",
                        R.drawable.northern_lights,
                        4.5f),
                new BucketListEntry("Road trip across USA",
                        "Bike across Monument valley and visit Yosemite and Yellowstone. Experience american wilderness.",
                        R.drawable.road_trip,
                        5),
                new BucketListEntry("Scubadive",
                        "In Koh Tao in Thailand.",
                        R.drawable.scubadive,
                        4f),
                new BucketListEntry("Skydive",
                        "Preferably at the demarcation of land and sea.",
                        R.drawable.skydive,
                        3.5f)
        };
    }
}