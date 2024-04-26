package com.example.skincare;

public class Data {


    private String dataTitle;
    private String dataDesc;
    private String dataImage;
    private String key;

    public String getKey() {

        return key;
    }
    public void setKey(String key) {

        this.key = key;
    }


    public String getDataTitle() {

        return dataTitle;
    }

    public String getDataDesc() {
        return dataDesc;
    }

    public String getDataImage() {
        return dataImage;
    }

    public Data(String dataTitle,  String dataDesc, String dataImage) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataImage = dataImage;
    }
    public Data(){
    }
}
