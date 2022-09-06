package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HobbyActivity extends AppCompatActivity {
    private TextView mHobbyName;
    private TextView mHobbyIngredients;
    private TextView mHobbyMethodTitle;
    private TextView mHobby;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobby);

        mHobbyName = (TextView) findViewById(R.id.text_hobby);
        mHobbyIngredients = (TextView) findViewById(R.id.ingredients);
        mHobbyMethodTitle = (TextView) findViewById(R.id.method);
        mHobby = (TextView) findViewById(R.id.hobby);

        Intent intent = getIntent();
        String Title = intent.getExtras() .getString("HobbyName");
        String Ingredients = intent.getExtras() .getString("mHobbyIngredients");
        String MethodTitle = intent.getExtras() .getString("mHobbyMethodTitle");
        String hobby = intent.getExtras() .getString("Hobby");

        mHobbyName.setText(Title);
        mHobbyIngredients.setText(Ingredients);
        mHobbyMethodTitle.setText(MethodTitle);
        mHobby.setText(hobby);

    }
}