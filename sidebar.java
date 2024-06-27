import javax.swing.*;
import java.awt.*;

public class sidebar {
    public static void main(String[] args) {
        JFrame frame = new JFrame("table mahasiswa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        

        JPanel mainPanel = new JPanel(new BorderLayout());
        
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setPreferredSize(new Dimension(200, frame.getHeight()));
        sidebar.setBackground(Color.LIGHT_GRAY);
        
        sidebar.add(new JLabel("Mahasiswa"));
        
        mainPanel.add(sidebar, BorderLayout.WEST);
        
        JPanel contentPanel = new JPanel(new BorderLayout());
        
        
        String[] columnNames = {"No", "Nama", "NIM", "Program Studi"};
        Object[][] data = {
            {1, "maulana yusuf", "22051131", "sistem informasi"},
            {2, "saep", "7776662", "Sistem Informasi"}
            
        };
        
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        contentPanel.add(scrollPane, BorderLayout.CENTER);
        
        mainPanel.add(contentPanel, BorderLayout.CENTER);
        
        frame.add(mainPanel);
        
        frame.setVisible(true);
    }
}
