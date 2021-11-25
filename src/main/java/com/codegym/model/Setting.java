package com.codegym.model;

public class Setting {
    private String languages;
    private int size;
    private boolean spamFilter;
    private String signature;

    public Setting() {
    }

    public Setting(String languages, int size, boolean spamFilter, String signature) {
        this.languages = languages;
        this.size = size;
        this.spamFilter = spamFilter;
        this.signature = signature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(boolean spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
