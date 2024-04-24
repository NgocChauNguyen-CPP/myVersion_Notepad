//
//
//

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Notepad
{
    //INSTANCE VARIABLES
    private JFrame myFrame;
    
    //CONSTRUCTOR
    public Notepad()
    {
        //Create a new JFrame container.
        myFrame = new JFrame("Notepad");
        myFrame.setIconImage(new ImageIcon("Notepad.png").getImage());
        
        //Specify FlowLayout for the layout manager
        myFrame.setLayout(new FlowLayout());
        
        //Give the frame an initial size.
        myFrame.setSize(800,600);
        
        //Terminate the program when the user closes the application. 
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //MENU
        JMenuBar myMenuBar = new JMenuBar();
        //--------------------------------------
        JMenu myFileMenu = new JMenu("File");
        myFileMenu.setMnemonic('F');
        
        JMenuItem myNewOption = new JMenuItem("New", 'N');
        myNewOption.setAccelerator(KeyStroke.getKeyStroke('N', ActionEvent.CTRL_MASK));
        myFileMenu.add(myNewOption);
        
        JMenuItem myOpenOption = new JMenuItem("Open", 'O');
        myOpenOption.setAccelerator(KeyStroke.getKeyStroke('O', ActionEvent.CTRL_MASK));
        myFileMenu.add(myOpenOption);
        
        JMenuItem mySaveOption = new JMenuItem("Save", 'S');
        mySaveOption.setAccelerator(KeyStroke.getKeyStroke('S', ActionEvent.CTRL_MASK));
        myFileMenu.add(mySaveOption);
        
        JMenuItem mySaveAsOption = new JMenuItem("Save As");
        mySaveAsOption.setMnemonic('a'); //do I need this line?
        mySaveAsOption.setDisplayedMnemonicIndex(5);
        
        //need keystroke Ctrl+A
        myFileMenu.add(mySaveAsOption);
    
        //Add separator for File Menu
        myFileMenu.addSeparator();
        //------------------------------------
        JMenuItem mySetupOption = new JMenuItem("Page Setup...",'u');
        myFileMenu.add(mySetupOption);
        
        JMenuItem myPrintOption = new JMenuItem("Print...", 'P');
        myPrintOption.setAccelerator(KeyStroke.getKeyStroke('P', ActionEvent.CTRL_MASK));
        myFileMenu.add(myPrintOption);
        
        myMenuBar.add(myFileMenu);
        
        //Add separator 
        myFileMenu.addSeparator();
        
        JMenuItem myExitOption = new JMenuItem("Exit", 'E');
        myFileMenu.add(myExitOption);
        
        //-------------------------------------
        JMenu myEditMenu = new JMenu("Edit");
        myEditMenu.setMnemonic('E');
        
        myMenuBar.add(myEditMenu);
        
        //--------------------------------------
        JMenu myFormatMenu = new JMenu("Format");
        myFormatMenu.setMnemonic('o');
        myMenuBar.add(myFormatMenu);
        
        //-------------------------------------
        JMenu myViewMenu = new JMenu("View");
        myViewMenu.setMnemonic('V');
        
        myMenuBar.add(myViewMenu);
        
        //------------------------------------
        JMenu myHelpMenu = new JMenu("Help");
        myHelpMenu.setMnemonic('H');
        
        myMenuBar.add(myHelpMenu);
        
        
        //-----------------------
        myFrame.add(myMenuBar);
        
        
        
        
        //Still need to take care the font "Courier Normal" 12 points
        
        //Center the calculator on the default screen at startup.
        myFrame.pack();
        myFrame.setLocationRelativeTo(null);
    
        //Display the frame.
        myFrame.setVisible(true);
    }

    public static void main(String[] args)
    {
        //Create the frame on the event dispatching thread. 
        //should be new Notepad(args[0])?!
        //Or is that new Notepad(args.length != 0 ? args[0] : null)
        
        SwingUtilities.invokeLater(() -> new Notepad());
    }
  
}
