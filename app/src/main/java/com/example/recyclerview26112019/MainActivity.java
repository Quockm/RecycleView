package com.example.recyclerview26112019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

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
        mArraylistMonan = Monan.mock();
        mMonanAdapter = new MonanAdapter(mArraylistMonan);
        mRcvMonan.setAdapter(mMonanAdapter);

        mMonanAdapter.setonItemClick(new OnListener() {
            @Override
            public void onClick(int position) {
                mArraylistMonan.remove(position);
                mMonanAdapter.notifyItemRemoved(position);
                // notifydatasetchanged
            }
        });

    }
}
