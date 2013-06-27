// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package no.course.dialog;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.*;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.BoxLayout;
import javax.swing.DefaultFocusManager;
import javax.swing.FocusManager;
import javax.swing.InputMap;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.*;

import no.genova.client.component.GenovaDesktopPane;
import no.genova.client.component.GenovaToolBar;
import no.genova.client.component.menu.*;
import no.genova.client.event.GenovaDataEvent;
import no.genova.client.support.Application;
import no.genova.client.support.ApplicationMethods;
import no.genova.client.support.DialogBlocker;
import no.genova.client.support.DialogBoxTool;
import no.genova.client.support.GenovaDialogController;
import no.genova.client.support.GenovaDialogFrame;
import no.genova.client.support.GenovaWorker;
import no.genova.client.support.RepositoryProxy;
import no.genova.client.support.StatusBar;
import no.genova.client.support.message.ClientInteractor;

import no.genova.domain.GenovaEnums;

import no.genova.exception.GenovaBaseException;
import no.genova.exception.GenovaClientFrameworkException;

import no.genova.message.CRuntimeMsg;
import no.genova.message.Message;
import no.genova.message.MessageFactory;
import no.genova.message.MessageSystem;

import no.genova.service.JGrapeService;
import no.genova.service.print.PrintService;
import no.genova.service.print.ExportService;

import no.genova.service.GenovaSpring;
import no.genova.support.ObjectFactory;
import no.genova.support.Registry;
import no.genova.support.xml.XmlConverter;

/** 
 * Public class that initialises the dialogs and starts the
 * AddStudentsToCourse_appl. To create your own application, inherit this
 * class and write your own main method by copying the content of this
 * main method to your class. You might also want to use the following
 * methods to change language of messages boxes:
 * <ul>
 * <li>changeYesNoString
 * <li>changeYesNoCancelString
 * </ul>
 * Example:
 * <pre>
    static public void main(String argv[]) {
        ma = new MyApplicationMain();
        String jaNei[] = { "Ja", "Nei" };
        ma.changeYesNoString(jaNei);
        // Her får meldingsboksene norske valg
        String jaNeiAvbryt[] = { "Ja", "Nei", "Avbryt" };
        ma.changeYesNoCancelString(jaNeiAvbryt);
        ma.applicationFrame.setTitle("Title of window");
        ma.setApplication();
        ma.init();
        ma.setMdiSize(1020, 742);
        ma.start();
 * </pre>
 *
 * The application resides in the JFrame called applicationFrame. It uses 
 * a borderlayout manager for default, where CENTER is used for desktop and
 * toolbars, and south is used for space for statusbar. The statusbar space
 * has a boxlayout manager by default. (It is possible to use it for other
 * uses, though it is now optimized for the possible use as a statusbar)
 *
 */   
@SuppressWarnings("all")
public class AddStudentsToCourse_applDefault extends Application implements ApplicationMethods {
    static {
        RepositoryProxy.init(new AddStudentsToCourse_applRepository());
    }
    /** Application enums.*/
    GenovaEnums applicationEnums = new AddStudentsToCourse_applEnums();
    
    /** The application frame. */
    protected JFrame applicationFrame = new JFrame();
    
    /** The desktop pane where the JInternalFrames reside. */
    protected GenovaDesktopPane desktop = new GenovaDesktopPane();
    
    /** The menu bar for the desktop. */
    protected GenovaMenuBar desktopMenuBar;
    
    /** The tool bar for the desktop. */
    
    protected GenovaToolBar desktopToolBar;
    
    /** The scroll panel for the desktop pane. */
    protected JScrollPane desktopScrollPane = new JScrollPane();
    
    /** Do not use this any more. Instead use the 
     * StatusBar, accessible through {@link #getStatusBar}.
     * Optional status bar. 
    */
    protected JPanel statusBarPanel = new JPanel();
    
    /** The status bar */
    protected StatusBar statusBar = new StatusBar(); 
    
    /** Panel for desktop and toolbar. Do not use this one */
    private JPanel toolBarAndDesktop = new JPanel();
    
    /** Controller representing the Application Dialog */
    protected GenovaDialogController applicationController = null;
    
    /** Vector containing the windows added */
    Vector windowsAdded = new Vector();
    
    /** Linkedlist that handles the focus setting */
    LinkedList wList = new LinkedList();
    
    
    /**
     * Default constructor
     */
    public AddStudentsToCourse_applDefault() {
        GenovaSpring.loadApplicationContext();
        setCurrentApplication(this);
    }
    public void toFront() {
        applicationFrame.toFront();
    }
    
    /** Lock for previous active window */
    private static Object previousActiveLock = new Object();
    
    public boolean isWindowAdded(String name) {
        for(Iterator i = windowsAdded.iterator();i.hasNext();) {
            GenovaDialogController gd = (GenovaDialogController)i.next();
            if(gd.getDialogName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * @return the name of the application
     * @deprecated Use Application.getCurrentApplication().getApplicationName()
     */
    public static String getStaticName() {
        return "AddStudentsToCourse_appl";
    }
    
    public GenovaDialogController createDialog(String name, boolean add) {
        StringBuffer className = new StringBuffer("no.course.dialog.");
        className.append(name.toLowerCase());
        className.append(".");
        className.append(name);
        className.append("Controller");
        Class[] params = {ApplicationMethods.class};
        Object[] args = {this}; 
        GenovaDialogController gdc = 
            (GenovaDialogController) ObjectFactory
                .newObject(className.toString(), params, args);
        if (add) {
            addWindow(gdc);
        }
        return gdc;
    }
    
    public GenovaDialogController createDialog(String name) {
        return createDialog(name, true);
    }
    
    public GenovaDialogController getOldDialogOrCreateNew(String name) {
        for(Iterator i = windowsAdded.iterator();i.hasNext();) {
            GenovaDialogController gd = (GenovaDialogController)i.next();
            if(gd.getDialogName().equals(name)) {
                return gd;
            }
        }
        return createDialog(name);
    }
    List blockedWindows;
    GenovaDialogController modalController;
    public GenovaDialogController getModal() {
        return modalController;
    }
    public void commonViewStartup(JInternalFrame frame, GenovaDialogController gc) {
       /* Overload */
        if(false) { frame.getClass(); gc.getClass(); }
    }
    public void commonViewStartup(JFrame frame, GenovaDialogController gc) {
       /* Overload */
        if(false) { frame.getClass(); gc.getClass(); }
    }

    public List getAddedWindows() {
        return windowsAdded;
    }
    public void setModal(GenovaDialogController modalG, boolean isModal) {
        if(isModal) {
            if(blockedWindows != null) {
                throw new RuntimeException("Can't make new window modal before previous modal setting is cleared.");
            }
            modalController = modalG;
            blockedWindows = Collections.synchronizedList(new ArrayList(windowsAdded.size()-1));
            /* Block windows and register them */
            for(Iterator i = windowsAdded.iterator();i.hasNext();) {
                GenovaDialogController gd = (GenovaDialogController)i.next();
                /* Skip the window we don't want blocked */
                if(gd == modalG) {
                    continue;
                }
                gd.blockDialog();
                blockedWindows.add(gd);
            }
        } else {
            if(blockedWindows != null) {
                for(Iterator i = blockedWindows.iterator();i.hasNext();) {
                    GenovaDialogController gd = (GenovaDialogController)i.next();
                    gd.unblockDialog();
                }
            }
            blockedWindows = null;
            modalController = null;
        }
    }
    LinkedList eventsWaiting = new LinkedList();
    boolean eventRunning = false;
    public void sendGenovaDataEvent(GenovaDataEvent eventObject) {
        if(eventRunning) {
            eventsWaiting.add(eventObject);
            return;
        }
        eventRunning = true;
        ArrayList toIterate = new ArrayList(windowsAdded);
        for(Iterator i = toIterate.iterator();i.hasNext();) {
            GenovaDialogController gd = (GenovaDialogController)i.next();
            gd.genovaDataEvent(eventObject);
        }
        eventRunning = false;
        if(eventsWaiting.size() > 0) {
            GenovaDataEvent event = (GenovaDataEvent)eventsWaiting.remove(0);
            sendGenovaDataEvent(event);
        }
    }
    public GenovaDialogController getDialog(String name) {
        for(Iterator i = windowsAdded.iterator();i.hasNext();) {
            GenovaDialogController gd = (GenovaDialogController)i.next();
            if(gd.getDialogName().equals(name)) {
                return gd;
            }
        }
        return null;
    }
    /** Menu choice for creating debug windows */
    /** Controllers for active windows */
    protected Vector desktopControllers = new Vector();
    /** Vector for basic toolbar entries */
    Vector toolBarElements = new Vector();
    /** Set this one to false in your init function if you do not want
     * the added Dialog pulldown menu */
    protected boolean debugDialogs = true;
    /** Set to true if the application is not an applet */
    protected boolean isApplication = false;
    /** UnSet to not display menu bar */
    protected boolean hasMenuBar = true;
    /** Unset to not display tool bar */
    protected boolean hasToolBar = true;
    /* Class used to set actions on menu choices for the window menu */
    class WindowMenuListener implements ActionListener {
        private JInternalFrame windowFrame = null;
        /** 
         * Creates a new window menu listener
         * @param jf the window frame this listener listens on.
         */
        public WindowMenuListener(JInternalFrame jf) {
            windowFrame = jf;
        }
        public void actionPerformed(ActionEvent e) {
           windowFrame.toFront();
            try {
                windowFrame.setSelected(true);
            }
            catch(PropertyVetoException ex) {
               // Could not select frame. Not much to do about it...
            }
        }
    }
    private class DialogAdapter extends WindowAdapter {
        GenovaDialogController gdc;

        private DialogAdapter(GenovaDialogController gdc) {
            this.gdc = gdc;
        }

        public void windowClosed(WindowEvent e) {
            int position = windowsAdded.indexOf(gdc);
            if (position == -1) {
                return;
            }
            windowsAdded.remove(position);
            desktopControllers.remove(gdc);
            removeFromwList(gdc); 
            // Allow other events to finish before removing the worker
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    GenovaWorker worker = GenovaWorker.getWorker(gdc);
                    worker.relinquish();
                }
            });
        }

        public void windowActivated(WindowEvent e) {
            synchronized (previousActiveLock) {
                    if (gdc != null) {
                        removeFromwList(gdc);
                    }
                    wList.addFirst(gdc);
                }
        }
    }
    class GenovaInternalFrameAdapter extends InternalFrameAdapter {
        GenovaDialogController gdc = null;
        Set currentDialogMenuItems = null;
        /** Crates a new instance of this adapter.
         * @param gdc the dialog controller
         * @param currentDialogMenuItems the Set of dialog menu items.
         */
        public GenovaInternalFrameAdapter(GenovaDialogController gdc, 
                Set currentDialogMenuItems) {
            this.gdc = gdc;
            this.currentDialogMenuItems = currentDialogMenuItems;
        }
        
        /**
         * Invoked when an dialog has been closed. 
         * Calculates the next component to gain focus and gives it focus
         * The method also does various internal pointer and list bookkeeping.
         * @param e the closed dialog 
         */
        public void internalFrameClosed(InternalFrameEvent e) {
            int position = windowsAdded.indexOf(gdc);
            if (position == -1) {
                return;
            }
            windowsAdded.remove(position);
            removeFromwList(gdc); 
            desktopControllers.remove(gdc);
            // Allow other events to finish before removing the worker
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    GenovaWorker worker = GenovaWorker.getWorker(gdc);
                    worker.relinquish();
                }
            });
        }
        
        public void internalFrameActivated(InternalFrameEvent e) {
            synchronized (previousActiveLock) {
                if (gdc != null) {
                    removeFromwList(gdc);
                }
                wList.addFirst(gdc);
            }
        }
    }
        /** 
         * REmoves the specified dialog from the list of dialogs.
         * @param gc the dialog to remove
         */
     private void removeFromwList(GenovaDialogController gc) {
         Iterator i = wList.iterator();
         while (i.hasNext()) {
             GenovaDialogController gd = (GenovaDialogController) i.next();
             if (gd.getDialogName().equals(gc.getDialogName())) {
                 wList.remove(gd);
                 break;
             }
         }
     } 
    public GenovaDesktopPane getGenovaDesktopPane() {
       return desktop;
    }
    /**
     * Returns the menu bar of the application.
     * @return the <code>GenovaMenuBar</code>
     */
    public GenovaMenuBar getApplicationMenuBar() {
        return desktopMenuBar;
    }
    /**
     * Returns the tool bar of the application.
     * @return the <code>GenovaToolBar</code>
     */
    public GenovaToolBar getApplicationToolBar() {
        return desktopToolBar;
    }


    public void addWindow(GenovaDialogController g, boolean doInit) {
        windowsAdded.add(g);
        wList.addFirst(g);
        desktopControllers.addElement(g);
        if (doInit) {
            g.init();
        }
        Set currentDialogMenuItems = new HashSet();
        Object gob = g.getWindow();
        if(gob instanceof JInternalFrame) {
            JInternalFrame fView = (JInternalFrame) gob;
            desktop.add(fView, JLayeredPane.DEFAULT_LAYER);
            desktop.setRequestFocusEnabled(true);
            fView.setClosable(true);
            fView.setRequestFocusEnabled(true);
            /* Catch closing of window */
            fView.addInternalFrameListener(
                    new GenovaInternalFrameAdapter(g, currentDialogMenuItems));

            if (fView instanceof GenovaDialogFrame) {
                GenovaDialogFrame gView = (GenovaDialogFrame) fView;
                gView.setVisible(true, true);
            } else {
                fView.setVisible(true);
            }

            g.toFront();
            fView.show();
            desktop.frameAdded(fView);
        } else if (gob instanceof JDialog) {
            final JDialog dView = (JDialog) gob;
            dView.addWindowListener(new DialogAdapter(g));
            Runnable task = new Runnable() {
                public void run() {
                    DialogBoxTool.showDialog(dView);
                }
            };
            if (SwingUtilities.isEventDispatchThread()) {
                GenovaWorker worker = GenovaWorker.getWorker(this);
                synchronized(worker) {
                    worker.enqueue(task);
                    worker.relinquish();
                }
            } else {
                task.run();
            }   
            g.getView().setVisible(true, true);     
        }
    }
    
    
    /* Various dialogs startup rutines follows */
     /* END OF DIALOG startup functions */
     /** 
      * Mark this as a regular application and not an applet.
      */
    public void setApplication() {
       isApplication = true;
    }
    /**
     * Sets the look and feel for this application. Default is system look
     * and feel. If you want some other look and feel, redefine this 
     * method. 
     */
    protected void setLookAndFeel() {
        Exception ex = null;
        try {
            UIManager.put("Menu.crossMenuMnemonic", Boolean.TRUE);
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            ex = e;
        } catch (InstantiationException e) {
            ex = e;
        } catch (IllegalAccessException e) {
            ex = e;
        } catch (UnsupportedLookAndFeelException e) {
            ex = e;
        } finally {
            if (ex != null) {
                Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_LOOK_AND_FEEL);
                MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                throw new GenovaClientFrameworkException(ex, msg);
            }
        }
    }
    /** Sets up desktop */
    protected void setupDesktop() {
        toolBarAndDesktop.setLayout(new BorderLayout());
        toolBarAndDesktop.add(desktop, BorderLayout.CENTER);
        applicationFrame.getContentPane().add(toolBarAndDesktop, BorderLayout.CENTER);
        desktopScrollPane.getViewport().add(desktop);
        toolBarAndDesktop.add(desktopScrollPane, BorderLayout.CENTER);
        /* Old status bar - do not use this any more! Instead use the status
         * bar accessible with getStatusBar() */
        statusBarPanel.setLayout(new BoxLayout(statusBarPanel, BoxLayout.X_AXIS));
    }
    JLabel statusBarText;     /* Not used any more */
    /**
     * @deprecated Use the {@link no.genova.client.support.StatusBar}, 
     * accessible through {@link #getStatusBar} instead.
     */
    public void setStatusBarAsTextBar() {
        statusBarText = new JLabel();
        statusBarPanel.add(statusBarText);
    }
    public StatusBar getStatusBar() {
        return statusBar;
    }
    public GenovaEnums getEnums() {
        return applicationEnums;
    }
    public String getApplicationName() {
        return "AddStudentsToCourse_appl";
    }
    public JFrame getApplicationWindow() {
        return applicationFrame;
    }
    /**
     * Display a message in the status bar.
     * @param message the message
     * @param bell if <code>true</code> bell rings.
     * @deprecated Use the {@link no.genova.client.support.StatusBar}, 
     * accessible through {@link #getStatusBar} instead.
     */
    public void statusBarMessage(String message, boolean bell) {
        statusBarMessage(message, bell, 10);
    }
    /**
     * Displays a message in the status bar.
     * @param message the message
     * @param params array of parameters
     * @param bell if <code>true</code> bell rings.
     * @deprecated Use the {@link no.genova.client.support.StatusBar}, 
     * accessible through {@link #getStatusBar} instead.
     */
    public void statusBarMessage(String message, Object params[], boolean bell) {
        statusBarMessage(message, bell, 10);
        if(false) {
            params.getClass();
        }
    }
    /**
     * Displays a message in the status bar.
     * @param message the message
     * @param bell if <code>true</code> bell rings.
     * @param seconds number of seconds to display message
     * @deprecated Use the {@link no.genova.client.support.StatusBar}, 
     * accessible through {@link #getStatusBar} instead.
     */
    public void statusBarMessage(String message, boolean bell, int seconds) {
        if(statusBarText == null) {
            setStatusBarAsTextBar();
        }
        statusBarText.setText(message);
        if(bell) {
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
        if(seconds > 0) {
            MessageClearThread t = new MessageClearThread();
            t.setWaitTime(1000*seconds);
            t.start();
        }
    }
    /**
     * Displays a message in status bar
     * @param message the message
     * @param params array of parameters
     * @param bell if <code>true</code> bell rings.
     * @param seconds number of seconds to display message
     * @deprecated Use the {@link no.genova.client.support.StatusBar}, 
     * accessible through {@link #getStatusBar} instead.
     */
    public void statusBarMessage(String message, Object params[],
                                 boolean bell, int seconds) {
        statusBarMessage(message, bell, seconds);
        if(false) {
            params.getClass();
        }
    }
    private String yesNoString[] = {"Yes","No"};
    private String yesNoCancelString[] = {"Yes","No","Cancel"};
    /** Changes the button choices in a Yes No message box.
     * @param s {"Yes","No"}
     */
    public void changeYesNoString(String s[]) {
        yesNoString = s;
    }
    /** Changes the button choices in a Yes No Cancel message box.
     * @param s {"Yes","No", "Cancel"} */
    public void changeYesNoCancelString(String s[]) {
        yesNoCancelString = s;
    }
    public void okMessageBox(String message, String title) {
//        List blocked = blockWindows();
        JOptionPane.showMessageDialog(desktop, message, title, JOptionPane.INFORMATION_MESSAGE);
//        unblockWindows(blocked);
    }
    /**
     * @deprecated
     */
    private void unblockWindows(List blocked) {
        no.genova.client.support.EventBlocker blocker = 
                no.genova.client.support.EventBlocker.getInstance();
        for (Iterator i = blocked.iterator(); i.hasNext();) {
            JInternalFrame frame = (JInternalFrame) i.next();
            blocker.unblockComponent(frame);
        }
    }
    /**
     * @deprecated
     */
    private List blockWindows() {
        LinkedList res = new LinkedList();
        no.genova.client.support.EventBlocker blocker = 
                no.genova.client.support.EventBlocker.getInstance();
        for (Iterator i = windowsAdded.iterator(); i.hasNext();) {
            GenovaDialogController gdc = (GenovaDialogController) i.next();
            if(!blocker.isBlocked(gdc.getWindow())) {
                res.add(gdc.getWindow());
                blocker.blockComponent(gdc.getWindow());
            }
        }
        return res;
    }
    public int yesNoMessageBox(String message, int standardValue, String title) {
//        List blocked = blockWindows();
        int val= JOptionPane.showOptionDialog(desktop, message, title, JOptionPane.YES_NO_CANCEL_OPTION,
                                            JOptionPane.QUESTION_MESSAGE, null, /* Ikon */
                                            yesNoString, yesNoString[standardValue]);
//        unblockWindows(blocked);
        return val;
    }
    public int yesNoCancelMessageBox(String message, int standardValue, String title) {
//        List blocked = blockWindows();
        int res = JOptionPane.showOptionDialog(desktop, message, title, JOptionPane.YES_NO_CANCEL_OPTION,
                                            JOptionPane.QUESTION_MESSAGE, null, /* Ikon */
                                            yesNoCancelString, yesNoCancelString[standardValue]);
//        unblockWindows(blocked);
        return res;
    }
    public int multiMessageBox(String message, Object choices[], String standardChoice, String title) {
//        List blocked = blockWindows();
        int res = JOptionPane.showOptionDialog(desktop, message, title, 0, JOptionPane.QUESTION_MESSAGE,
                                            null, /* Ikon */
                                            choices, standardChoice);
//        unblockWindows(blocked);
        return res;
    }
    public void okMessageBox(String message, Object params[], String title) {
        okMessageBox(message, title);
        if(false) {
            params.getClass();
        }
    }
    public int yesNoMessageBox(String message, Object params[], 
                               int standardValue, String title) {
        if(false) {
            params.getClass();
        }
        return yesNoMessageBox(message, standardValue, title);
    }
    public int yesNoCancelMessageBox(String message, Object params[], int standardValue, String title) {
        if(false) {
            params.getClass();
        }
        return yesNoCancelMessageBox(message, standardValue, title);
    }
    public int multiMessageBox(String message, Object params[], Object choices[], String standardChoice, String title) {
        if(false) {
            params.getClass();
        }
        return multiMessageBox(message, choices, standardChoice, title);
    }
    /**
     * @deprecated This class is no longer in used.
     */
    class MessageClearThread extends Thread {
        int waittime;
        /** 
         * Sets the wait time this thread waits before clearing the
         * status bar.
         * @param n the milliseconds to wait
         */
        public void setWaitTime(int n) {
            waittime = n;
        }
        public void run() {
            try {
                sleep(waittime);
            }
            catch(InterruptedException e) {/* IGNORE */}
            statusBarText.setText("");
        }
    }
    /**
     * Initializses the application.  */
    public void init() {
        //FocusManager.setCurrentManager(new DesktopFocusManager());
        setLookAndFeel();
        //applicationFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setupDesktop();
        /* Add elements in debug dialog menu choice */
        
        applicationFrame.pack();
        desktopMenuBar = applicationController.getView().getGenovaMenuBar();
        desktopToolBar = applicationController.getView().getGenovaToolBar();
    }
    /** 
     * Sets size of application frame.
     * @param width the width in pixels
     * @param height the height in pixels
     */
    public void setMdiSize(int width, int height) {
        applicationFrame.setSize(width, height);
    }
    /** 
     * Starts the application.
     */
    public void start() {
        int wWidth  = 0; // default initial value
        int wHeight = 0; // default initial value
        int wXPos   = 0; // default initial value
        int wYPos   = 0; // default initial value
        applicationFrame.setBounds(wXPos, wYPos, wWidth, wHeight);
        desktop.setVisible(true);
        applicationFrame.setVisible(true);
        if (hasMenuBar && desktopMenuBar != null) {
            applicationFrame.setJMenuBar(desktopMenuBar);
            desktop.setMenuBar(desktopMenuBar);
            DialogBlocker.addAllowedKeyStrokesFromMenuBar(desktopMenuBar);
        }
        if(hasToolBar && desktopToolBar != null) {
            desktopToolBar.setRemoveConsecutiveSeparators(true);
            desktop.setToolBar(desktopToolBar);
            toolBarAndDesktop.add(desktopToolBar, BorderLayout.NORTH);
            DialogBlocker.addAllowedMnemonicsFromButtons(desktopToolBar);
        }
        boolean useStatusBar = false; // default initial value
        if (useStatusBar) {
            applicationFrame.getContentPane().add(statusBar, BorderLayout.SOUTH);
        }
        SwingUtilities.updateComponentTreeUI(applicationFrame);
    }
    /**
     * Redefine this one in your application. Start by copying the
     * method into your subclass. See also class documentation.
     * @param args As per the java spec - not used in default implementation.
     */
    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               AddStudentsToCourse_applDefault ma = new AddStudentsToCourse_applDefault();
               ma.setApplication();
               ma.init();
               ma.start();
           }
       });
    }
}
