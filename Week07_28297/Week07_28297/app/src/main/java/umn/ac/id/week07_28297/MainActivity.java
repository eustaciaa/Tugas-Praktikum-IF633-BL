package umn.ac.id.week07_28297;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnMenuA, btnMenuB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenuA = findViewById(R.id.menuA);
        btnMenuB = findViewById(R.id.menuB);

        btnMenuA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentMenuA = new Intent(MainActivity.this, MenuAActivity.class);
                startActivityForResult(intentMenuA, 1);
            }
        });

        btnMenuB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentMenuB = new Intent(MainActivity.this, MenuBActivity.class);
                startActivityForResult(intentMenuB, 1);
            }
        });
    }
}