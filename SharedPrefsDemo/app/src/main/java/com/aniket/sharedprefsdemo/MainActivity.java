 package com.aniket.sharedprefsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;

 public class MainActivity extends AppCompatActivity {

    private TextView dbValue;
    private EditText edtTxt;
    private Button button;

     File directoryToStore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        directoryToStore = getBaseContext().getExternalFilesDir("TestFolder");
        if (!directoryToStore.exists()) {
            if (directoryToStore.mkdir()) ; //directory is created;
        }


        dbValue = findViewById(R.id.dbValue);
        edtTxt = findViewById(R.id.edtTxt);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = edtTxt.getText().toString();
                if (!val.equals("")) {
                    SharedPreferences sP = getSharedPreferences("MyPref", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sP.edit();
                    editor.putString("name", val);
                    editor.apply();
                    dbValue.setText(val);
                }
            }
        });

        SharedPreferences sP = getSharedPreferences("MyPref", MODE_PRIVATE);
        String editVal = sP.getString("name", "Database Empty");
        dbValue.setText(editVal);




    }
}