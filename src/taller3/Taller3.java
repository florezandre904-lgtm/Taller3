/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller3;

import javax.swing.JOptionPane;

/**
 *
 * @author UIS
 */
public class Taller3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejercicio2();
    }
    public static void ejercicio1() {
        
        while (true) {      
            
            int n1= Integer.parseInt(JOptionPane.showInputDialog("  ingrese \n"
                    + "1 para saludar.\n"
                    + " 2 para despedirse.\n "
                    + "3 para salir.\n"));
            switch (n1) {
            case 1:
                
            JOptionPane.showMessageDialog(null,"hola");
                
                
            break;
            case 2:
                
                    JOptionPane.showMessageDialog(null, "adios");
                
            break;
            case 3: 
                System.exit(0);
                }
            
        }
    }
    public static void ejercicio2(){
        while (true) {
            int x1 = Integer.parseInt(JOptionPane.showInputDialog("  seleccione la opcion que desea realizar:\n  "
                    + "1 calcular el area del cuadrado.\n"
                    + " 2 calcular el area del circulo.\n "
                    + "3 calcular el area del triangulo.\n"
                    + "4 calcular el area del rectangulo.\n "
                    + "5 salir\n"));
            switch (x1) {
                case 1:
                    int l = Integer.parseInt(JOptionPane.showInputDialog("ingrese la medida del lado "));
                    int A= l*l ;
                    JOptionPane.showMessageDialog(null, "el area del cuadrado es " + A);
                    break;
                case 2:
                    float c= Float.parseFloat(JOptionPane.showInputDialog("ingrese la medida del radio "));
                    JOptionPane.showMessageDialog(null, "el area del circulo es " + (Math.PI*c*c));
                    break;
                case 3:
                    float b = Float.parseFloat(JOptionPane.showInputDialog("ingrese la medida de la base del traingulo"));
                    float h = Float.parseFloat(JOptionPane.showInputDialog("ingrese la medida de la altura del triangulo "));
                    JOptionPane.showMessageDialog(null,"el area del triangulo es: " + ((b*h)/2));
                    break;
                case 4:
                    float B = Float.parseFloat(JOptionPane.showInputDialog("ingrese la medida de la base del rectangulo"));
                    float H = Float.parseFloat(JOptionPane.showInputDialog("ingrese la medida de la altura del rectangulo "));
                    JOptionPane.showMessageDialog(null,"el area del rectangulo  es: " + (B*H));
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
    public static void ejercicio3 () {
        int menu = Integer.parseInt(JOptionPane.showInputDialog("ingrese la opcion que desea realizar:\n"
                + "1. registrar notas.\n"
                + "2. calcular promedio por materia.\n"
                + "3. calcular promedio total del curso.\n"
                + "4. mostrar estudiantes aprobados y reprobados.\n"
                + "5. salir.\n"));
        while (true) {            
            switch (menu) {
                case 1:
                    
                    
                    break;
                
            }
        }
        
        
        
    }
}
