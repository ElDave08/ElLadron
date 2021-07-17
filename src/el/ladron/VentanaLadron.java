
package el.ladron;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class VentanaLadron extends JFrame{
    private JPanel panel;
    private JLabel titulo;
    private JLabel etiqueta;
    private JLabel et2;
    private JRadioButton arriba;
    private JRadioButton abajo;
    private JRadioButton izquierda;
    private JRadioButton derecha;
    private JRadioButton quieto;
    private JButton aceptar1;
    private JButton aceptar2;
    private JTextField casillas;
    
    public VentanaLadron(){
        setTitle("Inicio");
        setSize(500,500);
        setResizable(false);
        setLocationRelativeTo(null);
        llenar();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void llenar(){
        panel = new JPanel();
        this.getContentPane().add(panel); // Agregamos el panel a la ventana
        panel.setLayout(null);
        
    }
    
   
}
