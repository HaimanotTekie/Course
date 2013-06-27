// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package no.course.dialog.addstudentstocourse;

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
import no.course.domain.Course;
import no.course.domain.Student;
import no.course.domain.StudentCourse;


/**
 * Public class interpreting the generated view part of
 * AddStudentsToCourse. This class is generated and should not be edited
 * in. If any changes are needed, do them in AddStudentsToCourseView.
 */ 
@SuppressWarnings("all")
public abstract class AddStudentsToCourseDefaultView extends GenovaDialogFrame implements BottomWindow {
    
    boolean selectItemOK = true;
    
    AddStudentsToCourseDefaultController controller;
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
    JInternalFrame theAddStudentsToCourseInternalFrame = this;
    
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
    
    /** The CourseClass simple block */
    protected JPanel CourseClass = new JPanel();
    
    /** The CourseData simple block */
    protected JPanel CourseData = new JPanel();
    
    /** The CourseCodeLabel label */
    protected JLabel CourseCodeLabelLabel = new JLabel("Coursecode");
    GenovaTextField Course_code = new GenovaTextField("");
    final Object objectVersionOfCoursecode = Course_code;
    String oldValueCoursecode;
    
    /** The CourseIdLabel label */
    protected JLabel CourseIdLabelLabel = new JLabel("id");
    GenovaTextField Course_id = new GenovaTextField("");
    final Object objectVersionOfCourseid = Course_id;
    String oldValueCourseid;
    
    /** The isActive check box */
    protected GenovaCheckBox Course_isActive = new GenovaCheckBox("Active course");
    final Object objectVersionOfCourseisActive = Course_isActive;
    final int numberOfCharsCourseisActive = 0;
    
    int blockSelectedionEventCourseisActive = 0;
    
    void countUpBlocKSelectionEventCourseisActive() {
        blockSelectedionEventCourseisActive++;
    }
    void countDownBlocKSelectionEventCourseisActive() {
        blockSelectedionEventCourseisActive--;
    }
    
    String oldValueCourseisActive;
    
    /** The CourseNameLabel label */
    protected JLabel CourseNameLabelLabel = new JLabel("name");
    GenovaTextField Course_name = new GenovaTextField("");
    final Object objectVersionOfCoursename = Course_name;
    String oldValueCoursename;
    
    /** The CourseButton simple block */
    protected JPanel CourseButton = new JPanel();
    
    /* Her kommer generert kode for Button:Declaration*/
    
    JButton CourseClearButton;
    
    
    /* Her kommer generert kode for Button:Declaration*/
    
    JButton CourseSaveButton;
    
    
    /* Her kommer generert kode for Button:Declaration*/
    
    JButton CourseDeleteButton;
    
    
    /** The StudentCoursesClass simple block */
    protected JPanel StudentCoursesClass = new JPanel();
    
    /* Her kommer generert kode for Listblock:Declaration*/
    
    // View
    JPopupMenu activePopupMenuStudentCoursesList = null;
    JPanel StudentCoursesList = new JPanel();
    StudentCoursesListModel StudentCoursesListtheModel = null;
    GenovaTable StudentCoursesList_table = null;
    JScrollPane StudentCoursesList_pane = null;
    Color defaultBackgroundStudentCoursesList = null;
    Color defaultSelectedBackgroundStudentCoursesList = null;
    boolean hasCellSelectionColorStudentCoursesList = false;
    Vector StudentCoursesList_headers = new Vector();
    boolean StudentCoursesListHeadersClicked[];
    
    int StudentCoursesListblockStopEditing = 0;
    
    /** Used to keep track of values used in auto count when parsing the 
     * columns. If they are invis, then no columns is added... 
     */
    Vector StudentCoursesList_indexes = new Vector();
    
    GenovaTable StudentCoursesListRowHeader;
    ToolTipHeader  StudentCoursesListTableHeader;
    DefaultTableCellRenderer StudentCoursesListTableHeaderRenderer;
    DefaultTableModel StudentCoursesListHeaderModel;
    
    
    /**
     * Internal use. 
     * Sets the header properties for the listblock
     * @param c the header component.
     * @param table the listblock
     * @param value value of header
     * @param isSelected flag indicating the selected state
     * @param hasFocus flag indicating focus
     * @param row the row number
     * @param column the column number
     * @return the header
     */
    JComponent setHeaderPropsStudentCoursesList(JComponent c, JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        
        Border raised = BorderFactory.createBevelBorder(BevelBorder.RAISED);
        Border lowered = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        //        Border normal = BorderFactory.createEmptyBorder();
        
        if(false) { 
            row++; column++; hasFocus = !hasFocus; 
            isSelected = !isSelected; table.getClass();
            value.getClass();
            /* Silence eclipse */ 
        }
        RepositoryProxy.setFont(c,"Standard");
        c.setForeground(RepositoryProxy.getColorField("Black"));
        c.setBackground(RepositoryProxy.getColorField("TRANSPARENT"));
        if(StudentCoursesListHeadersClicked[column]) {                        
            c.setBorder(lowered);
        }else {
            c.setBorder(raised);
        }
        return c;
    }
    
    /** Internal use. Sets the listblock properties.
     * @param c the component 
     * @param data the data
     * @param table the table
     * @param value the value
     * @param isSelected the isSelected property
     * @param hasFocus the hasFocus property
     * @param row the row number
     * @param column the column number
     * @return the component.
     */
    Component setTablePropsStudentCoursesList(Component c, LineListblockStudentCoursesList data, JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){                              
        RepositoryProxy.setFont(c, "ListblockFont");
        Color deletedColor = RepositoryProxy.getColorField("ListblockLineDeletedColor");
        Color newColor = RepositoryProxy.getColorField("ListblockLineNewColor");
        Color changedColor = RepositoryProxy.getColorField("ListblockLineChangedColor");
        
        if(value instanceof JCheckBox) {
            ((JComponent)value).setBackground(table.getBackground());
        }
        if(!hasCellSelectionColorStudentCoursesList) {
            if(isSelected) {
                c.setBackground(defaultSelectedBackgroundStudentCoursesList);
            } else {
                c.setBackground(defaultBackgroundStudentCoursesList);
            }
            hasFocus = false;
        }
        
        if(data.isDeleted()) {
            c.setForeground(deletedColor);
        }else if(data.isNew()) {
            if(isSelected && !hasFocus && !(c instanceof JComboBox)) {
                c.setForeground(Color.white);
            }else {
                c.setForeground(newColor);
            }
        }else if(data.isChanged()) {
            if(isSelected && !hasFocus && !(c instanceof JComboBox)) {
                c.setForeground(Color.white);
            }else {
                c.setForeground(changedColor);
            }
        }else {
            if(isSelected && !hasFocus && !(c instanceof JComboBox)) {
                c.setForeground(Color.white);
            }else {
                if(hasFocus && c instanceof JComboBox) {
                    c.setForeground(Color.blue);
                }else {
                    c.setForeground(Color.black);
                }
            }
        }
        return c;
    }
    
    /** The StudentCoursesList_widths vector */
    protected Vector StudentCoursesList_widths = new Vector();
    GenovaTextField studentCourses_id = new GenovaTextField("");
    final Object objectVersionOfstudentCoursesid = studentCourses_id;
    String oldValuestudentCoursesid;
    
    /* Her kommer generert kode for ListColumn:Declaration*/
    
    TableColumn StudentCoursesListstudentCoursesidColumn;
    GenovaTextField student_age = new GenovaTextField("");
    final Object objectVersionOfstudentage = student_age;
    String oldValuestudentage;
    
    /* Her kommer generert kode for ListColumn:Declaration*/
    
    TableColumn StudentCoursesListstudentageColumn;
    GenovaTextField student_id = new GenovaTextField("");
    final Object objectVersionOfstudentid = student_id;
    String oldValuestudentid;
    
    /* Her kommer generert kode for ListColumn:Declaration*/
    
    TableColumn StudentCoursesListstudentidColumn;
    GenovaTextField student_name = new GenovaTextField("");
    final Object objectVersionOfstudentname = student_name;
    String oldValuestudentname;
    
    /* Her kommer generert kode for ListColumn:Declaration*/
    
    TableColumn StudentCoursesListstudentnameColumn;
    GenovaTextField student_studentNr = new GenovaTextField("");
    final Object objectVersionOfstudentstudentNr = student_studentNr;
    String oldValuestudentstudentNr;
    
    /* Her kommer generert kode for ListColumn:Declaration*/
    
    TableColumn StudentCoursesListstudentstudentNrColumn;
    
    /* Her kommer generert kode for Button:Declaration*/
    
    JButton SaveStudentCourse;
    
    
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
    public AddStudentsToCourseDefaultView(final AddStudentsToCourseDefaultController controller, GenovaEnums applicationEnums) {
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
        
        setTitle("Course");
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
        nameToComponent.put("CourseClass", CourseClass);
        componentToName.put(CourseClass, "CourseClass");
        nameToComponent.put("CourseData", CourseData);
        componentToName.put(CourseData, "CourseData");
        nameToComponent.put("CourseCodeLabel", CourseCodeLabelLabel);
        componentToName.put(CourseCodeLabelLabel, "CourseCodeLabel");
        nameToComponent.put("Course.code", Course_code);
        componentToName.put(Course_code, "Course.code");
        nameToComponent.put("CourseIdLabel", CourseIdLabelLabel);
        componentToName.put(CourseIdLabelLabel, "CourseIdLabel");
        nameToComponent.put("Course.id", Course_id);
        componentToName.put(Course_id, "Course.id");
        nameToComponent.put("Course.isActive", Course_isActive);
        componentToName.put(Course_isActive, "Course.isActive");
        nameToComponent.put("CourseNameLabel", CourseNameLabelLabel);
        componentToName.put(CourseNameLabelLabel, "CourseNameLabel");
        nameToComponent.put("Course.name", Course_name);
        componentToName.put(Course_name, "Course.name");
        nameToComponent.put("CourseButton", CourseButton);
        componentToName.put(CourseButton, "CourseButton");
        nameToComponent.put("CourseClearButton", CourseClearButton);
        componentToName.put(CourseClearButton, "CourseClearButton");
        nameToComponent.put("CourseSaveButton", CourseSaveButton);
        componentToName.put(CourseSaveButton, "CourseSaveButton");
        nameToComponent.put("CourseDeleteButton", CourseDeleteButton);
        componentToName.put(CourseDeleteButton, "CourseDeleteButton");
        nameToComponent.put("StudentCoursesClass", StudentCoursesClass);
        componentToName.put(StudentCoursesClass, "StudentCoursesClass");
        nameToComponent.put("StudentCoursesList", StudentCoursesList_table);
        componentToName.put(StudentCoursesList_table, "StudentCoursesList");
        nameToComponent.put("studentCourses.id", studentCourses_id);
        componentToName.put(studentCourses_id, "studentCourses.id");
        nameToComponent.put("student.age", student_age);
        componentToName.put(student_age, "student.age");
        nameToComponent.put("student.id", student_id);
        componentToName.put(student_id, "student.id");
        nameToComponent.put("student.name", student_name);
        componentToName.put(student_name, "student.name");
        nameToComponent.put("student.studentNr", student_studentNr);
        componentToName.put(student_studentNr, "student.studentNr");
        nameToComponent.put("SaveStudentCourse", SaveStudentCourse);
        componentToName.put(SaveStudentCourse, "SaveStudentCourse");
    }
    private void initFocusActions() {
        Course_code.addValueChangedListener(new GenovaValueChangedListener() {
            public void valueChanged(GenovaValueChangedEvent e) {
                controller.application.setLastException(null);
                controller.findCourse(e);
            }
        });
        studentCourses_id.addValueChangedListener(new GenovaValueChangedListener() {
            public void valueChanged(GenovaValueChangedEvent e) {
                controller.application.setLastException(null);
                controller.findStudentCourse(e);
            }
        });
        student_id.addValueChangedListener(new GenovaValueChangedListener() {
            public void valueChanged(GenovaValueChangedEvent e) {
                controller.application.setLastException(null);
                controller.findStudent(e);
            }
        });
        student_studentNr.addValueChangedListener(new GenovaValueChangedListener() {
            public void valueChanged(GenovaValueChangedEvent e) {
                controller.application.setLastException(null);
                controller.findStudent(e);
            }
        });
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
    int listblockStudentCoursesList = 0;
/** Increases blocking count for the listblock StudentCoursesList. Internal use only. */
    void increaseListblockStudentCoursesList() {
        debug(++listblockStudentCoursesList, "U:listblockStudentCoursesList");
    }
/** Decreases blocking count for the listblock StudentCoursesList. Internal use only.  */
    void decreaseListblockStudentCoursesList() {
        debug(--listblockStudentCoursesList, "U:listblockStudentCoursesList");
    }
/** Returns true if listblock is blocking events. Internal use only.
 * @return True if listblock is blocking events.
 */
    boolean isBlockedListblockStudentCoursesList() {
        return listblockStudentCoursesList == 0;
    }
    int listblockValueChangedStudentCoursesList = 0;     
/** Internal use. */
    void increaseListblockVCStudentCoursesList() {
        debug(++listblockValueChangedStudentCoursesList, "U:listblockValueChangedStudentCoursesList");
    }
/** Internal use */
    void decreaseListblockVCStudentCoursesList() {
        debug(--listblockValueChangedStudentCoursesList, "U:listblockValueChangedStudentCoursesList");
    }
/** Internal use
 * @return Internal use.
 */
    boolean isBlockedListblockVCStudentCoursesList() {
        return listblockValueChangedStudentCoursesList == 0;
    }
    }
    Blocker block = new Blocker();
    
     /** Initializes the Window window block */
    private void initWindow() {
        Window_outer.setPreferredSize(new Dimension(823, 355));
        RepositoryProxy.setForegroundColor(Window,"Black");
        RepositoryProxy.setFont(Window,"Standard");
        Window_outer.setLayout(null);
        Window_outer.add(Window);   
        Window.setLocation(0,0);
        Window.setSize(823, 355);
        Window.setLayout(null);
        
        addInternalFrameListener(windowProc);
        addGenovaWindowListener(genovaWindowProc);
        initToolbar();
        initCourseClass();
        initStudentCoursesClass();
    }
    
    /** Initializes the Toolbar toolbar */
    private void initToolbar() {
        setGenovaToolBar(Toolbar);
    }
    
    /** Initializes the CourseClass container */
    private void initCourseClass() {
        Window.add(CourseClass);
        CourseClass.setLocation(11+0,11+0);
        CourseClass.setSize(489, 122);
        RepositoryProxy.setBorder(CourseClass,2,"Course");
        RepositoryProxy.setForegroundColor(CourseClass,"Black");
        RepositoryProxy.setFont(CourseClass,"Standard");
        CourseClass.setLayout(null);
        
        initCourseData();
        initCourseButton();
    }
    
    /** Initializes the CourseData container */
    private void initCourseData() {
        CourseClass.add(CourseData);
        CourseData.setLocation(14+3,17+10);
        CourseData.setSize(426, 50);
        RepositoryProxy.setBorder(CourseData,1,"Course");
        RepositoryProxy.setForegroundColor(CourseData,"Black");
        RepositoryProxy.setFont(CourseData,"Standard");
        CourseData.setLayout(null);
        
        initCourseCodeLabelLabel();
        initCourse_code();
        initCourseIdLabelLabel();
        initCourse_id();
        initCourse_isActive();
        initCourseNameLabelLabel();
        initCourse_name();
    }
    
    /** Initializes the CourseButton container */
    private void initCourseButton() {
        CourseClass.add(CourseButton);
        CourseButton.setLocation(451+3,17+10);
        CourseButton.setSize(24, 78);
        RepositoryProxy.setBorder(CourseButton,1,"Course");
        RepositoryProxy.setForegroundColor(CourseButton,"Black");
        RepositoryProxy.setFont(CourseButton,"Standard");
        CourseButton.setLayout(null);
        
        initCourseClearButton();
        initCourseSaveButton();
        initCourseDeleteButton();
    }
    
    /** Initializes the StudentCoursesClass container */
    private void initStudentCoursesClass() {
        Window.add(StudentCoursesClass);
        StudentCoursesClass.setLocation(11+0,139+0);
        StudentCoursesClass.setSize(801, 205);
        RepositoryProxy.setBorder(StudentCoursesClass,2,"studentCourses");
        RepositoryProxy.setForegroundColor(StudentCoursesClass,"Black");
        RepositoryProxy.setFont(StudentCoursesClass,"Standard");
        StudentCoursesClass.setLayout(null);
        
        initStudentCoursesList();
        initSaveStudentCourse();
    }
    
    /** Initializes the StudentCoursesList container */
    private void initStudentCoursesList() {
        initstudentCourses_id();
        initstudent_age();
        initstudent_id();
        initstudent_name();
        initstudent_studentNr();
        
        /* Her kommer generert kode for Listblock:StudentCoursesListSetup*/
        
        StudentCoursesListtheModel = new StudentCoursesListModel(controller);
        StudentCoursesList_table = new GenovaTable(StudentCoursesListtheModel, "StudentCoursesList", controller.listblockMethodsStudentCoursesList) {
            /** Internal use.
             * @param row Internal use.
             * @param column Internal use.
             * @return Internal use.
             */
            public TableCellEditor getCellEditor(int row, int column) {
                if(column < 0 || row < 0) {
                    return null;
                }
                LineListblockStudentCoursesList line = controller.listblockMethodsStudentCoursesList.getListblockLinePrivate(row);
                if (line == null) {
                    return null;
                }
                Object ob = line.getCellObject(column);
                if(ob != null && ob instanceof JCheckBox) {
                    return new DefaultCellEditor((JCheckBox)ob);
                }
                TableCellEditor t = super.getCellEditor(row, column);
                if(t instanceof DefaultCellEditor) {
                    DefaultCellEditor tx = (DefaultCellEditor)t;
                    Component c = tx.getComponent();
                    if(c instanceof JTextComponent){
                        int convertedColumn = ((Integer)StudentCoursesList_indexes.elementAt(column)).intValue();
                        // commented out as part of bug fix, 11. 5, 2006
                        // setDatatypeStudentCoursesList((JTextComponent)((DefaultCellEditor)t).getComponent(),convertedColumn);
                    } /* else if (c instanceof GenovaComboBox) {
                        syncComboboxSelection((GenovaComboBox)c, row);
                    } */
                }
                return t;
            }
        };

        StudentCoursesList_table.addVetoableSelectionListener
                (new GenovaVetoableSelectionListener() {

                    /**
                     * Helper method. Returns the
                     * set of Strings containing the
                     * foreign nodes names to check. The
                     * contents of the set is decided by the
                     * listblockMethodsStudentCoursesList's checkForeignNodes
                     * method.
                     */
                    private Set getForeignNodes() {
                        Set foreignNodes = null;
                        if (controller.listblockMethodsStudentCoursesList
                                .checkForeignNodes()) {
                            foreignNodes = new HashSet();
                            foreignNodes.addAll(controller
                                    .listblockMethodsStudentCoursesList
                                            .getRoleNamesInUse());
                            foreignNodes.remove(controller
                                    .thestudentCourses.getRoleName());
                            foreignNodes.removeAll(controller
                                    .thestudentCourses.getAllChildNames());
                        }
                        return foreignNodes;
                    }

                    public void vetoableSelectionChange
                            (GenovaVetoableSelectionEvent e) {
                        if (!controller.thestudentCourses.checkRowSelection(e.getOldSelection(), e.getNewSelection(), getForeignNodes())) {
                            e.veto(true);
                        }
                    }
                });
        
        StudentCoursesList_table.addMouseListener(mouseProc);
        defaultBackgroundStudentCoursesList =  StudentCoursesList_table.getBackground();
        defaultSelectedBackgroundStudentCoursesList = StudentCoursesList_table.getSelectionBackground();
        
        /* This one activates popup for the table */
        StudentCoursesList_table.addKeyListener(new KeyAdapter() {
                /** 
                 * Internal use.
                 * @param evt Internal use.
                 */
            public void keyPressed(KeyEvent evt) {
                JTable table = (JTable)evt.getSource();
                int row = table.getSelectedRow();
                int col = table.getSelectedColumn();
                table.getCellEditor(row, col);
            }
            
            /** 
             * Internal use.
             * @param evt
             */
            public void keyReleased(KeyEvent evt) {
                JTable table = (JTable)evt.getSource();
                if (evt.getKeyChar() == ' ') {
                    int row = table.getSelectedRow();
                    int col = table.getSelectedColumn();
                    Object dce = table.getCellEditor(row, col);
                    if(dce != null && dce instanceof JComponentCellEditor) {
                        Component comp = ((JComponentCellEditor)dce).getComponent();
                        if(comp instanceof JComboBox) {
                            JComboBox cbo = (JComboBox) comp; 
                            cbo.setVisible(true); 
                            cbo.requestFocus();
                            cbo.showPopup();
                        }
                    }
                }
            }
        });
        controller.tabListFromNodeNameStudentCoursesClass.put("StudentCoursesList", StudentCoursesList_table);
        controller.tabListFromComponentStudentCoursesClass.put(StudentCoursesList_table, "StudentCoursesList");
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetup*/
        
        StudentCoursesList_headers.addElement("id");
        StudentCoursesList_widths.addElement(new Integer(145));
        StudentCoursesList_indexes.add(new Integer(0));
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetup*/
        
        StudentCoursesList_headers.addElement("age");
        StudentCoursesList_widths.addElement(new Integer(145));
        StudentCoursesList_indexes.add(new Integer(1));
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetup*/
        
        StudentCoursesList_headers.addElement("id");
        StudentCoursesList_widths.addElement(new Integer(145));
        StudentCoursesList_indexes.add(new Integer(2));
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetup*/
        
        StudentCoursesList_headers.addElement("name");
        StudentCoursesList_widths.addElement(new Integer(152));
        StudentCoursesList_indexes.add(new Integer(3));
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetup*/
        
        StudentCoursesList_headers.addElement("studentNr");
        StudentCoursesList_widths.addElement(new Integer(145));
        StudentCoursesList_indexes.add(new Integer(4));
        
        /* Her kommer generert kode for Listblock:StudentCoursesListSetupNearEnd*/
        
        StudentCoursesList_table.createDefaultColumnsFromModel();
        StudentCoursesListHeadersClicked = new boolean[StudentCoursesList_table.getColumnCount()];
        StudentCoursesListTableHeader = new ToolTipHeader( StudentCoursesList_table.getTableHeader().getColumnModel());
        StudentCoursesList_table.setTableHeader(StudentCoursesListTableHeader);
        
        StudentCoursesListTableHeaderRenderer = new DefaultTableCellRenderer() {
            /** Internal use.
             * @param table Internal use.
             * @param value Internal use. 
             * @param isSelected Internal use.
             * @param hasFocus Internal use.
             * @param row Internal use.
             * @param column Internal use.
             * @return Internal use.
             */
            public Component getTableCellRendererComponent(JTable table, Object value, 
                boolean isSelected, boolean hasFocus, int row, int column) {
                    JComponent c = (JComponent)super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    return setHeaderPropsStudentCoursesList(c, table, value, isSelected, hasFocus, row, column);
                }
            };
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetupEnd*/
        
        StudentCoursesListstudentCoursesidColumn = StudentCoursesList_table.getColumnModel().getColumn(StudentCoursesList_indexes.indexOf(new Integer(0)));
        StudentCoursesListstudentCoursesidColumn.setHeaderRenderer(StudentCoursesListTableHeaderRenderer);
        {
            JTextField field = new JTextField();
            StudentCoursesListstudentCoursesidColumn.setCellEditor(new DefaultCellEditor(field));
            field.setHorizontalAlignment(JTextField.LEFT);
        }
        StudentCoursesListstudentCoursesidColumn.setCellRenderer(
                new GenovaTableCellRenderer(RepositoryProxy.getDocument(
                        2, 0,
                        controller.getApplication().getEnums(),
                        null,
                        FormatHelper.getDisplayrule(2,
                                "", 11,
                                0, 0),
                        11, false), JTextField.LEFT));
        ((GenovaTableCellRenderer)(StudentCoursesListstudentCoursesidColumn.getCellRenderer())).setToolTipText("");
                    RepositoryProxy.setFont(studentCourses_id, "ListblockFont");
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetupEnd*/
        
        StudentCoursesListstudentageColumn = StudentCoursesList_table.getColumnModel().getColumn(StudentCoursesList_indexes.indexOf(new Integer(1)));
        StudentCoursesListstudentageColumn.setHeaderRenderer(StudentCoursesListTableHeaderRenderer);
        {
            JTextField field = new JTextField();
            StudentCoursesListstudentageColumn.setCellEditor(new DefaultCellEditor(field));
            field.setHorizontalAlignment(JTextField.LEFT);
        }
        StudentCoursesListstudentageColumn.setCellRenderer(
                new GenovaTableCellRenderer(RepositoryProxy.getDocument(
                        2, 0,
                        controller.getApplication().getEnums(),
                        null,
                        FormatHelper.getDisplayrule(2,
                                "", 11,
                                0, 0),
                        11, false), JTextField.LEFT));
        ((GenovaTableCellRenderer)(StudentCoursesListstudentageColumn.getCellRenderer())).setToolTipText("");
                    RepositoryProxy.setFont(student_age, "ListblockFont");
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetupEnd*/
        
        StudentCoursesListstudentidColumn = StudentCoursesList_table.getColumnModel().getColumn(StudentCoursesList_indexes.indexOf(new Integer(2)));
        StudentCoursesListstudentidColumn.setHeaderRenderer(StudentCoursesListTableHeaderRenderer);
        {
            JTextField field = new JTextField();
            StudentCoursesListstudentidColumn.setCellEditor(new DefaultCellEditor(field));
            field.setHorizontalAlignment(JTextField.LEFT);
        }
        StudentCoursesListstudentidColumn.setCellRenderer(
                new GenovaTableCellRenderer(RepositoryProxy.getDocument(
                        2, 0,
                        controller.getApplication().getEnums(),
                        null,
                        FormatHelper.getDisplayrule(2,
                                "", 11,
                                0, 0),
                        11, false), JTextField.LEFT));
        ((GenovaTableCellRenderer)(StudentCoursesListstudentidColumn.getCellRenderer())).setToolTipText("");
                    RepositoryProxy.setFont(student_id, "ListblockFont");
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetupEnd*/
        
        StudentCoursesListstudentnameColumn = StudentCoursesList_table.getColumnModel().getColumn(StudentCoursesList_indexes.indexOf(new Integer(3)));
        StudentCoursesListstudentnameColumn.setHeaderRenderer(StudentCoursesListTableHeaderRenderer);
        {
            JTextField field = new JTextField();
            StudentCoursesListstudentnameColumn.setCellEditor(new DefaultCellEditor(field));
            field.setHorizontalAlignment(JTextField.LEFT);
        }
        StudentCoursesListstudentnameColumn.setCellRenderer(
                new GenovaTableCellRenderer(RepositoryProxy.getDocument(
                        7, 0,
                        controller.getApplication().getEnums(),
                        null,
                        FormatHelper.getDisplayrule(7,
                                "", 0,
                                0, 0),
                        0, false), JTextField.LEFT));
        ((GenovaTableCellRenderer)(StudentCoursesListstudentnameColumn.getCellRenderer())).setToolTipText("");
                    RepositoryProxy.setFont(student_name, "ListblockFont");
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetupEnd*/
        
        StudentCoursesListstudentstudentNrColumn = StudentCoursesList_table.getColumnModel().getColumn(StudentCoursesList_indexes.indexOf(new Integer(4)));
        StudentCoursesListstudentstudentNrColumn.setHeaderRenderer(StudentCoursesListTableHeaderRenderer);
        {
            JTextField field = new JTextField();
            StudentCoursesListstudentstudentNrColumn.setCellEditor(new DefaultCellEditor(field));
            field.setHorizontalAlignment(JTextField.LEFT);
        }
        StudentCoursesListstudentstudentNrColumn.setCellRenderer(
                new GenovaTableCellRenderer(RepositoryProxy.getDocument(
                        2, 0,
                        controller.getApplication().getEnums(),
                        null,
                        FormatHelper.getDisplayrule(2,
                                "", 11,
                                0, 0),
                        11, false), JTextField.LEFT));
        ((GenovaTableCellRenderer)(StudentCoursesListstudentstudentNrColumn.getCellRenderer())).setToolTipText("");
                    RepositoryProxy.setFont(student_studentNr, "ListblockFont");
        
        /* Her kommer generert kode for Listblock:StudentCoursesListSetupHeader*/
        
        List headerToolTipStrings = new LinkedList();
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetupHeader*/
        
        headerToolTipStrings.add("");
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetupHeader*/
        
        headerToolTipStrings.add("");
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetupHeader*/
        
        headerToolTipStrings.add("");
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetupHeader*/
        
        headerToolTipStrings.add("");
        
        /* Her kommer generert kode for ListColumn:StudentCoursesListSetupHeader*/
        
        headerToolTipStrings.add("");
        
        /* Her kommer generert kode for Listblock:StudentCoursesListSetupHeaderEnd*/
        
        StudentCoursesListTableHeader.setToolTipStrings(headerToolTipStrings);
        DefaultTableCellRenderer tableCellRendererRIGHTStudentCoursesList = new DefaultTableCellRenderer() {
            /** Internal use.
             * @param table Internal use.
             * @param value Internal use.
             * @param isSelected Internal use.
             * @param hasFocus Internal use.
             * @param row Internal use.
             * @param column Internal use.
             * @return Internal use.
             */
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);  
                LineListblockStudentCoursesList data = controller.listblockMethodsStudentCoursesList.getListblockLinePrivate(row);
                return setTablePropsStudentCoursesList(c, data, table, value, isSelected, hasFocus, row, column);
            }
        };
        
        DefaultTableCellRenderer tableCellRendererLEFTStudentCoursesList = new DefaultTableCellRenderer() {
            /** Internal use.
             * @param table Internal use.
             * @param value Internal use.
             * @param isSelected Internal use.
             * @param hasFocus Internal use.
             * @param row Internal use.
             * @param column Internal use.
             * @return Internal use.
             */
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);  
                LineListblockStudentCoursesList data = controller.listblockMethodsStudentCoursesList.getListblockLinePrivate(row);
                return setTablePropsStudentCoursesList(c, data, table, value, isSelected, hasFocus, row, column);
            }
        };
        
        DefaultTableCellRenderer tableCellRendererCENTERStudentCoursesList = new DefaultTableCellRenderer() {
            /** Internal use.
             * @param table Internal use.
             * @param value Internal use.
             * @param isSelected Internal use.
             * @param hasFocus Internal use.
             * @param row Internal use.
             * @param column Internal use.
             * @return Internal use.
             */
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);  
                LineListblockStudentCoursesList data = controller.listblockMethodsStudentCoursesList.getListblockLinePrivate(row);
                return setTablePropsStudentCoursesList(c, data, table, value, isSelected, hasFocus, row, column);
            }
        };
        
        tableCellRendererLEFTStudentCoursesList.setHorizontalAlignment(SwingConstants.LEFT);
        StudentCoursesList_table.setDefaultRenderer( String.class, tableCellRendererLEFTStudentCoursesList);
        tableCellRendererRIGHTStudentCoursesList.setHorizontalAlignment(SwingConstants.RIGHT);
        tableCellRendererCENTERStudentCoursesList.setHorizontalAlignment(SwingConstants.CENTER);
        StudentCoursesList_table.setDefaultRenderer( Integer.class, tableCellRendererRIGHTStudentCoursesList);
        StudentCoursesList_table.setDefaultRenderer( Float.class, tableCellRendererRIGHTStudentCoursesList);
        StudentCoursesList_table.setDefaultRenderer( Double.class, tableCellRendererRIGHTStudentCoursesList);
        StudentCoursesList_table.setDefaultRenderer( Short.class, tableCellRendererRIGHTStudentCoursesList);
        StudentCoursesList_table.setDefaultRenderer( Long.class, tableCellRendererRIGHTStudentCoursesList);
        //StudentCoursesList_table.setDefaultRenderer( Boolean.class, tableCellRendererRIGHTStudentCoursesList);
        StudentCoursesList_table.setDefaultRenderer( Character.class, tableCellRendererRIGHTStudentCoursesList);
        
        StudentCoursesListTableHeaderRenderer.setHorizontalAlignment(SwingConstants.LEFT);       
        StudentCoursesListTableHeader.setReorderingAllowed(false);
        
        StudentCoursesList_pane = new JScrollPane(StudentCoursesList_table);  
                     modifyScrollPane(StudentCoursesList_pane);
        StudentCoursesList.add(StudentCoursesList_pane);
        StudentCoursesList.setLayout(null);
        StudentCoursesClass.add(StudentCoursesList);
        StudentCoursesList.setLocation(14+3,17+10);
        StudentCoursesList.setSize(738, 161);
        StudentCoursesList_pane.setLocation(0,0);
        StudentCoursesList_pane.setSize(738, 120);
        StudentCoursesList_pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        StudentCoursesList_table.setPreferredScrollableViewportSize(new Dimension(738, 120));
        StudentCoursesList_table.setScrollPaneInUse(StudentCoursesList_pane);
        StudentCoursesList_pane.getHorizontalScrollBar().getComponent(0).setBackground(RepositoryProxy.getColorField("TRANSPARENT"));
        StudentCoursesList_pane.getVerticalScrollBar().getComponent(0).setBackground(RepositoryProxy.getColorField("TRANSPARENT"));
        StudentCoursesList_pane.getHorizontalScrollBar().getComponent(1).setBackground(RepositoryProxy.getColorField("TRANSPARENT"));
        StudentCoursesList_pane.getVerticalScrollBar().getComponent(1).setBackground(RepositoryProxy.getColorField("TRANSPARENT"));
        RepositoryProxy.setForegroundColor(StudentCoursesList_pane.getViewport(),"Black");
        
        StudentCoursesList_table.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // adds a selection listener that displays the selected line in the edit field.
        StudentCoursesList_table.addGenovaSelectionListener(new GenovaSelectionListener() {

           public void selectionChanged(GenovaSelectedEvent e) {
                ListblockLine selected = controller.listblockMethodsStudentCoursesList
                        .getSelectedLineObject();
                if (selected != null) {
                    selected.displayInEditField();
                } else {
                    controller.listblockMethodsStudentCoursesList.clearEditFields();
                }
            }
        });
        
        //View
        RepositoryProxy.setForegroundColor(StudentCoursesList,"Black");
        RepositoryProxy.setFont(StudentCoursesList,"Standard");
        for(int i=0; i < StudentCoursesListtheModel.getColumnCount();i++) {
            TableColumn column = StudentCoursesList_table.getColumnModel().getColumn(i);
            column.setPreferredWidth(((Integer)StudentCoursesList_widths.elementAt(i)).intValue());
        }
        MouseAdapter listMouseListenerStudentCoursesList = new MouseAdapter() {
            /** Internal use.
             * @param e Internal use.
             */
            public void mouseClicked(MouseEvent e) {
                TableColumnModel columnModel = StudentCoursesList_table.getColumnModel();
                int viewColumn = columnModel.getColumnIndexAtX(e.getX());
                int column = StudentCoursesList_table.convertColumnIndexToModel(viewColumn);
                if (e.getClickCount() == 1 && column != -1) {
                    controller.listblockMethodsStudentCoursesList.listblockSortColumnsBy(column);
                }
            }
        };
        StudentCoursesList_table.setColumnSelectionAllowed(false);
        StudentCoursesListTableHeader.addMouseListener(listMouseListenerStudentCoursesList);
        StudentCoursesListTableHeader.addMouseListener(mouseProc);
        StudentCoursesListTableHeader.addFocusListener(focusProc);
    }
// ABABAB
// Dette er starten {
    private void initStudentCoursesListCellEditors() {
        TableColumnModel columnModel = 
                StudentCoursesList_table.getColumnModel();
        int colIndex;
        TableColumn column;
        if (controller.listblockMethodsStudentCoursesList.
                hasColumn("studentCourses.id")) {         
            colIndex = controller.listblockMethodsStudentCoursesList
                    .getColumnIndex("studentCourses.id"); 
            column = columnModel.getColumn(colIndex);
            column.setCellEditor(new no.genova.client.component.GDefaultCellEditor
                     (studentCourses_id));
           if ((Object) studentCourses_id instanceof JCheckBox) {
               studentCourses_id.setHorizontalAlignment(SwingConstants.CENTER);
           }
        }
        if (controller.listblockMethodsStudentCoursesList.
                hasColumn("student.age")) {         
            colIndex = controller.listblockMethodsStudentCoursesList
                    .getColumnIndex("student.age"); 
            column = columnModel.getColumn(colIndex);
            column.setCellEditor(new no.genova.client.component.GDefaultCellEditor
                     (student_age));
           if ((Object) student_age instanceof JCheckBox) {
               student_age.setHorizontalAlignment(SwingConstants.CENTER);
           }
        }
        if (controller.listblockMethodsStudentCoursesList.
                hasColumn("student.id")) {         
            colIndex = controller.listblockMethodsStudentCoursesList
                    .getColumnIndex("student.id"); 
            column = columnModel.getColumn(colIndex);
            column.setCellEditor(new no.genova.client.component.GDefaultCellEditor
                     (student_id));
           if ((Object) student_id instanceof JCheckBox) {
               student_id.setHorizontalAlignment(SwingConstants.CENTER);
           }
        }
        if (controller.listblockMethodsStudentCoursesList.
                hasColumn("student.name")) {         
            colIndex = controller.listblockMethodsStudentCoursesList
                    .getColumnIndex("student.name"); 
            column = columnModel.getColumn(colIndex);
            column.setCellEditor(new no.genova.client.component.GDefaultCellEditor
                     (student_name));
           if ((Object) student_name instanceof JCheckBox) {
               student_name.setHorizontalAlignment(SwingConstants.CENTER);
           }
        }
        if (controller.listblockMethodsStudentCoursesList.
                hasColumn("student.studentNr")) {         
            colIndex = controller.listblockMethodsStudentCoursesList
                    .getColumnIndex("student.studentNr"); 
            column = columnModel.getColumn(colIndex);
            column.setCellEditor(new no.genova.client.component.GDefaultCellEditor
                     (student_studentNr));
           if ((Object) student_studentNr instanceof JCheckBox) {
               student_studentNr.setHorizontalAlignment(SwingConstants.CENTER);
           }
        }
         // Method might not do anything - silence code checkers.
        if (false && (columnModel == null 
                      || colIndex == -1
                      || column == null)) {
            colIndex++;
        }                 
    }
    /**
     * Initializes the CourseCodeLabel label */
    private void initCourseCodeLabelLabel() {
        CourseData.add(CourseCodeLabelLabel);
        CourseCodeLabelLabel.setLocation(0+0,0+0); 
        CourseCodeLabelLabel.setSize(68, 17);
        RepositoryProxy.setForegroundColor(CourseCodeLabelLabel,"Black");
        RepositoryProxy.setFont(CourseCodeLabelLabel,"Standard");
    }
    
    /** Initializes the Course.code text component */
    private void initCourse_code() {
        Course_code.setName("Course.code");
        CourseData.add(Course_code);
        Course_code.setLocation(73+0,0+0);
        { // limit scope of width and height declarations.
            int width = 152;
            int height = 22;
            Course_code.setSize(width, height);
            if (width == 0 && height == 0) {
                Course_code.setFocusable(false);
            }
        } // end limit scope
        
        controller.tabListFromNodeNameCourseData.put("Course.code", Course_code);
        controller.tabListFromComponentCourseData.put(Course_code, "Course.code");
        
           //   Course_code.setEditable(true);
        Course_code.setEditable(true);
        
        //Course_code.setVisible(false || true);
        //
        Course_code.setInputJustification(JTextField.LEFT);
        Course_code.setOutputJustification(JTextField.LEFT);
        Course_code.setHorizontalAlignment(JTextField.LEFT);
        Course_code.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(7, Course_code, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(7,"",0,0,0),0,false);
        RepositoryProxy.setForegroundColor(Course_code,"Black");
        RepositoryProxy.setFont(Course_code,"Standard");
        
        Course_code.addKeyListener(keyProc);
        
    }
    /**
     * Initializes the CourseIdLabel label */
    private void initCourseIdLabelLabel() {
        CourseData.add(CourseIdLabelLabel);
        CourseIdLabelLabel.setLocation(236+0,0+0); 
        CourseIdLabelLabel.setSize(11, 17);
        RepositoryProxy.setForegroundColor(CourseIdLabelLabel,"Black");
        RepositoryProxy.setFont(CourseIdLabelLabel,"Standard");
    }
    
    /** Initializes the Course.id text component */
    private void initCourse_id() {
        Course_id.setName("Course.id");
        CourseData.add(Course_id);
        Course_id.setLocation(274+0,0+0);
        { // limit scope of width and height declarations.
            int width = 145;
            int height = 22;
            Course_id.setSize(width, height);
            if (width == 0 && height == 0) {
                Course_id.setFocusable(false);
            }
        } // end limit scope
        
        controller.tabListFromNodeNameCourseData.put("Course.id", Course_id);
        controller.tabListFromComponentCourseData.put(Course_id, "Course.id");
        
           //   Course_id.setEditable(true);
        Course_id.setEditable(true);
        
        //Course_id.setVisible(false || true);
        //
        Course_id.setInputJustification(JTextField.LEFT);
        Course_id.setOutputJustification(JTextField.LEFT);
        Course_id.setHorizontalAlignment(JTextField.LEFT);
        Course_id.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(2, Course_id, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
        RepositoryProxy.setForegroundColor(Course_id,"Black");
        RepositoryProxy.setFont(Course_id,"Standard");
        
        // No Listener
        
    }
    
    /** Initializes the Course_isActive check button */
    private void initCourse_isActive() {
        controller.tabListFromNodeNameCourseData.put("Course.isActive", Course_isActive);
        controller.tabListFromComponentCourseData.put(Course_isActive, "Course.isActive");
        
        CourseData.add(Course_isActive);
        Course_isActive.setLocation(73+0,28+0);
        { // limit scope of width and height declarations.
            int width = 94;
            int height = 16;
            Course_isActive.setSize(width, height);
            if (width == 0 && height == 0) {
                Course_isActive.setFocusable(false);
            }
        } // end limit scope
        RepositoryProxy.setForegroundColor(Course_isActive,"Black");
        RepositoryProxy.setFont(Course_isActive,"Standard");
        
        
        if(false) {
            Course_isActive.addItemListener(itemProc);
        }
    }
    /**
     * Initializes the CourseNameLabel label */
    private void initCourseNameLabelLabel() {
        CourseData.add(CourseNameLabelLabel);
        CourseNameLabelLabel.setLocation(236+0,28+0); 
        CourseNameLabelLabel.setSize(33, 17);
        RepositoryProxy.setForegroundColor(CourseNameLabelLabel,"Black");
        RepositoryProxy.setFont(CourseNameLabelLabel,"Standard");
    }
    
    /** Initializes the Course.name text component */
    private void initCourse_name() {
        Course_name.setName("Course.name");
        CourseData.add(Course_name);
        Course_name.setLocation(274+0,28+0);
        { // limit scope of width and height declarations.
            int width = 152;
            int height = 22;
            Course_name.setSize(width, height);
            if (width == 0 && height == 0) {
                Course_name.setFocusable(false);
            }
        } // end limit scope
        
        controller.tabListFromNodeNameCourseData.put("Course.name", Course_name);
        controller.tabListFromComponentCourseData.put(Course_name, "Course.name");
        
           //   Course_name.setEditable(true);
        Course_name.setEditable(true);
        
        //Course_name.setVisible(false || true);
        //
        Course_name.setInputJustification(JTextField.LEFT);
        Course_name.setOutputJustification(JTextField.LEFT);
        Course_name.setHorizontalAlignment(JTextField.LEFT);
        Course_name.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(7, Course_name, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(7,"",0,0,0),0,false);
        RepositoryProxy.setForegroundColor(Course_name,"Black");
        RepositoryProxy.setFont(Course_name,"Standard");
        
        // No Listener
        
    }
    
    /** Initializes the CourseClearButton button */
    private void initCourseClearButton() {
        
        /* Her kommer generert kode for Button:Setup*/
        
        ImageIcon imageCourseClearButton = null;
        imageCourseClearButton = RepositoryProxy.getImageField("Clear");
        if (imageCourseClearButton != null) {
            CourseClearButton = new GenovaButton(imageCourseClearButton);
        }
        else {
            CourseClearButton = new GenovaButton("Clear");
        }
        CourseButton.add(CourseClearButton);
        CourseClearButton.setLocation(0+0,0+0);
        CourseClearButton.setSize(24, 22);
        CourseClearButton.setMargin(new Insets(0,0,0,0));
        RepositoryProxy.setForegroundColor(CourseClearButton,"Black");
        RepositoryProxy.setFont(CourseClearButton,"Standard");
        RepositoryProxy.setImage(CourseClearButton,"Clear");
        CourseClearButton.addActionListener(actionProc);
        
        controller.tabListFromNodeNameCourseButton.put("CourseClearButton", CourseClearButton);
        controller.tabListFromComponentCourseButton.put(CourseClearButton, "CourseClearButton");
    }
    
    /** Initializes the CourseSaveButton button */
    private void initCourseSaveButton() {
        
        /* Her kommer generert kode for Button:Setup*/
        
        ImageIcon imageCourseSaveButton = null;
        imageCourseSaveButton = RepositoryProxy.getImageField("Save");
        if (imageCourseSaveButton != null) {
            CourseSaveButton = new GenovaButton(imageCourseSaveButton);
        }
        else {
            CourseSaveButton = new GenovaButton("Save");
        }
        CourseButton.add(CourseSaveButton);
        CourseSaveButton.setLocation(0+0,28+0);
        CourseSaveButton.setSize(24, 22);
        CourseSaveButton.setMargin(new Insets(0,0,0,0));
        RepositoryProxy.setForegroundColor(CourseSaveButton,"Black");
        RepositoryProxy.setFont(CourseSaveButton,"Standard");
        RepositoryProxy.setImage(CourseSaveButton,"Save");
        CourseSaveButton.addActionListener(actionProc);
        
        controller.tabListFromNodeNameCourseButton.put("CourseSaveButton", CourseSaveButton);
        controller.tabListFromComponentCourseButton.put(CourseSaveButton, "CourseSaveButton");
    }
    
    /** Initializes the CourseDeleteButton button */
    private void initCourseDeleteButton() {
        
        /* Her kommer generert kode for Button:Setup*/
        
        ImageIcon imageCourseDeleteButton = null;
        imageCourseDeleteButton = RepositoryProxy.getImageField("Delete");
        if (imageCourseDeleteButton != null) {
            CourseDeleteButton = new GenovaButton(imageCourseDeleteButton);
        }
        else {
            CourseDeleteButton = new GenovaButton("Delete");
        }
        CourseButton.add(CourseDeleteButton);
        CourseDeleteButton.setLocation(0+0,56+0);
        CourseDeleteButton.setSize(24, 22);
        CourseDeleteButton.setMargin(new Insets(0,0,0,0));
        RepositoryProxy.setForegroundColor(CourseDeleteButton,"Black");
        RepositoryProxy.setFont(CourseDeleteButton,"Standard");
        RepositoryProxy.setImage(CourseDeleteButton,"Delete");
        CourseDeleteButton.addActionListener(actionProc);
        
        controller.tabListFromNodeNameCourseButton.put("CourseDeleteButton", CourseDeleteButton);
        controller.tabListFromComponentCourseButton.put(CourseDeleteButton, "CourseDeleteButton");
    }
    
    /** Initializes the studentCourses.id text component */
    private void initstudentCourses_id() {
        studentCourses_id.setName("studentCourses.id");
        StudentCoursesList.add(studentCourses_id);
        studentCourses_id.setLocation(0+0,138+0);
        { // limit scope of width and height declarations.
            int width = 145;
            int height = 22;
            studentCourses_id.setSize(width, height);
            if (width == 0 && height == 0) {
                studentCourses_id.setFocusable(false);
            }
        } // end limit scope
        
        controller.tabListFromNodeNameStudentCoursesList.put("studentCourses.id", studentCourses_id);
        controller.tabListFromComponentStudentCoursesList.put(studentCourses_id, "studentCourses.id");
        
           //   studentCourses_id.setEditable(true);
        studentCourses_id.setEditable(true);
        
        //studentCourses_id.setVisible(false || true);
        //
        studentCourses_id.setInputJustification(JTextField.LEFT);
        studentCourses_id.setOutputJustification(JTextField.LEFT);
        studentCourses_id.setHorizontalAlignment(JTextField.LEFT);
        studentCourses_id.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(2, studentCourses_id, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
        RepositoryProxy.setForegroundColor(studentCourses_id,"Black");
        RepositoryProxy.setFont(studentCourses_id,"Standard");
        
        studentCourses_id.addKeyListener(keyProc);
        
    }
    
    /** Initializes the student.age text component */
    private void initstudent_age() {
        student_age.setName("student.age");
        StudentCoursesList.add(student_age);
        student_age.setLocation(145+0,138+0);
        { // limit scope of width and height declarations.
            int width = 145;
            int height = 22;
            student_age.setSize(width, height);
            if (width == 0 && height == 0) {
                student_age.setFocusable(false);
            }
        } // end limit scope
        
        controller.tabListFromNodeNameStudentCoursesList.put("student.age", student_age);
        controller.tabListFromComponentStudentCoursesList.put(student_age, "student.age");
        
           //   student_age.setEditable(true);
        student_age.setEditable(true);
        
        //student_age.setVisible(false || true);
        //
        student_age.setInputJustification(JTextField.LEFT);
        student_age.setOutputJustification(JTextField.LEFT);
        student_age.setHorizontalAlignment(JTextField.LEFT);
        student_age.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(2, student_age, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
        RepositoryProxy.setForegroundColor(student_age,"Black");
        RepositoryProxy.setFont(student_age,"Standard");
        
        // No Listener
        
    }
    
    /** Initializes the student.id text component */
    private void initstudent_id() {
        student_id.setName("student.id");
        StudentCoursesList.add(student_id);
        student_id.setLocation(290+0,138+0);
        { // limit scope of width and height declarations.
            int width = 145;
            int height = 22;
            student_id.setSize(width, height);
            if (width == 0 && height == 0) {
                student_id.setFocusable(false);
            }
        } // end limit scope
        
        controller.tabListFromNodeNameStudentCoursesList.put("student.id", student_id);
        controller.tabListFromComponentStudentCoursesList.put(student_id, "student.id");
        
           //   student_id.setEditable(true);
        student_id.setEditable(true);
        
        //student_id.setVisible(false || true);
        //
        student_id.setInputJustification(JTextField.LEFT);
        student_id.setOutputJustification(JTextField.LEFT);
        student_id.setHorizontalAlignment(JTextField.LEFT);
        student_id.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(2, student_id, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
        RepositoryProxy.setForegroundColor(student_id,"Black");
        RepositoryProxy.setFont(student_id,"Standard");
        
        student_id.addKeyListener(keyProc);
        
    }
    
    /** Initializes the student.name text component */
    private void initstudent_name() {
        student_name.setName("student.name");
        StudentCoursesList.add(student_name);
        student_name.setLocation(435+0,138+0);
        { // limit scope of width and height declarations.
            int width = 152;
            int height = 22;
            student_name.setSize(width, height);
            if (width == 0 && height == 0) {
                student_name.setFocusable(false);
            }
        } // end limit scope
        
        controller.tabListFromNodeNameStudentCoursesList.put("student.name", student_name);
        controller.tabListFromComponentStudentCoursesList.put(student_name, "student.name");
        
           //   student_name.setEditable(true);
        student_name.setEditable(true);
        
        //student_name.setVisible(false || true);
        //
        student_name.setInputJustification(JTextField.LEFT);
        student_name.setOutputJustification(JTextField.LEFT);
        student_name.setHorizontalAlignment(JTextField.LEFT);
        student_name.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(7, student_name, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(7,"",0,0,0),0,false);
        RepositoryProxy.setForegroundColor(student_name,"Black");
        RepositoryProxy.setFont(student_name,"Standard");
        
        // No Listener
        
    }
    
    /** Initializes the student.studentNr text component */
    private void initstudent_studentNr() {
        student_studentNr.setName("student.studentNr");
        StudentCoursesList.add(student_studentNr);
        student_studentNr.setLocation(587+0,138+0);
        { // limit scope of width and height declarations.
            int width = 145;
            int height = 22;
            student_studentNr.setSize(width, height);
            if (width == 0 && height == 0) {
                student_studentNr.setFocusable(false);
            }
        } // end limit scope
        
        controller.tabListFromNodeNameStudentCoursesList.put("student.studentNr", student_studentNr);
        controller.tabListFromComponentStudentCoursesList.put(student_studentNr, "student.studentNr");
        
           //   student_studentNr.setEditable(true);
        student_studentNr.setEditable(true);
        
        //student_studentNr.setVisible(false || true);
        //
        student_studentNr.setInputJustification(JTextField.LEFT);
        student_studentNr.setOutputJustification(JTextField.LEFT);
        student_studentNr.setHorizontalAlignment(JTextField.LEFT);
        student_studentNr.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(2, student_studentNr, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
        RepositoryProxy.setForegroundColor(student_studentNr,"Black");
        RepositoryProxy.setFont(student_studentNr,"Standard");
        
        student_studentNr.addKeyListener(keyProc);
        
    }
    
    /** Initializes the SaveStudentCourse button */
    private void initSaveStudentCourse() {
        
        /* Her kommer generert kode for Button:Setup*/
        
        ImageIcon imageSaveStudentCourse = null;
        imageSaveStudentCourse = RepositoryProxy.getImageField("Save");
        if (imageSaveStudentCourse != null) {
            SaveStudentCourse = new GenovaButton(imageSaveStudentCourse);
        }
        else {
            SaveStudentCourse = new GenovaButton("SaveStudentCourse");
        }
        StudentCoursesClass.add(SaveStudentCourse);
        SaveStudentCourse.setLocation(763+3,17+10);
        SaveStudentCourse.setSize(24, 22);
        SaveStudentCourse.setMargin(new Insets(0,0,0,0));
        RepositoryProxy.setForegroundColor(SaveStudentCourse,"Black");
        RepositoryProxy.setFont(SaveStudentCourse,"Standard");
        RepositoryProxy.setImage(SaveStudentCourse,"Save");
        SaveStudentCourse.addActionListener(actionProc);
        
        controller.tabListFromNodeNameStudentCoursesClass.put("SaveStudentCourse", SaveStudentCourse);
        controller.tabListFromComponentStudentCoursesClass.put(SaveStudentCourse, "SaveStudentCourse");
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
        clearCourseClass(); 
        clearStudentCoursesClass(); 
    }

    /**
     * Clears the CourseClass 
     */
    public void clearCourseClass() {
        clearCourseData(); 
        clearCourseButton(); 
    }

    /**
     * Clears the CourseData 
     */
    public void clearCourseData() {
        Course_code.setInitialValue(null);
        Course_code.setValue(null);
        Course_id.setInitialValue(null);
        Course_id.setValue(null);
        Course_isActive.setSelected(false);
        Course_name.setInitialValue(null);
        Course_name.setValue(null);
    }

    /**
     * Clears the CourseButton 
     */
    public void clearCourseButton() {
    }

    /**
     * Clears the StudentCoursesClass 
     */
    public void clearStudentCoursesClass() {
        clearStudentCoursesList(); 
    }

    /**
     * Clears the listblock StudentCoursesList, both edit fields and 
     * lines are cleared.
     */
    public void clearStudentCoursesList() {
        controller.listblockMethodsStudentCoursesList.purgeAllLines();
        studentCourses_id.setInitialValue(null);
        studentCourses_id.setValue(null);
        student_age.setInitialValue(null);
        student_age.setValue(null);
        student_id.setInitialValue(null);
        student_id.setValue(null);
        student_name.setInitialValue(null);
        student_name.setValue(null);
        student_studentNr.setInitialValue(null);
        student_studentNr.setValue(null);
    }

    /**
     * Clears all window blocks in the dialog.    
     */
    public void clearAddStudentsToCourse() {
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
    
    /** Model for listblock StudentCoursesList. Redirects call to controller, so the
     * controller may choose to override value. If compiled with rt code
     * then the value from the model is sent as well.
     *
     * The developer should not access the model directly.
     */
    class StudentCoursesListModel extends DefaultTableModel implements TableModelListener {
        AddStudentsToCourseDefaultController controller;      
        
        StudentCoursesListModel(AddStudentsToCourseDefaultController controller) {
            this.controller = controller;
            addTableModelListener(this);
        }
        
        /** The number of columns (in the list block) 
         * @return Column count.
         */
        public int getColumnCount() {
           return StudentCoursesList_headers.size(); 
        }
        /**
         * Number of rows
         * @return Row count.
         */
        public int getRowCount() {
            if(controller == null) {
                return 0;
            }
            if(true && controller.StudentCoursesListNodeInfo != null) {
               return controller.StudentCoursesListgetRowCount(controller.StudentCoursesListNodeInfo.getVisualRowCount());
            }
            return controller.StudentCoursesListgetRowCount(1);
        }
        /** 
         * Use this method to catch event for selected.
         * @param e The table change event.
         */
        public void tableChanged(TableModelEvent e) {
            int col = e.getColumn();
            if(col == -1 || e.getType() != TableModelEvent.UPDATE) {
                return;
            }
            col = ((Integer)StudentCoursesList_indexes.elementAt(col)).intValue();
            switch(col) {
      case 0: 
    if(objectVersionOfstudentCoursesid instanceof JComboBox && controller.view.block.isBlockedListblockStudentCoursesList()) {
        controller.view.block.increaseListblockStudentCoursesList();
        selectedInCombobox((GenovaComboBox)objectVersionOfstudentCoursesid, null);
        controller.view.block.decreaseListblockStudentCoursesList();
    }

    break;
      case 1: 
    if(objectVersionOfstudentage instanceof JComboBox && controller.view.block.isBlockedListblockStudentCoursesList()) {
        controller.view.block.increaseListblockStudentCoursesList();
        selectedInCombobox((GenovaComboBox)objectVersionOfstudentage, null);
        controller.view.block.decreaseListblockStudentCoursesList();
    }

    break;
      case 2: 
    if(objectVersionOfstudentid instanceof JComboBox && controller.view.block.isBlockedListblockStudentCoursesList()) {
        controller.view.block.increaseListblockStudentCoursesList();
        selectedInCombobox((GenovaComboBox)objectVersionOfstudentid, null);
        controller.view.block.decreaseListblockStudentCoursesList();
    }

    break;
      case 3: 
    if(objectVersionOfstudentname instanceof JComboBox && controller.view.block.isBlockedListblockStudentCoursesList()) {
        controller.view.block.increaseListblockStudentCoursesList();
        selectedInCombobox((GenovaComboBox)objectVersionOfstudentname, null);
        controller.view.block.decreaseListblockStudentCoursesList();
    }

    break;
      case 4: 
    if(objectVersionOfstudentstudentNr instanceof JComboBox && controller.view.block.isBlockedListblockStudentCoursesList()) {
        controller.view.block.increaseListblockStudentCoursesList();
        selectedInCombobox((GenovaComboBox)objectVersionOfstudentstudentNr, null);
        controller.view.block.decreaseListblockStudentCoursesList();
    }

    break;
            }
        }
    /**
     * Internal use.
     * @param row Internal use.
     * @param col Internal use.
     * @return Internal use.
     */
    public Object getValueAt(int row, int col) {
            Object retVal = new String("");
            // int originalCol = col;
            if(StudentCoursesList_indexes == null) {
                return "";
            }
            LineListblockStudentCoursesList theLine = controller.listblockMethodsStudentCoursesList.getListblockLinePrivate(row);
            if (theLine == null) {
                return null; // happens when system triggers a repaint 
                             // while a server-action is updating the model.
            }
            col = ((Integer)StudentCoursesList_indexes.elementAt(col)).intValue();
            switch(col) {
                
                /* Her kommer generert kode for ListColumn:StudentCoursesListGetTableValue rt*/
                
                case 0: 
                    retVal = theLine.cellValueColumn0;
                    if (retVal == null) {
                        retVal = getNullValueForCell("studentCourses.id");
                    }
                break;
                
                /* Her kommer generert kode for ListColumn:StudentCoursesListGetTableValue rt*/
                
                case 1: 
                    retVal = theLine.cellValueColumn1;
                    if (retVal == null) {
                        retVal = getNullValueForCell("student.age");
                    }
                break;
                
                /* Her kommer generert kode for ListColumn:StudentCoursesListGetTableValue rt*/
                
                case 2: 
                    retVal = theLine.cellValueColumn2;
                    if (retVal == null) {
                        retVal = getNullValueForCell("student.id");
                    }
                break;
                
                /* Her kommer generert kode for ListColumn:StudentCoursesListGetTableValue rt*/
                
                case 3: 
                    retVal = theLine.cellValueColumn3;
                    if (retVal == null) {
                        retVal = getNullValueForCell("student.name");
                    }
                break;
                
                /* Her kommer generert kode for ListColumn:StudentCoursesListGetTableValue rt*/
                
                case 4: 
                    retVal = theLine.cellValueColumn4;
                    if (retVal == null) {
                        retVal = getNullValueForCell("student.studentNr");
                    }
                break;
            }
            return retVal;
        }
    /** 
     * Internal use.
     * @param value Internal use.
     * @param row Internal use.
     * @param col Internal use.
     */
        public void setValueAt(Object value, int row, int col) {
            int origCol = col;
            
            StudentCoursesListblockStopEditing++;
            if(row < StudentCoursesList_table.getRowCount() && StudentCoursesList_table.getSelectedRow() != row) {
                block.increaseListblockStudentCoursesList();
                StudentCoursesList_table.addRowSelectionInterval(row, row);
                block.decreaseListblockStudentCoursesList();
            }
                LineListblockStudentCoursesList data = controller.listblockMethodsStudentCoursesList.getListblockLinePrivate(row);
                
//                StudentCourse tmpstudentCourses;
                
//                Student tmpstudent;
                
//                
                
//                
                
//                
                col = ((Integer)StudentCoursesList_indexes.elementAt(col)).intValue();
                switch(col) {
                    
                    /* Her kommer generert kode for ListColumn:StudentCoursesListSetTableValueSwitchBody rt*/
                    
                    case 0: 
                        data.cellValueColumn0 = value;
                        data.fromCellToListblockLine(origCol);
                        
                            if(objectVersionOfstudentCoursesid instanceof JCheckBox) {
                                
                                if(value ==  null){
                                    if(data.oldstudentCourses == null) {
                                        data.markAsChanged();
                                    }
                                } else {
                                    Boolean valueToTest = (Boolean)value;
                                    Boolean oldValueTest = null;
                                    if(data.oldstudentCourses != null) {
                                        Object objectold = TypeTool.convert(data.oldstudentCourses.getId());
                                        oldValueTest = (Boolean)objectold;
                                    }
                                    
                                    if(oldValueTest == null || !valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            } else if(value instanceof JComboBox) {
                                JComboBox box = (JComboBox)value;
                                String oldValueTest;
                                String valueToTest = null;
                                
                                if(data.oldstudentCourses == null) {
                                    data.markAsChanged();
                                }else {
                                    if(box.isEditable()) {
                                        valueToTest = (String)box.getEditor().getItem();
                                    }else {
                                        valueToTest = (String)box.getSelectedItem();
                                    }
                                    oldValueTest = controller.convertToString(data.oldstudentCourses.getId(), TypeTool.getAttributeClassNameMethod(data.oldstudentCourses,"id"));
                                    
                                    if(!valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }else {
                                String oldValueTest;
                                
                                if(data.oldstudentCourses != null) {
                                    oldValueTest = controller.convertToString(data.oldstudentCourses.getId(), TypeTool.getAttributeClassNameMethod(data.oldstudentCourses,"id")).toString();
                                } else {
                                    oldValueTest = "";
                                }
                                if(value  != null){   
                                    if(!((String)value).equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }
                            
                            //                 tmpstudentCourses = data.getstudentCourses();               
                            //                 controller.reflectAssign(tmpstudentCourses, controller.getClassName(tmpstudentCourses.id), "id", svalue);
                            //                 tmpstudentCourses.id = TypeTool.convert(svalue,tmpstudentCourses.getId());
                            //                 data.setstudentCourses(tmpstudentCourses);
                            
                            /* Do a value changed test for textfield here */
                            if(objectVersionOfstudentCoursesid instanceof JTextField && block.isBlockedListblockVCStudentCoursesList()) {
                                block.increaseListblockVCStudentCoursesList();
                                
                                final Object eventObject = controller.view.studentCourses_id;
                                ((JTextField)eventObject).setText((String)value);
                                
                                String jall = data.oldValuestudentCoursesid;
                                data.oldValuestudentCoursesid = (String)value;
                                valueChangedTextField(studentCourses_id, (String)value, jall, null);
                                block.decreaseListblockVCStudentCoursesList();
                            }
                            /* And A selected for ComboBox! */
                            if(objectVersionOfstudentCoursesid instanceof JComboBox) {
                                controller.view.block.increaseListblockStudentCoursesList();
                                ((GenovaComboBox)objectVersionOfstudentCoursesid).setSelectedItem(value);
                                selectedInCombobox((GenovaComboBox)objectVersionOfstudentCoursesid, null);
                                controller.view.block.decreaseListblockStudentCoursesList();
                            }
                            
                            break;
//                        }
                    
                    /* Her kommer generert kode for ListColumn:StudentCoursesListSetTableValueSwitchBody rt*/
                    
                    case 1: 
                        data.cellValueColumn1 = value;
                        data.fromCellToListblockLine(origCol);
                        
                            if(objectVersionOfstudentage instanceof JCheckBox) {
                                
                                if(value ==  null){
                                    if(data.oldstudent == null) {
                                        data.markAsChanged();
                                    }
                                } else {
                                    Boolean valueToTest = (Boolean)value;
                                    Boolean oldValueTest = null;
                                    if(data.oldstudent != null) {
                                        Object objectold = TypeTool.convert(data.oldstudent.getAge());
                                        oldValueTest = (Boolean)objectold;
                                    }
                                    
                                    if(oldValueTest == null || !valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            } else if(value instanceof JComboBox) {
                                JComboBox box = (JComboBox)value;
                                String oldValueTest;
                                String valueToTest = null;
                                
                                if(data.oldstudent == null) {
                                    data.markAsChanged();
                                }else {
                                    if(box.isEditable()) {
                                        valueToTest = (String)box.getEditor().getItem();
                                    }else {
                                        valueToTest = (String)box.getSelectedItem();
                                    }
                                    oldValueTest = controller.convertToString(data.oldstudent.getAge(), TypeTool.getAttributeClassNameMethod(data.oldstudent,"age"));
                                    
                                    if(!valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }else {
                                String oldValueTest;
                                
                                if(data.oldstudent != null) {
                                    oldValueTest = controller.convertToString(data.oldstudent.getAge(), TypeTool.getAttributeClassNameMethod(data.oldstudent,"age")).toString();
                                } else {
                                    oldValueTest = "";
                                }
                                if(value  != null){   
                                    if(!((String)value).equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }
                            
                            //                 tmpstudent = data.getstudent();               
                            //                 controller.reflectAssign(tmpstudent, controller.getClassName(tmpstudent.age), "age", svalue);
                            //                 tmpstudent.age = TypeTool.convert(svalue,tmpstudent.getAge());
                            //                 data.setstudent(tmpstudent);
                            
                            /* Do a value changed test for textfield here */
                            if(objectVersionOfstudentage instanceof JTextField && block.isBlockedListblockVCStudentCoursesList()) {
                                block.increaseListblockVCStudentCoursesList();
                                
                                final Object eventObject = controller.view.student_age;
                                ((JTextField)eventObject).setText((String)value);
                                
                                String jall = data.oldValuestudentage;
                                data.oldValuestudentage = (String)value;
                                valueChangedTextField(student_age, (String)value, jall, null);
                                block.decreaseListblockVCStudentCoursesList();
                            }
                            /* And A selected for ComboBox! */
                            if(objectVersionOfstudentage instanceof JComboBox) {
                                controller.view.block.increaseListblockStudentCoursesList();
                                ((GenovaComboBox)objectVersionOfstudentage).setSelectedItem(value);
                                selectedInCombobox((GenovaComboBox)objectVersionOfstudentage, null);
                                controller.view.block.decreaseListblockStudentCoursesList();
                            }
                            
                            break;
//                        }
                    
                    /* Her kommer generert kode for ListColumn:StudentCoursesListSetTableValueSwitchBody rt*/
                    
                    case 2: 
                        data.cellValueColumn2 = value;
                        data.fromCellToListblockLine(origCol);
                        
                            if(objectVersionOfstudentid instanceof JCheckBox) {
                                
                                if(value ==  null){
                                    if(data.oldstudent == null) {
                                        data.markAsChanged();
                                    }
                                } else {
                                    Boolean valueToTest = (Boolean)value;
                                    Boolean oldValueTest = null;
                                    if(data.oldstudent != null) {
                                        Object objectold = TypeTool.convert(data.oldstudent.getId());
                                        oldValueTest = (Boolean)objectold;
                                    }
                                    
                                    if(oldValueTest == null || !valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            } else if(value instanceof JComboBox) {
                                JComboBox box = (JComboBox)value;
                                String oldValueTest;
                                String valueToTest = null;
                                
                                if(data.oldstudent == null) {
                                    data.markAsChanged();
                                }else {
                                    if(box.isEditable()) {
                                        valueToTest = (String)box.getEditor().getItem();
                                    }else {
                                        valueToTest = (String)box.getSelectedItem();
                                    }
                                    oldValueTest = controller.convertToString(data.oldstudent.getId(), TypeTool.getAttributeClassNameMethod(data.oldstudent,"id"));
                                    
                                    if(!valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }else {
                                String oldValueTest;
                                
                                if(data.oldstudent != null) {
                                    oldValueTest = controller.convertToString(data.oldstudent.getId(), TypeTool.getAttributeClassNameMethod(data.oldstudent,"id")).toString();
                                } else {
                                    oldValueTest = "";
                                }
                                if(value  != null){   
                                    if(!((String)value).equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }
                            
                            //                 tmpstudent = data.getstudent();               
                            //                 controller.reflectAssign(tmpstudent, controller.getClassName(tmpstudent.id), "id", svalue);
                            //                 tmpstudent.id = TypeTool.convert(svalue,tmpstudent.getId());
                            //                 data.setstudent(tmpstudent);
                            
                            /* Do a value changed test for textfield here */
                            if(objectVersionOfstudentid instanceof JTextField && block.isBlockedListblockVCStudentCoursesList()) {
                                block.increaseListblockVCStudentCoursesList();
                                
                                final Object eventObject = controller.view.student_id;
                                ((JTextField)eventObject).setText((String)value);
                                
                                String jall = data.oldValuestudentid;
                                data.oldValuestudentid = (String)value;
                                valueChangedTextField(student_id, (String)value, jall, null);
                                block.decreaseListblockVCStudentCoursesList();
                            }
                            /* And A selected for ComboBox! */
                            if(objectVersionOfstudentid instanceof JComboBox) {
                                controller.view.block.increaseListblockStudentCoursesList();
                                ((GenovaComboBox)objectVersionOfstudentid).setSelectedItem(value);
                                selectedInCombobox((GenovaComboBox)objectVersionOfstudentid, null);
                                controller.view.block.decreaseListblockStudentCoursesList();
                            }
                            
                            break;
//                        }
                    
                    /* Her kommer generert kode for ListColumn:StudentCoursesListSetTableValueSwitchBody rt*/
                    
                    case 3: 
                        data.cellValueColumn3 = value;
                        data.fromCellToListblockLine(origCol);
                        
                            if(objectVersionOfstudentname instanceof JCheckBox) {
                                
                                if(value ==  null){
                                    if(data.oldstudent == null) {
                                        data.markAsChanged();
                                    }
                                } else {
                                    Boolean valueToTest = (Boolean)value;
                                    Boolean oldValueTest = null;
                                    if(data.oldstudent != null) {
                                        Object objectold = TypeTool.convert(data.oldstudent.getName());
                                        oldValueTest = (Boolean)objectold;
                                    }
                                    
                                    if(oldValueTest == null || !valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            } else if(value instanceof JComboBox) {
                                JComboBox box = (JComboBox)value;
                                String oldValueTest;
                                String valueToTest = null;
                                
                                if(data.oldstudent == null) {
                                    data.markAsChanged();
                                }else {
                                    if(box.isEditable()) {
                                        valueToTest = (String)box.getEditor().getItem();
                                    }else {
                                        valueToTest = (String)box.getSelectedItem();
                                    }
                                    oldValueTest = controller.convertToString(data.oldstudent.getName(), TypeTool.getAttributeClassNameMethod(data.oldstudent,"name"));
                                    
                                    if(!valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }else {
                                String oldValueTest;
                                
                                if(data.oldstudent != null) {
                                    oldValueTest = controller.convertToString(data.oldstudent.getName(), TypeTool.getAttributeClassNameMethod(data.oldstudent,"name")).toString();
                                } else {
                                    oldValueTest = "";
                                }
                                if(value  != null){   
                                    if(!((String)value).equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }
                            
                            //                 tmpstudent = data.getstudent();               
                            //                 controller.reflectAssign(tmpstudent, controller.getClassName(tmpstudent.name), "name", svalue);
                            //                 tmpstudent.name = TypeTool.convert(svalue,tmpstudent.getName());
                            //                 data.setstudent(tmpstudent);
                            
                            /* Do a value changed test for textfield here */
                            if(objectVersionOfstudentname instanceof JTextField && block.isBlockedListblockVCStudentCoursesList()) {
                                block.increaseListblockVCStudentCoursesList();
                                
                                final Object eventObject = controller.view.student_name;
                                ((JTextField)eventObject).setText((String)value);
                                
                                String jall = data.oldValuestudentname;
                                data.oldValuestudentname = (String)value;
                                valueChangedTextField(student_name, (String)value, jall, null);
                                block.decreaseListblockVCStudentCoursesList();
                            }
                            /* And A selected for ComboBox! */
                            if(objectVersionOfstudentname instanceof JComboBox) {
                                controller.view.block.increaseListblockStudentCoursesList();
                                ((GenovaComboBox)objectVersionOfstudentname).setSelectedItem(value);
                                selectedInCombobox((GenovaComboBox)objectVersionOfstudentname, null);
                                controller.view.block.decreaseListblockStudentCoursesList();
                            }
                            
                            break;
//                        }
                    
                    /* Her kommer generert kode for ListColumn:StudentCoursesListSetTableValueSwitchBody rt*/
                    
                    case 4: 
                        data.cellValueColumn4 = value;
                        data.fromCellToListblockLine(origCol);
                        
                            if(objectVersionOfstudentstudentNr instanceof JCheckBox) {
                                
                                if(value ==  null){
                                    if(data.oldstudent == null) {
                                        data.markAsChanged();
                                    }
                                } else {
                                    Boolean valueToTest = (Boolean)value;
                                    Boolean oldValueTest = null;
                                    if(data.oldstudent != null) {
                                        Object objectold = TypeTool.convert(data.oldstudent.getStudentNr());
                                        oldValueTest = (Boolean)objectold;
                                    }
                                    
                                    if(oldValueTest == null || !valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            } else if(value instanceof JComboBox) {
                                JComboBox box = (JComboBox)value;
                                String oldValueTest;
                                String valueToTest = null;
                                
                                if(data.oldstudent == null) {
                                    data.markAsChanged();
                                }else {
                                    if(box.isEditable()) {
                                        valueToTest = (String)box.getEditor().getItem();
                                    }else {
                                        valueToTest = (String)box.getSelectedItem();
                                    }
                                    oldValueTest = controller.convertToString(data.oldstudent.getStudentNr(), TypeTool.getAttributeClassNameMethod(data.oldstudent,"studentNr"));
                                    
                                    if(!valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }else {
                                String oldValueTest;
                                
                                if(data.oldstudent != null) {
                                    oldValueTest = controller.convertToString(data.oldstudent.getStudentNr(), TypeTool.getAttributeClassNameMethod(data.oldstudent,"studentNr")).toString();
                                } else {
                                    oldValueTest = "";
                                }
                                if(value  != null){   
                                    if(!((String)value).equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }
                            
                            //                 tmpstudent = data.getstudent();               
                            //                 controller.reflectAssign(tmpstudent, controller.getClassName(tmpstudent.studentNr), "studentNr", svalue);
                            //                 tmpstudent.studentNr = TypeTool.convert(svalue,tmpstudent.getStudentNr());
                            //                 data.setstudent(tmpstudent);
                            
                            /* Do a value changed test for textfield here */
                            if(objectVersionOfstudentstudentNr instanceof JTextField && block.isBlockedListblockVCStudentCoursesList()) {
                                block.increaseListblockVCStudentCoursesList();
                                
                                final Object eventObject = controller.view.student_studentNr;
                                ((JTextField)eventObject).setText((String)value);
                                
                                String jall = data.oldValuestudentstudentNr;
                                data.oldValuestudentstudentNr = (String)value;
                                valueChangedTextField(student_studentNr, (String)value, jall, null);
                                block.decreaseListblockVCStudentCoursesList();
                            }
                            /* And A selected for ComboBox! */
                            if(objectVersionOfstudentstudentNr instanceof JComboBox) {
                                controller.view.block.increaseListblockStudentCoursesList();
                                ((GenovaComboBox)objectVersionOfstudentstudentNr).setSelectedItem(value);
                                selectedInCombobox((GenovaComboBox)objectVersionOfstudentstudentNr, null);
                                controller.view.block.decreaseListblockStudentCoursesList();
                            }
                            
                            break;
//                        }
                }
                data.fromCellToListblockLine(origCol);
                controller.StudentCoursesListsetValueAt(value, row, col);
                StudentCoursesListblockStopEditing--;
            }
    /**
     * Returns column name for given column.
     * @param col Column to get.
     * @return Column name, as defined in genova.
     */
            public String getColumnName(int col) {
                if(StudentCoursesList_indexes == null) {
                    return "";
                }
                String retVal = "";
                col = ((Integer)StudentCoursesList_indexes.elementAt(col)).intValue();
                
                switch(col) {
                    
                    /* Her kommer generert kode for ListColumn:StudentCoursesListGetColumnName*/
                    
                    case 0: 
                        retVal = (String)StudentCoursesList_headers.elementAt(StudentCoursesList_indexes.indexOf(new Integer(0)));
                        break;
                    
                    /* Her kommer generert kode for ListColumn:StudentCoursesListGetColumnName*/
                    
                    case 1: 
                        retVal = (String)StudentCoursesList_headers.elementAt(StudentCoursesList_indexes.indexOf(new Integer(1)));
                        break;
                    
                    /* Her kommer generert kode for ListColumn:StudentCoursesListGetColumnName*/
                    
                    case 2: 
                        retVal = (String)StudentCoursesList_headers.elementAt(StudentCoursesList_indexes.indexOf(new Integer(2)));
                        break;
                    
                    /* Her kommer generert kode for ListColumn:StudentCoursesListGetColumnName*/
                    
                    case 3: 
                        retVal = (String)StudentCoursesList_headers.elementAt(StudentCoursesList_indexes.indexOf(new Integer(3)));
                        break;
                    
                    /* Her kommer generert kode for ListColumn:StudentCoursesListGetColumnName*/
                    
                    case 4: 
                        retVal = (String)StudentCoursesList_headers.elementAt(StudentCoursesList_indexes.indexOf(new Integer(4)));
                        break;
                }
                return retVal;
            }
    /** Internal use.
     * @param row Internal use.
     * @param col Internal use.
     * @return Internal use.
     */
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        } // End of class for model
        /** Enables or disable listblock StudentCoursesList.
         * @param value True disabled the listblock, false enables.
         */
        public void setEnabledStudentCoursesList(boolean value) {
            StudentCoursesList.setEnabled(value);
        }
        
        /** Hides or displays StudentCoursesList 
         * @param value True it will be shown, false it will be invisible.
         */
        public void setShownStudentCoursesList(boolean value) {
            StudentCoursesList.setVisible(value);
        }
        
        /* Her kommer generert kode for Listblock:StudentCoursesListsetDatatype*/
        
        void setDatatypeStudentCoursesList(JTextComponent component,int col) {
            switch(col) {
                
                /* Her kommer generert kode for ListColumn:StudentCoursesListsetDatatype*/
                
                case 0:
                    RepositoryProxy.setDatatype(2, component, 0, controller.getApplication().getEnums(), null,
                                    FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
                    return;
                
                /* Her kommer generert kode for ListColumn:StudentCoursesListsetDatatype*/
                
                case 1:
                    RepositoryProxy.setDatatype(2, component, 0, controller.getApplication().getEnums(), null,
                                    FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
                    return;
                
                /* Her kommer generert kode for ListColumn:StudentCoursesListsetDatatype*/
                
                case 2:
                    RepositoryProxy.setDatatype(2, component, 0, controller.getApplication().getEnums(), null,
                                    FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
                    return;
                
                /* Her kommer generert kode for ListColumn:StudentCoursesListsetDatatype*/
                
                case 3:
                    RepositoryProxy.setDatatype(7, component, 0, controller.getApplication().getEnums(), null,
                                    FormatHelper.getDisplayrule(7,"",0,0,0),0,false);
                    return;
                
                /* Her kommer generert kode for ListColumn:StudentCoursesListsetDatatype*/
                
                case 4:
                    RepositoryProxy.setDatatype(2, component, 0, controller.getApplication().getEnums(), null,
                                    FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
                    return;
            
            /* Her kommer generert kode for Listblock:StudentCoursesListsetDatatypeEnd*/
            
            }
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
        if (source.getRowCount() > 0 && block.isBlockedListblockStudentCoursesList() && source.equals(StudentCoursesList_table)) {
            LineListblockStudentCoursesList selectedLine = 
                controller.listblockMethodsStudentCoursesList.getSelectedLineObject();
            if (selectedLine != null) {
                selectedLine.displayInEditField();
            } else {
                controller.listblockMethodsStudentCoursesList.clearEditFields();
            }
        }
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
                    
                    /* Her kommer generert kode for CheckButton:FocusLost*/
                    
                    oldValueCourseisActive = valueChangedTestCheckButton(Course_isActive, TypeTool.convertToString(Course_isActive.isSelected()), oldValueCourseisActive, e);
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
                    
                    if (e.getSource() == CourseClearButton) {
                        controller.clearCourse(new GenovaActionEventHolder(e));
                    }
                    
                    /* Her kommer generert kode for Button ActionPerformed*/
                    
                    if (e.getSource() == CourseSaveButton) {
                        controller.saveCourse(new GenovaActionEventHolder(e));
                    }
                    
                    /* Her kommer generert kode for Button ActionPerformed*/
                    
                    if (e.getSource() == CourseDeleteButton) {
                        controller.deleteCourse(new GenovaActionEventHolder(e));
                    }
                    
                    /* Her kommer generert kode for Button ActionPerformed*/
                    
                    if (e.getSource() == SaveStudentCourse) {
                        controller.saveStudentCourse(new GenovaActionEventHolder(e));
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
                    
                    /* Her kommer generert kode for CheckButton:FocusLost*/
                    
                    if((e.getStateChange() == ItemEvent.SELECTED ||
                        e.getStateChange() == ItemEvent.DESELECTED) && 
                        e.getSource() == Course_isActive) {
                            selectedInCheckButton((JComponent)e.getSource(), (JComponent)e.getSource(), e);
                    }
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
                if(e.getSource() == StudentCoursesListTableHeader) {
                    // display column header as "pressed"
                    TableColumnModel columnModel = StudentCoursesList_table.getColumnModel();
                    int viewColumn = columnModel.getColumnIndexAtX(e.getX()); 
                    int column = StudentCoursesList_table.convertColumnIndexToModel(viewColumn);
                    if(column<StudentCoursesListHeadersClicked.length && column>-1){
                        StudentCoursesListHeadersClicked[column] = true;
                        StudentCoursesListTableHeader.resizeAndRepaint();
                    }
                }
            }
            public void mouseReleased(MouseEvent e) {
                // Every column header should be displayed as not pressed.
                boolean doRepaintStudentCoursesList = false;
                for (int i = 0; i < StudentCoursesListHeadersClicked.length; i++) {
                    doRepaintStudentCoursesList = doRepaintStudentCoursesList || StudentCoursesListHeadersClicked[i];
                    StudentCoursesListHeadersClicked[i] = false;
                }
                if (doRepaintStudentCoursesList) {
                    StudentCoursesListTableHeader.resizeAndRepaint();
                }

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
                if (StudentCoursesList_table == e.getSource()) {
                    selectionInListblockTest(StudentCoursesList_table, StudentCoursesList_table.getSelectedRows(), e);
                }
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
            controller.closeAddStudentsToCourse(new GenovaWindowEventHolder(e));
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
