package com.aniket.uibasics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

//    private CheckBox checkboxBeginner, checkboxPlace, checkboxExcited;
//    private ProgressBar progressBar;
//    private ListView citiesList;
//    private Spinner studentSpinner;
//    private FloatingActionButton fab;
    private ConstraintLayout parent;
    private Button btnShowSnackBar;
    private MaterialCardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button btnHello = findViewById(R.id.btnHello);
//        btnHello.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.out.println("Hello");
//            }
//        });

//        checkboxBeginner = findViewById(R.id.checkboxBeginner);
//        checkboxPlace = findViewById(R.id.checkboxPlace);
//        checkboxExcited = findViewById(R.id.checkboxExcited);
//        citiesList = findViewById(R.id.citiesList);
//        studentSpinner = findViewById(R.id.studentSpinner);
//        fab = findViewById(R.id.fab);
        parent = findViewById(R.id.parent);
        btnShowSnackBar = findViewById(R.id.btnSnackBar);
        cardView = findViewById(R.id.cardView);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Card Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnShowSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackBar();
            }
        });

//
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Succesfully created this add button", Toast.LENGTH_SHORT).show();
//            }
//        });

//        ArrayList<String> students = new ArrayList<>();
//        students.add("Aniket");
//        students.add("Abhishek");
//        students.add("Akshey");
//        students.add("Meera");
//
//        ArrayAdapter<String> studentAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, students);
//
//        studentSpinner.setAdapter(studentAdapter);

//        ArrayList<String> cities = new ArrayList<>();
//        cities.add("New Delhi");
//        cities.add("Panchkula");
//        cities.add("Chandigarh");
//        cities.add("Mohali");
//        cities.add("New Delhi");



//        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cities);
//
//        citiesList.setAdapter(citiesAdapter);
//
//        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "You clicked " + cities.get(position), Toast.LENGTH_SHORT).show();
//            }
//        });
//        progressBar = findViewById(R.id.progressBar);
//        checkboxBeginner.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked){
//                    Toast.makeText(MainActivity.this, "You Have taken 1st step towards your progress", Toast.LENGTH_SHORT).show();
//                    progressBar.setVisibility(View.VISIBLE);
//                } else{
//                    Toast.makeText(MainActivity.this, "You are falling behind", Toast.LENGTH_SHORT).show();
//                    progressBar.setVisibility(View.GONE);
//
//                }
//            }
//        });
    }
    private void showSnackBar(){
        Snackbar.make(parent, "This is a SnackBar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Try Again", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Retry Clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setActionTextColor(getResources().getColor(R.color.material_on_surface_stroke))
                .setTextColor(Color.RED)
                .show();
    }


}