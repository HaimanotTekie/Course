// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package no.course.dialog.choosestudents;
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
import no.course.domain.Student;

/** 
 * Access methods for Student. Use variable theStudent to access
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
public class StudentMethods extends AbstractNode<Student> {

    ChooseStudentsDefaultView view;
    GenovaEnums genovaEnums;
    ChooseStudentsDefaultController controller;
    ObjectSelectionNode parentNode;
    List childNodes = new ArrayList();
    StudentMethods(ChooseStudentsDefaultView view, ChooseStudentsDefaultController controller, GenovaEnums genovaEnums) {
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
        return "Student";
    }


    public void addChild(ObjectSelectionNode child) {
        childNodes.add(child);
    }
    public boolean callHookBeforeDisplay(Object objectToDisplay, String roleName) {
       return controller.hookBeforeDisplay(objectToDisplay, roleName);
    }


    public boolean callCheckSaveHook() {
        return controller.callCheckSaveHook("Student");
    }


    public boolean callCheckDeleteHook() {
        return controller.callCheckDeleteHook("Student");
    }


    public boolean callCheckCloseHook() {
        return controller.callCheckCloseHook("Student");
    }


    public boolean callCheckClearHook() {
        return controller.callCheckClearHook("Student");
    }


    public boolean callCheckFindHook() {
        return controller.callCheckFindHook("Student");
    }


    public boolean callCheckChangeHook() {
        return controller.callCheckChangeHook("Student");
    }


    public boolean callCheckRowSelectHook(int currentSelectionIndex, int newSelectionIndex) {
        return controller.callCheckRowSelectHook("Student", currentSelectionIndex, newSelectionIndex);
    }


    public GenovaDialogController getController() {
        return controller;
    }


    /**
     * Returns an object representing the relation Student from the
     * dialog. This method does exactly the same as {@link #obtain()}, and
     * differs only in the return type, specified in the interface.
     * @return Object of Student with attributes from the OS.
     */
    public Object obtainAsObject() {
        return obtain();
    }    
    public Object getEmptyDomainObject() {
        return new Student();
    }
    public Class getRepresentingClass() {
        return Student.class;
    }
    /** 
     * Returns an object representing the relation Student from the
     * dialog. If Student is displayed in the dialog, 
     * the Student domain object is used, else a new Student object 
     * is created. Attributes present in the dialog are then 
     * copied into the Student object. 
     * 
     * <p>Before returning, the controller's hookAfterObtainStudent method 
     * is invoked, giving the application programmer 
     * the possibility to manipulate or replace the object.
     * 
     * @return Object of Student updated from the dialog.
     */
    public Student obtain() {
        if (objectProxy == null) {
            Student tmpStudent = new Student();
            objectProxy = controller
                    .getProxy(tmpStudent, "Student");
        }
        objectProxy.setAttribute
            ("age", view.Student_age.getValue());
        objectProxy.setAttribute
            ("name", view.Student_name.getValue());
        objectProxy.setAttribute
            ("studentNr", view.Student_studentNr.getValue());

       Student obtainedObject = (Student) objectProxy.getObject();
       Student manipulated = controller.hookAfterObtainStudent(obtainedObject);
       if (manipulated != null) {
           obtainedObject = manipulated;
       }
       return obtainedObject;
    }

    public String obtain(String attr) {
        attr = TypeTool.stripRoleNamePrefix(attr, getRoleName());
        if ("age".equals(attr)) {
            return view.Student_age.format();
        }
        if ("name".equals(attr)) {
            return view.Student_name.format();
        }
        if ("studentNr".equals(attr)) {
            return view.Student_studentNr.format();
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
        if (domainObject instanceof Student) {
            display((Student) domainObject);
        }
    }

   /**
    * Updates data of the Student node in the dialog, and sets
    * the state to CLEAN.
    *
    * @param tmpStudent Attributes are copied from this object.
    */
    public void display(Student tmpStudent) {
        if (!SwingUtilities.isEventDispatchThread()) {
            displayOnEDT(tmpStudent);
            return;
        }
        if (tmpStudent == null) {
            tmpStudent= new Student();
        }
        controller.resetProxy();
        objectProxy = controller.getNewProxy(tmpStudent, "Student");
        boolean resetState = true;
        display("age", TypeTool.toObject(tmpStudent.getAge()), resetState);
        display("name", TypeTool.toObject(tmpStudent.getName()), resetState);
        display("studentNr", TypeTool.toObject(tmpStudent.getStudentNr()), resetState);
        setState(ObjectSelectionNode.CLEAN, false);
    }
    public boolean isConsistant() {
    if(!TypeTool.isConsistant(view.Student_age.getText(), oldStudent.getAge())) {
        return false;
    }
    if(!TypeTool.isConsistant(view.Student_name.getText(), oldStudent.getName())) {
        return false;
    }
    if(!TypeTool.isConsistant(view.Student_studentNr.getText(), oldStudent.getStudentNr())) {
        return false;
    }
        return true;
     }    

    public boolean hasValue() {
    if(view.Student_age.getText() == null || view.Student_age.getText().length() == 0) {
        return false;
    }
    if(view.Student_name.getText() == null || view.Student_name.getText().length() == 0) {
        return false;
    }
    if(view.Student_studentNr.getText() == null || view.Student_studentNr.getText().length() == 0) {
        return false;
    }
       return true;
    }
    public boolean hasOneValue() {
    if(view.Student_age.getText() != null && view.Student_age.getText().trim().length() > 0) {
        return true;
    }
    if(view.Student_name.getText() != null && view.Student_name.getText().trim().length() > 0) {
        return true;
    }
    if(view.Student_studentNr.getText() != null && view.Student_studentNr.getText().trim().length() > 0) {
        return true;
    }
       return false;
    }

    public boolean hasValue(String field) {
        field = TypeTool.stripRoleNamePrefix(field, getRoleName());
    if(field.equals("age") && (view.Student_age.getText() == null || view.Student_age.getText().length() == 0)) {
        return false;
    }
    if(field.equals("name") && (view.Student_name.getText() == null || view.Student_name.getText().length() == 0)) {
        return false;
    }
    if(field.equals("studentNr") && (view.Student_studentNr.getText() == null || view.Student_studentNr.getText().length() == 0)) {
        return false;
    }
       return true;
    }

    public void setStyle(Color foreground, Color background) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setStyleOnEDT(foreground, background);
            return;
        }
    view.Student_age.setForeground(foreground);
    view.Student_age.setBackground(background);
    view.Student_name.setForeground(foreground);
    view.Student_name.setBackground(background);
    view.Student_studentNr.setForeground(foreground);
    view.Student_studentNr.setBackground(background);
    }
    public void osDisplay(Object value, String attribute, 
            boolean resetState) {
        if (value instanceof Student) {
            display(((Student) value), attribute, resetState);
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
        if ("age".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.Student_age.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.Student_age.setInitialValue(valueObject);
            }
            view.Student_age.setValue(valueObject);
            view.Student_age.setCaretPosition(0);
        }
        if ("name".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.Student_name.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.Student_name.setInitialValue(valueObject);
            }
            view.Student_name.setValue(valueObject);
            view.Student_name.setCaretPosition(0);
        }
        if ("studentNr".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.Student_studentNr.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.Student_studentNr.setInitialValue(valueObject);
            }
            view.Student_studentNr.setValue(valueObject);
            view.Student_studentNr.setCaretPosition(0);
        }
        view.noFocusException--;
    }

    /**
     * Updates data of given attriubte in object selection in the dialog.
     *
     * @param tmpStudent Attributes are copied from this object.
     * @param s The attribute to set.
     */
    public void display(Student tmpStudent, String s) {
        display(tmpStudent, s, true);
    }

    @Override
    public void display(Student tmpStudent, String attributeName, boolean resetState) {
        if (!SwingUtilities.isEventDispatchThread()){
            displayOnEDT(tmpStudent, attributeName, resetState);
            return;
        }
        attributeName = TypeTool
                .stripRoleNamePrefix(attributeName, getRoleName());
       if (tmpStudent != null) {
           Object value = null;
            if (attributeName.equals("age")) {
                value = TypeTool.toObject(tmpStudent.getAge());
            }
            if (attributeName.equals("name")) {
                value = TypeTool.toObject(tmpStudent.getName());
            }
            if (attributeName.equals("studentNr")) {
                value = TypeTool.toObject(tmpStudent.getStudentNr());
            }
           display(attributeName, value, resetState);
       }
    }
    boolean zeroStudentage = false;
    boolean zeroStudentname = false;
    boolean zeroStudentstudentNr = false;
    /**
     * @param s the name of the attribute
     * @param val the setShowZero property
     * @deprecated - use display rules to set this display rule.
     */
    public void setShowZero(String s, boolean val) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
       val = !val;
    if(s.equals("age")) {
        zeroStudentage = val;
    }
    if(s.equals("name")) {
        zeroStudentname = val;
    }
    if(s.equals("studentNr")) {
        zeroStudentstudentNr = val;
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
    view.Student_age.setInitialValue(null);
    view.oldValueStudentage = "";
    view.Student_age.setValue(null);
    view.Student_age.resetState();
    view.Student_name.setInitialValue(null);
    view.oldValueStudentname = "";
    view.Student_name.setValue(null);
    view.Student_name.resetState();
    view.Student_studentNr.setInitialValue(null);
    view.oldValueStudentstudentNr = "";
    view.Student_studentNr.setValue(null);
    view.Student_studentNr.resetState();
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
        clear("age");
        clear("id");
        clear("name");
        clear("studentNr");
        view.noFocusException--;
    }
    public void clear(String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            clearOnEDT(s);
            return;
        }
        view.noFocusException++;
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("age")) {
        view.oldValueStudentage = "";
        view.Student_age.setInitialValue(null);
        view.Student_age.setValue(null);
        view.Student_age.resetState();
    }
    if (s.equals("name")) {
        view.oldValueStudentname = "";
        view.Student_name.setInitialValue(null);
        view.Student_name.setValue(null);
        view.Student_name.resetState();
    }
    if (s.equals("studentNr")) {
        view.oldValueStudentstudentNr = "";
        view.Student_studentNr.setInitialValue(null);
        view.Student_studentNr.setValue(null);
        view.Student_studentNr.resetState();
    }
        view.noFocusException--;
    }
    public void setEnabled(boolean b) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setEnabledOnEDT(b);
            return;
        }
    view.Student_age.setEnabled(b);
    view.Student_name.setEnabled(b);
    view.Student_studentNr.setEnabled(b);
    }
    public void setEnabled(boolean b, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setEnabledOnEDT(b, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("age")) {
        view.Student_age.setEnabled(b);
    }
    if (s.equals("name")) {
        view.Student_name.setEnabled(b);
    }
    if (s.equals("studentNr")) {
        view.Student_studentNr.setEnabled(b);
    }
    }
    public boolean isEnabled() {
        boolean b = false;
    if (view.Student_age.isEnabled()) b=true;
    if (view.Student_name.isEnabled()) b=true;
    if (view.Student_studentNr.isEnabled()) b=true;
       return b;
    }
    public boolean isEnabled(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (s.equals("age")) {
        if (view.Student_age.isEnabled()) b=true;
    }
    if (s.equals("name")) {
        if (view.Student_name.isEnabled()) b=true;
    }
    if (s.equals("studentNr")) {
        if (view.Student_studentNr.isEnabled()) b=true;
    }
       return b;
    }
    public void setShown(boolean b) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setShownOnEDT(b);
            return;
        }
    view.Student_age.setVisible(b);
    view.Student_name.setVisible(b);
    view.Student_studentNr.setVisible(b);
    }
    public void setShown(boolean b, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setShownOnEDT(b, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("age")) {
        view.Student_age.setVisible(b);
    }
    if (s.equals("name")) {
        view.Student_name.setVisible(b);
    }
    if (s.equals("studentNr")) {
        view.Student_studentNr.setVisible(b);
    }
    }
    public boolean isShown() {
        boolean b = false;
    if (view.Student_age.isEnabled()) b=true;
    if (view.Student_name.isEnabled()) b=true;
    if (view.Student_studentNr.isEnabled()) b=true;
        return b;
    }
    public boolean isShown(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (s.equals("age")) {
        if (view.Student_age.hasFocus()) b=true;
    }
    if (s.equals("name")) {
        if (view.Student_name.hasFocus()) b=true;
    }
    if (s.equals("studentNr")) {
        if (view.Student_studentNr.hasFocus()) b=true;
    }
       return b;
    }

    public void setFocus(String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setFocusOnEDT(s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("age")) {
        view.Student_age.requestFocusInWindow();
    }
    if (s.equals("name")) {
        view.Student_name.requestFocusInWindow();
    }
    if (s.equals("studentNr")) {
        view.Student_studentNr.requestFocusInWindow();
    }
    }
    public boolean hasFocus(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (view.Student_age.hasFocus()) b=true;
    if (view.Student_name.hasFocus()) b=true;
    if (view.Student_studentNr.hasFocus()) b=true;
        return b;
    }
    @Override
    public void append(Student tmpStudent, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            appendOnEDT(tmpStudent, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        view.noFocusException++;
        if(tmpStudent == null) {
            tmpStudent= new Student();
        }
        view.noFocusException--;
    }
    /** Resets current state of relation Student in the dialog. Sets changed to false and sets old object to be the current object. 
     * @return Reference to the object that was the new object, that now is the old. 
     */
    public Student reset() {
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
    private Student oldStudent = new Student();
    private boolean isMarkedChanged = false;
    
    
    /** Sets the old version of the object selection node.
     * NOTE: The object is not copied, it is referenced.
     * @param inst The new object to be used as the old. 
     * 
     */
    public void setOld(Student inst) {
        oldStudent = inst;
    }
    
    
   /** 
    * Returns the old object. The object is not copied.
    * @return The object.
    */
    public Student getOld() {
        return oldStudent;
    }
    
    
    /**
     * Returns the string representing the main key attribute of this role.
     * @return the main key
     */
    public String getTargetMainKey() {
        return "";
    }
    boolean isMarkedChangedage = false;
    boolean isMarkedChangedname = false;
    boolean isMarkedChangedstudentNr = false;
    public void setChanged (boolean b, String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());        
    if (s.equals("age")) {
        isMarkedChangedage = b;
    }    
    if (s.equals("name")) {
        isMarkedChangedname = b;
    }    
    if (s.equals("studentNr")) {
        isMarkedChangedstudentNr = b;
    }    
     }
    public void setChanged(boolean b) {
        isMarkedChanged = b;
    isMarkedChangedage = b;
    isMarkedChangedname = b;
    isMarkedChangedstudentNr = b;
     }
    /** 
     * Returns whether Student has changed state since last 
     * call on resetStudent().<br>
     * It will both parse the current state of the block
     * and compare with the dialogattribute named in input String s.
     * @param s The attribute to check.
     * @param tmpStudent The object to compare with.
     * @return True if changed, false if not.
     * @deprecated use ObjectSelectionNode#isChanged(String)
     */
    public boolean isChanged(String s, Student tmpStudent) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean bChanged = false;
        if(isMarkedChanged) return true;
    if (s.equals("age")) {
        if (isMarkedChangedage) bChanged = true;
        if (tmpStudent != null && oldStudent != null) {
        if (!TypeTool.equals(tmpStudent.getAge(), oldStudent.getAge())) {
            bChanged = true;
            isMarkedChangedage = true;
            }
        }
    }    
    if (s.equals("name")) {
        if (isMarkedChangedname) bChanged = true;
        if (tmpStudent != null && oldStudent != null) {
        if (!TypeTool.equals(tmpStudent.getName(), oldStudent.getName())) {
            bChanged = true;
            isMarkedChangedname = true;
            }
        }
    }    
    if (s.equals("studentNr")) {
        if (isMarkedChangedstudentNr) bChanged = true;
        if (tmpStudent != null && oldStudent != null) {
        if (!TypeTool.equals(tmpStudent.getStudentNr(), oldStudent.getStudentNr())) {
            bChanged = true;
            isMarkedChangedstudentNr = true;
            }
        }
    }    
         return bChanged;
     }
    
    
    /** 
     * Returns whether Student has changed state since last call on
     * resetStudent().  It will both parse the current state of the
     * block and compare with the dialogattributes of tmpStudent.  
     * @param tmpStudent The object to compare with.
     * @return <code>true</code> if changed, <code>false</code> if not.
     * @deprecated use ObjectSelection#getState()
     */
    public boolean isChanged(Student tmpStudent) {
        if(isMarkedChanged) return true;
    if (isMarkedChangedage) isMarkedChanged = true;
    if (oldStudent != null) {
        if (!TypeTool.equals(tmpStudent.getAge(), oldStudent.getAge())) {
            isMarkedChanged = true;
            isMarkedChangedage = true;
        }
    }
    if (isMarkedChangedname) isMarkedChanged = true;
    if (oldStudent != null) {
        if (!TypeTool.equals(tmpStudent.getName(), oldStudent.getName())) {
            isMarkedChanged = true;
            isMarkedChangedname = true;
        }
    }
    if (isMarkedChangedstudentNr) isMarkedChanged = true;
    if (oldStudent != null) {
        if (!TypeTool.equals(tmpStudent.getStudentNr(), oldStudent.getStudentNr())) {
            isMarkedChanged = true;
            isMarkedChangedstudentNr = true;
        }
    }
    if(false) {
        tmpStudent.getClass();
    }
        return isMarkedChanged;
    }

    public Set getChangedFields() {
        Set changedFields = new HashSet();
        Object component = null;

        component = controller.view.fromNameToComponent("Student.age");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("age");
            }
        }
        component = controller.view.fromNameToComponent("Student.name");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("name");
            }
        }
        component = controller.view.fromNameToComponent("Student.studentNr");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("studentNr");
            }
        }

        return changedFields;
    }

    public Set getChangedKeyFields() {
        Set changedFields = new HashSet();
        Object component = null;

        if (isPartOfKey("age")) {
            component = controller.view.fromNameToComponent("Student.age");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("age");
                }
            }
        }
        if (isPartOfKey("name")) {
            component = controller.view.fromNameToComponent("Student.name");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("name");
                }
            }
        }
        if (isPartOfKey("studentNr")) {
            component = controller.view.fromNameToComponent("Student.studentNr");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("studentNr");
                }
            }
        }

        return changedFields;
    }

    public void resetFields() {
        Object component = null;

        component = controller.view.fromNameToComponent("Student.age");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
        component = controller.view.fromNameToComponent("Student.name");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
        component = controller.view.fromNameToComponent("Student.studentNr");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
    }
    
    /**
     * Displays domain objects which lies above the target in the object selection.
     * @param StudentCollection the collection of domain objects to display
     * @param pathToTarget a list of nodes representing the path to the target
     * @param findAll if <code>true</code> displaying is done as part of 
     *      a find all action.
     */
    public void displayAboveTarget(Collection StudentCollection, List pathToTarget, boolean findAll) {
        if (pathToTarget.size() == 1 && pathToTarget.get(0) == this) {
            if (!findAll && StudentCollection instanceof List) {
                Iterator it = StudentCollection.iterator();
                if (it.hasNext()) {
                    Student Studentsingle = (Student) it.next();
                    recursiveDisplay(Studentsingle);
                }
            } else { 
                recursiveDisplay(StudentCollection);
            }
        } else {
            Iterator it = StudentCollection.iterator();
            if (it.hasNext()) {
                Student Studentsingle = (Student) it.next();
                displayAboveTarget(Studentsingle, pathToTarget, findAll);
            }
        }
    }

    /**
     * Displays domain object which lies above the target in the object selection.
     * @param StudentObject the domain object to display
     * @param pathToTarget a list of nodes representing the path to the target
     * @param findAll if <code>true</code> the display is a result of a find 
     * all action. CursorCommon.pre
     */
    public void displayAboveTarget(Student StudentObject, List pathToTarget, boolean findAll) {
        if (pathToTarget.size() == 1 && pathToTarget.get(0) == this) {
            recursiveDisplay(StudentObject);
        } else {
            pathToTarget.remove(this);
            display(StudentObject);
        }
    }


    public void mergeAssociations(Object domainObject, List pathToTarget, boolean error) {
        mergeAssociations((Student) domainObject, pathToTarget,error);
    }


    /**
     * Internal use.
     * Merges the association on the specified parent object
     * @param parentObject the parent object
     * @param pathToTarget the list representing path to target
     */
    protected void mergeAssociations(Student parentObject, List pathToTarget,boolean error) {
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
     * Recursivly displays the object representing the Student-role.
     * First, the object is displayed, then, each child is displayed. 
     *
     * @param someStudent the (domain) object to display.
     */
    public void recursiveDisplay(Student someStudent) {
        if (callHookBeforeDisplay(someStudent, "Student")) {
            if (someStudent == null) {
                return; // nothing more to display!
            }
            display(someStudent);
        }
    }
    /**
     * Displays a Collection of Student objects.
     * Each instance of Student is inserted in the corresponding
     * list block (chooseStudentsListBloack).
     * @param StudentCollection the Collection containing the (domain) objects to display.
     */
    public void recursiveDisplay(Collection StudentCollection) {
        controller.listblockMethodschooseStudentsListBloack.purgeAllLines();
        Iterator it = StudentCollection.iterator();
        List allLines = TypeTool.getDefaultList();
        while (it.hasNext()) {
            Student StudentObject = (Student) it.next();
            LineListblockchooseStudentsListBloack line = controller
                .listblockMethodschooseStudentsListBloack
                    .createListblockLine();
            insertInListblockLine(StudentObject, line);
            if (controller.listblockMethodschooseStudentsListBloack
                    .callHooksBeforeInsert(line)) {
                allLines.add(line);
            }
        }
        controller.listblockMethodschooseStudentsListBloack.initialSort(allLines);
        it = allLines.iterator();
        while (it.hasNext()) {
            LineListblockchooseStudentsListBloack line = (LineListblockchooseStudentsListBloack) it.next();
            controller.listblockMethodschooseStudentsListBloack
                    .insertListblockLine(line);
        }
        controller.listblockMethodschooseStudentsListBloack.forceClean();
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
     * Obtains a Set of Student objects from the chooseStudentsListBloack listblock.
     * Note that roles that are not represented in a coluumn will not
     * be created (compatible with old version). Other roles will
     * be created.
     * @return the obtained set of Student objects
     * @deprecated use {@link #obtainSet(boolean)} instead.
     */
    public Set obtainSet() {
        Set StudentSet = TypeTool.getDefaultSet();
        List allLines = controller.listblockMethodschooseStudentsListBloack.allLines();
        Iterator it = allLines.iterator();
        while (it.hasNext()) {
            LineListblockchooseStudentsListBloack line = (LineListblockchooseStudentsListBloack) it.next();
            Object o = null;
            o = line.getObject("Student");
            if (o != null) {
                StudentSet.add(o);
            }
        }
        return StudentSet;
    }


    /**
     * Obtains a Set of Student objects from the chooseStudentsListBloack listblock. The
     * parameter controlls wheter objects are created when getting them from 
     * the listblock line or not.
     * @param createIfNull if <code>true</code> objects are created.
     * @return the obtained set of Student objects.
     * @see ListblockLine#getObject(String, boolean)
     */
    public Set obtainSet(boolean createIfNull) {
        Set StudentSet = TypeTool.getDefaultSet();
        List allLines = controller.listblockMethodschooseStudentsListBloack.allLines();
        Iterator it = allLines.iterator();
        while (it.hasNext()) {
            LineListblockchooseStudentsListBloack line = (LineListblockchooseStudentsListBloack) it.next();
            Object o = null;
            o = line.getObject("Student", createIfNull);
            if (o != null) {
                StudentSet.add(o);
            }
        }
        return StudentSet;
    }

    /**
     * Recursivly obtains the Student from the dialog.
     * If the Student is previously displayed and is unchanged, 
     * no obtain is performed, and the returned value is null. The <code>singleObtain</code>
     * parameter is used to singal if obtain from more-related should be done on edit fields, 
     * or the entire set of domain objects (e.g the listblock).
     * @param pathToTarget a list of nodes representing the path to the target.
     * @param singleObtain if <code>true</code>, obtain on more-related is done from edit-fields.
     * @return the obtained Student object.
     */
    public Student recursiveObtain(List pathToTarget, boolean singleObtain) {
        return recursiveObtain(pathToTarget, singleObtain, false);
    }

    /**
     * Recursivly obtains the Student from the dialog.
     * If the Student is previously displayed and is unchanged, the
     * no obtain is performed, and the returned value is null. The <code>singleObtain</code>
     * parameter is used to singal if obtain from more-related should be done on edit fields, 
     * or the entire set of domain objects (e.g the listblock).
     * @param pathToTarget a list of nodes representing the path to the target.
     * @param singleObtain if <code>true</code>, obtain on more-related is done from edit-fields.
     * @param forceObtain if <code>true</code> obtain is always done.
     * @return the obtained Student object.
     */
    public Student recursiveObtain(List pathToTarget, boolean singleObtain, boolean forceObtain) {
        boolean hasValue = forceObtain || getState() != ObjectSelectionNode.CLEARED;
        pathToTarget.remove(this);
        boolean belowTarget = pathToTarget.size() == 0;
        Student theStudentSingle = null;
        if (hasValue) {
            theStudentSingle = obtain();
            saveAssociations(theStudentSingle);
            removeAssociations(theStudentSingle);
        }
        return theStudentSingle;
    }
    public boolean inListblock() {
        return true;
    }        
    public void setAssociation(Object self, String associationRoleName, 
            Object association) {

        Student member = (Student) self;
        // Might be generated empty - silence compiler warnings
        if (member != null) {
            member = null;
        }
    }
    public boolean isNavigableToParent() {
        return false;
    }


    private void saveAssociations(Student parentObject) {
        // might be generated empty, silience any warnings...
        int foo = 0;
        foo++;
    }


    private void removeAssociations(Student parentObject) {
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
    public Student createObjectCopy(Student fromObject) {
        Student retVal = new Student();
        retVal.setAge(fromObject.getAge());
        retVal.setId(fromObject.getId());
        retVal.setName(fromObject.getName());
        retVal.setStudentNr(fromObject.getStudentNr());
        return retVal;
    }
    /**
     * Inserts the specified instance in the specified listblock line.
     * @param obj the object to insert
     * @param line the line to insert in.
     */
    public void insertInListblockLine(Student obj, ListblockLine line) {
        if (obj == null) {
            return;
        }
        line.insertObject("Student", obj);
    }


    public void resetAssociations(Object o) {
        resetAssociations((Student) o);
    }


    private void resetAssociations(Student rootObject) {
        if (rootObject == null) {
            return;
        }
        // might be generated empty - silience any warnings:
        int foo = 0;
        foo++;
    }       
}
