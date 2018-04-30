package sample;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XOButton extends JButton implements ActionListener{
    ImageIcon X,O;
    byte value = 0;
    /*  0 - nothing
        1 - X
        2 - O   */


    public XOButton(){
        X = new ImageIcon("C:/git/TTT_2/src/sample/X.png");
        O = new ImageIcon("C:/git/TTT_2/src/sample/O.png");
        this.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        value++;
        value%=3;
        switch(value){
            case 0:
                setIcon(null);
                break;
            case 1:
                setIcon(X);
                break;
            case 2:
                setIcon(O);
                break;

        }


    }

}
