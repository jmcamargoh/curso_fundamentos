import java.util.Scanner;
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
        System.out.println("Escoja el número 5 para crear un sensor.");
        System.out.println("Escoja el número 6 para mostrar la información de todos los sensores creados.");
        System.out.println("Escoja el número 7 para mostrar el número de sensores creados.");
        System.out.println("Escoja el número 8 para mostrar la información de tipo temperatura.");
        System.out.println("Escoja el número 666 para visualizar los sensores ");
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
                if(Sensor.cantidadSensores()!=Sensor.tamano){
                    System.out.println("Ingrese el tipo de sensor");
                    String tip = scan.next();
                    System.out.println("Ingrese el valor del sensor");
                    double val = scan.nextDouble();

                    Sensor nSensor = new Sensor(tip, val);
                }
                else
                {
                    System.out.println("Error base de datos llena");
                }
            }
            else if(num==6)
            {
                System.out.println(Sensor.toStringSensores());
            }
            else if(num==7)
            {
                System.out.println(Sensor.cantidadSensores());
            }
            else if(num==8)
            {
                System.out.println(Sensor.toStringSensoresTemp());
            }
            else if(num==666)
            {
                System.out.println(Sensor.toStringSensoresSatanicos(Sensor.obtenerSensoresOrganizados()));
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
