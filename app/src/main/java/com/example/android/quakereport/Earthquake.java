package com.example.android.quakereport;

/**
 * {@link Earthquake} represents a vocabulary word that the user wants to learn.
 * * It contains a default translation and a Miwok translation for that word.
 */
public class Earthquake {
    private double mvalorQuake;
    private final String mcity;
    private final long mTimeInMilliseconds;
    private String mUrl;

    /**
     * @param valorQuake         Valor màxim del seisme
     * @param city               Ciutat del seisme
     * @param timeInMilliseconds Data del seisme en milisegons
     */
    public Earthquake(double valorQuake, String city, long timeInMilliseconds, String url) {
        mvalorQuake = valorQuake;
        mcity = city;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * @return És un string
     */
    public double getvalorQuake() {
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
    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() { return mUrl; }


}
