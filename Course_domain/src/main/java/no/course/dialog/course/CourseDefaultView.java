// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package no.course.dialog.course;

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


/**
 * Public class interpreting the generated view part of
 * Course. This class is generated and should not be edited
 * in. If any changes are needed, do them in CourseView.
 */ 
@SuppressWarnings("all")
public abstract class CourseDefaultView extends GenovaDialogFrame implements BottomWindow {
    
    boolean selectItemOK = true;
    
    CourseDefaultController controller;
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
    JInternalFrame theCourseInternalFrame = this;
    
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
    
    /** The CourseNameLabel label */
    protected JLabel CourseNameLabelLabel = new JLabel("name");
    GenovaTextField Course_name = new GenovaTextField("");
    final Object objectVersionOfCoursename = Course_name;
    String oldValueCoursename;
    
    /** The CourseIsActiveLabel label */
    protected JLabel CourseIsActiveLabelLabel = new JLabel("Active course");
    
    /** The isActive check box */
    protected GenovaCheckBox Course_isActive = new GenovaCheckBox("");
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
    GenovaTextField Course_id = new GenovaTextField("");
    final Object objectVersionOfCourseid = Course_id;
    String oldValueCourseid;
    
    /** The CourseButton simple block */
    protected JPanel CourseButton = new JPanel();
    
    /* Her kommer generert kode for Button:Declaration*/
    
    JButton CourseClearButton;
    
    
    /* Her kommer generert kode for Button:Declaration*/
    
    JButton CourseSaveButton;
    
    
    /* Her kommer generert kode for Button:Declaration*/
    
    JButton CourseDeleteButton;
    
    
    /** The tableBlock simple block */
    protected JPanel tableBlock = new JPanel();
    
    /* Her kommer generert kode for Listblock:Declaration*/
    
    // View
    JPopupMenu activePopupMenucourseList = null;
    JPanel courseList = new JPanel();
    courseListModel courseListtheModel = null;
    GenovaTable courseList_table = null;
    JScrollPane courseList_pane = null;
    Color defaultBackgroundcourseList = null;
    Color defaultSelectedBackgroundcourseList = null;
    boolean hasCellSelectionColorcourseList = false;
    Vector courseList_headers = new Vector();
    boolean courseListHeadersClicked[];
    
    int courseListblockStopEditing = 0;
    
    /** Used to keep track of values used in auto count when parsing the 
     * columns. If they are invis, then no columns is added... 
     */
    Vector courseList_indexes = new Vector();
    
    GenovaTable courseListRowHeader;
    ToolTipHeader  courseListTableHeader;
    DefaultTableCellRenderer courseListTableHeaderRenderer;
    DefaultTableModel courseListHeaderModel;
    
    
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
    JComponent setHeaderPropscourseList(JComponent c, JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        
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
        if(courseListHeadersClicked[column]) {                        
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
    Component setTablePropscourseList(Component c, LineListblockcourseList data, JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){                              
        RepositoryProxy.setFont(c, "ListblockFont");
        Color deletedColor = RepositoryProxy.getColorField("ListblockLineDeletedColor");
        Color newColor = RepositoryProxy.getColorField("ListblockLineNewColor");
        Color changedColor = RepositoryProxy.getColorField("ListblockLineChangedColor");
        
        if(value instanceof JCheckBox) {
            ((JComponent)value).setBackground(table.getBackground());
        }
        if(!hasCellSelectionColorcourseList) {
            if(isSelected) {
                c.setBackground(defaultSelectedBackgroundcourseList);
            } else {
                c.setBackground(defaultBackgroundcourseList);
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
    
    /** The courseList_widths vector */
    protected Vector courseList_widths = new Vector();
    GenovaTextField Course2_code = new GenovaTextField("");
    final Object objectVersionOfCourse2code = Course2_code;
    String oldValueCourse2code;
    
    /* Her kommer generert kode for ListColumn:Declaration*/
    
    TableColumn courseListCourse2codeColumn;
    GenovaTextField Course2_id = new GenovaTextField("");
    final Object objectVersionOfCourse2id = Course2_id;
    String oldValueCourse2id;
    
    /* Her kommer generert kode for ListColumn:Declaration*/
    
    TableColumn courseListCourse2idColumn;
    GenovaTextField Course2_name = new GenovaTextField("");
    final Object objectVersionOfCourse2name = Course2_name;
    String oldValueCourse2name;
    
    /* Her kommer generert kode for ListColumn:Declaration*/
    
    TableColumn courseListCourse2nameColumn;
    
    /** The isActive check box */
    protected GenovaCheckBox Course2_isActive = new GenovaCheckBox();
    final Object objectVersionOfCourse2isActive = Course2_isActive;
    final int numberOfCharsCourse2isActive = 0;
    
    int blockSelectedionEventCourse2isActive = 0;
    
    void countUpBlocKSelectionEventCourse2isActive() {
        blockSelectedionEventCourse2isActive++;
    }
    void countDownBlocKSelectionEventCourse2isActive() {
        blockSelectedionEventCourse2isActive--;
    }
    
    String oldValueCourse2isActive;
    
    /* Her kommer generert kode for ListColumn:Declaration*/
    
    TableColumn courseListCourse2isActiveColumn;
    
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
    public CourseDefaultView(final CourseDefaultController controller, GenovaEnums applicationEnums) {
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
        nameToComponent.put("CourseNameLabel", CourseNameLabelLabel);
        componentToName.put(CourseNameLabelLabel, "CourseNameLabel");
        nameToComponent.put("Course.name", Course_name);
        componentToName.put(Course_name, "Course.name");
        nameToComponent.put("CourseIsActiveLabel", CourseIsActiveLabelLabel);
        componentToName.put(CourseIsActiveLabelLabel, "CourseIsActiveLabel");
        nameToComponent.put("Course.isActive", Course_isActive);
        componentToName.put(Course_isActive, "Course.isActive");
        nameToComponent.put("Course.id", Course_id);
        componentToName.put(Course_id, "Course.id");
        nameToComponent.put("CourseButton", CourseButton);
        componentToName.put(CourseButton, "CourseButton");
        nameToComponent.put("CourseClearButton", CourseClearButton);
        componentToName.put(CourseClearButton, "CourseClearButton");
        nameToComponent.put("CourseSaveButton", CourseSaveButton);
        componentToName.put(CourseSaveButton, "CourseSaveButton");
        nameToComponent.put("CourseDeleteButton", CourseDeleteButton);
        componentToName.put(CourseDeleteButton, "CourseDeleteButton");
        nameToComponent.put("tableBlock", tableBlock);
        componentToName.put(tableBlock, "tableBlock");
        nameToComponent.put("courseList", courseList_table);
        componentToName.put(courseList_table, "courseList");
        nameToComponent.put("Course2.code", Course2_code);
        componentToName.put(Course2_code, "Course2.code");
        nameToComponent.put("Course2.id", Course2_id);
        componentToName.put(Course2_id, "Course2.id");
        nameToComponent.put("Course2.name", Course2_name);
        componentToName.put(Course2_name, "Course2.name");
        nameToComponent.put("Course2.isActive", Course2_isActive);
        componentToName.put(Course2_isActive, "Course2.isActive");
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
    int listblockcourseList = 0;
/** Increases blocking count for the listblock courseList. Internal use only. */
    void increaseListblockcourseList() {
        debug(++listblockcourseList, "U:listblockcourseList");
    }
/** Decreases blocking count for the listblock courseList. Internal use only.  */
    void decreaseListblockcourseList() {
        debug(--listblockcourseList, "U:listblockcourseList");
    }
/** Returns true if listblock is blocking events. Internal use only.
 * @return True if listblock is blocking events.
 */
    boolean isBlockedListblockcourseList() {
        return listblockcourseList == 0;
    }
    int listblockValueChangedcourseList = 0;     
/** Internal use. */
    void increaseListblockVCcourseList() {
        debug(++listblockValueChangedcourseList, "U:listblockValueChangedcourseList");
    }
/** Internal use */
    void decreaseListblockVCcourseList() {
        debug(--listblockValueChangedcourseList, "U:listblockValueChangedcourseList");
    }
/** Internal use
 * @return Internal use.
 */
    boolean isBlockedListblockVCcourseList() {
        return listblockValueChangedcourseList == 0;
    }
    }
    Blocker block = new Blocker();
    
     /** Initializes the Window window block */
    private void initWindow() {
        Window_outer.setPreferredSize(new Dimension(600, 430));
        RepositoryProxy.setForegroundColor(Window,"Black");
        RepositoryProxy.setFont(Window,"Standard");
        Window_outer.setLayout(null);
        Window_outer.add(Window);   
        Window.setLocation(0,0);
        Window.setSize(600, 430);
        Window.setLayout(null);
        
        addInternalFrameListener(windowProc);
        addGenovaWindowListener(genovaWindowProc);
        initToolbar();
        initCourseClass();
        inittableBlock();
    }
    
    /** Initializes the Toolbar toolbar */
    private void initToolbar() {
        setGenovaToolBar(Toolbar);
    }
    
    /** Initializes the CourseClass container */
    private void initCourseClass() {
        Window.add(CourseClass);
        CourseClass.setLocation(11+0,11+0);
        CourseClass.setSize(297, 144);
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
        CourseData.setSize(234, 100);
        RepositoryProxy.setBorder(CourseData,1,"Course");
        RepositoryProxy.setForegroundColor(CourseData,"Black");
        RepositoryProxy.setFont(CourseData,"Standard");
        CourseData.setLayout(null);
        
        initCourseCodeLabelLabel();
        initCourse_code();
        initCourseNameLabelLabel();
        initCourse_name();
        initCourseIsActiveLabelLabel();
        initCourse_isActive();
        initCourse_id();
    }
    
    /** Initializes the CourseButton container */
    private void initCourseButton() {
        CourseClass.add(CourseButton);
        CourseButton.setLocation(259+3,17+10);
        CourseButton.setSize(24, 78);
        RepositoryProxy.setBorder(CourseButton,1,"Course");
        RepositoryProxy.setForegroundColor(CourseButton,"Black");
        RepositoryProxy.setFont(CourseButton,"Standard");
        CourseButton.setLayout(null);
        
        initCourseClearButton();
        initCourseSaveButton();
        initCourseDeleteButton();
    }
    
    /** Initializes the tableBlock container */
    private void inittableBlock() {
        Window.add(tableBlock);
        tableBlock.setLocation(11+0,161+0);
        tableBlock.setSize(400, 200);
        RepositoryProxy.setBorder(tableBlock,1,"");
        RepositoryProxy.setForegroundColor(tableBlock,"Black");
        RepositoryProxy.setFont(tableBlock,"Standard");
        tableBlock.setLayout(null);
        
        initcourseList();
    }
    
    /** Initializes the courseList container */
    private void initcourseList() {
        initCourse2_code();
        initCourse2_id();
        initCourse2_name();
        initCourse2_isActive();
        
        /* Her kommer generert kode for Listblock:courseListSetup*/
        
        courseListtheModel = new courseListModel(controller);
        courseList_table = new GenovaTable(courseListtheModel, "courseList", controller.listblockMethodscourseList) {
            /** Internal use.
             * @param row Internal use.
             * @param column Internal use.
             * @return Internal use.
             */
            public TableCellEditor getCellEditor(int row, int column) {
                if(column < 0 || row < 0) {
                    return null;
                }
                LineListblockcourseList line = controller.listblockMethodscourseList.getListblockLinePrivate(row);
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
                        int convertedColumn = ((Integer)courseList_indexes.elementAt(column)).intValue();
                        // commented out as part of bug fix, 11. 5, 2006
                        // setDatatypecourseList((JTextComponent)((DefaultCellEditor)t).getComponent(),convertedColumn);
                    } /* else if (c instanceof GenovaComboBox) {
                        syncComboboxSelection((GenovaComboBox)c, row);
                    } */
                }
                return t;
            }
        };

        courseList_table.addVetoableSelectionListener
                (new GenovaVetoableSelectionListener() {

                    /**
                     * Helper method. Returns the
                     * set of Strings containing the
                     * foreign nodes names to check. The
                     * contents of the set is decided by the
                     * listblockMethodscourseList's checkForeignNodes
                     * method.
                     */
                    private Set getForeignNodes() {
                        Set foreignNodes = null;
                        if (controller.listblockMethodscourseList
                                .checkForeignNodes()) {
                            foreignNodes = new HashSet();
                            foreignNodes.addAll(controller
                                    .listblockMethodscourseList
                                            .getRoleNamesInUse());
                            foreignNodes.remove(controller
                                    .theCourse2.getRoleName());
                            foreignNodes.removeAll(controller
                                    .theCourse2.getAllChildNames());
                        }
                        return foreignNodes;
                    }

                    public void vetoableSelectionChange
                            (GenovaVetoableSelectionEvent e) {
                        if (!controller.theCourse2.checkRowSelection(e.getOldSelection(), e.getNewSelection(), getForeignNodes())) {
                            e.veto(true);
                        }
                    }
                });
        
        courseList_table.addMouseListener(mouseProc);
        defaultBackgroundcourseList =  courseList_table.getBackground();
        defaultSelectedBackgroundcourseList = courseList_table.getSelectionBackground();
        
        /* This one activates popup for the table */
        courseList_table.addKeyListener(new KeyAdapter() {
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
        controller.tabListFromNodeNametableBlock.put("courseList", courseList_table);
        controller.tabListFromComponenttableBlock.put(courseList_table, "courseList");
        
        /* Her kommer generert kode for ListColumn:courseListSetup*/
        
        courseList_headers.addElement("Coursecode");
        courseList_widths.addElement(new Integer(144));
        courseList_indexes.add(new Integer(0));
        
        /* Her kommer generert kode for ListColumn:courseListSetup*/
        
        
        /* Her kommer generert kode for ListColumn:courseListSetup*/
        
        courseList_headers.addElement("name");
        courseList_widths.addElement(new Integer(144));
        courseList_indexes.add(new Integer(2));
        
        /* Her kommer generert kode for ListColumn:courseListSetup*/
        
        courseList_headers.addElement("Active course");
        courseList_widths.addElement(new Integer(112));
        courseList_indexes.add(new Integer(3));
        
        /* Her kommer generert kode for Listblock:courseListSetupNearEnd*/
        
        courseList_table.createDefaultColumnsFromModel();
        courseListHeadersClicked = new boolean[courseList_table.getColumnCount()];
        courseListTableHeader = new ToolTipHeader( courseList_table.getTableHeader().getColumnModel());
        courseList_table.setTableHeader(courseListTableHeader);
        
        courseListTableHeaderRenderer = new DefaultTableCellRenderer() {
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
                    return setHeaderPropscourseList(c, table, value, isSelected, hasFocus, row, column);
                }
            };
        
        /* Her kommer generert kode for ListColumn:courseListSetupEnd*/
        
        courseListCourse2codeColumn = courseList_table.getColumnModel().getColumn(courseList_indexes.indexOf(new Integer(0)));
        courseListCourse2codeColumn.setHeaderRenderer(courseListTableHeaderRenderer);
        {
            JTextField field = new JTextField();
            courseListCourse2codeColumn.setCellEditor(new DefaultCellEditor(field));
            field.setHorizontalAlignment(JTextField.LEFT);
        }
        courseListCourse2codeColumn.setCellRenderer(
                new GenovaTableCellRenderer(RepositoryProxy.getDocument(
                        7, 0,
                        controller.getApplication().getEnums(),
                        null,
                        FormatHelper.getDisplayrule(7,
                                "", 0,
                                0, 0),
                        0, false), JTextField.LEFT));
        ((GenovaTableCellRenderer)(courseListCourse2codeColumn.getCellRenderer())).setToolTipText("");
                    RepositoryProxy.setFont(Course2_code, "ListblockFont");
        
        /* Her kommer generert kode for ListColumn:courseListSetupEnd*/
        
                    RepositoryProxy.setFont(Course2_id, "ListblockFont");
        
        /* Her kommer generert kode for ListColumn:courseListSetupEnd*/
        
        courseListCourse2nameColumn = courseList_table.getColumnModel().getColumn(courseList_indexes.indexOf(new Integer(2)));
        courseListCourse2nameColumn.setHeaderRenderer(courseListTableHeaderRenderer);
        {
            JTextField field = new JTextField();
            courseListCourse2nameColumn.setCellEditor(new DefaultCellEditor(field));
            field.setHorizontalAlignment(JTextField.LEFT);
        }
        courseListCourse2nameColumn.setCellRenderer(
                new GenovaTableCellRenderer(RepositoryProxy.getDocument(
                        7, 0,
                        controller.getApplication().getEnums(),
                        null,
                        FormatHelper.getDisplayrule(7,
                                "", 0,
                                0, 0),
                        0, false), JTextField.LEFT));
        ((GenovaTableCellRenderer)(courseListCourse2nameColumn.getCellRenderer())).setToolTipText("");
                    RepositoryProxy.setFont(Course2_name, "ListblockFont");
        
        /* Her kommer generert kode for ListColumn:courseListSetupEnd*/
        
        courseListCourse2isActiveColumn = courseList_table.getColumnModel().getColumn(courseList_indexes.indexOf(new Integer(3)));
        courseListCourse2isActiveColumn.setHeaderRenderer(courseListTableHeaderRenderer);
                    RepositoryProxy.setFont(Course2_isActive, "ListblockFont");
        
        /* Her kommer generert kode for Listblock:courseListSetupHeader*/
        
        List headerToolTipStrings = new LinkedList();
        
        /* Her kommer generert kode for ListColumn:courseListSetupHeader*/
        
        headerToolTipStrings.add("");
        
        /* Her kommer generert kode for ListColumn:courseListSetupHeader*/
        
        
        /* Her kommer generert kode for ListColumn:courseListSetupHeader*/
        
        headerToolTipStrings.add("");
        
        /* Her kommer generert kode for ListColumn:courseListSetupHeader*/
        
        headerToolTipStrings.add("");
        
        /* Her kommer generert kode for Listblock:courseListSetupHeaderEnd*/
        
        courseListTableHeader.setToolTipStrings(headerToolTipStrings);
        DefaultTableCellRenderer tableCellRendererRIGHTcourseList = new DefaultTableCellRenderer() {
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
                LineListblockcourseList data = controller.listblockMethodscourseList.getListblockLinePrivate(row);
                return setTablePropscourseList(c, data, table, value, isSelected, hasFocus, row, column);
            }
        };
        
        DefaultTableCellRenderer tableCellRendererLEFTcourseList = new DefaultTableCellRenderer() {
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
                LineListblockcourseList data = controller.listblockMethodscourseList.getListblockLinePrivate(row);
                return setTablePropscourseList(c, data, table, value, isSelected, hasFocus, row, column);
            }
        };
        
        DefaultTableCellRenderer tableCellRendererCENTERcourseList = new DefaultTableCellRenderer() {
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
                LineListblockcourseList data = controller.listblockMethodscourseList.getListblockLinePrivate(row);
                return setTablePropscourseList(c, data, table, value, isSelected, hasFocus, row, column);
            }
        };
        
        tableCellRendererLEFTcourseList.setHorizontalAlignment(SwingConstants.LEFT);
        courseList_table.setDefaultRenderer( String.class, tableCellRendererLEFTcourseList);
        tableCellRendererRIGHTcourseList.setHorizontalAlignment(SwingConstants.RIGHT);
        tableCellRendererCENTERcourseList.setHorizontalAlignment(SwingConstants.CENTER);
        courseList_table.setDefaultRenderer( Integer.class, tableCellRendererRIGHTcourseList);
        courseList_table.setDefaultRenderer( Float.class, tableCellRendererRIGHTcourseList);
        courseList_table.setDefaultRenderer( Double.class, tableCellRendererRIGHTcourseList);
        courseList_table.setDefaultRenderer( Short.class, tableCellRendererRIGHTcourseList);
        courseList_table.setDefaultRenderer( Long.class, tableCellRendererRIGHTcourseList);
        //courseList_table.setDefaultRenderer( Boolean.class, tableCellRendererRIGHTcourseList);
        courseList_table.setDefaultRenderer( Character.class, tableCellRendererRIGHTcourseList);
        
        courseListTableHeaderRenderer.setHorizontalAlignment(SwingConstants.LEFT);       
        courseListTableHeader.setReorderingAllowed(false);
        
        courseList_pane = new JScrollPane(courseList_table);  
                     modifyScrollPane(courseList_pane);
        courseList.add(courseList_pane);
        courseList.setLayout(null);
        tableBlock.add(courseList);
        courseList.setLocation(0+0,0+0);
        courseList.setSize(406, 133);
        courseList_pane.setLocation(0,0);
        courseList_pane.setSize(406, 120);
        courseList_pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        courseList_table.setPreferredScrollableViewportSize(new Dimension(406, 120));
        courseList_table.setScrollPaneInUse(courseList_pane);
        courseList_pane.getHorizontalScrollBar().getComponent(0).setBackground(RepositoryProxy.getColorField("TRANSPARENT"));
        courseList_pane.getVerticalScrollBar().getComponent(0).setBackground(RepositoryProxy.getColorField("TRANSPARENT"));
        courseList_pane.getHorizontalScrollBar().getComponent(1).setBackground(RepositoryProxy.getColorField("TRANSPARENT"));
        courseList_pane.getVerticalScrollBar().getComponent(1).setBackground(RepositoryProxy.getColorField("TRANSPARENT"));
        RepositoryProxy.setForegroundColor(courseList_pane.getViewport(),"Black");
        
        courseList_table.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // adds a selection listener that displays the selected line in the edit field.
        courseList_table.addGenovaSelectionListener(new GenovaSelectionListener() {

           public void selectionChanged(GenovaSelectedEvent e) {
                ListblockLine selected = controller.listblockMethodscourseList
                        .getSelectedLineObject();
                if (selected != null) {
                    selected.displayInEditField();
                } else {
                    controller.listblockMethodscourseList.clearEditFields();
                }
            }
        });
        
        //View
        RepositoryProxy.setForegroundColor(courseList,"Black");
        RepositoryProxy.setFont(courseList,"Standard");
        for(int i=0; i < courseListtheModel.getColumnCount();i++) {
            TableColumn column = courseList_table.getColumnModel().getColumn(i);
            column.setPreferredWidth(((Integer)courseList_widths.elementAt(i)).intValue());
        }
        MouseAdapter listMouseListenercourseList = new MouseAdapter() {
            /** Internal use.
             * @param e Internal use.
             */
            public void mouseClicked(MouseEvent e) {
                TableColumnModel columnModel = courseList_table.getColumnModel();
                int viewColumn = columnModel.getColumnIndexAtX(e.getX());
                int column = courseList_table.convertColumnIndexToModel(viewColumn);
                if (e.getClickCount() == 1 && column != -1) {
                    controller.listblockMethodscourseList.listblockSortColumnsBy(column);
                }
            }
        };
        courseList_table.setColumnSelectionAllowed(false);
        courseListTableHeader.addMouseListener(listMouseListenercourseList);
        courseListTableHeader.addMouseListener(mouseProc);
        courseListTableHeader.addFocusListener(focusProc);
    }
// ABABAB
// Dette er starten {
    private void initcourseListCellEditors() {
        TableColumnModel columnModel = 
                courseList_table.getColumnModel();
        int colIndex;
        TableColumn column;
        if (controller.listblockMethodscourseList.
                hasColumn("Course2.code")) {         
            colIndex = controller.listblockMethodscourseList
                    .getColumnIndex("Course2.code"); 
            column = columnModel.getColumn(colIndex);
            column.setCellEditor(new no.genova.client.component.GDefaultCellEditor
                     (Course2_code));
           if ((Object) Course2_code instanceof JCheckBox) {
               Course2_code.setHorizontalAlignment(SwingConstants.CENTER);
           }
        }
        if (controller.listblockMethodscourseList.
                hasColumn("Course2.id")) {         
            colIndex = controller.listblockMethodscourseList
                    .getColumnIndex("Course2.id"); 
            column = columnModel.getColumn(colIndex);
            column.setCellEditor(new no.genova.client.component.GDefaultCellEditor
                     (Course2_id));
           if ((Object) Course2_id instanceof JCheckBox) {
               Course2_id.setHorizontalAlignment(SwingConstants.CENTER);
           }
        }
        if (controller.listblockMethodscourseList.
                hasColumn("Course2.name")) {         
            colIndex = controller.listblockMethodscourseList
                    .getColumnIndex("Course2.name"); 
            column = columnModel.getColumn(colIndex);
            column.setCellEditor(new no.genova.client.component.GDefaultCellEditor
                     (Course2_name));
           if ((Object) Course2_name instanceof JCheckBox) {
               Course2_name.setHorizontalAlignment(SwingConstants.CENTER);
           }
        }
        if (controller.listblockMethodscourseList.
                hasColumn("Course2.isActive")) {         
            colIndex = controller.listblockMethodscourseList
                    .getColumnIndex("Course2.isActive"); 
            column = columnModel.getColumn(colIndex);
            column.setCellEditor(new no.genova.client.component.GDefaultCellEditor
                     (Course2_isActive));
           if ((Object) Course2_isActive instanceof JCheckBox) {
               Course2_isActive.setHorizontalAlignment(SwingConstants.CENTER);
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
        Course_code.setLocation(82+0,0+0);
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
        
        // No Listener
        
    }
    /**
     * Initializes the CourseNameLabel label */
    private void initCourseNameLabelLabel() {
        CourseData.add(CourseNameLabelLabel);
        CourseNameLabelLabel.setLocation(0+0,28+0); 
        CourseNameLabelLabel.setSize(33, 17);
        RepositoryProxy.setForegroundColor(CourseNameLabelLabel,"Black");
        RepositoryProxy.setFont(CourseNameLabelLabel,"Standard");
    }
    
    /** Initializes the Course.name text component */
    private void initCourse_name() {
        Course_name.setName("Course.name");
        CourseData.add(Course_name);
        Course_name.setLocation(82+0,28+0);
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
    /**
     * Initializes the CourseIsActiveLabel label */
    private void initCourseIsActiveLabelLabel() {
        CourseData.add(CourseIsActiveLabelLabel);
        CourseIsActiveLabelLabel.setLocation(0+0,56+0); 
        CourseIsActiveLabelLabel.setSize(77, 17);
        RepositoryProxy.setForegroundColor(CourseIsActiveLabelLabel,"Black");
        RepositoryProxy.setFont(CourseIsActiveLabelLabel,"Standard");
    }
    
    /** Initializes the Course_isActive check button */
    private void initCourse_isActive() {
        controller.tabListFromNodeNameCourseData.put("Course.isActive", Course_isActive);
        controller.tabListFromComponentCourseData.put(Course_isActive, "Course.isActive");
        
        CourseData.add(Course_isActive);
        Course_isActive.setLocation(82+0,56+0);
        { // limit scope of width and height declarations.
            int width = 18;
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
    
    /** Initializes the Course.id text component */
    private void initCourse_id() {
        Course_id.setName("Course.id");
        CourseData.add(Course_id);
        Course_id.setLocation(82+0,78+0);
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
        
        //Course_id.setVisible(false || false);
        //Course_id.setEnabled(false);
        Course_id.setVisible(false); 
        Course_id.setEnabled(false); 
        disabledComponents.add(Course_id);
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
    
    /** Initializes the Course2.code text component */
    private void initCourse2_code() {
        Course2_code.setName("Course2.code");
        
        controller.tabListFromNodeNamecourseList.put("Course2.code", Course2_code);
        controller.tabListFromComponentcourseList.put(Course2_code, "Course2.code");
        
           //   Course2_code.setEditable(true);
        Course2_code.setEditable(true);
        
        //Course2_code.setVisible(true || true);
        //
        Course2_code.setInputJustification(JTextField.LEFT);
        Course2_code.setOutputJustification(JTextField.LEFT);
        Course2_code.setHorizontalAlignment(JTextField.LEFT);
        Course2_code.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(7, Course2_code, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(7,"",0,0,0),0,false);
        RepositoryProxy.setForegroundColor(Course2_code,"Black");
        RepositoryProxy.setFont(Course2_code,"Standard");
        
        // No Listener
        
    }
    
    /** Initializes the Course2.id text component */
    private void initCourse2_id() {
        Course2_id.setName("Course2.id");
        
        controller.tabListFromNodeNamecourseList.put("Course2.id", Course2_id);
        controller.tabListFromComponentcourseList.put(Course2_id, "Course2.id");
        
           //   Course2_id.setEditable(true);
        Course2_id.setEditable(true);
        
        //Course2_id.setVisible(true || true);
        //
        Course2_id.setInputJustification(JTextField.LEFT);
        Course2_id.setOutputJustification(JTextField.LEFT);
        Course2_id.setHorizontalAlignment(JTextField.LEFT);
        Course2_id.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(2, Course2_id, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
        RepositoryProxy.setForegroundColor(Course2_id,"Black");
        RepositoryProxy.setFont(Course2_id,"Standard");
        
        // No Listener
        
    }
    
    /** Initializes the Course2.name text component */
    private void initCourse2_name() {
        Course2_name.setName("Course2.name");
        
        controller.tabListFromNodeNamecourseList.put("Course2.name", Course2_name);
        controller.tabListFromComponentcourseList.put(Course2_name, "Course2.name");
        
           //   Course2_name.setEditable(true);
        Course2_name.setEditable(true);
        
        //Course2_name.setVisible(true || true);
        //
        Course2_name.setInputJustification(JTextField.LEFT);
        Course2_name.setOutputJustification(JTextField.LEFT);
        Course2_name.setHorizontalAlignment(JTextField.LEFT);
        Course2_name.setSelectAllOnFocus(true);
        RepositoryProxy.setDatatype(7, Course2_name, 0, controller.getApplication().getEnums(), null, 
              FormatHelper.getDisplayrule(7,"",0,0,0),0,false);
        RepositoryProxy.setForegroundColor(Course2_name,"Black");
        RepositoryProxy.setFont(Course2_name,"Standard");
        
        // No Listener
        
    }
    
    /** Initializes the Course2_isActive check button */
    private void initCourse2_isActive() {
        controller.tabListFromNodeNamecourseList.put("Course2.isActive", Course2_isActive);
        controller.tabListFromComponentcourseList.put(Course2_isActive, "Course2.isActive");
        
        RepositoryProxy.setForegroundColor(Course2_isActive,"Black");
        RepositoryProxy.setFont(Course2_isActive,"Standard");
        
        
        if(false) {
            Course2_isActive.addItemListener(itemProc);
        }
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
        cleartableBlock(); 
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
        Course_name.setInitialValue(null);
        Course_name.setValue(null);
        Course_isActive.setSelected(false);
        Course_id.setInitialValue(null);
        Course_id.setValue(null);
    }

    /**
     * Clears the CourseButton 
     */
    public void clearCourseButton() {
    }

    /**
     * Clears the tableBlock 
     */
    public void cleartableBlock() {
        clearcourseList(); 
    }

    /**
     * Clears the listblock courseList, both edit fields and 
     * lines are cleared.
     */
    public void clearcourseList() {
        controller.listblockMethodscourseList.purgeAllLines();
        Course2_code.setInitialValue(null);
        Course2_code.setValue(null);
        Course2_id.setInitialValue(null);
        Course2_id.setValue(null);
        Course2_name.setInitialValue(null);
        Course2_name.setValue(null);
        Course2_isActive.setSelected(false);
    }

    /**
     * Clears all window blocks in the dialog.    
     */
    public void clearCourse() {
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
    
    /** Model for listblock courseList. Redirects call to controller, so the
     * controller may choose to override value. If compiled with rt code
     * then the value from the model is sent as well.
     *
     * The developer should not access the model directly.
     */
    class courseListModel extends DefaultTableModel implements TableModelListener {
        CourseDefaultController controller;      
        
        courseListModel(CourseDefaultController controller) {
            this.controller = controller;
            addTableModelListener(this);
        }
        
        /** The number of columns (in the list block) 
         * @return Column count.
         */
        public int getColumnCount() {
           return courseList_headers.size(); 
        }
        /**
         * Number of rows
         * @return Row count.
         */
        public int getRowCount() {
            if(controller == null) {
                return 0;
            }
            if(true && controller.courseListNodeInfo != null) {
               return controller.courseListgetRowCount(controller.courseListNodeInfo.getVisualRowCount());
            }
            return controller.courseListgetRowCount(1);
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
            col = ((Integer)courseList_indexes.elementAt(col)).intValue();
            switch(col) {
      case 0: 
    if(objectVersionOfCourse2code instanceof JComboBox && controller.view.block.isBlockedListblockcourseList()) {
        controller.view.block.increaseListblockcourseList();
        selectedInCombobox((GenovaComboBox)objectVersionOfCourse2code, null);
        controller.view.block.decreaseListblockcourseList();
    }

    break;
      case 1: 
    if(objectVersionOfCourse2id instanceof JComboBox && controller.view.block.isBlockedListblockcourseList()) {
        controller.view.block.increaseListblockcourseList();
        selectedInCombobox((GenovaComboBox)objectVersionOfCourse2id, null);
        controller.view.block.decreaseListblockcourseList();
    }

    break;
      case 2: 
    if(objectVersionOfCourse2name instanceof JComboBox && controller.view.block.isBlockedListblockcourseList()) {
        controller.view.block.increaseListblockcourseList();
        selectedInCombobox((GenovaComboBox)objectVersionOfCourse2name, null);
        controller.view.block.decreaseListblockcourseList();
    }

    break;
      case 3: 
    if(objectVersionOfCourse2isActive instanceof JComboBox && controller.view.block.isBlockedListblockcourseList()) {
        controller.view.block.increaseListblockcourseList();
        selectedInCombobox((GenovaComboBox)objectVersionOfCourse2isActive, null);
        controller.view.block.decreaseListblockcourseList();
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
            if(courseList_indexes == null) {
                return "";
            }
            LineListblockcourseList theLine = controller.listblockMethodscourseList.getListblockLinePrivate(row);
            if (theLine == null) {
                return null; // happens when system triggers a repaint 
                             // while a server-action is updating the model.
            }
            col = ((Integer)courseList_indexes.elementAt(col)).intValue();
            switch(col) {
                
                /* Her kommer generert kode for ListColumn:courseListGetTableValue rt*/
                
                case 0: 
                    retVal = theLine.cellValueColumn0;
                    if (retVal == null) {
                        retVal = getNullValueForCell("Course2.code");
                    }
                break;
                
                /* Her kommer generert kode for ListColumn:courseListGetTableValue rt*/
                
                case 1: 
                    retVal = theLine.cellValueColumn1;
                    if (retVal == null) {
                        retVal = getNullValueForCell("Course2.id");
                    }
                break;
                
                /* Her kommer generert kode for ListColumn:courseListGetTableValue rt*/
                
                case 2: 
                    retVal = theLine.cellValueColumn2;
                    if (retVal == null) {
                        retVal = getNullValueForCell("Course2.name");
                    }
                break;
                
                /* Her kommer generert kode for ListColumn:courseListGetTableValue rt*/
                
                case 3: 
                    retVal = theLine.cellValueColumn3;
                    if (retVal == null) {
                        retVal = getNullValueForCell("Course2.isActive");
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
            
            courseListblockStopEditing++;
            if(row < courseList_table.getRowCount() && courseList_table.getSelectedRow() != row) {
                block.increaseListblockcourseList();
                courseList_table.addRowSelectionInterval(row, row);
                block.decreaseListblockcourseList();
            }
                LineListblockcourseList data = controller.listblockMethodscourseList.getListblockLinePrivate(row);
                
//                Course tmpCourse2;
                
//                
                
//                
                
//                
                col = ((Integer)courseList_indexes.elementAt(col)).intValue();
                switch(col) {
                    
                    /* Her kommer generert kode for ListColumn:courseListSetTableValueSwitchBody rt*/
                    
                    case 0: 
                        data.cellValueColumn0 = value;
                        data.fromCellToListblockLine(origCol);
                        
                            if(objectVersionOfCourse2code instanceof JCheckBox) {
                                
                                if(value ==  null){
                                    if(data.oldCourse2 == null) {
                                        data.markAsChanged();
                                    }
                                } else {
                                    Boolean valueToTest = (Boolean)value;
                                    Boolean oldValueTest = null;
                                    if(data.oldCourse2 != null) {
                                        Object objectold = TypeTool.convert(data.oldCourse2.getCode());
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
                                
                                if(data.oldCourse2 == null) {
                                    data.markAsChanged();
                                }else {
                                    if(box.isEditable()) {
                                        valueToTest = (String)box.getEditor().getItem();
                                    }else {
                                        valueToTest = (String)box.getSelectedItem();
                                    }
                                    oldValueTest = controller.convertToString(data.oldCourse2.getCode(), TypeTool.getAttributeClassNameMethod(data.oldCourse2,"code"));
                                    
                                    if(!valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }else {
                                String oldValueTest;
                                
                                if(data.oldCourse2 != null) {
                                    oldValueTest = controller.convertToString(data.oldCourse2.getCode(), TypeTool.getAttributeClassNameMethod(data.oldCourse2,"code")).toString();
                                } else {
                                    oldValueTest = "";
                                }
                                if(value  != null){   
                                    if(!((String)value).equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }
                            
                            //                 tmpCourse2 = data.getCourse2();               
                            //                 controller.reflectAssign(tmpCourse2, controller.getClassName(tmpCourse2.code), "code", svalue);
                            //                 tmpCourse2.code = TypeTool.convert(svalue,tmpCourse2.getCode());
                            //                 data.setCourse2(tmpCourse2);
                            
                            /* Do a value changed test for textfield here */
                            if(objectVersionOfCourse2code instanceof JTextField && block.isBlockedListblockVCcourseList()) {
                                block.increaseListblockVCcourseList();
                                
                                final Object eventObject = controller.view.Course2_code;
                                ((JTextField)eventObject).setText((String)value);
                                
                                String jall = data.oldValueCourse2code;
                                data.oldValueCourse2code = (String)value;
                                valueChangedTextField(Course2_code, (String)value, jall, null);
                                block.decreaseListblockVCcourseList();
                            }
                            /* And A selected for ComboBox! */
                            if(objectVersionOfCourse2code instanceof JComboBox) {
                                controller.view.block.increaseListblockcourseList();
                                ((GenovaComboBox)objectVersionOfCourse2code).setSelectedItem(value);
                                selectedInCombobox((GenovaComboBox)objectVersionOfCourse2code, null);
                                controller.view.block.decreaseListblockcourseList();
                            }
                            
                            break;
//                        }
                    
                    /* Her kommer generert kode for ListColumn:courseListSetTableValueSwitchBody rt*/
                    
                    case 1: 
                        data.cellValueColumn1 = value;
                        data.fromCellToListblockLine(origCol);
                        
                            if(objectVersionOfCourse2id instanceof JCheckBox) {
                                
                                if(value ==  null){
                                    if(data.oldCourse2 == null) {
                                        data.markAsChanged();
                                    }
                                } else {
                                    Boolean valueToTest = (Boolean)value;
                                    Boolean oldValueTest = null;
                                    if(data.oldCourse2 != null) {
                                        Object objectold = TypeTool.convert(data.oldCourse2.getId());
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
                                
                                if(data.oldCourse2 == null) {
                                    data.markAsChanged();
                                }else {
                                    if(box.isEditable()) {
                                        valueToTest = (String)box.getEditor().getItem();
                                    }else {
                                        valueToTest = (String)box.getSelectedItem();
                                    }
                                    oldValueTest = controller.convertToString(data.oldCourse2.getId(), TypeTool.getAttributeClassNameMethod(data.oldCourse2,"id"));
                                    
                                    if(!valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }else {
                                String oldValueTest;
                                
                                if(data.oldCourse2 != null) {
                                    oldValueTest = controller.convertToString(data.oldCourse2.getId(), TypeTool.getAttributeClassNameMethod(data.oldCourse2,"id")).toString();
                                } else {
                                    oldValueTest = "";
                                }
                                if(value  != null){   
                                    if(!((String)value).equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }
                            
                            //                 tmpCourse2 = data.getCourse2();               
                            //                 controller.reflectAssign(tmpCourse2, controller.getClassName(tmpCourse2.id), "id", svalue);
                            //                 tmpCourse2.id = TypeTool.convert(svalue,tmpCourse2.getId());
                            //                 data.setCourse2(tmpCourse2);
                            
                            /* Do a value changed test for textfield here */
                            if(objectVersionOfCourse2id instanceof JTextField && block.isBlockedListblockVCcourseList()) {
                                block.increaseListblockVCcourseList();
                                
                                final Object eventObject = controller.view.Course2_id;
                                ((JTextField)eventObject).setText((String)value);
                                
                                String jall = data.oldValueCourse2id;
                                data.oldValueCourse2id = (String)value;
                                valueChangedTextField(Course2_id, (String)value, jall, null);
                                block.decreaseListblockVCcourseList();
                            }
                            /* And A selected for ComboBox! */
                            if(objectVersionOfCourse2id instanceof JComboBox) {
                                controller.view.block.increaseListblockcourseList();
                                ((GenovaComboBox)objectVersionOfCourse2id).setSelectedItem(value);
                                selectedInCombobox((GenovaComboBox)objectVersionOfCourse2id, null);
                                controller.view.block.decreaseListblockcourseList();
                            }
                            
                            break;
//                        }
                    
                    /* Her kommer generert kode for ListColumn:courseListSetTableValueSwitchBody rt*/
                    
                    case 2: 
                        data.cellValueColumn2 = value;
                        data.fromCellToListblockLine(origCol);
                        
                            if(objectVersionOfCourse2name instanceof JCheckBox) {
                                
                                if(value ==  null){
                                    if(data.oldCourse2 == null) {
                                        data.markAsChanged();
                                    }
                                } else {
                                    Boolean valueToTest = (Boolean)value;
                                    Boolean oldValueTest = null;
                                    if(data.oldCourse2 != null) {
                                        Object objectold = TypeTool.convert(data.oldCourse2.getName());
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
                                
                                if(data.oldCourse2 == null) {
                                    data.markAsChanged();
                                }else {
                                    if(box.isEditable()) {
                                        valueToTest = (String)box.getEditor().getItem();
                                    }else {
                                        valueToTest = (String)box.getSelectedItem();
                                    }
                                    oldValueTest = controller.convertToString(data.oldCourse2.getName(), TypeTool.getAttributeClassNameMethod(data.oldCourse2,"name"));
                                    
                                    if(!valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }else {
                                String oldValueTest;
                                
                                if(data.oldCourse2 != null) {
                                    oldValueTest = controller.convertToString(data.oldCourse2.getName(), TypeTool.getAttributeClassNameMethod(data.oldCourse2,"name")).toString();
                                } else {
                                    oldValueTest = "";
                                }
                                if(value  != null){   
                                    if(!((String)value).equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }
                            
                            //                 tmpCourse2 = data.getCourse2();               
                            //                 controller.reflectAssign(tmpCourse2, controller.getClassName(tmpCourse2.name), "name", svalue);
                            //                 tmpCourse2.name = TypeTool.convert(svalue,tmpCourse2.getName());
                            //                 data.setCourse2(tmpCourse2);
                            
                            /* Do a value changed test for textfield here */
                            if(objectVersionOfCourse2name instanceof JTextField && block.isBlockedListblockVCcourseList()) {
                                block.increaseListblockVCcourseList();
                                
                                final Object eventObject = controller.view.Course2_name;
                                ((JTextField)eventObject).setText((String)value);
                                
                                String jall = data.oldValueCourse2name;
                                data.oldValueCourse2name = (String)value;
                                valueChangedTextField(Course2_name, (String)value, jall, null);
                                block.decreaseListblockVCcourseList();
                            }
                            /* And A selected for ComboBox! */
                            if(objectVersionOfCourse2name instanceof JComboBox) {
                                controller.view.block.increaseListblockcourseList();
                                ((GenovaComboBox)objectVersionOfCourse2name).setSelectedItem(value);
                                selectedInCombobox((GenovaComboBox)objectVersionOfCourse2name, null);
                                controller.view.block.decreaseListblockcourseList();
                            }
                            
                            break;
//                        }
                    
                    /* Her kommer generert kode for ListColumn:courseListSetTableValueSwitchBody rt*/
                    
                    case 3: 
                        data.cellValueColumn3 = value;
                        data.fromCellToListblockLine(origCol);
                        
                            if(objectVersionOfCourse2isActive instanceof JCheckBox) {
                                
                                if(value ==  null){
                                    if(data.oldCourse2 == null) {
                                        data.markAsChanged();
                                    }
                                } else {
                                    Boolean valueToTest = (Boolean)value;
                                    Boolean oldValueTest = null;
                                    if(data.oldCourse2 != null) {
                                        Object objectold = TypeTool.convert(data.oldCourse2.getIsActive());
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
                                
                                if(data.oldCourse2 == null) {
                                    data.markAsChanged();
                                }else {
                                    if(box.isEditable()) {
                                        valueToTest = (String)box.getEditor().getItem();
                                    }else {
                                        valueToTest = (String)box.getSelectedItem();
                                    }
                                    oldValueTest = controller.convertToString(data.oldCourse2.getIsActive(), TypeTool.getAttributeClassNameMethod(data.oldCourse2,"isActive"));
                                    
                                    if(!valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }else {
                                String oldValueTest;
                                
                                if(data.oldCourse2 != null) {
                                    oldValueTest = controller.convertToString(data.oldCourse2.getIsActive(), TypeTool.getAttributeClassNameMethod(data.oldCourse2,"isActive")).toString();
                                } else {
                                    oldValueTest = "";
                                }
                                if(value  != null){   
                                    if(!((String)value).equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }
                            
                            //                 tmpCourse2 = data.getCourse2();               
                            //                 controller.reflectAssign(tmpCourse2, controller.getClassName(tmpCourse2.isActive), "isActive", svalue);
                            //                 tmpCourse2.isActive = TypeTool.convert(svalue,tmpCourse2.getIsActive());
                            //                 data.setCourse2(tmpCourse2);
                            
                            /* Do a value changed test for textfield here */
                            if(objectVersionOfCourse2isActive instanceof JTextField && block.isBlockedListblockVCcourseList()) {
                                block.increaseListblockVCcourseList();
                                
                                final Object eventObject = controller.view.Course2_isActive;
                                ((JTextField)eventObject).setText((String)value);
                                
                                String jall = data.oldValueCourse2isActive;
                                data.oldValueCourse2isActive = (String)value;
                                valueChangedTextField(Course2_isActive, (String)value, jall, null);
                                block.decreaseListblockVCcourseList();
                            }
                            /* And A selected for ComboBox! */
                            if(objectVersionOfCourse2isActive instanceof JComboBox) {
                                controller.view.block.increaseListblockcourseList();
                                ((GenovaComboBox)objectVersionOfCourse2isActive).setSelectedItem(value);
                                selectedInCombobox((GenovaComboBox)objectVersionOfCourse2isActive, null);
                                controller.view.block.decreaseListblockcourseList();
                            }
                            
                            break;
//                        }
                }
                data.fromCellToListblockLine(origCol);
                controller.courseListsetValueAt(value, row, col);
                courseListblockStopEditing--;
            }
    /**
     * Returns column name for given column.
     * @param col Column to get.
     * @return Column name, as defined in genova.
     */
            public String getColumnName(int col) {
                if(courseList_indexes == null) {
                    return "";
                }
                String retVal = "";
                col = ((Integer)courseList_indexes.elementAt(col)).intValue();
                
                switch(col) {
                    
                    /* Her kommer generert kode for ListColumn:courseListGetColumnName*/
                    
                    case 0: 
                        retVal = (String)courseList_headers.elementAt(courseList_indexes.indexOf(new Integer(0)));
                        break;
                    
                    /* Her kommer generert kode for ListColumn:courseListGetColumnName*/
                    
                    case 1: 
                        retVal = (String)courseList_headers.elementAt(courseList_indexes.indexOf(new Integer(1)));
                        break;
                    
                    /* Her kommer generert kode for ListColumn:courseListGetColumnName*/
                    
                    case 2: 
                        retVal = (String)courseList_headers.elementAt(courseList_indexes.indexOf(new Integer(2)));
                        break;
                    
                    /* Her kommer generert kode for ListColumn:courseListGetColumnName*/
                    
                    case 3: 
                        retVal = (String)courseList_headers.elementAt(courseList_indexes.indexOf(new Integer(3)));
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
        /** Enables or disable listblock courseList.
         * @param value True disabled the listblock, false enables.
         */
        public void setEnabledcourseList(boolean value) {
            courseList.setEnabled(value);
        }
        
        /** Hides or displays courseList 
         * @param value True it will be shown, false it will be invisible.
         */
        public void setShowncourseList(boolean value) {
            courseList.setVisible(value);
        }
        
        /* Her kommer generert kode for Listblock:courseListsetDatatype*/
        
        void setDatatypecourseList(JTextComponent component,int col) {
            switch(col) {
                
                /* Her kommer generert kode for ListColumn:courseListsetDatatype*/
                
                case 0:
                    RepositoryProxy.setDatatype(7, component, 0, controller.getApplication().getEnums(), null,
                                    FormatHelper.getDisplayrule(7,"",0,0,0),0,false);
                    return;
                
                /* Her kommer generert kode for ListColumn:courseListsetDatatype*/
                
                case 1:
                    RepositoryProxy.setDatatype(2, component, 0, controller.getApplication().getEnums(), null,
                                    FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
                    return;
                
                /* Her kommer generert kode for ListColumn:courseListsetDatatype*/
                
                case 2:
                    RepositoryProxy.setDatatype(7, component, 0, controller.getApplication().getEnums(), null,
                                    FormatHelper.getDisplayrule(7,"",0,0,0),0,false);
                    return;
                
                /* Her kommer generert kode for ListColumn:courseListsetDatatype*/
                
                case 3:
                    RepositoryProxy.setDatatype(9, component, 0, controller.getApplication().getEnums(), null,
                                    FormatHelper.getDisplayrule(9,"",5,0,0),5,false);
                    return;
            
            /* Her kommer generert kode for Listblock:courseListsetDatatypeEnd*/
            
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
        if (source.getRowCount() > 0 && block.isBlockedListblockcourseList() && source.equals(courseList_table)) {
            LineListblockcourseList selectedLine = 
                controller.listblockMethodscourseList.getSelectedLineObject();
            if (selectedLine != null) {
                selectedLine.displayInEditField();
            } else {
                controller.listblockMethodscourseList.clearEditFields();
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
                    
                    /* Her kommer generert kode for CheckButton:FocusLost*/
                    
                    oldValueCourse2isActive = valueChangedTestCheckButton(Course2_isActive, TypeTool.convertToString(Course2_isActive.isSelected()), oldValueCourse2isActive, e);
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
                    
                    /* Her kommer generert kode for CheckButton:FocusLost*/
                    
                    if((e.getStateChange() == ItemEvent.SELECTED ||
                        e.getStateChange() == ItemEvent.DESELECTED) && 
                        e.getSource() == Course2_isActive) {
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
                if(e.getSource() == courseListTableHeader) {
                    // display column header as "pressed"
                    TableColumnModel columnModel = courseList_table.getColumnModel();
                    int viewColumn = columnModel.getColumnIndexAtX(e.getX()); 
                    int column = courseList_table.convertColumnIndexToModel(viewColumn);
                    if(column<courseListHeadersClicked.length && column>-1){
                        courseListHeadersClicked[column] = true;
                        courseListTableHeader.resizeAndRepaint();
                    }
                }
            }
            public void mouseReleased(MouseEvent e) {
                // Every column header should be displayed as not pressed.
                boolean doRepaintcourseList = false;
                for (int i = 0; i < courseListHeadersClicked.length; i++) {
                    doRepaintcourseList = doRepaintcourseList || courseListHeadersClicked[i];
                    courseListHeadersClicked[i] = false;
                }
                if (doRepaintcourseList) {
                    courseListTableHeader.resizeAndRepaint();
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
                if (courseList_table == e.getSource()) {
                    selectionInListblockTest(courseList_table, courseList_table.getSelectedRows(), e);
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
            controller.closeCourse(new GenovaWindowEventHolder(e));
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
    
    /* Her kommer generert kode fra WindowBlock:WindowOpened*/
    
        if (blockWindowEventsWindow == 0) {
            blockWindowEventsWindow++;
        controller.findAll(new GenovaWindowEventHolder(e));
            blockWindowEventsWindow--;
        }
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
