public class Test {

    public static void main(String[] args) throws InterruptedException{
TestPeter();

    }

    private static void TestPeter() throws InterruptedException {
        Screen screen = new Screen();

        Spiderman1 s = new Spiderman1(1, "Spider Man", "Lanza telaraña", "Marvel",
                "Peter Parker mide 1.77 cm de altura y pesa unos 75 kg. Sus ojos son de color avellana y tienden a ser traviesos y amigables.");

        SpidermanVenom s1 = new SpidermanVenom(2, "Venom", "Es Inmortal y el más fuerte de todos los Spider", "Marvel",
                "Venom, también conocido como Veneno, es uno de los villanos más clásicos de Spider-Man y tiene una relación muy íntima de amor y odio con el héroe. ");

        SpiderCosmico s2 = new SpiderCosmico(3, "Spider Cosmico", "Se convierte en lo que sea", "Marvel",
                "Conocido como Capitán Universo, Tiene la capacidad de verlo casi todo, capacidad de volar, telarañas tan fuertes como el adamtium, manipulación de la materia y explosiones de energía ");

        Runnable attak = new Runnable() {
            @Override
            public void run() {
                try {

                    s.fotografo(screen);
                    Thread.sleep(4000);

                    s.agiltrepar(screen);
                    Thread.sleep(5000);

                    s.t(screen);
                    Thread.sleep(2000);

                    //Venom


                    s1.CambiaForma(screen);
                    Thread.sleep(4000);
                    s1.Veloz(screen);
                    Thread.sleep(2000);


                    s1.Debilidad(screen);
                    Thread.sleep(3000);

                    // Cosmico

                    s2.FuerzaHumana(screen);
                    Thread.sleep(3000);
                    s2.ViajeHiperespacial(screen);
                    Thread.sleep(3000);

                    s2.Sanacion(screen);
                    Thread.sleep(3000);


                    s2.SentidoCosmico(screen);
                    Thread.sleep(3000);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread attackSp = new Thread(attak);
        attackSp.start();

            }};


