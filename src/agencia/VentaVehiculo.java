
package agencia;

import javax.swing.JOptionPane;


public class VentaVehiculo {
    public void venta(Vehiculo matCarros[][]){
        for(int fila=0; fila<matCarros.length; fila++){
             for(int col=0; col<matCarros[fila].length; col++){
                 //preparamos la matriz de objeto vehiculo
               matCarros[fila][col]= new Vehiculo();
               
               matCarros[fila][col].setPlaca(JOptionPane.showInputDialog("Ingrese la placa"));
               matCarros[fila][col].setModelo(JOptionPane.showInputDialog("Ingrese el modelo"));
               matCarros[fila][col].setColor(JOptionPane.showInputDialog("Ingrese el color"));
               matCarros[fila][col].setPrecioVehiculo(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio")));
                 byte extra= Byte.parseByte(JOptionPane.showInputDialog("1.Extras\n 2.Sin extras\n Digite su opcion"));
                 if(extra == 1)
                 matCarros[fila][col].setExtras(true);
                 else
                     matCarros[fila][col].setExtras(false);
             }//cierra for col
        }//cierra for fila
    }//cierra metodo
    
    public void imprimeVenta(Vehiculo matCarros[][]){
        int numCar=0;
        for(int fila=0; fila<matCarros.length; fila++){
             for(int col=0; col<matCarros[fila].length; col++){
               
                 System.out.println("Carro numero :"+ numCar);
                 System.out.println("Placa :"+matCarros[fila][col].getPlaca());
                 System.out.println("Modelo :"+matCarros[fila][col].getModelo());
                 System.out.println("Precio :"+matCarros[fila][col].getPrecioVehiculo());
                 System.out.println("Color :"+matCarros[fila][col].getColor());
                     if(matCarros[fila][col].isExtras()==true)
                         System.out.println("Car has extras");
                     else 
                         System.out.println("Does not have extras");
                     System.out.println("-------------------");
                     numCar++;
    }//cierra for col
        }//cierra fila
    }//cierra metodo
  public void vehiculoExtra(Vehiculo matCarros[][]){
      for(int fila=0; fila<matCarros.length; fila++){
             for(int col=0; col<matCarros[fila].length; col++){
              if(matCarros[fila][col].isExtras()==true){
                  System.out.println("VEHÍCULOS CON EXTRAS");
                  System.out.println(" ");
                      
              
                 System.out.println("Placa :"+matCarros[fila][col].getPlaca());
                 System.out.println("Modelo :"+matCarros[fila][col].getModelo());
                 System.out.println("Precio :"+matCarros[fila][col].getPrecioVehiculo());
                 System.out.println("Color :"+matCarros[fila][col].getColor());
                     System.out.println("-------------------");
                     
              }//cierra if
              
                     
    }//cierra for col
        }//cierra fila
      
  }//cierra metodo vehiculoExtra
  
  
  public void vehiculo25(Vehiculo matCarros[][]){
    for(int fila=0; fila<matCarros.length; fila++){
             for(int col=0; col<matCarros[fila].length; col++){
                   System.out.println("VEHÍCULOS MAYORES A 25000");
                    System.out.println(" ");
              if(matCarros[fila][col].getPrecioVehiculo()>=25000){
                 
                      
              
                 System.out.println("Placa :"+matCarros[fila][col].getPlaca());
                 System.out.println("Modelo :"+matCarros[fila][col].getModelo());
                 System.out.println("Precio :"+matCarros[fila][col].getPrecioVehiculo());
                 System.out.println("Color :"+matCarros[fila][col].getColor());
                     System.out.println("  ");
                     
                         
              }//cierra if
                else 
                     System.out.println("There are no cars that have higher price than 25000 ");
                     
    }//cierra for col
        }//cierra fila
  }//cierra metodo vehiculo25
  public void carrosVerdes(Vehiculo matCarros[][]){
      for(int fila=0; fila<matCarros.length; fila++){
             for(int col=0; col<matCarros[fila].length; col++){
             if(matCarros[fila][col].getColor().equalsIgnoreCase("verde")){
                 System.out.println("Placa :"+matCarros[fila][col].getPlaca());
                 System.out.println("Modelo :"+matCarros[fila][col].getModelo());
                 System.out.println("Precio :"+matCarros[fila][col].getPrecioVehiculo());
                 System.out.println("Color :"+matCarros[fila][col].getColor());
                     System.out.println("  ");
                              
              }//cierra if
              
                     
    }//cierra for col
        }//cierra fila
  }
    public void carroCaro(Vehiculo matCarros[][]){
        float precioMayor= matCarros[0][0].getPrecioVehiculo();
        int i = 0, j= 0;
         for(int fila=0; fila<matCarros.length; fila++){
             for(int col=0; col<matCarros[fila].length; col++){
             if(matCarros[fila][col].getPrecioVehiculo()>precioMayor){
                 precioMayor=matCarros[fila][col].getPrecioVehiculo();
                 i=fila;
                 j=col;
                 }   //cierra if
                  System.out.println("Placa :"+matCarros[fila][col].getPlaca());
                 System.out.println("Modelo :"+matCarros[fila][col].getModelo());
                 System.out.println("Precio :"+matCarros[fila][col].getPrecioVehiculo());
                 System.out.println("Color :"+matCarros[fila][col].getColor());
                     System.out.println("  ");
         
              
                     
    }//cierra for col
        }//cierra fila
            System.out.println("Placa :"+matCarros[i][j].getPlaca());
                 System.out.println("Modelo :"+matCarros[i][j].getModelo());
                 System.out.println("Precio :"+matCarros[i][j].getPrecioVehiculo());
                 System.out.println("Color :"+matCarros[i][j].getColor());
                     System.out.println("  ");
    }
}//cierra clase main 
