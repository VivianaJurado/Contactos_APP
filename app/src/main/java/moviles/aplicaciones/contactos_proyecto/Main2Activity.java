package moviles.aplicaciones.contactos_proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    public ListView lstListado;
    ArrayList<Contacto> contactos;
    public Button btnRegistrar,btnEditar,btnLlamar,btnEliminar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnRegistrar=(Button)findViewById(R.id.btnRegistrar);
        btnEditar=(Button)findViewById(R.id.btnEditar);
        btnLlamar=(Button)findViewById(R.id.btnLlamar);
        btnEliminar=(Button)findViewById(R.id.btnEliminar);
        lstListado=(ListView) findViewById(R.id.lstListado);
        contactos=new ArrayList<>();
        contactos.add(new Contacto("Morales","Camila","cami@gmail.com","01765432","956873421"));
        contactos.add(new Contacto("Caceres","Rosy","rosy@gmail.com","01234567","954536243"));
        contactos.add(new Contacto("Montoya","Lucas","lucas@gmail.com","01716245","956873452"));
        contactos.add(new Contacto("Paredes","Piero","piero@gmail.com","01798643","956873533"));

        ArrayList<String> nombrescontactos=new ArrayList<>();
        for (Contacto contacto : contactos){
            nombrescontactos.add(contacto.getNombres()+ "  "+ contacto.getApellidos());
        }
        lstListado.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nombrescontactos));



        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,"Bienvenido",Toast.LENGTH_SHORT).show();
                Intent dat=new Intent(Main2Activity.this,Main3Activity.class);
                Bundle datos=new Bundle();
                datos.putString("bad", btnRegistrar.getText().toString());
                dat.putExtras(datos);
                startActivity(dat);
            }
        });
    }
}
