package com.LennyPackage;

import javax.security.auth.Subject;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

class Struktur {

    JFrame frameMain = new JFrame();

    JButton Dk =        new JButton("Dk");
    JButton Ethik =     new JButton("Ethik");
    JButton Sk =        new JButton("Sk");
    JButton Wil =       new JButton("Wil");
    JButton Wpf =       new JButton("Wpf");
    JButton Lf9 =       new JButton("Lf9");
    JButton Lf8 =       new JButton("Lf8");
    JButton Lf7 =        new JButton("Lf7");
    JButton Lf6 =        new JButton("Lf6");
    JButton startseite = new JButton();
    JButton schliessen = new JButton();

    String txtDk    = "Deutsch Kommunikation - Frau Allstädt";
    String txtEhtik = "Ethik - Frau Allstädt";
    String txtSk    = "Sozialkunde - Herr Roth";
    String txtWil   = "Wirtschaftslehre - Herr Hoyme";
    String txtWpf   = "WPF (Englisch) - Herr Hyome, Frau Devis";
    String txtLf9   = "LF9 - Herr Braun, Neunemann, Schluckebier";
    String txtLf8   = "LF8 - Frau Rammelt";
    String txtLf7   = "LF7 - Herr Haake, Schluckebier";
    String txtLf6   = "LF6 - Frau Weber, Herr Roth";

    File fileDk     = new File("C:\\Users\\l.bergner.WSA\\Documents\\Schule\\Dk- Al");
    File fileEhtik  = new File("C:\\Users\\l.bergner.WSA\\Documents\\Schule\\Ehtik - Al");
    File fileSk     = new File("C:\\Users\\l.bergner.WSA\\Documents\\Schule\\Sk - Rh");
    File fileWil    = new File("C:\\Users\\l.bergner.WSA\\Documents\\Schule\\Wil - Hy");
    File fileWpf    = new File("C:\\Users\\l.bergner.WSA\\Documents\\Schule\\Wpf - Dy, Hy");
    File fileLf9    = new File("C:\\Users\\l.bergner.WSA\\Documents\\Schule\\Lf9 - Br, Na, Sb");
    File fileLf8    = new File("C:\\Users\\l.bergner.WSA\\Documents\\Schule\\LF8 - Ra");
    File fileLf7    = new File("C:\\Users\\l.bergner.WSA\\Documents\\Schule\\LF7 - Ha, Sb");
    File fileLf6    = new File("C:\\Users\\l.bergner.WSA\\Documents\\Schule\\LF6 - ZR-We, Rh");

    URI urlDk         = new URI("https://schulcloud-thueringen.de/rooms/63602ae16dec41001d8c2bb6");
    URI urlEhtik      = new URI("https://schulcloud-thueringen.de/rooms/64ff898e3b0191001d25676a");
    URI urlSk         = new URI("https://schulcloud-thueringen.de/rooms/63454186968693001f1fd56b");
    URI urlWil        = new URI("https://schulcloud-thueringen.de/rooms/63b5735a68e8e2c7d7e22fa9");
    URI urlWpf        = new URI("https://schulcloud-thueringen.de/rooms/63b57092ff44b11455732454");
    URI urlLf9        = new URI("https://schulcloud-thueringen.de/rooms/64f62d38f3666a001d5ae483");
    URI urlLf8        = new URI("https://schulcloud-thueringen.de/rooms/64f75dbe212642001d09926a");
    URI urlLf7        = new URI("https://schulcloud-thueringen.de/rooms/64f6cb283c3678001d0045ef");
    URI urlLf6        = new URI("https://schulcloud-thueringen.de/rooms/64f49a5ec2fed6001d4a5169");
    URI urlStartseite = new URI("https://schulcloud-thueringen.de/rooms-list");

    ActionListener listener;
    ActionListener listenerStartseite;

    String hexColor1 = "#5c86b6";
    String hexColor2 = "#2a5a86";
    String hexOrange = "#F08000";

    Desktop desktop = Desktop.getDesktop();

    SubjectData subjectDataDk         = new SubjectData(urlDk     , fileDk     , txtDk);
    SubjectData subjectDataEhtik      = new SubjectData(urlEhtik  , fileEhtik  , txtEhtik);
    SubjectData subjectDataSk         = new SubjectData(urlSk     , fileSk     , txtSk);
    SubjectData subjectDataWil        = new SubjectData(urlWil    , fileWil    , txtWil);
    SubjectData subjectDataWpf        = new SubjectData(urlWpf    , fileWpf    , txtWpf);
    SubjectData subjectDataLf9        = new SubjectData(urlLf9    , fileLf9    , txtLf9);
    SubjectData subjectDataLf8        = new SubjectData(urlLf8    , fileLf8    , txtLf8);
    SubjectData subjectDataLf7        = new SubjectData(urlLf7    , fileLf7    , txtLf7);
    SubjectData subjectDataLf6        = new SubjectData(urlLf6    , fileLf6    , txtLf6);

    Struktur() throws URISyntaxException {
    }

    public void changeToErweiterung(SubjectData subjectData) {
        listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameMain.hide();
                Erweiterung(subjectData);
            }
        };
    }

//    private static class RoundedBorder implements Border {
//
//        private int radius;
//
//        RoundedBorder(int radius) {
//            this.radius = radius;
//        }
//
//        public Insets getBorderInsets(Component c) {
//            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
//        }
//
//        public boolean isBorderOpaque() {
//            return true;
//        }
//
//        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
//            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
//        }
//    }

    private static Icon createExplorerIcon2(String filePath) {
        try {
            Image image = new ImageIcon(filePath).getImage();
            Image scaledImage = image.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
            return new ImageIcon(scaledImage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Icon createExplorerIcon4(String filePath) {
        try {
            Image image = new ImageIcon(filePath).getImage();
            Image scaledImage = image.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
            return new ImageIcon(scaledImage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Icon createExplorerIcon5(String filePath) {
        try {
            Image image = new ImageIcon(filePath).getImage();
            Image scaledImage = image.getScaledInstance(125, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(scaledImage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void initialisierung() {

        frameMain.setBounds(500,500,480,405);
        frameMain.setLayout(null);
        frameMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameMain.setUndecorated(true);

        Color color1 = Color.decode(hexColor1);
        Color color2 = Color.decode(hexColor2);
        Color orange = Color.decode(hexOrange);

        frameMain.getContentPane().setBackground(Color.WHITE);

        Dk.setBounds(15,15,215,50);
        Dk.setBackground(Color.WHITE);
        Dk.setBorder(BorderFactory.createLineBorder(color2, 3));
        Dk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                Dk.setBackground(color1);
                Dk.setBorder(BorderFactory.createLineBorder(orange,3));
            }
            public void mouseExited (java.awt.event.MouseEvent evt) {
                Dk.setBackground(UIManager.getColor(Dk.getBackground()));
                Dk.setBorder(BorderFactory.createLineBorder(color2, 3));
            }
        });
        changeToErweiterung(subjectDataDk);
        Dk.addActionListener(listener);

        Ethik.setBounds(245,15,215,50);
        Ethik.setBackground(Color.WHITE);
        Ethik.setBorder(BorderFactory.createLineBorder(color1, 3));
        Ethik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                Ethik.setBackground(color2);
                Ethik.setBorder(BorderFactory.createLineBorder(orange,3));
            }
            public void mouseExited (java.awt.event.MouseEvent evt) {
                Ethik.setBackground(UIManager.getColor(Ethik.getBackground()));
                Ethik.setBorder(BorderFactory.createLineBorder(color1, 3));
            }
        });
        changeToErweiterung(subjectDataEhtik);
        Ethik.addActionListener(listener);

        Sk.setBounds(15,80,215,50);
        Sk.setBackground(Color.WHITE);
        Sk.setBorder(BorderFactory.createLineBorder(color2, 3));
        Sk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                Sk.setBackground(color1);
                Sk.setBorder(BorderFactory.createLineBorder(orange,3));
            }
            public void mouseExited (java.awt.event.MouseEvent evt) {
                Sk.setBackground(UIManager.getColor(Sk.getBackground()));
                Sk.setBorder(BorderFactory.createLineBorder(color2, 3));
            }
        });
        changeToErweiterung(subjectDataSk);
        Sk.addActionListener(listener);

        Wil.setBounds(245,80,215,50);
        Wil.setBackground(Color.WHITE);
        Wil.setBorder(BorderFactory.createLineBorder(color1, 3));
        Wil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                Wil.setBackground(color2);
                Wil.setBorder(BorderFactory.createLineBorder(orange,3));
            }
            public void mouseExited (java.awt.event.MouseEvent evt) {
                Wil.setBackground(UIManager.getColor(Wil.getBackground()));
                Wil.setBorder(BorderFactory.createLineBorder(color1, 3));
            }
        });
        changeToErweiterung(subjectDataWil);
        Wil.addActionListener(listener);

        Wpf.setBounds(15,145,215,50);
        Wpf.setBackground(Color.WHITE);
        Wpf.setBorder(BorderFactory.createLineBorder(color2, 3));
        Wpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                Wpf.setBackground(color1);
                Wpf.setBorder(BorderFactory.createLineBorder(orange,3));
            }
            public void mouseExited (java.awt.event.MouseEvent evt) {
                Wpf.setBackground(UIManager.getColor(Wpf.getBackground()));
                Wpf.setBorder(BorderFactory.createLineBorder(color2, 3));
            }
        });
        changeToErweiterung(subjectDataWpf);
        Wpf.addActionListener(listener);

        Lf9.setBounds(245,145,215,50);
        Lf9.setBackground(Color.WHITE);
        Lf9.setBorder(BorderFactory.createLineBorder(color1, 3));
        Lf9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                Lf9.setBackground(color2);
                Lf9.setBorder(BorderFactory.createLineBorder(orange,3));
            }
            public void mouseExited (java.awt.event.MouseEvent evt) {
                Lf9.setBackground(UIManager.getColor(Lf9.getBackground()));
                Lf9.setBorder(BorderFactory.createLineBorder(color1, 3));
            }
        });
        changeToErweiterung(subjectDataLf9);
        Lf9.addActionListener(listener);

        Lf8.setBounds(15,210,215,50);
        Lf8.setBackground(Color.WHITE);
        Lf8.setBorder(BorderFactory.createLineBorder(color2, 3));
        Lf8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                Lf8.setBackground(color1);
                Lf8.setBorder(BorderFactory.createLineBorder(orange,3));
            }
            public void mouseExited (java.awt.event.MouseEvent evt) {
                Lf8.setBackground(UIManager.getColor(Lf8.getBackground()));
                Lf8.setBorder(BorderFactory.createLineBorder(color2, 3));
            }
        });
        changeToErweiterung(subjectDataLf8);
        Lf8.addActionListener(listener);

        Lf7.setBounds(245,210,215,50);
        Lf7.setBackground(Color.WHITE);
        Lf7.setBorder(BorderFactory.createLineBorder(color1, 3));
        Lf7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                Lf7.setBackground(color2);
                Lf7.setBorder(BorderFactory.createLineBorder(orange,3));
            }
            public void mouseExited (java.awt.event.MouseEvent evt) {
                Lf7.setBackground(UIManager.getColor(Lf7.getBackground()));
                Lf7.setBorder(BorderFactory.createLineBorder(color1, 3));
            }
        });
        changeToErweiterung(subjectDataLf7);
        Lf7.addActionListener(listener);

        Lf6.setBounds(15,275,215,50);
        Lf6.setBackground(Color.WHITE);
        Lf6.setBorder(BorderFactory.createLineBorder(color2, 3));
        Lf6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                Lf6.setBackground(color1);
                Lf6.setBorder(BorderFactory.createLineBorder(orange,3));
            }
            public void mouseExited (java.awt.event.MouseEvent evt) {
                Lf6.setBackground(UIManager.getColor(Lf6.getBackground()));
                Lf6.setBorder(BorderFactory.createLineBorder(color2, 3));
            }
        });
        changeToErweiterung(subjectDataLf6);
        Lf6.addActionListener(listener);


        startseite.setBounds(245,275,215,50);
        startseite.setBackground(Color.WHITE);
        startseite.setText("Startseite");
        startseite.setBorder(BorderFactory.createLineBorder(color1, 3));
        startseite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                startseite.setText("");
                startseite.setBorder(BorderFactory.createLineBorder(orange, 3));
                Icon iconStartseite = createExplorerIcon4("C:\\Users\\l.bergner.WSA\\Pictures\\java programm allgemein\\schulcloud-app\\startseite.png");
                startseite.setIcon(iconStartseite);
                frameMain.getContentPane().add(startseite);
            }
            public void mouseExited (java.awt.event.MouseEvent evt) {
                startseite.setText("Startseite");
                startseite.setBorder(BorderFactory.createLineBorder(color1, 3));
                startseite.setIcon(null);
                startseite.setBackground(UIManager.getColor(startseite.getBackground()));
            }
        });
        listenerStartseite = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    desktop.browse(urlStartseite);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        };
        startseite.addActionListener(listenerStartseite);

        schliessen.setBounds(15,340,445,50);
        schliessen.setBackground(Color.WHITE);
        schliessen.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        schliessen.setRolloverEnabled(true);
        Icon schliessenIcon = createExplorerIcon4("C:\\Users\\l.bergner.WSA\\Pictures\\java programm allgemein\\schulcloud-app\\zu-schwarz-weiß.png");
        schliessen.setIcon(schliessenIcon);
        frameMain.getContentPane().add(schliessen);
        schliessen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                schliessen.setBorder(BorderFactory.createLineBorder(Color.red, 3));
                schliessen.setBackground(Color.WHITE);
                Icon officeIcon = createExplorerIcon4("C:\\Users\\l.bergner.WSA\\Pictures\\java programm allgemein\\schulcloud-app\\zu-rot.png");
                schliessen.setIcon(officeIcon);
                frameMain.getContentPane().add(schliessen);
            }
            public void mouseExited (java.awt.event.MouseEvent evt) {
                schliessen.setBackground(UIManager.getColor(schliessen.getBackground()));
                schliessen.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
                Icon icon = createExplorerIcon4("C:\\Users\\l.bergner.WSA\\Pictures\\java programm allgemein\\schulcloud-app\\zu-schwarz-weiß.png");
                schliessen.setIcon(icon);
                frameMain.getContentPane().add(schliessen);
            }
        });
        schliessen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameMain.dispose();
                System.exit(0);
            }
        });

        frameMain.add(Dk);
        frameMain.add(Ethik);
        frameMain.add(Sk);
        frameMain.add(Wil);
        frameMain.add(Wpf);
        frameMain.add(Lf9);
        frameMain.add(Lf8);
        frameMain.add(Lf7);
        frameMain.add(Lf6);
        frameMain.add(startseite);
        frameMain.add(schliessen);
        frameMain.setVisible(true);
    }

    public void Fwame () {
        frameMain.setVisible(true);

    }

        public void Erweiterung (SubjectData subjectData) {

        JFrame frame = new JFrame();

        frame.setBounds(500,500,345,180);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setUndecorated(true);

        Color color1 = Color.decode(hexColor1);
        Color color2 = Color.decode(hexColor2);
        Color orange = Color.decode(hexOrange);

        frame.getContentPane().setBackground(Color.WHITE);

        JLabel labelDK = new JLabel();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                labelDK.setText(String.valueOf(subjectData.getStringName()));
            }
        });
        labelDK.setBounds(50,1,300,50);
        labelDK.setForeground(Color.BLACK);

        JButton scBtn = new JButton();
        scBtn.setBounds(15,45,145,50);
        scBtn.setBackground(Color.WHITE);
        scBtn.setText("Schulcloud");
        scBtn.setBorder(BorderFactory.createLineBorder(color2, 3));
            scBtn.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(MouseEvent evt) {
                    scBtn.setText("");
                    scBtn.setBorder(BorderFactory.createLineBorder(orange,3));
                    Icon iconCloud = createExplorerIcon5("C:\\Users\\l.bergner.WSA\\Pictures\\java programm allgemein\\schulcloud-app\\cloud.png");
                    scBtn.setIcon(iconCloud);
                    frame.getContentPane().add(scBtn);
                }
                public void mouseExited (java.awt.event.MouseEvent evt) {
                    scBtn.setText("Schulcloud");
                    scBtn.setIcon(null);
                    scBtn.setBorder(BorderFactory.createLineBorder(color2, 3));
                    scBtn.setBackground(UIManager.getColor(scBtn.getBackground()));
                }
            });
        scBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    desktop.browse(subjectData.getUrlString());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton odBtn = new JButton("Ordner");
        odBtn.setBounds(175,45,145,50);
        odBtn.setBackground(Color.WHITE);
        odBtn.setBorder(BorderFactory.createLineBorder(color1, 3));
            odBtn.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(MouseEvent evt) {
                    odBtn.setText("");
                    odBtn.setBorder(BorderFactory.createLineBorder(orange,3));
                    Icon iconCloud = createExplorerIcon4("C:\\Users\\l.bergner.WSA\\Pictures\\java programm allgemein\\schulcloud-app\\ordner.png");
                    odBtn.setIcon(iconCloud);
                    frame.getContentPane().add(odBtn);
                }
                public void mouseExited (java.awt.event.MouseEvent evt) {
                    odBtn.setText("Ordner");
                    odBtn.setIcon(null);
                    odBtn.setBorder(BorderFactory.createLineBorder(color1, 3));
                    odBtn.setBackground(UIManager.getColor(odBtn.getBackground()));
                }
            });

        JButton schliessen = new JButton();
            schliessen.setBounds(175,105,145,50);
            schliessen.setBackground(Color.WHITE);
            schliessen.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            Icon icon = createExplorerIcon4("C:\\Users\\l.bergner.WSA\\Pictures\\java programm allgemein\\schulcloud-app\\zu-schwarz-weiß.png");
            schliessen.setIcon(icon);
            frame.getContentPane().add(schliessen);
            schliessen.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(MouseEvent evt) {
                    schliessen.setBorder(BorderFactory.createLineBorder(Color.red, 3));
                    schliessen.setBackground(Color.WHITE);
                    Icon officeIcon = createExplorerIcon4("C:\\Users\\l.bergner.WSA\\Pictures\\java programm allgemein\\schulcloud-app\\zu-rot.png");
                    schliessen.setIcon(officeIcon);
                    frame.getContentPane().add(schliessen);
                }
                public void mouseExited (java.awt.event.MouseEvent evt) {
                    schliessen.setBackground(UIManager.getColor(schliessen.getBackground()));
                    schliessen.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
                    Icon icon = createExplorerIcon4("C:\\Users\\l.bergner.WSA\\Pictures\\java programm allgemein\\schulcloud-app\\zu-schwarz-weiß.png");
                    schliessen.setIcon(icon);
                    frame.getContentPane().add(schliessen);
                }
            });
            schliessen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        JButton zurück =     new JButton();
        zurück.setBounds(15,105,145,50);
        zurück.setBackground(Color.WHITE);
        zurück.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            zurück.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered (MouseEvent evt) {
                    zurück.setBackground(Color.BLACK);
                    Icon zurückIcon = createExplorerIcon4("C:\\Users\\l.bergner.WSA\\Pictures\\java programm allgemein\\schulcloud-app\\9004860_arrow_direction_left_back_icon.png");
                    zurück.setIcon(zurückIcon);
                    frame.getContentPane().add(zurück);
                }
                public void mouseExited (java.awt.event.MouseEvent evt) {
                    zurück.setBackground(Color.WHITE);
                    Icon zurückIcon = createExplorerIcon2("C:\\Users\\l.bergner.WSA\\Pictures\\java programm allgemein\\schulcloud-app\\8111421_leftarrowcurved_curve_back_previous_arrow_icon.png");
                    zurück.setIcon(zurückIcon);
                    frame.getContentPane().add(zurück);
                }
            });
            Icon zurückIcon = createExplorerIcon2("C:\\Users\\l.bergner.WSA\\Pictures\\java programm allgemein\\schulcloud-app\\8111421_leftarrowcurved_curve_back_previous_arrow_icon.png");
            zurück.setIcon(zurückIcon);
            frame.getContentPane().add(zurück);
        listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fwame();  //  ES Funktion
                frame.hide(); //aktuelles Frame geschlossen
                zurück.removeActionListener(listener);
            }
        };
        zurück.addActionListener(listener);

        frame.add(labelDK);
        frame.add(schliessen);
        frame.add(zurück);
        frame.add(scBtn);
        frame.add(odBtn);
        frame.setVisible(true);
    }
}

public class Main {

    public static void main(String[] args) throws URISyntaxException {

        SwingUtilities.invokeLater(() -> {
            Struktur s = null;
            try {
                s = new Struktur();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
            s.initialisierung();
            s.Fwame();
        });
    }
}
