package com.example.digdig.exerviceprocessdatajsonn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.digdig.exerviceprocessdatajsonn.model.JSONManagement;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnProcessJSONFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {


        btnProcessJSONFile = (Button)findViewById(R.id.btnProcessJSONFile);



        btnProcessJSONFile.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
        case R.id.btnProcessJSONFile :
        JSONManagement.processJSONFile(this,"JsonFileForExercise.json");
        break;
        
    }
    }
}
