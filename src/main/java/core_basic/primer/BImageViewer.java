package core_basic.primer;

import javax.swing.*;
import java.awt.*;

public class BImageViewer
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            var frame = new ImageViewerFrame();
            frame.setTitle("ImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}


class ImageViewerFrame extends JFrame
{

    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;

    public ImageViewerFrame()
    {
        setSize(WIDTH, HEIGHT);

        // 创建一个标签对象，用于在图形用户界面中显示文本或图标
        var label = new JLabel("Default Lable");
        add(label);

        // add chooser
        var chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));

        // menubar
        var menubar = new JMenuBar();
        setJMenuBar(menubar);

        // file menu
        var fileMenu = new JMenu("File");
        menubar.add(fileMenu);

        // add Open Item
        var openItem = new JMenuItem("Open");
        fileMenu.add(openItem);
        openItem.addActionListener(event ->
        {
            // show file chooser
            int result = chooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                // set name
                String name = chooser.getSelectedFile().getName();
                label.setText(name);

                // set icon
                label.setIcon(new ImageIcon(chooser.getSelectedFile().getPath()));
            }
        });

        // add Exit Item
        var exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);
        exitItem.addActionListener(event -> System.exit(0));
    }

}
