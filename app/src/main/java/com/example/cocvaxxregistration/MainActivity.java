package com.example.cocvaxxregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinnerCities = findViewById(R.id.spin_city);
        Spinner spinnerCourse = findViewById(R.id.spin_course);
        Spinner spinnerYearLevel = findViewById(R.id.spin_yearLevel);
        Spinner spinnerVaccines = findViewById(R.id.spin_vaccine);

        //municipality selection
        ArrayAdapter<CharSequence> adapterCities = ArrayAdapter.createFromResource(this,R.array.municipality, android.R.layout.simple_spinner_item);
        adapterCities.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCities.setAdapter(adapterCities);
        spinnerCities.setOnItemSelectedListener(this);
        //course selection
        ArrayAdapter<CharSequence> adapterCourse = ArrayAdapter.createFromResource(this,R.array.course, android.R.layout.simple_spinner_item);
        adapterCourse.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCourse.setAdapter(adapterCourse);
        spinnerCourse.setOnItemSelectedListener(this);
        //year level selection
        ArrayAdapter<CharSequence> adapterYearLevel = ArrayAdapter.createFromResource(this,R.array.yearLevel, android.R.layout.simple_spinner_item);
        adapterYearLevel.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerYearLevel.setAdapter(adapterYearLevel);
        spinnerYearLevel.setOnItemSelectedListener(this);
        //vaccine selection
        ArrayAdapter<CharSequence> adapterVaccines = ArrayAdapter.createFromResource(this,R.array.vaccines, android.R.layout.simple_spinner_item);
        adapterVaccines.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerVaccines.setAdapter(adapterVaccines);
        spinnerVaccines.setOnItemSelectedListener(this);



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {

        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}