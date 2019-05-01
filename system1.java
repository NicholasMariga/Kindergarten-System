/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class system1 {

    public static void main(String[] args) {

        splashScreen1 Splash = new splashScreen1();

        Splash.setVisible(true);

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(400);
                Splash.loadnu.setText(Integer.toString(i) + "%");
                Splash.loadba.setValue(i);
                if (i == 100) {
                    Splash.setVisible(false);
                    //close();
                    // new choose1().setVisible(true);
                    JOptionPane.showMessageDialog(null, "Make sure your Database is working to avoid dissapointments", "Database Alert", JOptionPane.ERROR_MESSAGE);
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new choose1().setVisible(true);

                        }
                    });
                }
            }
        } catch (Exception e) {

        }
    }
}
