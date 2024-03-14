import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    //making labels
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButon = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID: ");
    JLabel userPasswordLabel = new JLabel("password: ");
    JLabel messageLabel = new JLabel();

    HashMap<String, String> logininfo = new HashMap<String, String>();
    LoginPage(HashMap<String, String> loginOriginal){

        logininfo = loginOriginal;

        userIDLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);
        messageLabel.setBounds(125,250,250,35);;
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        userIDField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);


        resetButon.setBounds(225,200,100,25);
        resetButon.addActionListener(this);
        resetButon.setFocusable(false);

        frame.add(messageLabel);
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButon);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==resetButon){
            userIDField.setText("");
            userPasswordField.setText("");
        }

        if(e.getSource() == loginButton){
            String userID = userIDField.getText();
            String pswd = String.valueOf(userPasswordField.getPassword());
            if(logininfo.containsKey(userID)){
                if(logininfo.get(userID).equals(pswd)){

                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login Successful");
                    frame.dispose();
                    WelcomePage wPage = new WelcomePage();
                }
                else{
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Wrong Password");
                }
            }else{
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Username not found");
            }
        }
    }
}
