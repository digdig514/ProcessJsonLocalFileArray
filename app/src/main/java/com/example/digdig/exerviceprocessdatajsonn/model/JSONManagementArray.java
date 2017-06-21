package com.example.digdig.exerviceprocessdatajsonn.model;

/**
 * Created by digdig on 17-06-20.
 */

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by moh on 20/06/2017.
 */

public class JSONManagementArray {


    public static ArrayList<SuperHero> processJSONData(String data){
ArrayList<SuperHero> superhero =  new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(data);
            JSONArray listOfMembers = jsonObject.getJSONArray("members");

            for (int i=0;i<listOfMembers.length();i++){

                JSONObject onMember = listOfMembers.getJSONObject(i);

                String name = onMember.getString("name");
                int age = onMember.getInt("age");
                String identity = onMember.getString("secretIdentity");
                ArrayList<String> powers = new ArrayList<>();
                JSONArray powerArray = onMember.getJSONArray("powers");
                for (int j=0; j<powerArray.length(); j++)
                {
                    String power = powerArray.getString(j);
                    powers.add(power);
                }

                SuperHero member = new SuperHero(name,age,identity,powers);
                superhero.add(member);
                Log.d("JSON",member.toString());
            }
        } catch (Exception e) {
            Log.d("JSON",e.getMessage());
        }
        return superhero;
    }

    public static ArrayList<SuperHero> processJSONFile(Context context,String fileName){
        ArrayList<SuperHero> superhero =  new ArrayList<>();
        AssetManager assetManager = context.getResources().getAssets();

        try {
            InputStreamReader isr = new InputStreamReader(assetManager.open(fileName));
            BufferedReader br = new BufferedReader(isr);
            String oneLine=null;
            StringBuilder sb = new StringBuilder();
            while ((oneLine=br.readLine())!=null)
                sb.append(oneLine);

            br.close();
            isr.close();
            processJSONData(sb.toString());
            superhero = processJSONData(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

return superhero;
    }

}
