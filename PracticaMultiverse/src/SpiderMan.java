public class SpiderMan {
    private int id;
    private String nombre;
    private  String UniversoOrigen;
    private String descripcion;

    public SpiderMan(int id, String nombre, String poder, String UniveroOrigen, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.UniversoOrigen = UniveroOrigen;
        this.descripcion = descripcion;
    }

    // Get
    public int getId(){ return id; }
    public String getNombre(){ return nombre; }
    public String getUniversoOrigen(){ return UniversoOrigen;}
    public String getDescripcion(){ return descripcion; }

    // Set
    public boolean setId(int id){
        if(id > 0) {
            this.id = id;
            return true;
        }else
            return false;
        }

        public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

        public boolean setUniversoOrigen(String universoOrigen) {

            if (!universoOrigen.isEmpty()) {
                this.UniversoOrigen = universoOrigen;
                return true;
            } else
                return false;
        }

        public boolean setDescripcion(String descripcion){

        if (!descripcion.isEmpty()) {
            this.descripcion = descripcion;
            return true;
        }else
            return false;

        }

        public String showMessage(){
        return
                "id: "+id+ "\n"+
                        "nombre: " +nombre+ "\n"+
                        "Universo de Origen " +UniversoOrigen+ "\n"+
                        "Decripción personaje: " +descripcion+"\n";

    }


}
