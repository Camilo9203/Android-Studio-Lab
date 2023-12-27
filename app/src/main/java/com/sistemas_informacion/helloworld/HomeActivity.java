package com.sistemas_informacion.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lista;
    List<String> androidVersionList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        Bundle extras = getIntent().getExtras();
        String userName = extras.getString("name");
        setTitle(userName);
        
        // 1. Conectar listView (lista) al componente visual por id
        lista = findViewById(R.id.listView);
        
        // 2. Cargar elementos en la lista
        androidVersionList =  new ArrayList<>();
        androidVersionList.add("Pie");
        androidVersionList.add("Oreo");
        androidVersionList.add("Nougat");
        androidVersionList.add("Marshmallow");
        androidVersionList.add("Lollipop");
        androidVersionList.add("Kitkat");
        androidVersionList.add("...");
        
        // 3. Adaptador
        ArrayAdapter adaptadorVersionesAndroid = new ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            androidVersionList
        );
        
        // 4. Vincular adaptador con el listView
        lista.setAdapter(adaptadorVersionesAndroid);
        
        // 5. Gestión de evento clic de la lista
        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String androidVersion = androidVersionList.get(position);
        Log.i("APP", "Versión click: " + androidVersion);
    }
}