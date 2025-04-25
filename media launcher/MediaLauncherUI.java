import javax.swing.; import java.awt.;

public class MediaLauncherUI extends JFrame {

public MediaLauncherUI() {
    setTitle("Media Launcher");
    setSize(900, 600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setUndecorated(true);

    // Main background panel
    JPanel background = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(new Color(10, 10, 10)); // deep dark background
            g.fillRect(0, 0, getWidth(), getHeight());
        }
    };
    background.setLayout(null);

    // Logo
    JLabel logo = new JLabel(new ImageIcon("logo.png"));
    logo.setBounds(375, 20, 150, 100);
    background.add(logo);

    // Version selector
    JComboBox<String> versionBox = new JComboBox<>(new String[]{"1.20.1", "1.19.4", "1.8.9"});
    versionBox.setBounds(50, 150, 200, 30);
    background.add(versionBox);

    // Cracked/Microsoft login
    JCheckBox crackedLogin = new JCheckBox("Cracked Login");
    crackedLogin.setBounds(50, 200, 150, 30);
    crackedLogin.setForeground(Color.WHITE);
    crackedLogin.setOpaque(false);
    background.add(crackedLogin);

    // Launch Button
    JButton launchButton = new JButton("Launch");
    launchButton.setBounds(375, 450, 150, 50);
    launchButton.setBackground(Color.DARK_GRAY);
    launchButton.setForeground(Color.WHITE);
    background.add(launchButton);

    // FPS Boost Toggle
    JCheckBox fpsBoost = new JCheckBox("Enable FPS Boost");
    fpsBoost.setBounds(650, 150, 200, 30);
    fpsBoost.setForeground(Color.WHITE);
    fpsBoost.setOpaque(false);
    background.add(fpsBoost);

    // Mod Manager Label
    JLabel modManager = new JLabel("Mod Manager");
    modManager.setBounds(650, 200, 200, 30);
    modManager.setForeground(Color.WHITE);
    background.add(modManager);

    // Progress Bar
    JProgressBar progressBar = new JProgressBar();
    progressBar.setBounds(250, 530, 400, 20);
    progressBar.setValue(0);
    background.add(progressBar);

    add(background);
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        MediaLauncherUI launcher = new MediaLauncherUI();
        launcher.setVisible(true);
    });
}

}