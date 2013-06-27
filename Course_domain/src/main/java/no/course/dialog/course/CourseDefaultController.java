// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package no.course.dialog.course;
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

/**
 * Public class interpreting the controller part of
 * Course. This file is generated for each generation in
 * Genova. Do not make changes in this file. All user added code
 * should be done in class Course.
 * To access mother application, use variable
 * 'application'.
 */ 
@SuppressWarnings("all")
public abstract class CourseDefaultController implements GenovaDialogController {
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
    /** This is the entry point for the object selection node with name Course2. Use methods found in this class - do not access view directly! */
    public Course2Methods theCourse2;
    
    /* Her kommer generert kode fra WindowBlock:controllerdecl*/
    
    HashMap tabListFromNodeNameWindow = new HashMap();
    HashMap tabListFromComponentWindow = new HashMap();
    
    String[] tabSequence = {"Course.code","Course.name","Course.isActive","CourseSaveButton","CourseClearButton","CourseDeleteButton","courseList"};
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
    
    HashMap tabListFromNodeNametableBlock = tabListFromNodeNameWindow;
    HashMap tabListFromComponenttableBlock = tabListFromComponentWindow;
    
    /* Her kommer generert kode for Listblock:controllerdecl*/
    
    HashMap tabListFromNodeNamecourseList = tabListFromNodeNametableBlock;
    HashMap tabListFromComponentcourseList = tabListFromComponenttableBlock;
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
    CourseDefaultView view;
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
        view.clearCourse();
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
    public CourseDefaultController(ApplicationMethods app) { 
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
                if (pathToTarget.contains(theCourse2)) {
                    editFieldLines.add(listblockMethodscourseList
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
                    Object[] msgArgs = {CourseDefaultController.class, "getListblockStates", ex};
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
                    Object[] msgArgs = {CourseDefaultController.class, "setListblockStates", ex};
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

        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckPrint();
        }

        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCourse2CheckPrint();
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

        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCheckSaveCourse();
        }

        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCheckSaveCourse2();
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

        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckSave();
        }

        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCourse2CheckSave();
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
        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCheckFindCourse();
        }
        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCheckFindCourse2();
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

        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckFind();
        }

        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCourse2CheckFind();
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
        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCheckCloseCourse();
        }
        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCheckCloseCourse2();
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

        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckClose();
        }

        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCourse2CheckClose();
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
        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCheckDeleteCourse();
        }
        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCheckDeleteCourse2();
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

        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckDelete();
        }

        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCourse2CheckDelete();
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
        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCheckClearCourse();
        }
        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCheckClearCourse2();
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

        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckClear();
        }

        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCourse2CheckClear();
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
        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCheckChangeCourse();
        }
        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCheckChangeCourse2();
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

        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckChange();
        }

        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCourse2CheckChange();
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
        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCheckRowSelectCourse(currentSelectionIndex, newSelectionIndex);
        }
        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCheckRowSelectCourse2(currentSelectionIndex, newSelectionIndex);
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

        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return hookCourseCheckRowSelect(oldSelection, newSelection);
        }        

        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return hookCourse2CheckRowSelect(oldSelection, newSelection);
        }        

        return ECheckResult.DEFAULT;
    }        


    public boolean checkPrint() {
        boolean retVal = true;
        retVal = retVal && theCourse.checkPrint();
        retVal = retVal && theCourse2.checkPrint();
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
     * CourseView. A default implementation of this method
     * is generated in the CourseController class.
     *
     * @param controller the controller for the dialog.
     * @param applicationEnums the GenovaEnums object for the application.
     * @return the dialog view.
     */
    protected abstract CourseDefaultView hookInstantiateView(CourseDefaultController controller, GenovaEnums applicationEnums);


    public boolean checkClose() {
        boolean retVal = true;
        getView().toFront();
        try {
            getView().setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            // can't select the view...
        }        
        retVal = retVal && theCourse.checkClose();
        retVal = retVal && theCourse2.checkClose();
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
        if (CourseConst.Course.OSRoleName.equals(roleName)) {
            return theCourse.checkClear();
        }
        if (CourseConst.Course2.OSRoleName.equals(roleName)) {
            return theCourse2.checkClear();
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
        return "Course";
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
       theCourse2 = new Course2Methods(view, this, applicationEnums);
       RoleObject roleObjectCourse2 = addRoleObject(Course.class, new RoleObject("Course2"));
       roleObjectCourse2.setNode(theCourse2);
       roleObjectCourse2.addSimpleBlock(theCourse2);
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

        RoleObject roleObjectCourse2 = addRoleObject(Course.class, new RoleObject("Course2"));

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
                        targetRoleName, getServerApplicationName(), "Course_os");
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
                                            "Course_os");
                Map obtainedRoots = new HashMap();
                obtainedRoots.put("Course", 
                        obtainObjectSelection(theCourse, true));
                obtainedRoots.put("Course2", 
                        obtainObjectSelection(theCourse2, true));

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
        if ("Course2".equals(roleName)) {
            return theCourse2;
        }
        /* no match! */
        return null;
    }


    public void clearObjectSelection() {
        ClearTool clearTool = new ClearTool(roleObjects);
        clearTool.clear("Course");
        clearTool.clear("Course2");
    }


    private boolean checkClearObjectSelection() {
        boolean ok = true;
        ok = ok && theCourse.checkChanged();
        ok = ok && theCourse2.checkChanged();
        if (!ok) {
            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CC_CHECK_CLEAR_MSG);
            MessageReply reply = Application.getMessageDispatcher(getWindow(), getApplication()).dispatch(msg);
            ok = MessageReplyType.REPLY_OK.equals(reply);
        }
        return ok;
    }


    /** 
     * This class contains the methods that are available for use on
     * listblocks. You can access its methods in the variable
     * listblockMethodscourseList declared in the controller class
     * CourseDefaultController. 
     */
    public class ListblockMethodscourseList implements Comparator, Listblock {
        private CourseDefaultController controller;
        private Set roleNamesInUse = new HashSet();
        int[] lastSelectedLines = null;
        ListblockLine lastSelectedLine;
        private Boolean checkForeignNodes;

        /** 
         * Internal use.
         * @param c Internal use.
         */
        ListblockMethodscourseList(CourseDefaultController c) {
            controller = c;
            RoleObject roleObject = addRoleObject(Course.class, 
                    new RoleObject("Course2"));
            List args = new LinkedList();
               args.add(Course.class);
               roleNamesInUse.add("Course2");
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
                controller.view.courseListtheModel.fireTableDataChanged();
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
                    controller.view.courseList_table);
        }

        public int getLastRowLine() {
            return courseListgetRowCount(0)-1;
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
            controller.view.courseList_table.requestFocus();
        }

        public boolean hasFocus() {
            return controller.view.courseList_table.hasFocus();
        }

        public void setPopupMenu(String menuName) {
            view.activePopupMenucourseList = controller.getPopupMenu(menuName);
        }

        public int size() {
            return courseListNodeInfo.getVisualRowCount();
        }

        /** 
         * Creates a new empty listblock line.
         * @return The listblock line with empty fields.
         */
        public LineListblockcourseList createListblockLine() {
            LineListblockcourseList newLine = 
                    new LineListblockcourseList(controller);        
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
        public LineListblockcourseList createListblockLineFromEditFields() {
            LineListblockcourseList line = createListblockLine();
            List path = TypeTool.getDefaultList();
            path.add(theCourse2);
            Object Course2Obtained = theCourse2.recursiveObtain(path, true);
            Course Course2Single = null;
            if (Course2Obtained instanceof Set) {
                // The set only contains one instance of Course2
                Set Course2Set = (Set) Course2Obtained;
                Iterator it = Course2Set.iterator();
                if (it.hasNext()) {
                    Course2Single = (Course) it.next();
                }
            } else {
                Course2Single = (Course) Course2Obtained;
            }
            theCourse2.insertInListblockLine(Course2Single, line);
            return line;
        }

        public void makeRowVisible(int row) {
            if (view.courseList_table.getColumnCount() == 0 ||
                    view.courseList_table.getRowCount() == 0) {

                return;
            }
            if (row < 0 || row >= view.courseList_table.getRowCount()) {
                throw new IllegalArgumentException(String.valueOf(row));
            }

            Rectangle visible = view.courseList_table.getVisibleRect();
            Rectangle cell = view.courseList_table.getCellRect(row, 0, true);
            if (row == 0) {
                visible.y = 0;
                view.courseList_table.scrollRectToVisible(visible);
            } else if (cell.y < visible.y)  {
                visible.y = cell.y;
                view.courseList_table.scrollRectToVisible(visible);
            } else if (cell.y + cell.height > visible.y + visible.height) {
                visible.y = cell.y + cell.height - visible.height;
                view.courseList_table.scrollRectToVisible(visible);
            }

            view.courseList_table.validate();
        }

        public Set getRoleNamesInUse() {
            return roleNamesInUse;
        }

        public boolean callHooksBeforeInsert(ListblockLine line) {
            return hookListBlockcourseListBeforeInsert(line);
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
    * <li> Object of type Course with fieldName "id".
     * </ul>
     * This method does not use object selectors to pick which column
     * to use. 
     * @param row The row to use.
     * @param parent The object selection node that represent the object in the listblock.
     * @param fieldName The field name to use.
     */
     public void editField(int row, Object parent, String fieldName) {
         if(parent instanceof Course && fieldName.equals("code")) {
             view.courseList_table.editCellAt(row, view.courseList_indexes.indexOf(new Integer(0)));
         }
         if(parent instanceof Course && fieldName.equals("id")) {
             view.courseList_table.editCellAt(row, view.courseList_indexes.indexOf(new Integer(1)));
         }
         if(parent instanceof Course && fieldName.equals("name")) {
             view.courseList_table.editCellAt(row, view.courseList_indexes.indexOf(new Integer(2)));
         }
         if(parent instanceof Course && fieldName.equals("isActive")) {
             view.courseList_table.editCellAt(row, view.courseList_indexes.indexOf(new Integer(3)));
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
        if (view.courseList_table.getColumnCount() == 0)
            return;
        makeRowVisible(rowindex);
         if(parent.equals(controller.theCourse2) && fieldName.equals("code")) {
             columnindex = view.courseList_indexes.indexOf(new Integer(0));
         }
         if(parent.equals(controller.theCourse2) && fieldName.equals("id")) {
             columnindex = view.courseList_indexes.indexOf(new Integer(1));
         }
         if(parent.equals(controller.theCourse2) && fieldName.equals("name")) {
             columnindex = view.courseList_indexes.indexOf(new Integer(2));
         }
         if(parent.equals(controller.theCourse2) && fieldName.equals("isActive")) {
             columnindex = view.courseList_indexes.indexOf(new Integer(3));
         }
        view.courseList_table.changeSelection(rowindex, columnindex, false, false);
    }
    /** Makes a copy of a listblock line - note that the insert and
     *  replace methods uses this one, so the programmer do not need to
     * do so.
     * @param fromLine The source listblock line.
     * @param toLine The to listblock line.
     * @deprecated This method is no longer in use, and will be removed, when considered safe to do so.
     */
    public void copyListblockLinecourseList(LineListblockcourseList fromLine, LineListblockcourseList toLine) {
       toLine.copyStateFlags(fromLine);
        toLine.setCourse2 ( 
                                   new Course ()
                               ); 
        TypeTool.reflectCopyMethod(fromLine.newCourse2, "code",toLine.newCourse2);
        TypeTool.reflectCopyMethod(fromLine.newCourse2, "id",toLine.newCourse2);
        TypeTool.reflectCopyMethod(fromLine.newCourse2, "name",toLine.newCourse2);
        TypeTool.reflectCopyMethod(fromLine.newCourse2, "isActive",toLine.newCourse2);
    }
    /** Replaces a listblock line on position line.
     * @param data The listblock line to replace.
     * @param line The line number of the listblock line to replace.
     */
    public void replaceListblockLine(LineListblockcourseList data, int line) {
        view.block.increaseListblockcourseList();
        data.setLineNumber(line);
        data.markAsChanged();
        courseListNodeInfo.setLine(data,line);
        data.fromListblockLineToCells(false);
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged();       
        }
        view.block.decreaseListblockcourseList();
    }

        void listblockSortColumnsBy(int column) {
            view.block.increaseListblockcourseList();
            List selectedLines = listblockMethodscourseList.getSelectedLinesObject();
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
                    courseListNodeInfo.sort((Comparator) comparatorList.get(0));
                    setLineNumbers();
                    view.courseListtheModel.fireTableDataChanged();
                }
            }
            if (selectedLines != null) {
                Iterator it = selectedLines.iterator();
                int[] selection = new int[selectedLines.size()];
                int i = 0;
                while (it.hasNext()) {
                    selection[i++] = ((LineListblockcourseList) it.next()).getLineNumber();
                }
                listblockMethodscourseList.setSelectedLines(selection);
            }
            view.block.decreaseListblockcourseList();
        }

        void listblockSortColumnsBy(int column, boolean doConvert) {
            view.block.increaseListblockcourseList();
            LineListblockcourseList selected = getSelectedLineObject();
            switch (column) {
            case 0: 
                doConvert=true;
                break;
            case 1: 
                doConvert=false;
                break;
            case 2: 
                doConvert=true;
                break;
            case 3: 
                doConvert=true;
                break;
            }
            int convertedCol = doConvert ? ((Integer)controller.view.courseList_indexes.get(column)).intValue() : column;
            setColumnToUse(convertedCol, null);
            if(!controller.overrideSortListblock("courseList", courseListNodeInfo, convertedCol, (Boolean)directions.get(new Integer(convertedCol)))) {
                courseListNodeInfo.sort(this);
            }
            if(updateWhenManipulated) {
                view.courseListtheModel.fireTableDataChanged();
            }
            setLineNumbers();
            if(selected != null) {
                int line = selected.getLineNumber();
                setSelectedLine(line);
                makeRowVisible(line);
            }
            view.block.decreaseListblockcourseList();
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
            courseListNodeInfo.sort((Comparator) comparatorList.get(0));
            setLineNumbers();
            view.courseListtheModel.fireTableDataChanged();
        }
    }

    private List comparatorList;

    /**
     * Builds the list of comparators for the listblock
     */
    public void setupSort() {
        comparatorList = TypeTool.getDefaultList();
        int column = 0;

        class Comparator_Course2_code extends AbstractAttributeComparator {

            Comparator_Course2_code(int column) {
                super("Course2.code", column, 0+1000, 0);
            }

            public int compare(Object o1, Object o2) {
                LineListblockcourseList lineOne = (LineListblockcourseList) o1;
                LineListblockcourseList lineTwo = (LineListblockcourseList) o2;
                Course obj1 = lineOne.getCourse2(false);
                Course obj2 = lineTwo.getCourse2(false);

                Object val1 = obj1 != null ? TypeTool.toObject(obj1.getCode()) : null;
                Object val2 = obj2 != null ? TypeTool.toObject(obj2.getCode()) : null;
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
        comparatorList.add(new Comparator_Course2_code(column));
        ++column;

        class Comparator_Course2_name extends AbstractAttributeComparator {

            Comparator_Course2_name(int column) {
                super("Course2.name", column, 1+1000, 0);
            }

            public int compare(Object o1, Object o2) {
                LineListblockcourseList lineOne = (LineListblockcourseList) o1;
                LineListblockcourseList lineTwo = (LineListblockcourseList) o2;
                Course obj1 = lineOne.getCourse2(false);
                Course obj2 = lineTwo.getCourse2(false);

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
        comparatorList.add(new Comparator_Course2_name(column));
        ++column;

        class Comparator_Course2_isActive extends AbstractAttributeComparator {

            Comparator_Course2_isActive(int column) {
                super("Course2.isActive", column, 2+1000, 0);
            }

            public int compare(Object o1, Object o2) {
                LineListblockcourseList lineOne = (LineListblockcourseList) o1;
                LineListblockcourseList lineTwo = (LineListblockcourseList) o2;
                Course obj1 = lineOne.getCourse2(false);
                Course obj2 = lineTwo.getCourse2(false);

                Object val1 = obj1 != null ? TypeTool.toObject(obj1.getIsActive()) : null;
                Object val2 = obj2 != null ? TypeTool.toObject(obj2.getIsActive()) : null;
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
        comparatorList.add(new Comparator_Course2_isActive(column));
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
* <li> Object of type Course with attribute "id".
* <li> Object of type Course with attribute "id".
     * </ul>
     * @param type The object selection node to use.
     * @param attribute The attribute to sort.
     * @deprecated
     */
    public void listblockSortColumn(Object type, String attribute) {
    if(type instanceof Course && attribute.equals("code")) {
        listblockSortColumnsBy(0, false);
        return;
    }
    if(type instanceof Course && attribute.equals("id")) {
        listblockSortColumnsBy(1, false);
        return;
    }
    if(type instanceof Course && attribute.equals("name")) {
        listblockSortColumnsBy(2, false);
        return;
    }
    if(type instanceof Course && attribute.equals("isActive")) {
        listblockSortColumnsBy(3, false);
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
    if(type instanceof Course && attribute.equals("code")) {
        if(ascending) {
            setColumnToUse(0, Boolean.TRUE);
        } else {
            setColumnToUse(0, Boolean.FALSE);
        }
        listblockSortColumnsBy(0, false);
        return;
    }
    if(type instanceof Course && attribute.equals("id")) {
        if(ascending) {
            setColumnToUse(1, Boolean.TRUE);
        } else {
            setColumnToUse(1, Boolean.FALSE);
        }
        listblockSortColumnsBy(1, false);
        return;
    }
    if(type instanceof Course && attribute.equals("name")) {
        if(ascending) {
            setColumnToUse(2, Boolean.TRUE);
        } else {
            setColumnToUse(2, Boolean.FALSE);
        }
        listblockSortColumnsBy(2, false);
        return;
    }
    if(type instanceof Course && attribute.equals("isActive")) {
        if(ascending) {
            setColumnToUse(3, Boolean.TRUE);
        } else {
            setColumnToUse(3, Boolean.FALSE);
        }
        listblockSortColumnsBy(3, false);
        return;
    }
     }
    /** Inserts a set of domain objects into the listblock of name courseList.
     * @return the created listblock line.
 * @param pCourse2 the Course2 domain object 
     */
    public LineListblockcourseList insert(
            Course pCourse2
            ) {
        return insert(
                pCourse2,
                size());
    }

    /** Inserts empty line at end of listblock courseList.
     * @return the inserted listblock line.
     */
    public LineListblockcourseList insert() {
        return insert(size());
    }
    /** Inserts empty line at given line of listblock courseList.
     * @param line The line number to use.
     * @return The newly created listblock line.
     */
    public LineListblockcourseList insert(int line) {
        LineListblockcourseList newLine = createListblockLine();
        insertListblockLine(newLine, line);
        setSelectedLine(newLine);
        return newLine;
    }
    /** Inserts domain objects into the listblock at the specified line.
     *  courseList.
     * @param lineNumber line to insert.
 * @param pCourse2 the Course2 domain object 
     * @return The newly created listblock line.
     */
    public LineListblockcourseList insert(
                Course pCourse2,
                int lineNumber) {
        LineListblockcourseList newLine = createListblockLine();
        newLine.setCourse2(pCourse2); 
        insertListblockLine(newLine, lineNumber);
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged();
            makeRowVisible(lineNumber);
        }
        return newLine;
    }

    /** Inserts a set of domain objects into the listblock of name
     *  courseList at a given line.
     * @param lInEnUmBer The line number to replace.
 * @param pCourse2 the Course2 domain object 
     */
    public void replaceLineListblock(
         Course pCourse2
                               ,int lInEnUmBer
                                       ) {
        view.block.increaseListblockcourseList();
        LineListblockcourseList newLine = getListblockLinePrivate(lInEnUmBer);
         newLine.setCourse2 ( pCourse2 );
        newLine.setLineNumber(lInEnUmBer);
        newLine.markAsChanged();
        courseListNodeInfo.setLine(newLine, lInEnUmBer);
        newLine.fromListblockLineToCells(false);
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged();
        }
        view.block.decreaseListblockcourseList();
    }

    /** Marks a line in listblock courseList as deleted.
     * @param line The row to delete.
     */
    public void deleteListblockLine(int line) {
        view.block.increaseListblockcourseList();
        ((LineListblockcourseList)courseListNodeInfo.getLine(line)).markAsDeleted();
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged();
        }
        int linesInView=courseListgetRowCount(0);
        if (linesInView > 0){
            if (line >= linesInView)        
                setSelectedLine(linesInView -1);
            else
                setSelectedLine(line);
        }
        view.block.decreaseListblockcourseList();
    }
    /** Marks a set of lines in listblock courseList as deleted.
     * @param lines The rows to delete.
     */
    public void deleteListblockLine(int lines[]) {
        view.block.increaseListblockcourseList();
        for(int i=lines.length;i-- > 0;) {
            ((LineListblockcourseList)courseListNodeInfo.getLine(lines[i])).markAsDeleted();
        }
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged();
        }
        view.block.decreaseListblockcourseList();
    }

    /**
     * Inserts a Listblock line object into the listblock.
     * @param data The listblock line to insert
     */
    public void insertNewListblockLine(ListblockLine data) {
        insertListblockLine((LineListblockcourseList) data);
    }
    private void insertListblockLineEDT(final LineListblockcourseList data) {
        Runnable task = new Runnable() {
            public void run() {
                insertListblockLine(data);
            }
        };
        edt(task, "insertListblockLine");
    }
    /** Inserts a Listblock line object into the listblock courseList. 
     * @param data The listblock line to insert.
     */
    public void insertListblockLine(LineListblockcourseList data) {
        if (!SwingUtilities.isEventDispatchThread()) {
            insertListblockLineEDT(data);
            return;
        }
        view.block.increaseListblockcourseList();
        data.setLineNumber(courseListNodeInfo.size());
        courseListNodeInfo.addLine(data);
        data.markAsNew();
        data.fromListblockLineToCells(false);
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged();       
        }
        view.block.decreaseListblockcourseList();
    } 
    private void insertListblockLineEDT(final LineListblockcourseList data, final int line) {
        Runnable task = new Runnable() {
            public void run() {
                insertListblockLine(data, line);
            }
        };
        edt(task, "insertListblockLine");
    }
    /** Inserts a Listblock line object into the listblock courseList at a given line.
     * @param data The listblock line to insert.
     * @param line The line number to insert line at.
     */
    public void insertListblockLine(LineListblockcourseList data, int line) {
        view.block.increaseListblockcourseList();
        data.setLineNumber(line);
        courseListNodeInfo.addLine(data, line);
        data.markAsNew();
        data.fromListblockLineToCells(false);
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged();       
        }
        view.block.decreaseListblockcourseList();
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

    /** Adds a list of listblock line to the listblock courseList 
     * @param data List of LineListblockcourseListobjects.
     */
    public void insertListblockLines(List data) {
        if (!SwingUtilities.isEventDispatchThread()) {
            insertListblockLinesEDT(data);
            return;
        }
        for(Iterator it = data.iterator(); it.hasNext();) {
            insertListblockLine((LineListblockcourseList)it.next());
        }
    }
    /** Inserts a Listblock line object into the listblock courseList at the
     *  first line in the listblock.
     * @param data the listblock line.
     */
    public void insertListblockLineFirstcourseList(LineListblockcourseList data) {
        insertListblockLine(data,0);
    }
    /** Removes all lines from the listblock courseList. */
    public void purgeAllLines() {
        view.block.increaseListblockcourseList();
        clearSelectedLines();
        courseListNodeInfo.clearLines();
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged(); 
        }
        lastSelectedLines = null;
        view.block.decreaseListblockcourseList();
    }
    private void renumberLines() {
        Vector v = courseListNodeInfo.allLines();
        int n = 0;
        for(Iterator i = v.iterator();i.hasNext();) {
            LineListblockcourseList line = (LineListblockcourseList)i.next();
            line.setLineNumber(n++);
        }
    }
    /** Removes a given set of lines from the listblock courseList.
     * @param lines The rows to purge.
     */
    public void purgeLine(int lines[]) {
        if(lines == null || lines.length == 0) {
            return;
        }
        view.block.increaseListblockcourseList();
        courseListNodeInfo.clearLines(lines);
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged(); 
        }
        lastSelectedLines = null;
        renumberLines();
        view.block.decreaseListblockcourseList();
    }
    /** Removes a given line from the listblock courseList. 
     *  @param line the line number to remove.
     */
    public void purgeLine(int line) {
        view.block.increaseListblockcourseList();
        courseListNodeInfo.clearLine(line);
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged(); 
        }
        lastSelectedLines = null;
        renumberLines();
        view.block.decreaseListblockcourseList();
    }
    /** Removes a given list of listblocklines, based on their linenumbers. 
     * @param lines List of LineListblockcourseList objects to purge.
     */
    public void purgeLines(List lines) {
        if(lines == null) {
            return;
        }
        view.block.increaseListblockcourseList();
        int[] delLines = new int[lines.size()];
        int pos = 0;
        for(Iterator i = lines.iterator();i.hasNext();) {
             LineListblockcourseList enName = (LineListblockcourseList)i.next();
             delLines[pos++] = enName.getLineNumber();
        }
        purgeLine(delLines);
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged(); 
        }
        lastSelectedLines = null;
        renumberLines();
        view.block.decreaseListblockcourseList();
    }

    /** Moves a line in the listblock from position <it>from</it> to
     * <it>to</it>.  
     * @param from The source row.
     * @param to The target row.
     */
    public void moveLine(int from, int to) {
        view.block.increaseListblockcourseList();
        courseListNodeInfo.moveElement(from,to);
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged(); 
        }
        renumberLines();
        view.block.decreaseListblockcourseList();
     }
    /** Moves the lines described in the fromRange array into the
     * position <it>to</it>. The first line are added to the first
     * position at to, the second at the second place and so on.
     * @param fromLines Moes these lines...
     * @param toLine Target line.
     */
    public void moveLine(int fromLines[], int toLine) {
        view.block.increaseListblockcourseList();
        for(int i=fromLines.length;i-- > 0;) {
            courseListNodeInfo.moveElement(fromLines[i], toLine);
        }
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged(); 
        }
        renumberLines();
        view.block.decreaseListblockcourseList();
    }
    /** Marks all lines in the listblock courseListas not new, not changed and not deleted. Also copies data from new to old. 
     * @deprecated use 
     */
    public void reset() {
        view.block.increaseListblockcourseList();
        for(Enumeration e = courseListNodeInfo.elements();e.hasMoreElements();) {
            ((LineListblockcourseList)e.nextElement()).reset();
        }
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged(); 
        }
        view.block.decreaseListblockcourseList();
    }
    /** Marks all lines as not deleted, changed or new, without copying of
        old data */
    public void forceClean() {
        view.block.increaseListblockcourseList();
        for(Enumeration e = courseListNodeInfo.elements();e.hasMoreElements();) {
            ((LineListblockcourseList)e.nextElement()).forceClean();
        }
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged(); 
        }
        view.block.decreaseListblockcourseList();
    }
    /** Mark line in the listblock courseListas not new, not changed and
     * not deleted. Also copies data from new to old. 
     * @param line The line to reset.
     */
    public void reset(int line) {
        view.block.increaseListblockcourseList();
        getListblockLinePrivateModel(line).reset();
        if(updateWhenManipulated) {
            view.courseListtheModel.fireTableDataChanged(); 
        }
        view.block.decreaseListblockcourseList();
    }
    /** Signals that all edit fields should stop editing. This will
     * copy data beeing edited into the listblock line. */
    public void stopEditing() {
        if(view.courseListblockStopEditing > 0) {
            return;
        }
        view.courseListblockStopEditing++;
        int row = view.courseList_table.getEditingRow();
        if(row < 0) {
            return;
        }
      view.courseList_indexes.indexOf(new Integer(0));
      if(view.courseList_indexes.indexOf(new Integer(0)) == view.courseList_table.getEditingColumn()) {
          Object editor = view.courseList_table.getCellEditor(row, view.courseList_indexes.indexOf(new Integer(0)));
          // Denne tok jeg ut:  && ((DefaultCellEditor)editor).getComponent().hasFocus()
          if(editor instanceof DefaultCellEditor) {
              DefaultCellEditor dceTmp = (DefaultCellEditor)editor;
              if(dceTmp.getCellEditorValue() != null) {
                  try {
                      dceTmp.stopCellEditing();
                  }
                  catch(Throwable t) {/* IGNORED*/}
              }
          }
          // Denne tok jeg ut: && ((JComponentCellEditor)editor).getComponent().hasFocus()
          else if(editor instanceof JComponentCellEditor) {
              if(((JComponentCellEditor)editor).getComponent() != null) {
                  try {
                      ((JComponentCellEditor)editor).stopCellEditing();
                  }
                  catch(Throwable t) {/* IGNORED*/}
              }
          }
      }
      view.courseList_indexes.indexOf(new Integer(2));
      if(view.courseList_indexes.indexOf(new Integer(2)) == view.courseList_table.getEditingColumn()) {
          Object editor = view.courseList_table.getCellEditor(row, view.courseList_indexes.indexOf(new Integer(2)));
          // Denne tok jeg ut:  && ((DefaultCellEditor)editor).getComponent().hasFocus()
          if(editor instanceof DefaultCellEditor) {
              DefaultCellEditor dceTmp = (DefaultCellEditor)editor;
              if(dceTmp.getCellEditorValue() != null) {
                  try {
                      dceTmp.stopCellEditing();
                  }
                  catch(Throwable t) {/* IGNORED*/}
              }
          }
          // Denne tok jeg ut: && ((JComponentCellEditor)editor).getComponent().hasFocus()
          else if(editor instanceof JComponentCellEditor) {
              if(((JComponentCellEditor)editor).getComponent() != null) {
                  try {
                      ((JComponentCellEditor)editor).stopCellEditing();
                  }
                  catch(Throwable t) {/* IGNORED*/}
              }
          }
      }
      view.courseList_indexes.indexOf(new Integer(3));
      if(view.courseList_indexes.indexOf(new Integer(3)) == view.courseList_table.getEditingColumn()) {
          Object editor = view.courseList_table.getCellEditor(row, view.courseList_indexes.indexOf(new Integer(3)));
          // Denne tok jeg ut:  && ((DefaultCellEditor)editor).getComponent().hasFocus()
          if(editor instanceof DefaultCellEditor) {
              DefaultCellEditor dceTmp = (DefaultCellEditor)editor;
              if(dceTmp.getCellEditorValue() != null) {
                  try {
                      dceTmp.stopCellEditing();
                  }
                  catch(Throwable t) {/* IGNORED*/}
              }
          }
          // Denne tok jeg ut: && ((JComponentCellEditor)editor).getComponent().hasFocus()
          else if(editor instanceof JComponentCellEditor) {
              if(((JComponentCellEditor)editor).getComponent() != null) {
                  try {
                      ((JComponentCellEditor)editor).stopCellEditing();
                  }
                  catch(Throwable t) {/* IGNORED*/}
              }
          }
      }
        view.courseListblockStopEditing--;
    }
     public List getChangedLines() {
        view.block.increaseListblockcourseList();
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
        view.block.decreaseListblockcourseList();
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
     * See method changedLinescourseList() for retrieveing changed lines.
     * @return List of LineListblockcourseListobjects.
     */
    public List insertedLines() {
        view.block.increaseListblockcourseList();
        if(courseListNodeInfo.size() > 0) {
            stopEditing();
        }
        Vector ret = new Vector();
        for(Enumeration e = courseListNodeInfo.elements();e.hasMoreElements();) {
            LineListblockcourseList one = ((LineListblockcourseList)e.nextElement());
            if(one.isNew()) {
                ret.add(one);
            }
        }
        if(ret.size() == 0) {
            ret = null;
        }
        view.block.decreaseListblockcourseList();
        return ret;
    }
 /** Returns a list of lines that has been deleted sinze
  *  initialization or reset from the listblock with name courseList.
  *  @return A list of the deleted lines in the listblock. The elements are LineListblockcourseListobjects.
  */
    public List deletedLines() {
        view.block.increaseListblockcourseList();
        if(courseListNodeInfo.size() > 0) {
            stopEditing();
        }
        Vector ret = new Vector();
        for(Enumeration e = courseListNodeInfo.elements();e.hasMoreElements();) {
            LineListblockcourseList one = ((LineListblockcourseList)e.nextElement());
            if(one.isDeleted()) {
                ret.add(one);
            }
        }
        if(ret.size() == 0) {
            ret = null;
        }
        view.block.decreaseListblockcourseList();
        return ret;
    }
/** Returns true if there is any new lines in this listblock 
 * @return True if new lines are added, false if not.
 */
    public boolean hasNewLines() {
        view.block.increaseListblockcourseList();
        if(courseListNodeInfo.size() > 0) {
            stopEditing();
        }
        try {
            for(Enumeration e = courseListNodeInfo.elements();e.hasMoreElements();) {
                LineListblockcourseList one = ((LineListblockcourseList)e.nextElement());
                if(one.isNew()) {
                    return true;
                }
            }
            return false;
        } finally {
            view.block.decreaseListblockcourseList();
        }
    }
/** Returns a list of lines that is new sinze
 *  initialization or reset from the listblock with name courseList.
 * @return List of LineListblockcourseList objects.
 */
    public List newLines() {
        view.block.increaseListblockcourseList();
        if(courseListNodeInfo.size() > 0) {
            stopEditing();
        }
        LinkedList ret = new LinkedList();
        for(Enumeration e = courseListNodeInfo.elements();e.hasMoreElements();) {
            LineListblockcourseList one = ((LineListblockcourseList)e.nextElement());
            if(one.isNew()) {
                ret.add(one);
            }
        }
        if(ret.size() == 0) {
            ret = null;
        }
        view.block.decreaseListblockcourseList();
        return ret;
    }
/** Returns a list of lines that hasn't been manipulated sinze
 *  initialization or reset from the listblock with name
 *  courseList. (Not new, deleted or changed)
 * @return List of LineListblockcourseList objects.
 */
    public List cleanLines() {
        view.block.increaseListblockcourseList();
        if(courseListNodeInfo.size() > 0) {
            stopEditing();
        }
        Vector ret = new Vector();
        for(Enumeration e = courseListNodeInfo.elements();e.hasMoreElements();) {
            LineListblockcourseList one = ((LineListblockcourseList)e.nextElement());
            if(!one.isNew() && !one.isDeleted() && !one.isChanged()) {
                ret.add(one);
            }
        }
        if(ret.size() == 0) {
            ret = null;
        }
        view.block.decreaseListblockcourseList();
        return ret;
    }
    /** Returns all touched lines (new, deleted or changed) in the listblock. 
     * @return List of LineListblockcourseList objects.
     */
    public List touchedLines() {
        view.block.increaseListblockcourseList();
        Vector ret = new Vector();
        if(courseListNodeInfo.size() > 0) {
            stopEditing();
        }
        for(Enumeration e = courseListNodeInfo.elements();e.hasMoreElements();) {
            LineListblockcourseList one = ((LineListblockcourseList)e.nextElement());
            if(one.isNew() || one.isDeleted() || one.isChanged()) {
                ret.add(one);
            }
        }
        if(ret.size() == 0) {
            ret = null;
        }
        view.block.decreaseListblockcourseList();
        return ret;
    }
    /** Returns all lines in the listblock.
     * @return List of LineListblockcourseList objects.
     */
    public List allLines() {
        List retVal;
        view.block.increaseListblockcourseList();
        if(courseListNodeInfo.size() > 0) {
            stopEditing();
        }
        retVal = courseListNodeInfo.allLines();
        view.block.decreaseListblockcourseList();
        return retVal;
    }

    /**
     * Returns one line from the listblock courseList.
     * @param line The row in the listblock.
     * @return The listblockline object.
     */
    public LineListblockcourseList getListblockLineModel(int line) {
        LineListblockcourseList retVal;
        view.block.increaseListblockcourseList();
        stopEditing();
        retVal = getListblockLinePrivateModel(line);
        view.block.decreaseListblockcourseList();
        return retVal;
    }

    /**
     * Returns one line from the listblock courseList.
     * @param line The row in the listblock.
     * @return The listblockline object.
     */
    public LineListblockcourseList getListblockLine(int line) {
        LineListblockcourseList retVal;
        view.block.increaseListblockcourseList();
        stopEditing();
        retVal = getListblockLinePrivate(line);
        view.block.decreaseListblockcourseList();
        return retVal;
    }

    public ListblockLine getLine(int rowIndex) {
        return getListblockLine(rowIndex);
    }

    LineListblockcourseList getListblockLinePrivateModel(int line) {
        try {
            return (LineListblockcourseList)courseListNodeInfo.getLine(line);
        }
        catch(Exception e) {
            return null;
        }
    }

    LineListblockcourseList getListblockLinePrivate(int line) {
        try {
            return (LineListblockcourseList)courseListNodeInfo.getLine(line);
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
            LineListblockcourseList currLine = (LineListblockcourseList) it.next();
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
        for(Enumeration i = courseListNodeInfo.elements();i.hasMoreElements();) {
            LineListblockcourseList one = (LineListblockcourseList)i.nextElement();
            one.setLineNumber(j++);
        }
    }

/** If you want the selection in the listblock to have background color (white) while in the selection, you should call this with true. It defaults to false in the templates. If you want to change this, set the defaultSelectedBackgroundName variable to true;
    @param x ...
*/
    public void setShowSingleSelection(boolean x) {
        view.hasCellSelectionColorcourseList = x;
    }

    /** Returns the position of selected line in listblock courseList.
     * @return The row number of the line.
     */
    public int getSelectedLine() {
        if(view.courseList_table == null) {
            return -1;
        }
        return view.courseList_table.getSelectedRow();
    }

    /** Returns a list of indexes of selected lines in listblock courseList.
     * @return The selected rows.
     */
    public int[] getSelectedLines() {
        return view.courseList_table.getSelectedRows();
    }

    /** Returns listblock line object of selected line in listblock courseList.
     * @return The selected line object.
     */
    public LineListblockcourseList getSelectedLineObject() {
        view.block.increaseListblockcourseList();
        int pos = view.courseList_table.getSelectedRow();
        LineListblockcourseList retVal = null;
        if(pos >= 0) {
            if(courseListNodeInfo.getVisualRowCount() > 0) {
                stopEditing();
                retVal = (LineListblockcourseList)courseListNodeInfo.getLine(pos);
            }
        }
        view.block.decreaseListblockcourseList();
        return retVal;
    }

    /** Returns a list of listblock line object of selected
     *  lines in listblock courseList. 
     * @return A list of objects of type LineListblockcourseList if any matches, null otherwise.
     */
    public List getSelectedLinesObject() {
        view.block.increaseListblockcourseList();
        Vector ret = new Vector();
        int selected[] = view.courseList_table.getSelectedRows();
        if(selected.length == 0) {
            view.block.decreaseListblockcourseList();
            return null;
        }
        for(int i=0; i < selected.length; i++) {
            ret.add(courseListNodeInfo.getLine(selected[i]));
        }
        view.block.decreaseListblockcourseList();
        return ret;
    }

    /** Clears selected lines in listblock courseList. If it contains no
        lines, the call does nothing. */
    public void clearSelectedLines() {
        view.block.increaseListblockcourseList();
        lastSelectedLines = null;
        if(view.courseList_table.getRowCount() > 0) {
            view.courseList_table.clearSelection();
        }
        view.block.decreaseListblockcourseList();
    }

    /** Selects line in listblock courseList.
     * @param line The row to select.
     */
    public void setSelectedLine(int line) {
        view.block.increaseListblockcourseList();
        clearSelectedLines();
        view.courseList_table.setRowSelectionInterval(line,line);
        lastSelectedLines = view.courseList_table.getSelectedRows();
        makeRowVisible(line);
        view.block.decreaseListblockcourseList();
    }

    public void setSelectedLine(ListblockLine aLine) {
        int lineNumber = getLineNumber(aLine);
        if (lineNumber > -1) {
            setSelectedLine(lineNumber);
        }
    }

    public GenovaTable getTable() {
        return controller.view.courseList_table;
    }

    /** Selects a set of lines in listblock courseList.
     * @param lines The rows to select.
     */
    public void setSelectedLines(int lines[]) {
        view.block.increaseListblockcourseList();
        clearSelectedLines();
        for(int i=0; i < lines.length;i++) {
            view.courseList_table.addRowSelectionInterval(lines[i],lines[i]);
        }
        lastSelectedLines = view.courseList_table.getSelectedRows();
        view.block.decreaseListblockcourseList();
    }

    /**
     * Recursivly clears the edit fields of this table. First, 
     * the Course2 role and all it's members are cleared. Then
     * nodes that are not part of the object selection tree starting 
     * at the Course2 node is cleared.
     */
    public void clearEditFields() {
        Set stillToClear = new HashSet();
        stillToClear.addAll(getRoleNamesInUse());
        theCourse2.clear();
        stillToClear.remove(theCourse2.getRoleName());
        ClearTool ct = new ClearTool(roleObjects);
        ct.clearMembers("Course2");
        stillToClear.removeAll(theCourse2.getAllChildNames());
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
                 return TypeTool.compareTo(((LineListblockcourseList)o1).newCourse2.getCode(),((LineListblockcourseList)o2).newCourse2.getCode());
              }
              return TypeTool.compareTo(((LineListblockcourseList)o2).newCourse2.getCode(),((LineListblockcourseList)o1).newCourse2.getCode());
           case 1:
              if(directions.get(new Integer(1)) == Boolean.FALSE) {
                 return TypeTool.compareTo(((LineListblockcourseList)o1).newCourse2.getId(),((LineListblockcourseList)o2).newCourse2.getId());
              }
              return TypeTool.compareTo(((LineListblockcourseList)o2).newCourse2.getId(),((LineListblockcourseList)o1).newCourse2.getId());
           case 2:
              if(directions.get(new Integer(2)) == Boolean.FALSE) {
                 return TypeTool.compareTo(((LineListblockcourseList)o1).newCourse2.getName(),((LineListblockcourseList)o2).newCourse2.getName());
              }
              return TypeTool.compareTo(((LineListblockcourseList)o2).newCourse2.getName(),((LineListblockcourseList)o1).newCourse2.getName());
           case 3:
              if(directions.get(new Integer(3)) == Boolean.FALSE) {
                 return TypeTool.compareTo(((LineListblockcourseList)o1).newCourse2.getIsActive(),((LineListblockcourseList)o2).newCourse2.getIsActive());
              }
              return TypeTool.compareTo(((LineListblockcourseList)o2).newCourse2.getIsActive(),((LineListblockcourseList)o1).newCourse2.getIsActive());
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
        if (!(obj instanceof ListblockMethodscourseList)) {
            return false;
        }
        ListblockMethodscourseList other = (ListblockMethodscourseList) obj;
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
        if ("Course2.code".equals(ident)) {
            return true;
        }
        if ("Course2.name".equals(ident)) {
            return true;
        }
        if ("Course2.isActive".equals(ident)) {
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
        if ("Course2.code".equals(attributeName)) {
            return colIndex;
        }
        colIndex++;
        if ("Course2.name".equals(attributeName)) {
            return colIndex;
        }
        colIndex++;
        if ("Course2.isActive".equals(attributeName)) {
            return colIndex;
        }
        colIndex++;
        // Column not found. log and throw exception
        Object[] msgArgs = {"courseList", attributeName};
        Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.NO_SUCH_COLUMN, msgArgs);
        MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
        throw new GenovaClientException(msg);
    }
   } // End of collection class for listblock courseList.
    /** The controller class for the listblock, and the entry point for
     * using the listblock courseList. 
     */
    public ListblockMethodscourseList listblockMethodscourseList = new ListblockMethodscourseList(this);
    
    /* Her kommer generert kode for Listblock:ListblockLineClassController*/
    
    /** RT information about the listblock */
    protected NodeInfoList courseListNodeInfo = new NodeInfoList();
    
    
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
    /** 
     * Generated event-action method, invoked from the framework.
     * This method is normally invoked on the EDT, and creates invokes 
     * <code>closeCourse()</code> asynchronous on a dedicated thread.
     * 
     *  <p><strong>Normally, developers should not invoke this method - use 
     * <code>closeCourse()</code> instead.</strong>
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
    public void closeCourse(final GenovaEventHolder e) throws RuntimeException { 
        Runnable task = new Runnable() {
                public void run() {
                    blockDialog();
                    boolean setLastEx = true;
                    try {
                        if (hookcloseCourseBefore(e)) {
                            setLastEx = false;
                            closeCourse();
                        } else {
                            setLastEx = false;
                        }
                        hookcloseCourseAfter(e);
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
     * <code>closeCourse(GenovaEventHolder)</code>. Override this
     * method if you want to performe some additional tasks. 
     *
     *
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void closeCourse() throws RuntimeException { 
            actionCloseCourse(); 
    }
    /** 
     * Generated event-action method, invoked from the framework.
     * This method is normally invoked on the EDT, and creates invokes 
     * <code>findAll()</code> asynchronous on a dedicated thread.
     * 
     *  <p><strong>Normally, developers should not invoke this method - use 
     * <code>findAll()</code> instead.</strong>
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
    public void findAll(final GenovaEventHolder e) throws RuntimeException { 
        // Noe p� server
        Runnable task = new Runnable() {
                public void run() {
                    blockDialog();
                    boolean setLastEx = true;
                    try {
                        if (hookfindAllBefore(e)) {
                            setLastEx = false;
                            findAll();
                        } else {
                            setLastEx = false;
                        }
                        hookfindAllAfter(e);
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
     * <code>findAll(GenovaEventHolder)</code>. Override this
     * method if you want to performe some additional tasks. 
     *
     *
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void findAll() throws RuntimeException { 
            actionFindAllCourse2(); 
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
     * Hook method, called if the action resulted in a RuntimeException. 
     * Override in subclass.
     * @param e the catched exception 
     * @return <code>false</code> the hook has handeled the exception, and no further action is needed.
     */
    public boolean hookActionCloseCourseException(RuntimeException e) {
        return true;
    }


    /**
     * Hook method, called if the action resulted in a RuntimeException.
     * Override in subclass.
     *
     * <p>If the exception is handeled in this hook, the hook should return
     * <code>false</code>. If the hook returns <code>true</code> the 
     * exception will be re-thrown from the invoking 
     * <code>actionFindAllCourse2()</code> method.
     * <br>The default return value is <code>true</code>.
     * @param e the catched exception 
     * @return <code>false</code> if exception is handeled, 
     *         <code>true</code> if exception should be re-thrown.
     */
    public boolean hookActionFindAllCourse2Exception(RuntimeException e) {
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
    public boolean hookActionFindAllCourse2Obtain(ObjectSelection objectSelection) {
        return true;
    }


    /**
     * Hook method, called before server action is called. The returned ClientContext is used 
     * when calling the server. If <code>null</code> is returned, 
     * the Application.getClientContext() is used.
     * <p>Override in subclass.
     * @return the ClientContext that will be used as argument to the server action.
     */
    public ClientContext hookActionFindAllCourse2ClientContext() {
        return null;
    }


    /**
     * Hook method, called before the found object in findAll is 
     * displayed. The boolean return value is used to determine if the foundObject
     * should be displayed (defaults to <code>true</code>.
     * <p>Override in subclass! 
     * @param foundObject the object returned from the server action find on target Course2
     * @return <code>true</code> if the object should be displayed.
     */
    public boolean hookActionFindAllCourse2Display(Object foundObject) {
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
     * Hook method, invoked as part of "checkSave" on Course2.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course2 and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course2 is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course2 is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookCourse2CheckSave() {
        return hookCheckSaveCourse2() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookCourse2CheckSave instead.</strong>
     * Hook method, called as part of "check save" on 
     * Course2. Override in subclass!
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
     * @see #hookCourse2CheckSave()
     */
    public boolean hookCheckSaveCourse2() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkFind" on Course2.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course2 and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course2 is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course2 is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookCourse2CheckFind() {
        return hookCheckFindCourse2() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookCourse2CheckFind instead.</strong>
     * Hook method, called as part of "check find" on Course2. Override in subclass!
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
     * @see #hookCourse2CheckFind()
     */
    public boolean hookCheckFindCourse2() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkClose" on Course2.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course2 and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course2 is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course2 is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookCourse2CheckClose() {
        return hookCheckCloseCourse2() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookCourse2CheckClose instead.</strong>
     * Hook method, called as part of "check close" on Course2. Override in subclass!
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
     * @see #hookCourse2CheckClose()
     */
    public boolean hookCheckCloseCourse2() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkDelete" on Course2.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course2 and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course2 is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course2 is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookCourse2CheckDelete() {
        return hookCheckDeleteCourse2() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookCourse2CheckDelete instead.</strong>
     * Hook method, called as part of "check delete" on Course2. Override in subclass!
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
     * @see #hookCourse2CheckDelete()
     */
    public boolean hookCheckDeleteCourse2() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkPrint" on Course2.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course2 and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course2 is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course2 is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookCourse2CheckPrint() {
        return hookCheckPrintCourse2() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookCourse2CheckPrint instead.</strong>
     * Hook method, called as part of "check print" on Course2. Override in subclass!
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
     * @see #hookCourse2CheckPrint()
     */
    public boolean hookCheckPrintCourse2() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkClear" on Course2.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course2 and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course2 is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course2 is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookCourse2CheckClear() {
        return hookCheckClearCourse2() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookCourse2CheckClear instead.</strong>
     * Hook method, called as part of "check clear" on Course2. Override in subclass!
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
     * @see #hookCourse2CheckClear()
     */
    public boolean hookCheckClearCourse2() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkChange" on Course2.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course2 and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course2 is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course2 is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookCourse2CheckChange() {
        return hookCheckChangeCourse2() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookCourse2CheckChange instead.</strong>
     * Hook method, called as part of "check change" on Course2. Override in subclass!
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
     * @see #hookCourse2CheckChange()
     */
    public boolean hookCheckChangeCourse2() {
        return true;
    }
    /**
     * Hook method, invoked as part of "check row select" on Course2.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Course2 and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Course2 is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Course2 is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @param oldSelection the current selected line
     * @param newSelection the line about to be selected
     * @return a ECheckResult 
     */
     public ECheckResult hookCourse2CheckRowSelect
                (int oldSelection, int newSelection) {
        return hookCheckRowSelectCourse2(oldSelection, newSelection) ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /** 
     * <strong>The use of this method is discouraged. Override
     * hookCourse2CheckRowSelect instead.</strong>
     * Hook method, called as part of "check row selection" on Course2. Override in subclass!
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
     * @see #hookCourse2CheckRowSelect(int, int)
     */
    public boolean hookCheckRowSelectCourse2(int currentSelection, 
            int newSelection) {
        return true;
    }





   /**
    * Hook method, override in subclass.
    * @param line the ListblockLine to be inserted in the listblock.
    * @return <code>true</code> if the line should be inserted.
    */
    public boolean hookListBlockcourseListBeforeInsert(ListblockLine line) {
        return true;
    }
    /**
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     * @return true if the rest of the actions are to be execuded.
     */
    public boolean hookcloseCourseBefore(GenovaEventHolder e) {
        return true;
    }
    /**
     * 
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     */
    public void hookcloseCourseAfter(GenovaEventHolder e) {
        // empty method overridden in subclass
    }
    /**
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     * @return true if the rest of the actions are to be execuded.
     */
    public boolean hookfindAllBefore(GenovaEventHolder e) {
        return true;
    }
    /**
     * 
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     */
    public void hookfindAllAfter(GenovaEventHolder e) {
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
    /** The nunber of columns.
     * @return The number of columns.
     */
    public int courseListgetColumnCount() {
        return view.courseList_headers.size();
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

    public int courseListgetRowCount(int rowcount) {
        if(false) {
            rowcount++;
        }
        return courseListNodeInfo.getVisualRowCount();
    }

    /** Not in use.
     * @param row number of row
     * @param col number of column
     * @param value the value object
     * @return the value object
     * @deprecated
     */
    public Object courseListgetValueAt(int row, int col, Object value) {
       return value;
    }

    /** Not in use.
     * @param value the value
     * @param row number of row
     * @param col number of column
     * @deprecated
     */
    public void courseListsetValueAt(Object value, int row, int col) {
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
     * Hook method, invoked after the obtaining the Course2 object.
     * The returned Course2 object is the object that will be used as
     * the return value of the obtain method.
     * Returning <code>null</code> from this method is ignored, the
     * effect being as if this method had not been invoked.
     * @param domainObject the obtained domain object.
     * @return the domain object.
     */
    public Course hookAfterObtainCourse2(Course domainObject) {
        // override in subclass!
        return domainObject;
    }
    
    
    /**
     * Invokes check close on the Course dialog, and closes the
     * Course dialog if checkClose returned <code>true</code>
     */
    protected void actionCloseCourse() {
    
        String msgID = null;
        Exception ex = null;
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    GenovaDialogController gdc = 
                            application.getDialog("Course");
                    try {

                        // close a dialog window if checkClose returns true
                        if (gdc != null && gdc.checkClose()) {
                            gdc.disposeDialog();
                        }
                    } catch (GenovaBaseException e) {
                        if (hookActionCloseCourseException(e)) {
                            throw e;
                        }
                    } catch (RuntimeException e) {
                        if (hookActionCloseCourseException(e)) {
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
               Object[] msgArgs = {this.getClass(), "actionCloseCourse", ex};
               Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
               MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
               throw new GenovaClientFrameworkException(ex, msg);
            }
        } 
    }
    


    /**
     * The FindAll Course2 JGrape action. This action involves 
     * the following steps.
     * <ol>
     *  <li>The Course2's check method for FindAll is invoked, possibly
     *      aborting the action.
     * 
     * <li>After a recursive obtain, which builds up a minimum tree
     *     containing only the objects needed by the server to identify the
     *     target, the hookActionFindAllCourse2Obtain(ObjectSelection)
     *     method is invoked, possibly aborting the action.
     *
     * <li>Next, hookActionFindAllCourse2ClientContext() is invoked. 
     *     If the method returns <code>null</code> a default client 
     *     context is used.
     *
     * <li>The object selection and the client context is used as arguments
     *     to 
     *
     *    <code>
     *    Application.getServiceProxy()
     *            .FindAll(ObjectSelection, ClientContext).
     *    </code>
     *
     * <li>If the action is either a save, insert or update action, the
     *     result from invoking FindAll on the service proxy is merged with
     *     the client's objects in order to restore the associations that
     *     where stripped away when performing the recursive obtain.
     *
     * <li>Invoke hookActionFindAllCourse2Display(resultObject), possibly 
     *     aborting the action.
     *
     * <li>Recursively clear the Course2 node and the recursivly
     *     display the result.
     * </ol>
     */
    protected void actionFindAllCourse2() {
        try {

            if (!theCourse2.checkFind()) {
                Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_ABORTING_ACTION, "checkFind", "find all", "Course2");
                MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                return;
            }

            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CONTINUING_ACTION, "findAll", "Course2");
            MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);

            ObjectSelection os = obtainObjectSelection(theCourse2);
            os.setTargetMainKey(theCourse2.getTargetMainKey());

            boolean goAhead = false;
            try {
                goAhead = hookActionFindAllCourse2Obtain(os);
            } catch (RuntimeException e) { 
                goAhead = false;
                throw e;
            } finally {
                if (!goAhead) {
                    // rollback from recursive obtain
                    Object parent = os.getRootObject(theCourse2
                            .getRootNode().getRoleName());
                    if (parent != null) {
                        AbstractNode top = (AbstractNode) theCourse2
                                .getRootNode();
                        List pathToTarget = theCourse2.getPathToNode();
                        top.mergeAssociations(parent, pathToTarget,true); 
                    }
                }
            }
            if (!goAhead) {
                return;
            }

            ClientContext ctx = hookActionFindAllCourse2ClientContext();
            if (ctx == null) {
                ctx = Application.getClientContext();
            }

            Collection resultObject = null;
            try {
                resultObject = (Collection) Application.getServiceProxy().findAll(os, ctx);
            } catch (RuntimeException e) {
                // rollback from recursive obtain
                Object parent = os.getRootObject(theCourse2
                        .getRootNode().getRoleName());
                if (parent != null) {
                    AbstractNode top = (AbstractNode) theCourse2
                            .getRootNode();
                    List pathToTarget = theCourse2.getPathToNode();
                    top.mergeAssociations(parent, pathToTarget,true); 
                }
                throw e;
            }

            if (hookActionFindAllCourse2Display(resultObject)) {
                new ClearTool(roleObjects).clearRole("Course2");
                resetProxy();
                if (resultObject != null) {
                    List path = TypeTool.getDefaultList();
                    path.add(theCourse2);                     
                    theCourse2.displayOnEDT(resultObject, path, true);
                } 

            }

        } catch (RuntimeException e) {
            if (hookActionFindAllCourse2Exception(e)) {
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
    /* Here we can generate code which don't belong anywhere due to missing
     * sections or whatever. It will not be called by any method. 
     * @deprecated
     */
    void trashDepartment() {
        String s = null; 
        boolean b = false; if(false) { b = !b; s.getClass();}
    }
} // End of controller Class 
