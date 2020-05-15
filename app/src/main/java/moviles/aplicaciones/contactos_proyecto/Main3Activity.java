package moviles.aplicaciones.contactos_proyecto;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    public EditText edtCodigo,edtApellidos,edtNombres,edtCorreo,edtTelefono,edtCelular;
    public Button btnGuardar,btnCancelar;
    String ape,nom,cor,tele,celu;
    Mantenimiento database=new Mantenimiento(this);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        edtCodigo=(EditText)findViewById(R.id.edtCodigo);
        edtApellidos=(EditText)findViewById(R.id.edtApellidos);
        edtNombres=(EditText)findViewById(R.id.edtNombres);
        edtCorreo=(EditText)findViewById(R.id.edtCorreo);
        edtTelefono=(EditText)findViewById(R.id.edtTelefono);
        edtCelular=(EditText)findViewById(R.id.edtCelular);
        btnGuardar=(Button)findViewById(R.id.btnGuardar);
        btnCancelar=(Button)findViewById(R.id.btnCancelar);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ape=edtApellidos.getText().toString();
                nom=edtNombres.getText().toString();
                cor=edtCorreo.getText().toString();
                 tele=edtTelefono.getText().toString();
                celu=edtCelular.getText().toString();
                Toast.makeText(getBaseContext(),"Se procede al almacenamiento",Toast.LENGTH_SHORT).show();
                database.abrir();
                long id=database.insertar(ape,nom,cor,tele,celu);
                database.cerrar();
                Toast.makeText(getBaseContext(),"El contacto se almacenado correctamente",Toast.LENGTH_SHORT).show();
                edtCodigo.setText("Contacto Registrado");
            }
        });
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a2= new AlertDialog.Builder(Main3Activity.this);
                a2.setTitle("AA");
                a2.setMessage("BB");
                finish();

            }
        });
    }

}
