// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package example.dialog.student;
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

import no.course.domain.Student;

/**
 * Public class interpreting the controller part of
 * Student. This file is generated for each generation in
 * Genova. Do not make changes in this file. All user added code
 * should be done in class Student.
 * To access mother application, use variable
 * 'application'.
 */ 
@SuppressWarnings("all")
public abstract class StudentDefaultController implements GenovaDialogController {
    GenovaEnums applicationEnums;
    /** Holds the name of the server application */
    private String serverApplicationName = "Student_appl";
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
    /** This is the entry point for the object selection node with name Student. Use methods found in this class - do not access view directly! */
    public StudentMethods theStudent;
    
    /* Her kommer generert kode fra WindowBlock:controllerdecl*/
    
    HashMap tabListFromNodeNameWindow = new HashMap();
    HashMap tabListFromComponentWindow = new HashMap();
    
    String[] tabSequence = {"Student.age","Student.id","Student.name","Student.studentNr","StudentSearchButton","StudentClearButton","StudentSaveButton","StudentDeleteButton"};
    Map nextTabElementString = TypeTool.quickIndex(tabSequence, true);
    Map previousTabElementString = TypeTool.quickIndex(tabSequence, false);
    HashMap tabListFromNodeNameToolbar = tabListFromNodeNameWindow;
    HashMap tabListFromComponentToolbar = tabListFromComponentWindow;
    
    HashMap tabListFromNodeNameStudentClass = tabListFromNodeNameWindow;
    HashMap tabListFromComponentStudentClass = tabListFromComponentWindow;
    
    HashMap tabListFromNodeNameStudentData = tabListFromNodeNameStudentClass;
    HashMap tabListFromComponentStudentData = tabListFromComponentStudentClass;
    
    HashMap tabListFromNodeNameStudentButton = tabListFromNodeNameStudentClass;
    HashMap tabListFromComponentStudentButton = tabListFromComponentStudentClass;
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
    StudentDefaultView view;
    /** The vector with the tool bar elements */
    protected Vector toolBarVector = null;

    /** Access point for methods valid for entire application. This
     * object is an instance of the class Student_appl and can
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
        view.clearStudent();
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
    public StudentDefaultController(ApplicationMethods app) { 
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
    
     return "Student"; 
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
                    Object[] msgArgs = {StudentDefaultController.class, "getListblockStates", ex};
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
                    Object[] msgArgs = {StudentDefaultController.class, "setListblockStates", ex};
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

        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookStudentCheckPrint();
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

        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookCheckSaveStudent();
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

        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookStudentCheckSave();
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
        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookCheckFindStudent();
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

        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookStudentCheckFind();
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
        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookCheckCloseStudent();
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

        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookStudentCheckClose();
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
        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookCheckDeleteStudent();
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

        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookStudentCheckDelete();
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
        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookCheckClearStudent();
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

        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookStudentCheckClear();
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
        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookCheckChangeStudent();
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

        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookStudentCheckChange();
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
        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookCheckRowSelectStudent(currentSelectionIndex, newSelectionIndex);
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

        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return hookStudentCheckRowSelect(oldSelection, newSelection);
        }        

        return ECheckResult.DEFAULT;
    }        


    public boolean checkPrint() {
        boolean retVal = true;
        retVal = retVal && theStudent.checkPrint();
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
     * StudentView. A default implementation of this method
     * is generated in the StudentController class.
     *
     * @param controller the controller for the dialog.
     * @param applicationEnums the GenovaEnums object for the application.
     * @return the dialog view.
     */
    protected abstract StudentDefaultView hookInstantiateView(StudentDefaultController controller, GenovaEnums applicationEnums);


    public boolean checkClose() {
        boolean retVal = true;
        getView().toFront();
        try {
            getView().setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            // can't select the view...
        }        
        retVal = retVal && theStudent.checkClose();
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
        if (StudentConst.Student.OSRoleName.equals(roleName)) {
            return theStudent.checkClear();
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
        return "Student";
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
       theStudent = new StudentMethods(view, this, applicationEnums);
       RoleObject roleObjectStudent = addRoleObject(Student.class, new RoleObject("Student"));
       roleObjectStudent.setNode(theStudent);
       roleObjectStudent.addSimpleBlock(theStudent);
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
        RoleObject roleObjectStudent = addRoleObject(Student.class, new RoleObject("Student"));

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
                        targetRoleName, getServerApplicationName(), "Student_os");
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
                                            "Student_os");
                Map obtainedRoots = new HashMap();
                obtainedRoots.put("Student", 
                        obtainObjectSelection(theStudent, true));

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
        if ("Student".equals(roleName)) {
            return theStudent;
        }
        /* no match! */
        return null;
    }


    public void clearObjectSelection() {
        ClearTool clearTool = new ClearTool(roleObjects);
        clearTool.clear("Student");
    }


    private boolean checkClearObjectSelection() {
        boolean ok = true;
        ok = ok && theStudent.checkChanged();
        if (!ok) {
            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CC_CHECK_CLEAR_MSG);
            MessageReply reply = Application.getMessageDispatcher(getWindow(), getApplication()).dispatch(msg);
            ok = MessageReplyType.REPLY_OK.equals(reply);
        }
        return ok;
    }


    
    /* Her kommer generert kode for Button:MethodDeclaration*/
    
    /** Set enable/disable for button StudentSearchButton 
     * @param b true for enabled, false for not 
     */
    public void setEnabledStudentSearchButton(boolean b) {
        view.StudentSearchButton.setEnabled(b);
    }
    
    /**
     * Shows or hides StudentSearchButton depending on the parameter.
     * @param b <code>true</code> to show, <code>false</code> to hide.
     */
    public void setShownStudentSearchButton(boolean b) {
        view.StudentSearchButton.setVisible(b);
    }
    
    /**
     * Attemts to transfer input focus to StudentSearchButton
     */
    public void setFocusStudentSearchButton() {
        view.StudentSearchButton.requestFocusInWindow();
    }
    
    /**
     * Check if StudentSearchButton is enabled.
     * @return <code>true</code> if StudentSearchButton is enabled.
     */
    public boolean isEnabledStudentSearchButton() {
        return view.StudentSearchButton.isEnabled();
    }
    
    /**
     * Check if StudentSearchButton is the focus owner.
     * @return <code>true</code> if StudentSearchButton is the focus owner.
     */
    public boolean hasFocusStudentSearchButton() {
        return view.StudentSearchButton.isFocusOwner();
    }
    
    /**
     * Check if StudentSearchButton is visible. Note that this does 
     * not imply that StudentSearchButton is actually showing, only that it can be 
     * drawn on the screen.
     * @return <code>true</code> if StudentSearchButton is visible.
     */
    public boolean isShownStudentSearchButton() {
        return view.StudentSearchButton.isVisible();
    }
    
    /* Her kommer generert kode for Button:MethodDeclaration*/
    
    /** Set enable/disable for button StudentClearButton 
     * @param b true for enabled, false for not 
     */
    public void setEnabledStudentClearButton(boolean b) {
        view.StudentClearButton.setEnabled(b);
    }
    
    /**
     * Shows or hides StudentClearButton depending on the parameter.
     * @param b <code>true</code> to show, <code>false</code> to hide.
     */
    public void setShownStudentClearButton(boolean b) {
        view.StudentClearButton.setVisible(b);
    }
    
    /**
     * Attemts to transfer input focus to StudentClearButton
     */
    public void setFocusStudentClearButton() {
        view.StudentClearButton.requestFocusInWindow();
    }
    
    /**
     * Check if StudentClearButton is enabled.
     * @return <code>true</code> if StudentClearButton is enabled.
     */
    public boolean isEnabledStudentClearButton() {
        return view.StudentClearButton.isEnabled();
    }
    
    /**
     * Check if StudentClearButton is the focus owner.
     * @return <code>true</code> if StudentClearButton is the focus owner.
     */
    public boolean hasFocusStudentClearButton() {
        return view.StudentClearButton.isFocusOwner();
    }
    
    /**
     * Check if StudentClearButton is visible. Note that this does 
     * not imply that StudentClearButton is actually showing, only that it can be 
     * drawn on the screen.
     * @return <code>true</code> if StudentClearButton is visible.
     */
    public boolean isShownStudentClearButton() {
        return view.StudentClearButton.isVisible();
    }
    
    /* Her kommer generert kode for Button:MethodDeclaration*/
    
    /** Set enable/disable for button StudentSaveButton 
     * @param b true for enabled, false for not 
     */
    public void setEnabledStudentSaveButton(boolean b) {
        view.StudentSaveButton.setEnabled(b);
    }
    
    /**
     * Shows or hides StudentSaveButton depending on the parameter.
     * @param b <code>true</code> to show, <code>false</code> to hide.
     */
    public void setShownStudentSaveButton(boolean b) {
        view.StudentSaveButton.setVisible(b);
    }
    
    /**
     * Attemts to transfer input focus to StudentSaveButton
     */
    public void setFocusStudentSaveButton() {
        view.StudentSaveButton.requestFocusInWindow();
    }
    
    /**
     * Check if StudentSaveButton is enabled.
     * @return <code>true</code> if StudentSaveButton is enabled.
     */
    public boolean isEnabledStudentSaveButton() {
        return view.StudentSaveButton.isEnabled();
    }
    
    /**
     * Check if StudentSaveButton is the focus owner.
     * @return <code>true</code> if StudentSaveButton is the focus owner.
     */
    public boolean hasFocusStudentSaveButton() {
        return view.StudentSaveButton.isFocusOwner();
    }
    
    /**
     * Check if StudentSaveButton is visible. Note that this does 
     * not imply that StudentSaveButton is actually showing, only that it can be 
     * drawn on the screen.
     * @return <code>true</code> if StudentSaveButton is visible.
     */
    public boolean isShownStudentSaveButton() {
        return view.StudentSaveButton.isVisible();
    }
    
    /* Her kommer generert kode for Button:MethodDeclaration*/
    
    /** Set enable/disable for button StudentDeleteButton 
     * @param b true for enabled, false for not 
     */
    public void setEnabledStudentDeleteButton(boolean b) {
        view.StudentDeleteButton.setEnabled(b);
    }
    
    /**
     * Shows or hides StudentDeleteButton depending on the parameter.
     * @param b <code>true</code> to show, <code>false</code> to hide.
     */
    public void setShownStudentDeleteButton(boolean b) {
        view.StudentDeleteButton.setVisible(b);
    }
    
    /**
     * Attemts to transfer input focus to StudentDeleteButton
     */
    public void setFocusStudentDeleteButton() {
        view.StudentDeleteButton.requestFocusInWindow();
    }
    
    /**
     * Check if StudentDeleteButton is enabled.
     * @return <code>true</code> if StudentDeleteButton is enabled.
     */
    public boolean isEnabledStudentDeleteButton() {
        return view.StudentDeleteButton.isEnabled();
    }
    
    /**
     * Check if StudentDeleteButton is the focus owner.
     * @return <code>true</code> if StudentDeleteButton is the focus owner.
     */
    public boolean hasFocusStudentDeleteButton() {
        return view.StudentDeleteButton.isFocusOwner();
    }
    
    /**
     * Check if StudentDeleteButton is visible. Note that this does 
     * not imply that StudentDeleteButton is actually showing, only that it can be 
     * drawn on the screen.
     * @return <code>true</code> if StudentDeleteButton is visible.
     */
    public boolean isShownStudentDeleteButton() {
        return view.StudentDeleteButton.isVisible();
    }
    /** 
     * Generated event-action method, invoked from the framework.
     * This method is normally invoked on the EDT, and creates invokes 
     * <code>closeStudent()</code> asynchronous on a dedicated thread.
     * 
     *  <p><strong>Normally, developers should not invoke this method - use 
     * <code>closeStudent()</code> instead.</strong>
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
    public void closeStudent(final GenovaEventHolder e) throws RuntimeException { 
        Runnable task = new Runnable() {
                public void run() {
                    blockDialog();
                    boolean setLastEx = true;
                    try {
                        if (hookcloseStudentBefore(e)) {
                            setLastEx = false;
                            closeStudent();
                        } else {
                            setLastEx = false;
                        }
                        hookcloseStudentAfter(e);
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
     * <code>closeStudent(GenovaEventHolder)</code>. Override this
     * method if you want to performe some additional tasks. 
     *
     *
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void closeStudent() throws RuntimeException { 
            actionCloseStudent(); 
    }
    /** 
     * Generated event-action method, invoked from the framework.
     * This method is normally invoked on the EDT, and creates invokes 
     * <code>clearStudent()</code> asynchronous on a dedicated thread.
     * 
     *  <p><strong>Normally, developers should not invoke this method - use 
     * <code>clearStudent()</code> instead.</strong>
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
    public void clearStudent(final GenovaEventHolder e) throws RuntimeException { 
        // Noe p� server
        Runnable task = new Runnable() {
                public void run() {
                    blockDialog();
                    boolean setLastEx = true;
                    try {
                        if (hookclearStudentBefore(e)) {
                            setLastEx = false;
                            clearStudent();
                        } else {
                            setLastEx = false;
                        }
                        hookclearStudentAfter(e);
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
     * <code>clearStudent(GenovaEventHolder)</code>. Override this
     * method if you want to performe some additional tasks. 
     *
     *
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void clearStudent() throws RuntimeException { 
            actionClearStudent(); 
    }
    /** 
     * Generated event-action method, invoked from the framework.
     * This method is normally invoked on the EDT, and creates invokes 
     * <code>saveStudent()</code> asynchronous on a dedicated thread.
     * 
     *  <p><strong>Normally, developers should not invoke this method - use 
     * <code>saveStudent()</code> instead.</strong>
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
    public void saveStudent(final GenovaEventHolder e) throws RuntimeException { 
        // Noe p� server
        Runnable task = new Runnable() {
                public void run() {
                    blockDialog();
                    boolean setLastEx = true;
                    try {
                        if (hooksaveStudentBefore(e)) {
                            setLastEx = false;
                            saveStudent();
                        } else {
                            setLastEx = false;
                        }
                        hooksaveStudentAfter(e);
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
     * <code>saveStudent(GenovaEventHolder)</code>. Override this
     * method if you want to performe some additional tasks. 
     *
     *
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void saveStudent() throws RuntimeException { 
            actionSaveStudent(); 
    }
    /** 
     * Generated event-action method, invoked from the framework.
     * This method is normally invoked on the EDT, and creates invokes 
     * <code>deleteStudent()</code> asynchronous on a dedicated thread.
     * 
     *  <p><strong>Normally, developers should not invoke this method - use 
     * <code>deleteStudent()</code> instead.</strong>
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
    public void deleteStudent(final GenovaEventHolder e) throws RuntimeException { 
        // Noe p� server
        Runnable task = new Runnable() {
                public void run() {
                    blockDialog();
                    boolean setLastEx = true;
                    try {
                        if (hookdeleteStudentBefore(e)) {
                            setLastEx = false;
                            deleteStudent();
                        } else {
                            setLastEx = false;
                        }
                        hookdeleteStudentAfter(e);
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
     * <code>deleteStudent(GenovaEventHolder)</code>. Override this
     * method if you want to performe some additional tasks. 
     *
     *
     * @exception RuntimeException Thrown exceptions are handled if of type
     * GenovaException.
     */ 
    public void deleteStudent() throws RuntimeException { 
            actionDeleteStudent(); 
    }


    /**
     * Hook method, called if the action resulted in a RuntimeException. 
     * Override in subclass.
     * @param e the catched exception 
     * @return <code>false</code> the hook has handeled the exception, and no further action is needed.
     */
    public boolean hookActionCloseStudentException(RuntimeException e) {
        return true;
    }
    /**
     * Hook method, called if the action resulted in a RuntimeException. 
     * Override in subclass.
     * @param e the catched exception 
     * @return <code>false</code> the hook has handeled the exception, and no further action is needed.
     */
    public boolean hookActionClearStudentException(RuntimeException e) {
        return true;
    }         


    /**
     * Hook method, called if the action resulted in a RuntimeException.
     * Override in subclass.
     *
     * <p>If the exception is handeled in this hook, the hook should return
     * <code>false</code>. If the hook returns <code>true</code> the 
     * exception will be re-thrown from the invoking 
     * <code>actionSaveStudent()</code> method.
     * <br>The default return value is <code>true</code>.
     * @param e the catched exception 
     * @return <code>false</code> if exception is handeled, 
     *         <code>true</code> if exception should be re-thrown.
     */
    public boolean hookActionSaveStudentException(RuntimeException e) {
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
    public boolean hookActionSaveStudentObtain(ObjectSelection objectSelection) {
        return true;
    }


    /**
     * Hook method, called before server action is called. The returned ClientContext is used 
     * when calling the server. If <code>null</code> is returned, 
     * the Application.getClientContext() is used.
     * <p>Override in subclass.
     * @return the ClientContext that will be used as argument to the server action.
     */
    public ClientContext hookActionSaveStudentClientContext() {
        return null;
    }


    /**
     * Hook method, called before the found object in saveStudent is 
     * displayed. The boolean return value is used to determine if the foundObject
     * should be displayed (defaults to <code>true</code>.
     * <p>Override in subclass! 
     * @param foundObject the object returned from the server action find on target Student
     * @return <code>true</code> if the object should be displayed.
     */
    public boolean hookActionSaveStudentDisplay(Object foundObject) {
        return true;
    }


    /**
     * Hook method, called if the action resulted in a RuntimeException.
     * Override in subclass.
     *
     * <p>If the exception is handeled in this hook, the hook should return
     * <code>false</code>. If the hook returns <code>true</code> the 
     * exception will be re-thrown from the invoking 
     * <code>actionDeleteStudent()</code> method.
     * <br>The default return value is <code>true</code>.
     * @param e the catched exception 
     * @return <code>false</code> if exception is handeled, 
     *         <code>true</code> if exception should be re-thrown.
     */
    public boolean hookActionDeleteStudentException(RuntimeException e) {
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
    public boolean hookActionDeleteStudentObtain(ObjectSelection objectSelection) {
        return true;
    }


    /**
     * Hook method, called before server action is called. The returned ClientContext is used 
     * when calling the server. If <code>null</code> is returned, 
     * the Application.getClientContext() is used.
     * <p>Override in subclass.
     * @return the ClientContext that will be used as argument to the server action.
     */
    public ClientContext hookActionDeleteStudentClientContext() {
        return null;
    }


    /**
     * Hook method, called before the found object in deleteStudent is 
     * displayed. The boolean return value is used to determine if the foundObject
     * should be displayed (defaults to <code>true</code>.
     * <p>Override in subclass! 
     * @param foundObject the object returned from the server action find on target Student
     * @return <code>true</code> if the object should be displayed.
     */
    public boolean hookActionDeleteStudentDisplay(Object foundObject) {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkSave" on Student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookStudentCheckSave() {
        return hookCheckSaveStudent() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookStudentCheckSave instead.</strong>
     * Hook method, called as part of "check save" on 
     * Student. Override in subclass!
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
     * @see #hookStudentCheckSave()
     */
    public boolean hookCheckSaveStudent() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkFind" on Student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookStudentCheckFind() {
        return hookCheckFindStudent() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookStudentCheckFind instead.</strong>
     * Hook method, called as part of "check find" on Student. Override in subclass!
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
     * @see #hookStudentCheckFind()
     */
    public boolean hookCheckFindStudent() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkClose" on Student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookStudentCheckClose() {
        return hookCheckCloseStudent() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookStudentCheckClose instead.</strong>
     * Hook method, called as part of "check close" on Student. Override in subclass!
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
     * @see #hookStudentCheckClose()
     */
    public boolean hookCheckCloseStudent() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkDelete" on Student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookStudentCheckDelete() {
        return hookCheckDeleteStudent() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookStudentCheckDelete instead.</strong>
     * Hook method, called as part of "check delete" on Student. Override in subclass!
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
     * @see #hookStudentCheckDelete()
     */
    public boolean hookCheckDeleteStudent() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkPrint" on Student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookStudentCheckPrint() {
        return hookCheckPrintStudent() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookStudentCheckPrint instead.</strong>
     * Hook method, called as part of "check print" on Student. Override in subclass!
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
     * @see #hookStudentCheckPrint()
     */
    public boolean hookCheckPrintStudent() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkClear" on Student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookStudentCheckClear() {
        return hookCheckClearStudent() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookStudentCheckClear instead.</strong>
     * Hook method, called as part of "check clear" on Student. Override in subclass!
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
     * @see #hookStudentCheckClear()
     */
    public boolean hookCheckClearStudent() {
        return true;
    }


    /**
     * Hook method, invoked as part of "checkChange" on Student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @return an ECheckResult 
     */
     public ECheckResult hookStudentCheckChange() {
        return hookCheckChangeStudent() ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /**
     * <strong>The use of this method is discouraged. Override
     * hookStudentCheckChange instead.</strong>
     * Hook method, called as part of "check change" on Student. Override in subclass!
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
     * @see #hookStudentCheckChange()
     */
    public boolean hookCheckChangeStudent() {
        return true;
    }
    /**
     * Hook method, invoked as part of "check row select" on Student.
     * Override in subclass! 
     * <p>The return value must be one of the following:
     *
     * <ul>
     *   <li><code>ECheckResult.DEFAULT</code> - continue with check
     *   <li><code>ECheckResult.UNCHANGED</code> - Student and children 
     *       are unchanged
     *   <li><code>ECheckResult.CONTINUE</code> - Student is unchanged, 
     *       check children
     *   <li><code>ECheckResult.CHANGED</code> - Student is changed
     * </ul>
     *
     * If an exception is thrown, the ongoing action is aborted. 
     *
     * @param oldSelection the current selected line
     * @param newSelection the line about to be selected
     * @return a ECheckResult 
     */
     public ECheckResult hookStudentCheckRowSelect
                (int oldSelection, int newSelection) {
        return hookCheckRowSelectStudent(oldSelection, newSelection) ? 
                ECheckResult.DEFAULT : ECheckResult.UNCHANGED;
     }


    /** 
     * <strong>The use of this method is discouraged. Override
     * hookStudentCheckRowSelect instead.</strong>
     * Hook method, called as part of "check row selection" on Student. Override in subclass!
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
     * @see #hookStudentCheckRowSelect(int, int)
     */
    public boolean hookCheckRowSelectStudent(int currentSelection, 
            int newSelection) {
        return true;
    }



    /**
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     * @return true if the rest of the actions are to be execuded.
     */
    public boolean hookcloseStudentBefore(GenovaEventHolder e) {
        return true;
    }
    /**
     * 
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     */
    public void hookcloseStudentAfter(GenovaEventHolder e) {
        // empty method overridden in subclass
    }
    /**
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     * @return true if the rest of the actions are to be execuded.
     */
    public boolean hookclearStudentBefore(GenovaEventHolder e) {
        return true;
    }
    /**
     * 
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     */
    public void hookclearStudentAfter(GenovaEventHolder e) {
        // empty method overridden in subclass
    }
    /**
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     * @return true if the rest of the actions are to be execuded.
     */
    public boolean hooksaveStudentBefore(GenovaEventHolder e) {
        return true;
    }
    /**
     * 
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     */
    public void hooksaveStudentAfter(GenovaEventHolder e) {
        // empty method overridden in subclass
    }
    /**
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     * @return true if the rest of the actions are to be execuded.
     */
    public boolean hookdeleteStudentBefore(GenovaEventHolder e) {
        return true;
    }
    /**
     * 
     * Hook method. Override in subclass.
     * @param e the event that triggered this method.
     */
    public void hookdeleteStudentAfter(GenovaEventHolder e) {
        // empty method overridden in subclass
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
     * Hook method, invoked after the obtaining the Student object.
     * The returned Student object is the object that will be used as
     * the return value of the obtain method.
     * Returning <code>null</code> from this method is ignored, the
     * effect being as if this method had not been invoked.
     * @param domainObject the obtained domain object.
     * @return the domain object.
     */
    public Student hookAfterObtainStudent(Student domainObject) {
        // override in subclass!
        return domainObject;
    }
    
    
    /**
     * Invokes check close on the Student dialog, and closes the
     * Student dialog if checkClose returned <code>true</code>
     */
    protected void actionCloseStudent() {
    
        String msgID = null;
        Exception ex = null;
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    GenovaDialogController gdc = 
                            application.getDialog("Student");
                    try {

                        // close a dialog window if checkClose returns true
                        if (gdc != null && gdc.checkClose()) {
                            gdc.disposeDialog();
                        }
                    } catch (GenovaBaseException e) {
                        if (hookActionCloseStudentException(e)) {
                            throw e;
                        }
                    } catch (RuntimeException e) {
                        if (hookActionCloseStudentException(e)) {
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
               Object[] msgArgs = {this.getClass(), "actionCloseStudent", ex};
               Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
               MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
               throw new GenovaClientFrameworkException(ex, msg);
            }
        } 
    }
    
    
    
    /**
     * Recursivly clears all fields in the Student 
     * object selection node, and
     * sets the cleared nodes' state to CLEARED.
     */
    protected void actionClearStudent() {
        String msgID = null;
        Exception ex = null;
    
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    try {
                        if (theStudent.checkClear()) {
                            new ClearTool(roleObjects).clearRole("Student");
                            theStudent.nullProxy();
                        }
                    } catch (RuntimeException e) {
                        if (hookActionClearStudentException(e)) {
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
               Object[] msgArgs = {this.getClass(), "actionClearStudent", ex};
               Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
               MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
               throw new GenovaClientFrameworkException(ex, msg);
            }
        } 
    }
    


    /**
     * The Save Student JGrape action. This action involves 
     * the following steps.
     * <ol>
     *  <li>The Student's check method for Save is invoked, possibly
     *      aborting the action.
     * 
     * <li>After a recursive obtain, which builds up a minimum tree
     *     containing only the objects needed by the server to identify the
     *     target, the hookActionSaveStudentObtain(ObjectSelection)
     *     method is invoked, possibly aborting the action.
     *
     * <li>Next, hookActionSaveStudentClientContext() is invoked. 
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
     * <li>Invoke hookActionSaveStudentDisplay(resultObject), possibly 
     *     aborting the action.
     *
     * <li>Recursively clear the Student node and the recursivly
     *     display the result.
     * </ol>
     */
    protected void actionSaveStudent() {
        try {

            if (!theStudent.checkSave()) {
                Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_ABORTING_ACTION, "checkSave", "save", "Student");
                MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                return;
            }

            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CONTINUING_ACTION, "save", "Student");
            MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);

            List selectedLines = getListblockStates(theStudent.getPathToNode());
            ObjectSelection os = obtainObjectSelection(theStudent);
            os.setTargetMainKey(theStudent.getTargetMainKey());

            boolean goAhead = false;
            try {
                goAhead = hookActionSaveStudentObtain(os);
            } catch (RuntimeException e) { 
                goAhead = false;
                throw e;
            } finally {
                if (!goAhead) {
                    // rollback from recursive obtain
                    Object parent = os.getRootObject(theStudent
                            .getRootNode().getRoleName());
                    if (parent != null) {
                        AbstractNode top = (AbstractNode) theStudent
                                .getRootNode();
                        List pathToTarget = theStudent.getPathToNode();
                        top.mergeAssociations(parent, pathToTarget,true); 
                    }
                }
            }
            if (!goAhead) {
                return;
            }

            ClientContext ctx = hookActionSaveStudentClientContext();
            if (ctx == null) {
                ctx = Application.getClientContext();
            }

            Collection resultObject = null;
            try {
                resultObject = (Collection) Application.getServiceProxy().save(os, ctx);
            } catch (RuntimeException e) {
                // rollback from recursive obtain
                Object parent = os.getRootObject(theStudent
                        .getRootNode().getRoleName());
                if (parent != null) {
                    AbstractNode top = (AbstractNode) theStudent
                            .getRootNode();
                    List pathToTarget = theStudent.getPathToNode();
                    top.mergeAssociations(parent, pathToTarget,true); 
                }
                throw e;
            }

            if (resultObject != null) {
                AbstractNode top = (AbstractNode) theStudent.getRootNode();
                List pathToTarget = theStudent.getPathToNode();
                if (resultObject.iterator().hasNext()) {
                    Object first = resultObject.iterator().next();
                    top.mergeAssociations(first, pathToTarget,false);
                }
            }
            if (hookActionSaveStudentDisplay(resultObject)) {
                new ClearTool(roleObjects).clearKeepKeys("Student");
                resetProxy();
                if (resultObject != null) {
                    theStudent.getRootNode().displayOnEDT(resultObject, theStudent.getPathToNode(), false);
                } 

                setListblockStates(selectedLines, true);
            }

        } catch (RuntimeException e) {
            if (hookActionSaveStudentException(e)) {
                throw e;
            }
        } 
    }


    /**
     * The Delete Student JGrape action. This action involves 
     * the following steps.
     * <ol>
     *  <li>The Student's check method for Delete is invoked, possibly
     *      aborting the action.
     * 
     * <li>After a recursive obtain, which builds up a minimum tree
     *     containing only the objects needed by the server to identify the
     *     target, the hookActionDeleteStudentObtain(ObjectSelection)
     *     method is invoked, possibly aborting the action.
     *
     * <li>Next, hookActionDeleteStudentClientContext() is invoked. 
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
     * <li>Invoke hookActionDeleteStudentDisplay(resultObject), possibly 
     *     aborting the action.
     *
     * <li>Recursively clear the Student node and the recursivly
     *     display the result.
     * </ol>
     */
    protected void actionDeleteStudent() {
        try {

            if (!theStudent.checkDelete()) {
                Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_ABORTING_ACTION, "checkDelete", "delete", "Student");
                MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                return;
            }

            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CONTINUING_ACTION, "delete", "Student");
            MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);

            ObjectSelection os = obtainObjectSelection(theStudent);
            os.setTargetMainKey(theStudent.getTargetMainKey());

            boolean goAhead = false;
            try {
                goAhead = hookActionDeleteStudentObtain(os);
            } catch (RuntimeException e) { 
                goAhead = false;
                throw e;
            } finally {
                if (!goAhead) {
                    // rollback from recursive obtain
                    Object parent = os.getRootObject(theStudent
                            .getRootNode().getRoleName());
                    if (parent != null) {
                        AbstractNode top = (AbstractNode) theStudent
                                .getRootNode();
                        List pathToTarget = theStudent.getPathToNode();
                        top.mergeAssociations(parent, pathToTarget,true); 
                    }
                }
            }
            if (!goAhead) {
                return;
            }

            ClientContext ctx = hookActionDeleteStudentClientContext();
            if (ctx == null) {
                ctx = Application.getClientContext();
            }

            Collection resultObject = null;
            try {
                resultObject = (Collection) Application.getServiceProxy().delete(os, ctx);
            } catch (RuntimeException e) {
                // rollback from recursive obtain
                Object parent = os.getRootObject(theStudent
                        .getRootNode().getRoleName());
                if (parent != null) {
                    AbstractNode top = (AbstractNode) theStudent
                            .getRootNode();
                    List pathToTarget = theStudent.getPathToNode();
                    top.mergeAssociations(parent, pathToTarget,true); 
                }
                throw e;
            }

            Object root = os.getRootObject(theStudent.getRootNode().getRoleName());
            theStudent.removeFromParent(root);
            if (resultObject != null) {
                AbstractNode top = (AbstractNode) theStudent.getRootNode();
                List pathToTarget = theStudent.getPathToNode();
                if (resultObject.iterator().hasNext()) {
                    Object first = resultObject.iterator().next();
                    top.mergeAssociations(first, pathToTarget,false);
                }
            }
            if (hookActionDeleteStudentDisplay(resultObject)) {
                new ClearTool(roleObjects).clear("Student");
                resetProxy();
                if (resultObject != null) {
                    theStudent.getRootNode().displayOnEDT(resultObject, theStudent.getPathToNode(), false);
                } 

            }

        } catch (RuntimeException e) {
            if (hookActionDeleteStudentException(e)) {
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