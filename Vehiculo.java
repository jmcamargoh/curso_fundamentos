public class Vehiculo{
 

    public static Vehiculo[] vehiculos = new Vehiculo[10];
 
    
    public static int tamaño=10;
 

    public static int posAñadir=0;
 

    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
 

    public Vehiculo(){

    }
 

    public Vehiculo(int mo, String ma, double va){
        this(mo, ma, va, "Verde");
    }
 
    public Vehiculo(int mo, String ma, double va, String co){
        vehiculos[posAñadir] = new Vehiculo();
        vehiculos[posAñadir].setModelo(mo);
        vehiculos[posAñadir].setMarca(ma);
        vehiculos[posAñadir].setValorComercial(va);
        vehiculos[posAñadir].setColor(co);
 
        posAñadir++;
    }

    public void setModelo(int m){
        this.modelo=m;
    }
 

    public void setMarca(String m){
        this.marca=m;
    }
 

    public void setValorComercial(double v){
        this.valorComercial=v;
    }
 

    public void setColor(String c){
        this.color=c;
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
        return "Modelo: "+this.modelo+" Marca: "+this.marca+" Valor Comercial: "+this.valorComercial+" Color: "+this.color;
    }
 

    public static int cantidadVehiculos(){
        return posAñadir;
    }

    public static String toStringVehiculos()
    {
        String s = "Estos son los vehículos en nuestra lista: \n";
        if(Vehiculo.cantidadVehiculos()>0)
        {
            for(int i = 0; i<Vehiculo.cantidadVehiculos() ; i++)
            {
                s=s.concat(Vehiculo.vehiculos[i].toString());
            }
        }
        return s;
    }

    public static String toStringVehiculosVerdes()
    {
        String s = "Estos son los vehículos en nuestra lista: \n";
        if(Vehiculo.cantidadVehiculos()>0)
        {
            for(int i = 0; i<Vehiculo.cantidadVehiculos() ; i++)
            {
                if(Vehiculo.vehiculos[i].getColor().toUpperCase().equals("VERDE"))
                {
                    s=s.concat(Vehiculo.vehiculos[i].toString());
                }  
            }
        }
        return s;
    }
}