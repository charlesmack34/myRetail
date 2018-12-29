package com.casestudy.target.myretailrestservice.model.redsky;

public enum CurrencyCode {

    USD("USD");

    private String value;

    /**
     * @param value
     */
    private CurrencyCode(String value) {

        this.value = value;

    }

    @Override
    public String toString() {

        return value;

    }

}
