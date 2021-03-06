import javax.swing.JOptionPane;

public class Fabrica {

	public static void main(String[] args) {
		Coche[] coches = new Coche[4];
            JOptionPane.showMessageDialog(null, "Bienvenido, se van a fabricar 4 coches con los 4 constructores", "Fabrica de coches ", JOptionPane.INFORMATION_MESSAGE);
            //creamos los constructores definidos en la clase
            Coche car1 = new Coche();  
            Coche car2 = new Coche("5678-AG");  
            Coche car3 = new Coche(5, 5);  
            Coche car4 = new Coche("VW", "Caddy", "Blanco");
            //Creacion de array 
            coches[0] = car1;
            coches[1] = car2; 
            coches[2] = car3;
            coches[3] = car4;
            //para ir recoriendo el array y mostrar coches antes de la modicacion
            for (int i = 0; i < coches.length; i++) {
                JOptionPane.showMessageDialog(null, caracteristicas(coches[i], i, true));
            }
            //Ajustar valores a los de la tabla
            JOptionPane.showMessageDialog(null, "Se van a ajustar los valores a los de la tabla...", "Fabrica de coches ", JOptionPane.INFORMATION_MESSAGE);
            ajustarValores(car1, car2, car3, car4);
            JOptionPane.showMessageDialog(null, "Estas son sus caracteristicas tras la modificacion:", "Fabrica de coches ", JOptionPane.INFORMATION_MESSAGE);
            //Mostrar coches tras la modificación
            for (int i = 0; i < coches.length; i++) {
            JOptionPane.showMessageDialog(null, caracteristicas(coches[i], i, false), "Fabrica de coches ", JOptionPane.INFORMATION_MESSAGE);
            }
       
    }
    //Metodo que retorna la informacion de los coches
    public static String caracteristicas(Coche c, int i, boolean inicioFinal) {
        String informacion = ((inicioFinal)?"\nCaractericticas iniciales de car":"Caractericticas finales de car") + (i +1) + ":\n----------------------------------------------" + "\nMatricula: " + c.getMatricula() + " \nMarca: " + c.getMarca() + " \nModelo: " + c.getModelo() 
                    + " \nColor: " + c.getColor() + "\nTecho solar: " + ((c.isTechoSolar())?"Si":"No") + "\nKilometraje: " + c.getKilometros() 
                    + "\nNumero de puertas: " + c.getNumPuertas() + "\nNumero de puertas: " + c.getNumPlazas() + "\n----------------------------------------------\n";
        return informacion;
    }
    //Metodo para modificar los coches
    public static void ajustarValores(Coche car1, Coche car2, Coche car3, Coche car4) {

        //Modificaciones car1
        car1.matricular("1234-DF");
        car1.setMarca("Seat");
        car1.setModelo("Toledo");
        car1.setColor("Azul");
        car1.setTechoSolar(false);
        car1.avanzar(200);
        car1.setNumPuertas(3);
        car1.setNumPlazas(5);
        //Modificaciones car2
        car2.setMarca("Fiat");
        car2.setModelo("Uno");
        car2.tunear("Rojo");
        car2.avanzar(300);
        car2.setNumPuertas(3);
        car2.setNumPlazas(2);
        //Modificaciones car3
        car3.matricular("9012-HH");
        car3.setMarca("BMW");
        car3.setModelo("850");
        car3.setColor("Gris");
        car3.setTechoSolar(false);
        car3.avanzar(400);
        //Modificaciones car4
        car4.matricular("3456-XS");
        car4.setTechoSolar(true);
        car4.avanzar(500);
        car4.setNumPuertas(5);
        car4.setNumPlazas(7);
    }
}
