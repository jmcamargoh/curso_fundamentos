import java.util.ArrayList;
public class Sensor 
{
    public static Sensor[] sensores = new Sensor[8];
    private String tipo;
    private double valor;
    public static int tamano = 8;
    public static int posAnadir = 0;
    
    public Sensor()
    {
    }
 
    public Sensor(String t, double v)
    {
        sensores[posAnadir] = new Sensor();
        sensores[posAnadir].setTipo(t);
        sensores[posAnadir].setValor(v);
        posAnadir++;
    }
 
    public String getTipo()
    {
        return this.tipo;
    }
 
    public double getValor()
    {
        return this.valor;
    }
 
    public void setTipo(String tip)
    {
        this.tipo = tip;
    }
 
    public void setValor(double val)
    {
        this.valor = val;
    }
 
    public String toString()
    {
        return "Tipo: "+getTipo()+" - Valor: "+getValor() + "\n";
    }
 
    public static String toStringSensores()
    {
        String string = "Estos son los sensores en nuestra lista: \n";
        if(Sensor.cantidadSensores()>0)
        {
            for(int i = 0; i<Sensor.cantidadSensores() ; i++)
            {
                string=string.concat(Sensor.sensores[i].toString());
            }
        }
        return string;
    }
 
    public static int cantidadSensores()
    {
        return posAnadir;
    }
 
    public static String toStringSensoresTemp()
    {
        String string = "Estos son los sensores en nuestra lista: \n";
        if(Sensor.cantidadSensores()>0)
        {
            for(int i = 0; i<Sensor.cantidadSensores() ; i++)
            {
                if(Sensor.sensores[i].getTipo().toUpperCase().equals("TEMPERATURA"))
                {
                    string=string.concat(Sensor.sensores[i].toString());
                }
            }
        }
        return string;
    }
 
    public static ArrayList<Sensor> valorOrganizado()
    {
        ArrayList<Sensor> organizado = new ArrayList<Sensor>();
        for(int i = 0; i<Sensor.cantidadSensores(); i++)
        {
            if(Sensor.sensores[i].getTipo().toUpperCase().equals("TEMPERATURA"))
            {
                Sensor nuevo = new Sensor();
                nuevo.setTipo(Sensor.sensores[i].getTipo());
                nuevo.setValor(Sensor.sensores[i].getValor());
                organizado.add(nuevo);
            }
        }
        int posMenor;
        double obTemporal;
        for(int i = 0; i < organizado.size() - 1; i++)
        {
            posMenor = i;
            for(int j = i + 1; j <organizado.size(); j++)
            {
                if(organizado.get(j).getValor() < organizado.get(posMenor).getValor())
                {
                    posMenor = j;
                }
            }
            obTemporal = organizado.get(i).getValor();
            organizado.get(i).setValor(organizado.get(posMenor).getValor());
            organizado.get(posMenor).setValor(obTemporal); 
        }
        return organizado;
    }
    
    public static String toStringSensoresSatanicos(ArrayList<Sensor> a)
    {
        String string = "Estos son los sensores en nuestra lista: \n";
        if(a.size()>0)
        {
            for(int i = 0; i<a.size() ; i++)
            {
                string=string.concat(a.get(i).toString());
            }
        }
        return string;
    }
}