package Mona;

class MonaOctocat{  //Super clase
        String forma="Gato";

    }

    class linkMona extends MonaOctocat {
        String nombre = "Mona Link";
        String amor="Zelda";
        String colorGorro = "verde";
        int habilidadEspada = 6;

        void lnk() {
            System.out.println("Mona Octocat tiene forma de un " + super.forma + " e infinidad de versatilidades");
            System.out.println("1er versatilidad esta basada en " + nombre);
            System.out.println("Siempre porta un gorro color "+colorGorro+" el nivel de habilidad con espada es "+habilidadEspada+" la cual usa para rescatar a su gran amor "+amor+". \n\n" );
        }}

    class MarioBross extends MonaOctocat {
        String nombre = "Mona Mario Bros";
        int altura= 7;
        int vidasMx = 3;

        void bros(){
            System.out.println("Mona Octocat tiene forma de un " + super.forma + " e infinidad de versatilidades");
            System.out.println("2da versatilidad esta basada en "+nombre);
            System.out.println("En todos los video juegos solo tiene "+vidasMx+" vidas "+" y su altura es de "+altura+" cm. \n\n"
            );
        }}

    class GrinchMon extends MonaOctocat {
    String nombre = "Grinch Mon";
    String colorskin = "verde";
    String vestudario = "Santa Claus";

    void Grinch(){
        System.out.println("Mona Octocat tiene forma de un " + super.forma + " e infinidad de versatilidades");
        System.out.println("3era versatilidad esta basada en "+nombre);
        System.out.println("Porta un color de piel "+colorskin+" siempre porta el vestuario de "+vestudario+ " su mision es robar la navidad.\n\n");
    }}

class WalterWhiteMon extends MonaOctocat {
    String nombre="Walter White Mon";
    int iq=140;
    String habilidad = "Crear metanfetaminas";
    String amigo="Jessy Pinkman";

    void breaking(){
        System.out.println("Mona Octocat tiene forma de un " + super.forma + " e infinidad de versatilidades.");
        System.out.println("4ta versatilidad esta basada en la serie Breaking Bad, su nombre es "+nombre+".");
        System.out.println("Tiene un IQ de "+iq+" su principal habilidad es "+habilidad+" y su mejor amigo se llama "+amigo+" .\n\n");
    }

}

class SpiderMon extends MonaOctocat{
    String nombre="Mona Spider";
    String personaje="Peter Parker";
    String poderes = "lanzar telaraña";
    int publicado=1962;

    void Spider(){
        System.out.println("Mona Octocat tiene forma de un " + super.forma + " e infinidad de versatilidades.");
        System.out.println("5ta versatilidad esta basada en Spider Man, su nombre es "+nombre+".");
        System.out.println("Nombre del personaje es "+personaje+" una de sus principiles habilidades es "+poderes+".");
        System.out.println("Stan Lee fue el creador de "+nombre+" comenzo su creacion en "+publicado+".\n\n");
    }}

class Stormtropper extends MonaOctocat{
    String nombre = "Stormtropper";
    String pelicula = "Star Wars";
    String armadura = "metalica";
    String colorarmadura = "blanca";
    int defensa = 10;
    int numeroClon = 78391;

    void Stars(){
        System.out.println("Mona Octocat tiene forma de un " + super.forma + " e infinidad de versatilidades.");
        System.out.println("6ta versatilidad esta basada en los Stormtroopers son presentados dentro del universo"+pelicula+".");
        System.out.println("Material de su armadura es "+armadura+ " y el color es "+colorarmadura);
        System.out.println("Su nivel de defensa va de 3 a "+defensa+" y el numero de su clon es "+numeroClon+"\n\n");
    }
}


public class  Mona1 { //herencia
    public static void main(String[] args) {
        new linkMona().lnk();
        new MarioBross().bros();
        new GrinchMon().Grinch();
        new WalterWhiteMon().breaking();
        new SpiderMon().Spider();
        new Stormtropper().Stars();
    }
}



