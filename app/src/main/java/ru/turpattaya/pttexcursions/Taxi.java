package ru.turpattaya.pttexcursions;

/**
 * Created by MSI on 07.10.2016.
 */

public class Taxi implements Comparable<Taxi> {

    private String textFromItemTaxi;
    private String textWhereItemTaxi;
    private String textCarItemTaxi;
    private String textMinivanItemTaxi;
    private String textMinibusItemTaxi;

    public Taxi (String textFromItemTaxi, String textWhereItemTaxi, String textCarItemTaxi, String textMinivanItemTaxi, String textMinibusItemTaxi ) {
        this.textFromItemTaxi = textFromItemTaxi;
        this.textWhereItemTaxi = textWhereItemTaxi;
        this.textCarItemTaxi = textCarItemTaxi;
        this.textMinivanItemTaxi = textMinivanItemTaxi;
        this.textMinibusItemTaxi = textMinibusItemTaxi;
    }

    public String getTextFromItemTaxi() {
        return textFromItemTaxi;
    }

    public void setTextFromItemTaxi(String textFromItemTaxi) {
        this.textFromItemTaxi = textFromItemTaxi;
    }

    public String getTextWhereItemTaxi() {
        return textWhereItemTaxi;
    }

    public void setTextWhereItemTaxi(String textWhereItemTaxi) {
        this.textWhereItemTaxi = textWhereItemTaxi;
    }

    public String getTextCarItemTaxi() {
        return textCarItemTaxi;
    }

    public void setTextCarItemTaxi(String textCarItemTaxi) {
        this.textCarItemTaxi = textCarItemTaxi;
    }

    public String getTextMinivanItemTaxi() {
        return textMinivanItemTaxi;
    }

    public void setTextMinivanItemTaxi(String textMinivanItemTaxi) {
        this.textMinivanItemTaxi = textMinivanItemTaxi;
    }

    public String getTextMinibusItemTaxi() {
        return textMinibusItemTaxi;
    }

    public void setTextMinibusItemTaxi(String textMinibusItemTaxi) {
        this.textMinibusItemTaxi = textMinibusItemTaxi;
    }

    @Override
    public int compareTo(Taxi taxi) {
        return getTextFromItemTaxi().compareTo(taxi.getTextFromItemTaxi());
    }
}
