package com.android.wesleyseago.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Wesley on 1/13/2015.
 */
public class ColorWheel {
    // Member variables
    public String[] mColors = {
            "#39ADD1",
            "#3079AB",
            "#C25975",
            "#E15258",
            "#F9845B",
            "#838CC7",
            "#7D669E",
            "#53BBB4",
            "#51B46D",
            "#E0AB18",
            "#637A91",
            "#F092B0",
            "#B7C0C7"
             };

    // Methods
    public int getColor() {
        String color = "";

        // Randomly select a fact
        Random randomGenerator = new Random(); // Random constructor
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}

