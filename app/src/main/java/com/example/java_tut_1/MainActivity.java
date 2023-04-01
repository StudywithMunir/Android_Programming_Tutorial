package com.example.java_tut_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter=0;

    //creating button object of Button class i.e add & sub are button variables
    Button add,sub;

    //creating textview object of Text View class
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing counter=0
        //When application start counter start from 0
        counter=0;

        //fetching button id from the xml i.e tv_add and storing it in add variable of Button type
        add=(Button) findViewById(R.id.tv_add);

        //fetching button id from the xml i.e tv_sub and storing it in sub variable of Button type
        sub=(Button) findViewById(R.id.tv_sub);

        //fetching button id from the xml i.e tv_display and storing it in display variable of TextView type
        display=(TextView) findViewById(R.id.tv_display);


        //OnClickListener use the method OnClick
        //add= variable of button type & add var is using setOnClickListener method and
        //inside setOnClickListener we are creating new view bcz we didn't use that method before and it comes from the view class
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //when button is clicked the counter variable is incremented
                //initially counter var is set to 0 when app starts
                //different ways to increment counter variable
//                counter=counter+1;
                counter++;

                //using TextView class method through display variable of type TextView
                //setText will convert whatever is in the counter variable into string
                display.setText("Your total is: "+ counter);

            }
        });


        //creating setOnClickListener method of sub variable
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                counter-=1;

                display.setText("Your total is: "+ counter);

                //setText will not work like this
                //display.setText(counter);
                //we have to use double quotations in order to print

            }
        });


    }
}