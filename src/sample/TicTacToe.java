package sample;
import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame {

    JPanel panelGame = new JPanel();

    XOButton buttons[] = new XOButton[9];

    public static void main(String[] args){
        new TicTacToe();

    }

    public TicTacToe(){
        super("TicTacToe");
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelGame.setLayout(new GridLayout(3,3));
        for (int i=0; i<9; i++){
            buttons[i] = new XOButton();
            buttons[i].setBackground(Color.WHITE);
            panelGame.add(buttons[i]);
        }
        add(panelGame);

        setVisible(true);
    }
}
