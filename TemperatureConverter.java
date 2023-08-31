import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class TemperatureConverter
{
    // Declare the GUI Elements
    public static JFrame frmMain;
    public static JLabel lblCelsius;
    public static JTextField textCelsius;
    public static JLabel lblFahrenheit;
    public static JTextField textFahrenheit;
    public static JButton btnCalculateCtoF;
    public static JButton btnCalculateFtoC;

    public static void main(String[] args)
    {
        // Set up the frame
        frmMain = new JFrame("Temperature Converter");
        frmMain.setLayout(new FlowLayout());
        frmMain.setBounds(20,20,250,300);
        Font font=new Font("Arial", Font.BOLD,20);


        // Create GUI Elements
        lblCelsius = new JLabel("Celsius:");
        lblCelsius.setFont(font);
        textCelsius = new JTextField(10);
        textCelsius.setFont(font);
        textCelsius.setBackground(Color.DARK_GRAY);
        textCelsius.setForeground(Color.white);
        lblFahrenheit = new JLabel("Fahrenheit:");
        lblFahrenheit.setFont(font);
        textFahrenheit = new JTextField(10);
        textFahrenheit.setFont(font);
        textFahrenheit.setBackground(Color.DARK_GRAY);
        textFahrenheit.setForeground(Color.white);
        btnCalculateCtoF = new JButton("Convert C to F");
        btnCalculateCtoF.setBackground(Color.LIGHT_GRAY);

        // Add ActionListener
        btnCalculateCtoF.addActionListener
                (
                        new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                // Convert C to F
                                String cText = textCelsius.getText();
                                double c = Double.parseDouble(cText);
                                double f = (c * 9 / 5) + 32;
                                textFahrenheit.setText(String.valueOf(f));
                            }
                        }
               );

        btnCalculateFtoC = new JButton("Convert F to C");
        btnCalculateFtoC.setBackground(Color.LIGHT_GRAY);
        // Add ActionListener
        btnCalculateFtoC.addActionListener
                (
                        new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                // Convert F to C
                                String fText = textFahrenheit.getText();
                                double f = Double.parseDouble(fText);
                                double c = (f - 32) * 5 / 9;
                                textCelsius.setText(String.valueOf(c));
                            }
                        }
                );

        // Add the GUI Elements to the frame
        frmMain.add(lblCelsius);
        frmMain.add(textCelsius);
        frmMain.add(lblFahrenheit);
        frmMain.add(textFahrenheit);
        frmMain.add(btnCalculateCtoF);
        frmMain.add(btnCalculateFtoC);

        // Make the frame visible
        frmMain.setVisible(true);
    }
}