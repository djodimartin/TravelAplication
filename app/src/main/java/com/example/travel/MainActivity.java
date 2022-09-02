package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.travel.Adapter.RecentsAdapter;
import com.example.travel.Adapter.TopPlacesAdapter;
import com.example.travel.model.RecentsData;
import com.example.travel.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Wae Rebo - Manggarai","Nusa Tenggara Timur", "Rp. 500.000", R.drawable.kedua));
        recentsDataList.add(new RecentsData("Pantai Pink - Lombok Timur","Nusa Tenggara Barat", "Rp. 250.000", R.drawable.pertama));
        recentsDataList.add(new RecentsData("Api Biru - Banyuwangi","Jawa Timur", "Rp. 140.000", R.drawable.ketiga));
        recentsDataList.add(new RecentsData("Gunung Rinjani - Lombok","Nusa Tenggara Barat", "Rp. 200.000", R.drawable.keempat));
        recentsDataList.add(new RecentsData("Raja Ampat","Papua Barat", "Rp. 4.500.000", R.drawable.keenam));
        recentsDataList.add(new RecentsData("Ranu Kumbolo - Lumajang","Jawa Timur", "Rp. 300.000", R.drawable.ketujuh));
        recentsDataList.add(new RecentsData("Pantai Kelingking - Nusa Penida","Bali", "Rp. 650.000", R.drawable.kelima));
        recentsDataList.add(new RecentsData("Ranu Regulo - Lumajang","Jawa Timur", "Rp. 200.000", R.drawable.kedelapan));
        recentsDataList.add(new RecentsData("Puncak Jaya Wijaya","Papua", "Rp. 1.400.000", R.drawable.kesembilan));
        recentsDataList.add(new RecentsData("Taman Laut Nasional Bunaken","Sulawesi Utara", "Rp. 950.000", R.drawable.kesepuluh));
        recentsDataList.add(new RecentsData("Bukit Ollon - Tana Toraja","Sulawesi Selatan", "Rp. 500.000", R.drawable.kesebelas));
        recentsDataList.add(new RecentsData("Taman Nasional Komodo","Nusa Tenggara Timur", "Rp. 2.950.000", R.drawable.keduabelas));
        recentsDataList.add(new RecentsData("Gili Trawangan","Sulawesi Utara", "Rp. 950.000", R.drawable.ketigabelas));
        recentsDataList.add(new RecentsData("Gunung Bromo","Jawa Timur", "Rp. 350.000", R.drawable.keempatbelas));
        recentsDataList.add(new RecentsData("Uluwatu","Bali", "Rp. 150.000", R.drawable.kelimabelas));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Raja Ampat Dive Lodge","Papua","Rp. 1.500.000",R.drawable.raja1));
        topPlacesDataList.add(new TopPlacesData("The Westlake Hotel","Resort Yogyakarta","Rp. 500.000",R.drawable.hotel1));
        topPlacesDataList.add(new TopPlacesData("Katamaran Hotel & Resort","Lombok","Rp.600.000",R.drawable.hotel2));
        topPlacesDataList.add(new TopPlacesData("Ocean View Residence","Jepara","Rp.600.000",R.drawable.hotel3));
        topPlacesDataList.add(new TopPlacesData("Best Western The Lagoon","Manado","Rp.600.000",R.drawable.hotel4));
        topPlacesDataList.add(new TopPlacesData("Mercure Convention Center Ancol","Jakarta","Rp. 420.000",R.drawable.hotel5));
        topPlacesDataList.add(new TopPlacesData("HARRIS Resort Barelang","Batam","Rp. 620.000",R.drawable.hotel6));
        topPlacesDataList.add(new TopPlacesData("Swiss-Belresort","Belitung","Rp. 700.000",R.drawable.hotel7));
        topPlacesDataList.add(new TopPlacesData("Wyndham Tamansari Jivva Resort","Bali","Rp. 1.700.000",R.drawable.hotel8));
        topPlacesDataList.add(new TopPlacesData("The Kuta Beach ","Bali","Rp. 800.000",R.drawable.hotel9));
        topPlacesDataList.add(new TopPlacesData("Sagara Candidasa","Bali Timur","Rp. 1.100.000",R.drawable.hotel10));
        topPlacesDataList.add(new TopPlacesData("Swiss-Belresort","Belitung","Rp. 700.000",R.drawable.hotel10));

        setTopPlacesRecycler(topPlacesDataList);

    }
    private void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }

    private void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);
    }
}