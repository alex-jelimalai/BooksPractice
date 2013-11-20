package org.sonatype.mavenbook.weather;

import java.lang.String;

public class Weather {

    private String city;
    private String region;
    private String country;
    private String condition;
    private String temp;
    private String chill;
    private String humidity;


    public Weather() {
    }


    public String getCity() {
        return city;
    }


    public void setCity(final String aCity) {
        city = aCity;
    }


    public String getRegion() {
        return region;
    }


    public void setRegion(final String aRegion) {
        region = aRegion;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(final String aCountry) {
        country = aCountry;
    }


    public String getCondition() {
        return condition;
    }


    public void setCondition(final String aCondition) {
        condition = aCondition;
    }


    public String getTemp() {
        return temp;
    }


    public void setTemp(final String aTemp) {
        temp = aTemp;
    }


    public String getChill() {
        return chill;
    }


    public void setChill(final String aChill) {
        chill = aChill;
    }


    public String getHumidity() {
        return humidity;
    }


    public void setHumidity(final String aHumidity) {
        humidity = aHumidity;
    }
}
