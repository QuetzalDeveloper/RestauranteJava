package BaseDatos;

import java.io.FileInputStream;

public class SQLAlimentos {
    
    private String sql = "";

    public String TodoTipoPlatillo() {
        sql = "SELECT * FROM tipo_platillo";
        return sql;
    }

    public String GuardarPlatillo(String nombre, int tipo, double precio, Boolean menu) {
        if(menu){
            sql = "INSERT INTO platillos (nombre,tipo,precio,menu) VALUES('"+nombre+"',"+tipo+","+precio+",1)";
        }
        else{
            sql = "INSERT INTO platillos (nombre,tipo,precio,menu) VALUES('"+nombre+"',"+tipo+","+precio+",0)";
        }
        return sql;
    }

    public String ObtenerPlatilloId(int id) {
        sql = "SELECT * FROM platillos WHERE id = "+id;
        return sql;
    }

    public String EditarPlatillo(int id, String nombre, int tipo, double precio, Boolean menu) {
        if(menu){
            sql = "UPDATE platillos SET nombre = '"+nombre+"', tipo = "+tipo+", precio = "+precio+", menu = 1 WHERE id = "+id;
        }
        else{
            sql = "UPDATE platillos SET nombre = '"+nombre+"', tipo = "+tipo+", precio = "+precio+", menu = 0 WHERE id = "+id;
        }
        return sql;
    }

    public String TodosPlatillos() {
        sql = "SELECT * FROM platillos";
        return sql;
    }

    public String ClavePlatillos(String clave) {
        sql = "SELECT * FROM platillos WHERE id = "+clave;
        return sql;
    }

    public String NombrePlatillos(String nombre) {
        sql = "SELECT * FROM platillos WHERE nombre LIKE '%"+nombre+"%'";
        return sql;
    }

    public String TipoPlatillos(int t) {
        sql = "SELECT * FROM platillos WHERE tipo = "+t;
        return sql;
    }
    
    
    
}
