// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package no.course.dialog.choosestudents;

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
 * ChooseStudents. This class is generated and should not be edited
 * in. If any changes are needed, do them in ChooseStudentsView.
 */ 
@SuppressWarnings("all")
public abstract class ChooseStudentsDefaultView extends GenovaDialogFrame implements BottomWindow {
    
    boolean selectItemOK = true;
    
    ChooseStudentsDefaultController controller;
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
    JInternalFrame theChooseStudentsInternalFrame = this;
    
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
    
    /* Her kommer generert kode for Listblock:Declaration*/
    
    // View
    JPopupMenu activePopupMenuchooseStudentsListBloack = null;
    JPanel chooseStudentsListBloack = new JPanel();
    chooseStudentsListBloackModel chooseStudentsListBloacktheModel = null;
    GenovaTable chooseStudentsListBloack_table = null;
    JScrollPane chooseStudentsListBloack_pane = null;
    Color defaultBackgroundchooseStudentsListBloack = null;
    Color defaultSelectedBackgroundchooseStudentsListBloack = null;
    boolean hasCellSelectionColorchooseStudentsListBloack = false;
    Vector chooseStudentsListBloack_headers = new Vector();
    boolean chooseStudentsListBloackHeadersClicked[];
    
    int chooseStudentsListBloackblockStopEditing = 0;
    
    /** Used to keep track of values used in auto count when parsing the 
     * columns. If they are invis, then no columns is added... 
     */
    Vector chooseStudentsListBloack_indexes = new Vector();
    
    GenovaTable chooseStudentsListBloackRowHeader;
    ToolTipHeader  chooseStudentsListBloackTableHeader;
    DefaultTableCellRenderer chooseStudentsListBloackTableHeaderRenderer;
    DefaultTableModel chooseStudentsListBloackHeaderModel;
    
    
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
    JComponent setHeaderPropschooseStudentsListBloack(JComponent c, JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        
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
        if(chooseStudentsListBloackHeadersClicked[column]) {                        
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
    Component setTablePropschooseStudentsListBloack(Component c, LineListblockchooseStudentsListBloack data, JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){                              
        RepositoryProxy.setFont(c, "ListblockFont");
        Color deletedColor = RepositoryProxy.getColorField("ListblockLineDeletedColor");
        Color newColor = RepositoryProxy.getColorField("ListblockLineNewColor");
        Color changedColor = RepositoryProxy.getColorField("ListblockLineChangedColor");
        
        if(value instanceof JCheckBox) {
            ((JComponent)value).setBackground(table.getBackground());
        }
        if(!hasCellSelectionColorchooseStudentsListBloack) {
            if(isSelected) {
                c.setBackground(defaultSelectedBackgroundchooseStudentsListBloack);
            } else {
                c.setBackground(defaultBackgroundchooseStudentsListBloack);
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
    
    /** The chooseStudentsListBloack_widths vector */
    protected Vector chooseStudentsListBloack_widths = new Vector();
    GenovaTextField Student_age = new GenovaTextField("");
    final Object objectVersionOfStudentage = Student_age;
    String oldValueStudentage;
    
    /* Her kommer generert kode for ListColumn:Declaration*/
    
    TableColumn chooseStudentsListBloackStudentageColumn;
    GenovaTextField Student_name = new GenovaTextField("");
    final Object objectVersionOfStudentname = Student_name;
    String oldValueStudentname;
    
    /* Her kommer generert kode for ListColumn:Declaration*/
    
    TableColumn chooseStudentsListBloackStudentnameColumn;
    GenovaTextField Student_studentNr = new GenovaTextField("");
    final Object objectVersionOfStudentstudentNr = Student_studentNr;
    String oldValueStudentstudentNr;
    
    /* Her kommer generert kode for ListColumn:Declaration*/
    
    TableColumn chooseStudentsListBloackStudentstudentNrColumn;
    
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
    public ChooseStudentsDefaultView(final ChooseStudentsDefaultController controller, GenovaEnums applicationEnums) {
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
        
        setTitle("");
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
        nameToComponent.put("chooseStudentsListBloack", chooseStudentsListBloack_table);
        componentToName.put(chooseStudentsListBloack_table, "chooseStudentsListBloack");
        nameToComponent.put("Student.age", Student_age);
        componentToName.put(Student_age, "Student.age");
        nameToComponent.put("Student.name", Student_name);
        componentToName.put(Student_name, "Student.name");
        nameToComponent.put("Student.studentNr", Student_studentNr);
        componentToName.put(Student_studentNr, "Student.studentNr");
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
    int listblockchooseStudentsListBloack = 0;
/** Increases blocking count for the listblock chooseStudentsListBloack. Internal use only. */
    void increaseListblockchooseStudentsListBloack() {
        debug(++listblockchooseStudentsListBloack, "U:listblockchooseStudentsListBloack");
    }
/** Decreases blocking count for the listblock chooseStudentsListBloack. Internal use only.  */
    void decreaseListblockchooseStudentsListBloack() {
        debug(--listblockchooseStudentsListBloack, "U:listblockchooseStudentsListBloack");
    }
/** Returns true if listblock is blocking events. Internal use only.
 * @return True if listblock is blocking events.
 */
    boolean isBlockedListblockchooseStudentsListBloack() {
        return listblockchooseStudentsListBloack == 0;
    }
    int listblockValueChangedchooseStudentsListBloack = 0;     
/** Internal use. */
    void increaseListblockVCchooseStudentsListBloack() {
        debug(++listblockValueChangedchooseStudentsListBloack, "U:listblockValueChangedchooseStudentsListBloack");
    }
/** Internal use */
    void decreaseListblockVCchooseStudentsListBloack() {
        debug(--listblockValueChangedchooseStudentsListBloack, "U:listblockValueChangedchooseStudentsListBloack");
    }
/** Internal use
 * @return Internal use.
 */
    boolean isBlockedListblockVCchooseStudentsListBloack() {
        return listblockValueChangedchooseStudentsListBloack == 0;
    }
    }
    Blocker block = new Blocker();
    
     /** Initializes the Window window block */
    private void initWindow() {
        Window_outer.setPreferredSize(new Dimension(755, 367));
        RepositoryProxy.setForegroundColor(Window,"Black");
        RepositoryProxy.setFont(Window,"Standard");
        Window_outer.setLayout(null);
        Window_outer.add(Window);   
        Window.setLocation(0,0);
        Window.setSize(755, 367);
        Window.setLayout(null);
        
        addInternalFrameListener(windowProc);
        addGenovaWindowListener(genovaWindowProc);
        initToolbar();
        initchooseStudentsListBloack();
    }
    
    /** Initializes the Toolbar toolbar */
    private void initToolbar() {
        setGenovaToolBar(Toolbar);
    }
    
    /** Initializes the chooseStudentsListBloack container */
    private void initchooseStudentsListBloack() {
        initStudent_age();
        initStudent_name();
        initStudent_studentNr();
        
        /* Her kommer generert kode for Listblock:chooseStudentsListBloackSetup*/
        
        chooseStudentsListBloacktheModel = new chooseStudentsListBloackModel(controller);
        chooseStudentsListBloack_table = new GenovaTable(chooseStudentsListBloacktheModel, "chooseStudentsListBloack", controller.listblockMethodschooseStudentsListBloack) {
            /** Internal use.
             * @param row Internal use.
             * @param column Internal use.
             * @return Internal use.
             */
            public TableCellEditor getCellEditor(int row, int column) {
                if(column < 0 || row < 0) {
                    return null;
                }
                LineListblockchooseStudentsListBloack line = controller.listblockMethodschooseStudentsListBloack.getListblockLinePrivate(row);
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
                        int convertedColumn = ((Integer)chooseStudentsListBloack_indexes.elementAt(column)).intValue();
                        // commented out as part of bug fix, 11. 5, 2006
                        // setDatatypechooseStudentsListBloack((JTextComponent)((DefaultCellEditor)t).getComponent(),convertedColumn);
                    } /* else if (c instanceof GenovaComboBox) {
                        syncComboboxSelection((GenovaComboBox)c, row);
                    } */
                }
                return t;
            }
        };

        chooseStudentsListBloack_table.addVetoableSelectionListener
                (new GenovaVetoableSelectionListener() {

                    /**
                     * Helper method. Returns the
                     * set of Strings containing the
                     * foreign nodes names to check. The
                     * contents of the set is decided by the
                     * listblockMethodschooseStudentsListBloack's checkForeignNodes
                     * method.
                     */
                    private Set getForeignNodes() {
                        Set foreignNodes = null;
                        if (controller.listblockMethodschooseStudentsListBloack
                                .checkForeignNodes()) {
                            foreignNodes = new HashSet();
                            foreignNodes.addAll(controller
                                    .listblockMethodschooseStudentsListBloack
                                            .getRoleNamesInUse());
                            foreignNodes.remove(controller
                                    .theStudent.getRoleName());
                            foreignNodes.removeAll(controller
                                    .theStudent.getAllChildNames());
                        }
                        return foreignNodes;
                    }

                    public void vetoableSelectionChange
                            (GenovaVetoableSelectionEvent e) {
                        if (!controller.theStudent.checkRowSelection(e.getOldSelection(), e.getNewSelection(), getForeignNodes())) {
                            e.veto(true);
                        }
                    }
                });
        
        chooseStudentsListBloack_table.addMouseListener(mouseProc);
        defaultBackgroundchooseStudentsListBloack =  chooseStudentsListBloack_table.getBackground();
        defaultSelectedBackgroundchooseStudentsListBloack = chooseStudentsListBloack_table.getSelectionBackground();
        
        /* This one activates popup for the table */
        chooseStudentsListBloack_table.addKeyListener(new KeyAdapter() {
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
        controller.tabListFromNodeNameWindow.put("chooseStudentsListBloack", chooseStudentsListBloack_table);
        controller.tabListFromComponentWindow.put(chooseStudentsListBloack_table, "chooseStudentsListBloack");
        
        /* Her kommer generert kode for ListColumn:chooseStudentsListBloackSetup*/
        
        chooseStudentsListBloack_headers.addElement("age");
        chooseStudentsListBloack_widths.addElement(new Integer(137));
        chooseStudentsListBloack_indexes.add(new Integer(0));
        
        /* Her kommer generert kode for ListColumn:chooseStudentsListBloackSetup*/
        
        chooseStudentsListBloack_headers.addElement("name");
        chooseStudentsListBloack_widths.addElement(new Integer(144));
        chooseStudentsListBloack_indexes.add(new Integer(1));
        
        /* Her kommer generert kode for ListColumn:chooseStudentsListBloackSetup*/
        
        chooseStudentsListBloack_headers.addElement("Student nr");
        chooseStudentsListBloack_widths.addElement(new Integer(137));
        chooseStudentsListBloack_indexes.add(new Integer(2));
        
        /* Her kommer generert kode for Listblock:chooseStudentsListBloackSetupNearEnd*/
        
        chooseStudentsListBloack_table.createDefaultColumnsFromModel();
        chooseStudentsListBloackHeadersClicked = new boolean[chooseStudentsListBloack_table.getColumnCount()];
        chooseStudentsListBloackTableHeader = new ToolTipHeader( chooseStudentsListBloack_table.getTableHeader().getColumnModel());
        chooseStudentsListBloack_table.setTableHeader(chooseStudentsListBloackTableHeader);
        
        chooseStudentsListBloackTableHeaderRenderer = new DefaultTableCellRenderer() {
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
                    return setHeaderPropschooseStudentsListBloack(c, table, value, isSelected, hasFocus, row, column);
                }
            };
        
        /* Her kommer generert kode for ListColumn:chooseStudentsListBloackSetupEnd*/
        
        chooseStudentsListBloackStudentageColumn = chooseStudentsListBloack_table.getColumnModel().getColumn(chooseStudentsListBloack_indexes.indexOf(new Integer(0)));
        chooseStudentsListBloackStudentageColumn.setHeaderRenderer(chooseStudentsListBloackTableHeaderRenderer);
        {
            JTextField field = new JTextField();
            chooseStudentsListBloackStudentageColumn.setCellEditor(new DefaultCellEditor(field));
            field.setHorizontalAlignment(JTextField.LEFT);
        }
        chooseStudentsListBloackStudentageColumn.setCellRenderer(
                new GenovaTableCellRenderer(RepositoryProxy.getDocument(
                        2, 0,
                        controller.getApplication().getEnums(),
                        null,
                        FormatHelper.getDisplayrule(2,
                                "", 11,
                                0, 0),
                        11, false), JTextField.LEFT));
        ((GenovaTableCellRenderer)(chooseStudentsListBloackStudentageColumn.getCellRenderer())).setToolTipText("");
                    RepositoryProxy.setFont(Student_age, "ListblockFont");
        
        /* Her kommer generert kode for ListColumn:chooseStudentsListBloackSetupEnd*/
        
        chooseStudentsListBloackStudentnameColumn = chooseStudentsListBloack_table.getColumnModel().getColumn(chooseStudentsListBloack_indexes.indexOf(new Integer(1)));
        chooseStudentsListBloackStudentnameColumn.setHeaderRenderer(chooseStudentsListBloackTableHeaderRenderer);
        {
            JTextField field = new JTextField();
            chooseStudentsListBloackStudentnameColumn.setCellEditor(new DefaultCellEditor(field));
            field.setHorizontalAlignment(JTextField.LEFT);
        }
        chooseStudentsListBloackStudentnameColumn.setCellRenderer(
                new GenovaTableCellRenderer(RepositoryProxy.getDocument(
                        7, 0,
                        controller.getApplication().getEnums(),
                        null,
                        FormatHelper.getDisplayrule(7,
                                "", 0,
                                0, 0),
                        0, false), JTextField.LEFT));
        ((GenovaTableCellRenderer)(chooseStudentsListBloackStudentnameColumn.getCellRenderer())).setToolTipText("");
                    RepositoryProxy.setFont(Student_name, "ListblockFont");
        
        /* Her kommer generert kode for ListColumn:chooseStudentsListBloackSetupEnd*/
        
        chooseStudentsListBloackStudentstudentNrColumn = chooseStudentsListBloack_table.getColumnModel().getColumn(chooseStudentsListBloack_indexes.indexOf(new Integer(2)));
        chooseStudentsListBloackStudentstudentNrColumn.setHeaderRenderer(chooseStudentsListBloackTableHeaderRenderer);
        {
            JTextField field = new JTextField();
            chooseStudentsListBloackStudentstudentNrColumn.setCellEditor(new DefaultCellEditor(field));
            field.setHorizontalAlignment(JTextField.LEFT);
        }
        chooseStudentsListBloackStudentstudentNrColumn.setCellRenderer(
                new GenovaTableCellRenderer(RepositoryProxy.getDocument(
                        2, 0,
                        controller.getApplication().getEnums(),
                        null,
                        FormatHelper.getDisplayrule(2,
                                "", 11,
                                0, 0),
                        11, false), JTextField.LEFT));
        ((GenovaTableCellRenderer)(chooseStudentsListBloackStudentstudentNrColumn.getCellRenderer())).setToolTipText("");
                    RepositoryProxy.setFont(Student_studentNr, "ListblockFont");
        
        /* Her kommer generert kode for Listblock:chooseStudentsListBloackSetupHeader*/
        
        List headerToolTipStrings = new LinkedList();
        
        /* Her kommer generert kode for ListColumn:chooseStudentsListBloackSetupHeader*/
        
        headerToolTipStrings.add("");
        
        /* Her kommer generert kode for ListColumn:chooseStudentsListBloackSetupHeader*/
        
        headerToolTipStrings.add("");
        
        /* Her kommer generert kode for ListColumn:chooseStudentsListBloackSetupHeader*/
        
        headerToolTipStrings.add("");
        
        /* Her kommer generert kode for Listblock:chooseStudentsListBloackSetupHeaderEnd*/
        
        chooseStudentsListBloackTableHeader.setToolTipStrings(headerToolTipStrings);
        DefaultTableCellRenderer tableCellRendererRIGHTchooseStudentsListBloack = new DefaultTableCellRenderer() {
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
                LineListblockchooseStudentsListBloack data = controller.listblockMethodschooseStudentsListBloack.getListblockLinePrivate(row);
                return setTablePropschooseStudentsListBloack(c, data, table, value, isSelected, hasFocus, row, column);
            }
        };
        
        DefaultTableCellRenderer tableCellRendererLEFTchooseStudentsListBloack = new DefaultTableCellRenderer() {
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
                LineListblockchooseStudentsListBloack data = controller.listblockMethodschooseStudentsListBloack.getListblockLinePrivate(row);
                return setTablePropschooseStudentsListBloack(c, data, table, value, isSelected, hasFocus, row, column);
            }
        };
        
        DefaultTableCellRenderer tableCellRendererCENTERchooseStudentsListBloack = new DefaultTableCellRenderer() {
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
                LineListblockchooseStudentsListBloack data = controller.listblockMethodschooseStudentsListBloack.getListblockLinePrivate(row);
                return setTablePropschooseStudentsListBloack(c, data, table, value, isSelected, hasFocus, row, column);
            }
        };
        
        tableCellRendererLEFTchooseStudentsListBloack.setHorizontalAlignment(SwingConstants.LEFT);
        chooseStudentsListBloack_table.setDefaultRenderer( String.class, tableCellRendererLEFTchooseStudentsListBloack);
        tableCellRendererRIGHTchooseStudentsListBloack.setHorizontalAlignment(SwingConstants.RIGHT);
        tableCellRendererCENTERchooseStudentsListBloack.setHorizontalAlignment(SwingConstants.CENTER);
        chooseStudentsListBloack_table.setDefaultRenderer( Integer.class, tableCellRendererRIGHTchooseStudentsListBloack);
        chooseStudentsListBloack_table.setDefaultRenderer( Float.class, tableCellRendererRIGHTchooseStudentsListBloack);
        chooseStudentsListBloack_table.setDefaultRenderer( Double.class, tableCellRendererRIGHTchooseStudentsListBloack);
        chooseStudentsListBloack_table.setDefaultRenderer( Short.class, tableCellRendererRIGHTchooseStudentsListBloack);
        chooseStudentsListBloack_table.setDefaultRenderer( Long.class, tableCellRendererRIGHTchooseStudentsListBloack);
        //chooseStudentsListBloack_table.setDefaultRenderer( Boolean.class, tableCellRendererRIGHTchooseStudentsListBloack);
        chooseStudentsListBloack_table.setDefaultRenderer( Character.class, tableCellRendererRIGHTchooseStudentsListBloack);
        
        chooseStudentsListBloackTableHeaderRenderer.setHorizontalAlignment(SwingConstants.LEFT);       
        chooseStudentsListBloackTableHeader.setReorderingAllowed(false);
        
        chooseStudentsListBloack_pane = new JScrollPane(chooseStudentsListBloack_table);  
                     modifyScrollPane(chooseStudentsListBloack_pane);
        chooseStudentsListBloack.add(chooseStudentsListBloack_pane);
        chooseStudentsListBloack.setLayout(null);
        Window.add(chooseStudentsListBloack);
        chooseStudentsListBloack.setLocation(11+0,11+0);
        chooseStudentsListBloack.setSize(424, 133);
        chooseStudentsListBloack_pane.setLocation(0,0);
        chooseStudentsListBloack_pane.setSize(424, 120);
        chooseStudentsListBloack_pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        chooseStudentsListBloack_table.setPreferredScrollableViewportSize(new Dimension(424, 120));
        chooseStudentsListBloack_table.setScrollPaneInUse(chooseStudentsListBloack_pane);
        chooseStudentsListBloack_pane.getHorizontalScrollBar().getComponent(0).setBackground(RepositoryProxy.getColorField("TRANSPARENT"));
        chooseStudentsListBloack_pane.getVerticalScrollBar().getComponent(0).setBackground(RepositoryProxy.getColorField("TRANSPARENT"));
        chooseStudentsListBloack_pane.getHorizontalScrollBar().getComponent(1).setBackground(RepositoryProxy.getColorField("TRANSPARENT"));
        chooseStudentsListBloack_pane.getVerticalScrollBar().getComponent(1).setBackground(RepositoryProxy.getColorField("TRANSPARENT"));
        RepositoryProxy.setForegroundColor(chooseStudentsListBloack_pane.getViewport(),"Black");
        
        chooseStudentsListBloack_table.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // adds a selection listener that displays the selected line in the edit field.
        chooseStudentsListBloack_table.addGenovaSelectionListener(new GenovaSelectionListener() {

           public void selectionChanged(GenovaSelectedEvent e) {
                ListblockLine selected = controller.listblockMethodschooseStudentsListBloack
                        .getSelectedLineObject();
                if (selected != null) {
                    selected.displayInEditField();
                } else {
                    controller.listblockMethodschooseStudentsListBloack.clearEditFields();
                }
            }
        });
        
        //View
        RepositoryProxy.setForegroundColor(chooseStudentsListBloack,"Black");
        RepositoryProxy.setFont(chooseStudentsListBloack,"Standard");
        for(int i=0; i < chooseStudentsListBloacktheModel.getColumnCount();i++) {
            TableColumn column = chooseStudentsListBloack_table.getColumnModel().getColumn(i);
            column.setPreferredWidth(((Integer)chooseStudentsListBloack_widths.elementAt(i)).intValue());
        }
        MouseAdapter listMouseListenerchooseStudentsListBloack = new MouseAdapter() {
            /** Internal use.
             * @param e Internal use.
             */
            public void mouseClicked(MouseEvent e) {
                TableColumnModel columnModel = chooseStudentsListBloack_table.getColumnModel();
                int viewColumn = columnModel.getColumnIndexAtX(e.getX());
                int column = chooseStudentsListBloack_table.convertColumnIndexToModel(viewColumn);
                if (e.getClickCount() == 1 && column != -1) {
                    controller.listblockMethodschooseStudentsListBloack.listblockSortColumnsBy(column);
                }
            }
        };
        chooseStudentsListBloack_table.setColumnSelectionAllowed(false);
        chooseStudentsListBloackTableHeader.addMouseListener(listMouseListenerchooseStudentsListBloack);
        chooseStudentsListBloackTableHeader.addMouseListener(mouseProc);
        chooseStudentsListBloackTableHeader.addFocusListener(focusProc);
    }
// ABABAB
// Dette er starten {
    private void initchooseStudentsListBloackCellEditors() {
        TableColumnModel columnModel = 
                chooseStudentsListBloack_table.getColumnModel();
        int colIndex;
        TableColumn column;
        if (controller.listblockMethodschooseStudentsListBloack.
                hasColumn("Student.age")) {         
            colIndex = controller.listblockMethodschooseStudentsListBloack
                    .getColumnIndex("Student.age"); 
            column = columnModel.getColumn(colIndex);
            column.setCellEditor(new no.genova.client.component.GDefaultCellEditor
                     (Student_age));
           if ((Object) Student_age instanceof JCheckBox) {
               Student_age.setHorizontalAlignment(SwingConstants.CENTER);
           }
        }
        if (controller.listblockMethodschooseStudentsListBloack.
                hasColumn("Student.name")) {         
            colIndex = controller.listblockMethodschooseStudentsListBloack
                    .getColumnIndex("Student.name"); 
            column = columnModel.getColumn(colIndex);
            column.setCellEditor(new no.genova.client.component.GDefaultCellEditor
                     (Student_name));
           if ((Object) Student_name instanceof JCheckBox) {
               Student_name.setHorizontalAlignment(SwingConstants.CENTER);
           }
        }
        if (controller.listblockMethodschooseStudentsListBloack.
                hasColumn("Student.studentNr")) {         
            colIndex = controller.listblockMethodschooseStudentsListBloack
                    .getColumnIndex("Student.studentNr"); 
            column = columnModel.getColumn(colIndex);
            column.setCellEditor(new no.genova.client.component.GDefaultCellEditor
                     (Student_studentNr));
           if ((Object) Student_studentNr instanceof JCheckBox) {
               Student_studentNr.setHorizontalAlignment(SwingConstants.CENTER);
           }
        }
         // Method might not do anything - silence code checkers.
        if (false && (columnModel == null 
                      || colIndex == -1
                      || column == null)) {
            colIndex++;
        }                 
    }
    
    /** Initializes the Student.age text component */
    private void initStudent_age() {
        Student_age.setName("Student.age");
        
        controller.tabListFromNodeNamechooseStudentsListBloack.put("Student.age", Student_age);
        controller.tabListFromComponentchooseStudentsListBloack.put(Student_age, "Student.age");
        
           //   Student_age.setEditable(true);
        Student_age.setEditable(true);
        
        //Student_age.setVisible(true || true);
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
    
    /** Initializes the Student.name text component */
    private void initStudent_name() {
        Student_name.setName("Student.name");
        
        controller.tabListFromNodeNamechooseStudentsListBloack.put("Student.name", Student_name);
        controller.tabListFromComponentchooseStudentsListBloack.put(Student_name, "Student.name");
        
           //   Student_name.setEditable(true);
        Student_name.setEditable(true);
        
        //Student_name.setVisible(true || true);
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
    
    /** Initializes the Student.studentNr text component */
    private void initStudent_studentNr() {
        Student_studentNr.setName("Student.studentNr");
        
        controller.tabListFromNodeNamechooseStudentsListBloack.put("Student.studentNr", Student_studentNr);
        controller.tabListFromComponentchooseStudentsListBloack.put(Student_studentNr, "Student.studentNr");
        
           //   Student_studentNr.setEditable(true);
        Student_studentNr.setEditable(true);
        
        //Student_studentNr.setVisible(true || true);
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
        clearchooseStudentsListBloack(); 
    }

    /**
     * Clears the listblock chooseStudentsListBloack, both edit fields and 
     * lines are cleared.
     */
    public void clearchooseStudentsListBloack() {
        controller.listblockMethodschooseStudentsListBloack.purgeAllLines();
        Student_age.setInitialValue(null);
        Student_age.setValue(null);
        Student_name.setInitialValue(null);
        Student_name.setValue(null);
        Student_studentNr.setInitialValue(null);
        Student_studentNr.setValue(null);
    }

    /**
     * Clears all window blocks in the dialog.    
     */
    public void clearChooseStudents() {
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
    
    /** Model for listblock chooseStudentsListBloack. Redirects call to controller, so the
     * controller may choose to override value. If compiled with rt code
     * then the value from the model is sent as well.
     *
     * The developer should not access the model directly.
     */
    class chooseStudentsListBloackModel extends DefaultTableModel implements TableModelListener {
        ChooseStudentsDefaultController controller;      
        
        chooseStudentsListBloackModel(ChooseStudentsDefaultController controller) {
            this.controller = controller;
            addTableModelListener(this);
        }
        
        /** The number of columns (in the list block) 
         * @return Column count.
         */
        public int getColumnCount() {
           return chooseStudentsListBloack_headers.size(); 
        }
        /**
         * Number of rows
         * @return Row count.
         */
        public int getRowCount() {
            if(controller == null) {
                return 0;
            }
            if(true && controller.chooseStudentsListBloackNodeInfo != null) {
               return controller.chooseStudentsListBloackgetRowCount(controller.chooseStudentsListBloackNodeInfo.getVisualRowCount());
            }
            return controller.chooseStudentsListBloackgetRowCount(1);
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
            col = ((Integer)chooseStudentsListBloack_indexes.elementAt(col)).intValue();
            switch(col) {
      case 0: 
    if(objectVersionOfStudentage instanceof JComboBox && controller.view.block.isBlockedListblockchooseStudentsListBloack()) {
        controller.view.block.increaseListblockchooseStudentsListBloack();
        selectedInCombobox((GenovaComboBox)objectVersionOfStudentage, null);
        controller.view.block.decreaseListblockchooseStudentsListBloack();
    }

    break;
      case 1: 
    if(objectVersionOfStudentname instanceof JComboBox && controller.view.block.isBlockedListblockchooseStudentsListBloack()) {
        controller.view.block.increaseListblockchooseStudentsListBloack();
        selectedInCombobox((GenovaComboBox)objectVersionOfStudentname, null);
        controller.view.block.decreaseListblockchooseStudentsListBloack();
    }

    break;
      case 2: 
    if(objectVersionOfStudentstudentNr instanceof JComboBox && controller.view.block.isBlockedListblockchooseStudentsListBloack()) {
        controller.view.block.increaseListblockchooseStudentsListBloack();
        selectedInCombobox((GenovaComboBox)objectVersionOfStudentstudentNr, null);
        controller.view.block.decreaseListblockchooseStudentsListBloack();
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
            if(chooseStudentsListBloack_indexes == null) {
                return "";
            }
            LineListblockchooseStudentsListBloack theLine = controller.listblockMethodschooseStudentsListBloack.getListblockLinePrivate(row);
            if (theLine == null) {
                return null; // happens when system triggers a repaint 
                             // while a server-action is updating the model.
            }
            col = ((Integer)chooseStudentsListBloack_indexes.elementAt(col)).intValue();
            switch(col) {
                
                /* Her kommer generert kode for ListColumn:chooseStudentsListBloackGetTableValue rt*/
                
                case 0: 
                    retVal = theLine.cellValueColumn0;
                    if (retVal == null) {
                        retVal = getNullValueForCell("Student.age");
                    }
                break;
                
                /* Her kommer generert kode for ListColumn:chooseStudentsListBloackGetTableValue rt*/
                
                case 1: 
                    retVal = theLine.cellValueColumn1;
                    if (retVal == null) {
                        retVal = getNullValueForCell("Student.name");
                    }
                break;
                
                /* Her kommer generert kode for ListColumn:chooseStudentsListBloackGetTableValue rt*/
                
                case 2: 
                    retVal = theLine.cellValueColumn2;
                    if (retVal == null) {
                        retVal = getNullValueForCell("Student.studentNr");
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
            
            chooseStudentsListBloackblockStopEditing++;
            if(row < chooseStudentsListBloack_table.getRowCount() && chooseStudentsListBloack_table.getSelectedRow() != row) {
                block.increaseListblockchooseStudentsListBloack();
                chooseStudentsListBloack_table.addRowSelectionInterval(row, row);
                block.decreaseListblockchooseStudentsListBloack();
            }
                LineListblockchooseStudentsListBloack data = controller.listblockMethodschooseStudentsListBloack.getListblockLinePrivate(row);
                
//                Student tmpStudent;
                
//                
                
//                
                col = ((Integer)chooseStudentsListBloack_indexes.elementAt(col)).intValue();
                switch(col) {
                    
                    /* Her kommer generert kode for ListColumn:chooseStudentsListBloackSetTableValueSwitchBody rt*/
                    
                    case 0: 
                        data.cellValueColumn0 = value;
                        data.fromCellToListblockLine(origCol);
                        
                            if(objectVersionOfStudentage instanceof JCheckBox) {
                                
                                if(value ==  null){
                                    if(data.oldStudent == null) {
                                        data.markAsChanged();
                                    }
                                } else {
                                    Boolean valueToTest = (Boolean)value;
                                    Boolean oldValueTest = null;
                                    if(data.oldStudent != null) {
                                        Object objectold = TypeTool.convert(data.oldStudent.getAge());
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
                                
                                if(data.oldStudent == null) {
                                    data.markAsChanged();
                                }else {
                                    if(box.isEditable()) {
                                        valueToTest = (String)box.getEditor().getItem();
                                    }else {
                                        valueToTest = (String)box.getSelectedItem();
                                    }
                                    oldValueTest = controller.convertToString(data.oldStudent.getAge(), TypeTool.getAttributeClassNameMethod(data.oldStudent,"age"));
                                    
                                    if(!valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }else {
                                String oldValueTest;
                                
                                if(data.oldStudent != null) {
                                    oldValueTest = controller.convertToString(data.oldStudent.getAge(), TypeTool.getAttributeClassNameMethod(data.oldStudent,"age")).toString();
                                } else {
                                    oldValueTest = "";
                                }
                                if(value  != null){   
                                    if(!((String)value).equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }
                            
                            //                 tmpStudent = data.getStudent();               
                            //                 controller.reflectAssign(tmpStudent, controller.getClassName(tmpStudent.age), "age", svalue);
                            //                 tmpStudent.age = TypeTool.convert(svalue,tmpStudent.getAge());
                            //                 data.setStudent(tmpStudent);
                            
                            /* Do a value changed test for textfield here */
                            if(objectVersionOfStudentage instanceof JTextField && block.isBlockedListblockVCchooseStudentsListBloack()) {
                                block.increaseListblockVCchooseStudentsListBloack();
                                
                                final Object eventObject = controller.view.Student_age;
                                ((JTextField)eventObject).setText((String)value);
                                
                                String jall = data.oldValueStudentage;
                                data.oldValueStudentage = (String)value;
                                valueChangedTextField(Student_age, (String)value, jall, null);
                                block.decreaseListblockVCchooseStudentsListBloack();
                            }
                            /* And A selected for ComboBox! */
                            if(objectVersionOfStudentage instanceof JComboBox) {
                                controller.view.block.increaseListblockchooseStudentsListBloack();
                                ((GenovaComboBox)objectVersionOfStudentage).setSelectedItem(value);
                                selectedInCombobox((GenovaComboBox)objectVersionOfStudentage, null);
                                controller.view.block.decreaseListblockchooseStudentsListBloack();
                            }
                            
                            break;
//                        }
                    
                    /* Her kommer generert kode for ListColumn:chooseStudentsListBloackSetTableValueSwitchBody rt*/
                    
                    case 1: 
                        data.cellValueColumn1 = value;
                        data.fromCellToListblockLine(origCol);
                        
                            if(objectVersionOfStudentname instanceof JCheckBox) {
                                
                                if(value ==  null){
                                    if(data.oldStudent == null) {
                                        data.markAsChanged();
                                    }
                                } else {
                                    Boolean valueToTest = (Boolean)value;
                                    Boolean oldValueTest = null;
                                    if(data.oldStudent != null) {
                                        Object objectold = TypeTool.convert(data.oldStudent.getName());
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
                                
                                if(data.oldStudent == null) {
                                    data.markAsChanged();
                                }else {
                                    if(box.isEditable()) {
                                        valueToTest = (String)box.getEditor().getItem();
                                    }else {
                                        valueToTest = (String)box.getSelectedItem();
                                    }
                                    oldValueTest = controller.convertToString(data.oldStudent.getName(), TypeTool.getAttributeClassNameMethod(data.oldStudent,"name"));
                                    
                                    if(!valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }else {
                                String oldValueTest;
                                
                                if(data.oldStudent != null) {
                                    oldValueTest = controller.convertToString(data.oldStudent.getName(), TypeTool.getAttributeClassNameMethod(data.oldStudent,"name")).toString();
                                } else {
                                    oldValueTest = "";
                                }
                                if(value  != null){   
                                    if(!((String)value).equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }
                            
                            //                 tmpStudent = data.getStudent();               
                            //                 controller.reflectAssign(tmpStudent, controller.getClassName(tmpStudent.name), "name", svalue);
                            //                 tmpStudent.name = TypeTool.convert(svalue,tmpStudent.getName());
                            //                 data.setStudent(tmpStudent);
                            
                            /* Do a value changed test for textfield here */
                            if(objectVersionOfStudentname instanceof JTextField && block.isBlockedListblockVCchooseStudentsListBloack()) {
                                block.increaseListblockVCchooseStudentsListBloack();
                                
                                final Object eventObject = controller.view.Student_name;
                                ((JTextField)eventObject).setText((String)value);
                                
                                String jall = data.oldValueStudentname;
                                data.oldValueStudentname = (String)value;
                                valueChangedTextField(Student_name, (String)value, jall, null);
                                block.decreaseListblockVCchooseStudentsListBloack();
                            }
                            /* And A selected for ComboBox! */
                            if(objectVersionOfStudentname instanceof JComboBox) {
                                controller.view.block.increaseListblockchooseStudentsListBloack();
                                ((GenovaComboBox)objectVersionOfStudentname).setSelectedItem(value);
                                selectedInCombobox((GenovaComboBox)objectVersionOfStudentname, null);
                                controller.view.block.decreaseListblockchooseStudentsListBloack();
                            }
                            
                            break;
//                        }
                    
                    /* Her kommer generert kode for ListColumn:chooseStudentsListBloackSetTableValueSwitchBody rt*/
                    
                    case 2: 
                        data.cellValueColumn2 = value;
                        data.fromCellToListblockLine(origCol);
                        
                            if(objectVersionOfStudentstudentNr instanceof JCheckBox) {
                                
                                if(value ==  null){
                                    if(data.oldStudent == null) {
                                        data.markAsChanged();
                                    }
                                } else {
                                    Boolean valueToTest = (Boolean)value;
                                    Boolean oldValueTest = null;
                                    if(data.oldStudent != null) {
                                        Object objectold = TypeTool.convert(data.oldStudent.getStudentNr());
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
                                
                                if(data.oldStudent == null) {
                                    data.markAsChanged();
                                }else {
                                    if(box.isEditable()) {
                                        valueToTest = (String)box.getEditor().getItem();
                                    }else {
                                        valueToTest = (String)box.getSelectedItem();
                                    }
                                    oldValueTest = controller.convertToString(data.oldStudent.getStudentNr(), TypeTool.getAttributeClassNameMethod(data.oldStudent,"studentNr"));
                                    
                                    if(!valueToTest.equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }else {
                                String oldValueTest;
                                
                                if(data.oldStudent != null) {
                                    oldValueTest = controller.convertToString(data.oldStudent.getStudentNr(), TypeTool.getAttributeClassNameMethod(data.oldStudent,"studentNr")).toString();
                                } else {
                                    oldValueTest = "";
                                }
                                if(value  != null){   
                                    if(!((String)value).equals(oldValueTest)) {
                                        data.markAsChanged();
                                    }
                                }
                            }
                            
                            //                 tmpStudent = data.getStudent();               
                            //                 controller.reflectAssign(tmpStudent, controller.getClassName(tmpStudent.studentNr), "studentNr", svalue);
                            //                 tmpStudent.studentNr = TypeTool.convert(svalue,tmpStudent.getStudentNr());
                            //                 data.setStudent(tmpStudent);
                            
                            /* Do a value changed test for textfield here */
                            if(objectVersionOfStudentstudentNr instanceof JTextField && block.isBlockedListblockVCchooseStudentsListBloack()) {
                                block.increaseListblockVCchooseStudentsListBloack();
                                
                                final Object eventObject = controller.view.Student_studentNr;
                                ((JTextField)eventObject).setText((String)value);
                                
                                String jall = data.oldValueStudentstudentNr;
                                data.oldValueStudentstudentNr = (String)value;
                                valueChangedTextField(Student_studentNr, (String)value, jall, null);
                                block.decreaseListblockVCchooseStudentsListBloack();
                            }
                            /* And A selected for ComboBox! */
                            if(objectVersionOfStudentstudentNr instanceof JComboBox) {
                                controller.view.block.increaseListblockchooseStudentsListBloack();
                                ((GenovaComboBox)objectVersionOfStudentstudentNr).setSelectedItem(value);
                                selectedInCombobox((GenovaComboBox)objectVersionOfStudentstudentNr, null);
                                controller.view.block.decreaseListblockchooseStudentsListBloack();
                            }
                            
                            break;
//                        }
                }
                data.fromCellToListblockLine(origCol);
                controller.chooseStudentsListBloacksetValueAt(value, row, col);
                chooseStudentsListBloackblockStopEditing--;
            }
    /**
     * Returns column name for given column.
     * @param col Column to get.
     * @return Column name, as defined in genova.
     */
            public String getColumnName(int col) {
                if(chooseStudentsListBloack_indexes == null) {
                    return "";
                }
                String retVal = "";
                col = ((Integer)chooseStudentsListBloack_indexes.elementAt(col)).intValue();
                
                switch(col) {
                    
                    /* Her kommer generert kode for ListColumn:chooseStudentsListBloackGetColumnName*/
                    
                    case 0: 
                        retVal = (String)chooseStudentsListBloack_headers.elementAt(chooseStudentsListBloack_indexes.indexOf(new Integer(0)));
                        break;
                    
                    /* Her kommer generert kode for ListColumn:chooseStudentsListBloackGetColumnName*/
                    
                    case 1: 
                        retVal = (String)chooseStudentsListBloack_headers.elementAt(chooseStudentsListBloack_indexes.indexOf(new Integer(1)));
                        break;
                    
                    /* Her kommer generert kode for ListColumn:chooseStudentsListBloackGetColumnName*/
                    
                    case 2: 
                        retVal = (String)chooseStudentsListBloack_headers.elementAt(chooseStudentsListBloack_indexes.indexOf(new Integer(2)));
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
        /** Enables or disable listblock chooseStudentsListBloack.
         * @param value True disabled the listblock, false enables.
         */
        public void setEnabledchooseStudentsListBloack(boolean value) {
            chooseStudentsListBloack.setEnabled(value);
        }
        
        /** Hides or displays chooseStudentsListBloack 
         * @param value True it will be shown, false it will be invisible.
         */
        public void setShownchooseStudentsListBloack(boolean value) {
            chooseStudentsListBloack.setVisible(value);
        }
        
        /* Her kommer generert kode for Listblock:chooseStudentsListBloacksetDatatype*/
        
        void setDatatypechooseStudentsListBloack(JTextComponent component,int col) {
            switch(col) {
                
                /* Her kommer generert kode for ListColumn:chooseStudentsListBloacksetDatatype*/
                
                case 0:
                    RepositoryProxy.setDatatype(2, component, 0, controller.getApplication().getEnums(), null,
                                    FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
                    return;
                
                /* Her kommer generert kode for ListColumn:chooseStudentsListBloacksetDatatype*/
                
                case 1:
                    RepositoryProxy.setDatatype(7, component, 0, controller.getApplication().getEnums(), null,
                                    FormatHelper.getDisplayrule(7,"",0,0,0),0,false);
                    return;
                
                /* Her kommer generert kode for ListColumn:chooseStudentsListBloacksetDatatype*/
                
                case 2:
                    RepositoryProxy.setDatatype(2, component, 0, controller.getApplication().getEnums(), null,
                                    FormatHelper.getDisplayrule(2,"",11,0,0),11,false);
                    return;
            
            /* Her kommer generert kode for Listblock:chooseStudentsListBloacksetDatatypeEnd*/
            
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
        if (source.getRowCount() > 0 && block.isBlockedListblockchooseStudentsListBloack() && source.equals(chooseStudentsListBloack_table)) {
            LineListblockchooseStudentsListBloack selectedLine = 
                controller.listblockMethodschooseStudentsListBloack.getSelectedLineObject();
            if (selectedLine != null) {
                selectedLine.displayInEditField();
            } else {
                controller.listblockMethodschooseStudentsListBloack.clearEditFields();
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
                if(e.getSource() == chooseStudentsListBloackTableHeader) {
                    // display column header as "pressed"
                    TableColumnModel columnModel = chooseStudentsListBloack_table.getColumnModel();
                    int viewColumn = columnModel.getColumnIndexAtX(e.getX()); 
                    int column = chooseStudentsListBloack_table.convertColumnIndexToModel(viewColumn);
                    if(column<chooseStudentsListBloackHeadersClicked.length && column>-1){
                        chooseStudentsListBloackHeadersClicked[column] = true;
                        chooseStudentsListBloackTableHeader.resizeAndRepaint();
                    }
                }
            }
            public void mouseReleased(MouseEvent e) {
                // Every column header should be displayed as not pressed.
                boolean doRepaintchooseStudentsListBloack = false;
                for (int i = 0; i < chooseStudentsListBloackHeadersClicked.length; i++) {
                    doRepaintchooseStudentsListBloack = doRepaintchooseStudentsListBloack || chooseStudentsListBloackHeadersClicked[i];
                    chooseStudentsListBloackHeadersClicked[i] = false;
                }
                if (doRepaintchooseStudentsListBloack) {
                    chooseStudentsListBloackTableHeader.resizeAndRepaint();
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
                if (chooseStudentsListBloack_table == e.getSource()) {
                    selectionInListblockTest(chooseStudentsListBloack_table, chooseStudentsListBloack_table.getSelectedRows(), e);
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
            controller.closeChooseStudents(new GenovaWindowEventHolder(e));
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
