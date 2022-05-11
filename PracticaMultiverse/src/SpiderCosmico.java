public class SpiderCosmico extends SpiderMan implements CosmimoCallBack{
    public SpiderCosmico(int id, String nombre, String poder, String UniveroOrigen, String descripcion) {
        super(id, nombre, poder, UniveroOrigen, descripcion);
    }

    @Override
    public void FuerzaHumana(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Serif",20, Colors.blue);
        s.showImage("SentidoCosmico.gif");
        s.setBounds(200,100,1100,900);


    }

    @Override
    public void ViajeHiperespacial(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Serif",20, Colors.blue);
        s.showImage("ViajeHiperespacial.gif");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void Sanacion(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Serif",20, Colors.blue);
        s.showImage("Sanacion.gif");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void SentidoCosmico(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Serif",20, Colors.blue);
        s.showImage("Cosmico.gif");
        s.setBounds(200,100,1100,900);

    }
}
