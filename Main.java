import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static int count = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setSize(250, 300);
        frame.setVisible(true);
        frame.setEnabled(true);
        JButton jb = new JButton("click");
        JPanel center = new JPanel();
        center.add(jb);
        frame.getContentPane().add(center, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jb.setText(Integer.toString(count));
                count++;
            }
        });
    }
}