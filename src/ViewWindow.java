import javafx.scene.shape.Box;

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
        chickenPanel.setLayout(new BoxLayout(chickenPanel, BoxLayout.Y_AXIS));

        JLabel text = new JLabel("Number of chickens");
        text.setAlignmentX(Component.CENTER_ALIGNMENT);

        String[] data = {"4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"};
        JComboBox<String> jcb = new JComboBox<>(data);
        jcb.setSize(150, 20);
        //jcb.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel auxiliar = new JPanel();
        auxiliar.add(jcb);
        chickenPanel.add(setChickenImage());
        chickenPanel.add(text);
        chickenPanel.add(auxiliar);

        return chickenPanel;
    }

    // Creamos nuestro panel de vacas
    private JPanel setCowPanel () {
        JPanel cowPanel = new JPanel();
        cowPanel.setBounds(200, 525, 450, 275);
        cowPanel.setLayout(new BoxLayout(cowPanel, BoxLayout.Y_AXIS));

        JLabel text = new JLabel("Number of cows");
        text.setAlignmentX(Component.CENTER_ALIGNMENT);

        String[] data = {"5", "6", "7", "8", "9", "10"};
        JComboBox<String> jcb = new JComboBox<>(data);
        jcb.setSize(150, 20);

        JPanel auxiliar = new JPanel();
        auxiliar.add(jcb);
        cowPanel.add(setCowImage());
        cowPanel.add(text);
        cowPanel.add(auxiliar);

        return cowPanel;
    }

    // Creamos nuestro panel de granjero
   private JPanel setFarmerPanel () {
       JPanel farmerPanel = new JPanel();
       farmerPanel.setBounds(1000, 200, 300, 600);
       farmerPanel.setLayout(new BoxLayout(farmerPanel, BoxLayout.Y_AXIS));

       JLabel period = new JLabel("Farmer period");
       period.setAlignmentX(Component.CENTER_ALIGNMENT);
       JLabel collectable = new JLabel("Eggs collectable / round");
       collectable.setAlignmentX(Component.CENTER_ALIGNMENT);

       String[] dataCollectable = {"3", "4", "5", "6", "7", "8"};
       JComboBox<String> jcb = new JComboBox<>(dataCollectable);
       jcb.setSize(150, 20);

       JRadioButton jrb1 = new JRadioButton("5");
       JRadioButton jrb2 = new JRadioButton("10");
       JRadioButton jrb3 = new JRadioButton("15");
       jrb2.setSelected(true);
       ButtonGroup group = new ButtonGroup();
       group.add(jrb1); group.add(jrb2); group.add(jrb3);

       JPanel auxiliar = new JPanel();
       auxiliar.add(jrb1); auxiliar.add(jrb2); auxiliar.add(jrb3);
       JPanel auxiliar2 = new JPanel();
       auxiliar2.add(jcb);

       farmerPanel.add(setFarmerImage());
       farmerPanel.add(period);
       farmerPanel.add(auxiliar);
       farmerPanel.add(collectable);
       farmerPanel.add(auxiliar2);

       return farmerPanel;
    }

    private JLabel setChickenImage () {
        ImageIcon chickenImage = new ImageIcon("images/chicken.png");
        Image image = chickenImage.getImage();
        image = image.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        chickenImage = new ImageIcon(image);
        JLabel chickenImageLabel = new JLabel(chickenImage);

        chickenImageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        return chickenImageLabel;
    }

    private JLabel setCowImage() {
        ImageIcon cowImage = new ImageIcon("images/cow.png");
        Image image = cowImage.getImage();
        image = image.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        cowImage = new ImageIcon(image);
        JLabel cowImageLabel = new JLabel(cowImage);

        cowImageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        return cowImageLabel;
    }

    private JLabel setFarmerImage() {
        ImageIcon farmerImage = new ImageIcon("images/farmer.png");
        Image image = farmerImage.getImage();
        image = image.getScaledInstance(150, 300, Image.SCALE_DEFAULT);
        farmerImage = new ImageIcon(image);
        JLabel farmerImageLabel = new JLabel(farmerImage);

        farmerImageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        return farmerImageLabel;
    }

}
