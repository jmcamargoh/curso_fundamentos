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
        return "ID: "+getId()+" - Modelo: "+getModelo()+" - Marca: "+getMarca()+" - Valor Comercial: "+getValorComercial()+" - Color: "+getColor()+"\n"+
        this.toStringSensores();
    }
    
    public String toStringSensores(){
        String datosSensores = "Estos son los sensores del veh??culo: \n";
        if(this.sensores.size()>0)
        {
            for(int i = 0; i<this.sensores.size() ; i++)
            {
                datosSensores=datosSensores.concat(this.sensores.get(i).toString());
            }
        }
        return datosSensores;
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
        String datosVehiculos = "Estos son los veh??culos en nuestra lista: \n";
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
        String string = "Estos son los veh??culos en nuestra lista: \n";
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
    
    public static String toStringTodosSensoresTemp()
    {
        String string="";
        for(Vehiculo vehiculo: vehiculos){
            string = string.concat("Estos son los sensores TEMPERATURA del vehiculo con ID "+vehiculo.getId()+": \n");
            if(vehiculo.cantidadSensores()>0)
            {
                for(int i = 0; i<vehiculo.cantidadSensores() ; i++)
                {
                    if(vehiculo.getSensores().get(i).getTipo().toUpperCase().equals("TEMPERATURA"))
                    {
                        string = string.concat(vehiculo.getSensores().get(i).toString());
                    }
                }
            }
      }
      return string;
    }
    
    public static String obtenerVehiculosConMasSensores(){
       int num=0;
       for(int i=0; i<Vehiculo.vehiculos.size(); i++){
            if(Vehiculo.vehiculos.get(i).cantidadSensores()>Vehiculo.vehiculos.get(num).cantidadSensores()){
                num=i;
            }
        }
       return "Informaci??n del veh??culo con m??s sensores: \n"+
       Vehiculo.vehiculos.get(num).toString();
    }
    
    public static ArrayList<Sensor> obtenerSensoresOrganizados()
    {
        ArrayList<Sensor> organizado = new ArrayList<Sensor>();
        for(Vehiculo vehiculo: vehiculos)
        {
            ArrayList<Sensor> sensoresTemporal= vehiculo.getSensores();
            for(Sensor sensor: sensoresTemporal){
            if(sensor.getTipo().toUpperCase().equals("TEMPERATURA"))
            {
                organizado.add(sensor);
            }
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
    
    public static String toStringSensoresSatanicos(ArrayList<Sensor> sensores)
    {
        String string = "Estos son los sensores en nuestra lista: \n";
        if(sensores.size()>0)
        {
            for(int i = 0; i<sensores.size() ; i++)
            {
                string=string.concat(sensores.get(i).toString());
            }
        }
        return string;
    }
}
