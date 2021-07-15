package utp.misiontic2022.c2.p47.reto1;

public class CalcularPrestamo {
    //----------------------------------------------
    //Atributos
    private int pTiempo;
    private double pCapital;
    private double pInteres;
    private double interesSimple;
    private double interesCompuesto;
    private double compararInversion;
    //----------------------------------------------

    //----------------------------------------------
    //Constructores
    public CalcularPrestamo() {
        this.pCapital = 0.0;
        this.pInteres = 0.0;
        this.pTiempo = 0;
    }
    //----------------------------------------------

    //----------------------------------------------
    //Metodos
    public double interesSimples() {
        return this.setInteresSimple((((pCapital * pInteres)/100) * pTiempo));
    }
    public double interesCompuestos() {
        return this.setInteresCompuesto(((pCapital*((((1+pInteres)/100)*pTiempo)-1))));
    }
    public double compararInversion() {
        return this.setCompararInversion(((this.interesCompuesto - this.interesSimple)));
    }
    
    //----------------------------------------------

    public double compararPrestamo(int pTiempo, double pCapital, double pInteres) {
        CalcularPrestamo calcularPrestamo  =  new CalcularPrestamo();
        
        
    }

    public int getpTiempo() {
        return pTiempo;
    }

    public void setpTiempo(int pTiempo) {
        this.pTiempo = pTiempo;
    }

    public double getpCapital() {
        return pCapital;
    }

    public void setpCapital(double pCapital) {
        this.pCapital = pCapital;
    }

    public double getpInteres() {
        return pInteres;
    }

    public void setpInteres(double pInteres) {
        this.pInteres = pInteres;
    }
    public double getInteresSimple() {
        return interesSimple;
    }

    public double setInteresSimple(double interesSimple) {
        this.interesSimple = interesSimple;
        return interesSimple;
    }

    public double getInteresCompuesto() {
        return interesCompuesto;
    }

    public double setInteresCompuesto(double interesCompuesto) {
        this.interesCompuesto = interesCompuesto;
        return interesCompuesto;
    }
    
    public double getCompararInversion() {
        return compararInversion;
    }

    public double setCompararInversion(double compararInversion) {
        this.compararInversion = compararInversion;
        return compararInversion;
    }



    public static void main(String[] args) {
        System.out.println(resultadoInversion.calcularInteresSimple()); 
        System.out.println(resultadoInversion.calcularInteresCompuesto());
        System.out.println(resultadoInversion.compararPrestamo(24,5000000,4.2)); 
    }
}
