import Interface.UI;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UI ui = new UI();
                ui.frame.pack();
                ui.frame.setVisible(true);
            }
        });
    }
}
