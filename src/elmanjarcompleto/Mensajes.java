package elmanjarcompleto;

import GUI.Advertencia;
import GUI.Confirmacion;

public class Mensajes {
    
    public void alerta(java.awt.Frame f, String t, String m) {
        Advertencia a = new Advertencia(f, true);
        a.setLocationRelativeTo(null);
        a.Mostrar(t, m);
        a.setVisible(true);
    }
    
    public void error(java.awt.Frame f, String t, String m) {
        GUI.Error e = new GUI.Error(f, true);
        e.setLocationRelativeTo(null);
        e.Mostrar(t, m);
        e.setVisible(true);
    }
    
    public void alerta(java.awt.Dialog d, String t, String m) {
        Advertencia a = new Advertencia(d, true);
        a.setLocationRelativeTo(null);
        a.Mostrar(t, m);
        a.setVisible(true);
    }
    
    public void error(java.awt.Dialog d, String t, String m) {
        GUI.Error e = new GUI.Error(d, true);
        e.setLocationRelativeTo(null);
        e.Mostrar(t, m);
        e.setVisible(true);
    }
    
    public boolean confirmar(java.awt.Frame d, String t, String m) {
        Confirmacion e = new Confirmacion(d, true);
        e.setLocationRelativeTo(null);
        e.Mostrar(t, m);
        e.setVisible(true);
        return e.getEstado();
    }
    
    public boolean confirmar(java.awt.Dialog d, String t, String m) {
        Confirmacion e = new Confirmacion(d, true);
        e.setLocationRelativeTo(null);
        e.Mostrar(t, m);
        e.setVisible(true);
        return e.getEstado();
    }
    
}
