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
        ejercicio4();
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
        String nombres[] = new String[50];
    float matnotas[] = new float[50];
    float ingnotas[] = new float[50];
    float espnotas[] = new float[50];

    int cantidad = 0;

    while (true) {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(
                "   MENU:\n"
                + "1. Registrar notas.\n"
                + "2. Calcular promedio por materia.\n"
                + "3. Calcular promedio total del curso.\n"
                + "4. Mostrar estudiantes aprobados y reprobados.\n"
                + "5. SALIR.\n"));

        switch (menu) {
            case 1:
                String nombre = JOptionPane.showInputDialog("ingrese el nombre del estudiante:");
                nombres[cantidad] = nombre;
                float matnota = Float.parseFloat(JOptionPane.showInputDialog("ingrese la nota de Matemáticas:"));
                matnotas[cantidad] = matnota;
                float ingnota = Float.parseFloat(JOptionPane.showInputDialog("ingrese la nota de  Inglés:"));
                ingnotas[cantidad] = ingnota;
                float espnota = Float.parseFloat(JOptionPane.showInputDialog("ingrese la nota de Español:"));
                espnotas[cantidad] = espnota;

                cantidad++;
                break;

            case 2:
                float sumaMat = 0, sumaIng = 0, sumaEsp = 0;
                for (int i = 0; i < cantidad; i++) {
                    sumaMat += matnotas[i];
                    sumaIng += ingnotas[i];
                    sumaEsp += espnotas[i];
                }

                JOptionPane.showMessageDialog(null,"el promedio de Matemáticas es: " + (sumaMat / cantidad) +
                        "\n el promedio de Inglés es: " + (sumaIng / cantidad) +
                        "\n el promedio de Español es: " + (sumaEsp / cantidad));
                break;

            case 3:
                float sumaTotal = 0;
                for (int i = 0; i < cantidad; i++) {
                    float promedioEst = (matnotas[i] + ingnotas[i] + espnotas[i]) / 3;
                    sumaTotal += promedioEst;
                }
                JOptionPane.showMessageDialog(null,"el promedio total del curso es: " + (sumaTotal / cantidad));
                break;

            case 4:
                String aprobados = "";
                String reprobados = "";
                for (int i = 0; i < cantidad; i++) {
                    float promedio = (matnotas[i] + ingnotas[i] + espnotas[i]) / 3;
                while (promedio >= 3.0) {
                    aprobados += nombres[i] + " Promedio: " + promedio + "\n";
                    break;
                }
                while (promedio < 3.0) {
                    reprobados += nombres[i] + " Promedio: " + promedio + "\n";
                    break;
                }
                }
                JOptionPane.showMessageDialog(null,
                        "APROBADOS:\n" + aprobados +
                        "\nREPROBADOS:\n" + reprobados);
                break;

            case 5:
                System.exit(0);
        }
    }}
    public static void ejercicio4() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas personas desea ingresar?"));

        String nombres[] = new String[n];
        char sexos[]= new char[n];

        int contadorH = 0;
        int contadorM = 0;

        for (int i = 0; i < n; i++) {
            nombres[i] = JOptionPane.showInputDialog("Nombre de la persona " + (i + 1) + ":");
            
            boolean valido = false;
            while (!valido) {
                String s = JOptionPane.showInputDialog("Sexo de " + nombres[i] + " (f/m):").toLowerCase();
                
                if (!s.isEmpty()) {
                    char letra = s.charAt(0);
                    switch (letra) {
                        case 'm':
                            sexos[i] = 'm';
                            contadorH++; 
                            valido = true;
                            break;
                        case 'f':
                            sexos[i] = 'f';
                            contadorM++; 
                            valido = true;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Error: Use 'f' o 'm'");
                    }
                }
            }
        }
        String[] listaHombres = new String[contadorH];
        String[] listaMujeres = new String[contadorM];

        int idxH = 0;
        int idxM = 0; 

        for (int i = 0; i < n; i++) {
            switch (sexos[i]) {
                case 'm':
                    listaHombres[idxH] = nombres[i];
                    idxH++;
                    break;
                case 'f':
                    listaMujeres[idxM] = nombres[i];
                    idxM++;
                    break;
            }
        }
        String resH = "Hombres: ";
        for (String h : listaHombres) resH += h + " ";

        String resM = "Mujeres: ";
        for (String m : listaMujeres) resM += m + " ";

        JOptionPane.showMessageDialog(null, resH + "\n" + resM);
    }
}
