import javax.swing.*;
import java.awt.*;

public class ViewWindow extends JFrame {

    public ViewWindow () {
        setTitle("Farm Manager");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Añadimos titulo
        JLabel title = new JLabel("FARM MANAGER");
        title.setBounds(600,25,600,60);
        title.setForeground(Color.white);
        title.setFont(new Font("Verdana", Font.BOLD, 36));
        add(title);

        // Añadimos botón de start
        JButton jb = new JButton("Start");
        jb.setBounds(750, 850, 95, 30);
        jb.setFont(new Font("Calibri", Font.BOLD, 24));
        add(jb);

        // Añadimos todos los paneles a nuestro frame;
        add(setChickenPanel());
        add(setCowPanel());
        add(setFarmerPanel());

        // Añadimos fondo
        JImagePanel j = new JImagePanel("images/background.jpeg");
        j.getPreferredSize();
        add(j);

    }

    // Creamos nuestro panel de gallinas
    private JPanel setChickenPanel () {
        JPanel chickenPanel = new JPanel();
        chickenPanel.setBounds(200, 175, 450, 275);
        chickenPanel.add(new JLabel("Number of chickens"));
        chickenPanel.add(setChickenImage());
        return chickenPanel;
    }

    // Creamos nuestro panel de vacas
    private JPanel setCowPanel () {
        JPanel cowPanel = new JPanel();
        cowPanel.setBounds(200, 525, 450, 275);
        cowPanel.add(new JLabel("Number of cows"));
        cowPanel.add(setCowImage());
        return cowPanel;
    }

    // Creamos nuestro panel de granjero
   private JPanel setFarmerPanel () {
       JPanel farmerPanel = new JPanel();
       farmerPanel.setBounds(1000, 200, 300, 600);
       farmerPanel.add(new JLabel("Farmer period"));
       setFarmerImage();
       farmerPanel.add(setFarmerImage());
       return farmerPanel;
    }

    private JLabel setChickenImage () {
        ImageIcon chickenImage = new ImageIcon("images/chicken.png");
        chickenImage.getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT);
        JLabel chickenImageLabel = new JLabel(chickenImage);

        //chickenImageLabel.setSize(10, 10);
        //chickenImageLabel.setBounds(200, 150, 100, 100);
        return chickenImageLabel;
    }

    private JLabel setCowImage() {
        ImageIcon cowImage = new ImageIcon("images/cow.png");
        JLabel cowImageLabel = new JLabel(cowImage);

        cowImageLabel.setSize(100, 100);
        cowImageLabel.setBounds(200, 400, 200, 200);
        return cowImageLabel;
    }

    private JLabel setFarmerImage() {
        ImageIcon farmerImage = new ImageIcon("images/farmer.png");
        JLabel farmerImageLabel = new JLabel(farmerImage);

        farmerImageLabel.setSize(100, 100);
        farmerImageLabel.setBounds(200, 400, 200, 200);
        return farmerImageLabel;
    }

}
