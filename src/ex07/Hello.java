package ex07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Hello extends JFrame {
    public Hello() throws HeadlessException {
        JButton btn = new JButton();
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {   // 2번 클릭이면 더블클릭
                    JOptionPane.showMessageDialog(null, "더블클릭 했습니다!");
                }
            }
        });
    }
}
