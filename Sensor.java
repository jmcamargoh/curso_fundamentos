import java.util.ArrayList;
public class Sensor 
{
    public static Sensor[] sensores = new Sensor[8];
 
    private String tipo;
    private double valor;
    public static int tamaño = 8;
    public static int posAñadir = 0;
 
    public Sensor()
    {
    }
 
    public Sensor(String t, double v)
    {
        sensores[posAñadir] = new Sensor();
        sensores[posAñadir].setTipo(t);
        sensores[posAñadir].setValor(v);
        posAñadir++;
    }
 
    public String getTipo()
    {
        return this.tipo;
    }
 
    public double getValor()
    {
        return this.valor;
    }
 
    public void setTipo(String t)
    {
        this.tipo = t;
    }
 
    public void setValor(double v)
    {
        this.valor = v;
    }
 
    public String toString()
    {
        return "Tipo: "+this.tipo+" Valor: "+this.valor + "\n";
    }
 
    public static String toStringSensores()
    {
        String s = "Estos son los sensores en nuestra lista: \n";
        if(Sensor.cantidadSensores()>0)
        {
            for(int i = 0; i<Sensor.cantidadSensores() ; i++)
            {
                s=s.concat(Sensor.sensores[i].toString());
            }
        }
        return s;
    }
 
    public static int cantidadSensores()
    {
        return posAñadir;
    }
 
    public static String toStringSensoresTemp()
    {
        String s = "Estos son los sensores en nuestra lista: \n";
        if(Sensor.cantidadSensores()>0)
        {
            for(int i = 0; i<Sensor.cantidadSensores() ; i++)
            {
                if(Sensor.sensores[i].getTipo().toUpperCase().equals("TEMPERATURA"))
                {
                    s=s.concat(Sensor.sensores[i].toString());
                }
            }
        }
        return s;
    }
 
    public static ArrayList<Sensor> valorOrganizado()
    {
        ArrayList<Sensor> org = new ArrayList<Sensor>();
        
        for(int i = 0; i<Sensor.cantidadSensores(); i++)
        {
            if(Sensor.sensores[i].getTipo().toUpperCase().equals("TEMPERATURA"))
            {
                Sensor nuevo = new Sensor();
                nuevo.setTipo(Sensor.sensores[i].getTipo());
                nuevo.setValor(Sensor.sensores[i].getValor());
                org.add(nuevo);
            }
        }
        
        int posMenor;
        double obTemp;
        for(int i = 0; i < org.size() - 1; i++)
        {
            posMenor = i;
            for(int j = i + 1; j <org.size(); j++)
            {
                if(org.get(j).getValor() < org.get(posMenor).getValor())
                {
                    posMenor = j;
                }
            }
            obTemp = org.get(i).getValor();
            org.get(i).setValor(org.get(posMenor).getValor());
            org.get(posMenor).setValor(obTemp); 
        }
        
        return org;
    }
    
    public static String toStringSensoresSatanicos(ArrayList<Sensor> a)
    {
        String s = "Estos son los sensores en nuestra lista: \n";
        if(a.size()>0)
        {
            for(int i = 0; i<a.size() ; i++)
            {
                s=s.concat(a.get(i).toString());
            }
        }
        return s;
    }
}
