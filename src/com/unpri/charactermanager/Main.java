package com.unpri.charactermanager;

import javax.swing.SwingUtilities;
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // 1. Inisialisasi Model & Tambahkan Minimal 5 Karakter
            CharacterManager manager = new CharacterManager();
            manager.addCharacter(new Character("Arjuna", CharacterType.WARRIOR, 5));
            manager.addCharacter(new Character("Merlin", CharacterType.MAGE, 3));
            manager.addCharacter(new Character("Athena", CharacterType.ARCHER, 4));
            manager.addCharacter(new Character("Valeera", CharacterType.ASSASSIN, 5));
            manager.addCharacter(new Character("Malganis", CharacterType.TANK, 7));

            // Uji coba penambahan/pengurangan data (bisa di-uncomment untuk tes statistik berubah)
            // manager.addCharacter(new Character("Illidan", CharacterType.ASSASSIN, 10)); 

            // 2. Inisialisasi View (MainWindow) dengan mengirimkan objek manager (Model)
            MainWindow window = new MainWindow(manager);
            
            // 3. Tampilkan Jendela
            window.setVisible(true);
        });
    }
}