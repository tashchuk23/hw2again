package com.example.hw2again;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        BoardView bv = (BoardView) findViewById(R.id.boardView);  //wrong
        BoardController controller = new BoardController(bv);  //wrong
        Button[][] buttonsArray = new Button[4][4];



//create the buttons, assign to a findViewById

        Button b00 = (Button) findViewById(R.id.b00);
        Button b01 = (Button) findViewById(R.id.b01);
        Button b02 = (Button) findViewById(R.id.b02);
        Button b03 = (Button) findViewById(R.id.b03);
        Button b10 = (Button) findViewById(R.id.b10);
        Button b11 = (Button) findViewById(R.id.b11);
        Button b12 = (Button) findViewById(R.id.b12);
        Button b13 = (Button) findViewById(R.id.b13);
        Button b20 = (Button) findViewById(R.id.b20);
        Button b21 = (Button) findViewById(R.id.b21);
        Button b22 = (Button) findViewById(R.id.b22);
        Button b23 = (Button) findViewById(R.id.b23);
        Button b30 = (Button) findViewById(R.id.b30);
        Button b31 = (Button) findViewById(R.id.b31);
        Button b32 = (Button) findViewById(R.id.b32);
        Button b33 = (Button) findViewById(R.id.b33);




    }

    @Override
    public void onClick(View view) {

    }
}