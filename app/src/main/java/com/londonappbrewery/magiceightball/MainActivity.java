package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //declaring an instance variable/reference variable for type Button
    Button askButton;

    //declaring a reference variable for type ImageView
    ImageView eightBallImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Assign the askButton reference to the Button object from our XML
        askButton = (Button)findViewById(R.id.askButton2);

        //Assign the eightBallImageView reference to the ImageView object from our XML
        eightBallImageView = (ImageView)findViewById(R.id.ball_image2);

        //Declaring and creating an Array object of type int named eightBallImagesArray and assigning 5 drawable
        //values to it
        final int[] eightBallImagesArray = new int[]{R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        //Creating a new View.OnClickListener object and overririding it's onClick() method that will
        //listen to our button clicks and creating Random numbers and change the image assets according to this
        //random number
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Creating a new Random object referenced by randomNumber variable
                Random randomNumber = new Random();

                //Generating a whole/int random number between 0 and the length of our Array object
                int number = randomNumber.nextInt(eightBallImagesArray.length);


                //Setting the ImageView to the image depending on the random number generated
                //by retreving the value from the eightBallImagesArray object
                eightBallImageView.setImageResource(eightBallImagesArray[number]);

            }
        };

        //Registering our Button object with the OnClickListener interface
        askButton.setOnClickListener(onClickListener);

    }
}
