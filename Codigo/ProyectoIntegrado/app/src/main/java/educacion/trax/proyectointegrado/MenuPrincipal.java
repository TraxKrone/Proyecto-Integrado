package educacion.trax.proyectointegrado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.widget.Button;

import java.io.Console;
import java.util.ArrayList;

import educacion.trax.proyectointegrado.clases.Personaje;

public class MenuPrincipal extends AppCompatActivity implements View.OnClickListener {
    Button botonJugar,botonNuevaPartida,botonOpciones,botonSalir;
    ArrayList personajes;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        Bundle data = getIntent().getExtras();

        personajes = data.getParcelableArrayList("personajes");

        Personaje pers1 = (Personaje) personajes.get(0);


        botonJugar = (Button)findViewById(R.id.buttonJugar);
        botonOpciones=(Button)findViewById(R.id.buttonOpciones);
        botonSalir=(Button)findViewById(R.id.buttonSalirMenuPrincipal);
        botonNuevaPartida=(Button)findViewById(R.id.buttonNuevaPartida);

        botonJugar.setOnClickListener(this);
        botonOpciones.setOnClickListener(this);
        botonSalir.setOnClickListener(this);
        botonNuevaPartida.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i=null;

        if(v.getId()==botonJugar.getId()){
            i = new Intent();
        }else if(v.getId()==botonNuevaPartida.getId()){
            i = new Intent();
        }else if(v.getId()==botonOpciones.getId()){
            i = new Intent();
        }else if(v.getId()==botonSalir.getId()){
            finish();
        }

        if(i!=null){
            //i.putParcelableArrayListExtra();
        }
    }
}
