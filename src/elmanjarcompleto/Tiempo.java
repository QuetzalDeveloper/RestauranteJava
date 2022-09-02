package elmanjarcompleto;

import datechooser.beans.DateChooserCombo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tiempo {
    
    public String HoraImagen(){
        Date d = new Date();
        DateFormat f = new SimpleDateFormat("yyyyMMddHHmmss");
        String fecha = f.format(d);
        System.out.println(fecha);
        return fecha;
    }
    
    public String HoraAcceso(){
        Date d = new Date();
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fecha = f.format(d);
        System.out.println(fecha);
        return fecha;
    }
    
    public String TimestampTexto(String hora){
        String fecha ="";
        hora = hora.replaceAll(":","-");
        hora = hora.replaceAll(" ","-");
        String [] d = hora.split("-");
        fecha += d[2] + " ";
        switch(d[1]){
            case "01" : fecha += "de enero de "; break;
            case "02" : fecha += "de febrero de "; break;
            case "03" : fecha += "de marzo de "; break;
            case "04" : fecha += "de abril de "; break;
            case "05" : fecha += "de mayo de "; break;
            case "06" : fecha += "de junio de "; break;
            case "07" : fecha += "de julio de "; break;
            case "08" : fecha += "de agosto de "; break;
            case "09" : fecha += "de septiembre de "; break;
            case "10" : fecha += "de octubre de "; break;
            case "11" : fecha += "de noviembre de "; break;
            case "12" : fecha += "de diceimbre de "; break;
            default: fecha += "missigno "; break;
        }
        fecha += d[0]+" a las "+d[3]+":"+d[4]+":"+d[5];
        return fecha;
    }

    public String ChooserToString(DateChooserCombo chooserFecha) {
        String fecha = "";
        int num;
        Calendar date = null;
        date = chooserFecha.getSelectedDate();
        num = date.get(Calendar.YEAR);
        fecha = num + "-";
        num = date.get(Calendar.MONTH) + 1;
        if (num < 10) {
            fecha = fecha + "0" + num + "-";
        } else {
            fecha = fecha + "" + num + "-";
        }
        num = date.get(Calendar.DATE);
        if (num < 10) {
            fecha = fecha + "0" + num;
        } else {
            fecha = fecha + "" + num;
        }
        return fecha;
    }
    
    
}
