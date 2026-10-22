package com.unpri.charactermanager.view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;

/**
 * Jendela utama aplikasi Character Manager.
 * Menerapkan prinsip MVC: View hanya menampilkan data dari Model (CharacterManager).
 */
public class MainWindow extends JFrame {

    private JPanel mainPanel;
    private CharacterManager manager; // Menyimpan referensi Model

    public MainWindow(CharacterManager manager) {
        super("Character Manager - Sprint #3 (Mini-Challenge)"); // Judul title bar
        this.manager = manager; // Menerima Model

        initComponents();

        setSize(450, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Posisi jendela di tengah layar
    }

    private void initComponents() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // 1. Judul Halaman
        JLabel titleLabel = new JLabel("=== Daftar Karakter Game ===");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        // 2. Data Karakter Tampil Secara Dinamis
        ArrayList<Character> characterList = manager.getAllCharacters();
        if (characterList == null || characterList.isEmpty()) {
            JLabel emptyLabel = new JLabel("Belum ada data karakter.");
            emptyLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            mainPanel.add(emptyLabel);
        } else {
            for (Character c : characterList) {
                String info = "• " + c.getName() + " (" + c.getType() + ") - Lv. " + c.getLevel() + " (HP: " + c.getHitPoints() + ")";
                JLabel charLabel = new JLabel(info);
                charLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
                mainPanel.add(charLabel);
            }
        }

        mainPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        mainPanel.add(new JSeparator(JSeparator.HORIZONTAL));
        mainPanel.add(Box.createRigidArea(new Dimension(0, 15)));

        // 3. Mini-Challenge: Statistik Rata-rata Level (Mengambil langsung dari Model)
        double avgLevel = manager.getAverageLevel(); // Kalkulasi dilakukan di Model, View tinggal pakai!

        JLabel avgLabel = new JLabel("📊 Rata-rata Level Karakter: " + String.format("%.2f", avgLevel));
        avgLabel.setFont(new Font("Arial", Font.BOLD, 12));
        avgLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(avgLabel);

        // Bungkus dengan JScrollPane
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        add(scrollPane);
    }
}