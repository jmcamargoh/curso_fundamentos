import java.util.Scanner;
import java.io.File;

public class Principal
{
    public static void main(String[] args)
    {
        Principal.mostrarMenu();
    }
 
    public static void mostrarMenu()
    {
        System.out.println("Escoja el número 1 para crear un vehículo.");
        System.out.println("Escoja el número 2 para mostrar la información de todos los vehículos creados.");
        System.out.println("Escoja el número 3 para mostrar la cantidad de vehículos creados.");
        System.out.println("Escoja el número 4 para mostrar la información de los vehículos verdes.");
        System.out.println("Escoja el número 5 para mostrar la información de algún vehiculo");
        System.out.println("Escoja el número 6 para darle un sensor a algún vehiculo");
        System.out.println("Escoja el número 7 para mostrar los sensores de uno de los vehiculos");
        System.out.println("Escoja el número 8 para mostrar la información de todos los sensores tipo temperatura");
        System.out.println("Escoja el número 9 para mostrar la información del vehiculo con más sensores");
        System.out.println("Escoja el número 10 para cargar 5 vehículos ficticios");
        System.out.println("Escoja el número 666 para visualizar todos los sensores de tipo temperatura ordenados por valor");
        Scanner scan = new Scanner(System.in);
        System.out.println("Escoja el número");
        int num = scan.nextInt();
        int contador = 0;

        while(num != 0)
        {
            if(num==1)
            {
                if(Vehiculo.cantidadVehiculos()!=Vehiculo.tamano)
                {
                    System.out.println("Ingrese el modelo del vehículo");
                    int mod = scan.nextInt();

                    System.out.println("Ingrese la marca del vehículo");
                    String mar = scan.next();

                    System.out.println("Ingrese el valor comercial del vehículo");
                    double var = scan.nextDouble();

                    System.out.println("Ingrese el color del vehículo");
                    String col = scan.next();

                    Vehiculo nVehiculo = new Vehiculo(mod, mar, var, col);
                }
                else
                {
                    System.out.println("Error base de datos llena");
                }
            }
            else if(num==2)
            {
                System.out.println(Vehiculo.toStringVehiculos());
            }
            else if(num==3)
            {
                System.out.println(Vehiculo.cantidadVehiculos());
            }
            else if(num==4)
            {
                System.out.println(Vehiculo.toStringVehiculosVerdes());
            }
            else if(num==5)
            {
                System.out.println("Ingrese un ID");
                int id = scan.nextInt();
                if(Vehiculo.obtenerVehiculoPorId(id)==null){
                    System.out.println("Error, ID no encontrado");
                }else{
                    Vehiculo vehiculo = Vehiculo.obtenerVehiculoPorId(id);
                    System.out.println(vehiculo.toString());
                }
            }
            else if(num==6)
            {
                System.out.println("Ingrese un ID");
                int id= scan.nextInt();
                if(Vehiculo.obtenerVehiculoPorId(id)==null){
                    System.out.println("Error, ID no encontrado");
                }else{
                    Vehiculo vehiculo= Vehiculo.obtenerVehiculoPorId(id);
                    System.out.println("Ingrese el tipo de sensor");
                    String tip = scan.next();
                    System.out.println("Ingrese el valor del sensor");
                    double val = scan.nextDouble();
                    Sensor s1 = new Sensor(tip, val);
                    vehiculo.anadirSensor(s1);
                }
            }
            else if(num==7)
            {
                System.out.println("Ingrese un ID");
                int id= scan.nextInt();
                if(Vehiculo.obtenerVehiculoPorId(id)==null){
                    System.out.println("Error, ID no encontrado");
                }else{
                    Vehiculo vehiculo= Vehiculo.obtenerVehiculoPorId(id);
                    System.out.println(vehiculo.toStringSensores());
                }
            }
            else if(num==8)
            {
                System.out.println(Vehiculo.toStringTodosSensoresTemp());
            }
            else if(num==9)
            {
                System.out.println(Vehiculo.obtenerVehiculosConMasSensores());
            }
            else if(num==10)
            {
                File file= new File("prueba.txt");
                try{
                    Scanner input= new Scanner(file);
                    String linea;
                    int cont=1;
                    while(input.hasNextLine()){
                        linea= input.nextLine();
                        String[] parts= linea.split(",");
                        System.out.print(" Modelo vehiculo "+cont+": "+parts[0]);
                        System.out.print(" Marca vehiculo "+cont+": "+parts[1]);
                        System.out.print(" Valor vehiculo "+cont+": "+parts[2]);
                        System.out.print(" Color vehiculo "+cont+": "+parts[3] + "\n");
                        Vehiculo temp= new Vehiculo(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]), parts[3]);
                        cont++;
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
            else if(num==666)
            {
                System.out.println(Vehiculo.toStringSensoresSatanicos(Vehiculo.obtenerSensoresOrganizados()));
            }
            System.out.println("Escoja el número 1 para crear un vehículo.");
            System.out.println("Escoja el número 2 para mostrar la información de todos los vehículos creados.");
            System.out.println("Escoja el número 3 para mostrar la cantidad de vehículos creados.");
            System.out.println("Escoja el número 4 para mostrar la información de los vehículos verdes.");
            System.out.println("Escoja el número 5 para crear un sensor.");
            System.out.println("Escoja el número 6 para mostrar la información de todos los sensores creados.");
            System.out.println("Escoja el número 7 para mostrar el número de sensores creados.");
            System.out.println("Escoja el número 8 para mostrar la información de tipo temperatura.");
            System.out.println("Escoja el número 666 para visualizar los sensores ");
            System.out.println("Escoja el número");
            num = scan.nextInt();
        }
    }
}
