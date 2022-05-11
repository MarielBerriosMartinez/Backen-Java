package PracticaHarry;

public class Modelado_Harry {
    // Caracteristicas u Objeto:
    // Caracteristicas Harry
    public int cicatriz;
    public String nombre, mascota;

    //*********** Snape*//
    public String caracter, nombre5, SuPrimerAmor; //enojon y misterioso //LiliPotter
    public double altura; //1.85

    // Caracteristicas Don_bulldog
    public String mascota1, nombre4; //Ave fenix
    public int edad; //150

    // Caracteristica Ron
    public String color_cabello1, nombre3;
    public int numero_hermanos; // 3

    // Caracteristicas Hermione
    public String nombre2, tipo_sangre; //Muggle
    public int Mejores_amigos;


    //* ------------------------------------------------------------------------------------------------------------------------------------- *//
    // HARRY                     GET (Metodos de retorno por que ya tienen un valor)
    public int getCicatriz() {
        return cicatriz;
    }  //Cuando me de la cicatriz me debe regresar la cicatriz
    public String getnombre() {
        return nombre;
    }
    public String getmascota() {
        return mascota;
    }

    // SNAPE
    public String getCaracter(){ return caracter; }
    public String getnombre5(){ return nombre5; }
    public String getSuPrimerAmor(){ return SuPrimerAmor; }
    public double getAltura(){ return altura; }

    // DONBULLDOG
    public String getMascota1(){ return mascota1; }
    public String getNombre4(){ return nombre4; }
    public int getEdad(){ return edad; }

    //RON
    public String getColor_cabello1(){ return color_cabello1; }
    public String getNombre3(){ return nombre3;}
    public int getNumero_hermanos(){ return numero_hermanos; }

    //HERMIONI
    public String getNombre2(){ return nombre2; }
    public String getTipo_sangre(){ return tipo_sangre; }
    public int getMejores_amigos(){ return Mejores_amigos; }

// HARRY
    public boolean setCicatriz(int cicatriz) {
        if (cicatriz > 0) {
            this.cicatriz = cicatriz;
            return true;
        } else
            return false;
    }

    public boolean setnombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }
    public boolean setmascota(String mascota) {
        if (!mascota.isEmpty()) {
            this.mascota = mascota;
            return true;
        } else
            return false;
    }

    // SNAPE
    public boolean setcaracter(String caracter){
        if(!caracter.isEmpty()) {
            this.caracter = caracter;
            return true;
        }else
            return false;

    }
    public boolean setnombre5(String nombre5){
        if(!nombre5.isEmpty()){
            this.nombre5 = nombre5;
            return true;
        }else
            return false;
    }
    public boolean setSuPrimerAmor(String SuPrimerAmor) {
        if (!SuPrimerAmor.isEmpty()) {
            this.SuPrimerAmor = SuPrimerAmor;
            return true;
        } else
            return false;
    }
    public boolean setaltura(double altura){
        if (altura > 0.0) {
            this.altura = altura;
            return true;
        } else
            return false;
    }

    // DONBULLDOG
    public boolean setmascota1(String mascota1){
        if(!mascota1.isEmpty()) {
            this.mascota1 = mascota1;
            return true;
        }else
            return false;
    }

    public boolean setnombre4(String nombre4){
        if(!nombre4.isEmpty()) {
            this.nombre4 = nombre4;
            return true;
        }else
            return false;
    }
    public boolean setedad(int edad){
        if(edad > 0) {
            this.edad = edad;
            return true;
        }else
            return false;
    }

    // RON
    public boolean setcolor_cabello1 (String color_cabello1){
        if (!color_cabello1.isEmpty()) {
            this.color_cabello1 = color_cabello1;
            return true;
        }else
            return false;

    }
    public boolean setnombre3 (String nombre3){
        if(!nombre3.isEmpty()) {
            this.nombre3 = nombre3;
            return true;
        }else
            return false;
    }
    public boolean setnumero_hermanos (int numero_hermanos){
        if(numero_hermanos > 0) {
            return true;
        }else
            return false;
    }
    // HERMIONE
    public boolean setnombre2 (String nombre2){
        if(!nombre2.isEmpty()) {
            this.nombre2 = nombre2;
            return true;
        }else
            return false;
    }

    public boolean settipo_sangre (String tipo_sangre) {
        if (!tipo_sangre.isEmpty()) {
            this.tipo_sangre = tipo_sangre;
            return true;
        } else
            return false;
    }
    public boolean setMejores_amigos(int Mejores_amigos){
        if(Mejores_amigos >= 0) {
            this.Mejores_amigos = Mejores_amigos;
            return true;
        }else
            return false;
    }}
