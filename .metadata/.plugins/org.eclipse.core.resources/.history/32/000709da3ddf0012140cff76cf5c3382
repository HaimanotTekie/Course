// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package no.course.dialog.addstudentstocourse;
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
import no.course.domain.Course;
import no.course.domain.Student;
import no.course.domain.StudentCourse;

/** 
 * Access methods for studentCourses. Use variable thestudentCourses to access
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
public class StudentCoursesMethods extends AbstractNode<StudentCourse> {

    AddStudentsToCourseDefaultView view;
    GenovaEnums genovaEnums;
    AddStudentsToCourseDefaultController controller;
    ObjectSelectionNode parentNode;
    List childNodes = new ArrayList();
    StudentCoursesMethods(AddStudentsToCourseDefaultView view, AddStudentsToCourseDefaultController controller, GenovaEnums genovaEnums) {
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
        return "studentCourses";
    }


    public void addChild(ObjectSelectionNode child) {
        childNodes.add(child);
    }
    public boolean callHookBeforeDisplay(Object objectToDisplay, String roleName) {
       return controller.hookBeforeDisplay(objectToDisplay, roleName);
    }


    public boolean callCheckSaveHook() {
        return controller.callCheckSaveHook("studentCourses");
    }


    public boolean callCheckDeleteHook() {
        return controller.callCheckDeleteHook("studentCourses");
    }


    public boolean callCheckCloseHook() {
        return controller.callCheckCloseHook("studentCourses");
    }


    public boolean callCheckClearHook() {
        return controller.callCheckClearHook("studentCourses");
    }


    public boolean callCheckFindHook() {
        return controller.callCheckFindHook("studentCourses");
    }


    public boolean callCheckChangeHook() {
        return controller.callCheckChangeHook("studentCourses");
    }


    public boolean callCheckRowSelectHook(int currentSelectionIndex, int newSelectionIndex) {
        return controller.callCheckRowSelectHook("studentCourses", currentSelectionIndex, newSelectionIndex);
    }


    public GenovaDialogController getController() {
        return controller;
    }


    /**
     * Returns an object representing the relation studentCourses from the
     * dialog. This method does exactly the same as {@link #obtain()}, and
     * differs only in the return type, specified in the interface.
     * @return Object of StudentCourse with attributes from the OS.
     */
    public Object obtainAsObject() {
        return obtain();
    }    
    public Object getEmptyDomainObject() {
        return new StudentCourse();
    }
    public Class getRepresentingClass() {
        return StudentCourse.class;
    }
    /** 
     * Returns an object representing the relation studentCourses from the
     * dialog. If studentCourses is displayed in the dialog, 
     * the studentCourses domain object is used, else a new studentCourses object 
     * is created. Attributes present in the dialog are then 
     * copied into the studentCourses object. 
     * 
     * <p>Before returning, the controller's hookAfterObtainstudentCourses method 
     * is invoked, giving the application programmer 
     * the possibility to manipulate or replace the object.
     * 
     * @return Object of StudentCourse updated from the dialog.
     */
    public StudentCourse obtain() {
        if (objectProxy == null) {
            StudentCourse tmpstudentCourses = new StudentCourse();
            objectProxy = controller
                    .getProxy(tmpstudentCourses, "studentCourses");
        }
        objectProxy.setAttribute
            ("id", view.studentCourses_id.getValue());

       StudentCourse obtainedObject = (StudentCourse) objectProxy.getObject();
       StudentCourse manipulated = controller.hookAfterObtainstudentCourses(obtainedObject);
       if (manipulated != null) {
           obtainedObject = manipulated;
       }
       return obtainedObject;
    }

    public String obtain(String attr) {
        attr = TypeTool.stripRoleNamePrefix(attr, getRoleName());
        if ("id".equals(attr)) {
            return view.studentCourses_id.format();
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
        if (domainObject instanceof StudentCourse) {
            display((StudentCourse) domainObject);
        }
    }

   /**
    * Updates data of the StudentCourse node in the dialog, and sets
    * the state to CLEAN.
    *
    * @param tmpstudentCourses Attributes are copied from this object.
    */
    public void display(StudentCourse tmpstudentCourses) {
        if (!SwingUtilities.isEventDispatchThread()) {
            displayOnEDT(tmpstudentCourses);
            return;
        }
        if (tmpstudentCourses == null) {
            tmpstudentCourses= new StudentCourse();
        }
        controller.resetProxy();
        objectProxy = controller.getNewProxy(tmpstudentCourses, "studentCourses");
        boolean resetState = true;
        display("id", TypeTool.toObject(tmpstudentCourses.getId()), resetState);
        setState(ObjectSelectionNode.CLEAN, false);
    }
    public boolean isConsistant() {
    if(!TypeTool.isConsistant(view.studentCourses_id.getText(), oldstudentCourses.getId())) {
        return false;
    }
        return true;
     }    

    public boolean hasValue() {
    if(view.studentCourses_id.getText() == null || view.studentCourses_id.getText().length() == 0) {
        return false;
    }
       return true;
    }
    public boolean hasOneValue() {
    if(view.studentCourses_id.getText() != null && view.studentCourses_id.getText().trim().length() > 0) {
        return true;
    }
       return false;
    }

    public boolean hasValue(String field) {
        field = TypeTool.stripRoleNamePrefix(field, getRoleName());
    if(field.equals("id") && (view.studentCourses_id.getText() == null || view.studentCourses_id.getText().length() == 0)) {
        return false;
    }
       return true;
    }

    public void setStyle(Color foreground, Color background) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setStyleOnEDT(foreground, background);
            return;
        }
    view.studentCourses_id.setForeground(foreground);
    view.studentCourses_id.setBackground(background);
    }
    public void osDisplay(Object value, String attribute, 
            boolean resetState) {
        if (value instanceof StudentCourse) {
            display(((StudentCourse) value), attribute, resetState);
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
        if ("id".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.studentCourses_id.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.studentCourses_id.setInitialValue(valueObject);
            }
            view.studentCourses_id.setValue(valueObject);
            view.studentCourses_id.setCaretPosition(0);
        }
        view.noFocusException--;
    }

    /**
     * Updates data of given attriubte in object selection in the dialog.
     *
     * @param tmpstudentCourses Attributes are copied from this object.
     * @param s The attribute to set.
     */
    public void display(StudentCourse tmpstudentCourses, String s) {
        display(tmpstudentCourses, s, true);
    }

    @Override
    public void display(StudentCourse tmpstudentCourses, String attributeName, boolean resetState) {
        if (!SwingUtilities.isEventDispatchThread()){
            displayOnEDT(tmpstudentCourses, attributeName, resetState);
            return;
        }
        attributeName = TypeTool
                .stripRoleNamePrefix(attributeName, getRoleName());
       if (tmpstudentCourses != null) {
           Object value = null;
            if (attributeName.equals("id")) {
                value = TypeTool.toObject(tmpstudentCourses.getId());
            }
           display(attributeName, value, resetState);
       }
    }
    boolean zerostudentCoursesid = false;
    /**
     * @param s the name of the attribute
     * @param val the setShowZero property
     * @deprecated - use display rules to set this display rule.
     */
    public void setShowZero(String s, boolean val) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
       val = !val;
    if(s.equals("id")) {
        zerostudentCoursesid = val;
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
    view.studentCourses_id.setInitialValue(null);
    view.oldValuestudentCoursesid = "";
    view.studentCourses_id.setValue(null);
    view.studentCourses_id.resetState();
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
        view.noFocusException--;
    }
    public void clear(String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            clearOnEDT(s);
            return;
        }
        view.noFocusException++;
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("id")) {
        view.oldValuestudentCoursesid = "";
        view.studentCourses_id.setInitialValue(null);
        view.studentCourses_id.setValue(null);
        view.studentCourses_id.resetState();
    }
        view.noFocusException--;
    }
    public void setEnabled(boolean b) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setEnabledOnEDT(b);
            return;
        }
    view.studentCourses_id.setEnabled(b);
    }
    public void setEnabled(boolean b, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setEnabledOnEDT(b, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("id")) {
        view.studentCourses_id.setEnabled(b);
    }
    }
    public boolean isEnabled() {
        boolean b = false;
    if (view.studentCourses_id.isEnabled()) b=true;
       return b;
    }
    public boolean isEnabled(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (s.equals("id")) {
        if (view.studentCourses_id.isEnabled()) b=true;
    }
       return b;
    }
    public void setShown(boolean b) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setShownOnEDT(b);
            return;
        }
    view.studentCourses_id.setVisible(b);
    
    /* Her kommer generert kode for SimpleBlock:setShown*/
    
    view.StudentCoursesClass.setVisible(b);
    }
    public void setShown(boolean b, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setShownOnEDT(b, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("id")) {
        view.studentCourses_id.setVisible(b);
    }
    
    /* Her kommer generert kode for SimpleBlock:setShownField*/
    
    if (s.equals("StudentCoursesClass")) {
        view.StudentCoursesClass.setVisible(b);
    }
    }
    public boolean isShown() {
        boolean b = false;
    if (view.studentCourses_id.isEnabled()) b=true;
        return b;
    }
    public boolean isShown(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (s.equals("id")) {
        if (view.studentCourses_id.hasFocus()) b=true;
    }
    
    /* Her kommer generert kode for SimpleBlock:isShown*/
    
    if (view.StudentCoursesClass.isEnabled()) b=true;
    
    /* Her kommer generert kode for SimpleBlock:isShownField*/
    
    if (s.equals("StudentCoursesClass")) {
        if (view.StudentCoursesClass.hasFocus()) b=true;
    }
       return b;
    }

    public void setFocus(String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setFocusOnEDT(s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("id")) {
        view.studentCourses_id.requestFocusInWindow();
    }
    }
    public boolean hasFocus(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (view.studentCourses_id.hasFocus()) b=true;
        return b;
    }
    @Override
    public void append(StudentCourse tmpstudentCourses, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            appendOnEDT(tmpstudentCourses, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        view.noFocusException++;
        if(tmpstudentCourses == null) {
            tmpstudentCourses= new StudentCourse();
        }
        view.noFocusException--;
    }
    /** Resets current state of relation studentCourses in the dialog. Sets changed to false and sets old object to be the current object. 
     * @return Reference to the object that was the new object, that now is the old. 
     */
    public StudentCourse reset() {
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
        if ("id".equals(attributeName)) {
            return true;
        }

        return false;
   }  
    private StudentCourse oldstudentCourses = new StudentCourse();
    private boolean isMarkedChanged = false;
    
    
    /** Sets the old version of the object selection node.
     * NOTE: The object is not copied, it is referenced.
     * @param inst The new object to be used as the old. 
     * 
     */
    public void setOld(StudentCourse inst) {
        oldstudentCourses = inst;
    }
    
    
   /** 
    * Returns the old object. The object is not copied.
    * @return The object.
    */
    public StudentCourse getOld() {
        return oldstudentCourses;
    }
    
    
    /**
     * Returns the string representing the main key attribute of this role.
     * @return the main key
     */
    public String getTargetMainKey() {
        return "id";
    }
    boolean isMarkedChangedid = false;
    public void setChanged (boolean b, String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());        
    if (s.equals("id")) {
        isMarkedChangedid = b;
    }    
     }
    public void setChanged(boolean b) {
        isMarkedChanged = b;
    isMarkedChangedid = b;
     }
    /** 
     * Returns whether studentCourses has changed state since last 
     * call on resetstudentCourses().<br>
     * It will both parse the current state of the block
     * and compare with the dialogattribute named in input String s.
     * @param s The attribute to check.
     * @param tmpstudentCourses The object to compare with.
     * @return True if changed, false if not.
     * @deprecated use ObjectSelectionNode#isChanged(String)
     */
    public boolean isChanged(String s, StudentCourse tmpstudentCourses) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean bChanged = false;
        if(isMarkedChanged) return true;
    if (s.equals("id")) {
        if (isMarkedChangedid) bChanged = true;
        if (tmpstudentCourses != null && oldstudentCourses != null) {
        if (!TypeTool.equals(tmpstudentCourses.getId(), oldstudentCourses.getId())) {
            bChanged = true;
            isMarkedChangedid = true;
            }
        }
    }    
         return bChanged;
     }
    
    
    /** 
     * Returns whether studentCourses has changed state since last call on
     * resetstudentCourses().  It will both parse the current state of the
     * block and compare with the dialogattributes of tmpstudentCourses.  
     * @param tmpstudentCourses The object to compare with.
     * @return <code>true</code> if changed, <code>false</code> if not.
     * @deprecated use ObjectSelection#getState()
     */
    public boolean isChanged(StudentCourse tmpstudentCourses) {
        if(isMarkedChanged) return true;
    if (isMarkedChangedid) isMarkedChanged = true;
    if (oldstudentCourses != null) {
        if (!TypeTool.equals(tmpstudentCourses.getId(), oldstudentCourses.getId())) {
            isMarkedChanged = true;
            isMarkedChangedid = true;
        }
    }
    if(false) {
        tmpstudentCourses.getClass();
    }
        return isMarkedChanged;
    }

    public Set getChangedFields() {
        Set changedFields = new HashSet();
        Object component = null;

        component = controller.view.fromNameToComponent("studentCourses.id");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("id");
            }
        }

        return changedFields;
    }

    public Set getChangedKeyFields() {
        Set changedFields = new HashSet();
        Object component = null;

        if (isPartOfKey("id")) {
            component = controller.view.fromNameToComponent("studentCourses.id");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("id");
                }
            }
        }

        return changedFields;
    }

    public void resetFields() {
        Object component = null;

        component = controller.view.fromNameToComponent("studentCourses.id");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
    }
    
    /**
     * Displays domain objects which lies above the target in the object selection.
     * @param studentCoursesCollection the collection of domain objects to display
     * @param pathToTarget a list of nodes representing the path to the target
     * @param findAll if <code>true</code> displaying is done as part of 
     *      a find all action.
     */
    public void displayAboveTarget(Collection studentCoursesCollection, List pathToTarget, boolean findAll) {
        if (pathToTarget.size() == 1 && pathToTarget.get(0) == this) {
            if (!findAll && studentCoursesCollection instanceof List) {
                Iterator it = studentCoursesCollection.iterator();
                if (it.hasNext()) {
                    StudentCourse studentCoursessingle = (StudentCourse) it.next();
                    recursiveDisplay(studentCoursessingle);
                }
            } else { 
                recursiveDisplay(studentCoursesCollection);
            }
        } else {
            Iterator it = studentCoursesCollection.iterator();
            if (it.hasNext()) {
                StudentCourse studentCoursessingle = (StudentCourse) it.next();
                displayAboveTarget(studentCoursessingle, pathToTarget, findAll);
            }
        }
    }

    /**
     * Displays domain object which lies above the target in the object selection.
     * @param studentCoursesObject the domain object to display
     * @param pathToTarget a list of nodes representing the path to the target
     * @param findAll if <code>true</code> the display is a result of a find 
     * all action. CursorCommon.pre
     */
    public void displayAboveTarget(StudentCourse studentCoursesObject, List pathToTarget, boolean findAll) {
        if (pathToTarget.size() == 1 && pathToTarget.get(0) == this) {
            recursiveDisplay(studentCoursesObject);
        } else {
            pathToTarget.remove(this);
            display(studentCoursesObject);
            boolean studentupRelated = true;
            if (studentupRelated || pathToTarget.contains(controller.thestudent)) {
                Object child = null;
                if (studentCoursesObject != null) {
                    child = studentCoursesObject.getStudent();
                }
                if (child instanceof Student) {
                    Student childStudent = (Student) child;
                    controller.thestudent.displayAboveTarget
                            (childStudent, pathToTarget, findAll);
                } else if (child instanceof Collection) {
                    Collection childCollection = (Collection) child;
                    controller.thestudent.displayAboveTarget
                            (childCollection, pathToTarget, findAll);
                }
            }
        }
    }


    public void mergeAssociations(Object domainObject, List pathToTarget, boolean error) {
        mergeAssociations((StudentCourse) domainObject, pathToTarget,error);
    }


    /**
     * Internal use.
     * Merges the association on the specified parent object
     * @param parentObject the parent object
     * @param pathToTarget the list representing path to target
     */
    protected void mergeAssociations(StudentCourse parentObject, List pathToTarget,boolean error) {
        pathToTarget.remove(this);

        if (pathToTarget.size() <= 1) {      
            Object targetNode = pathToTarget.size() > 0 ? pathToTarget.get(0) : null;

            // Check  student's associations.
            // It's up related, so don't replace it.
            Object dbstudent = parentObject.getStudent();
            if (dbstudent != null && !(controller.thestudent == targetNode && error)) {
                controller.thestudent.mergeAssociations(dbstudent, pathToTarget,error);
            }
            return;
        }

        // Since pathToTarget is destroyed on the way, keep a reference
        // to the node next in line.
        Object nextOnPath = pathToTarget.get(0);

        // Merge next node on path befor other children (depth first)
        if (controller.thestudent == nextOnPath) {
            Object dbstudent = parentObject.getStudent();
            controller.thestudent.mergeAssociations(dbstudent, pathToTarget,error);
        }

       // Replace children not on path with stored children.
        if (controller.thestudent != nextOnPath) {
            // Check  student's associations.
            // It's up related, so don't replace it.
            Object dbstudent = parentObject.getStudent();
            if (dbstudent != null) {
                controller.thestudent.mergeAssociations(dbstudent, pathToTarget,error);     
            }
        }
   }

    /** 
     * Recursivly displays the object representing the studentCourses-role.
     * First, the object is displayed, then, each child is displayed. 
     *
     * @param somestudentCourses the (domain) object to display.
     */
    public void recursiveDisplay(StudentCourse somestudentCourses) {
        if (callHookBeforeDisplay(somestudentCourses, "studentCourses")) {
            if (somestudentCourses == null) {
                return; // nothing more to display!
            }
            display(somestudentCourses);
        }
        Object objectstudent = somestudentCourses.getStudent();
        if (objectstudent instanceof Student) {
            Student tmp = (Student) objectstudent;
            controller.thestudent.recursiveDisplay(tmp);
        } else if (objectstudent instanceof Collection) {
            Collection tmp = (Collection) objectstudent;
            controller.thestudent.recursiveDisplay(tmp);
        }
    }
    /**
     * Displays a Collection of studentCourses objects.
     * Each instance of studentCourses is inserted in the corresponding
     * list block (StudentCoursesList).
     * @param studentCoursesCollection the Collection containing the (domain) objects to display.
     */
    public void recursiveDisplay(Collection studentCoursesCollection) {
        controller.listblockMethodsStudentCoursesList.purgeAllLines();
        Iterator it = studentCoursesCollection.iterator();
        List allLines = TypeTool.getDefaultList();
        while (it.hasNext()) {
            StudentCourse studentCoursesObject = (StudentCourse) it.next();
            LineListblockStudentCoursesList line = controller
                .listblockMethodsStudentCoursesList
                    .createListblockLine();
            insertInListblockLine(studentCoursesObject, line);
            if (controller.listblockMethodsStudentCoursesList
                    .callHooksBeforeInsert(line)) {
                allLines.add(line);
            }
        }
        controller.listblockMethodsStudentCoursesList.initialSort(allLines);
        it = allLines.iterator();
        while (it.hasNext()) {
            LineListblockStudentCoursesList line = (LineListblockStudentCoursesList) it.next();
            controller.listblockMethodsStudentCoursesList
                    .insertListblockLine(line);
        }
        controller.listblockMethodsStudentCoursesList.forceClean();
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
     * Obtains a Set of studentCourses objects from the StudentCoursesList listblock.
     * Note that roles that are not represented in a coluumn will not
     * be created (compatible with old version). Other roles will
     * be created.
     * @return the obtained set of studentCourses objects
     * @deprecated use {@link #obtainSet(boolean)} instead.
     */
    public Set obtainSet() {
        Set studentCoursesSet = TypeTool.getDefaultSet();
        List allLines = controller.listblockMethodsStudentCoursesList.allLines();
        Iterator it = allLines.iterator();
        while (it.hasNext()) {
            LineListblockStudentCoursesList line = (LineListblockStudentCoursesList) it.next();
            Object o = null;
            o = line.getObject("studentCourses");
            if (o != null) {
                studentCoursesSet.add(o);
            }
        }
        return studentCoursesSet;
    }


    /**
     * Obtains a Set of studentCourses objects from the StudentCoursesList listblock. The
     * parameter controlls wheter objects are created when getting them from 
     * the listblock line or not.
     * @param createIfNull if <code>true</code> objects are created.
     * @return the obtained set of studentCourses objects.
     * @see ListblockLine#getObject(String, boolean)
     */
    public Set obtainSet(boolean createIfNull) {
        Set studentCoursesSet = TypeTool.getDefaultSet();
        List allLines = controller.listblockMethodsStudentCoursesList.allLines();
        Iterator it = allLines.iterator();
        while (it.hasNext()) {
            LineListblockStudentCoursesList line = (LineListblockStudentCoursesList) it.next();
            Object o = null;
            o = line.getObject("studentCourses", createIfNull);
            if (o != null) {
                studentCoursesSet.add(o);
            }
        }
        return studentCoursesSet;
    }

    /**
     * Recursivly obtains a Set of  studentCourses objects from the dialog.
     * Depending on the position of this node in regards to the target node, 
     * the set is either obtained from the corresponding list block, or from
     * the edit fields, unless <code>singleObtain</code> is <code>true</code>. If 
     * so the set is always obtained from the edit fields.
     * @param pathToTarget a list of nodes representing the path to the target.
     * @param singleObtain if set to <code>true</code> obtain is always done from edit fields.
     * @return the obtained Set of studentCourses objects.
     */
    public Set recursiveObtain(List pathToTarget, boolean singleObtain) {
        Set thestudentCoursesSet = TypeTool.getDefaultSet();
        if (pathToTarget.size() == 0 && !singleObtain) {
            thestudentCoursesSet = obtainSet(false);
        } else {
            boolean hasValue = getState() != ObjectSelectionNode.CLEARED;
            pathToTarget.remove(this);
            boolean belowTarget = pathToTarget.size() == 0;
        Student thestudentSingle = null;
        boolean isstudentUpRelated = true;
        boolean isstudentOnPath = pathToTarget.contains(controller.thestudent);
        if (isstudentUpRelated || belowTarget || isstudentOnPath) {

            thestudentSingle = controller.thestudent.recursiveObtain(pathToTarget, singleObtain);
            hasValue = hasValue || thestudentSingle != null;
        }
            if (hasValue) {
                StudentCourse thestudentCoursesSingle = obtain();
                saveAssociations(thestudentCoursesSingle);
                removeAssociations(thestudentCoursesSingle);
            if (isstudentUpRelated || belowTarget || isstudentOnPath) {

                thestudentCoursesSingle.setStudent(thestudentSingle);
                Set thestudentCoursesTmp = TypeTool.getDefaultSet();
                thestudentCoursesTmp.add(thestudentCoursesSingle);
                 if (thestudentSingle != null) {
                    thestudentSingle.setStudentCourses(thestudentCoursesTmp);
                }
            }
                thestudentCoursesSet.add(thestudentCoursesSingle);
            }
        }
        return thestudentCoursesSet;
    }
    public boolean inListblock() {
        return true;
    }        
    public void setAssociation(Object self, String associationRoleName, 
            Object association) {

        StudentCourse member = (StudentCourse) self;
        if ("Course".equals(associationRoleName)) {
            Course parent = (Course) association;
            member.setCourse(parent);
            return;
        }
        if ("student".equals(associationRoleName)) {
            member.setStudent((Student) association);
            return;
        }
        // Might be generated empty - silence compiler warnings
        if (member != null) {
            member = null;
        }
    }
    public boolean isNavigableToParent() {
        return true;
    }


    private void saveAssociations(StudentCourse parentObject) {
        // might be generated empty, silience any warnings...
        int foo = 0;
        foo++;
    }


    private void removeAssociations(StudentCourse parentObject) {
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
    public StudentCourse createObjectCopy(StudentCourse fromObject) {
        StudentCourse retVal = new StudentCourse();
        retVal.setId(fromObject.getId());
        return retVal;
    }
    /**
     * Inserts the specified instance in the specified listblock line.
     * @param obj the object to insert
     * @param line the line to insert in.
     */
    public void insertInListblockLine(StudentCourse obj, ListblockLine line) {
        if (obj == null) {
            return;
        }
        line.insertObject("studentCourses", obj);
        Object ostudent = null;
        ostudent =  obj.getStudent();
        Student studentObject = null;
        if (ostudent instanceof Student) {
           studentObject = (Student) ostudent;
        }
        controller.thestudent.insertInListblockLine(studentObject, line);
    }
}
