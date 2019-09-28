package com.example.ad37_tdhai_b5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.List;

import static java.security.AccessController.getContext;

public class Main2Activity extends AppCompatActivity {
    RelativeLayout relativeLayout;
    Button btOder;
    Item item1,item2,item3,item4,item5,item6;
    List<Item> items;
    ItemAdapter itemAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        relativeLayout=findViewById(R.id.rlShopping);
        recyclerView=findViewById(R.id.rcListFood);
        btOder=findViewById(R.id.buttonOder);

        item1=new Item("Pizza Panda");
        item2=new Item("KFC Supper");
        item3=new Item("Bread Eggs");
        item4=new Item("Coca Cola");
        item5=new Item("Chicken super");
        item6=new Item("Cup cake");

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);


        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getBaseContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        ItemAdapter itemAdapter=new ItemAdapter(items);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), Main3Activity.class));
            }
        });

        btOder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Thank You! Your oder sent to restaurant",Toast.LENGTH_LONG).show();
            }
        });
    }
}
