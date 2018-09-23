package com.aptron.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox sahi,dosa,butterChiken,br;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sahi = findViewById(R.id.checkBox4);
        dosa= findViewById(R.id.checkBox5);
        butterChiken = findViewById(R.id.checkBox6);
        br = findViewById(R.id.checkBox7);
        sahi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Shahi Paneer Finished", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void order(View view) {
        StringBuilder buffer = new StringBuilder();
        int amount=0;
        if(sahi.isChecked())
        {
            buffer.append("You Selected SahiPaneer : 350/=\n");
            amount = amount+350;

        }
        if(dosa.isChecked())
        {
            buffer.append("You Selected Dosa : 250/=\n");
            amount = amount+250;

        }

        if(butterChiken.isChecked())
        {
            buffer.append("You Selected Butter Chiken : 550/=\n");
            amount = amount+550;

        }

        if(br.isChecked())
        {
            buffer.append("You Selected Biryani : 150/=\n");
            amount = amount+150;

        }
        buffer.append("\n Your Bill Amount is : ").append(amount);
        Toast.makeText(this, buffer.toString(), Toast.LENGTH_LONG).show();

    }
}