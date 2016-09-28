package com.whitfield.nathan.csis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/**
 * Created by Nathan on 9/26/2016.
 */
public class FacultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
    }

    public void onClickMissionBtn(View view) {
        Intent intent = new Intent(FacultyActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickCourseBtn(View view) {
        Intent intent = new Intent(FacultyActivity.this, CourseTabs.class);
        startActivity(intent);

    }

}
