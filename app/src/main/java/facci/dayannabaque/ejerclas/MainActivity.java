package facci.dayannabaque.ejerclas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import facci.dayannabaque.ejerclas.adaptador.ChistesAdapter;
import facci.dayannabaque.ejerclas.modelo.Chiste;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
 
    public void getChistes(){
        ChistesAdapter chistesAdapter =new ChistesAdapter();
        Call<List<Chiste>> call = chistesAdapter.getChistes();
        call.enqueue(new Callback<List<Chiste>>() {
            @Override
            public void onResponse(Call<List<Chiste>> call, Response<List<Chiste>> response) {
                List<Chiste> Listachiste = response.body();
                for (Chiste chiste : Listachiste) {

                Log.e("Aviso", chiste.getChiste());

            }
            }

            @Override
            public void onFailure(Call<List<Chiste>> call, Throwable t) {

            }
        });
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}