package moviles.aplicaciones.contactos_proyecto;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Mantenimiento extends SQLiteOpenHelper {
    public static final String codigo="codigo";
    public static final String apellidos="apellidos";
    public static final String nombres="nombres";
    public static final String correo="correo";
    public static final String telefono="telefono";
    public static final String celular="celular";
    private static final String base="micontacto";
    private static final String tabla="contactos";
    public static final int version=1;
    public static final String creabd="create table contactos "+"(codigo integer primary key autoincrement, "+
            "" +"apellidos text, nombres text, correo text, telefono text, celular text);";

    private SQLiteDatabase sen;
    public Mantenimiento(Context contexto) {
        super(contexto, base , null, version);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(creabd);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS contactos");
        onCreate(db);

    }
    public Mantenimiento abrir(){
        sen=this.getWritableDatabase();
        return this;

    }
    public void cerrar(){
        this.close();
    }
    public long insertar(String ape,String nom, String cor, String tele, String celu){
        ContentValues datos=new ContentValues();
        datos.put(apellidos,ape);
        datos.put(nombres,nom);
        datos.put(correo,cor);
        datos.put(telefono,tele);
        datos.put(celular,celu);
        return sen.insert(tabla,null,datos);
    }
}
