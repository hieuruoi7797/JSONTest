package vn.hieuruoi.jsontest0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import vn.hieuruoi.jsontest0.models.Data;


public class MainActivity extends AppCompatActivity implements FetchData.OnLoadDataFinishedListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String END_POINT_URL = "https://api.github.com/users/google/repos";
    private RecyclerView mRecyclerData;
    private DataAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ABCD");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerData = findViewById(R.id.recycler_data);
        new FetchData( this).execute(END_POINT_URL);

    }

    @Override
    public void onLoadFinished(ArrayList<Data> datas) {
        Log.d(TAG, "onLoadFinished: ABCD");
        mAdapter = new DataAdapter(this,datas);
        mRecyclerData.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerData.setAdapter(mAdapter);
    }
}
