package BaseDatos;

public class SQLVentas {
    
    private String sql;

    public String ComboMesero() {
        sql = "SELECT id, nombre FROM empleado WHERE puesto = 7";
        return sql;
    }

    public String TodoVentas() {
        sql = "SELECT * FROM venta ORDER BY id DESC";
        return sql;
    }    

    public String VentasMesero(String mesero) {
        sql = "SELECT * FROM venta WHERE mesero = '"+mesero+"' ORDER BY id DESC";
        return sql;
    }

    public String VentaFolio(int folio) {
        sql = "SELECT * FROM venta WHERE id = "+folio;
        return sql;
    }

    public String VentasEstatus(int e) {
        sql = "SELECT * FROM venta WHERE estatus = "+e+" ORDER BY id DESC";
        return sql;
    }

    public String NombreEmpleado(String mesero) {
        sql = "SELECT nombre FROM empleado WHERE id = '"+mesero+"'";
        return sql;
    }

    public String MesasActivasCerradas() {
        sql = "SELECT * FROM venta WHERE estatus = 1 OR estatus = 2 OR estatus = 3 OR estatus = 4 ORDER BY mesa";
        return sql;
    }
    
    public String PlatillosVenta(int folio){
        sql = "SELECT productos.*, platillos.nombre FROM productos, platillos WHERE productos.venta = "+folio+" AND productos.alimento = platillos.id";
        return sql;
    }

    public String CambiarPropina(int folio, Double propina) {
        sql = "UPDATE venta SET propina = "+propina+" WHERE id = "+folio;
        return sql;
    }

    public String CambiarDescuento(int folio, Double descuento) {
        sql = "UPDATE venta SET descuento = "+descuento+" WHERE id = "+folio;
        return sql;
    }

    public String CompletarVenta(int folio, String cajero, Double subtotal, Double total, int esta) {
        sql = "UPDATE venta SET cajero = '"+cajero+"', subtotal = "+subtotal+", total = "+total+", estatus = "+esta+" WHERE id = "+folio;
        return sql;
    }

    public String PagoEfectivo(int folio, Double efectivo) {
        sql = "INSERT INTO pago(venta,tipo, cantidad,referencia) VALUES("+folio+","+0+","+efectivo+",'E')";
        return sql;
    }

    public String PagoTarjeta(int folio, Double tarjeta, String referencia) {
        sql = "INSERT INTO pago(venta,tipo, cantidad,referencia) VALUES("+folio+","+1+","+tarjeta+",'"+referencia+"')";
        return sql;
    }

    public String CambiarVentaEstatus(int folio, int i) {
        sql = "UPDATE venta SET estatus = "+i+" WHERE id = "+folio;
        return sql;
    }

    public String SubventaProductos(String clave, int persona) {
        sql = "UPDATE productos SET subventa = "+persona+" WHERE id = "+clave;
        return sql;
    }

    public String NuevaSubventa(int folio, int persona, Double sepasubtotal, Double descuento, Double sepatotal, Double propina) {
        sql = "INSERT INTO subventa (venta,indice,subtotal,descuento,total,propina,estatus) VALUES("+folio+","+persona+","+sepasubtotal+","+descuento+","+sepatotal+","+propina+",0)";
        return sql;
    }

    public String CompletarVenta(int folio, String cajero, Double subtotal, Double descuentototal, Double total, Double propinatotal, int esta) {
        sql = "UPDATE venta SET cajero = '"+cajero+"', subtotal = "+subtotal+", descuento="+descuentototal+", total = "+total+", estatus = "+esta+", propina = "+propinatotal+" WHERE id = "+folio;
        return sql;
    }

    public String ObtenerSubventaNoPagada(int folio, int subventa) {
        sql = "SELECT * FROM subventa WHERE venta = "+folio+" AND indice = "+subventa+" AND estatus=0";
        return sql;
    }

    public String MeseroVenta(int folio) {
        sql = "SELECT venta.mesero, empleado.nombre FROM venta,empleado WHERE venta.id = "+folio+" AND venta.mesero = empleado.id";
        return sql;
    }

    public String SubpagoEfectivo(int folio, int subventa, double efectivo) {
        sql = "INSERT INTO pagoseparado(venta,indice,tipo,cantidad,referencia) VALUES("+folio+","+subventa+",0,"+efectivo+",'E')";
        return sql;
    }

    public String SubpagoTarjeta(int folio, int subventa, double tarjeta, String referencia) {
        sql = "INSERT INTO pagoseparado(venta,indice,tipo,cantidad,referencia) VALUES("+folio+","+subventa+",1,"+tarjeta+",'"+referencia+"')";
        return sql;
    }

    public String CambiarSubventaEstatus(int folio, int subventa, int i) {
        sql = "UPDATE subventa SET estatus = "+i+" WHERE venta = "+folio+" AND indice = "+subventa;
        return sql;
    }

    public String SubPagosNoPagados(int folio) {
        sql = "SELECT * FROM subventa WHERE venta = "+folio+" AND estatus=0";
        return sql;
    }

    public String VentasDesde(String desde) {
        sql = "SELECT * FROM venta WHERE  ingreso >= '"+desde+"'";
        return sql;
    }

    public String VentasHasta(String hasta) {
        sql = "SELECT * FROM venta WHERE  cierre <= '"+hasta+"'";
        return sql;
    }

    public String VentasPeriodo(String desde, String hasta) {
        sql = "SELECT * FROM venta WHERE  ingreso >= '"+desde+"' AND cierre <= '"+hasta+"'";
        return sql;
    }
}
