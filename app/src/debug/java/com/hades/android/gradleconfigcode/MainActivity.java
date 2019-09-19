package com.hades.android.gradleconfigcode;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hades.android.gradleconfigcode.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.testBtn).setOnClickListener(v -> testBtn());
    }

    private void testBtn() {
        Toast.makeText(this, "Just Test", Toast.LENGTH_SHORT).show();
    }
}

