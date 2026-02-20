/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import javax.swing.*;
import java.awt.*;
import java.util.Vector;
import model.FileHandler;
import java.util.Arrays;
            
/**
 *
 * @author SunnyEljohn
 */
public class EmployeeDashboard extends JFrame {
    
    public EmployeeDashboard(String employeeId) {
        System.out.println("Opening Dashboard for ID: " + employeeId); // Debug line
       
        setTitle("MotorPH Employee Portal - " + employeeId);
        setSize(1100, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 1. Fetch data for this specific person
        FileHandler fileHandler = new FileHandler();
        fileHandler.readEmployeeFile();
        String[] dataArray = fileHandler.getEmployeeById(employeeId);

        if (dataArray == null) {
             
            // Configuring Vector 
            Vector<Object> employeeVector = new Vector<>(Arrays.asList(dataArray));
            
            // Pass to Panel
            ViewEmployeePanel detailPanel = new ViewEmployeePanel(employeeVector);
            
            // add UI
            add(detailPanel, BorderLayout.CENTER);
        }

        // 2. Setup the UI
        setLayout(new BorderLayout());
        
        // Header
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(new Color(50, 50, 50));
        header.setPreferredSize(new Dimension(1100, 50));
        
        JLabel welcomeLabel = new JLabel("  Welcome, " + dataArray[2] + " " + dataArray[1]); // First + Last Name
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        
        JButton logoutBtn = new JButton("Logout");
        logoutBtn.addActionListener(e -> {
            new LoginPanel().setVisible(true);
            dispose();
        });

        header.add(welcomeLabel, BorderLayout.WEST);
        header.add(logoutBtn, BorderLayout.EAST);
        add(header, BorderLayout.NORTH);

        // 3. Add the Employee Details Panel
        Vector<Object> employeeVector = new Vector<>(Arrays.asList(dataArray));
        ViewEmployeePanel detailPanel = new ViewEmployeePanel(employeeVector);
        
        // IMPORTANT: If you changed ViewEmployeePanel to a JPanel, add it directly.
        // If it is still a JFrame, we need to get its content.
        add(detailPanel, BorderLayout.CENTER); // Add the panel directly

        // 4. FINALLY, make it visible
        setVisible(true); 
        System.out.println("Dashboard is now visible."); // Debug line
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        