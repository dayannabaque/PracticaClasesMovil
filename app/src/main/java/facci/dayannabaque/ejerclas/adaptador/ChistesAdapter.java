package facci.dayannabaque.ejerclas.adaptador;

import java.util.List;

import facci.dayannabaque.ejerclas.constantes.ChisteApi;
import facci.dayannabaque.ejerclas.modelo.Chiste;
import facci.dayannabaque.ejerclas.servicio.ChisteService;
import retrofit2.Call;

public class ChistesAdapter extends BaseAdapter implements ChisteService {

    private ChisteService chisteService;

    public ChistesAdapter(){
        super(ChisteApi.Base_chiste);
        chisteService = createService(ChisteService.class);
    }

    @Override
    public Call<List<Chiste>> getChistes(){return chisteService.getChistes();}
}
