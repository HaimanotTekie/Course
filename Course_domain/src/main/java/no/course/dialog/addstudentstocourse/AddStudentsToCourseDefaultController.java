// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package no.course.dialog.addstudentstocourse;
import java.util.List;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Collection;
import java.util.Collections;
import java.awt.Cursor;
import java.awt.Component;
import java.awt.Container;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Rectangle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import javax.swing.table.TableColumn;
import java.beans.PropertyVetoException;

import no.genova.domain.DomainUtil;
import no.genova.exception.*;

/**
 * The following imports are known to be used. To avoid potentially
 * errors due to lack of imports no.genova.client.support.*; 
 * is added last.
 */ 
import no.esito.util.ServiceLoader;
import no.genova.client.event.GenovaEventHolder;
import no.genova.client.event.GenovaWindowEventHolder;
import no.genova.client.event.GenovaDataEvent;
import no.genova.client.support.ApplicationMethods;
import no.genova.client.support.GenovaDialogController;
import no.genova.client.support.NodeInfoList;
import no.genova.client.support.LinkField;
import no.genova.client.support.RoleObject;
import no.genova.client.support.ObjectSelectionNode;
import no.genova.client.support.ClearTool;
import no.genova.client.support.GenovaTable;
import no.genova.client.support.Listblock;
import no.genova.client.support.ListblockLine;
import no.genova.client.support.JComponentCellEditor;
import no.genova.client.support.ECheckResult;
import no.genova.domain.GenovaEnums;
import no.genova.domain.DomainProxy;
import no.genova.domain.DomainObjectProxy;
import no.genova.client.support.GenovaWorker;
import no.genova.client.support.DialogBoxTool;
import no.genova.client.support.DialogBlocker;
import no.genova.client.support.*; 
import no.genova.client.support.message.ClientDispatcherContext;

import no.genova.message.CRuntimeMsg;
import no.genova.message.DispatcherContext;
import no.genova.message.Message;
import no.genova.message.MessageDispatcher;
import no.genova.message.MessageDispatcherSetup;
import no.genova.message.MessageFactory;
import no.genova.message.MessageSystem;
import no.genova.message.MessageReply;
import no.genova.message.MessageReplyType;
import no.genova.message.MessageTypeEnum;

import no.genova.service.print.*;

/**
 * The following imports are known to be used. To avoid potentially
 * errors due to lack of imports no.genova.support.*; 
 * is added last.
 */ 
import no.genova.support.TypeTool;
import no.genova.support.GenovaEnumerator;
import no.genova.support.ObjectSelection;
import no.genova.support.ClientContext;
import no.genova.support.*;

import no.course.domain.Course;
import no.course.domain.Student;
import no.course.domain.StudentCourse;

/**
 * Public class interpreting the controller part of
 * AddStudentsToCourse. This file is generated for each generation in
 * Genova. Do not make changes in this file. All user added code
 * should be done in class AddStudentsToCourse.
 * To access mother application, use variable
 * 'application'.
 */ 
@SuppressWarnings("all")
public abstract class AddStudentsToCourseDefaultController implements GenovaDialogController {
    GenovaEnums applicationEnums;
    /** Holds the name of the server application */
    private String serverApplicationName = "CourseMain";
    /** Global reference to the domain proxy factory */
    protected DomainProxy domainProxy;
    /** Used when deciding whether to perform check change on
     * this dialog or not. */
    private boolean ignoreCheckChanged = false;

    /**
     * INTERNAL USE.
     * Performs the runnable on the edt.
     * @param task the task to perform on the edt
     * @param msgArg the arguments to use if an exception is caught
     */
    protected void edt(Runnable task, String msgArg) {
        String msgID = null;
        Exception ex = null;
        if (!SwingUtilities.isEventDispatchThread()) {
            try {
                SwingUtilities.invokeAndWait(task);
            } catch (InterruptedException e) {
                msgID = CRuntimeMsg.CT_INTERRUPTED;
                ex = e;
            } catch (InvocationTargetException e) {
                msgID = CRuntimeMsg.CT_INVOCATION_TARGET;
                if (e.getCause() != null && e.getCause() instanceof Exception) {
                    ex = (Exception) e.getCause();
                } else {
                    ex = e;
                }
            } finally {
                if (msgID != null) {
                    Object[] msgArgs = {this.getClass(), msgArg, ex};
                    Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
                    MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                    throw new GenovaClientFrameworkException(ex, msg);
                }
            } 
        } else {
            task.run();
        }
    }
    /** This is the entry point for the object selection node with name Course. Use methods found in this class - do not access view directly! */
    public CourseMethods theCourse;
    /** This is the entry point for the object selection node with name studentCourses. Use methods found in this class - do not access view directly! */
    public StudentCoursesMethods thestudentCourses;
    /** This is the entry point for the object selection node with name student. Use methods found in this class - do not access view directly! */
    public StudentMethods thestudent;
    
    /* Her kommer generert kode fra WindowBlock:controllerdecl*/
    
    HashMap tabListFromNodeNameWindow = new HashMap();
    HashMap tabListFromComponentWindow = new HashMap();
    
    String[] tabSequence = {"Course.code","Course.id","Course.isActive","Course.name","CourseClearButton","CourseSaveButton","CourseDeleteButton","StudentCoursesList","studentCourses.id","student.age","student.id","student.name","student.studentNr","SaveStudentCourse"};
    Map nextTabElementString = TypeTool.quickIndex(tabSequence, true);
    Map previousTabElementString = TypeTool.quickIndex(tabSequence, false);
    HashMap tabListFromNodeNameToolbar = tabListFromNodeNameWindow;
    HashMap tabListFromComponentToolbar = tabListFromComponentWindow;
    
    HashMap tabListFromNodeNameCourseClass = tabListFromNodeNameWindow;
    HashMap tabListFromComponentCourseClass = tabListFromComponentWindow;
    
    HashMap tabListFromNodeNameCourseData = tabListFromNodeNameCourseClass;
    HashMap tabListFromComponentCourseData = tabListFromComponentCourseClass;
    
    HashMap tabListFromNodeNameCourseButton = tabListFromNodeNameCourseClass;
    HashMap tabListFromComponentCourseButton = tabListFromComponentCourseClass;
    
    HashMap tabListFromNodeNameStudentCoursesClass = tabListFromNodeNameWindow;
    HashMap tabListFromComponentStudentCoursesClass = tabListFromComponentWindow;
    
    /* Her kommer generert kode for Listblock:controllerdecl*/
    
    HashMap tabListFromNodeNameStudentCoursesList = tabListFromNodeNameStudentCoursesClass;
    HashMap tabListFromComponentStudentCoursesList = tabListFromComponentStudentCoursesClass;
    public ApplicationMethods getApplication() {
        return application;
    }


    public boolean ignoreCheckChanged() {
        return ignoreCheckChanged;
    }


    public void setIgnoreCheckChanged(boolean ignoreCheckChanged) {
        this.ignoreCheckChanged = ignoreCheckChanged;
    }


    public void setServerApplicationName(String serverApplicationName) {
        this.serverApplicationName = serverApplicationName;
    }


    /**
     * Get serverApplicationName. If serverApplicationName is unknown the
     * name of current application is used.
     *
     * @return name of server application
     */
    public String getServerApplicationName() {
        if (serverApplicationName == null || serverApplicationName.equals("")) {
            return getApplication().getApplicationName();
        } else {
            return serverApplicationName;
        }
    }
    /**
     * Default handler for alle Runtime Exceptions.
     * Override in subclass as needed.
     *
     * @param bad The caught exception
     * @return true to continue error handling,
     * false the error is handled
     */
    public boolean dialogExceptionHandler(final Throwable bad) {
    return application.applicationExceptionHandler(bad);
    }
    
    /** 
     * Handles the return from another dialog
     * @param returnObject
     */
    public void returnToCaller(Object returnObject){
    }
    
    /** 
     * Handles initialization of a dialog from another dialog
     * @param returnObject
     * @param startObject
     */
    public void startInit(Object returnObject,Object startObject){
    }
    
    
    /* Keeps track of which hashmap group the component is within */
    HashMap tabFocusComponentGroup = new HashMap();
    
    /* Keeps track of which component to jump out from a notebook */ 
    HashMap notebookOwner = new HashMap(); 
    
    /* Keeps track of which components are radiogroups and elements within and order */
    HashMap radioGroupsG = new HashMap();
    
// Number used for uniqe identifying groups.
    boolean started = false; 
    AddStudentsToCourseDefaultView view;
    /** The vector with the tool bar elements */
    protected Vector toolBarVector = null;

    /** Access point for methods valid for entire application. This
     * object is an instance of the class CourseMain and can
     * if needed be cast to this object to access spesific methods
     * generated for this application. */
    public ApplicationMethods application;
    HashMap oldCursors = new HashMap();
    /** 
     * Internal use
     * @param menuName name of the menu
     * @return the menu
     */
    public JPopupMenu getPopupMenu(String menuName) {
        if(false) {
           menuName.getBytes();
        }
        return null;
    }
    /** 
     * @deprecated use DialogBlocker to block and unblock a dialog.
     */
    public void setWaitCursor() {
        Cursor waitCursor = new Cursor(Cursor.WAIT_CURSOR); 
        Component c = view.focusProc.getLastFocusedComponent();
        if(c != null) {
            oldCursors.put(c, c.getCursor());
            c.setCursor(waitCursor);
        }
        view.getContentPane().setCursor(waitCursor);
    }
    private boolean isModal = false;
    /**
     * Internal use! 
     * Sets the modal property of this dialog.
     * Should only be called from the view.
     * @param isModal the isModal property
     */
    public void setModal(boolean isModal) {
        this.isModal = isModal;
    }
    /**
     * Internal use.
     * Returns the isModal flag.
     * @return the isModal flag
     */
    public boolean isModal() {
        return isModal;
    }

    /** 
     * Check if this dialog is blocked.
     * @return <code>true</code> if blocked.
     */
    public boolean isBlocked() {
       Component comp = null;
       if (isApplicationWindow()) {
           comp = getApplication().getApplicationWindow();
       } else {
           comp = getWindow();
       }
       return DialogBlocker.isBlocked(comp);
    }

    /**
     * Blocks the dialog (or application) and shows the wait cursor.
     */
    public void blockDialog() {
        RootPaneContainer comp = null;
        if (isApplicationWindow()) {
            comp = getApplication().getApplicationWindow();
        } else {
            comp = (RootPaneContainer) getWindow();
        }
        DialogBlocker.block(comp);          
    }

    /**
     * Unblocks the dialog (or application) and shows the default cursor.
     */
    public void unblockDialog() {
        RootPaneContainer comp = null;
        if (isApplicationWindow()) {
            comp = getApplication().getApplicationWindow();
        } else {
            comp = (RootPaneContainer) getWindow();
        }
        DialogBlocker.unblock(comp);
    }


    /**
     * Clears the dialog on edt.
     * @see #clearDialog()
     */
    private void clearDialogEDT() {
        Runnable task = new Runnable() {
            public void run() {
                clearDialog();
            }
        };
        edt(task, "clearDialog");
    }


    public void clearDialog() {
        if (!SwingUtilities.isEventDispatchThread()) {
            clearDialogEDT();
            return;
        }
        view.clearAddStudentsToCourse();
    }
    /** 
     * @deprecated use the DialogBlocker to unblock a dialog.
     */
    public void setNormalCursor() {
        view.getContentPane().setCursor(Cursor.getDefaultCursor());
        Set comps = oldCursors.keySet();
        for(Iterator i = comps.iterator();i.hasNext();) {
            Component c = (Component)i.next();
            c.setCursor((Cursor)oldCursors.get(c));
        }
        oldCursors.clear();
    }
    /** 
     * Overload this method if you want to override sorting order for a 
     * listblock.
     * @param listblock The listblock to override sort order for.
     * @param nodeinfo The data to sort.
     * @param column The column that is to be sorted 
     * @param direction The direction of the sort.
     * @return True if overload took place, false if not.
     */
    public boolean overrideSortListblock(String listblock, NodeInfoList nodeinfo, int column, Boolean direction) {
        if(false) { listblock.getClass(); nodeinfo.getClass(); column++; direction.getClass();}
        return false;
    }
    /** 
     * Internal use.
     * @param app Internal use.
     */     
    public AddStudentsToCourseDefaultController(ApplicationMethods app) { 
        this.applicationEnums = app.getEnums();
       application = app;
       domainProxy = new DomainProxy(true, applicationEnums);
       createRoleObjects();
    }

    /**
     * Get the title as defined in the dialogs window block
     *
     * @return the window title
     */
    public String getWindowTitle() {
    
    /* Her kommer generert kode fra WindowBlock:DialogTitle*/
    
     return "Course"; 
    }


    public void setWindowTitle(String title) {
        Object o = getWindow();
        if (o instanceof JDialog) {
            JDialog dView = (JDialog) o;
            dView.setTitle(title);
            dView.validate();
        } else {
            getView().setTitle(title);
            getView().validate();
        }
    }
    /**
     * Resets the proxy for this dialog.
     */
    public void resetProxy() {
        domainProxy.removeAllProxies();
    }


    /**
     * Internal use!
     * Gets selected lines in listblocks.
     * If called from another thread than EDT, the thread
     * is paused while the listblock selection is performed on the
     * EDT.
     * @param pathToTarget List of path target
     * @return a List of selected lines.
     */
    public List getListblockStates(final List pathToTarget) {
        class Task implements Runnable {
            List editFieldLines = new LinkedList();

            public void run() {
                saveEditFieldLines();
            }

            public void saveEditFieldLines() {
                if (pathToTarget.contains(thestudentCourses)) {
                    editFieldLines.add(listblockMethodsStudentCoursesList
                            .createListblockLineFromEditFields());
                }
            }
        }

        Task task = new Task();
        if (!SwingUtilities.isEventDispatchThread()) {
            String msgID = null;
            Exception ex = null;
            try {
                SwingUtilities.invokeAndWait(task);
            } catch (InterruptedException e) {
                msgID = CRuntimeMsg.CT_INTERRUPTED;
                ex = e;
            } catch (InvocationTargetException e) {
                msgID = CRuntimeMsg.CT_INVOCATION_TARGET;
                ex = e;
            } finally {
                if (msgID != null) {
                    Object[] msgArgs = {AddStudentsToCourseDefaultController.class, "getListblockStates", ex};
                    Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
                    MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                    throw new GenovaClientFrameworkException(ex, msg);
                }
            } 
        } else {
            task.saveEditFieldLines();
        }
        return task.editFieldLines;
    }


    /**
     * Internal use!
     * Scrolls listblock to the specfied lines and depending on the second parameter, selects the line.
     * If called from another thread than EDT, the thread
     * is paused while the listblock selection is performed on the
     * EDT.
     * @param selectedLines - a List of selected lines.
     * @param doSelect - if <code>true</code> the line is selected, if not, it's just made visible.
     */
    public void setListblockStates(final List selectedLines, final boolean doSelect) {
        class Task implements Runnable {

            public void run() {
                setListblockStates();
            }

            public void setListblockStates() {
                Iterator it = selectedLines.iterator();
                while (it.hasNext()) {
                    ListblockLine selectedLine = (ListblockLine) it.next();
                    Listblock listBlock = selectedLine.getListblock();
                    Iterator jt = listBlock.allLines().iterator();
                    while (jt.hasNext()) {
                        ListblockLine aLine = (ListblockLine) jt.next();
                        if (aLine.equals(selectedLine)) {
                            if (doSelect) {
                                aLine.displayInEditField(); 
                                listBlock.setSelectedLine(aLine);
                                // We don't want to fire a selected event!
                                // listBlock.getTable().fireGenovaSelectedEvent(-1, aLine.getLineNumber());
                            } else {
                                listBlock.makeRowVisible(aLine.getLineNumber());
                                Set roleNames = listBlock.getRoleNamesInUse();
                                Iterator rIt = roleNames.iterator();
                                while (rIt.hasNext()) {
                                    ObjectSelectionNode node = getObjectSelectionNode((String) rIt.next());
                                    node.clear();
                                }
                            }
                            break;
                        }
                    }
                    if (!doSelect) {
                        listBlock.clearEditFields();
                    }
                }
            }
        }

        Task task = new Task();
        if (!SwingUtilities.isEventDispatchThread()) {
            String msgID = null;
            Exception ex = null;
            try {
                SwingUtilities.invokeAndWait(task);
            } catch (InterruptedException e) {
                msgID = CRuntimeMsg.CT_INTERRUPTED;
                ex = e;
            } catch (InvocationTargetException e) {
                msgID = CRuntimeMsg.CT_INVOCATION_TARGET;
                ex = e;
            } finally {
                if (msgID != null) {
                    Object[] msgArgs = {AddStudentsToCourseDefaultController.class, "setListblockStates", ex};
                    Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
                    MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                    throw new GenovaClientFrameworkException(ex, msg);
                }
            } 
        } else {
            task.setListblockStates();
        }
    }


    /**
     * Internal use.
     * Invokes the Print hook method on the specified node, and returns
     * the result.
     * @return the result of invoking the hook.
     */
    public ECheckResult callHookCheckPrint(String roleName) {

        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckPrint();
        }

        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookstudentCoursesCheckPrint();
        }

        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookstudentCheckPrint();
        }

        return ECheckResult.DEFAULT;
    }


    /**
     * <strong>The use of this method is discouraged. Use
     * callHookCheck save instead.</strong>
     * Invokes the check save hook for the specified role. If no such
     * role exists, the returned value is <code>true</code>, else the roles
     * hook check save is returned.
     * 
     * @param roleName the name of the role
     * @return the result of invoking the hook.
     */   
    public boolean callCheckSaveHook(String roleName) {

        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCheckSaveCourse();
        }

        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookCheckSavestudentCourses();
        }

        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookCheckSavestudent();
        }

        return true;
    }
    /**
     * Internal use.
     * Invokes the Save hook method on the specified node, and returns
     * the result.
     * @return the result of invoking the hook.
     */
    public ECheckResult callHookCheckSave(String roleName) {

        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckSave();
        }

        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookstudentCoursesCheckSave();
        }

        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookstudentCheckSave();
        }

        return ECheckResult.DEFAULT;
    }


    /**
     * <strong>The use of this method is discouraged. Use
     * callHookCheck find instead.</strong>
     * Invokes the check find hook for the specified role. If no such
     * role exists, the returned value is <code>true</code>, else the roles
     * hook check find is returned.
     * 
     * @param roleName the name of the role
     * @return the result of invoking the hook.
     */   
    public boolean callCheckFindHook(String roleName) {
        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCheckFindCourse();
        }
        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookCheckFindstudentCourses();
        }
        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookCheckFindstudent();
        }

        return true;
    }    
    /**
     * Internal use.
     * Invokes the Find hook method on the specified node, and returns
     * the result.
     * @return the result of invoking the hook.
     */
    public ECheckResult callHookCheckFind(String roleName) {

        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckFind();
        }

        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookstudentCoursesCheckFind();
        }

        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookstudentCheckFind();
        }

        return ECheckResult.DEFAULT;
    }    


    /**
     * <strong>The use of this method is discouraged. Use
     * callHookCheck close instead.</strong>
     * Invokes the check close hook for the specified role. If no such
     * role exists, the returned value is <code>true</code>, else the roles
     * hook check close is returned.
     * 
     * @param roleName the name of the role
     * @return the result of invoking the hook.
     */   
    public boolean callCheckCloseHook(String roleName) {
        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCheckCloseCourse();
        }
        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookCheckClosestudentCourses();
        }
        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookCheckClosestudent();
        }

        return true;
    }  
    /**
     * Internal use.
     * Invokes the Close hook method on the specified node, and returns
     * the result.
     * @return the result of invoking the hook.
     */
    public ECheckResult callHookCheckClose(String roleName) {

        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckClose();
        }

        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookstudentCoursesCheckClose();
        }

        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookstudentCheckClose();
        }

        return ECheckResult.DEFAULT;
    }  


    /**
     * <strong>The use of this method is discouraged. Use
     * callHookCheck delete instead.</strong>
     * Invokes the check delete hook for the specified role. If no such
     * role exists, the returned value is <code>true</code>, else the roles
     * hook check delete is returned.
     * 
     * @param roleName the name of the role
     * @return the result of invoking the hook.
     */   
    public boolean callCheckDeleteHook(String roleName) {
        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCheckDeleteCourse();
        }
        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookCheckDeletestudentCourses();
        }
        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookCheckDeletestudent();
        }

        return true;
    }    
    /**
     * Internal use.
     * Invokes the Delete hook method on the specified node, and returns
     * the result.
     * @return the result of invoking the hook.
     */
    public ECheckResult callHookCheckDelete(String roleName) {

        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckDelete();
        }

        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookstudentCoursesCheckDelete();
        }

        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookstudentCheckDelete();
        }

        return ECheckResult.DEFAULT;
    }


    /**
     * <strong>The use of this method is discouraged. Use
     * callHookCheck clear instead.</strong>
     * Invokes the check clear hook for the specified role. If no such
     * role exists, the returned value is <code>true</code>, else the roles
     * hook check clear is returned.
     * 
     * @param roleName the name of the role
     * @return the result of invoking the hook.
     */   
    public boolean callCheckClearHook(String roleName) {
        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCheckClearCourse();
        }
        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookCheckClearstudentCourses();
        }
        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookCheckClearstudent();
        }

        return true;
    }   
    /**
     * Internal use.
     * Invokes the Clear hook method on the specified node, and returns
     * the result.
     * @return the result of invoking the hook.
     */
    public ECheckResult callHookCheckClear(String roleName) {

        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckClear();
        }

        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookstudentCoursesCheckClear();
        }

        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookstudentCheckClear();
        }

        return ECheckResult.DEFAULT;
    } 


    /**
     * <strong>The use of this method is discouraged. Use
     * callHookCheck change instead.</strong>
     * Invokes the check change hook for the specified role. If no such
     * role exists, the returned value is <code>true</code>, else the roles
     * hook check change is returned.
     * 
     * @param roleName the name of the role
     * @return the result of invoking the hook.
     */   
    public boolean callCheckChangeHook(String roleName) {
        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCheckChangeCourse();
        }
        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookCheckChangestudentCourses();
        }
        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookCheckChangestudent();
        }

        return true;
    } 
    /**
     * Internal use.
     * Invokes the Change hook method on the specified node, and returns
     * the result.
     * @return the result of invoking the hook.
     */
    public ECheckResult callHookCheckChange(String roleName) {

        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckChange();
        }

        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookstudentCoursesCheckChange();
        }

        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookstudentCheckChange();
        }

        return ECheckResult.DEFAULT;
    }   


    /**
     * <strong>The use of this method is discouraged. Use
     * callHookCheckRowSelect(String, int int) instead.</strong>
     * Invokes the check row select for the specified role, and returns the
     * result.
     * @param roleName the name of the role.
     * @param currentSelectionIndex the index of the currently selected row.
     * @param newSelectionIndex the index of the new selected row.
     * @return the result of invoking hook check row select on the 
     *         specified role.
     */
    public boolean callCheckRowSelectHook(String roleName, int currentSelectionIndex, int newSelectionIndex) {
        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCheckRowSelectCourse(currentSelectionIndex, newSelectionIndex);
        }
        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookCheckRowSelectstudentCourses(currentSelectionIndex, newSelectionIndex);
        }
        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookCheckRowSelectstudent(currentSelectionIndex, newSelectionIndex);
        }

        return true;
    }


    /**
     * Internal use.
     * <p>Invokes the hook for the specified role.
     * @param oldSelection the current selection
     * @param newSelection the new selection.
     * @return the ECheckResult 
     */
    public ECheckResult callHookCheckRowSelect
            (String roleName, int oldSelection, int newSelection) {

        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckRowSelect(oldSelection, newSelection);
        }        

        if (AddStudentsToCourseConst.StudentCourses.OSRoleName.equals(roleName)) {
            return hookstudentCoursesCheckRowSelect(oldSelection, newSelection);
        }        

        if (AddStudentsToCourseConst.Student.OSRoleName.equals(roleName)) {
            return hookstudentCheckRowSelect(oldSelection, newSelection);
        }        

        return ECheckResult.DEFAULT;
    }        


    public boolean checkPrint() {
        boolean retVal = true;
        retVal = retVal && theCourse.checkPrint();
        return hookCheckPrint(retVal);
    }


    /**
     * Hook method, override in subclass!
     * This method is invoked as part of the print action. The parameter
     * is the result of checkPrint. 
     * <p>Since a print action involves an obtain that will potentially
     * alter the state of the dialog, this hook gives the application
     * programmer the chance to abort the print action, or verify that 
     * print action should continue even if the dialog is changed (in this
     * case the obtain will alter the state).
     * @param checkPrintResult if <code>false</code> one of the checkPrint on 
     * the object selection roots failed.
     * @return <code>true</code> if print action should continue, otherwise 
     *         <code>false</code>
     */
    protected boolean hookCheckPrint(boolean checkPrintResult) {
        return checkPrintResult;
    }


    /**
     * Hook method, override in subclass!
     * This method should return an object of the view subclass,
     * AddStudentsToCourseView. A default implementation of this method
     * is generated in the AddStudentsToCourseController class.
     *
     * @param controller the controller for the dialog.
     * @param applicationEnums the GenovaEnums object for the application.
     * @return the dialog view.
     */
    protected abstract AddStudentsToCourseDefaultView hookInstantiateView(AddStudentsToCourseDefaultController controller, GenovaEnums applicationEnums);


    public boolean checkClose() {
        boolean retVal = true;
        getView().toFront();
        try {
            getView().setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            // can't select the view...
        }        
        retVal = retVal && theCourse.checkClose();
        if (!retVal) {
            if (getView().isIcon()) {
                try {
                    getView().setIcon(false);
                } catch (java.beans.PropertyVetoException e) {
                    // Can't restore the view.
                }
            }
            Object[] args = {getView().getTitle()};
            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CC_CHECK_CLOSE_MSG, args);
            MessageReply reply = Application.getMessageDispatcher(getWindow(), getApplication()).dispatch(msg);
            retVal = MessageReplyType.REPLY_OK.equals(reply);
        }
        return retVal;
    }


    public boolean checkClear(String roleName) {
        if (AddStudentsToCourseConst.Course.OSRoleName.equals(roleName)) {
            return theCourse.checkClear();
        }
        return true;
    }
    /**
     * Gets a proxy object holding the state for the specified object.
     * @param o the object that should be proxied
     * @param roleName the role name of the proxied object
     * @return a proxy object for <code>o</code>
     */
    public DomainObjectProxy getProxy(Object o, String roleName) {
        return domainProxy.getProxy(o, roleName);
    }
    /**
     * Gets a new proxy object holding the state for the specified object.
     * @param o the object that should be proxied
     * @param roleName the role name of the proxied object
     * @return a proxy object for <code>o</code>
     */
    public DomainObjectProxy getNewProxy(Object o, String roleName) {
        return domainProxy.getNewProxy(o, roleName);
    }
    public GenovaDialogFrame getView() {
        return view;
    }
    /** 
     * Brings the dialog to front. 
     */
    public void toFront() {
        if (view.isDialog()) {
            Runnable task = new Runnable() {
                public void run() {
                    DialogBoxTool.showDialog(view.getDialog());
                }
            };
            if (SwingUtilities.isEventDispatchThread()) {
                GenovaWorker.enqueueTask(this, task);
            } else {
                task.run();
            }        
        } else {
            Runnable task = new Runnable() {
                public void run() {
                    view.toFront();
                    JInternalFrame frame = (JInternalFrame) view;
                    try {
                        frame.setSelected(true);
                    } catch (PropertyVetoException e) {
                        // Not much to do...
                    }
                }
            };
            if (!SwingUtilities.isEventDispatchThread()) {
                SwingUtilities.invokeLater(task);
            } else {
                task.run();
            }
        }
    }
    /**
     * Brings the dialog to the back
     */
    public void toBack() {
        view.toBack();
    }
    
    
    public void setEnabledComponent(Component component, boolean enable) {
            setEnabledComponent(component, enable, true);
    }
    
    
    public void setEnabledComponent(Component component, boolean enable, boolean delay) {
        view.setEnabledComponent(component, enable, delay);
    }
    
    
    public void setEnabledComponent(String name, boolean enable) {
        Component component = view.fromNameToComponent(name);
        if (component != null) {
            setEnabledComponent(component, enable);
        }
    }
    
    
    public void setVisibleComponent(Component component, boolean visible) {
       setVisibleComponent(component, visible, true);
    }
    
    
    public void setVisibleComponent(Component component, boolean visible, boolean delay) {
        view.setVisibleComponent(component, visible, delay);
    }
    
    
    public void setVisibleComponent(String name, boolean visible) {
        Component component = view.fromNameToComponent(name);
        if (component != null) {
            setVisibleComponent(component, visible);
        }
    }
    
    
    public boolean isChanged(String osAttributeName) 
            throws GenovaClientException {
        ObjectSelectionNode node = getObjectSelectionNode(TypeTool
                .getRoleNamePrefix(osAttributeName));
        if (node != null) {
            return node.isChanged(osAttributeName);
        } else {
            throw new GenovaClientException("No such role: " 
                    + osAttributeName);
        }
    }
    
    
    /**
     * Updates the specified field from the object selection, and 
     * displays the new value. 
     * @param objSelAttr the name of the attribute (as in the object selection)
     * @param value the (domain) object with the acutal value to display
     */
    public void display(String objSelAttr, Object value) {
        display(objSelAttr, value, true);
    }
    /**
     * Updates the specified field from the object selection, and 
     * displays the new value. 
     * @param objSelAttr the name of the attribute (as in the object selection)
     * @param value the (domain) object with the acutal value to display
     * @param resetState Set to false to avoid resetting the attribute state.
     */
    public void display(String objSelAttr, Object value, boolean resetState) {
        ObjectSelectionNode node = getObjectSelectionNode(TypeTool
                .getRoleNamePrefix(objSelAttr));
        if (node != null) {
            node.osDisplay(value, objSelAttr, resetState);
        } else {
            String msgID = CRuntimeMsg.CF_NO_SUCH_ROLE;
            Object[] msgArgs = {getClass().getName()
                                 + ".display(String, value, boolean)",
                                objSelAttr };
            Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
            MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
            throw new GenovaClientException(msg);
        }
    }
    /**
     * Obtains a field value from the dialog.
     * @param objSelAttr the name (as in the object selection) 
     *     of the attribute to obtain
     * @return A String with the formatted value.
     */ 
    public String obtain(String objSelAttr) {
        ObjectSelectionNode node = getObjectSelectionNode(TypeTool
                .getRoleNamePrefix(objSelAttr));
        String retVal = null;
        if (node != null) {
            retVal = node.obtain(objSelAttr);
        } else {
            String msgID = CRuntimeMsg.CF_NO_SUCH_ROLE;
            Object[] msgArgs = {getClass().getName()
                                + ".obtain(String)", objSelAttr };
            Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
            MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
            throw new GenovaClientException(msg);
        }

        return retVal;
    }


    /** 
     * Links two UI components data. The components are selected based
     * on object selections described by parameters obj1 and obj2, in
     * a format objsel.attr. If the selection 1 is changed to a given
     * value, found in obj1list, then it will display the object found in the map to the obj2 
     * field.
     * @param obj1 
     * @param obj2 
     * @param obj1list 
     * @param obj2list 
     */
    public void linkFields(String obj1, String obj2, Map obj1list, Map obj2list) {
        LinkField link = new LinkField(this);
        if(!link.isComplete()) {
            if(false) {
                obj1list.getClass();
                obj2list.getClass();
            }
            throw new RuntimeException("ERROR: Failed to link "+obj1+" and "+obj2);
        }
    }
    /** 
     * @param linkList 
     * @param id
     * @deprecated expressions are handeled by the ComponentLink class.
     */
    public void updateLinks(List linkList, String id) {
        if(linkList == null) {
            return;
        }
        for(Iterator i = linkList.iterator();i.hasNext();) {
            LinkField link = (LinkField)i.next();
            if(id.equals(link.getId1())) {
                link.update1();
            } else if(id.equals(link.getId2())) {
                link.update2();
            }
        }
    }
    /** 
     * Get the name of the dialog
     *
     * @return the dialog name 
     */
    public String getDialogName() {
        return "AddStudentsToCourse";
    }
    public void setAccessPolicy() {
        // Override in subclass.
    }
    /** Dummy method, to be extended in subclass.
     * Return true if the given field should be visible in the context 
     * @param fieldname the field name
     * @param context the context
     * @return <code>true</code> if field should be visible.
     */
    public boolean shallBeVisible(String fieldname, int context) {
        if(false) {
            fieldname.getClass();
            context++;
        }
        return true;
    }
    /** Dummy method, to be extended in subclass.
     * Return true if the given field should be enabled in the context 
     * @param fieldname the field name
     * @param context the context
     * @return <code>true</code> if field should be enabled.
     */
    public boolean shallBeEnabled(String fieldname, int context) {
        if(false) {
            fieldname.getClass();
            context++;
        }
        return true;
    }
        /** 
         * Internal use
         * @param eventData 
         */
    public void genovaDataEvent(GenovaDataEvent eventData) {
        if(false) {
            eventData.getClass();
        }
    }

    /**
     * Center the dialog on edt
     * @see #center()
     */
    private void centerEDT() {
        Runnable task = new Runnable() {
            public void run() {
                center();
            }
        };
        edt(task, "center");
    }

    /** Sentrerer dialog i MDI */
    public void center() {
        if (!SwingUtilities.isEventDispatchThread()) {
            centerEDT();
            return;
        }
        int xsize = getWindow().getWidth();
        int ysize = getWindow().getHeight();
        int pxsize = application.getApplicationWindow().getWidth();
        int pysize = application.getApplicationWindow().getHeight();
        int posx = pxsize / 2 - xsize / 2;
        int posy = pysize / 2 - ysize / 2;
        if(posx < 0) {
           posx = 0;
        }
        if(posy < 0) {
           posy = 0;
        }
        getWindow().setLocation(posx, posy);
    }

    /**
     * Sets the dialog position
     */
    protected void setDialogLocation() {
        int xorigo = application.getApplicationWindow().getX();
        int yorigo = application.getApplicationWindow().getY();
        java.awt.Insets insets = application.getApplicationWindow().getInsets();
        yorigo += insets.top;
        if (application.getApplicationMenuBar() != null) {
            yorigo += application.getApplicationMenuBar().getHeight();
        }
        if (application.getApplicationToolBar() != null) {
            yorigo += application.getApplicationToolBar().getHeight();
        }
        xorigo += insets.left;
        getWindow().setLocation(xorigo, yorigo);
    }                   

    /**
     * Dispose dialog on edt.
     */
    private void disposeDialogEDT() {
        Runnable task = new Runnable() {
            public void run() {
                disposeDialog();
            }
        };
        edt(task, "disposeDialog");
    }
        
    /* Removes the current dialog */
    public void disposeDialog() {
        if (!SwingUtilities.isEventDispatchThread()) {
            disposeDialogEDT();
            return;
        }
        if (getWindow() instanceof JInternalFrame) {
            JInternalFrame fView = (JInternalFrame) getWindow();
            fView.dispose();
        } else if (getWindow() instanceof JDialog) {
            JDialog dView = (JDialog) getWindow();
            dView.dispose();
        }
    }
        
     /** 
      * Forawards call to view's genovaAccelerator(KeyEvent) 
      * @param event 
      * @return <code>true</code> if accelerator is found.
      */
     public boolean genovaAccelerator(KeyEvent event) {
         return view.genovaAccelerator(event);
     }
//      private void setCurrent() {
//      }

    /**  
     * Internal use.
     * Inits the dialog.
     */
    public void initWithoutFrame() {
       if (!(started)) {
          view = hookInstantiateView(this, applicationEnums);
          view.initOuterPanel();
          toolBarVector = view.toolBarElements;
       }
       started = true;
//       view.setVisible(true);
//       if (getWindow() instanceof JInternalFrame) {
//           setAccessPolicy();
//       }
    }
    /** 
     * Internal use.
     * Inits the dialog.
     */
    public void init() {
       if (!(started)) {
           view = hookInstantiateView(this, applicationEnums);  
           view.init();
           toolBarVector = view.toolBarElements;
       }
       started = true;
       getWindow().setFocusTraversalPolicy(
               new CustomTraversalPolicy(this, tabSequence));
       theCourse = new CourseMethods(view, this, applicationEnums);
       RoleObject roleObjectCourse = addRoleObject(Course.class, new RoleObject("Course"));
       roleObjectCourse.setNode(theCourse);
       roleObjectCourse.addSimpleBlock(theCourse);
       thestudentCourses = new StudentCoursesMethods(view, this, applicationEnums);
       thestudentCourses.setParentNode(theCourse);
       RoleObject roleObjectstudentCourses = addRoleObject(StudentCourse.class, new RoleObject("studentCourses"));
       roleObjectstudentCourses.setNode(thestudentCourses);
       roleObjectstudentCourses.addSimpleBlock(thestudentCourses);
       thestudent = new StudentMethods(view, this, applicationEnums);
       thestudent.setParentNode(thestudentCourses);
       RoleObject roleObjectstudent = addRoleObject(Student.class, new RoleObject("student"));
       roleObjectstudent.setNode(thestudent);
       roleObjectstudent.addSimpleBlock(thestudent);
//       view.setVisible(true);
//       if (getWindow() instanceof JInternalFrame) {
//           setAccessPolicy();
//       }
    }
    /** 
     * Returns the window compoent of this dialog. If it is a dialog box, the
     * dialog box is returned (an instance of JDialog), otherwise the internal frame is returned.
     * @return the window component representing this dialog.
     */
    public Container getWindow() {
        if (view.isDialog()) {
            return view.getDialog();
        } else {
            return view;
        }
    }
    /**
     * Internal use. 
     * Checks if this is the application window or not.
     * @return <code>true</code> if this is the application window.
     */
    protected boolean isApplicationWindow() {
        return false;
    }
    /** 
     * Gets the outer panel of this dialog
     * @return the outer panel
     */
    public JPanel getOuterPanel() {
        return view.getOuterPanel();
    }
    /**
     * Returns the tool bar elements.
     * @return the tool bar elements.
     */
    public Vector getToolBarElements() {
        return toolBarVector;
    }


    // default (package) visibility
    Map roleObjects = new HashMap(); /* key = class
                                             * value = Set of role objects
                                             */
    private RoleObject addRoleObject(Class theObjectClass,
                                     RoleObject roleObject) {
        Set roleObjectsSet = (Set) roleObjects.get(theObjectClass);
        if (roleObjectsSet == null) {
            roleObjectsSet = new HashSet();
            roleObjects.put(theObjectClass, roleObjectsSet);
        }
        if (roleObjectsSet.contains(roleObject)) {
            Iterator it = roleObjectsSet.iterator();
            boolean found = false;
            while (it.hasNext() && !found) {
                RoleObject ro = (RoleObject) it.next();
                if (roleObject.equals(ro)) {
                    roleObject = ro;
                    found = true;
                }
            }
        } else {
            roleObjectsSet.add(roleObject);
        }
        return roleObject;
     }
    private void createRoleObjects() {
        RoleObject roleObjectCourse = addRoleObject(Course.class, new RoleObject("Course"));


        RoleObject roleObjectstudentCourses = addRoleObject(StudentCourse.class, new RoleObject("studentCourses"));
        roleObjectCourse.addAssociation(roleObjectstudentCourses, "studentCourses", RoleObject.MORE_RELATED, true, Set.class);
        roleObjectstudentCourses.setUpRelated(false);
        roleObjectstudentCourses.addAssociation(roleObjectCourse, "course", RoleObject.PARENT_RELATION, true, StudentCourse.class);

        RoleObject roleObjectstudent = addRoleObject(Student.class, new RoleObject("student"));
        roleObjectstudentCourses.addAssociation(roleObjectstudent, "student", RoleObject.ONE_IN_MORE_RELATED, true, Student.class);
        roleObjectstudent.setUpRelated(true);
        roleObjectstudent.addAssociation(roleObjectstudentCourses, "studentCourses", RoleObject.PARENT_RELATION, true, Set.class);
   }


   public List getRoleObjects(Object anObject) {
        return getRoleObjects(DomainUtil.getDomainClass(anObject));
   }


   /**
    * Returns a list of role objects representing the specified class.
    * @param objectClass the class object
    * @return a list of role objects.
    */
   public List getRoleObjects(Class objectClass) {
       List roleObjectList = new LinkedList();
       Set roleObjectSet = null;
       Class domainClass = objectClass;
       while (roleObjectSet == null && domainClass != null) {
           roleObjectSet = (Set) roleObjects.get(domainClass);
           domainClass = DomainUtil.getDomainSuperClass(domainClass);
       }
       if (roleObjectSet != null) {
           roleObjectList.addAll(roleObjectSet);
       } else {
           // log failure.
           Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_GET_ROLES_FAILED,
                         this.getClass(), objectClass);
           MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
       }
       return roleObjectList;
 }


   public Map getRoleObjects() {
        return roleObjects;
   }


    /**
     * Obtains the specified node from the dialog, and
     * inits an ObjectSelection object.
     * <p>If this method is invoked on another thread than EDT, the
     * invoking thread is paused, and the obtain is performed on
     * the EDT. After the obtain, the invoking thread reads the result and
     * returns.
     * @param targetNode the target node to obtain
     * @return the object selection containing the obtained object
     */
    public ObjectSelection obtainObjectSelection(
            final AbstractNode targetNode) {
        return obtainObjectSelection(targetNode, false);
    }
    /**
     * Obtains the specified node from the dialog, and
     * inits an ObjectSelection object.
     * <p>If this method is invoked on another thread than EDT, the
     * invoking thread is paused, and the obtain is performed on
     * the EDT. After the obtain, the invoking thread reads the result and
     * returns.
     * @param targetNode the target node to obtain
     * @param greedyObtain if <code>true</code>, do greedy obtain instad of normal obtain
     * @return the object selection containing the obtained object
     */
    private ObjectSelection obtainObjectSelection(
            final AbstractNode targetNode,
            final boolean greedyObtain) {
        class Task implements Runnable {
            ObjectSelection objectSelection;

            public void run() {
                doTask();
            }
            public void doTask() {
                ObjectSelectionNode rootNode = targetNode.getRootNode();
                List pathToTarget = targetNode.getPathToNode();
                Object rootObject = null;
                if (greedyObtain) {
                    if (rootNode.inListblock()) {
                        rootObject = rootNode.obtainSet(false);
                    } else {
                        rootObject = rootNode.greedyObtain();
                    }
                } else {
                    rootObject = rootNode
                        .recursiveObtainObject(pathToTarget);
                }
                List obtainedRoot = TypeTool.getDefaultList();
                if (rootObject != null) {
                    if (rootObject instanceof Collection) {
                        obtainedRoot.addAll((Collection) rootObject);
                    } else {
                        obtainedRoot.add(rootObject);
                    }
                }
                String rootName = rootNode.getRoleName();
                String targetRoleName = targetNode.getRoleName();
                objectSelection = new ObjectSelection(rootName,
                        targetRoleName, getServerApplicationName(), "AddStudentsToCourse_os");
                objectSelection.putRootObjects(rootName, obtainedRoot);
            }
        }

        Task task = new Task();
        if (!SwingUtilities.isEventDispatchThread()) {
            String msgID = null;
            Exception ex = null;
            try {
                SwingUtilities.invokeAndWait(task);
            } catch (InterruptedException e) {
                msgID = CRuntimeMsg.CT_INTERRUPTED;
                ex = e;
            } catch (InvocationTargetException e) {
                msgID = CRuntimeMsg.CT_INVOCATION_TARGET;
                ex = e;
            } finally {
                if (msgID != null) {
                    Object[] msgArgs = {this.getClass(),
                            "obtainObjectSelection, target: " +
                            targetNode != null ? targetNode.getRoleName(): "null", ex};
                    Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
                    MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                    throw new GenovaClientFrameworkException(ex, msg);
                }
            }
        } else {
            task.doTask();
        }

        return task.objectSelection;
    }


    /**
     * Obtains all nodes from the dialog.
     * <p>If this method is invoked on another thread than EDT, the
     * invoking thread is paused, and the obtain is performed on
     * the EDT. After the obtain, the invoking thread reads the result and
     * returns.
     *
     * @return an ObjectSelection with all the dialog's roots
     */
    public ObjectSelection obtainObjectSelection() {
        class Task implements Runnable {
            ObjectSelection objectSelection;

            public void run() {
                doTask();
            }

            public void doTask() {
                objectSelection =
                        new ObjectSelection(null, null, null,
                                            getServerApplicationName(),
                                            "AddStudentsToCourse_os");
                Map obtainedRoots = new HashMap();
                obtainedRoots.put("Course", 
                        obtainObjectSelection(theCourse, true));

                Iterator entries = obtainedRoots.entrySet().iterator();
                while (entries.hasNext()) {
                    Map.Entry entry = (Map.Entry) entries.next();
                    String entryRole = (String) entry.getKey();
                    ObjectSelection entryOS = (ObjectSelection) entry.getValue();
                    List entryRoots = entryOS.getRootObjects(entryRole);
                    objectSelection.putRootObjects(entryRole, entryRoots);
                }

            }
        }

        Task task = new Task();

        if (!SwingUtilities.isEventDispatchThread()) {
            String msgID = null;
            Exception ex = null;
            try {
                SwingUtilities.invokeAndWait(task);
            } catch (InterruptedException e) {
                msgID = CRuntimeMsg.CT_INTERRUPTED;
                ex = e;
            } catch (InvocationTargetException e) {
                msgID = CRuntimeMsg.CT_INVOCATION_TARGET;
                ex = e;
            } finally {
                if (msgID != null) {
                    Object[] msgArgs = {this.getClass(),
                            "obtainObjectSelection", ex};
                   Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
                   MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                   throw new GenovaClientFrameworkException(ex, msg);
                }
            }
        } else {
            task.doTask();
        }

        return task.objectSelection;
    }


    public ObjectSelectionNode getObjectSelectionNode(String roleName) {
        if ("Course".equals(roleName)) {
            return theCourse;
        }
        if ("studentCourses".equals(roleName)) {
            return thestudentCourses;
        }
        if ("student".equals(roleName)) {
            return thestudent;
        }
        /* no match! */
        return null;
    }


    public void clearObjectSelection() {
        ClearTool clearTool = new ClearTool(roleObjects);
        clearTool.clear("Course");
    }


    private boolean checkClearObjectSelection() {
        boolean ok = true;
        ok = ok && theCourse.checkChanged();
        if (!ok) {
            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CC_CHECK_CLEAR_MSG);
            MessageReply reply = Application.getMessageDispatcher(getWindow(), getApplication()).dispatch(msg);
            ok = MessageReplyType.REPLY_OK.equals(reply);
        }
        return ok;
    }


//     query.addAssociation("student");
    /** 
     * This class contains the methods that are available for use on
     * listblocks. You can access its methods in the variable
     * listblockMethodsStudentCoursesList declared in the controller class
     * AddStudentsToCourseDefaultController. 
     */
    public class ListblockMethodsStudentCoursesList implements Comparator, Listblock {
        private AddStudentsToCourseDefaultController controller;
        private Set roleNamesInUse = new HashSet();
        int[] lastSelectedLines = null;
        ListblockLine lastSelectedLine;
        private Boolean checkForeignNodes;

        /** 
         * Internal use.
         * @param c Internal use.
         */
        ListblockMethodsStudentCoursesList(AddStudentsToCourseDefaultController c) {
            controller = c;
            RoleObject roleObject = addRoleObject(StudentCourse.class, 
                    new RoleObject("studentCourses"));
            List args = new LinkedList();
               args.add(StudentCourse.class);
               roleNamesInUse.add("studentCourses");
               args.add(Student.class);
               roleNamesInUse.add("student");
           Class[] params = new Class[args.size()];
           for (int i = 0; i < args.size(); i++) {
               params[i] = (Class) args.get(i);
           }
           roleObject.addListBlock(this, params);
           setupSort();
        }

        boolean blockEditing = false;

        boolean updateWhenManipulated = true;

        public void setUpdateWhenManipulated(boolean f) {
            updateWhenManipulated = f;
            if(f) {
                controller.view.StudentCoursesListtheModel.fireTableDataChanged();
            }
        }

        public void setListblockEditing(boolean f) {
            blockEditing = !f;
        }

        /**
         * Calculates and sets the width of the columns to their "best fit".
         */
        public void setBestFitColumnWidths() {
            GenovaTable.setBestFitColumnWidths(
                    controller.view.StudentCoursesList_table);
        }

        public int getLastRowLine() {
            return StudentCoursesListgetRowCount(0)-1;
        }

        public ListblockLine findInList(Object domainObject) {
            ListblockLine found = null;
            if (domainObject != null) {
                for (int i = 0; i <= getLastRowLine() && found == null; i++) {
                    ListblockLine aLine = getListblockLine(i);
                    if (aLine.contains(domainObject)) {
                        found = aLine;
                    }
                }
            }
            return found;
        }

        public void requestFocus() {
            controller.view.StudentCoursesList_table.requestFocus();
        }

        public boolean hasFocus() {
            return controller.view.StudentCoursesList_table.hasFocus();
        }

        public void setPopupMenu(String menuName) {
            view.activePopupMenuStudentCoursesList = controller.getPopupMenu(menuName);
        }

        public int size() {
            return StudentCoursesListNodeInfo.getVisualRowCount();
        }

        /** 
         * Creates a new empty listblock line.
         * @return The listblock line with empty fields.
         */
        public LineListblockStudentCoursesList createListblockLine() {
            LineListblockStudentCoursesList newLine = 
                    new LineListblockStudentCoursesList(controller);        
            return newLine;
        } 

        public ListblockLine getNewListblockLine() {
            return createListblockLine();
        }

        /**
         * Obtains the edit fields, and inserts the obtained objects into
         * a new list block line.
         * @return a list block line with objects from the edit fields.
         */
        public LineListblockStudentCoursesList createListblockLineFromEditFields() {
            LineListblockStudentCoursesList line = createListblockLine();
            List path = TypeTool.getDefaultList();
            path.add(thestudentCourses);
            Object studentCoursesObtained = thestudentCourses.recursiveObtain(path, true);
            StudentCourse studentCoursesSingle = null;
            if (studentCoursesObtained instanceof Set) {
                // The set only contains one instance of studentCourses
                Set studentCoursesSet = (Set) studentCoursesObtained;
                Iterator it = studentCoursesSet.iterator();
                if (it.hasNext()) {
                    studentCoursesSingle = (StudentCourse) it.next();
                }
            } else {
                studentCoursesSingle = (StudentCourse) studentCoursesObtained;
            }
            thestudentCourses.insertInListblockLine(studentCoursesSingle, line);
            return line;
        }

        public void makeRowVisible(int row) {
            if (view.StudentCoursesList_table.getColumnCount() == 0 ||
                    view.StudentCoursesList_table.getRowCount() == 0) {

                return;
            }
            if (row < 0 || row >= view.StudentCoursesList_table.getRowCount()) {
                throw new IllegalArgumentException(String.valueOf(row));
            }

            Rectangle visible = view.StudentCoursesList_table.getVisibleRect();
            Rectangle cell = view.StudentCoursesList_table.getCellRect(row, 0, true);
            if (row == 0) {
                visible.y = 0;
                view.StudentCoursesList_table.scrollRectToVisible(visible);
            } else if (cell.y < visible.y)  {
                visible.y = cell.y;
                view.StudentCoursesList_table.scrollRectToVisible(visible);
            } else if (cell.y + cell.height > visible.y + visible.height) {
                visible.y = cell.y + cell.height - visible.height;
                view.StudentCoursesList_table.scrollRectToVisible(visible);
            }

            view.StudentCoursesList_table.validate();
        }

        public Set getRoleNamesInUse() {
            return roleNamesInUse;
        }

        public boolean callHooksBeforeInsert(ListblockLine line) {
            return hookListBlockStudentCoursesListBeforeInsert(line);
        }

        public void setCheckForeignNodes(Boolean doCheck) {
            checkForeignNodes = doCheck;
        }

        public boolean checkForeignNodes() {
            return checkForeignNodes != null ? 
                checkForeignNodes.booleanValue() : getApplication().checkForeignNodes();
       }     
    /** Edits cell at a given row from the object of type parent with
     *  column columnName (named in Genova). The parent object is not
     *  modified, and only used to decide which field is to be edited
     *  in the listblock. The valid combinations of row, parent are:
     * <ul>
     * </ul>
     * This method does not use object selectors to pick which column
     * to use. 
     * @param row The row to use.
     * @param parent The object selection node that represent the object in the listblock.
     * @param fieldName The field name to use.
     */
     public void editField(int row, Object parent, String fieldName) {
         if(parent instanceof StudentCourse && fieldName.equals("id")) {
             view.StudentCoursesList_table.editCellAt(row, view.StudentCoursesList_indexes.indexOf(new Integer(0)));
         }
         if(parent instanceof Student && fieldName.equals("age")) {
             view.StudentCoursesList_table.editCellAt(row, view.StudentCoursesList_indexes.indexOf(new Integer(1)));
         }
         if(parent instanceof Student && fieldName.equals("id")) {
             view.StudentCoursesList_table.editCellAt(row, view.StudentCoursesList_indexes.indexOf(new Integer(2)));
         }
         if(parent instanceof Student && fieldName.equals("name")) {
             view.StudentCoursesList_table.editCellAt(row, view.StudentCoursesList_indexes.indexOf(new Integer(3)));
         }
         if(parent instanceof Student && fieldName.equals("studentNr")) {
             view.StudentCoursesList_table.editCellAt(row, view.StudentCoursesList_indexes.indexOf(new Integer(4)));
         }
     }
    public List getAsHTMLTable(int maxRows, boolean incHidden, Set excludedColumns, Map tagoptions) {
        // Genova parameter "GenerateHTML" is not set, so the method is not implemented.
        return null; 
    }
    /** Selects a given row and column in a listblock. Object parent is
     *  the matching object within the listblock
     * @param rowindex The row to select.
     * @param parent The object node to select.
     * @param fieldName The field name to select.
     */
    public void selectColumn(int rowindex, Object parent, String fieldName) {
        int columnindex = 0;
        if (view.StudentCoursesList_table.getColumnCount() == 0)
            return;
        makeRowVisible(rowindex);
         if(parent.equals(controller.thestudentCourses) && fieldName.equals("id")) {
             columnindex = view.StudentCoursesList_indexes.indexOf(new Integer(0));
         }
         if(parent.equals(controller.thestudent) && fieldName.equals("age")) {
             columnindex = view.StudentCoursesList_indexes.indexOf(new Integer(1));
         }
         if(parent.equals(controller.thestudent) && fieldName.equals("id")) {
             columnindex = view.StudentCoursesList_indexes.indexOf(new Integer(2));
         }
         if(parent.equals(controller.thestudent) && fieldName.equals("name")) {
             columnindex = view.StudentCoursesList_indexes.indexOf(new Integer(3));
         }
         if(parent.equals(controller.thestudent) && fieldName.equals("studentNr")) {
             columnindex = view.StudentCoursesList_indexes.indexOf(new Integer(4));
         }
        view.StudentCoursesList_table.changeSelection(rowindex, columnindex, false, false);
    }
    /** Makes a copy of a listblock line - note that the insert and
     *  replace methods uses this one, so the programmer do not need to
     * do so.
     * @param fromLine The source listblock line.
     * @param toLine The to listblock line.
     * @deprecated This method is no longer in use, and will be removed, when considered safe to do so.
     */
    public void copyListblockLineStudentCoursesList(LineListblockStudentCoursesList fromLine, LineListblockStudentCoursesList toLine) {
       toLine.copyStateFlags(fromLine);
        toLine.setstudentCourses ( 
                                   new StudentCourse ()
                               ); 
        TypeTool.reflectCopyMethod(fromLine.newstudentCourses, "id",toLine.newstudentCourses);
        toLine.setstudent ( 
                                   new Student ()
                               ); 
        TypeTool.reflectCopyMethod(fromLine.newstudent, "age",toLine.newstudent);
        TypeTool.reflectCopyMethod(fromLine.newstudent, "id",toLine.newstudent);
        TypeTool.reflectCopyMethod(fromLine.newstudent, "name",toLine.newstudent);
        TypeTool.reflectCopyMethod(fromLine.newstudent, "studentNr",toLine.newstudent);
    }
    /** Replaces a listblock line on position line.
     * @param data The listblock line to replace.
     * @param line The line number of the listblock line to replace.
     */
    public void replaceListblockLine(LineListblockStudentCoursesList data, int line) {
        view.block.increaseListblockStudentCoursesList();
        data.setLineNumber(line);
        data.markAsChanged();
        StudentCoursesListNodeInfo.setLine(data,line);
        data.fromListblockLineToCells(false);
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged();       
        }
        view.block.decreaseListblockStudentCoursesList();
    }

        void listblockSortColumnsBy(int column) {
            view.block.increaseListblockStudentCoursesList();
            List selectedLines = listblockMethodsStudentCoursesList.getSelectedLinesObject();
            if (comparatorList != null && comparatorList.size() > 0) {
                AbstractAttributeComparator firstComp = (AbstractAttributeComparator) comparatorList.get(0);
                AbstractAttributeComparator columnComp = AbstractAttributeComparator.getComparator(comparatorList, column);
                if (columnComp != null) {
                    if (columnComp == firstComp) {
                        columnComp.toggleDirection();
                    }
                    else {
                        if (comparatorList.remove(columnComp)) {
                            comparatorList.add(0, columnComp);
                            columnComp.setDirection(AbstractAttributeComparator.ASCENDING);
                            AbstractAttributeComparator.chainComparators(comparatorList);
                        }
                    }
                    StudentCoursesListNodeInfo.sort((Comparator) comparatorList.get(0));
                    setLineNumbers();
                    view.StudentCoursesListtheModel.fireTableDataChanged();
                }
            }
            if (selectedLines != null) {
                Iterator it = selectedLines.iterator();
                int[] selection = new int[selectedLines.size()];
                int i = 0;
                while (it.hasNext()) {
                    selection[i++] = ((LineListblockStudentCoursesList) it.next()).getLineNumber();
                }
                listblockMethodsStudentCoursesList.setSelectedLines(selection);
            }
            view.block.decreaseListblockStudentCoursesList();
        }

        void listblockSortColumnsBy(int column, boolean doConvert) {
            view.block.increaseListblockStudentCoursesList();
            LineListblockStudentCoursesList selected = getSelectedLineObject();
            switch (column) {
            case 0: 
                doConvert=true;
                break;
            case 1: 
                doConvert=true;
                break;
            case 2: 
                doConvert=true;
                break;
            case 3: 
                doConvert=true;
                break;
            case 4: 
                doConvert=true;
                break;
            }
            int convertedCol = doConvert ? ((Integer)controller.view.StudentCoursesList_indexes.get(column)).intValue() : column;
            setColumnToUse(convertedCol, null);
            if(!controller.overrideSortListblock("StudentCoursesList", StudentCoursesListNodeInfo, convertedCol, (Boolean)directions.get(new Integer(convertedCol)))) {
                StudentCoursesListNodeInfo.sort(this);
            }
            if(updateWhenManipulated) {
                view.StudentCoursesListtheModel.fireTableDataChanged();
            }
            setLineNumbers();
            if(selected != null) {
                int line = selected.getLineNumber();
                setSelectedLine(line);
                makeRowVisible(line);
            }
            view.block.decreaseListblockStudentCoursesList();
        }

    /**
     * Does the initial sorting of the listblock.
     * The initial sorting is specified as a listblock property in Genova.
     * @param listblockLines the List of listblockLines to sort.
     */
    public void initialSort(List listblockLines) {
        if (comparatorList == null) {  // Else keep existing user sort
            setupSort();
        }
        if (comparatorList.size() > 0) {
            Collections.sort(listblockLines, (Comparator) comparatorList.get(0));
        }
    }

    /**
     * Reset to the initial sorting of the listblock.
     */
    public void resetSort() {
        setupSort();
        if (comparatorList.size() > 0) {
            StudentCoursesListNodeInfo.sort((Comparator) comparatorList.get(0));
            setLineNumbers();
            view.StudentCoursesListtheModel.fireTableDataChanged();
        }
    }

    private List comparatorList;

    /**
     * Builds the list of comparators for the listblock
     */
    public void setupSort() {
        comparatorList = TypeTool.getDefaultList();
        int column = 0;

        class Comparator_studentCourses_id extends AbstractAttributeComparator {

            Comparator_studentCourses_id(int column) {
                super("studentCourses.id", column, 0+1000, 0);
            }

            public int compare(Object o1, Object o2) {
                LineListblockStudentCoursesList lineOne = (LineListblockStudentCoursesList) o1;
                LineListblockStudentCoursesList lineTwo = (LineListblockStudentCoursesList) o2;
                StudentCourse obj1 = lineOne.getstudentCourses(false);
                StudentCourse obj2 = lineTwo.getstudentCourses(false);

                Object val1 = obj1 != null ? TypeTool.toObject(obj1.getId()) : null;
                Object val2 = obj2 != null ? TypeTool.toObject(obj2.getId()) : null;
                int result = TypeTool.compareTo(val1, val2);
                if (getDirection() == DESCENDING) {
                    result *= -1;
                }
                if (result == 0 && getNextComparator() != null) {
                    result = getNextComparator().compare(o1, o2);
                }
                return result;
            }
        }
        comparatorList.add(new Comparator_studentCourses_id(column));
        ++column;

        class Comparator_student_age extends AbstractAttributeComparator {

            Comparator_student_age(int column) {
                super("student.age", column, 1+1000, 0);
            }

            public int compare(Object o1, Object o2) {
                LineListblockStudentCoursesList lineOne = (LineListblockStudentCoursesList) o1;
                LineListblockStudentCoursesList lineTwo = (LineListblockStudentCoursesList) o2;
                Student obj1 = lineOne.getstudent(false);
                Student obj2 = lineTwo.getstudent(false);

                Object val1 = obj1 != null ? TypeTool.toObject(obj1.getAge()) : null;
                Object val2 = obj2 != null ? TypeTool.toObject(obj2.getAge()) : null;
                int result = TypeTool.compareTo(val1, val2);
                if (getDirection() == DESCENDING) {
                    result *= -1;
                }
                if (result == 0 && getNextComparator() != null) {
                    result = getNextComparator().compare(o1, o2);
                }
                return result;
            }
        }
        comparatorList.add(new Comparator_student_age(column));
        ++column;

        class Comparator_student_id extends AbstractAttributeComparator {

            Comparator_student_id(int column) {
                super("student.id", column, 2+1000, 0);
            }

            public int compare(Object o1, Object o2) {
                LineListblockStudentCoursesList lineOne = (LineListblockStudentCoursesList) o1;
                LineListblockStudentCoursesList lineTwo = (LineListblockStudentCoursesList) o2;
                Student obj1 = lineOne.getstudent(false);
                Student obj2 = lineTwo.getstudent(false);

                Object val1 = obj1 != null ? TypeTool.toObject(obj1.getId()) : null;
                Object val2 = obj2 != null ? TypeTool.toObject(obj2.getId()) : null;
                int result = TypeTool.compareTo(val1, val2);
                if (getDirection() == DESCENDING) {
                    result *= -1;
                }
                if (result == 0 && getNextComparator() != null) {
                    result = getNextComparator().compare(o1, o2);
                }
                return result;
            }
        }
        comparatorList.add(new Comparator_student_id(column));
        ++column;

        class Comparator_student_name extends AbstractAttributeComparator {

            Comparator_student_name(int column) {
                super("student.name", column, 3+1000, 0);
            }

            public int compare(Object o1, Object o2) {
                LineListblockStudentCoursesList lineOne = (LineListblockStudentCoursesList) o1;
                LineListblockStudentCoursesList lineTwo = (LineListblockStudentCoursesList) o2;
                Student obj1 = lineOne.getstudent(false);
                Student obj2 = lineTwo.getstudent(false);

                Object val1 = obj1 != null ? TypeTool.toObject(obj1.getName()) : null;
                Object val2 = obj2 != null ? TypeTool.toObject(obj2.getName()) : null;
                int result = TypeTool.compareTo(val1, val2);
                if (getDirection() == DESCENDING) {
                    result *= -1;
                }
                if (result == 0 && getNextComparator() != null) {
                    result = getNextComparator().compare(o1, o2);
                }
                return result;
            }
        }
        comparatorList.add(new Comparator_student_name(column));
        ++column;

        class Comparator_student_studentNr extends AbstractAttributeComparator {

            Comparator_student_studentNr(int column) {
                super("student.studentNr", column, 4+1000, 0);
            }

            public int compare(Object o1, Object o2) {
                LineListblockStudentCoursesList lineOne = (LineListblockStudentCoursesList) o1;
                LineListblockStudentCoursesList lineTwo = (LineListblockStudentCoursesList) o2;
                Student obj1 = lineOne.getstudent(false);
                Student obj2 = lineTwo.getstudent(false);

                Object val1 = obj1 != null ? TypeTool.toObject(obj1.getStudentNr()) : null;
                Object val2 = obj2 != null ? TypeTool.toObject(obj2.getStudentNr()) : null;
                int result = TypeTool.compareTo(val1, val2);
                if (getDirection() == DESCENDING) {
                    result *= -1;
                }
                if (result == 0 && getNextComparator() != null) {
                    result = getNextComparator().compare(o1, o2);
                }
                return result;
            }
        }
        comparatorList.add(new Comparator_student_studentNr(column));
        ++column;
        if (comparatorList.size() > 0) {
            Collections.sort(comparatorList);
            AbstractAttributeComparator.chainComparators(comparatorList);
        }
    }
    /** 
     * Sorts the data in the listblock based on column type. The
     * column to use are defined by the type and attribute field. The
     * direction of the sort is inverted for each call to the same
     * column. Valid combinations of type and attribute are:
     * <ul>
     * </ul>
     * @param type The object selection node to use.
     * @param attribute The attribute to sort.
     * @deprecated
     */
    public void listblockSortColumn(Object type, String attribute) {
    if(type instanceof StudentCourse && attribute.equals("id")) {
        listblockSortColumnsBy(0, false);
        return;
    }
    if(type instanceof Student && attribute.equals("age")) {
        listblockSortColumnsBy(1, false);
        return;
    }
    if(type instanceof Student && attribute.equals("id")) {
        listblockSortColumnsBy(2, false);
        return;
    }
    if(type instanceof Student && attribute.equals("name")) {
        listblockSortColumnsBy(3, false);
        return;
    }
    if(type instanceof Student && attribute.equals("studentNr")) {
        listblockSortColumnsBy(4, false);
        return;
    }
     }
 /** 
  * Sorts the data in the listblock based on column type. The
  * column to use are defined by the type and attribute field.
  * column. Valid combinations of type and attribute are:
  * <ul>
  * </ul>
  * @param type The object type to sort.
  * @param attribute The attribute to sort with.
  * @param ascending If true, the sort will be done ascending. If not it will be descending.
  * @deprecated
  */
    public void listblockSortColumn(Object type, String attribute, boolean ascending) {
    if(type instanceof StudentCourse && attribute.equals("id")) {
        if(ascending) {
            setColumnToUse(0, Boolean.TRUE);
        } else {
            setColumnToUse(0, Boolean.FALSE);
        }
        listblockSortColumnsBy(0, false);
        return;
    }
    if(type instanceof Student && attribute.equals("age")) {
        if(ascending) {
            setColumnToUse(1, Boolean.TRUE);
        } else {
            setColumnToUse(1, Boolean.FALSE);
        }
        listblockSortColumnsBy(1, false);
        return;
    }
    if(type instanceof Student && attribute.equals("id")) {
        if(ascending) {
            setColumnToUse(2, Boolean.TRUE);
        } else {
            setColumnToUse(2, Boolean.FALSE);
        }
        listblockSortColumnsBy(2, false);
        return;
    }
    if(type instanceof Student && attribute.equals("name")) {
        if(ascending) {
            setColumnToUse(3, Boolean.TRUE);
        } else {
            setColumnToUse(3, Boolean.FALSE);
        }
        listblockSortColumnsBy(3, false);
        return;
    }
    if(type instanceof Student && attribute.equals("studentNr")) {
        if(ascending) {
            setColumnToUse(4, Boolean.TRUE);
        } else {
            setColumnToUse(4, Boolean.FALSE);
        }
        listblockSortColumnsBy(4, false);
        return;
    }
     }
    /** Inserts a set of domain objects into the listblock of name StudentCoursesList.
     * @return the created listblock line.
 * @param pstudentCourses the studentCourses domain object 
 * @param pstudent the student domain object 
     */
    public LineListblockStudentCoursesList insert(
            StudentCourse pstudentCourses
            ,Student pstudent
            ) {
        return insert(
                pstudentCourses,
                pstudent,
                size());
    }

    /** Inserts empty line at end of listblock StudentCoursesList.
     * @return the inserted listblock line.
     */
    public LineListblockStudentCoursesList insert() {
        return insert(size());
    }
    /** Inserts empty line at given line of listblock StudentCoursesList.
     * @param line The line number to use.
     * @return The newly created listblock line.
     */
    public LineListblockStudentCoursesList insert(int line) {
        LineListblockStudentCoursesList newLine = createListblockLine();
        insertListblockLine(newLine, line);
        setSelectedLine(newLine);
        return newLine;
    }
    /** Inserts domain objects into the listblock at the specified line.
     *  StudentCoursesList.
     * @param lineNumber line to insert.
 * @param pstudentCourses the studentCourses domain object 
 * @param pstudent the student domain object 
     * @return The newly created listblock line.
     */
    public LineListblockStudentCoursesList insert(
                StudentCourse pstudentCourses,
                Student pstudent,
                int lineNumber) {
        LineListblockStudentCoursesList newLine = createListblockLine();
        newLine.setstudentCourses(pstudentCourses); 
        newLine.setstudent(pstudent); 
        insertListblockLine(newLine, lineNumber);
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged();
            makeRowVisible(lineNumber);
        }
        return newLine;
    }

    /** Inserts a set of domain objects into the listblock of name
     *  StudentCoursesList at a given line.
     * @param lInEnUmBer The line number to replace.
 * @param pstudentCourses the studentCourses domain object 
 * @param pstudent the student domain object 
     */
    public void replaceLineListblock(
         StudentCourse pstudentCourses
  ,  
         Student pstudent
                               ,int lInEnUmBer
                                       ) {
        view.block.increaseListblockStudentCoursesList();
        LineListblockStudentCoursesList newLine = getListblockLinePrivate(lInEnUmBer);
         newLine.setstudentCourses ( pstudentCourses );
         newLine.setstudent ( pstudent );
        newLine.setLineNumber(lInEnUmBer);
        newLine.markAsChanged();
        StudentCoursesListNodeInfo.setLine(newLine, lInEnUmBer);
        newLine.fromListblockLineToCells(false);
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged();
        }
        view.block.decreaseListblockStudentCoursesList();
    }

    /** Marks a line in listblock StudentCoursesList as deleted.
     * @param line The row to delete.
     */
    public void deleteListblockLine(int line) {
        view.block.increaseListblockStudentCoursesList();
        ((LineListblockStudentCoursesList)StudentCoursesListNodeInfo.getLine(line)).markAsDeleted();
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged();
        }
        int linesInView=StudentCoursesListgetRowCount(0);
        if (linesInView > 0){
            if (line >= linesInView)        
                setSelectedLine(linesInView -1);
            else
                setSelectedLine(line);
        }
        view.block.decreaseListblockStudentCoursesList();
    }
    /** Marks a set of lines in listblock StudentCoursesList as deleted.
     * @param lines The rows to delete.
     */
    public void deleteListblockLine(int lines[]) {
        view.block.increaseListblockStudentCoursesList();
        for(int i=lines.length;i-- > 0;) {
            ((LineListblockStudentCoursesList)StudentCoursesListNodeInfo.getLine(lines[i])).markAsDeleted();
        }
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged();
        }
        view.block.decreaseListblockStudentCoursesList();
    }

    /**
     * Inserts a Listblock line object into the listblock.
     * @param data The listblock line to insert
     */
    public void insertNewListblockLine(ListblockLine data) {
        insertListblockLine((LineListblockStudentCoursesList) data);
    }
    private void insertListblockLineEDT(final LineListblockStudentCoursesList data) {
        Runnable task = new Runnable() {
            public void run() {
                insertListblockLine(data);
            }
        };
        edt(task, "insertListblockLine");
    }
    /** Inserts a Listblock line object into the listblock StudentCoursesList. 
     * @param data The listblock line to insert.
     */
    public void insertListblockLine(LineListblockStudentCoursesList data) {
        if (!SwingUtilities.isEventDispatchThread()) {
            insertListblockLineEDT(data);
            return;
        }
        view.block.increaseListblockStudentCoursesList();
        data.setLineNumber(StudentCoursesListNodeInfo.size());
        StudentCoursesListNodeInfo.addLine(data);
        data.markAsNew();
        data.fromListblockLineToCells(false);
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged();       
        }
        view.block.decreaseListblockStudentCoursesList();
    } 
    private void insertListblockLineEDT(final LineListblockStudentCoursesList data, final int line) {
        Runnable task = new Runnable() {
            public void run() {
                insertListblockLine(data, line);
            }
        };
        edt(task, "insertListblockLine");
    }
    /** Inserts a Listblock line object into the listblock StudentCoursesList at a given line.
     * @param data The listblock line to insert.
     * @param line The line number to insert line at.
     */
    public void insertListblockLine(LineListblockStudentCoursesList data, int line) {
        view.block.increaseListblockStudentCoursesList();
        data.setLineNumber(line);
        StudentCoursesListNodeInfo.addLine(data, line);
        data.markAsNew();
        data.fromListblockLineToCells(false);
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged();       
        }
        view.block.decreaseListblockStudentCoursesList();
    } 

    /**
     * Inserts listblock lines on edt
     * @param data
     * @see #insertListblockLines(List)
     */
    private void insertListblockLinesEDT(final List data) {
        Runnable task = new Runnable() {
            public void run() {
                insertListblockLines(data);
            }
        };
        edt(task, "insertListblockLines");
    }

    /** Adds a list of listblock line to the listblock StudentCoursesList 
     * @param data List of LineListblockStudentCoursesListobjects.
     */
    public void insertListblockLines(List data) {
        if (!SwingUtilities.isEventDispatchThread()) {
            insertListblockLinesEDT(data);
            return;
        }
        for(Iterator it = data.iterator(); it.hasNext();) {
            insertListblockLine((LineListblockStudentCoursesList)it.next());
        }
    }
    /** Inserts a Listblock line object into the listblock StudentCoursesList at the
     *  first line in the listblock.
     * @param data the listblock line.
     */
    public void insertListblockLineFirstStudentCoursesList(LineListblockStudentCoursesList data) {
        insertListblockLine(data,0);
    }
    /** Removes all lines from the listblock StudentCoursesList. */
    public void purgeAllLines() {
        view.block.increaseListblockStudentCoursesList();
        clearSelectedLines();
        StudentCoursesListNodeInfo.clearLines();
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged(); 
        }
        lastSelectedLines = null;
        view.block.decreaseListblockStudentCoursesList();
    }
    private void renumberLines() {
        Vector v = StudentCoursesListNodeInfo.allLines();
        int n = 0;
        for(Iterator i = v.iterator();i.hasNext();) {
            LineListblockStudentCoursesList line = (LineListblockStudentCoursesList)i.next();
            line.setLineNumber(n++);
        }
    }
    /** Removes a given set of lines from the listblock StudentCoursesList.
     * @param lines The rows to purge.
     */
    public void purgeLine(int lines[]) {
        if(lines == null || lines.length == 0) {
            return;
        }
        view.block.increaseListblockStudentCoursesList();
        StudentCoursesListNodeInfo.clearLines(lines);
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged(); 
        }
        lastSelectedLines = null;
        renumberLines();
        view.block.decreaseListblockStudentCoursesList();
    }
    /** Removes a given line from the listblock StudentCoursesList. 
     *  @param line the line number to remove.
     */
    public void purgeLine(int line) {
        view.block.increaseListblockStudentCoursesList();
        StudentCoursesListNodeInfo.clearLine(line);
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged(); 
        }
        lastSelectedLines = null;
        renumberLines();
        view.block.decreaseListblockStudentCoursesList();
    }
    /** Removes a given list of listblocklines, based on their linenumbers. 
     * @param lines List of LineListblockStudentCoursesList objects to purge.
     */
    public void purgeLines(List lines) {
        if(lines == null) {
            return;
        }
        view.block.increaseListblockStudentCoursesList();
        int[] delLines = new int[lines.size()];
        int pos = 0;
        for(Iterator i = lines.iterator();i.hasNext();) {
             LineListblockStudentCoursesList enName = (LineListblockStudentCoursesList)i.next();
             delLines[pos++] = enName.getLineNumber();
        }
        purgeLine(delLines);
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged(); 
        }
        lastSelectedLines = null;
        renumberLines();
        view.block.decreaseListblockStudentCoursesList();
    }

    /** Moves a line in the listblock from position <it>from</it> to
     * <it>to</it>.  
     * @param from The source row.
     * @param to The target row.
     */
    public void moveLine(int from, int to) {
        view.block.increaseListblockStudentCoursesList();
        StudentCoursesListNodeInfo.moveElement(from,to);
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged(); 
        }
        renumberLines();
        view.block.decreaseListblockStudentCoursesList();
     }
    /** Moves the lines described in the fromRange array into the
     * position <it>to</it>. The first line are added to the first
     * position at to, the second at the second place and so on.
     * @param fromLines Moes these lines...
     * @param toLine Target line.
     */
    public void moveLine(int fromLines[], int toLine) {
        view.block.increaseListblockStudentCoursesList();
        for(int i=fromLines.length;i-- > 0;) {
            StudentCoursesListNodeInfo.moveElement(fromLines[i], toLine);
        }
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged(); 
        }
        renumberLines();
        view.block.decreaseListblockStudentCoursesList();
    }
    /** Marks all lines in the listblock StudentCoursesListas not new, not changed and not deleted. Also copies data from new to old. 
     * @deprecated use 
     */
    public void reset() {
        view.block.increaseListblockStudentCoursesList();
        for(Enumeration e = StudentCoursesListNodeInfo.elements();e.hasMoreElements();) {
            ((LineListblockStudentCoursesList)e.nextElement()).reset();
        }
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged(); 
        }
        view.block.decreaseListblockStudentCoursesList();
    }
    /** Marks all lines as not deleted, changed or new, without copying of
        old data */
    public void forceClean() {
        view.block.increaseListblockStudentCoursesList();
        for(Enumeration e = StudentCoursesListNodeInfo.elements();e.hasMoreElements();) {
            ((LineListblockStudentCoursesList)e.nextElement()).forceClean();
        }
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged(); 
        }
        view.block.decreaseListblockStudentCoursesList();
    }
    /** Mark line in the listblock StudentCoursesListas not new, not changed and
     * not deleted. Also copies data from new to old. 
     * @param line The line to reset.
     */
    public void reset(int line) {
        view.block.increaseListblockStudentCoursesList();
        getListblockLinePrivateModel(line).reset();
        if(updateWhenManipulated) {
            view.StudentCoursesListtheModel.fireTableDataChanged(); 
        }
        view.block.decreaseListblockStudentCoursesList();
    }
    /** Signals that all edit fields should stop editing. This will
     * copy data beeing edited into the listblock line. */
    public void stopEditing() {
        if(view.StudentCoursesListblockStopEditing > 0) {
            return;
        }
        view.StudentCoursesListblockStopEditing++;
        int row = view.StudentCoursesList_table.getEditingRow();
        if(row < 0) {
            return;
        }
        view.StudentCoursesListblockStopEditing--;
    }
     public List getChangedLines() {
        view.block.increaseListblockStudentCoursesList();
        List changed = TypeTool.getDefaultList();
        List allLines = allLines();
        if (allLines != null) {
            Iterator it = allLines.iterator();
            while (it.hasNext()) {
                ListblockLine line = (ListblockLine) it.next();
                if (line.isChanged()) {
                    changed.add(line);
                }
            }
        }
        view.block.decreaseListblockStudentCoursesList();
        return changed.size() == 0 ? null : changed;
    }

    public List obtainChangedLines() {
        List changed = getChangedLines();
        if (changed != null) {
            Iterator it = changed.iterator();
            while (it.hasNext()) {
                ((ListblockLine) it.next()).obtain();
            }
        }
        return changed;
    }
    /** Returns a list of lines that has been created sinze initialization or reset.
     * See method changedLinesStudentCoursesList() for retrieveing changed lines.
     * @return List of LineListblockStudentCoursesListobjects.
     */
    public List insertedLines() {
        view.block.increaseListblockStudentCoursesList();
        if(StudentCoursesListNodeInfo.size() > 0) {
            stopEditing();
        }
        Vector ret = new Vector();
        for(Enumeration e = StudentCoursesListNodeInfo.elements();e.hasMoreElements();) {
            LineListblockStudentCoursesList one = ((LineListblockStudentCoursesList)e.nextElement());
            if(one.isNew()) {
                ret.add(one);
            }
        }
        if(ret.size() == 0) {
            ret = null;
        }
        view.block.decreaseListblockStudentCoursesList();
        return ret;
    }
 /** Returns a list of lines that has been deleted sinze
  *  initialization or reset from the listblock with name StudentCoursesList.
  *  @return A list of the deleted lines in the listblock. The elements are LineListblockStudentCoursesListobjects.
  */
    public List deletedLines() {
        view.block.increaseListblockStudentCoursesList();
        if(StudentCoursesListNodeInfo.size() > 0) {
            stopEditing();
        }
        Vector ret = new Vector();
        for(Enumeration e = StudentCoursesListNodeInfo.elements();e.hasMoreElements();) {
            LineListblockStudentCoursesList one = ((LineListblockStudentCoursesList)e.nextElement());
            if(one.isDeleted()) {
                ret.add(one);
            }
        }
        if(ret.size() == 0) {
            ret = null;
        }
        view.block.decreaseListblockStudentCoursesList();
        return ret;
    }
/** Returns true if there is any new lines in this listblock 
 * @return True if new lines are added, false if not.
 */
    public boolean hasNewLines() {
        view.block.increaseListblockStudentCoursesList();
        if(StudentCoursesListNodeInfo.size() > 0) {
            stopEditing();
        }
        try {
            for(Enumeration e = StudentCoursesListNodeInfo.elements();e.hasMoreElements();) {
                LineListblockStudentCoursesList one = ((LineListblockStudentCoursesList)e.nextElement());
                if(one.isNew()) {
                    return true;
                }
            }
            return false;
        } finally {
            view.block.decreaseListblockStudentCoursesList();
        }
    }
/** Returns a list of lines that is new sinze
 *  initialization or reset from the listblock with name StudentCoursesList.
 * @return List of LineListblockStudentCoursesList objects.
 */
    public List newLines() {
        view.block.increaseListblockStudentCoursesList();
        if(StudentCoursesListNodeInfo.size() > 0) {
            stopEditing();
        }
        LinkedList ret = new LinkedList();
        for(Enumeration e = StudentCoursesListNodeInfo.elements();e.hasMoreElements();) {
            LineListblockStudentCoursesList one = ((LineListblockStudentCoursesList)e.nextElement());
            if(one.isNew()) {
                ret.add(one);
            }
        }
        if(ret.size() == 0) {
            ret = null;
        }
        view.block.decreaseListblockStudentCoursesList();
        return ret;
    }
/** Returns a list of lines that hasn't been manipulated sinze
 *  initialization or reset from the listblock with name
 *  StudentCoursesList. (Not new, deleted or changed)
 * @return List of LineListblockStudentCoursesList objects.
 */
    public List cleanLines() {
        view.block.increaseListblockStudentCoursesList();
        if(StudentCoursesListNodeInfo.size() > 0) {
            stopEditing();
        }
        Vector ret = new Vector();
        for(Enumeration e = StudentCoursesListNodeInfo.elements();e.hasMoreElements();) {
            LineListblockStudentCoursesList one = ((LineListblockStudentCoursesList)e.nextElement());
            if(!one.isNew() && !one.isDeleted() && !one.isChanged()) {
                ret.add(one);
            }
        }
        if(ret.size() == 0) {
            ret = null;
        }
        view.block.decreaseListblockStudentCoursesList();
        return ret;
    }
    /** Returns all touched lines (new, deleted or changed) in the listblock. 
     * @return List of LineListblockStudentCoursesList objects.
     */
    public List touchedLines() {
        view.block.increaseListblockStudentCoursesList();
        Vector ret = new Vector();
        if(StudentCoursesListNodeInfo.size() > 0) {
            stopEditing();
        }
        for(Enumeration e = StudentCoursesListNodeInfo.elements();e.hasMoreElements();) {
            LineListblockStudentCoursesList one = ((LineListblockStudentCoursesList)e.nextElement());
            if(one.isNew() || one.isDeleted() || one.isChanged()) {
                ret.add(one);
            }
        }
        if(ret.size() == 0) {
            ret = null;
        }
        view.block.decreaseListblockStudentCoursesList();
        return ret;
    }
    /** Returns all lines in the listblock.
     * @return List of LineListblockStudentCoursesList objects.
     */
    public List allLines() {
        List retVal;
        view.block.increaseListblockStudentCoursesList();
        if(StudentCoursesListNodeInfo.size() > 0) {
            stopEditing();
        }
        retVal = StudentCoursesListNodeInfo.allLines();
        view.block.decreaseListblockStudentCoursesList();
        return retVal;
    }

    /**
     * Returns one line from the listblock StudentCoursesList.
     * @param line The row in the listblock.
     * @return The listblockline object.
     */
    public LineListblockStudentCoursesList getListblockLineModel(int line) {
        LineListblockStudentCoursesList retVal;
        view.block.increaseListblockStudentCoursesList();
        stopEditing();
        retVal = getListblockLinePrivateModel(line);
        view.block.decreaseListblockStudentCoursesList();
        return retVal;
    }

    /**
     * Returns one line from the listblock StudentCoursesList.
     * @param line The row in the listblock.
     * @return The listblockline object.
     */
    public LineListblockStudentCoursesList getListblockLine(int line) {
        LineListblockStudentCoursesList retVal;
        view.block.increaseListblockStudentCoursesList();
        stopEditing();
        retVal = getListblockLinePrivate(line);
        view.block.decreaseListblockStudentCoursesList();
        return retVal;
    }

    public ListblockLine getLine(int rowIndex) {
        return getListblockLine(rowIndex);
    }

    LineListblockStudentCoursesList getListblockLinePrivateModel(int line) {
        try {
            return (LineListblockStudentCoursesList)StudentCoursesListNodeInfo.getLine(line);
        }
        catch(Exception e) {
            return null;
        }
    }

    LineListblockStudentCoursesList getListblockLinePrivate(int line) {
        try {
            return (LineListblockStudentCoursesList)StudentCoursesListNodeInfo.getLine(line);
        }
        catch(Exception e) {
            return null;
        }
    }

   /**
     * Returns the line number of the specified line if it is
     * present in the listblock
     * @param aLine the list block line 
     * @return the line number of the listblock line, or -1 if it's
     * not in the lisblock.
     */
    public int getLineNumber(ListblockLine aLine) {
        List allLines = allLines();
        if (allLines == null) {
            return -1;
        }
        Iterator it = allLines.iterator();
        while (it.hasNext()) {
            LineListblockStudentCoursesList currLine = (LineListblockStudentCoursesList) it.next();
            if (currLine.equals(aLine)) {
                return currLine.getLineNumber();
            }
        }
        return -1;
    }

   /**
     * Iterate through NodeInfo and set line numbers.
     */
    public void setLineNumbers() {
        int j = 0;
        for(Enumeration i = StudentCoursesListNodeInfo.elements();i.hasMoreElements();) {
            LineListblockStudentCoursesList one = (LineListblockStudentCoursesList)i.nextElement();
            one.setLineNumber(j++);
        }
    }

/** If you want the selection in the listblock to have background color (white) while in the selection, you should call this with true. It defaults to false in the templates. If you want to change this, set the defaultSelectedBackgroundName variable to true;
    @param x ...
*/
    public void setShowSingleSelection(boolean x) {
        view.hasCellSelectionColorStudentCoursesList = x;
    }

    /** Returns the position of selected line in listblock StudentCoursesList.
     * @return The row number of the line.
     */
    public int getSelectedLine() {
        if(view.StudentCoursesList_table == null) {
            return -1;
        }
        return view.StudentCoursesList_table.getSelectedRow();
    }

    /** Returns a list of indexes of selected lines in listblock StudentCoursesList.
     * @return The selected rows.
     */
    public int[] getSelectedLines() {
        return view.StudentCoursesList_table.getSelectedRows();
    }

    /** Returns listblock line object of selected line in listblock StudentCoursesList.
     * @return The selected line object.
     */
    public LineListblockStudentCoursesList getSelectedLineObject() {
        view.block.increaseListblockStudentCoursesList();
        int pos = view.StudentCoursesList_table.getSelectedRow();
        LineListblockStudentCoursesList retVal = null;
        if(pos >= 0) {
            if(StudentCoursesListNodeInfo.getVisualRowCount() > 0) {
                stopEditing();
                retVal = (LineListblockStudentCoursesList)StudentCoursesListNodeInfo.getLine(pos);
            }
        }
        view.block.decreaseListblockStudentCoursesList();
        return retVal;
    }

    /** Returns a list of listblock line object of selected
     *  lines in listblock StudentCoursesList. 
     * @return A list of objects of type LineListblockStudentCoursesList if any matches, null otherwise.
     */
    public List getSelectedLinesObject() {
        view.block.increaseListblockStudentCoursesList();
        Vector ret = new Vector();
        int selected[] = view.StudentCoursesList_table.getSelectedRows();
        if(selected.length == 0) {
            view.block.decreaseListblockStudentCoursesList();
            return null;
        }
        for(int i=0; i < selected.length; i++) {
            ret.add(StudentCoursesListNodeInfo.getLine(selected[i]));
        }
        view.block.decreaseListblockStudentCoursesList();
        return ret;
    }

    /** Clears selected lines in listblock StudentCoursesList. If it contains no
        lines, the call does nothing. */
    public void clearSelectedLines() {
        view.block.increaseListblockStudentCoursesList();
        lastSelectedLines = null;
        if(view.StudentCoursesList_table.getRowCount() > 0) {
            view.StudentCoursesList_table.clearSelection();
        }
        view.block.decreaseListblockStudentCoursesList();
    }

    /** Selects line in listblock StudentCoursesList.
     * @param line The row to select.
     */
    public void setSelectedLine(int line) {
        view.block.increaseListblockStudentCoursesList();
        clearSelectedLines();
        view.StudentCoursesList_table.setRowSelectionInterval(line,line);
        lastSelectedLines = view.StudentCoursesList_table.getSelectedRows();
        makeRowVisible(line);
        view.block.decreaseListblockStudentCoursesList();
    }

    public void setSelectedLine(ListblockLine aLine) {
        int lineNumber = getLineNumber(aLine);
        if (lineNumber > -1) {
            setSelectedLine(lineNumber);
        }
    }

    public GenovaTable getTable() {
        return controller.view.StudentCoursesList_table;
    }

    /** Selects a set of lines in listblock StudentCoursesList.
     * @param lines The rows to select.
     */
    public void setSelectedLines(int lines[]) {
        view.block.increaseListblockStudentCoursesList();
        clearSelectedLines();
        for(int i=0; i < lines.length;i++) {
            view.StudentCoursesList_table.addRowSelectionInterval(lines[i],lines[i]);
        }
        lastSelectedLines = view.StudentCoursesList_table.getSelectedRows();
        view.block.decreaseListblockStudentCoursesList();
    }

    /**
     * Recursivly clears the edit fields of this table. First, 
     * the studentCourses role and all it's members are cleared. Then
     * nodes that are not part of the object selection tree starting 
     * at the studentCourses node is cleared.
     */
    public void clearEditFields() {
        Set stillToClear = new HashSet();
        stillToClear.addAll(getRoleNamesInUse());
        thestudentCourses.clear();
        stillToClear.remove(thestudentCourses.getRoleName());
        ClearTool ct = new ClearTool(roleObjects);
        ct.clearMembers("studentCourses");
        stillToClear.removeAll(thestudentCourses.getAllChildNames());
        Iterator it = stillToClear.iterator();
        while (it.hasNext()) {
            ct.clear((String) it.next());
        }
    }
    private int columnToUse = 0;
    Hashtable directions = new Hashtable();
 /** Sets the column to use in the sort. This method is used by the
  * sorting methods to signal to the compare method how the sort is
  * done. Normally you would not call this method directly, but insted
  * used the listblockSortColumn methods.
  * @param c The column to use.
  * @param dir The direction to perform the sort with.
  */
    public void setColumnToUse(int c, Boolean dir) {
        Integer k = new Integer(c);
        columnToUse = c;
        Object direction = (Boolean)directions.get(k);
        if(dir != null) {
            directions.put(k, dir);
        } else if(direction == null) {
            directions.put(k, Boolean.FALSE);
        }
        else {
            if(direction == Boolean.FALSE) {
                directions.put(k, Boolean.TRUE);
            }
            else {
                directions.put(k, Boolean.FALSE);
            }
        }
    }
 /** Comparator used to sort the columns in the listblock.  Sorting is
  * done based on the datatypes of the various columns. If you need an
  * alternative sorting, then you should override this method. (For
  * instance if you need that sorting of a given column should also
  * inc. data from other columns.). If you plan to do so, then read
  * the generated source - good luck :-)
  *
  * <p> Sorting of columns are done using one column of a time.
  * @param o1 Instance of ListblockLine which are compared.
  * @param o2 Instance of ListblockLine which are compared.
  * @return As defined by the comparator interrace.
  */
    public int compare(Object o1, Object o2) {
        switch(columnToUse) {
           case 0:
              if(directions.get(new Integer(0)) == Boolean.FALSE) {
                 return TypeTool.compareTo(((LineListblockStudentCoursesList)o1).newstudentCourses.getId(),((LineListblockStudentCoursesList)o2).newstudentCourses.getId());
              }
              return TypeTool.compareTo(((LineListblockStudentCoursesList)o2).newstudentCourses.getId(),((LineListblockStudentCoursesList)o1).newstudentCourses.getId());
           case 1:
              if(directions.get(new Integer(1)) == Boolean.FALSE) {
                 return TypeTool.compareTo(((LineListblockStudentCoursesList)o1).newstudent.getAge(),((LineListblockStudentCoursesList)o2).newstudent.getAge());
              }
              return TypeTool.compareTo(((LineListblockStudentCoursesList)o2).newstudent.getAge(),((LineListblockStudentCoursesList)o1).newstudent.getAge());
           case 2:
              if(directions.get(new Integer(2)) == Boolean.FALSE) {
                 return TypeTool.compareTo(((LineListblockStudentCoursesList)o1).newstudent.getId(),((LineListblockStudentCoursesList)o2).newstudent.getId());
              }
              return TypeTool.compareTo(((LineListblockStudentCoursesList)o2).newstudent.getId(),((LineListblockStudentCoursesList)o1).newstudent.getId());
           case 3:
              if(directions.get(new Integer(3)) == Boolean.FALSE) {
                 return TypeTool.compareTo(((LineListblockStudentCoursesList)o1).newstudent.getName(),((LineListblockStudentCoursesList)o2).newstudent.getName());
              }
              return TypeTool.compareTo(((LineListblockStudentCoursesList)o2).newstudent.getName(),((LineListblockStudentCoursesList)o1).newstudent.getName());
           case 4:
              if(directions.get(new Integer(4)) == Boolean.FALSE) {
                 return TypeTool.compareTo(((LineListblockStudentCoursesList)o1).newstudent.getStudentNr(),((LineListblockStudentCoursesList)o2).newstudent.getStudentNr());
              }
              return TypeTool.compareTo(((LineListblockStudentCoursesList)o2).newstudent.getStudentNr(),((LineListblockStudentCoursesList)o1).newstudent.getStudentNr());
        }
        return 0;
    } 
   /** Only there to check if a comparator is equal to this one. Not used.
    * @param o1 Internal use.
    * @return Internal use.
    */
    @Override
    public boolean equals(Object obj) { 
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ListblockMethodsStudentCoursesList)) {
            return false;
        }
        ListblockMethodsStudentCoursesList other = (ListblockMethodsStudentCoursesList) obj;
        if (!controller.equals(other.controller)) {
            return false;
        }
        if (controller == null) {
            if (other.controller != null) {
                return false;
            }
        } else if (!controller.equals(other.controller)) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((controller == null) ? 0 : controller.hashCode());
        return result;
    }
    /**
     * Helper method. Check if an attribute is present in a column.
     */
     boolean hasColumn(String ident) {
        if ("studentCourses.id".equals(ident)) {
            return true;
        }
        if ("student.age".equals(ident)) {
            return true;
        }
        if ("student.id".equals(ident)) {
            return true;
        }
        if ("student.name".equals(ident)) {
            return true;
        }
        if ("student.studentNr".equals(ident)) {
            return true;
        }
        return false;
    }

    public void setColumnHeaderValue(String attributeName, String value) {
        int colIndex = getColumnIndex(attributeName);
        TableColumn column = getTable().getColumnModel().getColumn(colIndex);
        column.setHeaderValue(value);
        getTable().getTableHeader().revalidate();
        getTable().getTableHeader().repaint();
    }   

    public void hideColumn(String attributeName) {
        getTable().hideColumn(getColumnIndex(attributeName));
    }

    public void hideColumn(List attributeNames) {
        Iterator it = attributeNames.iterator();
        while (it.hasNext()) {
            Object foo = it.next();
            if (foo instanceof String) {
                getTable().hideColumn(getColumnIndex((String) foo));
            }
        }
    }

    public void showColumn(String attributeName) {
        getTable().showColumn(getColumnIndex(attributeName));
    }

    public void showColumn(List attributeNames) {
        Iterator it = attributeNames.iterator();
        while (it.hasNext()) {
            Object foo = it.next();
            if (foo instanceof String) {
                showColumn((String) foo);
            }
        }
    }

    /**
     * Returns the column index for the specified attribute name
     * @param attributeName the name of the column
     * @return the column index
     */
    protected int getColumnIndex(String attributeName) {
        int colIndex = 0;
        if ("studentCourses.id".equals(attributeName)) {
            return colIndex;
        }
        colIndex++;
        if ("student.age".equals(attributeName)) {
            return colIndex;
        }
        colIndex++;
        if ("student.id".equals(attributeName)) {
            return colIndex;
        }
        colIndex++;
        if ("student.name".equals(attributeName)) {
            return colIndex;
        }
        colIndex++;
        if ("student.studentNr".equals(attributeName)) {
            return colIndex;
        }
        colIndex++;
        // Column not found. log and throw exception
        Object[] msgArgs = {"StudentCoursesList", attributeName};
        Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.NO_SUCH_COLUMN, msgArgs);
        MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
        throw new GenovaClientException(msg);
    }
   } // End of collection class for listblock StudentCoursesList.
    /** The controller class for the listblock, and the entry point for
     * using the listblock StudentCoursesList. 
     */
    public ListblockMethodsStudentCoursesList listblockMethodsStudentCoursesList = new ListblockMethodsStudentCoursesList(this);
    
    /* Her kommer generert kode for Listblock:ListblockLineClassController*/
    
    /** RT information about the listblock */
    protected NodeInfoList StudentCoursesListNodeInfo = new NodeInfoList();
    
    
    /* Her kommer generert kode for Button:MethodDeclaration*/
    
    /** Set enable/disable for button CourseClearButton 
     * @param b true for enabled, false for not 
     */
    public void setEnabledCourseClearButton(boolean b) {
        view.CourseClearButton.setEnabled(b);
    }
    
    /**
     * Shows or hides CourseClearButton depending on the parameter.
     * @param b <code>true</code> to show, <code>false</code> to hide.
     */
    public void setShownCourseClearButton(boolean b) {
        view.CourseClearButton.setVisible(b);
    }
    
    /**
     * Attemts to transfer input focus to CourseClearButton
     */
    public void setFocusCourseClearButton() {
        view.CourseClearButton.requestFocusInWindow();
    }
    
    /**
     * Check if CourseClearButton is enabled.
     * @return <code>true</code> if CourseClearButton is enabled.
     */
    public boolean isEnabledCourseClearButton() {
        return view.CourseClearButton.isEnabled();
    }
    
    /**
     * Check if CourseClearButton is the focus owner.
     * @return <code>true</code> if CourseClearButton is the focus owner.
     */
    public boolean hasFocusCourseClearButton() {
        return view.CourseClearButton.isFocusOwner();
    }
    
    /**
     * Check if CourseClearButton is visible. Note that this does 
     * not imply that CourseClearButton is actually showing, only that it can be 
     * drawn on the screen.
     * @return <code>true</code> if CourseClearButton is visible.
     */
    public boolean isShownCourseClearButton() {
        return view.CourseClearButton.isVisible();
    }
    
    /* Her kommer generert kode for Button:MethodDeclaration*/
    
    /** Set enable/disable for button CourseSaveButton 
     * @param b true for enabled, false for not 
     */
    public void setEnabledCourseSaveButton(boolean b) {
        view.CourseSaveButton.setEnabled(b);
    }
    
    /**
     * Shows or hides CourseSaveButton depending on the parameter.
     * @param b <code>true</code> to show, <code>false</code> to hide.
     */
    public void setShownCourseSaveButton(boolean b) {
        view.CourseSaveButton.setVisible(b);
    }
    
    /**
     * Attemts to transfer input focus to CourseSaveButton
     */
    public void setFocusCourseSaveButton() {
        view.CourseSaveButton.requestFocusInWindow();
    }
    
    /**
     * Check if CourseSaveButton is enabled.
     * @return <code>true</code> if CourseSaveButton is enabled.
     */
    public boolean isEnabledCourseSaveButton() {
        return view.CourseSaveButton.isEnabled();
    }
    
    /**
     * Check if CourseSaveButton is the focus owner.
     * @return <code>true</code> if CourseSaveButton is the focus owner.
     */
    public boolean hasFocusCourseSaveButton() {
        return view.CourseSaveButton.isFocusOwner();
    }
    
    /**
     * Check if CourseSaveButton is visible. Note that this does 
     * not imply that CourseSaveButton is actually showing, only that it can be 
     * drawn on the screen.
     * @return <code>true</code> if CourseSaveButton is visible.
     */
    public boolean isShownCourseSaveButton() {
        return view.CourseSaveButton.isVisible();
    }
    
    /* Her kommer generert kode for Button:MethodDeclaration*/
    
    /** Set enable/disable for button CourseDeleteButton 
     * @param b true for enabled, false for not 
     */
    public void setEnabledCourseDeleteButton(boolean b) {
        view.CourseDeleteButton.setEnabled(b);
    }
    
    /**
     * Shows or hides CourseDeleteButton depending on the parameter.
     * @param b <code>true</code> to show, <code>false</code> to hide.
     */
    public void setShownCourseDeleteButton(boolean b) {
        view.CourseDeleteButton.setVisible(b);
    }
    
    /**
     * Attemts to transfer input focus to CourseDeleteButton
     */
    public void setFocusCourseDeleteButton() {
        view.CourseDeleteButton.requestFocusInWindow();
    }
    
    /**
     * Check if CourseDeleteButton is enabled.
     * @return <code>true</code> if CourseDeleteButton is enabled.
     */
    public boolean isEnabledCourseDeleteButton() {
        return view.CourseDeleteButton.isEnabled();
    }
    
    /**
     * Check if CourseDeleteButton is the focus owner.
     * @return <code>true</code> if CourseDeleteButton is the focus owner.
     */
    public boolean hasFocusCourseDeleteButton() {
        return view.CourseDeleteButton.isFocusOwner();
    }
    
    /**
     * Check if CourseDeleteButton is visible. Note that this does 
     * not imply that CourseDeleteButton is actually showing, only that it can be 
     * drawn on the screen.
     * @return <code>true</code> if CourseDeleteButton is visible.
     */
    public boolean isShownCourseDeleteButton() {
        return view.CourseDeleteButton.isVisible();
    }
    
    /* Her kommer generert kode for Button:MethodDeclaration*/
    
    /** Set enable/disable for button SaveStudentCourse 
     * @param b true for enabled, false for not 
     */
    public void setEnabledSaveStudentCourse(boolean b) {
        view.SaveStudentCourse.setEnabled(b);
    }
    
    /**
     * Shows or hides SaveStudentCourse depending on the parameter.
     * @param b <code>true</code> to show, <code>false</code> to hide.
     */
    public void setShownSaveStudentCourse(boolean b) {
        view.SaveStudentCourse.setVisible(b);
    }
    
    /**
     * Attemts to transfer input focus to SaveStudentCourse
     */
    public void setFocusSaveStudentCourse() {
        view.SaveStudentCourse.requestFocusInWindow();
    }
    
    /**
     * Check if SaveStudentCourse is enabled.
     * @return <code>true</code> if SaveStudentCourse is enabled.
     */
    public boolean isEnabledSaveStudentCourse() {
        return view.SaveStudentCourse.isEnabled();
    }
    
    /**
     * Check if SaveStudentCourse is the focus owner.
     * @return <code>true</code> if SaveStudentCourse is the focus owner.
     */
    public boolean hasFocusSaveStudentCourse() {
        return view.SaveStudentCourse.isFocusOwner();
    }
    
    /**
     * Check if SaveStudentCourse is visible. Note that this does 
     * not imply that SaveStudentCourse is actually showing, only that it can be 
     * drawn on the screen.
     * @return <code>true</code> if SaveStudentCourse is visible.
     */
    public boolean isShownSaveStudentCourse() {
        return view.SaveStudentCourse.isVisible();
    }
    /** 
     * Generated event-action method, invoked from the framework.
     * This method is normally invoked on the EDT, and creates invokes 
     * <code>closeAddStudentsToCourse()</code> asynchronous on a dedicated thread.
     * 
     *  <p><strong>Normally, developers should not invoke this method - use 
     * <code>closeAddStudentsToCourse()</code> instead.</strong>
     * 
     * <p>The dedicated thread is scheduled for execution by a Genova Worker
     * instance. The instance "belongs" to this dialog and will be created
     * if necessary. 
     *
     * 
     * @param e Contains nested swing event. 
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void closeAddStudentsToCourse(final GenovaEventHolder e) throws RuntimeException { 
        Runnable task = new Runnable() {
                public void run() {
                    blockDialog();
                    boolean setLastEx = true;
                    try {
                        if (hookcloseAddStudentsToCourseBefore(e)) {
                            setLastEx = false;
                            closeAddStudentsToCourse();
                        } else {
                            setLastEx = false;
                        }
                        hookcloseAddStudentsToCourseAfter(e);
                    } catch (RuntimeException ex) {
                        setLastEx = dialogExceptionHandler(ex) && setLastEx;
                        if (setLastEx) {
                            application.setLastException(ex);
                        }
                    } finally {
                        unblockDialog();
                    }
                } 
            };
        GenovaWorker.enqueueTask(this, task);
    }
    /** 
     * Standard method, performing various actions. Invoked from the
     * <code>closeAddStudentsToCourse(GenovaEventHolder)</code>. Override this
     * method if you want to performe some additional tasks. 
     *
     *
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void closeAddStudentsToCourse() throws RuntimeException { 
            actionCloseAddStudentsToCourse(); 
    }
    /** 
     * Generated event-action method, invoked from the framework.
     * This method is normally invoked on the EDT, and creates invokes 
     * <code>findCourse()</code> asynchronous on a dedicated thread.
     * 
     *  <p><strong>Normally, developers should not invoke this method - use 
     * <code>findCourse()</code> instead.</strong>
     * 
     * <p>The dedicated thread is scheduled for execution by a Genova Worker
     * instance. The instance "belongs" to this dialog and will be created
     * if necessary. 
     *
     * 
     * @param e Contains nested swing event. 
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void findCourse(final GenovaEventHolder e) throws RuntimeException { 
        // Noe p� server
        Runnable task = new Runnable() {
                public void run() {
                    blockDialog();
                    boolean setLastEx = true;
                    try {
                        if (hookfindCourseBefore(e)) {
                            setLastEx = false;
                            findCourse();
                        } else {
                            setLastEx = false;
                        }
                        hookfindCourseAfter(e);
                    } catch (RuntimeException ex) {
                        setLastEx = dialogExceptionHandler(ex) && setLastEx;
                        if (setLastEx) {
                            application.setLastException(ex);
                        }
                    } finally {
                        unblockDialog();
                    }
                } 
            };
        GenovaWorker.enqueueTask(this, task);
    }
    /** 
     * Standard method, performing various actions. Invoked from the
     * <code>findCourse(GenovaEventHolder)</code>. Override this
     * method if you want to performe some additional tasks. 
     *
     *
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void findCourse() throws RuntimeException { 
            actionFindCourse(); 
    }
    /** 
     * Generated event-action method, invoked from the framework.
     * This method is normally invoked on the EDT, and creates invokes 
     * <code>clearCourse()</code> asynchronous on a dedicated thread.
     * 
     *  <p><strong>Normally, developers should not invoke this method - use 
     * <code>clearCourse()</code> instead.</strong>
     * 
     * <p>The dedicated thread is scheduled for execution by a Genova Worker
     * instance. The instance "belongs" to this dialog and will be created
     * if necessary. 
     *
     * 
     * @param e Contains nested swing event. 
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void clearCourse(final GenovaEventHolder e) throws RuntimeException { 
        // Noe p� server
        Runnable task = new Runnable() {
                public void run() {
                    blockDialog();
                    boolean setLastEx = true;
                    try {
                        if (hookclearCourseBefore(e)) {
                            setLastEx = false;
                            clearCourse();
                        } else {
                            setLastEx = false;
                        }
                        hookclearCourseAfter(e);
                    } catch (RuntimeException ex) {
                        setLastEx = dialogExceptionHandler(ex) && setLastEx;
                        if (setLastEx) {
                            application.setLastException(ex);
                        }
                    } finally {
                        unblockDialog();
                    }
                } 
            };
        GenovaWorker.enqueueTask(this, task);
    }
    /** 
     * Standard method, performing various actions. Invoked from the
     * <code>clearCourse(GenovaEventHolder)</code>. Override this
     * method if you want to performe some additional tasks. 
     *
     *
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void clearCourse() throws RuntimeException { 
            actionClearCourse(); 
    }
    /** 
     * Generated event-action method, invoked from the framework.
     * This method is normally invoked on the EDT, and creates invokes 
     * <code>saveCourse()</code> asynchronous on a dedicated thread.
     * 
     *  <p><strong>Normally, developers should not invoke this method - use 
     * <code>saveCourse()</code> instead.</strong>
     * 
     * <p>The dedicated thread is scheduled for execution by a Genova Worker
     * instance. The instance "belongs" to this dialog and will be created
     * if necessary. 
     *
     * 
     * @param e Contains nested swing event. 
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void saveCourse(final GenovaEventHolder e) throws RuntimeException { 
        // Noe p� server
        Runnable task = new Runnable() {
                public void run() {
                    blockDialog();
                    boolean setLastEx = true;
                    try {
                        if (hooksaveCourseBefore(e)) {
                            setLastEx = false;
                            saveCourse();
                        } else {
                            setLastEx = false;
                        }
                        hooksaveCourseAfter(e);
                    } catch (RuntimeException ex) {
                        setLastEx = dialogExceptionHandler(ex) && setLastEx;
                        if (setLastEx) {
                            application.setLastException(ex);
                        }
                    } finally {
                        unblockDialog();
                    }
                } 
            };
        GenovaWorker.enqueueTask(this, task);
    }
    /** 
     * Standard method, performing various actions. Invoked from the
     * <code>saveCourse(GenovaEventHolder)</code>. Override this
     * method if you want to performe some additional tasks. 
     *
     *
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void saveCourse() throws RuntimeException { 
            actionSaveCourse(); 
    }
    /** 
     * Generated event-action method, invoked from the framework.
     * This method is normally invoked on the EDT, and creates invokes 
     * <code>deleteCourse()</code> asynchronous on a dedicated thread.
     * 
     *  <p><strong>Normally, developers should not invoke this method - use 
     * <code>deleteCourse()</code> instead.</strong>
     * 
     * <p>The dedicated thread is scheduled for execution by a Genova Worker
     * instance. The instance "belongs" to this dialog and will be created
     * if necessary. 
     *
     * 
     * @param e Contains nested swing event. 
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void deleteCourse(final GenovaEventHolder e) throws RuntimeException { 
        // Noe p� server
        Runnable task = new Runnable() {
                public void run() {
                    blockDialog();
                    boolean setLastEx = true;
                    try {
                        if (hookdeleteCourseBefore(e)) {
                            setLastEx = false;
                            deleteCourse();
                        } else {
                            setLastEx = false;
                        }
                        hookdeleteCourseAfter(e);
                    } catch (RuntimeException ex) {
                        setLastEx = dialogExceptionHandler(ex) && setLastEx;
                        if (setLastEx) {
                            application.setLastException(ex);
                        }
                    } finally {
                        unblockDialog();
                    }
                } 
            };
        GenovaWorker.enqueueTask(this, task);
    }
    /** 
     * Standard method, performing various actions. Invoked from the
     * <code>deleteCourse(GenovaEventHolder)</code>. Override this
     * method if you want to performe some additional tasks. 
     *
     *
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void deleteCourse() throws RuntimeException { 
            actionDeleteCourse(); 
    }
    /** 
     * Generated event-action method, invoked from the framework.
     * This method is normally invoked on the EDT, and creates invokes 
     * <code>findStudentCourse()</code> asynchronous on a dedicated thread.
     * 
     *  <p><strong>Normally, developers should not invoke this method - use 
     * <code>findStudentCourse()</code> instead.</strong>
     * 
     * <p>The dedicated thread is scheduled for execution by a Genova Worker
     * instance. The instance "belongs" to this dialog and will be created
     * if necessary. 
     *
     * 
     * @param e Contains nested swing event. 
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void findStudentCourse(final GenovaEventHolder e) throws RuntimeException { 
        // Noe p� server
        Runnable task = new Runnable() {
                public void run() {
                    blockDialog();
                    boolean setLastEx = true;
                    try {
                        if (hookfindStudentCourseBefore(e)) {
                            setLastEx = false;
                            findStudentCourse();
                        } else {
                            setLastEx = false;
                        }
                        hookfindStudentCourseAfter(e);
                    } catch (RuntimeException ex) {
                        setLastEx = dialogExceptionHandler(ex) && setLastEx;
                        if (setLastEx) {
                            application.setLastException(ex);
                        }
                    } finally {
                        unblockDialog();
                    }
                } 
            };
        GenovaWorker.enqueueTask(this, task);
    }
    /** 
     * Standard method, performing various actions. Invoked from the
     * <code>findStudentCourse(GenovaEventHolder)</code>. Override this
     * method if you want to performe some additional tasks. 
     *
     *
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void findStudentCourse() throws RuntimeException { 
            actionFindstudentCourses(); 
    }
    /** 
     * Generated event-action method, invoked from the framework.
     * This method is normally invoked on the EDT, and creates invokes 
     * <code>findStudent()</code> asynchronous on a dedicated thread.
     * 
     *  <p><strong>Normally, developers should not invoke this method - use 
     * <code>findStudent()</code> instead.</strong>
     * 
     * <p>The dedicated thread is scheduled for execution by a Genova Worker
     * instance. The instance "belongs" to this dialog and will be created
     * if necessary. 
     *
     * 
     * @param e Contains nested swing event. 
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void findStudent(final GenovaEventHolder e) throws RuntimeException { 
        // Noe p� server
        Runnable task = new Runnable() {
                public void run() {
                    blockDialog();
                    boolean setLastEx = true;
                    try {
                        if (hookfindStudentBefore(e)) {
                            setLastEx = false;
                            findStudent();
                        } else {
                            setLastEx = false;
                        }
                        hookfindStudentAfter(e);
                    } catch (RuntimeException ex) {
                        setLastEx = dialogExceptionHandler(ex) && setLastEx;
                        if (setLastEx) {
                            application.setLastException(ex);
                        }
                    } finally {
                        unblockDialog();
                    }
                } 
            };
        GenovaWorker.enqueueTask(this, task);
    }
    /** 
     * Standard method, performing various actions. Invoked from the
     * <code>findStudent(GenovaEventHolder)</code>. Override this
     * method if you want to performe some additional tasks. 
     *
     *
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void findStudent() throws RuntimeException { 
            actionFindstudent(); 
    }
    /** 
     * Generated event-action method, invoked from the framework.
     * This method is normally invoked on the EDT, and creates invokes 
     * <code>saveStudentCourse()</code> asynchronous on a dedicated thread.
     * 
     *  <p><strong>Normally, developers should not invoke this method - use 
     * <code>saveStudentCourse()</code> instead.</strong>
     * 
     * <p>The dedicated thread is scheduled for execution by a Genova Worker
     * instance. The instance "belongs" to this dialog and will be created
     * if necessary. 
     *
     * 
     * @param e Contains nested swing event. 
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void saveStudentCourse(final GenovaEventHolder e) throws RuntimeException { 
        // Noe p� server
        Runnable task = new Runnable() {
                public void run() {
                    blockDialog();
                    boolean setLastEx = true;
                    try {
                        if (hooksaveStudentCourseBefore(e)) {
                            setLastEx = false;
                            saveStudentCourse();
                        } else {
                            setLastEx = false;
                        }
                        hooksaveStudentCourseAfter(e);
                    } catch (RuntimeException ex) {
                        setLastEx = dialogExceptionHandler(ex) && setLastEx;
                        if (setLastEx) {
                            application.setLastException(ex);
                        }
                    } finally {
                        unblockDialog();
                    }
                } 
            };
        GenovaWorker.enqueueTask(this, task);
    }
    /** 
     * Standard method, performing various actions. Invoked from the
     * <code>saveStudentCourse(GenovaEventHolder)</code>. Override this
     * method if you want to performe some additional tasks. 
     *
     *
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void saveStudentCourse() throws RuntimeException { 
            actionSavestudentCourses(); 
    }


    /**
     * Hook method, called if the action resulted in a RuntimeException. 
     * Override in subclass.
     * @param e the catched exception 
     * @return <code>false</code> the hook has handeled the exception, and no further action is needed.
     */
    public boolean hookActionCloseAddStudentsToCourseException(RuntimeException e) {
        return true;
    }


    /**
     * Hook method, called if the action resulted in a RuntimeException.
     * Override in subclass.
     *
     * <p>If the exception is handeled in this hook, the hook should return
     * <code>false</code>. If the hook returns <code>true</code> the 
     * exception will be re-thrown from the invoking 
     * <code>actionFindCourse()</code> method.
     * <br>The default return value is <code>true</code>.
     * @param e the catched exception 
     * @return <code>false</code> if exception is handeled, 
     *         <code>true</code> if exception should be re-thrown.
     */
    public boolean hookActionFindCourseException(RuntimeException e) {
        return true;
    }


    /**
     * Hook method, called after the object selection is obtained. The boolean return value
     * is used by the server action to determine if the action should proceed, true indicating
     * that it should. The default return value is <code>true</code>.
     * Override in subclass.
     * @param objectSelection the obtained object selection.
     * @return <code>true</code> if action should proceed.
     */
    public boolean hookActionFindCourseObtain(ObjectSelection objectSelection) {
        return true;
    }


    /**
     * Hook method, called before server action is called. The returned ClientContext is used 
     * when calling the server. If <code>null</code> is returned, 
     * the Application.getClientContext() is used.
     * <p>Override in subclass.
     * @return the ClientContext that will be used as argument to the server action.
     */
    public ClientContext hookActionFindCourseClientContext() {
        return null;
    }


    /**
     * Hook method, called before the found object in findCourse is 
     * displayed. The boolean return value is used to determine if the foundObject
     * should be displayed (defaults to <code>true</code>.
     * <p>Override in subclass! 
     * @param foundObject the object returned from the server action find on target Course
     * @return <code>true</code> if the object should be displayed.
     */
    public boolean hookActionFindCourseDisplay(Object foundObject) {
        return true;
    }
    /**
     * Hook method, called if the action resulted in a RuntimeException. 
     * Override in subclass.
     * @param e the catched exception 
     * @return <code>false</code> the hook has handeled the exception, and no further action is needed.
     */
    public boolean hookActionClearCourseException(RuntimeException e) {
        return true;
    }         


    /**
     * Hook method, called if the action resulted in a RuntimeException.
     * Override in subclass.
     *
     * <p>If the exception is handeled in this hook, the hook should return
     * <code>false</code>. If the hook returns <code>true</code> the 
     * exception will be re-thrown from the invoking 
     * <code>actionSaveCourse()</code> method.
     * <br>The default return value is <code>true</code>.
     * @param e the catched exception 
     * @return <code>false</code> if exception is handeled, 
     *         <code>true</code> if exception should be re-thrown.
     */
    public boolean hookActionSaveCourseException(RuntimeException e) {
        return true;
    }


    /**
     * Hook method, called after the object selection is obtained. The boolean return value
     * is used by the server action to determine if the action should proceed, true indicating
     * that it should. The default return value is <code>true</code>.
     * Override in subclass.
     * @param objectSelection the obtained object selection.
     * @return <code>true</code> if action should proceed.
     */
    public boolean hookActionSaveCourseObtain(ObjectSelection objectSelection) {
        return true;
    }


    /**
     * Hook method, called before server action is called. The returned ClientContext is used 
     * when calling the server. If <code>null</code> is returned, 
     * the Application.getClientContext() is used.
     * <p>Override in subclass.
     * @return the ClientContext that will be used as argument to the server action.
     */
    public ClientContext hookActionSaveCourseClientContext() {
        return null;
    }


    /**
     * Hook method, called before the found object in saveCourse is 
     * displayed. The boolean return value is used to determine if the foundObject
     * should be displayed (defaults to <code>true</code>.
     * <p>Override in subclass! 
     * @param foundObject the object returned from the server action find on target Course
     * @return <code>true</code> if the object should be displayed.
     */
    public boolean hookActionSaveCourseDisplay(Object foundObject) {
        return true;
    }


    /**
     * Hook method, called if the action resulted in a RuntimeException.
     * Override in subclass.
     *
     * <p>If the exception is handeled in this hook, the hook should return
     * <code>false</code>. If the hook returns <code>true</code> the 
     * exception will be re-thrown from the invoking 
     * <code>actionDeleteCourse()</code> method.
     * <br>The default return value is <code>true</code>.
     * @param e the catched exception 
     * @return <code>false</code> if exception is handeled, 
     *         <code>true</code> if exception should be re-thrown.
     */
    public boolean hookActionDeleteCourseException(RuntimeException e) {
        return true;
    }


    /**
     * Hook method, called after the object selection is obtained. The boolean return value
     * is used by the server action to determine if the action should proceed, true indicating
     * that it should. The default return value is <code>true</code>.
     * Override in subclass.
     * @param objectSelection the obtained object selection.
     * @return <code>true</code> if action should proceed.
     */
    public boolean hookActionDeleteCourseObtain(ObjectSelection objectSelection) {
        return true;
    }


    /**
     * Hook method, called before server action is called. The returned ClientContext is used 
     * when calling the server. If <code>null</code> is returned, 
     * the Application.getClientContext() is used.
     * <p>Override in subclass.
     * @return the ClientContext that will be used as argument to the server action.
     */
    public ClientContext hookActionDeleteCourseClientContext() {
        return null;
    }


    /**
     * Hook method, called before the found object in deleteCourse is 
     * displayed. The boolean return value is used to determine if the foundObject
     * should be displayed (defaults to <code>true</code>.
     * <p>Override in subclass! 
     * @param foundObject the object returned from the server action find on target Course
     * @return <code>true</code> if the object should be displayed.
     */
    public boolean hookActionDeleteCourseDisplay(Object foundObject) {
        return true;
    }


    /**
     * Hook method, called if the action resulted in a RuntimeException.
     * Override in subclass.
     *
     * <p>If the exception is handeled in this hook, the hook should return
     * <code>false</code>. If the hook returns <code>true</code> the 
     * exception will be re-thrown from the invoking 
     * <code>actionFindstudentCourses()</code> method.
     * <br>The default return value is <code>true</code>.
     * @param e the catched exception 
     * @return <code>false</code> if exception is handeled, 
     *         <code>true</code> if exception should be re-thrown.
     */
    public boolean hookActionFindstudentCoursesException(RuntimeException e) {
        return true;
    }


    /**
     * Hook method, called after the object selection is obtained. The boolean return value
     * is used by the server action to determine if the action should proceed, true indicating
     * that it should. The default return value is <code>true</code>.
     * Override in subclass.
     * @param objectSelection the obtained object selection.
     * @return <code>true</code> if action should proceed.
     */
    public boolean hookActionFindstudentCoursesObtain(ObjectSelection objectSelection) {
        return true;
    }


    /**
     * Hook method, called before server action is called. The returned ClientContext is used 
     * when calling the server. If <code>null</code> is returned, 
     * the Application.getClientContext() is used.
     * <p>Override in subclass.
     * @return the ClientContext that will be used as argument to the server action.
     */
    public ClientContext hookActionFindstudentCoursesClientContext() {
        return null;
    }


    /**
     * Hook method, called before the found object in findStudentCourse is 
     * displayed. The boolean return value is used to determine if the foundObject
     * should be displayed (defaults to <code>true</code>.
     * <p>Override in subclass! 
     * @param foundObject the object returned from the server action find on target studentCourses
     * @return <code>true</code> if the object should be displayed.
     */
    public boolean hookActionFindstudentCoursesDisplay(Object foundObject) {
        return true;
    }


    /**
     * Hook method, called if the action resulted in a RuntimeException.
     * Override in subclass.
     *
     * <p>If the exception is handeled in this hook, the hook should return
     * <code>false</code>. If the hook returns <code>true</code> the 
     * exception will be re-thrown from the invoking 
     * <code>actionFindstudent()</code> method.
     * <br>The default return value is <code>true</code>.
     * @param e the catched exception 
     * @return <code>false</code> if exception is handeled, 
     *         <code>true</code> if exception should be re-thrown.
     */
    public boolean hookActionFindstudentException(RuntimeException e) {
        return true;
    }


    /**
     * Hook method, called after the object selection is obtained. The boolean return value
     * is used by the server action to determine if the action should proceed, true indicating
     * that it should. The default return value is <code>true</code>.
     * Override in subclass.
     * @param objectSelection the obtained object selection.
     * @return <code>true</code> if action should proceed.
     */
    public boolean hookActionFindstudentObtain(ObjectSelection objectSelection) {
        return true;
    }


    /**
     * Hook method, called before server action is called. The returned ClientContext is used 
     * when calling the server. If <code>null</code> is returned, 
     * the Application.getClientContext() is used.
     * <p>Override in subclass.
     * @return the ClientContext that will be used as argument to the server action.
     */
    public ClientContext hookActionFindstudentClientContext() {
        return null;
    }


    /**
     * Hook method, called before the found object in findStudent is 
     * displayed. The boolean return value is used to determine if the foundObject
     * should be displayed (defaults to <code>true</code>.
     * <p>Override in subclass! 
     * @param foundObject the object returned from the server action find on target student
     * @return <code>true</code> if the object should be displayed.
     */
    public boolean hookActionFindstudentDisplay(Object foundObject) {
        return true;
    }


    /**
     * Hook method, called if the action resulted in a RuntimeException.
     * Override in subclass.
     *
     * <p>If the exception is handeled in this hook, the hook should return
     * <code>false</code>. If the hook returns <code>true</code> the 
     * exception will be re-thrown from the invoking 
     * <code>actionSavestudentCourses()</code> method.
     * <br>The default return value is <code>true</code>.
     * @param e the catched exception 
     * @return <code>false</code> if exception is handeled, 
     *         <code>true</code> if exception should be re-thrown.
     */
    public boolean hookActionSavestudentCoursesException(RuntimeException e) {
        return true;
    }


    /**
     * Hook method, called after the object selection is obtained. The boolean return value
     * is used by the server action to determine if the action should proceed, true indicating
     * that it should. The default return value is <code>true</code>.
     * Override in subclass.
     * @param objectSelection the obtained object selection.
     * @return <code>true</code> if action should proceed.
     */
    public boolean hookActionSavestudentCoursesObtain(ObjectSelection objectSelection) {
        return true;
    }


    /**
     * Hook method, called before server action is called. The returned ClientContext is used 
     * when calling the server. If <code>null</code> is returned, 
     * the Application.getClientContext() is used.
     * <p>Override in subclass.
     * @return the ClientContext that will be used as argument to the server action.
     */
    public ClientContext hookActionSavestudentCoursesClientContext() {
        return null;
    }


    /**
     * Hook method, called before the found object in saveStudentCourse is 
     * displayed. The boolean return value is used to determine if the foundObject
     * should be displayed (defaults to <code>true</code>.
     * <p>Override in subclass! 
     * @param foundObject the object returned from the server action find on target studentCourses
     * @return <code>true</code> if the object should be displayed.
     */
    public boolean hookActionSavestudentCoursesDisplay(Object foundObject) {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkSave" on Course.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookCourseCheckSave() {
        return hookCheckSaveCourse() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookCourseCheckSave instead.</strong>
     * Hook method, called as part of "check save" on 
     * Course. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check save
     * <li><code>false</code> abort check save and continue with save action.
     * <li><code>throw exception</code> abort check save, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check save should continue to check nodes; 
     *         <code>false</code> if check save should finish cheking and
     *         continue with save action.
     * @see #hookCourseCheckSave()
     */
    public boolean hookCheckSaveCourse() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkFind" on Course.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookCourseCheckFind() {
        return hookCheckFindCourse() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookCourseCheckFind instead.</strong>
     * Hook method, called as part of "check find" on Course. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check find
     * <li><code>false</code> abort check find and continue with find action.
     * <li><code>throw exception</code> abort check find, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check find should continue to check nodes; 
     *         <code>false</code> if check find should finish cheking and
     *         continue with find action.
     * @see #hookCourseCheckFind()
     */
    public boolean hookCheckFindCourse() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkClose" on Course.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookCourseCheckClose() {
        return hookCheckCloseCourse() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookCourseCheckClose instead.</strong>
     * Hook method, called as part of "check close" on Course. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check close
     * <li><code>false</code> abort check close and continue with close action.
     * <li><code>throw exception</code> abort check close, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check close should continue to check nodes; 
     *         <code>false</code> if check close should finish cheking and
     *         continue with close action.
     * @see #hookCourseCheckClose()
     */
    public boolean hookCheckCloseCourse() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkDelete" on Course.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookCourseCheckDelete() {
        return hookCheckDeleteCourse() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookCourseCheckDelete instead.</strong>
     * Hook method, called as part of "check delete" on Course. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check delete
     * <li><code>false</code> abort check delete and continue with delete action.
     * <li><code>throw exception</code> abort check delete, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check delete should continue to check nodes; 
     *         <code>false</code> if check delete should finish cheking and
     *         continue with delete action.
     * @see #hookCourseCheckDelete()
     */
    public boolean hookCheckDeleteCourse() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkPrint" on Course.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookCourseCheckPrint() {
        return hookCheckPrintCourse() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookCourseCheckPrint instead.</strong>
     * Hook method, called as part of "check print" on Course. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check print
     * <li><code>false</code> abort check print and continue with print action.
     * <li><code>throw exception</code> abort check print, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check print should continue to check nodes; 
     *         <code>false</code> if check print should finish cheking and
     *         continue with print action.
     * @see #hookCourseCheckPrint()
     */
    public boolean hookCheckPrintCourse() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkClear" on Course.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookCourseCheckClear() {
        return hookCheckClearCourse() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookCourseCheckClear instead.</strong>
     * Hook method, called as part of "check clear" on Course. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check clear
     * <li><code>false</code> abort check clear and continue with clear action.
     * <li><code>throw exception</code> abort check clear, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check clear should continue to check nodes; 
     *         <code>false</code> if check clear should finish cheking and
     *         continue with clear action.
     * @see #hookCourseCheckClear()
     */
    public boolean hookCheckClearCourse() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkChange" on Course.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookCourseCheckChange() {
        return hookCheckChangeCourse() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookCourseCheckChange instead.</strong>
     * Hook method, called as part of "check change" on Course. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check change
     * <li><code>false</code> abort check change and continue with change action.
     * <li><code>throw exception</code> abort check change, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check change should continue to check nodes; 
     *         <code>false</code> if check change should finish cheking and
     *         continue with change action.
     * @see #hookCourseCheckChange()
     */
    public boolean hookCheckChangeCourse() {
        return true;
    }
    /**
     * Hook method, invoked as part of "check row select" on Course.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @param oldSelection the current selected line
     * @param newSelection the line about to be selected
     * @return a ECheckResult 
     */
     public ECheckResult hookCourseCheckRowSelect
                (int oldSelection, int newSelection) {
        return hookCheckRowSelectCourse(oldSelection, newSelection) ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /** 
     * <strong>The use of this method is discouraged. Override
     * hookCourseCheckRowSelect instead.</strong>
     * Hook method, called as part of "check row selection" on Course. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check row selection
     * <li><code>false</code> abort check row selection and continue with row selection.
     * <li><code>throw exception</code> abort row selection, interpret
     *     message and recover.
     * </ul>
     * @param currentSelection the currently selected row. 
     * @param newSelection the row the user wish to select.
     * @return <code>true</code> if check change should continue to check nodes; 
     *         <code>false</code> if check change should finish cheking and
     *         continue with change action.
     * @see #hookCourseCheckRowSelect(int, int)
     */
    public boolean hookCheckRowSelectCourse(int currentSelection, 
            int newSelection) {
        return true;
    }





    /**
     * Hook method, invoked as part of "checkSave" on studentCourses.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - studentCourses and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - studentCourses is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - studentCourses is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookstudentCoursesCheckSave() {
        return hookCheckSavestudentCourses() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookstudentCoursesCheckSave instead.</strong>
     * Hook method, called as part of "check save" on 
     * studentCourses. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check save
     * <li><code>false</code> abort check save and continue with save action.
     * <li><code>throw exception</code> abort check save, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check save should continue to check nodes; 
     *         <code>false</code> if check save should finish cheking and
     *         continue with save action.
     * @see #hookstudentCoursesCheckSave()
     */
    public boolean hookCheckSavestudentCourses() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkFind" on studentCourses.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - studentCourses and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - studentCourses is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - studentCourses is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookstudentCoursesCheckFind() {
        return hookCheckFindstudentCourses() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookstudentCoursesCheckFind instead.</strong>
     * Hook method, called as part of "check find" on studentCourses. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check find
     * <li><code>false</code> abort check find and continue with find action.
     * <li><code>throw exception</code> abort check find, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check find should continue to check nodes; 
     *         <code>false</code> if check find should finish cheking and
     *         continue with find action.
     * @see #hookstudentCoursesCheckFind()
     */
    public boolean hookCheckFindstudentCourses() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkClose" on studentCourses.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - studentCourses and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - studentCourses is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - studentCourses is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookstudentCoursesCheckClose() {
        return hookCheckClosestudentCourses() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookstudentCoursesCheckClose instead.</strong>
     * Hook method, called as part of "check close" on studentCourses. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check close
     * <li><code>false</code> abort check close and continue with close action.
     * <li><code>throw exception</code> abort check close, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check close should continue to check nodes; 
     *         <code>false</code> if check close should finish cheking and
     *         continue with close action.
     * @see #hookstudentCoursesCheckClose()
     */
    public boolean hookCheckClosestudentCourses() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkDelete" on studentCourses.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - studentCourses and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - studentCourses is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - studentCourses is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookstudentCoursesCheckDelete() {
        return hookCheckDeletestudentCourses() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookstudentCoursesCheckDelete instead.</strong>
     * Hook method, called as part of "check delete" on studentCourses. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check delete
     * <li><code>false</code> abort check delete and continue with delete action.
     * <li><code>throw exception</code> abort check delete, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check delete should continue to check nodes; 
     *         <code>false</code> if check delete should finish cheking and
     *         continue with delete action.
     * @see #hookstudentCoursesCheckDelete()
     */
    public boolean hookCheckDeletestudentCourses() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkPrint" on studentCourses.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - studentCourses and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - studentCourses is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - studentCourses is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookstudentCoursesCheckPrint() {
        return hookCheckPrintstudentCourses() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookstudentCoursesCheckPrint instead.</strong>
     * Hook method, called as part of "check print" on studentCourses. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check print
     * <li><code>false</code> abort check print and continue with print action.
     * <li><code>throw exception</code> abort check print, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check print should continue to check nodes; 
     *         <code>false</code> if check print should finish cheking and
     *         continue with print action.
     * @see #hookstudentCoursesCheckPrint()
     */
    public boolean hookCheckPrintstudentCourses() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkClear" on studentCourses.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - studentCourses and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - studentCourses is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - studentCourses is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookstudentCoursesCheckClear() {
        return hookCheckClearstudentCourses() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookstudentCoursesCheckClear instead.</strong>
     * Hook method, called as part of "check clear" on studentCourses. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check clear
     * <li><code>false</code> abort check clear and continue with clear action.
     * <li><code>throw exception</code> abort check clear, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check clear should continue to check nodes; 
     *         <code>false</code> if check clear should finish cheking and
     *         continue with clear action.
     * @see #hookstudentCoursesCheckClear()
     */
    public boolean hookCheckClearstudentCourses() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkChange" on studentCourses.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - studentCourses and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - studentCourses is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - studentCourses is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookstudentCoursesCheckChange() {
        return hookCheckChangestudentCourses() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookstudentCoursesCheckChange instead.</strong>
     * Hook method, called as part of "check change" on studentCourses. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check change
     * <li><code>false</code> abort check change and continue with change action.
     * <li><code>throw exception</code> abort check change, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check change should continue to check nodes; 
     *         <code>false</code> if check change should finish cheking and
     *         continue with change action.
     * @see #hookstudentCoursesCheckChange()
     */
    public boolean hookCheckChangestudentCourses() {
        return true;
    }
    /**
     * Hook method, invoked as part of "check row select" on studentCourses.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - studentCourses and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - studentCourses is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - studentCourses is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @param oldSelection the current selected line
     * @param newSelection the line about to be selected
     * @return a ECheckResult 
     */
     public ECheckResult hookstudentCoursesCheckRowSelect
                (int oldSelection, int newSelection) {
        return hookCheckRowSelectstudentCourses(oldSelection, newSelection) ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /** 
     * <strong>The use of this method is discouraged. Override
     * hookstudentCoursesCheckRowSelect instead.</strong>
     * Hook method, called as part of "check row selection" on studentCourses. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check row selection
     * <li><code>false</code> abort check row selection and continue with row selection.
     * <li><code>throw exception</code> abort row selection, interpret
     *     message and recover.
     * </ul>
     * @param currentSelection the currently selected row. 
     * @param newSelection the row the user wish to select.
     * @return <code>true</code> if check change should continue to check nodes; 
     *         <code>false</code> if check change should finish cheking and
     *         continue with change action.
     * @see #hookstudentCoursesCheckRowSelect(int, int)
     */
    public boolean hookCheckRowSelectstudentCourses(int currentSelection, 
            int newSelection) {
        return true;
    }





    /**
     * Hook method, invoked as part of "checkSave" on student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookstudentCheckSave() {
        return hookCheckSavestudent() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookstudentCheckSave instead.</strong>
     * Hook method, called as part of "check save" on 
     * student. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check save
     * <li><code>false</code> abort check save and continue with save action.
     * <li><code>throw exception</code> abort check save, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check save should continue to check nodes; 
     *         <code>false</code> if check save should finish cheking and
     *         continue with save action.
     * @see #hookstudentCheckSave()
     */
    public boolean hookCheckSavestudent() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkFind" on student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookstudentCheckFind() {
        return hookCheckFindstudent() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookstudentCheckFind instead.</strong>
     * Hook method, called as part of "check find" on student. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check find
     * <li><code>false</code> abort check find and continue with find action.
     * <li><code>throw exception</code> abort check find, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check find should continue to check nodes; 
     *         <code>false</code> if check find should finish cheking and
     *         continue with find action.
     * @see #hookstudentCheckFind()
     */
    public boolean hookCheckFindstudent() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkClose" on student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookstudentCheckClose() {
        return hookCheckClosestudent() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookstudentCheckClose instead.</strong>
     * Hook method, called as part of "check close" on student. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check close
     * <li><code>false</code> abort check close and continue with close action.
     * <li><code>throw exception</code> abort check close, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check close should continue to check nodes; 
     *         <code>false</code> if check close should finish cheking and
     *         continue with close action.
     * @see #hookstudentCheckClose()
     */
    public boolean hookCheckClosestudent() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkDelete" on student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookstudentCheckDelete() {
        return hookCheckDeletestudent() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookstudentCheckDelete instead.</strong>
     * Hook method, called as part of "check delete" on student. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check delete
     * <li><code>false</code> abort check delete and continue with delete action.
     * <li><code>throw exception</code> abort check delete, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check delete should continue to check nodes; 
     *         <code>false</code> if check delete should finish cheking and
     *         continue with delete action.
     * @see #hookstudentCheckDelete()
     */
    public boolean hookCheckDeletestudent() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkPrint" on student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookstudentCheckPrint() {
        return hookCheckPrintstudent() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookstudentCheckPrint instead.</strong>
     * Hook method, called as part of "check print" on student. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check print
     * <li><code>false</code> abort check print and continue with print action.
     * <li><code>throw exception</code> abort check print, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check print should continue to check nodes; 
     *         <code>false</code> if check print should finish cheking and
     *         continue with print action.
     * @see #hookstudentCheckPrint()
     */
    public boolean hookCheckPrintstudent() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkClear" on student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookstudentCheckClear() {
        return hookCheckClearstudent() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookstudentCheckClear instead.</strong>
     * Hook method, called as part of "check clear" on student. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check clear
     * <li><code>false</code> abort check clear and continue with clear action.
     * <li><code>throw exception</code> abort check clear, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check clear should continue to check nodes; 
     *         <code>false</code> if check clear should finish cheking and
     *         continue with clear action.
     * @see #hookstudentCheckClear()
     */
    public boolean hookCheckClearstudent() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkChange" on student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookstudentCheckChange() {
        return hookCheckChangestudent() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookstudentCheckChange instead.</strong>
     * Hook method, called as part of "check change" on student. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check change
     * <li><code>false</code> abort check change and continue with change action.
     * <li><code>throw exception</code> abort check change, interpret
     *     message and recover.
     * </ul>
     * @return <code>true</code> if check change should continue to check nodes; 
     *         <code>false</code> if check change should finish cheking and
     *         continue with change action.
     * @see #hookstudentCheckChange()
     */
    public boolean hookCheckChangestudent() {
        return true;
    }
    /**
     * Hook method, invoked as part of "check row select" on student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @param oldSelection the current selected line
     * @param newSelection the line about to be selected
     * @return a ECheckResult 
     */
     public ECheckResult hookstudentCheckRowSelect
                (int oldSelection, int newSelection) {
        return hookCheckRowSelectstudent(oldSelection, newSelection) ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /** 
     * <strong>The use of this method is discouraged. Override
     * hookstudentCheckRowSelect instead.</strong>
     * Hook method, called as part of "check row selection" on student. Override in subclass!
     * The return value have the following semantics:
     * <ul>
     * <li><code>true</code> continue with check row selection
     * <li><code>false</code> abort check row selection and continue with row selection.
     * <li><code>throw exception</code> abort row selection, interpret
     *     message and recover.
     * </ul>
     * @param currentSelection the currently selected row. 
     * @param newSelection the row the user wish to select.
     * @return <code>true</code> if check change should continue to check nodes; 
     *         <code>false</code> if check change should finish cheking and
     *         continue with change action.
     * @see #hookstudentCheckRowSelect(int, int)
     */
    public boolean hookCheckRowSelectstudent(int currentSelection, 
            int newSelection) {
        return true;
    }





   /**
    * Hook method, override in subclass.
    * @param line the ListblockLine to be inserted in the listblock.
    * @return <code>true</code> if the line should be inserted.
    */
    public boolean hookListBlockStudentCoursesListBeforeInsert(ListblockLine line) {
        return true;
    }
    /**
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     * @return true if the rest of the actions are to be execuded.
     */
    public boolean hookcloseAddStudentsToCourseBefore(GenovaEventHolder e) {
        return true;
    }
    /**
     * 
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     */
    public void hookcloseAddStudentsToCourseAfter(GenovaEventHolder e) {
        // empty method overridden in subclass
    }
    /**
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     * @return true if the rest of the actions are to be execuded.
     */
    public boolean hookfindCourseBefore(GenovaEventHolder e) {
        return true;
    }
    /**
     * 
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     */
    public void hookfindCourseAfter(GenovaEventHolder e) {
        // empty method overridden in subclass
    }
    /**
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     * @return true if the rest of the actions are to be execuded.
     */
    public boolean hookclearCourseBefore(GenovaEventHolder e) {
        return true;
    }
    /**
     * 
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     */
    public void hookclearCourseAfter(GenovaEventHolder e) {
        // empty method overridden in subclass
    }
    /**
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     * @return true if the rest of the actions are to be execuded.
     */
    public boolean hooksaveCourseBefore(GenovaEventHolder e) {
        return true;
    }
    /**
     * 
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     */
    public void hooksaveCourseAfter(GenovaEventHolder e) {
        // empty method overridden in subclass
    }
    /**
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     * @return true if the rest of the actions are to be execuded.
     */
    public boolean hookdeleteCourseBefore(GenovaEventHolder e) {
        return true;
    }
    /**
     * 
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     */
    public void hookdeleteCourseAfter(GenovaEventHolder e) {
        // empty method overridden in subclass
    }
    /**
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     * @return true if the rest of the actions are to be execuded.
     */
    public boolean hookfindStudentCourseBefore(GenovaEventHolder e) {
        return true;
    }
    /**
     * 
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     */
    public void hookfindStudentCourseAfter(GenovaEventHolder e) {
        // empty method overridden in subclass
    }
    /**
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     * @return true if the rest of the actions are to be execuded.
     */
    public boolean hookfindStudentBefore(GenovaEventHolder e) {
        return true;
    }
    /**
     * 
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     */
    public void hookfindStudentAfter(GenovaEventHolder e) {
        // empty method overridden in subclass
    }
    /**
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     * @return true if the rest of the actions are to be execuded.
     */
    public boolean hooksaveStudentCourseBefore(GenovaEventHolder e) {
        return true;
    }
    /**
     * 
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     */
    public void hooksaveStudentCourseAfter(GenovaEventHolder e) {
        // empty method overridden in subclass
    }
    /** The nunber of columns.
     * @return The number of columns.
     */
    public int StudentCoursesListgetColumnCount() {
        return view.StudentCoursesList_headers.size();
    }
    /** This function is called whenever the listblock wants the number of
     * lines that exist in the model. If code was generated by RT mode. The
     * number sent in to this function is the number from the underlaying
     * model, if there exist any. If no model exist, the number 1 will always
     * be returned for demo purposes only.
     * <br>
     * To modify number of lines displayed, return a different number than
     * the number sent in to the function.
     * @param rowcount Not in use.
     * @return The number of visible lines in the dialo.
     */

    public int StudentCoursesListgetRowCount(int rowcount) {
        if(false) {
            rowcount++;
        }
        return StudentCoursesListNodeInfo.getVisualRowCount();
    }

    /** Not in use.
     * @param row number of row
     * @param col number of column
     * @param value the value object
     * @return the value object
     * @deprecated
     */
    public Object StudentCoursesListgetValueAt(int row, int col, Object value) {
       return value;
    }

    /** Not in use.
     * @param value the value
     * @param row number of row
     * @param col number of column
     * @deprecated
     */
    public void StudentCoursesListsetValueAt(Object value, int row, int col) {
        if(false) {
            value.getClass();
            row++;
            col++;
        }
    }

    /**
     * Initialize dialog components, set up initial application context.
     * @param to the object to assign the value
     * @param field the attribute
     * @param value String representation of assign value
     */
    void reflectAssign(Object to, String field, String value) {
       try {
           boolean useMethods = true;
           boolean convertValue = false;
           String fieldClassName = null;
           if(!useMethods) {
               Field copyToField = to.getClass().getField(field);
               Class copyToFieldType = copyToField.getType();
               convertValue =
                   (copyToFieldType.getSuperclass() ==  GenovaEnumerator.class);
               if(convertValue) {
                   fieldClassName = getClassNameC(copyToFieldType);
               }
           } else {
               String capAttribute = 
                   field.substring(0,1).toUpperCase()+
                   field.substring(1);
//               Class toClass = to.getClass();
               Method copyFromGetMethod = 
                   to.getClass().getMethod("get"+capAttribute, null);
               Class returnType = copyFromGetMethod.getReturnType();
               convertValue =
                   (returnType.getSuperclass() == GenovaEnumerator.class);
               if(convertValue) {
                   fieldClassName = getClassNameC(returnType);
               }
           }
           if(convertValue && value != null) {
               value = String.valueOf(applicationEnums.toValue(fieldClassName, value));
           }
           TypeTool.reflectAssignMethod(to, field, value);
       }
       catch(Exception e) {
           view.exceptionHandler(e);
       }
    }
    String convertToString(Object o, String classname) {
        return convertToString(o, classname, true);
    }
    String convertToString(Object o, String classname, boolean ignoreZero) {
        if(o == null) {
            return "";
        }
        if(o.getClass().getSuperclass() == GenovaEnumerator.class) {
            int value = ((GenovaEnumerator)o).currentValue;
            return applicationEnums.toName(classname, value);
        }
        return TypeTool.convertToString(o, ignoreZero);
    }
    String convertToString(int i, String classname, boolean ignoreZero) {
        if(false) {
            classname.getClass();
        }
        return TypeTool.convertToString(i, ignoreZero);
    }
    String convertToString(int i, String classname) {
        if(false) {
            classname.getClass();
        }
        return TypeTool.convertToString(i, true);
    }
    String convertToString(boolean b, String classname, boolean ignoreZero) {
        if(false) {
            classname.getClass();
        }
        return TypeTool.convertToString(b, ignoreZero);
    }
    String convertToString(boolean b, String classname) {
        if(false) {
            classname.getClass();
        }
        return TypeTool.convertToString(b, true);
    }
    String convertToString(char c, String classname, boolean ignoreZero) {
        if(false) {
            classname.getClass();
        }
        return TypeTool.convertToString(c, ignoreZero);
    }
    String convertToString(char c, String classname) {
        if(false) {
            classname.getClass();
        }
        return TypeTool.convertToString(c, true);
    }
    String convertToString(float f, String classname, boolean ignoreZero) {
        if(false) {
            classname.getClass();
        }
        return TypeTool.convertToString(f, ignoreZero);
    }
    String convertToString(float f, String classname) {
        if(false) {
            classname.getClass();
        }
        return TypeTool.convertToString(f, true);
    }    
    String convertToString(double d, String classname, boolean ignoreZero) {
        if(false) {
            classname.getClass();
        }
        return TypeTool.convertToString(d, ignoreZero);
    }
    String convertToString(double d, String classname) {
        if(false) {
            classname.getClass();
        }
        return TypeTool.convertToString(d, true);
    }
    String convertToString(long l, String classname, boolean ignoreZero) {
        if(false) {
            classname.getClass();
        }
        return TypeTool.convertToString(l, ignoreZero);
    }
    String convertToString(long l, String classname) {
        if(false) {
            classname.getClass();
        }
        return TypeTool.convertToString(l, true);
    }
    String getAttributeClassName(Object owner, String field) {
        if(owner == null) {
            return null;
        }
        try {
            Field f = owner.getClass().getField(field);
            String name = f.getType().getName();
            int lastDot = name.lastIndexOf('.');
            if(lastDot == -1) {
                return name;
            }
            return name.substring(lastDot+1);
        } catch(NoSuchFieldException e) {
            Object[] args = {this.getClass(), field, owner.getClass(), e.getMessage()};
            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_UNABLE_TO_ACCESS_FIELD_OR_METHOD, args);
            MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
            return null;
        }    
    }
    String getClassNameC(Class x) {
        String name = x.getName();
        int lastDot = name.lastIndexOf('.');
        if(lastDot == -1) {
            return name;
        }
        return name.substring(lastDot+1);
    }
    String getClassName(Object ob) {
        if(ob == null) {
            return null;
        }
        return getClassNameC(ob.getClass());
    }
    String getClassName(Object ob, String fieldname) {
        try {
            if(ob == null) {
                return null;
            }
            Class ownerClass = ob.getClass();
            Field f = ownerClass.getField(fieldname);
            String name = f.getType().getName();
            int lastDot = name.lastIndexOf('.');
            if(lastDot == -1) {
                return name;
            }
            return name.substring(lastDot+1);
        }
        catch(Exception e) {
            return null;
        }
    }
    String getClassName(int i) {
        if(false) { i++; }
        return null;
    }
    String getClassName(boolean i) {
        if(false) { i = !i; }
        return null;
    }
    String getClassName(char i) {
        if(false) { i++; }
        return null;
    }
    String getClassName(byte i) {
        if(false) { i++; }
        return null;
    }
    String getClassName(float i) {
        if(false) { i++; }
        return null;
    }
    String getClassName(double i) {
        if(false) { i++; }
        return null;
    }
    String getClassName(long i) {
        if(false) { i++; }
        return null;
    }
    /**
     * Hook method, override in subclass
     * @param objectToDisplay the domain object about to be displayed.
     * @param roleName the role name of the domain object
     * @return <code>true</code> if it is ok to proceed with display.
     */
    public boolean hookBeforeDisplay(Object objectToDisplay, String roleName) {
        return true;
    }

    /**
     * Hook method, invoked after the obtaining the Course object.
     * The returned Course object is the object that will be used as
     * the return value of the obtain method.
     * Returning <code>null</code> from this method is ignored, the
     * effect being as if this method had not been invoked.
     * @param domainObject the obtained domain object.
     * @return the domain object.
     */
    public Course hookAfterObtainCourse(Course domainObject) {
        // override in subclass!
        return domainObject;
    }

    /**
     * Hook method, invoked after the obtaining the studentCourses object.
     * The returned studentCourses object is the object that will be used as
     * the return value of the obtain method.
     * Returning <code>null</code> from this method is ignored, the
     * effect being as if this method had not been invoked.
     * @param domainObject the obtained domain object.
     * @return the domain object.
     */
    public StudentCourse hookAfterObtainstudentCourses(StudentCourse domainObject) {
        // override in subclass!
        return domainObject;
    }

    /**
     * Hook method, invoked after the obtaining the student object.
     * The returned student object is the object that will be used as
     * the return value of the obtain method.
     * Returning <code>null</code> from this method is ignored, the
     * effect being as if this method had not been invoked.
     * @param domainObject the obtained domain object.
     * @return the domain object.
     */
    public Student hookAfterObtainstudent(Student domainObject) {
        // override in subclass!
        return domainObject;
    }
    
    
    /**
     * Invokes check close on the AddStudentsToCourse dialog, and closes the
     * AddStudentsToCourse dialog if checkClose returned <code>true</code>
     */
    protected void actionCloseAddStudentsToCourse() {
    
        String msgID = null;
        Exception ex = null;
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    GenovaDialogController gdc = 
                            application.getDialog("AddStudentsToCourse");
                    try {

                        // close a dialog window if checkClose returns true
                        if (gdc != null && gdc.checkClose()) {
                            gdc.disposeDialog();
                        }
                    } catch (GenovaBaseException e) {
                        if (hookActionCloseAddStudentsToCourseException(e)) {
                            throw e;
                        }
                    } catch (RuntimeException e) {
                        if (hookActionCloseAddStudentsToCourseException(e)) {
                            if (gdc != null) {
                                gdc.disposeDialog();
                            }
                            throw e;
                        }
                    }
                }
            });
        } catch (InterruptedException e) {
            msgID = CRuntimeMsg.CT_INTERRUPTED;
            ex = e;
        } catch (InvocationTargetException e) {
            Throwable t = e.getCause();
            if (t instanceof RuntimeException) {
                throw (RuntimeException)t;
            } else {
                msgID = CRuntimeMsg.CT_INVOCATION_TARGET;
                if (t instanceof Exception) {
                    ex = (Exception)t;
                } else {
                    ex = e;
                }
            }
        } finally {
            if (msgID != null) {
               Object[] msgArgs = {this.getClass(), "actionCloseAddStudentsToCourse", ex};
               Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
               MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
               throw new GenovaClientFrameworkException(ex, msg);
            }
        } 
    }
    


    /**
     * The Find Course JGrape action. This action involves 
     * the following steps.
     * <ol>
     *  <li>The Course's check method for Find is invoked, possibly
     *      aborting the action.
     * 
     * <li>After a recursive obtain, which builds up a minimum tree
     *     containing only the objects needed by the server to identify the
     *     target, the hookActionFindCourseObtain(ObjectSelection)
     *     method is invoked, possibly aborting the action.
     *
     * <li>Next, hookActionFindCourseClientContext() is invoked. 
     *     If the method returns <code>null</code> a default client 
     *     context is used.
     *
     * <li>The object selection and the client context is used as arguments
     *     to 
     *
     *    <code>
     *    Application.getServiceProxy()
     *            .Find(ObjectSelection, ClientContext).
     *    </code>
     *
     * <li>If the action is either a save, insert or update action, the
     *     result from invoking Find on the service proxy is merged with
     *     the client's objects in order to restore the associations that
     *     where stripped away when performing the recursive obtain.
     *
     * <li>Invoke hookActionFindCourseDisplay(resultObject), possibly 
     *     aborting the action.
     *
     * <li>Recursively clear the Course node and the recursivly
     *     display the result.
     *
     * <li>If the target node is a root node, reset other
     *     associations from the root node.
     * </ol>
     */
    protected void actionFindCourse() {
        try {

            if (!theCourse.checkFind()) {
                Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_ABORTING_ACTION, "checkFind", "find", "Course");
                MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                return;
            }

            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CONTINUING_ACTION, "find", "Course");
            MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);

            ObjectSelection os = obtainObjectSelection(theCourse);
            os.setTargetMainKey(theCourse.getTargetMainKey());

            boolean goAhead = false;
            try {
                goAhead = hookActionFindCourseObtain(os);
            } catch (RuntimeException e) { 
                goAhead = false;
                throw e;
            } finally {
                if (!goAhead) {
                    // rollback from recursive obtain
                    Object parent = os.getRootObject(theCourse
                            .getRootNode().getRoleName());
                    if (parent != null) {
                        AbstractNode top = (AbstractNode) theCourse
                                .getRootNode();
                        List pathToTarget = theCourse.getPathToNode();
                        top.mergeAssociations(parent, pathToTarget,true); 
                    }
                }
            }
            if (!goAhead) {
                return;
            }

            ClientContext ctx = hookActionFindCourseClientContext();
            if (ctx == null) {
                ctx = Application.getClientContext();
            }

            Collection resultObject = null;
            try {
                resultObject = (Collection) Application.getServiceProxy().find(os, ctx);
            } catch (RuntimeException e) {
                // rollback from recursive obtain
                Object parent = os.getRootObject(theCourse
                        .getRootNode().getRoleName());
                if (parent != null) {
                    AbstractNode top = (AbstractNode) theCourse
                            .getRootNode();
                    List pathToTarget = theCourse.getPathToNode();
                    top.mergeAssociations(parent, pathToTarget,true); 
                }
                throw e;
            }

            if (hookActionFindCourseDisplay(resultObject)) {
                new ClearTool(roleObjects).clearKeepKeys("Course");
                resetProxy();
                if (resultObject != null) {
                    theCourse.getRootNode().displayOnEDT(resultObject, theCourse.getPathToNode(), false);
                } 

            }
            if (resultObject != null) {
                AbstractNode top = (AbstractNode) theCourse.getRootNode();
                if (theCourse != top) {  // restore associations from root node.
                    if (resultObject.iterator().hasNext()) {
                        Object first = resultObject.iterator().next();
                        top.resetAssociations(first);
                    }
                }
            }

        } catch (RuntimeException e) {
            if (hookActionFindCourseException(e)) {
                throw e;
            }
        } 
    }
    
    
    /**
     * Recursivly clears all fields in the Course 
     * object selection node, and
     * sets the cleared nodes' state to CLEARED.
     */
    protected void actionClearCourse() {
        String msgID = null;
        Exception ex = null;
    
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    try {
                        if (theCourse.checkClear()) {
                            new ClearTool(roleObjects).clearRole("Course");
                            theCourse.nullProxy();
                        }
                    } catch (RuntimeException e) {
                        if (hookActionClearCourseException(e)) {
                            throw e;
                        }
                    }
                }
            });
        } catch (InterruptedException e) {
            msgID = CRuntimeMsg.CT_INTERRUPTED;
            ex = e;
        } catch (InvocationTargetException e) {
            Throwable t = e.getCause();
            if (t instanceof RuntimeException) {
                throw (RuntimeException)t;
            } else {
                msgID = CRuntimeMsg.CT_INVOCATION_TARGET;
                if (t instanceof Exception) {
                    ex = (Exception)t;
                } else {
                    ex = e;
                }
            }
        } finally {
            if (msgID != null) {
               Object[] msgArgs = {this.getClass(), "actionClearCourse", ex};
               Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
               MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
               throw new GenovaClientFrameworkException(ex, msg);
            }
        } 
    }
    


    /**
     * The Save Course JGrape action. This action involves 
     * the following steps.
     * <ol>
     *  <li>The Course's check method for Save is invoked, possibly
     *      aborting the action.
     * 
     * <li>After a recursive obtain, which builds up a minimum tree
     *     containing only the objects needed by the server to identify the
     *     target, the hookActionSaveCourseObtain(ObjectSelection)
     *     method is invoked, possibly aborting the action.
     *
     * <li>Next, hookActionSaveCourseClientContext() is invoked. 
     *     If the method returns <code>null</code> a default client 
     *     context is used.
     *
     * <li>The object selection and the client context is used as arguments
     *     to 
     *
     *    <code>
     *    Application.getServiceProxy()
     *            .Save(ObjectSelection, ClientContext).
     *    </code>
     *
     * <li>If the action is either a save, insert or update action, the
     *     result from invoking Save on the service proxy is merged with
     *     the client's objects in order to restore the associations that
     *     where stripped away when performing the recursive obtain.
     *
     * <li>Invoke hookActionSaveCourseDisplay(resultObject), possibly 
     *     aborting the action.
     *
     * <li>Recursively clear the Course node and the recursivly
     *     display the result.
     * </ol>
     */
    protected void actionSaveCourse() {
        try {

            if (!theCourse.checkSave()) {
                Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_ABORTING_ACTION, "checkSave", "save", "Course");
                MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                return;
            }

            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CONTINUING_ACTION, "save", "Course");
            MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);

            List selectedLines = getListblockStates(theCourse.getPathToNode());
            ObjectSelection os = obtainObjectSelection(theCourse);
            os.setTargetMainKey(theCourse.getTargetMainKey());

            boolean goAhead = false;
            try {
                goAhead = hookActionSaveCourseObtain(os);
            } catch (RuntimeException e) { 
                goAhead = false;
                throw e;
            } finally {
                if (!goAhead) {
                    // rollback from recursive obtain
                    Object parent = os.getRootObject(theCourse
                            .getRootNode().getRoleName());
                    if (parent != null) {
                        AbstractNode top = (AbstractNode) theCourse
                                .getRootNode();
                        List pathToTarget = theCourse.getPathToNode();
                        top.mergeAssociations(parent, pathToTarget,true); 
                    }
                }
            }
            if (!goAhead) {
                return;
            }

            ClientContext ctx = hookActionSaveCourseClientContext();
            if (ctx == null) {
                ctx = Application.getClientContext();
            }

            Collection resultObject = null;
            try {
                resultObject = (Collection) Application.getServiceProxy().save(os, ctx);
            } catch (RuntimeException e) {
                // rollback from recursive obtain
                Object parent = os.getRootObject(theCourse
                        .getRootNode().getRoleName());
                if (parent != null) {
                    AbstractNode top = (AbstractNode) theCourse
                            .getRootNode();
                    List pathToTarget = theCourse.getPathToNode();
                    top.mergeAssociations(parent, pathToTarget,true); 
                }
                throw e;
            }

            if (resultObject != null) {
                AbstractNode top = (AbstractNode) theCourse.getRootNode();
                List pathToTarget = theCourse.getPathToNode();
                if (resultObject.iterator().hasNext()) {
                    Object first = resultObject.iterator().next();
                    top.mergeAssociations(first, pathToTarget,false);
                }
            }
            if (hookActionSaveCourseDisplay(resultObject)) {
                new ClearTool(roleObjects).clearKeepKeys("Course");
                resetProxy();
                if (resultObject != null) {
                    theCourse.getRootNode().displayOnEDT(resultObject, theCourse.getPathToNode(), false);
                } 

                setListblockStates(selectedLines, true);
            }

        } catch (RuntimeException e) {
            if (hookActionSaveCourseException(e)) {
                throw e;
            }
        } 
    }


    /**
     * The Delete Course JGrape action. This action involves 
     * the following steps.
     * <ol>
     *  <li>The Course's check method for Delete is invoked, possibly
     *      aborting the action.
     * 
     * <li>After a recursive obtain, which builds up a minimum tree
     *     containing only the objects needed by the server to identify the
     *     target, the hookActionDeleteCourseObtain(ObjectSelection)
     *     method is invoked, possibly aborting the action.
     *
     * <li>Next, hookActionDeleteCourseClientContext() is invoked. 
     *     If the method returns <code>null</code> a default client 
     *     context is used.
     *
     * <li>The object selection and the client context is used as arguments
     *     to 
     *
     *    <code>
     *    Application.getServiceProxy()
     *            .Delete(ObjectSelection, ClientContext).
     *    </code>
     *
     * <li>If the action is either a save, insert or update action, the
     *     result from invoking Delete on the service proxy is merged with
     *     the client's objects in order to restore the associations that
     *     where stripped away when performing the recursive obtain.
     *
     * <li>Invoke hookActionDeleteCourseDisplay(resultObject), possibly 
     *     aborting the action.
     *
     * <li>Recursively clear the Course node and the recursivly
     *     display the result.
     * </ol>
     */
    protected void actionDeleteCourse() {
        try {

            if (!theCourse.checkDelete()) {
                Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_ABORTING_ACTION, "checkDelete", "delete", "Course");
                MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                return;
            }

            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CONTINUING_ACTION, "delete", "Course");
            MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);

            ObjectSelection os = obtainObjectSelection(theCourse);
            os.setTargetMainKey(theCourse.getTargetMainKey());

            boolean goAhead = false;
            try {
                goAhead = hookActionDeleteCourseObtain(os);
            } catch (RuntimeException e) { 
                goAhead = false;
                throw e;
            } finally {
                if (!goAhead) {
                    // rollback from recursive obtain
                    Object parent = os.getRootObject(theCourse
                            .getRootNode().getRoleName());
                    if (parent != null) {
                        AbstractNode top = (AbstractNode) theCourse
                                .getRootNode();
                        List pathToTarget = theCourse.getPathToNode();
                        top.mergeAssociations(parent, pathToTarget,true); 
                    }
                }
            }
            if (!goAhead) {
                return;
            }

            ClientContext ctx = hookActionDeleteCourseClientContext();
            if (ctx == null) {
                ctx = Application.getClientContext();
            }

            Collection resultObject = null;
            try {
                resultObject = (Collection) Application.getServiceProxy().delete(os, ctx);
            } catch (RuntimeException e) {
                // rollback from recursive obtain
                Object parent = os.getRootObject(theCourse
                        .getRootNode().getRoleName());
                if (parent != null) {
                    AbstractNode top = (AbstractNode) theCourse
                            .getRootNode();
                    List pathToTarget = theCourse.getPathToNode();
                    top.mergeAssociations(parent, pathToTarget,true); 
                }
                throw e;
            }

            Object root = os.getRootObject(theCourse.getRootNode().getRoleName());
            theCourse.removeFromParent(root);
            if (resultObject != null) {
                AbstractNode top = (AbstractNode) theCourse.getRootNode();
                List pathToTarget = theCourse.getPathToNode();
                if (resultObject.iterator().hasNext()) {
                    Object first = resultObject.iterator().next();
                    top.mergeAssociations(first, pathToTarget,false);
                }
            }
            if (hookActionDeleteCourseDisplay(resultObject)) {
                new ClearTool(roleObjects).clear("Course");
                resetProxy();
                if (resultObject != null) {
                    theCourse.getRootNode().displayOnEDT(resultObject, theCourse.getPathToNode(), false);
                } 

            }

        } catch (RuntimeException e) {
            if (hookActionDeleteCourseException(e)) {
                throw e;
            }
        } 
    }


    /**
     * The Find studentCourses JGrape action. This action involves 
     * the following steps.
     * <ol>
     *  <li>The studentCourses's check method for Find is invoked, possibly
     *      aborting the action.
     * 
     * <li>After a recursive obtain, which builds up a minimum tree
     *     containing only the objects needed by the server to identify the
     *     target, the hookActionFindstudentCoursesObtain(ObjectSelection)
     *     method is invoked, possibly aborting the action.
     *
     * <li>Next, hookActionFindstudentCoursesClientContext() is invoked. 
     *     If the method returns <code>null</code> a default client 
     *     context is used.
     *
     * <li>The object selection and the client context is used as arguments
     *     to 
     *
     *    <code>
     *    Application.getServiceProxy()
     *            .Find(ObjectSelection, ClientContext).
     *    </code>
     *
     * <li>If the action is either a save, insert or update action, the
     *     result from invoking Find on the service proxy is merged with
     *     the client's objects in order to restore the associations that
     *     where stripped away when performing the recursive obtain.
     *
     * <li>Invoke hookActionFindstudentCoursesDisplay(resultObject), possibly 
     *     aborting the action.
     *
     * <li>Recursively clear the studentCourses node and the recursivly
     *     display the result.
     *
     * <li>If the target node is a root node, reset other
     *     associations from the root node.
     * </ol>
     */
    protected void actionFindstudentCourses() {
        try {

            if (!thestudentCourses.checkFind()) {
                Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_ABORTING_ACTION, "checkFind", "find", "studentCourses");
                MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                return;
            }

            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CONTINUING_ACTION, "find", "studentCourses");
            MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);

            ObjectSelection os = obtainObjectSelection(thestudentCourses);
            os.setTargetMainKey(thestudentCourses.getTargetMainKey());

            boolean goAhead = false;
            try {
                goAhead = hookActionFindstudentCoursesObtain(os);
            } catch (RuntimeException e) { 
                goAhead = false;
                throw e;
            } finally {
                if (!goAhead) {
                    // rollback from recursive obtain
                    Object parent = os.getRootObject(thestudentCourses
                            .getRootNode().getRoleName());
                    if (parent != null) {
                        AbstractNode top = (AbstractNode) thestudentCourses
                                .getRootNode();
                        List pathToTarget = thestudentCourses.getPathToNode();
                        top.mergeAssociations(parent, pathToTarget,true); 
                    }
                }
            }
            if (!goAhead) {
                return;
            }

            ClientContext ctx = hookActionFindstudentCoursesClientContext();
            if (ctx == null) {
                ctx = Application.getClientContext();
            }

            Collection resultObject = null;
            try {
                resultObject = (Collection) Application.getServiceProxy().find(os, ctx);
            } catch (RuntimeException e) {
                // rollback from recursive obtain
                Object parent = os.getRootObject(thestudentCourses
                        .getRootNode().getRoleName());
                if (parent != null) {
                    AbstractNode top = (AbstractNode) thestudentCourses
                            .getRootNode();
                    List pathToTarget = thestudentCourses.getPathToNode();
                    top.mergeAssociations(parent, pathToTarget,true); 
                }
                throw e;
            }

            if (hookActionFindstudentCoursesDisplay(resultObject)) {
                new ClearTool(roleObjects).clearKeepKeys("studentCourses");
                resetProxy();
                if (resultObject != null) {
                    thestudentCourses.getRootNode().displayOnEDT(resultObject, thestudentCourses.getPathToNode(), false);
                } 

            }
            if (resultObject != null) {
                AbstractNode top = (AbstractNode) thestudentCourses.getRootNode();
                if (thestudentCourses != top) {  // restore associations from root node.
                    if (resultObject.iterator().hasNext()) {
                        Object first = resultObject.iterator().next();
                        top.resetAssociations(first);
                    }
                }
            }

        } catch (RuntimeException e) {
            if (hookActionFindstudentCoursesException(e)) {
                throw e;
            }
        } 
    }


    /**
     * The Find student JGrape action. This action involves 
     * the following steps.
     * <ol>
     *  <li>The student's check method for Find is invoked, possibly
     *      aborting the action.
     * 
     * <li>After a recursive obtain, which builds up a minimum tree
     *     containing only the objects needed by the server to identify the
     *     target, the hookActionFindstudentObtain(ObjectSelection)
     *     method is invoked, possibly aborting the action.
     *
     * <li>Next, hookActionFindstudentClientContext() is invoked. 
     *     If the method returns <code>null</code> a default client 
     *     context is used.
     *
     * <li>The object selection and the client context is used as arguments
     *     to 
     *
     *    <code>
     *    Application.getServiceProxy()
     *            .Find(ObjectSelection, ClientContext).
     *    </code>
     *
     * <li>If the action is either a save, insert or update action, the
     *     result from invoking Find on the service proxy is merged with
     *     the client's objects in order to restore the associations that
     *     where stripped away when performing the recursive obtain.
     *
     * <li>Invoke hookActionFindstudentDisplay(resultObject), possibly 
     *     aborting the action.
     *
     * <li>Recursively clear the student node and the recursivly
     *     display the result.
     *
     * <li>If the target node is a root node, reset other
     *     associations from the root node.
     * </ol>
     */
    protected void actionFindstudent() {
        try {

            if (!thestudent.checkFind()) {
                Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_ABORTING_ACTION, "checkFind", "find", "student");
                MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                return;
            }

            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CONTINUING_ACTION, "find", "student");
            MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);

            ObjectSelection os = obtainObjectSelection(thestudent);
            os.setTargetMainKey(thestudent.getTargetMainKey());

            boolean goAhead = false;
            try {
                goAhead = hookActionFindstudentObtain(os);
            } catch (RuntimeException e) { 
                goAhead = false;
                throw e;
            } finally {
                if (!goAhead) {
                    // rollback from recursive obtain
                    Object parent = os.getRootObject(thestudent
                            .getRootNode().getRoleName());
                    if (parent != null) {
                        AbstractNode top = (AbstractNode) thestudent
                                .getRootNode();
                        List pathToTarget = thestudent.getPathToNode();
                        top.mergeAssociations(parent, pathToTarget,true); 
                    }
                }
            }
            if (!goAhead) {
                return;
            }

            ClientContext ctx = hookActionFindstudentClientContext();
            if (ctx == null) {
                ctx = Application.getClientContext();
            }

            Collection resultObject = null;
            try {
                resultObject = (Collection) Application.getServiceProxy().find(os, ctx);
            } catch (RuntimeException e) {
                // rollback from recursive obtain
                Object parent = os.getRootObject(thestudent
                        .getRootNode().getRoleName());
                if (parent != null) {
                    AbstractNode top = (AbstractNode) thestudent
                            .getRootNode();
                    List pathToTarget = thestudent.getPathToNode();
                    top.mergeAssociations(parent, pathToTarget,true); 
                }
                throw e;
            }

            if (hookActionFindstudentDisplay(resultObject)) {
                new ClearTool(roleObjects).clearKeepKeys("student");
                resetProxy();
                if (resultObject != null) {
                    thestudent.getRootNode().displayOnEDT(resultObject, thestudent.getPathToNode(), false);
                } 

            }
            if (resultObject != null) {
                AbstractNode top = (AbstractNode) thestudent.getRootNode();
                if (thestudent != top) {  // restore associations from root node.
                    if (resultObject.iterator().hasNext()) {
                        Object first = resultObject.iterator().next();
                        top.resetAssociations(first);
                    }
                }
            }

        } catch (RuntimeException e) {
            if (hookActionFindstudentException(e)) {
                throw e;
            }
        } 
    }


    /**
     * The Save studentCourses JGrape action. This action involves 
     * the following steps.
     * <ol>
     *  <li>The studentCourses's check method for Save is invoked, possibly
     *      aborting the action.
     * 
     * <li>After a recursive obtain, which builds up a minimum tree
     *     containing only the objects needed by the server to identify the
     *     target, the hookActionSavestudentCoursesObtain(ObjectSelection)
     *     method is invoked, possibly aborting the action.
     *
     * <li>Next, hookActionSavestudentCoursesClientContext() is invoked. 
     *     If the method returns <code>null</code> a default client 
     *     context is used.
     *
     * <li>The object selection and the client context is used as arguments
     *     to 
     *
     *    <code>
     *    Application.getServiceProxy()
     *            .Save(ObjectSelection, ClientContext).
     *    </code>
     *
     * <li>If the action is either a save, insert or update action, the
     *     result from invoking Save on the service proxy is merged with
     *     the client's objects in order to restore the associations that
     *     where stripped away when performing the recursive obtain.
     *
     * <li>Invoke hookActionSavestudentCoursesDisplay(resultObject), possibly 
     *     aborting the action.
     *
     * <li>Recursively clear the studentCourses node and the recursivly
     *     display the result.
     * </ol>
     */
    protected void actionSavestudentCourses() {
        try {

            if (!thestudentCourses.checkSave()) {
                Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_ABORTING_ACTION, "checkSave", "save", "studentCourses");
                MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                return;
            }

            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CONTINUING_ACTION, "save", "studentCourses");
            MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);

            List selectedLines = getListblockStates(thestudentCourses.getPathToNode());
            ObjectSelection os = obtainObjectSelection(thestudentCourses);
            os.setTargetMainKey(thestudentCourses.getTargetMainKey());

            boolean goAhead = false;
            try {
                goAhead = hookActionSavestudentCoursesObtain(os);
            } catch (RuntimeException e) { 
                goAhead = false;
                throw e;
            } finally {
                if (!goAhead) {
                    // rollback from recursive obtain
                    Object parent = os.getRootObject(thestudentCourses
                            .getRootNode().getRoleName());
                    if (parent != null) {
                        AbstractNode top = (AbstractNode) thestudentCourses
                                .getRootNode();
                        List pathToTarget = thestudentCourses.getPathToNode();
                        top.mergeAssociations(parent, pathToTarget,true); 
                    }
                }
            }
            if (!goAhead) {
                return;
            }

            ClientContext ctx = hookActionSavestudentCoursesClientContext();
            if (ctx == null) {
                ctx = Application.getClientContext();
            }

            Collection resultObject = null;
            try {
                resultObject = (Collection) Application.getServiceProxy().save(os, ctx);
            } catch (RuntimeException e) {
                // rollback from recursive obtain
                Object parent = os.getRootObject(thestudentCourses
                        .getRootNode().getRoleName());
                if (parent != null) {
                    AbstractNode top = (AbstractNode) thestudentCourses
                            .getRootNode();
                    List pathToTarget = thestudentCourses.getPathToNode();
                    top.mergeAssociations(parent, pathToTarget,true); 
                }
                throw e;
            }

            if (resultObject != null) {
                AbstractNode top = (AbstractNode) thestudentCourses.getRootNode();
                List pathToTarget = thestudentCourses.getPathToNode();
                if (resultObject.iterator().hasNext()) {
                    Object first = resultObject.iterator().next();
                    top.mergeAssociations(first, pathToTarget,false);
                }
            }
            if (hookActionSavestudentCoursesDisplay(resultObject)) {
                new ClearTool(roleObjects).clearKeepKeys("studentCourses");
                resetProxy();
                if (resultObject != null) {
                    thestudentCourses.getRootNode().displayOnEDT(resultObject, thestudentCourses.getPathToNode(), false);
                } 

                setListblockStates(selectedLines, true);
            }

        } catch (RuntimeException e) {
            if (hookActionSavestudentCoursesException(e)) {
                throw e;
            }
        } 
    }
    /* Here we can generate code which don't belong anywhere due to missing
     * sections or whatever. It will not be called by any method. 
     * @deprecated
     */
    void trashDepartment() {
        String s = null; 
        boolean b = false; if(false) { b = !b; s.getClass();}
    }
} // End of controller Class 
