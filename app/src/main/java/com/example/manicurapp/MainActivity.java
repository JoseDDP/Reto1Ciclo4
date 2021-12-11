package com.example.manicurapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button btnProductos, btnServicos, btnSucursales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_manicura);

        setContentView(R.layout.activity_main);

        btnProductos= (Button) findViewById(R.id.btnProductos);
        btnServicos= (Button) findViewById(R.id.btnServicios);
        btnSucursales= (Button) findViewById(R.id.btnSucursales);

        btnProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Toast.makeText(getApplicationContext(), "Boton Productos se implementara en la siguiente version", Toast.LENGTH_SHORT).show();
            }
        });

        btnServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Boton Servicios se implementara en la siguiente version", Toast.LENGTH_SHORT).show();
            }
        });

       btnSucursales.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Boton Sucursales se implementara en la siguiente version", Toast.LENGTH_SHORT).show();
           }
       });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.productos:
                Toast.makeText(getApplicationContext(), "Producto Seleccionado", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.servicios:
                Toast.makeText(getApplicationContext(), "Servicios Seleccionado", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sucursales:
                Toast.makeText(getApplicationContext(), "Sucursales Seleccionado", Toast.LENGTH_SHORT).show();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}