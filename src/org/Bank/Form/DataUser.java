package org.Bank.Form;

public class DataUser {
    private String nomorkartu;
    private String combojenisatm;
    private String combobank;
    private String namapemilik;

    public String getNomorkartu() {
        return nomorkartu;
    }

    public void setNomorkartu(String nomorkartu) {
        this.nomorkartu = nomorkartu;
    }

    public String getCombojenisatm() {
        return combojenisatm;
    }

    public void setCombojenisatm(String combojenisatm) {
        this.combojenisatm = combojenisatm;
    }

    public String getCombobank() {
        return combobank;
    }

    public void setCombobank(String combobank) {
        this.combobank = combobank;
    }

    public String getNamapemilik() {
        return namapemilik;
    }

    public void setNamapemilik(String namapemilik) {
        this.namapemilik = namapemilik;
    }

    @Override
    public String toString() {
        return "DataUser{" +
                "nomorkartu='" + nomorkartu + '\'' +
                ", combojenisatm='" + combojenisatm + '\'' +
                ", combobank='" + combobank + '\'' +
                ", namapemilik='" + namapemilik + '\'' +
                '}';
    }
}

