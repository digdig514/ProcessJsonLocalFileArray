package com.example.digdig.exerviceprocessdatajsonn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.digdig.exerviceprocessdatajsonn.model.JSONManagement;
import com.example.digdig.exerviceprocessdatajsonn.model.JSONManagementArray;
import com.example.digdig.exerviceprocessdatajsonn.model.SuperHero;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnProcessJSONFile,BtnProcessJSONFileArray;
    ListView listViewMembers;
    ArrayAdapter<SuperHero> arrayAdapter;
    ArrayList<SuperHero> listOfMembers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {

        listViewMembers = (ListView) findViewById(R.id.ListView);
        btnProcessJSONFile = (Button)findViewById(R.id.btnProcessJSONFile);
       btnProcessJSONFile.setOnClickListener(this);
        BtnProcessJSONFileArray = (Button)findViewById(R.id.btnProcessJSONFileArray);
        BtnProcessJSONFileArray.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
        case R.id.btnProcessJSONFile :
            JSONManagement.processJSONFile(this,"JsonFileForExercise.json");
        break;
            case R.id.btnProcessJSONFileArray :
        listOfMembers = JSONManagementArray.processJSONFile(this,"JsonFileForExercise.json");
                arrayAdapter = new ArrayAdapter<SuperHero>(this,android.R.layout.simple_list_item_1,listOfMembers);
                listViewMembers.setAdapter(arrayAdapter);
                //listViewMembers.setOnItemClickListener(this);
                break;
    }
    }
}
