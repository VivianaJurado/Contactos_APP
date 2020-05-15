package moviles.aplicaciones.contactos_proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button btnContactos;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnContactos=(Button)findViewById(R.id.btnContactos);

        btnContactos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Lista de contactos",Toast.LENGTH_SHORT).show();
                Intent dat=new Intent(MainActivity.this,Main2Activity.class);
                Bundle datos=new Bundle();
                datos.putString("bad",btnContactos.getText().toString());
                dat.putExtras(datos);
                startActivity(dat);
            }
        });
    }
}
