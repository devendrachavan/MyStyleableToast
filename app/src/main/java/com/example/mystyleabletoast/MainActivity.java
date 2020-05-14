package com.example.mystyleabletoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showtoast_button = findViewById(R.id.showtoast);

        showtoast_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           StyleableToast.makeText(getApplicationContext(),"Hello, Developer",Toast.LENGTH_LONG,R.style.toaststyle).show();
            }
        });
    }
}
