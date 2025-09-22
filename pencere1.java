import javax.swing.*;
public class pencere1 {
    public static void p1(){
        JFrame f;
        JButton b;

        f = new JFrame("Pəncərə 1");
        f.setBounds(600,100,300,180);
        f.setVisible(true);
        f.setLayout(null);

        b = new JButton("Pəncərə 2 aç");
        b.setBounds(80,50,120,25);

        b.addActionListener(e->{
            pencere2 p = new pencere2();
            p.p2();
        });

        f.add(b);
    }
    public static void main(String[] args){
        p1();
    }
}
