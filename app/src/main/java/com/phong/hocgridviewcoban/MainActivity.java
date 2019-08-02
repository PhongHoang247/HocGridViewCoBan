package com.phong.hocgridviewcoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvSanPham;
    ArrayAdapter<String> sanPhamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        gvSanPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, sanPhamAdapter.getItem(i), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addControls() {
        gvSanPham = (GridView) findViewById(R.id.gvSanPham);
        //Tạo Adapter:
        sanPhamAdapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1);
        //Gán Adapter cho GridView:
        gvSanPham.setAdapter(sanPhamAdapter);
        //Đẩy dữ liệu vào Adapter:
        ArrayList<String> dsSP = new ArrayList<>();
        dsSP.add("Nokia");
        dsSP.add("Black Berry");
        dsSP.add("Iphone");
        dsSP.add("Samsung");
        dsSP.add("Huawei");
        dsSP.add("Mobistar");
        dsSP.add("Bphone");
        dsSP.add("LG");
        dsSP.add("Acer");
        dsSP.add("Dell");
        dsSP.add("Lenovo");
        dsSP.add("HP");
        dsSP.add("Mac");
        dsSP.add("Asus");
        dsSP.add("MSI");
        sanPhamAdapter.addAll(dsSP);
    }
}
