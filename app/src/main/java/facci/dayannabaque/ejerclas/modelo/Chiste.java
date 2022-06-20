package facci.dayannabaque.ejerclas.modelo;

import com.google.gson.annotations.SerializedName;

public class Chiste {

    @SerializedName("joke")
    private String Chiste;

    public String getChiste() {
        return Chiste;
    }

    public void setChiste(String chiste) {
        Chiste = chiste;
    }
}
