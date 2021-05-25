public class Vehiculo{
    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano=10;
    public static int posAnadir=0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
 
    public Vehiculo(){

    }
 
    public Vehiculo(int mod, String mar, double val){
        this(mod, mar, val, "Verde");
    }
 
    public Vehiculo(int mo, String ma, double va, String co){
        vehiculos[posAnadir] = new Vehiculo();
        vehiculos[posAnadir].setModelo(mo);
        vehiculos[posAnadir].setMarca(ma);
        vehiculos[posAnadir].setValorComercial(va);
        vehiculos[posAnadir].setColor(co);
        posAnadir++;
    }

    public void setModelo(int mod){
        this.modelo=mod;
    }
 
    public void setMarca(String mar){
        this.marca=mar;
    }
 
    public void setValorComercial(double val){
        this.valorComercial=val;
    }
 
    public void setColor(String col){
        this.color=col;
    }
 
    public int getModelo(){
        return this.modelo;
    }
 
    public String getMarca(){
        return this.marca;
    }
 
    public double getValorComercial(){
        return this.valorComercial;
    }
 
    public String getColor(){
        return this.color;
    }
 
    public String toString(){
        return "Modelo: "+getModelo()+" - Marca: "+getMarca()+" - Valor Comercial: "+getValorComercial()+" - Color: "+getColor()+"\n";
    }
 
    public static int cantidadVehiculos(){
        return posAnadir;
    }

    public static String toStringVehiculos()
    {
        String string = "Estos son los vehículos en nuestra lista: \n";
        if(Vehiculo.cantidadVehiculos()>0)
        {
            for(int i = 0; i<Vehiculo.cantidadVehiculos() ; i++)
            {
                string=string.concat(Vehiculo.vehiculos[i].toString());
            }
        }
        return string;
    }

    public static String toStringVehiculosVerdes()
    {
        String string = "Estos son los vehículos en nuestra lista: \n";
        if(Vehiculo.cantidadVehiculos()>0)
        {
            for(int i = 0; i<Vehiculo.cantidadVehiculos() ; i++)
            {
                if(Vehiculo.vehiculos[i].getColor().toUpperCase().equals("VERDE"))
                {
                    string=string.concat(Vehiculo.vehiculos[i].toString());
                }  
            }
        }
        return string;
    }
}