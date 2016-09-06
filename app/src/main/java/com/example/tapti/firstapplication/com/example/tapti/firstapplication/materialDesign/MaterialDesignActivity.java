package com.example.tapti.firstapplication.com.example.tapti.firstapplication.materialDesign;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.TabLayout;
import com.example.

public class MaterialDesignActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabs;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design);
        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

       viewPager = findViewById(R.id.viewpager);
        tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("First tab"));
        tabs.addTab(tabs.newTab().setText("Second tab"));
        tabs.addTab(tabs.newTab().setText("Third tab"));
    }
}
