package com.example.p.workout;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WorkoutDetailFragment frag = (WorkoutDetailFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setWorkoutId(1);
    }
}
