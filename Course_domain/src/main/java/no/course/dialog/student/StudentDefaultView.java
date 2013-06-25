// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package no.course.dialog.student;

import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.text.*;
import javax.swing.table.*;
import javax.swing.tree.*;

import java.awt.AWTEvent;
import java.awt.event.*;
import java.util.*;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar.Separator;
import javax.swing.JTree;
import javax.swing.JDialog;
import javax.swing.KeyStroke;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultListSelectionModel;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.HashMap;

import no.genova.client.component.GenovaTextField;
import no.genova.client.component.GenovaPasswordField;
import no.genova.client.component.GenovaTextArea;
import no.genova.client.component.GenovaCheckBox;
import no.genova.client.component.GenovaButtonGroup;
import no.genova.client.event.GenovaValueChangedEvent;
import no.genova.client.event.GenovaValueChangedListener;
import no.genova.client.component.GenovaButton;
import no.genova.client.component.GenovaRadioButton;
import no.genova.client.component.GenovaComboBox;
import no.genova.client.component.menu.GenovaEditMenu;
import no.genova.client.component.menu.GenovaFileMenu;
import no.genova.client.component.menu.GenovaHelpMenu;
import no.genova.client.component.menu.GenovaMenu;
import no.genova.client.component.menu.GenovaMenuItem;
import no.genova.client.component.menu.GenovaMenuBar;
import no.genova.client.component.menu.GenovaViewMenu;
import no.genova.client.component.menu.GenovaWindowMenu;
import no.genova.client.component.GenovaToolBar;
import no.genova.client.component.GenovaDialogBox;
import no.genova.client.component.GenovaTabPaneManager;


/*
 * The following imports are known to be used. To avoid potentially
 * errors due to lack of imports no.genova.client.support.*; 
 * is added last.
 */ 
import no.genova.client.support.GenovaDialogFrame;
import no.genova.client.support.RepositoryProxy;
import no.genova.client.support.BottomWindow;
import no.genova.client.support.GenovaTable;
import no.genova.client.support.ToolTipHeader;
import no.genova.client.support.RowHeaderRenderer;
import no.genova.client.support.ListblockLine;
import no.genova.client.support.JComponentCellEditor;
import no.genova.client.support.ComponentLink;
import no.genova.client.support.GenovaRender;
import no.genova.client.event.GenovaDroppedDownEvent;
import no.genova.client.event.GenovaEvent;
import no.genova.client.event.GenovaEventHolder;
import no.genova.client.event.GenovaKeyEventHolder;
import no.genova.client.event.GenovaActionEventHolder;
import no.genova.client.event.GenovaWindowEventHolder;
import no.genova.client.event.GenovaFocusEventHolder;
import no.genova.client.event.GenovaComponentEventHolder;
import no.genova.client.event.GenovaListSelectionEventHolder;
import no.genova.client.event.GenovaHeaderClickedEventHolder;
import no.genova.client.event.GenovaMouseEventHolder;
import no.genova.client.event.GenovaWindowEvent;
import no.genova.client.event.GenovaWindowAdapter;
import no.genova.client.event.GenovaItemEventHolder;
import no.genova.client.event.GenovaSelectionListener;
import no.genova.client.event.GenovaSelectedEvent;
import no.genova.client.event.GenovaVetoableSelectionListener;
import no.genova.client.event.GenovaVetoableSelectionEvent;
import no.genova.domain.GenovaEnums;
import no.genova.message.Message;
import no.genova.message.CRuntimeMsg;
import no.genova.message.MessageFactory;
import no.genova.message.MessageSystem;
import no.genova.domain.DomainUtil;
import no.genova.client.support.*;
import no.genova.exception.GenovaClientException;

/**
 * The following imports are known to be used. To avoid potentially
 * errors due to lack of imports no.genova.support.*; 
 * is added last.
 */ 
import no.genova.exception.GeneralException;
import no.genova.exception.DBException;
import no.genova.support.TypeTool;
import no.genova.support.*;

// Import of enumerations. 

// Other imports.
import no.course.domain.Student;


/**
 * Public class interpreting the generated view part of
 * Student. This class is generated and should not be edited
 * in. If any changes are needed, do them in StudentView.
 */ 
@SuppressWarnings("all")
public abstract class StudentDefaultView extends GenovaDialogFrame implements BottomWindow {
    
    boolean selectItemOK = true;
    
    StudentDefaultController controller;
    GenovaEnums applicationEnums;
    
    FocusProc focusProc = new FocusProc();
    ComponentProc componentProc = new ComponentProc();
    ActionProc actionProc = new ActionProc();
    WindowProc windowProc = new WindowProc();
    GenovaWindowProc genovaWindowProc = new GenovaWindowProc();
    KeyProc keyProc = new KeyProc();
    GenovaSelectionListener listSelectionProc = new ListSelectionProc();
    MouseProc mouseProc = new MouseProc();
    ItemProc itemProc = new ItemProc();
    ChangeProc changeProc = new ChangeProc();
    Vector toolBarElements = new Vector();
    JInternalFrame theStudentInternalFrame = this;
    
    int totalBlockAllEvents = 0;
    int noFocusException = 0;
    final int HorizontalAlign_right = SwingConstants.RIGHT;
    final int HorizontalAlign_RIGHT = SwingConstants.RIGHT;
    final int HorizontalAlign_left = SwingConstants.LEFT;
    final int HorizontalAlign_LEFT = SwingConstants.LEFT;
    final int HorizontalAlign_center = SwingConstants.CENTER;
    final int HorizontalAlign_CENTER = SwingConstants.CENTER;
    
    
    /* Her kommer generert kode fra WindowBlock:Declaration*/
    
    JPanel Window = new JPanel();
    JPanel Window_outer = new JPanel();
    int blockWindowEventsWindow = 0;
    JPanel theOutmostFrame = Window_outer;
    private JDialog asDialog;


    /**
     * Positions the dialog window
     */
    private void positionWindow() {
        int xpos = 0;
        int ypos = 0;
        if (xpos != 0 || ypos != 0) {
            setLocation(xpos, ypos);
        }
    }


    /**
     * Returns <code>true</code> if this is a dialog box.
     * @return a boolean value, <code>true</code> if this is a dialog box.
     */
    protected boolean isDialog() {
        return false;
    }
    /**
     * Gets a JDialog representation of this dialog.
     * @return a JDialog representation of this dialog.
     */
    protected JDialog getDialog() {
        if (asDialog == null) {
            asDialog = new GenovaDialogBox(controller.application.getApplicationWindow());
            asDialog.setTitle(getTitle());
            ((GenovaDialogBox) asDialog).setController(getController());
            asDialog.setContentPane(getContentPane());
            cleanUpMnemonicButtons();
            JButton defaultButton = getRootPane().getDefaultButton();
            if (defaultButton != null) {
                getRootPane().setDefaultButton(null);
                asDialog.getRootPane().setDefaultButton(defaultButton);
            }
            asDialog.setSize(getSize());
            asDialog.setModal(isModal());
            asDialog.setResizable(false);
            asDialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            asDialog.addWindowListener(new WindowProc());
            ((GenovaDialogBox) asDialog).copyActions(this);
            asDialog.addHierarchyListener(new HierarchyListener() {

                public void hierarchyChanged(HierarchyEvent e) {
                    if (HierarchyEvent.SHOWING_CHANGED == (e
                            .getChangeFlags() & HierarchyEvent.SHOWING_CHANGED)) {
                        JDialog dialog = (JDialog) e.getSource();
                        if (!dialog.isShowing()) {
                            fireGenovaWindowEvent(GenovaWindowEvent
                                    .GENOVA_DIALOG_HIDDEN);
                        }
                    }
                }
            });
            int xpos = 0;
            int ypos = 0;
            if (xpos == 0 && ypos == 0) {
                controller.setDialogLocation();
            } else {
                asDialog.setLocation(xpos, ypos);
            }                        
        }

        return asDialog;
    }
    
    /* Her kommer generert kode fra Menu:Declaration*/
    
    GenovaToolBar Toolbar = new GenovaToolBar(this, toolBarElements);
    
    /** The StudentClass simple block */
    protected JPanel StudentClass = new JPanel();
    
    /** The StudentData simple block */
    protected JPanel StudentData = new JPanel();
    
    /** The StudentAgeLabel label */
    protected JLabel StudentAgeLabelLabel = new JLabel("age");
    GenovaTextField Student_age = new GenovaTextField("");
    final Object objectVersionOfStudentage = Student_age;
    String oldValueStudentage;
    
    /** The StudentIdLabel label */
    protected JLabel StudentIdLabelLabel = new JLabel("id");
    GenovaTextField Student_id = new GenovaTextField("");
    final Object objectVersionOfStudentid = Student_id;
    String oldValueStudentid;
    
    /** The StudentNameLabel label */
    protected JLabel StudentNameLabelLabel = new JLabel("name");
    GenovaTextField Student_name = new GenovaTextField("");
    final Object objectVersionOfStudentname = Student_name;
    String oldValueStudentname;
    
    /** The StudentStudentNrLabel label */
    protected JLabel StudentStudentNrLabelLabel = new JLabel("studentNr");
    GenovaTextField Student_studentNr = new GenovaTextField("");
    final Object objectVersionOfStudentstudentNr = Student_studentNr;
    String oldValueStudentstudentNr;
    
    /** The StudentButton simple block */
    protected JPanel StudentButton = new JPanel();
    
    /* Her kommer generert kode for Button:Declaration*/
    
    JButton StudentSearchButton;
    
    
    /* Her kommer generert kode for Button:Declaration*/
    
    JButton StudentClearButton;
    
    
    /* Her kommer generert kode for Button:Declaration*/
    
    JButton StudentSaveButton;
    
    
    /* Her kommer generert kode for Button:Declaration*/
    
    JButton StudentDeleteButton;
    
    
    /** If you want to ovveride the close button, you must
     * setDestroyOnClose to 'true'. Then you must perform your own
     * destructment of the window in a "WM Close" event in
     * Genova. In it, use controller.disposeDialog() to remove the
     * window. 
     * @param f if <code>true</code> dialog is disposed on close.
     */
     public void setDestroyOnClose(boolean f) {
        setDefaultCloseOperation(f ? JInternalFrame.DISPOSE_ON_CLOSE:JInternalFrame.DO_NOTHING_ON_CLOSE);
     }
     
     public GenovaDialogController getController() {
        return (GenovaDialogController) controller;
     }
   /**
     * Empty method. Override if needed.
     * 
     * @param pane the scroll pane
     */
    public void modifyScrollPane(JScrollPane pane) {/*EMPTY override if needed */}
    /**
     * Here we can generate code which don't belong anywhere due to missing
     * sections or whatever. It will not be called by any method. 
     * @deprecated
     */
    void trashDepartment() {
        modifyKeyCode(3);
    }
    public boolean isModal() {
        return controller.isModal();
    }
    /**
     * @param key the key to get the mnemonic for
     * @return integer representing the specified key.
     * @deprecated
     */
    int translateMemonic(String key) {
        String msgID = null;
        Exception ex = null;
        String upCase = key.toUpperCase();
        try {
            Field f = KeyEvent.class.getField("VK_"+upCase);
            return f.getInt(KeyEvent.class);
        } catch (SecurityException e) {
            ex = e;
        } catch (NoSuchFieldException e) {
            ex = e;
        } catch (IllegalArgumentException e) {
            ex = e;
        } catch (IllegalAccessException e) {
            ex = e;
        } finally {
            if (ex != null) {
                msgID = CRuntimeMsg.CF_UNABLE_TO_ACCESS_FIELD_OR_METHOD;
                Object[] msgArgs = {this.getClass(), "VK_"+upCase, KeyEvent.class, ex.getMessage()};
                Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
                MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
            }
        }            
        return -1;
    }
    /**
     * Initialize dialog components, set up initial application context.
     * @param controller the dialog controller
     * @param applicationEnums the application enumerators.
     */
    public StudentDefaultView(final StudentDefaultController controller, GenovaEnums applicationEnums) {
        super("", true, true, true, true);
        this.controller = controller;
        this.applicationEnums = applicationEnums;
        positionWindow();
    }
    
    /**
     * Internal use.
     * Inits the dialog. 
     */
    public void init() {        
        totalBlockAllEvents++;
        
        /* Her kommer generert kode fra WindowBlock:SetupDialogPane*/
        
        setTitle("Student");
        getContentPane().add("Center",Window_outer);
        setFrameIcon(RepositoryProxy.getImageField("DefaultIcon"));
        initOuterPanel();
        initNameComponentMappings();
        initFocusActions();
        pack();
        getRootPane().putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
        controller.application.commonViewStartup(this, controller);
        totalBlockAllEvents--;
    }


    private void initNameComponentMappings() {
        nameToComponent.put("StudentClass", StudentClass);
        componentToName.put(StudentClass, "StudentClass");
        nameToComponent.put("StudentData", StudentData);
        componentToName.put(StudentData, "StudentData");
        nameToComponent.put("StudentAgeLabel", StudentAgeLabelLabel);
        componentToName.put(StudentAgeLabelLabel, "StudentAgeLabel");
        nameToComponent.put("Student.age", Student_age);
        componentToName.put(Student_age, "Student.age");
        nameToComponent.put("StudentIdLabel", StudentIdLabelLabel);
        componentToName.put(StudentIdLabelLabel, "StudentIdLabel");
        nameToComponent.put("Student.id", Student_id);
        componentToName.put(Student_id, "Student.id");
        nameToComponent.put("StudentNameLabel", StudentNameLabelLabel);
        componentToName.put(StudentNameLabelLabel, "StudentNameLabel");
        nameToComponent.put("Student.name", Student_name);
        componentToName.put(Student_name, "Student.name");
        nameToComponent.put("StudentStudentNrLabel", StudentStudentNrLabelLabel);
        componentToName.put(StudentStudentNrLabelLabel, "StudentStudentNrLabel");
        nameToComponent.put("Student.studentNr", Student_studentNr);
        componentToName.put(Student_studentNr, "Student.studentNr");
        nameToComponent.put("StudentButton", StudentButton);
        componentToName.put(StudentButton, "StudentButton");
        nameToComponent.put("StudentSearchButton", StudentSearchButton);
        componentToName.put(StudentSearchButton, "StudentSearchButton");
        nameToComponent.put("StudentClearButton", StudentClearButton);
        componentToName.put(StudentClearButton, "StudentClearButton");
        nameToComponent.put("StudentSaveButton", StudentSaveButton);
        componentToName.put(StudentSaveButton, "StudentSaveButton");
        nameToComponent.put("StudentDeleteButton", StudentDeleteButton);
        componentToName.put(StudentDeleteButton, "StudentDeleteButton");
    }
    private void initFocusActions() {
    }
    /** 
     * @deprecated To block or unblock a dialog, invoke 
     * blockDialog or unblockDialog.
     */
    public class Blocker {
        boolean doDebug = System.getProperty("DEBUG_BLOCK") != null;
        /**
         * Prints a debug message to standard out.
         * @param value the value
         * @param name the name
         */
        void debug(int value, String name) {
            if(doDebug) {
                System.out.println("BLOCK: "+name+" Value:"+value);
            }
        }
    }
    Blocker block = new Blocker();
    
     /** Initializes the Window window block */
    private void initWindow() {
        Window_outer.setPreferredSize(new Dimension(402, 174));
        RepositoryProxy.setForegroundColor(Window,"Black");
        RepositoryProxy.setFont(Window,"Standard");
        Window_outer.setLayout(null);
        Window_outer.add(Window);   
        Window.setLocation(0,0);
        Window.setSize(402, 174);
        Window.setLayout(null);
        
        addInternalFrameListener(windowProc);
        addGenovaWindowListener(genovaWindowProc);
        initToolbar();
        initStudentClass();
    }
    
    /** Initializes the Toolbar toolbar */
    private void initToolbar() {
        setGenovaToolBar(Toolbar);
    }
    
    /** Initializes the StudentClass container */
    private void initStudentClass() {
        Window.add(StudentClass);
        StudentClass.setLocation(11+0,11+0);
        StudentClass.setSize(380, 152);
        RepositoryProxy.setBorder(StudentClass,2,"Student");
        RepositoryProxy.setForegroundColor(StudentClass,"Black");
        RepositoryProxy.setFont(StudentClass,"Standard");
        StudentClass.setLayout(null);
        
        initStudentData();
        initStudentButton();
    }
    
    /** Initializes the StudentData container */
    private void initStudentData() {
        StudentClass.add(StudentData);
        StudentData.setLocation(14+3,17+10);
        StudentData.setSize(213, 106);
        RepositoryProxy.setBorder(StudentData,1,"Student");
        RepositoryProxy.setForegroundColor(StudentData,"Black");
        RepositoryProxy.setFont(StudentData,"Standard");
        StudentData.setLayout(null);
        
        initStudentAgeLabelLabel();
        initStudent_age();
        initStudentIdLabelLabel();
        initStudent_id();
        initStudentNameLabelLabel();
        initStudent_name();
        initStudentStudentNrLabelLabel();
        initStudent_studentNr();
    }
    
    /** Initializes the StudentButton container */
    private void initStudentButton() {
        StudentClass.add(StudentButton);
        StudentButton.setLocation(238+3,17+10);
        StudentButton.setSize(128, 108);
        RepositoryProxy.setBorder(StudentButton,1,"Student");
        RepositoryProxy.setForegroundColor(StudentButton,"Black");
        RepositoryProxy.setFont(StudentButton,"Standard");
        StudentButton.setLayout(null);
        
        initStudentSearchButton();
        initStudentClearButton();
        initStudentSaveButton();
        initStudentDeleteButton();
    }
    /**
     * Initializes the StudentAgeLabel label */
    private void initStudentAgeLabelLabel() {
        StudentData.add(StudentAgeLabelLabel);
        StudentAgeLabelLabel.setLocation(0+0,0+0); 
        StudentAgeLabelLabel.setSize(22, 17);
        RepositoryProxy.setForegroundColor(StudentAgeLabelLabel,"Black");
        RepositoryProxy.setFont(StudentAgeLabelLabel,"Standard");
    }
    
    /** Initializes the Student.age text component */
    private void initStudent_age() {
        Student_age.setName("Student.age");
        StudentData.add(Student_age);
        Student_age.setLocation(61+0,0+0);
        { // limit scope of width and height declarations.
            int width = 145;
            int height = 22;
            Student_age.setSize(width, height);
            if (width == 0 && height == 0) {
                Student_age.setFocusable(false);
            }
        } // end limit scope
        
        controller.tabListFromNodeNameStudentData.put("Student.age", Student_age);
        controller.tabListFromComponentStudentData.put(Student_age, "Student.age");
        
           //   Student_age.setEditable(true);
        Student_age.setEditable(true);
        
        //Student_age.setVisible(false || true);
        //
        Student_age.setInputJustification(JTextField.LEFT);
        Student_age.setOutputJustification(JTextField.LEFT);
        Student_age.setHorizontalAlignment(JTextField.LEFT);
        Student_age.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(2, Student_age, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
        RepositoryProxy.setForegroundColor(Student_age,"Black");
        RepositoryProxy.setFont(Student_age,"Standard");
        
        // No Listener
        
    }
    /**
     * Initializes the StudentIdLabel label */
    private void initStudentIdLabelLabel() {
        StudentData.add(StudentIdLabelLabel);
        StudentIdLabelLabel.setLocation(0+0,28+0); 
        StudentIdLabelLabel.setSize(11, 17);
        RepositoryProxy.setForegroundColor(StudentIdLabelLabel,"Black");
        RepositoryProxy.setFont(StudentIdLabelLabel,"Standard");
    }
    
    /** Initializes the Student.id text component */
    private void initStudent_id() {
        Student_id.setName("Student.id");
        StudentData.add(Student_id);
        Student_id.setLocation(61+0,28+0);
        { // limit scope of width and height declarations.
            int width = 145;
            int height = 22;
            Student_id.setSize(width, height);
            if (width == 0 && height == 0) {
                Student_id.setFocusable(false);
            }
        } // end limit scope
        
        controller.tabListFromNodeNameStudentData.put("Student.id", Student_id);
        controller.tabListFromComponentStudentData.put(Student_id, "Student.id");
        
           //   Student_id.setEditable(true);
        Student_id.setEditable(true);
        
        //Student_id.setVisible(false || true);
        //
        Student_id.setInputJustification(JTextField.LEFT);
        Student_id.setOutputJustification(JTextField.LEFT);
        Student_id.setHorizontalAlignment(JTextField.LEFT);
        Student_id.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(2, Student_id, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
        RepositoryProxy.setForegroundColor(Student_id,"Black");
        RepositoryProxy.setFont(Student_id,"Standard");
        
        // No Listener
        
    }
    /**
     * Initializes the StudentNameLabel label */
    private void initStudentNameLabelLabel() {
        StudentData.add(StudentNameLabelLabel);
        StudentNameLabelLabel.setLocation(0+0,56+0); 
        StudentNameLabelLabel.setSize(33, 17);
        RepositoryProxy.setForegroundColor(StudentNameLabelLabel,"Black");
        RepositoryProxy.setFont(StudentNameLabelLabel,"Standard");
    }
    
    /** Initializes the Student.name text component */
    private void initStudent_name() {
        Student_name.setName("Student.name");
        StudentData.add(Student_name);
        Student_name.setLocation(61+0,56+0);
        { // limit scope of width and height declarations.
            int width = 152;
            int height = 22;
            Student_name.setSize(width, height);
            if (width == 0 && height == 0) {
                Student_name.setFocusable(false);
            }
        } // end limit scope
        
        controller.tabListFromNodeNameStudentData.put("Student.name", Student_name);
        controller.tabListFromComponentStudentData.put(Student_name, "Student.name");
        
           //   Student_name.setEditable(true);
        Student_name.setEditable(true);
        
        //Student_name.setVisible(false || true);
        //
        Student_name.setInputJustification(JTextField.LEFT);
        Student_name.setOutputJustification(JTextField.LEFT);
        Student_name.setHorizontalAlignment(JTextField.LEFT);
        Student_name.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(7, Student_name, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(7,"",0,0,0),0,false);
        RepositoryProxy.setForegroundColor(Student_name,"Black");
        RepositoryProxy.setFont(Student_name,"Standard");
        
        // No Listener
        
    }
    /**
     * Initializes the StudentStudentNrLabel label */
    private void initStudentStudentNrLabelLabel() {
        StudentData.add(StudentStudentNrLabelLabel);
        StudentStudentNrLabelLabel.setLocation(0+0,84+0); 
        StudentStudentNrLabelLabel.setSize(56, 17);
        RepositoryProxy.setForegroundColor(StudentStudentNrLabelLabel,"Black");
        RepositoryProxy.setFont(StudentStudentNrLabelLabel,"Standard");
    }
    
    /** Initializes the Student.studentNr text component */
    private void initStudent_studentNr() {
        Student_studentNr.setName("Student.studentNr");
        StudentData.add(Student_studentNr);
        Student_studentNr.setLocation(61+0,84+0);
        { // limit scope of width and height declarations.
            int width = 145;
            int height = 22;
            Student_studentNr.setSize(width, height);
            if (width == 0 && height == 0) {
                Student_studentNr.setFocusable(false);
            }
        } // end limit scope
        
        controller.tabListFromNodeNameStudentData.put("Student.studentNr", Student_studentNr);
        controller.tabListFromComponentStudentData.put(Student_studentNr, "Student.studentNr");
        
           //   Student_studentNr.setEditable(true);
        Student_studentNr.setEditable(true);
        
        //Student_studentNr.setVisible(false || true);
        //
        Student_studentNr.setInputJustification(JTextField.LEFT);
        Student_studentNr.setOutputJustification(JTextField.LEFT);
        Student_studentNr.setHorizontalAlignment(JTextField.LEFT);
        Student_studentNr.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(2, Student_studentNr, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
        RepositoryProxy.setForegroundColor(Student_studentNr,"Black");
        RepositoryProxy.setFont(Student_studentNr,"Standard");
        
        // No Listener
        
    }
    
    /** Initializes the StudentSearchButton button */
    private void initStudentSearchButton() {
        
        /* Her kommer generert kode for Button:Setup*/
        
        ImageIcon imageStudentSearchButton = null;
        if (imageStudentSearchButton != null) {
            StudentSearchButton = new GenovaButton(imageStudentSearchButton);
        }
        else {
            StudentSearchButton = new GenovaButton("StudentSearchButton");
        }
        StudentButton.add(StudentSearchButton);
        StudentSearchButton.setLocation(0+0,0+0);
        StudentSearchButton.setSize(128, 24);
        StudentSearchButton.setMargin(new Insets(0,0,0,0));
        RepositoryProxy.setForegroundColor(StudentSearchButton,"Black");
        RepositoryProxy.setFont(StudentSearchButton,"Standard");
        
        controller.tabListFromNodeNameStudentButton.put("StudentSearchButton", StudentSearchButton);
        controller.tabListFromComponentStudentButton.put(StudentSearchButton, "StudentSearchButton");
    }
    
    /** Initializes the StudentClearButton button */
    private void initStudentClearButton() {
        
        /* Her kommer generert kode for Button:Setup*/
        
        ImageIcon imageStudentClearButton = null;
        imageStudentClearButton = RepositoryProxy.getImageField("Clear");
        if (imageStudentClearButton != null) {
            StudentClearButton = new GenovaButton(imageStudentClearButton);
        }
        else {
            StudentClearButton = new GenovaButton("Clear");
        }
        StudentButton.add(StudentClearButton);
        StudentClearButton.setLocation(0+0,30+0);
        StudentClearButton.setSize(24, 22);
        StudentClearButton.setMargin(new Insets(0,0,0,0));
        RepositoryProxy.setForegroundColor(StudentClearButton,"Black");
        RepositoryProxy.setFont(StudentClearButton,"Standard");
        RepositoryProxy.setImage(StudentClearButton,"Clear");
        StudentClearButton.addActionListener(actionProc);
        
        controller.tabListFromNodeNameStudentButton.put("StudentClearButton", StudentClearButton);
        controller.tabListFromComponentStudentButton.put(StudentClearButton, "StudentClearButton");
    }
    
    /** Initializes the StudentSaveButton button */
    private void initStudentSaveButton() {
        
        /* Her kommer generert kode for Button:Setup*/
        
        ImageIcon imageStudentSaveButton = null;
        imageStudentSaveButton = RepositoryProxy.getImageField("Save");
        if (imageStudentSaveButton != null) {
            StudentSaveButton = new GenovaButton(imageStudentSaveButton);
        }
        else {
            StudentSaveButton = new GenovaButton("Save");
        }
        StudentButton.add(StudentSaveButton);
        StudentSaveButton.setLocation(0+0,58+0);
        StudentSaveButton.setSize(24, 22);
        StudentSaveButton.setMargin(new Insets(0,0,0,0));
        RepositoryProxy.setForegroundColor(StudentSaveButton,"Black");
        RepositoryProxy.setFont(StudentSaveButton,"Standard");
        RepositoryProxy.setImage(StudentSaveButton,"Save");
        StudentSaveButton.addActionListener(actionProc);
        
        controller.tabListFromNodeNameStudentButton.put("StudentSaveButton", StudentSaveButton);
        controller.tabListFromComponentStudentButton.put(StudentSaveButton, "StudentSaveButton");
    }
    
    /** Initializes the StudentDeleteButton button */
    private void initStudentDeleteButton() {
        
        /* Her kommer generert kode for Button:Setup*/
        
        ImageIcon imageStudentDeleteButton = null;
        imageStudentDeleteButton = RepositoryProxy.getImageField("Delete");
        if (imageStudentDeleteButton != null) {
            StudentDeleteButton = new GenovaButton(imageStudentDeleteButton);
        }
        else {
            StudentDeleteButton = new GenovaButton("Delete");
        }
        StudentButton.add(StudentDeleteButton);
        StudentDeleteButton.setLocation(0+0,86+0);
        StudentDeleteButton.setSize(24, 22);
        StudentDeleteButton.setMargin(new Insets(0,0,0,0));
        RepositoryProxy.setForegroundColor(StudentDeleteButton,"Black");
        RepositoryProxy.setFont(StudentDeleteButton,"Standard");
        RepositoryProxy.setImage(StudentDeleteButton,"Delete");
        StudentDeleteButton.addActionListener(actionProc);
        
        controller.tabListFromNodeNameStudentButton.put("StudentDeleteButton", StudentDeleteButton);
        controller.tabListFromComponentStudentButton.put(StudentDeleteButton, "StudentDeleteButton");
    }
    /**
     * Internal code.
     */
    public void initOuterPanel() {
        initWindow();        

        // Disable components that are initially disabled         
        Iterator it = disabledComponents.iterator();
        while(it.hasNext()) {
            super.disableComponent((Component)it.next());
        }

        // update component tree 
        SwingUtilities.updateComponentTreeUI(Window);
        setComboBoxSelectionManager();
    }
    /** 
     * Sets the selection manager for combo boxes. 
     */
    private void setComboBoxSelectionManager() {
         // Avoid compiler warnings
        if (false) {
            int i = 1;
        }
    }
    /**
     * Returns the outer panel
     * @return the outer panel
     */
    public JPanel getOuterPanel() {
        return theOutmostFrame;
    }
    
    List acceleratorEvents = new Vector();
    
        /**
         * NODODC
         */
    public class AcceleratorEvent {
        /** the alt modifier */
        public boolean altModifier = false;
        /** the ctrl modifier */
        public boolean ctrlModifier = false;
        /** the shift modifier */
        public boolean shiftModifier = false;
        /** the key code */
        public int keyCode;
        /** the method name */
        public String methodName = "dummy";
        /** 
         * Creates a new AcceleratorEvent
         * @param a value of alt modifier
         * @param b value of ctrl modifier
         * @param c value of shift modifier
         * @param code the key code
         * @param method the method name
         */
        public AcceleratorEvent(boolean a, 
                                 boolean b,
                                 boolean c,
                                 int code,
                                 String method) {
            altModifier = a;
            ctrlModifier = b;
            shiftModifier = c;
            keyCode = code;
            methodName = method;
        }

        public String toString() {
            return "Keycode:"+keyCode+" altModifer:"+altModifier+" ctrlModifier:"+ctrlModifier+" shiftModifier:"+shiftModifier;
        }
    }
    



    /**
     * Clears the Window window block.
     */    
    public void clearWindow() {
        clearStudentClass(); 
    }

    /**
     * Clears the StudentClass 
     */
    public void clearStudentClass() {
        clearStudentData(); 
        clearStudentButton(); 
    }

    /**
     * Clears the StudentData 
     */
    public void clearStudentData() {
        Student_age.setInitialValue(null);
        Student_age.setValue(null);
        Student_id.setInitialValue(null);
        Student_id.setValue(null);
        Student_name.setInitialValue(null);
        Student_name.setValue(null);
        Student_studentNr.setInitialValue(null);
        Student_studentNr.setValue(null);
    }

    /**
     * Clears the StudentButton 
     */
    public void clearStudentButton() {
    }

    /**
     * Clears all window blocks in the dialog.    
     */
    public void clearStudent() {
        clearWindow(); 
    }

    /** 
     * Internal use.
     * @param keyEvent the key event 
     * @return <code>true</code> if a corresponding accelerator is found.
     */
    public boolean genovaAccelerator(KeyEvent keyEvent) {
        boolean found = false;
        Exception ex = null;
        for(Iterator i = acceleratorEvents.iterator();i.hasNext();) {
            AcceleratorEvent event = (AcceleratorEvent)i.next();
            if(keyEvent.getKeyCode() == event.keyCode &&
                    keyEvent.isShiftDown() == event.shiftModifier && 
                    keyEvent.isAltDown() == event.altModifier &&
                    keyEvent.isControlDown() == event.ctrlModifier) {
                final Class params[] = {GenovaEventHolder.class};
                found = true;
                try {
                    Method m = controller.getClass().getMethod(event.methodName, params);
                    GenovaKeyEventHolder holder = new GenovaKeyEventHolder(keyEvent);
                    final Object args[] = {holder}; 
                    m.invoke(controller, args);
                    if(!holder.shouldConsume()) {
                        found = false;
                    }
                } catch (SecurityException e) {
                    ex = e;
                } catch (IllegalArgumentException e) {
                    ex = e;
                } catch (IllegalAccessException e) {
                    ex = e;
                } catch (NoSuchMethodException e) {
                    ex = e;
                } catch (InvocationTargetException e) {
                    ex = e;
                } finally {
                    if (ex != null) {
                        String msgID = CRuntimeMsg.CF_UNABLE_TO_ACCESS_FIELD_OR_METHOD;
                        Object[] msgArgs = {this.getClass(), event.methodName, event.getClass(), ex.getMessage()};
                        Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
                        MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                    }
                }        
            }
        }
        return found;
    }

    /** 
     * Invoked when a combo box is dropped down.
     * @param theBox the combo box
     * @param source the source
     */
        public void comboBoxDroppedDown(JComboBox theBox, Object source) {
            try {
    /* Might be generated empty */
    if(false) {
        theBox.getClass();
        source.getClass();
    }
            } catch(Throwable t) {
                exceptionHandler(t);
            }
        }
    /** 
     * Internal use.
     * Invoked as part of a value changed event.
     * 
     * @param button the button
     * @param newValue the new value
     * @param oldValue the old value
     * @param e the focus event
     * @return the result of the value changes test.
     */
        public String valueChangedTestCheckButton(JComponent button, String newValue, String oldValue, FocusEvent e) {
            try {
    /* Might be generated empty */
    if(false) {
        button.getClass();
        newValue.getClass();
        oldValue.getClass();
        e.getClass();
    }
            } catch(Throwable t) {
                exceptionHandler(t);
            }
            return null;
        }
    /** 
     * Internal use
     * @param newlines array of new line numbers
     * @param oldlines array of old line numbers
     * @return <code>true</code> if selections are equal
     */
        public boolean equalSelection(int[] newlines, int oldlines[]) {
            if(oldlines == null || newlines.length != oldlines.length) {
                return false;
            }
            for(int i=0; i<newlines.length; i++) {
                if(newlines[i] != oldlines[i]) {
                    return false;
                }
            }
            return true;
        }
    /** 
     * Internal use.
     * Invoked as part of selected event in listblock
     * @param source 
     * @param lines 
     * @param e 
     */
        public void selectionInListblockTest(GenovaTable source, int lines[], GenovaSelectedEvent e) {
            try {
    /* Might be generated empty */
    if(false) {
        source.getClass();
        lines.getClass();
        e.getClass();
    }
            } catch(Throwable t) {
                exceptionHandler(t);
            }
        }
    /** 
     * Invoked as part of value changed in combo box.
     * @param jc 
     * @param g
     * @param e 
     * @param oldValue 
     * @return result of value change test
     */
        public String valueChangedTestComboBox(JComponent jc, GenovaComboBox g, FocusEvent e, String oldValue) {
            try {
    /* Might be generated empty */
    if(false) {
        jc.getClass();
        g.getClass();
        e.getClass();
        oldValue.getClass();
    }
            } catch(Throwable t) {
                exceptionHandler(t);
            }
            return null;
        }
    /** 
     * Internal use.
     * Invoked as part of value changed in text field.
     * @param jc 
     * @param newValue 
     * @param oldValue 
     * @param e 
     * @return reuslt of test.
     */
        public String valueChangedTextField(JComponent jc, String newValue, String oldValue, FocusEvent e ) {
            try {
                // Might be generated empty. Silence code-checkers:
                if (false) {jc.getClass();}
            }catch(Throwable t) {
                exceptionHandler(t);
            }
            // if nothing is changed, oldValue is returned.
            return oldValue;
        }
    /** 
     * Internal use
     * @param theButton 
     * @param source 
     * @param e 
     */
        public void selectedInCheckButton(JComponent theButton, JComponent source, ItemEvent e) {
            try {
    /* Might be generated empty */
            } catch(Throwable t) {
                exceptionHandler(t);
            }
            if(false) {
               theButton.getClass();
               source.getClass();
               e.getClass();
           }
        }
    /** 
     * Internal use
     * @param source 
     * @param event 
     */
    public void selectedInCombobox(JComboBox source, GenovaSelectedEvent event) {
        try {
            // Might be generated empty 
        } catch(Throwable t) {
            exceptionHandler(t);
        }
    }
    /** 
     * Internal use
     * @param s the string to break.
     * @return the broken string?
     */
        public static String breakString(String s) {
            if(s == null) {
                return "";
            }
            StringBuffer result = new StringBuffer(s.length()*2);
            java.text.BreakIterator bi = java.text.BreakIterator.getWordInstance();
            bi.setText(s);
            int linePos = 0;
            int start = bi.first();
            int end = bi.next();
            while(end != java.text.BreakIterator.DONE) {
                if(linePos + (end-start) > 50) {
                    result.append("\n");
                    linePos = 0;
                }
                linePos += (end-start);
                result.append(s.substring(start,end));
                start = end;
                end = bi.next();
            }
            return result.toString();
        }
        /** 
         * Internal use.
         * Handles exceptino in dialog.
         * @param t the throwable to handle.
         */
        public void exceptionHandler(Throwable t) {
            noFocusException++;
            Object[] args = {getClass(), t.getMessage()};
            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CAUGHT, args);
            MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
            noFocusException--;
        }
        /**
         * Internal use.
         * Popup class 
         */
        class PopupProc implements PopupMenuListener {
            public void popupMenuCanceled(PopupMenuEvent e) {
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
            }
        }
        /**
         * Internal use.
         */
        class FocusProc implements FocusListener {
            /** Reference to the last focused component */
            private Component lastFocusedComponent = null;
            
                /** Gets the last component to receive focus.
                 * @return the last focused component.
                 */
            public Component getLastFocusedComponent() {
                return lastFocusedComponent;
            }
            
            public void focusGained(FocusEvent e) {
                if(totalBlockAllEvents != 0) {
                    return;
                }
                lastFocusedComponent = (Component)e.getSource();
                
                /* No focus handling while busy with exceptions */
                if(noFocusException > 0) {
                    return;
                }
                if(e.getSource() instanceof JTextComponent) {
                    JTextComponent tc = ((JTextComponent)e.getSource());
                    if(!(tc.getParent() instanceof JTable)) {
                        //tc.selectAll();
                    }                   
                }
                
                try {
    /* Might be generated empty */
                }catch(Throwable t) {
                    exceptionHandler(t);
                }
            }
            
            public void focusLost(FocusEvent e) {
                
                if(totalBlockAllEvents != 0) {
                    return;
                }
                
                /* No focus handling while busy with exceptions */
                if(noFocusException > 0) {
                    return;
                }
                
                if(e.getSource() instanceof JTextComponent) {
                    JTextComponent tc = ((JTextComponent)e.getSource());
                    //tc.setCaretPosition(0);
                }                
                noFocusException++;
                try {
                /* Might be generated empty */
                }catch(Throwable t) {
                    exceptionHandler(t);
                }finally {
                    noFocusException--;
                }
            }
        }
        /**
         * ActionProc class that captures all the actions in the dialog, for
         * instance: buttons pressed, listblock entires selected.  
         * The action-event is analyzed and the appropriate methods are called. 
         *
         */ 
        
        class ActionProc implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if(totalBlockAllEvents != 0) {
                    return;
                }
                controller.application.setLastException(null);
                try {
                    
                    /* Her kommer generert kode for Button ActionPerformed*/
                    
                    if (e.getSource() == StudentClearButton) {
                        controller.clearStudent(new GenovaActionEventHolder(e));
                    }
                    
                    /* Her kommer generert kode for Button ActionPerformed*/
                    
                    if (e.getSource() == StudentSaveButton) {
                        controller.saveStudent(new GenovaActionEventHolder(e));
                    }
                    
                    /* Her kommer generert kode for Button ActionPerformed*/
                    
                    if (e.getSource() == StudentDeleteButton) {
                        controller.deleteStudent(new GenovaActionEventHolder(e));
                    }
    /* Might be generated empty */
                }catch(Throwable t) {
                    e.getClass();
                    exceptionHandler(t);
                }
            }
        }
        
        /**
         * Internal use.
         */ 
        class ChangeProc implements ChangeListener {
            public void stateChanged(ChangeEvent e) {
                if(totalBlockAllEvents != 0) {
                    return;
                }
                try {
    /* Might be generated empty */
                }catch(Throwable t) {
                    e.getClass();
                    exceptionHandler(t);
                }
            }
        }
        
        /**
         * Internal use
         */
        public class ItemProc implements ItemListener {
            public void itemStateChanged(ItemEvent e) {
                if(totalBlockAllEvents != 0) {
                    return;
                }
                try {
                    // Might be generated empty
                } catch(Throwable t) {
                    exceptionHandler(t);
                }
            }
        }
        
        /**
         * Internal use.
         */
        public class MouseProc extends MouseAdapter {
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseClicked(MouseEvent e) {
                if(totalBlockAllEvents != 0) {
                    return;
                }
                try {
                    if (e.getClickCount()==1) {
    /* Might be generated empty */
                }
                if (e.getClickCount()==2 
                        && e.getButton() == MouseEvent.BUTTON1) {
    /* Might be generated empty */
                }else if ((e.getModifiers()&InputEvent.BUTTON3_MASK)!=0) {
                
                /* Her kommer generert kode fra WindowBlock:PopupTrigger*/
                
                
                /* Her kommer generert kode for SimpleBlock:PopupTrigger*/
                

                
                /* Her kommer generert kode for SimpleBlock:PopupTrigger*/
                

                
                /* Her kommer generert kode for SimpleBlock:PopupTrigger*/
                

    /* Might be generated empty */
                }
            }catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }
    }

    /**
     * Internal use.
     */
    class ListSelectionProc implements GenovaSelectionListener {
        public void selectionChanged(GenovaSelectedEvent e) {
            if(totalBlockAllEvents != 0) {
                return;
            }
            try {
    /* Might be generated empty */
            }
    /* Might be generated empty */
            catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }
    }

    /**
     * Internal use.
     */
    class KeyProc implements KeyListener {
        public void keyTyped(KeyEvent e) {
            if(totalBlockAllEvents != 0) {
                return;
            }
            try {
    /* Might be generated empty */
            }
            catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }
        public void keyPressed(KeyEvent e) {
            if(totalBlockAllEvents != 0) {
                return;
            }
            try {
    /* Might be generated empty */
            }catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }
        public void keyReleased(KeyEvent e) {
            if(totalBlockAllEvents != 0) {
                return;
            }
            try {
                ItemProc ip = new ItemProc();
    /* Might be generated empty */
    if(false) { ip.getClass(); }
            }catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }
    }

    /**
     * Internal use.
     */
    class WindowProc extends GenovaWindowAdapter {
        public void dialogActivated(AWTEvent e) {
            try {
    /* Might be generated empty */
            }catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }
 
        public void dialogDeiconified(AWTEvent e) {
            try {
    /* Might be generated empty */
            }catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }

        public void dialogIconified(AWTEvent e) {
            try {
    /* Might be generated empty */
            }catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }

        public void dialogClosed(AWTEvent e) {
            // Unblock windows if the modal window is closed 
            controller.setModal(false);
            try {
            }catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }

        public void dialogClosing(AWTEvent e) {
            try {
        
        /* Her kommer generert kode fra WindowBlock:WindowClosing*/
        
        controller.application.setLastException(null);
        if (blockWindowEventsWindow == 0) {
            blockWindowEventsWindow++;
            controller.closeStudent(new GenovaWindowEventHolder(e));
            blockWindowEventsWindow--;
        }
    /* Might be generated empty */
            }catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }

        public void dialogDeactivated(AWTEvent e) {
            try {
    /* Might be generated empty */
            }catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }

        public void dialogOpened(AWTEvent e) {
            // not interessted in this event. In stead, 
            // we listen for a GenovaWindowEvent in the
            // GenovaWindowProc-class.
        }        
    }
    class GenovaWindowProc extends GenovaWindowAdapter {
        public void dialogVisible(GenovaWindowEvent e) {
        }
        public void dialogHidden(GenovaWindowEvent e) {
        }
    }
    /**
     * Internal use.
     */
    class ComponentProc implements ComponentListener {
        public void componentHidden(ComponentEvent e) {
            if(totalBlockAllEvents != 0) {
                return;
            }
            try {
    /* Might be generated empty */
            }catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }

        public void componentShown(ComponentEvent e) {
            try {
                if(totalBlockAllEvents != 0) {
                    return;
                }
    /* Might be generated empty */
            }catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }

        public void componentMoved(ComponentEvent e) {
            try {
                if(totalBlockAllEvents != 0) {
                    return;
                }
    /* Might be generated empty */
            }catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }

        public void componentResized(ComponentEvent e) {
            try {
                if(totalBlockAllEvents != 0) {
                    return;
                }
    /* Might be generated empty */
            }catch(Throwable t) {
                if(false) { e.getClass(); }
                exceptionHandler(t);
            }
        }
    }
    
    
    /* Not implemented for Internal Windows
     */
}
