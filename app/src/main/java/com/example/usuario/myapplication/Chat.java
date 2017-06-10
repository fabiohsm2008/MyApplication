package com.example.usuario.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Chat extends AppCompatActivity {

    ListView message;
    EditText texto;
    Button press;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        final ArrayList<String> conver = new ArrayList<>();
        texto = (EditText)findViewById(R.id.textView);
        press = (Button)findViewById(R.id.button);
        press.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(texto.getText().toString() != ""){
                    conver.add(texto.getText().toString());
                    ArrayAdapter adapt =new ArrayAdapter(Chat.this,android.R.layout.simple_list_item_1, conver);
                    message.setAdapter(adapt);
                }
            }
        });
        String titulo = getIntent().getExtras().getString("name");
        setTitle(titulo);
    }
}