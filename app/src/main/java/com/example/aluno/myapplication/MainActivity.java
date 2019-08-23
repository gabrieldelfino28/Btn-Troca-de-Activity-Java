package com.example.aluno.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnQueAbreTelaComLinearLayoutVertical;
    private Button btnQueAbreTelaComLinearLayoutHorizontal;
    private Button btnQueAbreTelaPassandoDadadosPraEla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnQueAbreTelaComLinearLayoutVertical = (Button) findViewById(R.id.btnQueAbreTelaComLinearLayoutVertical);
        btnQueAbreTelaComLinearLayoutHorizontal = (Button) findViewById(R.id.btnQueAbreTelaComLinearLayoutHorizontal);
        btnQueAbreTelaPassandoDadadosPraEla = (Button) findViewById(R.id.btnQueAbreTelaPassandoDadadosPraEla);

        btnQueAbreTelaComLinearLayoutVertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //https://developer.android.com/guide/components/intents-filters?hl=pt-br
                Intent intent = new Intent(MainActivity.this, TelaLinearLayoutVertical.class);
                startActivity(intent);
            }
        });
        btnQueAbreTelaComLinearLayoutHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TelaLinearLayoutHorizontal.class);
                startActivity(intent);
            }
        });

        btnQueAbreTelaPassandoDadadosPraEla.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
                Toast.makeText(MainActivity.this,"Vamos passar pra outra atividade: "+editTextNome.getText(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, TelaRecebeDados.class);
                intent.putExtra("Nome", editTextNome.getText().toString());
                startActivity(intent);
            }
        });
    }
}
