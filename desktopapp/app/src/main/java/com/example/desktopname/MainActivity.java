package com.example.desktopname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void load(View view){
        Button button = findViewById(R.id.button);
        TextView textView= findViewById(R.id.Textview);
        button.setText(textView.getText().toString());
}
boolean iscat=true;
public void Change(View view) {
    ImageView iv = findViewById(R.id.imageView);
    if (iscat) {
        iv.setImageResource(R.drawable.dog);
        iscat = false;
    } else {
        iv.setImageResource(R.drawable.cat);
        iscat = true;
    }

}
public void image(View view) {
    ImageView imagev= findViewById(R.id.imageView2);
    imagev.animate().setDuration(5000).translationX(200).translationY(-200);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}