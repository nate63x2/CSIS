package com.whitfield.nathan.csis;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


/**
 * Created by Nathan on 9/26/2016.
 */

public class CourseTabs extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_tabs);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }


    public void onClickFacultyBtn(View view) {
        Intent intent = new Intent(CourseTabs.this, FacultyActivity.class);
        startActivity(intent);
    }

    public void onClickMissionBtn(View view) {
        Intent intent = new Intent(CourseTabs.this, MainActivity.class);
        startActivity(intent);

    }
}

