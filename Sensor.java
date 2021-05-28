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
 
}
