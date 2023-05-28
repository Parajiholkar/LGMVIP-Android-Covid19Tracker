package com.project1.covid19tracker;

public class Model {
    String subkey ,active ,confirmed ,migratedother ,deceased ,recovered ,deltaConfirmed ,deltaDeceased ,deltaRecovered;
    public Model(String subkey, String active ,String confirmed ,String migratedother ,String deceased ,String recovered ,String deltaConfirmed ,String deltaDeceased ,String deltaRecovered){
        this.subkey =subkey;
        this.active = active;
        this.confirmed = confirmed;
        this.deceased = deceased;
        this.migratedother = migratedother;
        this.recovered = recovered;
        this.deltaConfirmed = deltaConfirmed;
        this.deltaDeceased = deltaDeceased;
        this.deltaRecovered = deltaRecovered;
    }

    public String getSubkey() {
        return subkey;
    }

    public void setSubkey(String subkey) {
        this.subkey = subkey;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getMigratedother() {
        return migratedother;
    }

    public void setMigratedother(String migratedother) {
        this.migratedother = migratedother;
    }

    public String getDeceased() {
        return deceased;
    }

    public void setDeceased(String deceased) {
        this.deceased = deceased;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getDeltaConfirmed() {
        return deltaConfirmed;
    }

    public void setDeltaConfirmed(String deltaConfirmed) {
        this.deltaConfirmed = deltaConfirmed;
    }

    public String getDeltaDeceased() {
        return deltaDeceased;
    }

    public void setDeltaDeceased(String deltaDeceased) {
        this.deltaDeceased = deltaDeceased;
    }

    public String getDeltaRecovered() {
        return deltaRecovered;
    }

    public void setDeltaRecovered(String deltaRecovered) {
        this.deltaRecovered = deltaRecovered;
    }
}

