/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.print.*;
import java.util.Vector;

/**
 *
 * @author SunnyEljohn
 */
public class PayslipFrame extends JFrame implements Printable {
    private JPanel printPanel;

    public PayslipFrame(Vector<Object> data) {
        setTitle("MotorPH Payslip - " + data.get(0));
        setSize(450, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // 1. The Container that will be printed
        printPanel = new JPanel();
        printPanel.setBackground(Color.WHITE);
        printPanel.setLayout(new BoxLayout(printPanel, BoxLayout.Y_AXIS));
        printPanel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));

        // 2. Add Content (Mapping to your CSV columns)
        addLabel("MOTORPH OFFICIAL PAYSLIP", new Font("Segoe UI", Font.BOLD, 18));
        printPanel.add(Box.createVerticalStrut(15));
        addLabel("Employee ID: " + data.get(0));
        addLabel("Name: " + data.get(2) + " " + data.get(1));
        printPanel.add(new JSeparator());
        printPanel.add(Box.createVerticalStrut(10));

        // Salary Info
        addLabel("Gross Salary: " + data.get(13));
        addLabel("Rice Subsidy: " + data.get(14));
        addLabel("Phone Allowance: " + data.get(15));
        printPanel.add(Box.createVerticalStrut(20));
        addLabel("NET PAY: [Calculated Value]", new Font("Segoe UI", Font.BOLD, 14));

        // 3. Print Button (Standard UI)
        JButton btn = new JButton("Print to PDF / Printer");
        btn.addActionListener(e -> startPrintJob());

        setLayout(new BorderLayout());
        add(new JScrollPane(printPanel), BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        setVisible(true);
    }

    private void addLabel(String text) { addLabel(text, new Font("Segoe UI", Font.PLAIN, 12)); }
    private void addLabel(String text, Font font) {
        JLabel l = new JLabel(text);
        l.setFont(font);
        l.setAlignmentX(Component.LEFT_ALIGNMENT);
        printPanel.add(l);
    }

    private void startPrintJob() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        if (job.printDialog()) {
            try { job.print(); } catch (PrinterException ex) { ex.printStackTrace(); }
        }
    }

    @Override
    public int print(Graphics g, PageFormat pf, int pi) {
        if (pi > 0) return NO_SUCH_PAGE;
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        printPanel.printAll(g);
        return PAGE_EXISTS;
    }
}