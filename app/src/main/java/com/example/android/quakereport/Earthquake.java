package com.example.android.quakereport;

/**
 * {@link Earthquake} represents a vocabulary word that the user wants to learn.
 * * It contains a default translation and a Miwok translation for that word.
 */
public class Earthquake {
    private Double mvalorQuake;
    private final String mcity;
    private final long mTimeInMilliseconds;

    /**
     * @param valorQuake         Valor màxim del seisme
     * @param city               Ciutat del seisme
     * @param timeInMilliseconds Data del seisme en milisegons
     */
    public Earthquake(Double valorQuake, String city, long timeInMilliseconds) {
        mvalorQuake = valorQuake;
        mcity = city;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /**
     * @return És un string
     */
    public Double getvalorQuake() {
        return mvalorQuake;
    }

    /**
     * @return És un string
     */
    public String getcity() {
        return mcity;
    }

    /**
     * @return És un long
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


}
