package ru.turpattaya.pttexcursions;

/**
 * Created by MSI on 03.10.2016.
 */

public class Excursion implements Comparable<Excursion> {



    private int imageViewitem;
    private String textExcursionItem;
    private String textPriceItem;

    public Excursion(int imageViewItem, String textExcursionItem, String textPriceItem) {
        this.imageViewitem = imageViewItem;
        this.textExcursionItem = textExcursionItem;
        this.textPriceItem = textPriceItem;
    }

    public int getImageViewitem() {
        return imageViewitem;
    }

    public void setImageViewitem(int imageViewitem) {
        this.imageViewitem = imageViewitem;
    }

    public String getTextExcursionItem() {
        return textExcursionItem;
    }

    public void setTextExcursionItem(String textExcursionItem) {
        this.textExcursionItem = textExcursionItem;
    }

    public String getTextPriceItem() {
        return textPriceItem;
    }

    public void setTextPriceItem(String textPriceItem) {
        this.textPriceItem = textPriceItem;
    }

    @Override
    public int compareTo(Excursion another) {
        return getTextExcursionItem().compareTo(another.getTextExcursionItem());
    }
}
