package com.android.wesleyseago.funfacts;

import java.util.Random;

/**
 * Created by Wesley on 1/13/2015.
 */
public class FactBook {
    // Member variables
    public String[] mFact = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach the Earth.",
            "Some bamboo plants can grow a meter in just 1 day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the Earth when the Great Pyramid was being built." };

    // Methods
    public String getFact() {
        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random(); // Random constructor
        int randomNumber = randomGenerator.nextInt(mFact.length);
        fact = mFact[randomNumber];

        return fact;
    }
}
