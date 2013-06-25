// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package no.course.dialog.assignment;
import no.genova.domain.GenovaEnums;
import no.genova.client.support.ObjectSelectionNode;
import no.genova.client.support.AbstractNode;
import no.genova.client.support.GenovaDialogController;
import no.genova.client.support.ListblockLine;

import no.genova.support.TypeTool;

import no.genova.domain.DomainUtil;
import no.genova.domain.DomainProxy;
import no.genova.domain.DomainObjectProxy;
import no.genova.client.event.GenovaValueState;

import no.genova.exception.GenovaClientException;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

import java.io.Serializable;
import java.awt.Color;
import java.lang.reflect.Method;

import javax.swing.SwingUtilities;
import no.course.domain.Assignment;

/** 
 * Access methods for Assignment. Use variable theAssignment to access
 * methods in this class.
 * <p><strong>State handling</strong></p>
 *
 * When calling reset() the current object selection state will be
 * copied to the old object state. This object is accessible
 * through getOld(). Upon displaying data to the structure, the
 * old value is also updated. If old data and new data differes
 * the isChanged method will return true.
 */
@SuppressWarnings("all")
public class AssignmentMethods extends AbstractNode<Assignment> {

    AssignmentDefaultView view;
    GenovaEnums genovaEnums;
    AssignmentDefaultController controller;
    ObjectSelectionNode parentNode;
    List childNodes = new ArrayList();
    AssignmentMethods(AssignmentDefaultView view, AssignmentDefaultController controller, GenovaEnums genovaEnums) {
        this.view = view;
        this.genovaEnums = genovaEnums;
        this.controller = controller;
    }

    public ObjectSelectionNode getParentNode() {
        return parentNode;
    }

    public void setParentNode(ObjectSelectionNode parentNode) {
        this.parentNode = parentNode;
        parentNode.addChild(this);
    }


    public ObjectSelectionNode getRootNode() {
        ObjectSelectionNode parent = getParentNode();
        if (parent == null) return this;

        while (parent.getParentNode() != null) {
            parent = parent.getParentNode();
        }

        return parent;
    }


    public List getChildren() {
        return childNodes;
    }
    public String getRoleName() {
        return "Assignment";
    }


    public void addChild(ObjectSelectionNode child) {
        childNodes.add(child);
    }
    public boolean callHookBeforeDisplay(Object objectToDisplay, String roleName) {
       return controller.hookBeforeDisplay(objectToDisplay, roleName);
    }


    public boolean callCheckSaveHook() {
        return controller.callCheckSaveHook("Assignment");
    }


    public boolean callCheckDeleteHook() {
        return controller.callCheckDeleteHook("Assignment");
    }


    public boolean callCheckCloseHook() {
        return controller.callCheckCloseHook("Assignment");
    }


    public boolean callCheckClearHook() {
        return controller.callCheckClearHook("Assignment");
    }


    public boolean callCheckFindHook() {
        return controller.callCheckFindHook("Assignment");
    }


    public boolean callCheckChangeHook() {
        return controller.callCheckChangeHook("Assignment");
    }


    public boolean callCheckRowSelectHook(int currentSelectionIndex, int newSelectionIndex) {
        return controller.callCheckRowSelectHook("Assignment", currentSelectionIndex, newSelectionIndex);
    }


    public GenovaDialogController getController() {
        return controller;
    }


    /**
     * Returns an object representing the relation Assignment from the
     * dialog. This method does exactly the same as {@link #obtain()}, and
     * differs only in the return type, specified in the interface.
     * @return Object of Assignment with attributes from the OS.
     */
    public Object obtainAsObject() {
        return obtain();
    }    
    public Object getEmptyDomainObject() {
        return new Assignment();
    }
    public Class getRepresentingClass() {
        return Assignment.class;
    }
    /** 
     * Returns an object representing the relation Assignment from the
     * dialog. If Assignment is displayed in the dialog, 
     * the Assignment domain object is used, else a new Assignment object 
     * is created. Attributes present in the dialog are then 
     * copied into the Assignment object. 
     * 
     * <p>Before returning, the controller's hookAfterObtainAssignment method 
     * is invoked, giving the application programmer 
     * the possibility to manipulate or replace the object.
     * 
     * @return Object of Assignment updated from the dialog.
     */
    public Assignment obtain() {
        if (objectProxy == null) {
            Assignment tmpAssignment = new Assignment();
            objectProxy = controller
                    .getProxy(tmpAssignment, "Assignment");
        }
        objectProxy.setAttribute
            ("assignmentText", view.Assignment_assignmentText.getValue());

       Assignment obtainedObject = (Assignment) objectProxy.getObject();
       Assignment manipulated = controller.hookAfterObtainAssignment(obtainedObject);
       if (manipulated != null) {
           obtainedObject = manipulated;
       }
       return obtainedObject;
    }

    public String obtain(String attr) {
        attr = TypeTool.stripRoleNamePrefix(attr, getRoleName());
        if ("assignmentText".equals(attr)) {
            return view.Assignment_assignmentText.format();
        }

       return null; // field not found!
    }


   /**
    * Updates data of this object selection node in the dialog, and sets
    * the state to CLEAN.
    *
    * @param domainObject Attributes are copied from this object.
    */
    public void display(Object domainObject) {
        if (domainObject instanceof Assignment) {
            display((Assignment) domainObject);
        }
    }

   /**
    * Updates data of the Assignment node in the dialog, and sets
    * the state to CLEAN.
    *
    * @param tmpAssignment Attributes are copied from this object.
    */
    public void display(Assignment tmpAssignment) {
        if (!SwingUtilities.isEventDispatchThread()) {
            displayOnEDT(tmpAssignment);
            return;
        }
        if (tmpAssignment == null) {
            tmpAssignment= new Assignment();
        }
        controller.resetProxy();
        objectProxy = controller.getNewProxy(tmpAssignment, "Assignment");
        boolean resetState = true;
        display("assignmentText", TypeTool.toObject(tmpAssignment.getAssignmentText()), resetState);
        setState(ObjectSelectionNode.CLEAN, false);
    }
    public boolean isConsistant() {
    if(!TypeTool.isConsistant(view.Assignment_assignmentText.getText(), oldAssignment.getAssignmentText())) {
        return false;
    }
        return true;
     }    

    public boolean hasValue() {
    if(view.Assignment_assignmentText.getText() == null || view.Assignment_assignmentText.getText().length() == 0) {
        return false;
    }
       return true;
    }
    public boolean hasOneValue() {
    if(view.Assignment_assignmentText.getText() != null && view.Assignment_assignmentText.getText().trim().length() > 0) {
        return true;
    }
       return false;
    }

    public boolean hasValue(String field) {
        field = TypeTool.stripRoleNamePrefix(field, getRoleName());
    if(field.equals("assignmentText") && (view.Assignment_assignmentText.getText() == null || view.Assignment_assignmentText.getText().length() == 0)) {
        return false;
    }
       return true;
    }

    public void setStyle(Color foreground, Color background) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setStyleOnEDT(foreground, background);
            return;
        }
    view.Assignment_assignmentText.setForeground(foreground);
    view.Assignment_assignmentText.setBackground(background);
    }
    public void osDisplay(Object value, String attribute, 
            boolean resetState) {
        if (value instanceof Assignment) {
            display(((Assignment) value), attribute, resetState);
        } else {
            display(attribute, value, resetState);
        }
    }

    /**
     * Updates data of given attriubte in object selection in the dialog.
     *
     * @param attributeName Name of attribute to update.
     * @param value The new value.
     */
    public void display(String attributeName, Object value) {
        display(attributeName, value, true);
    }

    /**
     * Updates data of given attriubte in object selection in the dialog.
     *
     * @param attributeName Name of attribute to update.
     * @param value The new value.
     * @param resetState Set to false to avoid resetting the attribute state.
     */
    public void display(String attributeName, Object value, boolean resetState) {
        if (!SwingUtilities.isEventDispatchThread()) {
            displayOnEDT(attributeName, value, resetState);
            return;
        }
        view.noFocusException++;
        attributeName = TypeTool
                .stripRoleNamePrefix(attributeName, getRoleName());
        if ("assignmentText".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.Assignment_assignmentText.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.Assignment_assignmentText.setInitialValue(valueObject);
            }
            view.Assignment_assignmentText.setValue(valueObject);
            view.Assignment_assignmentText.setCaretPosition(0);
        }
        view.noFocusException--;
    }

    /**
     * Updates data of given attriubte in object selection in the dialog.
     *
     * @param tmpAssignment Attributes are copied from this object.
     * @param s The attribute to set.
     */
    public void display(Assignment tmpAssignment, String s) {
        display(tmpAssignment, s, true);
    }

    @Override
    public void display(Assignment tmpAssignment, String attributeName, boolean resetState) {
        if (!SwingUtilities.isEventDispatchThread()){
            displayOnEDT(tmpAssignment, attributeName, resetState);
            return;
        }
        attributeName = TypeTool
                .stripRoleNamePrefix(attributeName, getRoleName());
       if (tmpAssignment != null) {
           Object value = null;
            if (attributeName.equals("assignmentText")) {
                value = TypeTool.toObject(tmpAssignment.getAssignmentText());
            }
           display(attributeName, value, resetState);
       }
    }
    boolean zeroAssignmentassignmentText = false;
    /**
     * @param s the name of the attribute
     * @param val the setShowZero property
     * @deprecated - use display rules to set this display rule.
     */
    public void setShowZero(String s, boolean val) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
       val = !val;
    if(s.equals("assignmentText")) {
        zeroAssignmentassignmentText = val;
    }
        /* Might be generated empty */
        if(false) {
            if(val) {
                s.getClass();
            }
        }
    }
    public void clear() {
        if (!SwingUtilities.isEventDispatchThread()) {
            clearOnEDT();
            return;
        }
        view.noFocusException++;
    view.Assignment_assignmentText.setInitialValue(null);
    view.oldValueAssignmentassignmentText = "";
    view.Assignment_assignmentText.setValue(null);
    view.Assignment_assignmentText.resetState();
        nullProxy();
        setState(ObjectSelectionNode.CLEARED, false);
        view.noFocusException--;
    }
    /** 
      * Clears all fields exept the fields representing part of 
      * the objects key.
      */ 
    public void clearKeepKeys() {
        if (!SwingUtilities.isEventDispatchThread()) {
            clearKeepKeysOnEDT();
            return;
        }

        view.noFocusException++;
        clear("assignmentText");
        clear("id");
        view.noFocusException--;
    }
    public void clear(String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            clearOnEDT(s);
            return;
        }
        view.noFocusException++;
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("assignmentText")) {
        view.oldValueAssignmentassignmentText = "";
        view.Assignment_assignmentText.setInitialValue(null);
        view.Assignment_assignmentText.setValue(null);
        view.Assignment_assignmentText.resetState();
    }
        view.noFocusException--;
    }
    public void setEnabled(boolean b) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setEnabledOnEDT(b);
            return;
        }
    view.Assignment_assignmentText.setEnabled(b);
    }
    public void setEnabled(boolean b, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setEnabledOnEDT(b, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("assignmentText")) {
        view.Assignment_assignmentText.setEnabled(b);
    }
    }
    public boolean isEnabled() {
        boolean b = false;
    if (view.Assignment_assignmentText.isEnabled()) b=true;
       return b;
    }
    public boolean isEnabled(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (s.equals("assignmentText")) {
        if (view.Assignment_assignmentText.isEnabled()) b=true;
    }
       return b;
    }
    public void setShown(boolean b) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setShownOnEDT(b);
            return;
        }
    view.Assignment_assignmentText.setVisible(b);
    
    /* Her kommer generert kode for SimpleBlock:setShown*/
    
    view.AssignmentClass.setVisible(b);
    
    /* Her kommer generert kode for SimpleBlock:setShown*/
    
    view.AssignmentData.setVisible(b);
    view.AssignmentAssignmentTextLabelLabel.setVisible(b);
    
    /* Her kommer generert kode for SimpleBlock:setShown*/
    
    view.AssignmentButton.setVisible(b);
    }
    public void setShown(boolean b, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setShownOnEDT(b, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("assignmentText")) {
        view.Assignment_assignmentText.setVisible(b);
    }
    
    /* Her kommer generert kode for SimpleBlock:setShownField*/
    
    if (s.equals("AssignmentClass")) {
        view.AssignmentClass.setVisible(b);
    }
    
    /* Her kommer generert kode for SimpleBlock:setShownField*/
    
    if (s.equals("AssignmentData")) {
        view.AssignmentData.setVisible(b);
    }
        if (s.equals("AssignmentAssignmentTextLabel")) {
            view.AssignmentAssignmentTextLabelLabel.setVisible(b);
        }
    
    /* Her kommer generert kode for SimpleBlock:setShownField*/
    
    if (s.equals("AssignmentButton")) {
        view.AssignmentButton.setVisible(b);
    }
    }
    public boolean isShown() {
        boolean b = false;
    if (view.Assignment_assignmentText.isEnabled()) b=true;
        return b;
    }
    public boolean isShown(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (s.equals("assignmentText")) {
        if (view.Assignment_assignmentText.hasFocus()) b=true;
    }
    
    /* Her kommer generert kode for SimpleBlock:isShown*/
    
    if (view.AssignmentClass.isEnabled()) b=true;
    
    /* Her kommer generert kode for SimpleBlock:isShownField*/
    
    if (s.equals("AssignmentClass")) {
        if (view.AssignmentClass.hasFocus()) b=true;
    }
    
    /* Her kommer generert kode for SimpleBlock:isShown*/
    
    if (view.AssignmentData.isEnabled()) b=true;
    if (view.AssignmentAssignmentTextLabelLabel.isEnabled()) b=true;
    
    /* Her kommer generert kode for SimpleBlock:isShownField*/
    
    if (s.equals("AssignmentData")) {
        if (view.AssignmentData.hasFocus()) b=true;
    }
        if (s.equals("AssignmentAssignmentTextLabel")) {
            if (view.AssignmentAssignmentTextLabelLabel.hasFocus()) b=true;
        }
    
    /* Her kommer generert kode for SimpleBlock:isShown*/
    
    if (view.AssignmentButton.isEnabled()) b=true;
    
    /* Her kommer generert kode for SimpleBlock:isShownField*/
    
    if (s.equals("AssignmentButton")) {
        if (view.AssignmentButton.hasFocus()) b=true;
    }
       return b;
    }

    public void setFocus(String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setFocusOnEDT(s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("assignmentText")) {
        view.Assignment_assignmentText.requestFocusInWindow();
    }
    }
    public boolean hasFocus(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (view.Assignment_assignmentText.hasFocus()) b=true;
        return b;
    }
    @Override
    public void append(Assignment tmpAssignment, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            appendOnEDT(tmpAssignment, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        view.noFocusException++;
        if(tmpAssignment == null) {
            tmpAssignment= new Assignment();
        }
        view.noFocusException--;
    }
    /** Resets current state of relation Assignment in the dialog. Sets changed to false and sets old object to be the current object. 
     * @return Reference to the object that was the new object, that now is the old. 
     */
    public Assignment reset() {
        setOld(obtain());
        setChanged(false);
        return getOld();
     }
    /**
     * Returns true if the specified parameter is part of this role's 
     * key.
     * @param attributeName the name of the attribute
     * @return <code>true</code> if part of key
     */
    private boolean isPartOfKey(String attributeName) {
        attributeName = TypeTool
                .stripRoleNamePrefix(attributeName, getRoleName());
        return false;
   }  
    private Assignment oldAssignment = new Assignment();
    private boolean isMarkedChanged = false;
    
    
    /** Sets the old version of the object selection node.
     * NOTE: The object is not copied, it is referenced.
     * @param inst The new object to be used as the old. 
     * 
     */
    public void setOld(Assignment inst) {
        oldAssignment = inst;
    }
    
    
   /** 
    * Returns the old object. The object is not copied.
    * @return The object.
    */
    public Assignment getOld() {
        return oldAssignment;
    }
    
    
    /**
     * Returns the string representing the main key attribute of this role.
     * @return the main key
     */
    public String getTargetMainKey() {
        return "";
    }
    boolean isMarkedChangedassignmentText = false;
    public void setChanged (boolean b, String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());        
    if (s.equals("assignmentText")) {
        isMarkedChangedassignmentText = b;
    }    
     }
    public void setChanged(boolean b) {
        isMarkedChanged = b;
    isMarkedChangedassignmentText = b;
     }
    /** 
     * Returns whether Assignment has changed state since last 
     * call on resetAssignment().<br>
     * It will both parse the current state of the block
     * and compare with the dialogattribute named in input String s.
     * @param s The attribute to check.
     * @param tmpAssignment The object to compare with.
     * @return True if changed, false if not.
     * @deprecated use ObjectSelectionNode#isChanged(String)
     */
    public boolean isChanged(String s, Assignment tmpAssignment) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean bChanged = false;
        if(isMarkedChanged) return true;
    if (s.equals("assignmentText")) {
        if (isMarkedChangedassignmentText) bChanged = true;
        if (tmpAssignment != null && oldAssignment != null) {
        if (!TypeTool.equals(tmpAssignment.getAssignmentText(), oldAssignment.getAssignmentText())) {
            bChanged = true;
            isMarkedChangedassignmentText = true;
            }
        }
    }    
         return bChanged;
     }
    
    
    /** 
     * Returns whether Assignment has changed state since last call on
     * resetAssignment().  It will both parse the current state of the
     * block and compare with the dialogattributes of tmpAssignment.  
     * @param tmpAssignment The object to compare with.
     * @return <code>true</code> if changed, <code>false</code> if not.
     * @deprecated use ObjectSelection#getState()
     */
    public boolean isChanged(Assignment tmpAssignment) {
        if(isMarkedChanged) return true;
    if (isMarkedChangedassignmentText) isMarkedChanged = true;
    if (oldAssignment != null) {
        if (!TypeTool.equals(tmpAssignment.getAssignmentText(), oldAssignment.getAssignmentText())) {
            isMarkedChanged = true;
            isMarkedChangedassignmentText = true;
        }
    }
    if(false) {
        tmpAssignment.getClass();
    }
        return isMarkedChanged;
    }

    public Set getChangedFields() {
        Set changedFields = new HashSet();
        Object component = null;

        component = controller.view.fromNameToComponent("Assignment.assignmentText");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("assignmentText");
            }
        }

        return changedFields;
    }

    public Set getChangedKeyFields() {
        Set changedFields = new HashSet();
        Object component = null;

        if (isPartOfKey("assignmentText")) {
            component = controller.view.fromNameToComponent("Assignment.assignmentText");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("assignmentText");
                }
            }
        }

        return changedFields;
    }

    public void resetFields() {
        Object component = null;

        component = controller.view.fromNameToComponent("Assignment.assignmentText");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
    }
    
    /**
     * Displays domain objects which lies above the target in the object selection.
     * @param AssignmentCollection the collection of domain objects to display
     * @param pathToTarget a list of nodes representing the path to the target
     * @param findAll if <code>true</code> displaying is done as part of 
     *      a find all action.
     */
    public void displayAboveTarget(Collection AssignmentCollection, List pathToTarget, boolean findAll) {
        if (pathToTarget.size() == 1 && pathToTarget.get(0) == this) {
            if (!findAll && AssignmentCollection instanceof List) {
                Iterator it = AssignmentCollection.iterator();
                if (it.hasNext()) {
                    Assignment Assignmentsingle = (Assignment) it.next();
                    recursiveDisplay(Assignmentsingle);
                }
            } else { 
                recursiveDisplay(AssignmentCollection);
            }
        } else {
            Iterator it = AssignmentCollection.iterator();
            if (it.hasNext()) {
                Assignment Assignmentsingle = (Assignment) it.next();
                displayAboveTarget(Assignmentsingle, pathToTarget, findAll);
            }
        }
    }

    /**
     * Displays domain object which lies above the target in the object selection.
     * @param AssignmentObject the domain object to display
     * @param pathToTarget a list of nodes representing the path to the target
     * @param findAll if <code>true</code> the display is a result of a find 
     * all action. CursorCommon.pre
     */
    public void displayAboveTarget(Assignment AssignmentObject, List pathToTarget, boolean findAll) {
        if (pathToTarget.size() == 1 && pathToTarget.get(0) == this) {
            recursiveDisplay(AssignmentObject);
        } else {
            pathToTarget.remove(this);
            display(AssignmentObject);
        }
    }


    public void mergeAssociations(Object domainObject, List pathToTarget, boolean error) {
        mergeAssociations((Assignment) domainObject, pathToTarget,error);
    }


    /**
     * Internal use.
     * Merges the association on the specified parent object
     * @param parentObject the parent object
     * @param pathToTarget the list representing path to target
     */
    protected void mergeAssociations(Assignment parentObject, List pathToTarget,boolean error) {
        pathToTarget.remove(this);

        if (pathToTarget.size() <= 1) {      
            Object targetNode = pathToTarget.size() > 0 ? pathToTarget.get(0) : null;
            return;
        }

        // Since pathToTarget is destroyed on the way, keep a reference
        // to the node next in line.
        Object nextOnPath = pathToTarget.get(0);

        // Merge next node on path befor other children (depth first)

       // Replace children not on path with stored children.
   }

    /** 
     * Recursivly displays the object representing the Assignment-role.
     * First, the object is displayed, then, each child is displayed. 
     *
     * @param someAssignment the (domain) object to display.
     */
    public void recursiveDisplay(Assignment someAssignment) {
        if (callHookBeforeDisplay(someAssignment, "Assignment")) {
            if (someAssignment == null) {
                return; // nothing more to display!
            }
            display(someAssignment);
        }
    }

    /**
     * Recursive obtains this node
     * @param pathToTarget the path to the target node
     * @param singleObtain a boolean used to flag if more-related should be
     *        obtained as many or just the one (defaults to true)
     * @return the obtained object
     */
    public Object recursiveObtainObject(List pathToTarget, boolean singleObtain) {
        return (Object) recursiveObtain(pathToTarget, singleObtain);
    }

    public Object recursiveObtainObject(List pathToTarget) {
        return (Object) recursiveObtain(pathToTarget, true);
    }

    /**
     * Recursivly obtains the Assignment from the dialog.
     * If the Assignment is previously displayed and is unchanged, 
     * no obtain is performed, and the returned value is null. The <code>singleObtain</code>
     * parameter is used to singal if obtain from more-related should be done on edit fields, 
     * or the entire set of domain objects (e.g the listblock).
     * @param pathToTarget a list of nodes representing the path to the target.
     * @param singleObtain if <code>true</code>, obtain on more-related is done from edit-fields.
     * @return the obtained Assignment object.
     */
    public Assignment recursiveObtain(List pathToTarget, boolean singleObtain) {
        return recursiveObtain(pathToTarget, singleObtain, false);
    }

    /**
     * Recursivly obtains the Assignment from the dialog.
     * If the Assignment is previously displayed and is unchanged, the
     * no obtain is performed, and the returned value is null. The <code>singleObtain</code>
     * parameter is used to singal if obtain from more-related should be done on edit fields, 
     * or the entire set of domain objects (e.g the listblock).
     * @param pathToTarget a list of nodes representing the path to the target.
     * @param singleObtain if <code>true</code>, obtain on more-related is done from edit-fields.
     * @param forceObtain if <code>true</code> obtain is always done.
     * @return the obtained Assignment object.
     */
    public Assignment recursiveObtain(List pathToTarget, boolean singleObtain, boolean forceObtain) {
        boolean hasValue = forceObtain || getState() != ObjectSelectionNode.CLEARED;
        pathToTarget.remove(this);
        boolean belowTarget = pathToTarget.size() == 0;
        Assignment theAssignmentSingle = null;
        if (hasValue) {
            theAssignmentSingle = obtain();
            saveAssociations(theAssignmentSingle);
            removeAssociations(theAssignmentSingle);
        }
        return theAssignmentSingle;
    }
    public void setAssociation(Object self, String associationRoleName, 
            Object association) {

        Assignment member = (Assignment) self;
        // Might be generated empty - silence compiler warnings
        if (member != null) {
            member = null;
        }
    }
    public boolean isNavigableToParent() {
        return false;
    }


    private void saveAssociations(Assignment parentObject) {
        // might be generated empty, silience any warnings...
        int foo = 0;
        foo++;
    }


    private void removeAssociations(Assignment parentObject) {
        // might be generated empty, silence any warnings...
        int foo = 0;
        foo++;
    }

    /**
     * Internal use.
     * Creates a shallow copy of the specified instance.
     * @param fromObject the object to copy from
     * @return a new, copied instance
     */
    public Assignment createObjectCopy(Assignment fromObject) {
        Assignment retVal = new Assignment();
        retVal.setAssignmentText(fromObject.getAssignmentText());
        retVal.setId(fromObject.getId());
        return retVal;
    }
    /**
     * Inserts the specified instance in the specified listblock line.
     * @param obj the object to insert
     * @param line the line to insert in.
     */
    public void insertInListblockLine(Assignment obj, ListblockLine line) {
        if (obj == null) {
            return;
        }
        line.insertObject("Assignment", obj);
    }


    public void resetAssociations(Object o) {
        resetAssociations((Assignment) o);
    }


    private void resetAssociations(Assignment rootObject) {
        if (rootObject == null) {
            return;
        }
        // might be generated empty - silience any warnings:
        int foo = 0;
        foo++;
    }       
}
