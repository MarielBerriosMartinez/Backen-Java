package PracticaHarry;

public class PruebaModelado {
    public static void main(String[] args) {
def();

    }
    public static void def(){
    Modelado_Harry HarryPrueba = new Modelado_Harry();
    HarryPrueba.setCicatriz(1);
    HarryPrueba.setnombre("Harry Potter");
    HarryPrueba.setmascota("Lechuza");

    // SNAPE
    HarryPrueba.setnombre5("Severus Snape");
    HarryPrueba.setcaracter("Enojon y Misterioso");
    HarryPrueba.setaltura(1.85);
    HarryPrueba.setSuPrimerAmor("Lili Potter");

    //DONBULLDOG
        HarryPrueba.setnombre4("Albus Dumbledore");
        HarryPrueba.setmascota1("Ave Fenix");
        HarryPrueba.setedad(150);

        // RON
        HarryPrueba.setnombre3("Ron Weasley");
        HarryPrueba.setcolor_cabello1("Peli rojo");
        HarryPrueba.setnumero_hermanos(3);

        // HERMIONI
        HarryPrueba.setnombre2("Hermione Granger");
        HarryPrueba.settipo_sangre("Muggle");
        HarryPrueba.setMejores_amigos(2);


        String msg = "Cracteristicas Personajes de Harry Potter";
        msg += "\nNombre:  " + HarryPrueba.getnombre();
        msg += "\nCicatriz:  " + HarryPrueba.getCicatriz();
        msg += "\nSu mascota es:  " + HarryPrueba.getmascota();
        /* ----------------------------------------------------------------------------- */
        msg += "\nNombre:  " + HarryPrueba.getnombre5();
        msg += "\nCaracter:  " + HarryPrueba.getCaracter();
        msg += "\nAltura:  " + HarryPrueba.getAltura();
        msg += "\nSu primer amor fue:  " + HarryPrueba.getSuPrimerAmor();

        /* --------------------------------------------------------------------------------------- */

        msg += "\nNombre:  " + HarryPrueba.getNombre4();
        msg += "\nMascota:  " + HarryPrueba.getMascota1();
        msg += "\nEdad:  " + HarryPrueba.getEdad();

        /* ------------------------------------------------------------------------------------------ */
        msg += "\nNombre:  " + HarryPrueba.getNombre3();
        msg += "\nColor Cabello:  " + HarryPrueba.getColor_cabello1();
        msg += "\nNumero Hermanos:  " + HarryPrueba.getNumero_hermanos();

        /* ------------------------------------------------------------------------------------------ */
        msg += "\nNombre:  " + HarryPrueba.getNombre2();
        msg += "\nTipo de sangre:  " + HarryPrueba.getTipo_sangre();
        msg += "\nMejores amigos:  " + HarryPrueba.getMejores_amigos();


        System.out.println(msg);
    }}
