import javax.swing.JOptionPane;

public class Coche {
private String matricula="";
private String marca="Seat";
private String modelo="Altea";
private String color="Blanco";
private boolean techoSolar=false;
private double kilometros=0.0f;
private int numPuertas=3;
private int numPlazas=5;

public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public boolean isTechoSolar() {
	return techoSolar;
}
public void setTechoSolar(boolean techoSolar) {
	this.techoSolar = techoSolar;
}
public double getKilometros() {
	return kilometros;
}
public void setKilometros(double kilometros) {
	if (kilometros < 0 ) {
        JOptionPane.showMessageDialog(null, "Los kilometros no pueden ser menores que 0", "Fabrica de coches", JOptionPane.INFORMATION_MESSAGE);      
	}else
	this.kilometros = kilometros;
}
public int getNumPuertas() {
	return numPuertas;
}
public void setNumPuertas(int numPuertas) {
	if(numPuertas < 5 ) {
		JOptionPane.showMessageDialog(null, "Numero de puertas no puede ser mayor de 5", "Fabrica de coches", JOptionPane.INFORMATION_MESSAGE);      
	}else {
	this.numPuertas = numPuertas;
}
}
public int getNumPlazas() {
	return numPlazas;
}
public void setNumPlazas(int numPlazas) {
	if(numPuertas < 7 ) {
		JOptionPane.showMessageDialog(null, "Numero de plazas no puede ser mayor de 7", "Fabrica de coches ", JOptionPane.INFORMATION_MESSAGE);      
	}else {
		this.numPlazas = numPlazas;
}
}

//CONTRUCTORES
public Coche() {
	
}
public Coche(String matricula) {
	
	this.matricula = matricula;
}
public Coche(int numPuertas, int numPlazas) {
	
	this.numPuertas = numPuertas;
	this.numPlazas = numPlazas;
}
public Coche(String marca, String modelo, String color) {
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
}
//METODOS
public void avanzar(float kilometros) {
    setKilometros(getKilometros()+ kilometros);
    JOptionPane.showMessageDialog(null,"El mecanico ha probado el coche con matricula: " + matricula + "\nAhora el coche tiene: " + kilometros + "KM", "Fabrica de coches", JOptionPane.INFORMATION_MESSAGE);
}
public void tunear() {
    this.kilometros = 0;
    techoSolar = true;
    JOptionPane.showMessageDialog(null, "Se ha tuneado el coche con matricula: " + matricula + "\nAhora tiene 0 KM y techo solar", "Fabrica de coches ", JOptionPane.INFORMATION_MESSAGE);
}
public void tunear(String color) {
    setColor(color);
    this.kilometros = 0;
    this.techoSolar = true;
    JOptionPane.showMessageDialog(null, "Se ha tuneado el coche con matricula: " + matricula + "\nAhora tiene 0 KM, techo solar y se ha puesto el color: " + color , "Fabrica de coches ", JOptionPane.INFORMATION_MESSAGE);
}

public void matricular(String matricula) {
    setMatricula(matricula);
    JOptionPane.showMessageDialog(null,"Se ha matriculado el coche con matricula: " + matricula , "Fabrica de coches", JOptionPane.INFORMATION_MESSAGE);

	}


}
