package com.example.sala_bd.taller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main23Activity extends AppCompatActivity {
    List<String> arreglo = new ArrayList();
    ListView listView;
    List<Pais> paises = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        JSONObject json = null;
        try {
            json = new JSONObject(loadJSONFromAsset());
            JSONArray paisesJsonArray = json.getJSONArray("paises");
            for (int i = 0; i < paisesJsonArray.length(); i++) {
                JSONObject jsonObject = paisesJsonArray.getJSONObject(i);
                Pais p = new Pais();
                p.setCapital(jsonObject.getString("capital"));
                arreglo.add(p.getCapital());
                p.setNombrePais(jsonObject.getString("nombre_pais"));
                p.setNombrePaisInt(jsonObject.getString("nombre_pais_int"));
                p.setSigla(jsonObject.getString("sigla"));
                paises.add(p);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arreglo);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        // AHORA RECUPERAMOS EL STRING DEL JSON




    }


    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = this.getAssets().open("paises.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
