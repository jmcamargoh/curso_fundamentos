import java.util.ArrayList;
public class Vehiculo{
    public static ArrayList<Vehiculo> vehiculos= new ArrayList<Vehiculo>();
    private ArrayList<Sensor> sensores= new ArrayList<Sensor>();
    public static int idActual=1;
    public static int tamano=10;
    public static int posAnadir=0;
    private int id;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
 
    public Vehiculo(){
        this.setId(Vehiculo.idActual);
        Vehiculo.idActual++;
    }
 
    public Vehiculo(int mod, String mar, double val){
        this(mod, mar, val, "Verde");
    }
 
    public Vehiculo(int mo, String ma, double va, String co){
        Vehiculo.vehiculos.add(new Vehiculo());
        Vehiculo.vehiculos.get(posAnadir).setModelo(mo);
        Vehiculo.vehiculos.get(posAnadir).setMarca(ma);
        Vehiculo.vehiculos.get(posAnadir).setValorComercial(va);
        Vehiculo.vehiculos.get(posAnadir).setColor(co);
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
    
    public void setId(int id){
        this.id=id;
    }
    
    public void setSensores(ArrayList<Sensor> sen){
        this.sensores=sen;
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
    
    public int getId(){
        return this.id;
    }
    
    public ArrayList<Sensor> getSensores(){
        return this.sensores;
    }
 
    public String toString(){
        String datosSensores = "Estos son los sensores del vehículo: \n";
        if(this.sensores.size()>0)
        {
            for(int i = 0; i<this.sensores.size() ; i++)
            {
                datosSensores=datosSensores.concat(this.sensores.get(i).toString());
            }
        }
        return "ID: "+getId()+" - Modelo: "+getModelo()+" - Marca: "+getMarca()+" - Valor Comercial: "+getValorComercial()+" - Color: "+getColor()+"\n"+
        datosSensores;
    }
 
    public static int cantidadVehiculos(){
        return Vehiculo.vehiculos.size();
    }
    
    public int cantidadSensores(){
        return this.sensores.size();
    }
    
    public void anadirSensor(Sensor s1){
        this.sensores.add(s1);
    }

    public static String toStringVehiculos()
    {
        String datosVehiculos = "Estos son los vehículos en nuestra lista: \n";
        if(Vehiculo.cantidadVehiculos()>0)
        {
            for(int i = 0; i<Vehiculo.cantidadVehiculos() ; i++)
            {
                datosVehiculos=datosVehiculos.concat(Vehiculo.vehiculos.get(i).toString());
            }
        }
        return datosVehiculos;
    }

    public static String toStringVehiculosVerdes()
    {
        String string = "Estos son los vehículos en nuestra lista: \n";
        if(Vehiculo.cantidadVehiculos()>0)
        {
            for(int i = 0; i<Vehiculo.cantidadVehiculos() ; i++)
            {
                if(Vehiculo.vehiculos.get(i).getColor().toUpperCase().equals("VERDE"))
                {
                    string=string.concat(Vehiculo.vehiculos.get(i).toString());
                }  
            }
        }
        return string;
    }
    
    public static Vehiculo obtenerVehiculoPorId(int id){
        for(Vehiculo vehiculo: vehiculos){
            if(vehiculo.getId()==id){
                return vehiculo;
            }
        }
        return null;
    }
}