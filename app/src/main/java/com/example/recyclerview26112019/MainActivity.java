package com.example.recyclerview26112019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvMonan;
    MonanAdapter mMonanAdapter;
    ArrayList<Monan> mArraylistMonan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvMonan = findViewById(R.id.rcvMonan);
        mock


    }
}
