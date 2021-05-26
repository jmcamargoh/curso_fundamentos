public class Sensor 
{
    private String tipo;
    private double valor;
    
    public Sensor()
    {
    }
 
    public Sensor(String tip, double val)
    {
        this.tipo= tip;
        this.valor= val;
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
 
    /*public static String toStringSensores()
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
 
    public static ArrayList<Sensor> obtenerSensoresOrganizados()
    {
        ArrayList<Sensor> organizado = new ArrayList<Sensor>();
        for(int i = 0; i<Sensor.cantidadSensores(); i++)
        {
            if(Sensor.sensores[i].getTipo().toUpperCase().equals("TEMPERATURA"))
            {
                organizado.add(Sensor.sensores[i]);
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
    }*/
}
