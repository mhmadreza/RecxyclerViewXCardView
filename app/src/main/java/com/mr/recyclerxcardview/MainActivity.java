package com.mr.recyclerxcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.mr.recyclerxcardview.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<ItemModel> listData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
    }

    private void setUI() {
        recyclerView = findViewById(R.id.rv_data_list);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        listData.add(new ItemModel("Gunawawan Wawan", R.drawable.ava_cowo));
        listData.add(new ItemModel("Guntur Dewantara", R.drawable.ava_cowo));
        listData.add(new ItemModel("Rahmat Hidayatullah", R.drawable.ava_cowo));
        listData.add(new ItemModel("Dwi Hardi Irawan", R.drawable.ava_cowo));
        listData.add(new ItemModel("Dedy Mulyadi", R.drawable.ava_cowo));
        listData.add(new ItemModel("Farhan Ramadhan", R.drawable.ava_cowo));
        listData.add(new ItemModel("Danang Prakoso", R.drawable.ava_cowo));
        listData.add(new ItemModel("Irene Wijaya", R.drawable.ava_cewe));
        listData.add(new ItemModel("Tika Pangestika", R.drawable.ava_cewe));
        listData.add(new ItemModel("Hanum Rahma", R.drawable.ava_cewe));
        listData.add(new ItemModel("Rina Humaida", R.drawable.ava_cewe));
        listData.add(new ItemModel("Wiwik Mulyati", R.drawable.ava_cewe));
        listData.add(new ItemModel("Kartika Sari", R.drawable.ava_cewe));
        listData.add(new ItemModel("Laila Rohma Bilqis", R.drawable.ava_cewe));

        itemAdapter = new ItemAdapter(listData, this);
        recyclerView.setAdapter(itemAdapter);
        itemAdapter.notifyDataSetChanged();
    }
}