package com.example.aryadanuprengga.animalium;

import android.content.ClipData;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout navbar;
    private ActionBarDrawerToggle toggle;
    private Toolbar toolbar;
    TextView Mnama;
    RecyclerView recyclerView;
    AnimalModel animalModel;
    AnimalAdapter animalAdapter;
    List<AnimalModel> animalModelList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mnama=(TextView) findViewById(R.id.MnamaTextView);
        String namadarifront=getIntent().getStringExtra("NAMA");

        recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
        animalAdapter=new AnimalAdapter(getApplicationContext(),animalModelList);

        RecyclerView.LayoutManager lm=new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(animalAdapter);

        persiapanData();
        toolbar=(Toolbar)findViewById(R.id.nav_action);
        setSupportActionBar(toolbar);
        navbar=(DrawerLayout)findViewById(R.id.navbar);
        toggle=new ActionBarDrawerToggle(this, navbar, R.string.open, R.string.close);
        navbar.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    void persiapanData(){
        String [] namaIndonesia={"Banteng","Ayam","Kepiting","Serigala","Kuda Nil","Koala","Lemur","Landak","Babi",
                "Macan","Paus","Zebra"};
        String [] namaEnglish={"Bull","Chick","Crab","Fox","Hippopotamus","Koala","Lemur","Hedgehog","Pig","Tiger","Whale","Zebra"};
        int[]gambar={R.drawable.anbull,R.drawable.anchick,R.drawable.ancrab,R.drawable.anfox,R.drawable.anhippopotamus,R.drawable.ankoala,
                R.drawable.anlemur,R.drawable.anhedgehog,R.drawable.anpig,R.drawable.antiger,R.drawable.anwhale,R.drawable.anzebra};

        for(int i=0;i<namaIndonesia.length;i++) {
            animalModel = new AnimalModel(namaIndonesia[i], namaEnglish[i], gambar[i]);
            animalModelList.add(animalModel);
        }
    }
}
