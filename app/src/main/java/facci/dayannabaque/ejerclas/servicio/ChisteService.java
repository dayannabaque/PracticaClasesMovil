package facci.dayannabaque.ejerclas.servicio;

import java.util.List;

import facci.dayannabaque.ejerclas.constantes.ChisteApi;
import facci.dayannabaque.ejerclas.modelo.Chiste;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ChisteService {

    //para medir metodos

    @GET(ChisteApi.EMPOINT_chiste)
    Call<List<Chiste>> getChistes();
}
