public class SpidermanVenom extends SpiderMan implements VenomCallBack {
    public SpidermanVenom(int id, String nombre, String poder, String UniveroOrigen, String descripcion) {
        super(id, nombre, poder, UniveroOrigen, descripcion);
    }

    @Override
    public void CambiaForma(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Serif",20, Colors.blue);
        s.showImage("Venom.gif");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void Veloz(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Serif",20, Colors.blue);
        s.showImage("Vloz.gif");
        s.setBounds(200,100,1100,900);



    }
    @Override
    public void Debilidad(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Serif",20, Colors.blue);
        s.showImage("Ondas.gif");
        s.setBounds(200,100,1500,1200);



    }

}


