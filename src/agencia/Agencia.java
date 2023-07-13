
package agencia;

import javax.swing.JOptionPane;


public class Agencia {

   public void menu(){
       byte opc=1;
       VentaVehiculo obj = new VentaVehiculo();
       Vehiculo matCarros[][]= new Vehiculo[2][2];
       while(opc>=1 && opc<7){
              opc= Byte.parseByte(JOptionPane.showInputDialog(" 1. Hacer venta\n 2. Imprimir Venta\n 3. Autos con extras \n 4.  Vehiculos precio mayor 25000 \n 5. Carros verdes\n 6. Carro más caro\n7.Salir"));
              switch(opc){
                  case 1: obj.venta(matCarros);
                      break;
                  case 2: obj.imprimeVenta(matCarros);
                      break;
                  case 3:  obj.vehiculoExtra(matCarros);
                  break;
                  case 4: obj.vehiculo25(matCarros);
                  break;
                  case 5: obj.carrosVerdes(matCarros);
                  break;
                  case 6:obj.carroCaro(matCarros);
                  default: System.out.println("Getting out of the system");
              }
           
       }//cierra while
   }//cierra metodo
    public static void main(String[] args) {
       Agencia objAgencia = new Agencia();
       objAgencia.menu();
    }
    
}
