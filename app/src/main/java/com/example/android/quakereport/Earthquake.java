package com.example.android.quakereport;

/**
 * {@link Earthquake} represents a vocabulary word that the user wants to learn.
 * * It contains a default translation and a Miwok translation for that word.
 */
public class Earthquake {
    private final String mvalorQuake;
    private final String mcity;
    private final String mdateQuake;

    /**
     * @param valorQuake Valor màxim del seisme
     * @param city Ciutat del seisme
     * @param dateQuake Data del seisme
     */
    public Earthquake(String valorQuake, String city, String dateQuake) {
        mvalorQuake = valorQuake;
        mcity = city;
        mdateQuake = dateQuake;
    }

    /**
     * @return És un string
     */
    public String getvalorQuake() {
        return mvalorQuake;
    }

    /**
     * @return És un string
     */
    public String getcity() {
        return mcity;
    }

    /**
     * @return És un String
     */
    public String getdateQuake() { return mdateQuake; }
}
