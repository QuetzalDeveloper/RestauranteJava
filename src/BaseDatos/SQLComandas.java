package BaseDatos;

public class SQLComandas {
    
    private String sql = "";

    public String VerificarAcceso(String user, String pass) {
        sql = "SELECT * FROM empleado WHERE id = '"+user+"' AND password ='"+pass+"'";        
        return sql;
    }

    public String RegistrarAcceso(String user, String hora) {
        sql = "INSERT INTO accescomanda (user, ingreso, egreso) VALUES('"+user+"','"+hora+"','1000-01-01 00:00:00')";
        return sql;
    }

    public String ObtenerToken(String user) {
        sql = "SELECT id FROM accescomanda WHERE user = '"+user+"' order by id desc limit 1";
        return sql;
    }

    public String RegistrarSalida(int token, String hora) {
        sql = "UPDATE accescomanda SET egreso = '"+hora+"' WHERE id = "+token;
        return sql;
    }

    public String TodosMeseros() {
        sql = "SELECT * FROM empleado WHERE puesto = 7";
        return sql;
    }
    
    public String VerificarDisponibilidad(int mesa){
        sql = "SELECT * FROM venta WHERE estatus = 1 AND mesa = "+mesa;
        return sql;
    }

    public String IdentificarMesero(String empleado, String pass) {
        sql = "SELECT * FROM empleado WHERE id = '"+empleado+"' AND password = '"+pass+"'";
        return sql;
    }

    public String PrimerVenta(int mesa, String empleado, String acceso, int i) {
        sql = "INSERT INTO venta (mesa,mesero,ingreso, estatus) VALUES("+mesa+",'"+empleado+"','"+acceso+"',"+i+")";
        return sql;
    }

    public String TodoTipoPlatillo() {
        sql = "SELECT * FROM tipo_platillo";
        return sql;
    }

    public String TiposPlatillosComanda(int combo) {
        sql = "SELECT id, nombre FROM platillos WHERE tipo = "+combo+" AND menu = 1";
        return sql;
    }

    public String ActualizarCantidadPlatillo(int venta, int plat, int cant) {
        sql = "UPDATE productos SET cantidad = "+cant+" WHERE venta = "+venta+" AND alimento = "+plat;
        return sql;
    }

    public String PrecioPlatillo(int plat) {
        sql = "SELECT precio FROM platillos WHERE id = "+plat;
        return sql;
    }

    public String AgregarPlatilloVenta(int venta, int plat, double precio, String edicion) {
        sql = "INSERT INTO productos(venta,alimento,precio,observaciones) VALUES("+venta+","+plat+","+precio+",'"+edicion+"')";
        return sql;
    }

    public String ObtenerVenta(int mesa) {
        sql = "SELECT id FROM venta WHERE mesa = "+mesa+" AND estatus = 1";
        return sql;
    }

    public String ObtenerPlatillos(int venta) {
        sql = "SELECT alimento,nombre,observaciones,productos.id FROM productos, platillos WHERE venta = "+venta+" AND alimento = platillos.id";
        return sql;
    }

    public String CambiarCantidad(int venta, int platillo, int cantidad) {
        sql = "UPDATE productos SET cantidad = "+cantidad+" WHERE venta = "+venta+" AND alimento = "+platillo;
        return sql;
    }

    public String EliminarPlatillo(int id) {
        sql = "DELETE FROM productos WHERE id = "+id;
        return sql;
    }

    public String CambiosComanda(String user, String hora, int venta, int alimento) {
        sql = "INSERT INTO cambioscomanda(user,hora,venta,alimento) VALUES('"+user+"','"+hora+"',"+venta+","+alimento+")";
        return sql;
    }

    public String CerrarMesa(int venta, String fin) {
        sql = "UPDATE venta SET cierre = '"+fin+"' , estatus = 2 WHERE id = "+venta;
        return sql;
    }
    
    
    
    
}
