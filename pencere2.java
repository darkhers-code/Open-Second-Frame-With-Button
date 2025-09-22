import javax.swing.*;

public class pencere2 {
    public static void p2(){
        JFrame f;
        JButton b;

        f = new JFrame("Pəncərə 2");
        f.setBounds(700,100,300,180);
        f.setVisible(true);
        f.setLayout(null);

        b = new JButton("Pəncərə 1 aç");
        b.setBounds(80,50,120,25);

        b.addActionListener(e->{
            pencere1 p = new pencere1();
            p.p1();
        });

        f.add(b);
    }
    public static void main(String[] args){
        p2();
    }
}
