package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {

    //
    // Exercise 1: Convert 27 degrees Celcius to Farenheit
    // The equation is: farenheit = (9 / 5) * celcius + 32
    //
    @Test
    public void convertToFarenheit() {
        double celcius = 27.0d;
        double farenheit = 0.0d;

        // TODO: Use a floating point calculation to calculate the farenheit equivalent of the celcius value.
        float equivalentFactor = 1.8F;

        farenheit = equivalentFactor * celcius + 32.0;
        farenheit = Math.round(farenheit * 100.0) / 100.0;

        assertThat(farenheit, equalTo(80.6));
    }

    //
    // Exercise 2: Convert kilograms to pounds
    // There are 2.20462 pounds in a kilogram
    //
    @Test
    public void convertMetersToFeet() {
        int weightInKilograms = 50;
        double weightInPounds = 0;

        // TODO: Use a floating point calculation to calculate the correct weight in pounds
        float equivalentFactor = 2.20462F;
        weightInPounds = equivalentFactor * weightInKilograms;
        weightInPounds = Math.round(weightInPounds * 1000.0) / 1000.0;

        assertThat(weightInPounds, equalTo(110.231));

    }
}
