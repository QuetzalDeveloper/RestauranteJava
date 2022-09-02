package BaseDatos;

public class SQLEmpleado {
    
    private String sql = "";
    
    public String VerificarEmpleado(String cuenta, String password){
        sql = "SELECT * FROM empleado WHERE id = '"+cuenta+"' AND password ='"+password+"'";        
        return sql;
    }

    public String RegistrarAcceso(String user, String ingreso) {
        sql = "INSERT INTO accesos (user, ingreso, egreso) VALUES('"+user+"','"+ingreso+"','1000-01-01 00:00:00')";
        return sql;
    }

    public String ObtenerToken(String user) {
        sql = "SELECT id FROM accesos WHERE user = '"+user+"' order by id desc limit 1";
        return sql;
    }

    public String RegistrarSalida(int token, String hora) {
        sql = "UPDATE accesos SET egreso = '"+hora+"' WHERE id = "+token;
        return sql;
    }

    public String TodosEmpleados() {
        sql = "SELECT * FROM empleado";
        return sql;
    }

    public String EmpleadosClave(String clave) {
        sql = "SELECT * FROM empleado WHERE id = '"+clave+"'";
        return sql;
    }
    
    public String EmpleadosNombre(String nombre){
        sql = "SELECT * FROM empleado WHERE nombre LIKE '%"+nombre+"%'";
        return sql;
    }
    
    public String EmpleadosPuesto(int puesto){
        sql = "SELECT * FROM empleado WHERE puesto = "+puesto;
        return sql;
    }

    public String NuevoEmpleado(String id, String nombre, String telefono, String correo, int puesto, String contra) {
        sql = "INSERT INTO empleado VALUES('"+id+"','"+nombre+"','"+telefono+"','"+correo+"',"+puesto+",'"+contra+"')";
        return sql;
    }

    public String EditarEmpleado(String id, String nombre, String telefono, String correo, int puesto, String contra) {
        sql = "UPDATE empleado SET nombre = '"+nombre+"', telefono = '"+telefono+"', correo='"+correo+"', puesto ="+puesto+", password = '"+contra+"' WHERE id = '"+id+"'";
        return sql;
    }

    public String OcultarEmpleado(String id) {
        sql = "UPDATE empleado SET puesto = -1 WHERE id = '"+id+"'";
        return sql;
    }

    public String AccesosTodos() {
        sql = "SELECT * FROM accesos order by id desc";
        return sql;
    }

    public String AccesosEmpleado(String id) {
        sql = "SELECT * FROM accesos WHERE user = '"+id+"' order by id desc ";
        return sql;
    }

    public String AccesosTodosFecha(String fecha) {
        sql = "SELECT * FROM accesos WHERE ingreso >= '"+fecha+" 00:00:00' AND ingreso <= '"+fecha+" 23:59:59' order by id desc ";
        return sql;
    }

    public String AccesosEmpleadoFecha(String clave, String fecha) {
        sql = "SELECT * FROM accesos WHERE user = '"+clave+"' AND ingreso >= '"+fecha+" 00:00:00' AND ingreso <= '"+fecha+" 23:59:59' order by id desc ";
        return sql;
    }
}
