package com.example.doit03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;

    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);

        button1 = findViewById(R.id.btnup);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveImageUp();
            }
        });

        button2 = findViewById(R.id.btndown);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveImageDown();
            }
        });

        moveImageUp();
    }

    private void moveImageDown() {
        imageView1.setImageResource(0);
        imageView2.setImageResource(R.drawable.itsme);

        imageView1.invalidate();
        imageView2.invalidate();
    }

    private void moveImageUp() {
        imageView1.setImageResource(R.drawable.itsme);
        imageView2.setImageResource(0);

        imageView1.invalidate();
        imageView2.invalidate();
    }

}
