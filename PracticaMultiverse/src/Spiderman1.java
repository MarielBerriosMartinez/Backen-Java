public class Spiderman1 extends SpiderMan implements SpiderCallback{

    public Spiderman1(int id, String nombre, String poder, String UniveroOrigen, String descripcion) {
        super(id, nombre, poder, UniveroOrigen, descripcion);
    }

    @Override
    public void fotografo(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Serif",20, Colors.blue);
        s.showImage("Fotografo.gif");
        s.setBounds(200,100,1100,900);

    }


    @Override
    public void agiltrepar(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Serif",20, Colors.blue);
        s.showImage("t.gif");
        s.setBounds(200,100,1500,1200);
    }


    @Override
    public void t(Screen s) {

         s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",20, Colors.blue);
        s.showImage("trepar.gif");
        s.setBounds(200,100,1100,900);

    }
}
