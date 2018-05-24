package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mHindiTranslation;

    public Word (String defaultTranslation, String hindiTranslation){
        mDefaultTranslation = defaultTranslation;
        mHindiTranslation = hindiTranslation;
    }


    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getHindiTranslation(){
        return mHindiTranslation;
    }
}
