package login;

import com.formdev.flatlaf.intellijthemes.FlatGradiantoDeepOceanIJTheme;

public class acceso_login {

    public static void main(String[] args) {
        try {
            FlatGradiantoDeepOceanIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

}
