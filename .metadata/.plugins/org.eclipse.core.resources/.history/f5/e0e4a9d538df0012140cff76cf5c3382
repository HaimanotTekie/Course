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
 * Access methods for student. Use variable thestudent to access
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

    AddStudentsToCourseDefaultView view;
    GenovaEnums genovaEnums;
    AddStudentsToCourseDefaultController controller;
    ObjectSelectionNode parentNode;
    List childNodes = new ArrayList();
    StudentMethods(AddStudentsToCourseDefaultView view, AddStudentsToCourseDefaultController controller, GenovaEnums genovaEnums) {
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
        return "student";
    }


    public void addChild(ObjectSelectionNode child) {
        childNodes.add(child);
    }
    public boolean callHookBeforeDisplay(Object objectToDisplay, String roleName) {
       return controller.hookBeforeDisplay(objectToDisplay, roleName);
    }


    public boolean callCheckSaveHook() {
        return controller.callCheckSaveHook("student");
    }


    public boolean callCheckDeleteHook() {
        return controller.callCheckDeleteHook("student");
    }


    public boolean callCheckCloseHook() {
        return controller.callCheckCloseHook("student");
    }


    public boolean callCheckClearHook() {
        return controller.callCheckClearHook("student");
    }


    public boolean callCheckFindHook() {
        return controller.callCheckFindHook("student");
    }


    public boolean callCheckChangeHook() {
        return controller.callCheckChangeHook("student");
    }


    public boolean callCheckRowSelectHook(int currentSelectionIndex, int newSelectionIndex) {
        return controller.callCheckRowSelectHook("student", currentSelectionIndex, newSelectionIndex);
    }


    public GenovaDialogController getController() {
        return controller;
    }


    /**
     * Returns an object representing the relation student from the
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
     * Returns an object representing the relation student from the
     * dialog. If student is displayed in the dialog, 
     * the student domain object is used, else a new student object 
     * is created. Attributes present in the dialog are then 
     * copied into the student object. 
     * 
     * <p>Before returning, the controller's hookAfterObtainstudent method 
     * is invoked, giving the application programmer 
     * the possibility to manipulate or replace the object.
     * 
     * @return Object of Student updated from the dialog.
     */
    public Student obtain() {
        if (objectProxy == null) {
            Student tmpstudent = new Student();
            objectProxy = controller
                    .getProxy(tmpstudent, "student");
        }
        objectProxy.setAttribute
            ("age", view.student_age.getValue());
        objectProxy.setAttribute
            ("id", view.student_id.getValue());
        objectProxy.setAttribute
            ("name", view.student_name.getValue());
        objectProxy.setAttribute
            ("studentNr", view.student_studentNr.getValue());

       Student obtainedObject = (Student) objectProxy.getObject();
       Student manipulated = controller.hookAfterObtainstudent(obtainedObject);
       if (manipulated != null) {
           obtainedObject = manipulated;
       }
       return obtainedObject;
    }

    public String obtain(String attr) {
        attr = TypeTool.stripRoleNamePrefix(attr, getRoleName());
        if ("age".equals(attr)) {
            return view.student_age.format();
        }
        if ("id".equals(attr)) {
            return view.student_id.format();
        }
        if ("name".equals(attr)) {
            return view.student_name.format();
        }
        if ("studentNr".equals(attr)) {
            return view.student_studentNr.format();
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
    * @param tmpstudent Attributes are copied from this object.
    */
    public void display(Student tmpstudent) {
        if (!SwingUtilities.isEventDispatchThread()) {
            displayOnEDT(tmpstudent);
            return;
        }
        if (tmpstudent == null) {
            tmpstudent= new Student();
        }
        controller.resetProxy();
        objectProxy = controller.getNewProxy(tmpstudent, "student");
        boolean resetState = true;
        display("age", TypeTool.toObject(tmpstudent.getAge()), resetState);
        display("id", TypeTool.toObject(tmpstudent.getId()), resetState);
        display("name", TypeTool.toObject(tmpstudent.getName()), resetState);
        display("studentNr", TypeTool.toObject(tmpstudent.getStudentNr()), resetState);
        setState(ObjectSelectionNode.CLEAN, false);
    }
    public boolean isConsistant() {
    if(!TypeTool.isConsistant(view.student_age.getText(), oldstudent.getAge())) {
        return false;
    }
    if(!TypeTool.isConsistant(view.student_id.getText(), oldstudent.getId())) {
        return false;
    }
    if(!TypeTool.isConsistant(view.student_name.getText(), oldstudent.getName())) {
        return false;
    }
    if(!TypeTool.isConsistant(view.student_studentNr.getText(), oldstudent.getStudentNr())) {
        return false;
    }
        return true;
     }    

    public boolean hasValue() {
    if(view.student_age.getText() == null || view.student_age.getText().length() == 0) {
        return false;
    }
    if(view.student_id.getText() == null || view.student_id.getText().length() == 0) {
        return false;
    }
    if(view.student_name.getText() == null || view.student_name.getText().length() == 0) {
        return false;
    }
    if(view.student_studentNr.getText() == null || view.student_studentNr.getText().length() == 0) {
        return false;
    }
       return true;
    }
    public boolean hasOneValue() {
    if(view.student_age.getText() != null && view.student_age.getText().trim().length() > 0) {
        return true;
    }
    if(view.student_id.getText() != null && view.student_id.getText().trim().length() > 0) {
        return true;
    }
    if(view.student_name.getText() != null && view.student_name.getText().trim().length() > 0) {
        return true;
    }
    if(view.student_studentNr.getText() != null && view.student_studentNr.getText().trim().length() > 0) {
        return true;
    }
       return false;
    }

    public boolean hasValue(String field) {
        field = TypeTool.stripRoleNamePrefix(field, getRoleName());
    if(field.equals("age") && (view.student_age.getText() == null || view.student_age.getText().length() == 0)) {
        return false;
    }
    if(field.equals("id") && (view.student_id.getText() == null || view.student_id.getText().length() == 0)) {
        return false;
    }
    if(field.equals("name") && (view.student_name.getText() == null || view.student_name.getText().length() == 0)) {
        return false;
    }
    if(field.equals("studentNr") && (view.student_studentNr.getText() == null || view.student_studentNr.getText().length() == 0)) {
        return false;
    }
       return true;
    }

    public void setStyle(Color foreground, Color background) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setStyleOnEDT(foreground, background);
            return;
        }
    view.student_age.setForeground(foreground);
    view.student_age.setBackground(background);
    view.student_id.setForeground(foreground);
    view.student_id.setBackground(background);
    view.student_name.setForeground(foreground);
    view.student_name.setBackground(background);
    view.student_studentNr.setForeground(foreground);
    view.student_studentNr.setBackground(background);
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
                valueObject = view.student_age.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.student_age.setInitialValue(valueObject);
            }
            view.student_age.setValue(valueObject);
            view.student_age.setCaretPosition(0);
        }
        if ("id".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.student_id.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.student_id.setInitialValue(valueObject);
            }
            view.student_id.setValue(valueObject);
            view.student_id.setCaretPosition(0);
        }
        if ("name".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.student_name.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.student_name.setInitialValue(valueObject);
            }
            view.student_name.setValue(valueObject);
            view.student_name.setCaretPosition(0);
        }
        if ("studentNr".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.student_studentNr.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.student_studentNr.setInitialValue(valueObject);
            }
            view.student_studentNr.setValue(valueObject);
            view.student_studentNr.setCaretPosition(0);
        }
        view.noFocusException--;
    }

    /**
     * Updates data of given attriubte in object selection in the dialog.
     *
     * @param tmpstudent Attributes are copied from this object.
     * @param s The attribute to set.
     */
    public void display(Student tmpstudent, String s) {
        display(tmpstudent, s, true);
    }

    @Override
    public void display(Student tmpstudent, String attributeName, boolean resetState) {
        if (!SwingUtilities.isEventDispatchThread()){
            displayOnEDT(tmpstudent, attributeName, resetState);
            return;
        }
        attributeName = TypeTool
                .stripRoleNamePrefix(attributeName, getRoleName());
       if (tmpstudent != null) {
           Object value = null;
            if (attributeName.equals("age")) {
                value = TypeTool.toObject(tmpstudent.getAge());
            }
            if (attributeName.equals("id")) {
                value = TypeTool.toObject(tmpstudent.getId());
            }
            if (attributeName.equals("name")) {
                value = TypeTool.toObject(tmpstudent.getName());
            }
            if (attributeName.equals("studentNr")) {
                value = TypeTool.toObject(tmpstudent.getStudentNr());
            }
           display(attributeName, value, resetState);
       }
    }
    boolean zerostudentage = false;
    boolean zerostudentid = false;
    boolean zerostudentname = false;
    boolean zerostudentstudentNr = false;
    /**
     * @param s the name of the attribute
     * @param val the setShowZero property
     * @deprecated - use display rules to set this display rule.
     */
    public void setShowZero(String s, boolean val) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
       val = !val;
    if(s.equals("age")) {
        zerostudentage = val;
    }
    if(s.equals("id")) {
        zerostudentid = val;
    }
    if(s.equals("name")) {
        zerostudentname = val;
    }
    if(s.equals("studentNr")) {
        zerostudentstudentNr = val;
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
    view.student_age.setInitialValue(null);
    view.oldValuestudentage = "";
    view.student_age.setValue(null);
    view.student_age.resetState();
    view.student_id.setInitialValue(null);
    view.oldValuestudentid = "";
    view.student_id.setValue(null);
    view.student_id.resetState();
    view.student_name.setInitialValue(null);
    view.oldValuestudentname = "";
    view.student_name.setValue(null);
    view.student_name.resetState();
    view.student_studentNr.setInitialValue(null);
    view.oldValuestudentstudentNr = "";
    view.student_studentNr.setValue(null);
    view.student_studentNr.resetState();
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
        view.oldValuestudentage = "";
        view.student_age.setInitialValue(null);
        view.student_age.setValue(null);
        view.student_age.resetState();
    }
    if (s.equals("id")) {
        view.oldValuestudentid = "";
        view.student_id.setInitialValue(null);
        view.student_id.setValue(null);
        view.student_id.resetState();
    }
    if (s.equals("name")) {
        view.oldValuestudentname = "";
        view.student_name.setInitialValue(null);
        view.student_name.setValue(null);
        view.student_name.resetState();
    }
    if (s.equals("studentNr")) {
        view.oldValuestudentstudentNr = "";
        view.student_studentNr.setInitialValue(null);
        view.student_studentNr.setValue(null);
        view.student_studentNr.resetState();
    }
        view.noFocusException--;
    }
    public void setEnabled(boolean b) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setEnabledOnEDT(b);
            return;
        }
    view.student_age.setEnabled(b);
    view.student_id.setEnabled(b);
    view.student_name.setEnabled(b);
    view.student_studentNr.setEnabled(b);
    }
    public void setEnabled(boolean b, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setEnabledOnEDT(b, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("age")) {
        view.student_age.setEnabled(b);
    }
    if (s.equals("id")) {
        view.student_id.setEnabled(b);
    }
    if (s.equals("name")) {
        view.student_name.setEnabled(b);
    }
    if (s.equals("studentNr")) {
        view.student_studentNr.setEnabled(b);
    }
    }
    public boolean isEnabled() {
        boolean b = false;
    if (view.student_age.isEnabled()) b=true;
    if (view.student_id.isEnabled()) b=true;
    if (view.student_name.isEnabled()) b=true;
    if (view.student_studentNr.isEnabled()) b=true;
       return b;
    }
    public boolean isEnabled(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (s.equals("age")) {
        if (view.student_age.isEnabled()) b=true;
    }
    if (s.equals("id")) {
        if (view.student_id.isEnabled()) b=true;
    }
    if (s.equals("name")) {
        if (view.student_name.isEnabled()) b=true;
    }
    if (s.equals("studentNr")) {
        if (view.student_studentNr.isEnabled()) b=true;
    }
       return b;
    }
    public void setShown(boolean b) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setShownOnEDT(b);
            return;
        }
    view.student_age.setVisible(b);
    view.student_id.setVisible(b);
    view.student_name.setVisible(b);
    view.student_studentNr.setVisible(b);
    }
    public void setShown(boolean b, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setShownOnEDT(b, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("age")) {
        view.student_age.setVisible(b);
    }
    if (s.equals("id")) {
        view.student_id.setVisible(b);
    }
    if (s.equals("name")) {
        view.student_name.setVisible(b);
    }
    if (s.equals("studentNr")) {
        view.student_studentNr.setVisible(b);
    }
    }
    public boolean isShown() {
        boolean b = false;
    if (view.student_age.isEnabled()) b=true;
    if (view.student_id.isEnabled()) b=true;
    if (view.student_name.isEnabled()) b=true;
    if (view.student_studentNr.isEnabled()) b=true;
        return b;
    }
    public boolean isShown(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (s.equals("age")) {
        if (view.student_age.hasFocus()) b=true;
    }
    if (s.equals("id")) {
        if (view.student_id.hasFocus()) b=true;
    }
    if (s.equals("name")) {
        if (view.student_name.hasFocus()) b=true;
    }
    if (s.equals("studentNr")) {
        if (view.student_studentNr.hasFocus()) b=true;
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
        view.student_age.requestFocusInWindow();
    }
    if (s.equals("id")) {
        view.student_id.requestFocusInWindow();
    }
    if (s.equals("name")) {
        view.student_name.requestFocusInWindow();
    }
    if (s.equals("studentNr")) {
        view.student_studentNr.requestFocusInWindow();
    }
    }
    public boolean hasFocus(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (view.student_age.hasFocus()) b=true;
    if (view.student_id.hasFocus()) b=true;
    if (view.student_name.hasFocus()) b=true;
    if (view.student_studentNr.hasFocus()) b=true;
        return b;
    }
    @Override
    public void append(Student tmpstudent, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            appendOnEDT(tmpstudent, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        view.noFocusException++;
        if(tmpstudent == null) {
            tmpstudent= new Student();
        }
        view.noFocusException--;
    }
    /** Resets current state of relation student in the dialog. Sets changed to false and sets old object to be the current object. 
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
        if ("id".equals(attributeName)) {
            return true;
        }

        return false;
   }  
    private Student oldstudent = new Student();
    private boolean isMarkedChanged = false;
    
    
    /** Sets the old version of the object selection node.
     * NOTE: The object is not copied, it is referenced.
     * @param inst The new object to be used as the old. 
     * 
     */
    public void setOld(Student inst) {
        oldstudent = inst;
    }
    
    
   /** 
    * Returns the old object. The object is not copied.
    * @return The object.
    */
    public Student getOld() {
        return oldstudent;
    }
    
    
    /**
     * Returns the string representing the main key attribute of this role.
     * @return the main key
     */
    public String getTargetMainKey() {
        return "id";
    }
    boolean isMarkedChangedage = false;
    boolean isMarkedChangedid = false;
    boolean isMarkedChangedname = false;
    boolean isMarkedChangedstudentNr = false;
    public void setChanged (boolean b, String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());        
    if (s.equals("age")) {
        isMarkedChangedage = b;
    }    
    if (s.equals("id")) {
        isMarkedChangedid = b;
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
    isMarkedChangedid = b;
    isMarkedChangedname = b;
    isMarkedChangedstudentNr = b;
     }
    /** 
     * Returns whether student has changed state since last 
     * call on resetstudent().<br>
     * It will both parse the current state of the block
     * and compare with the dialogattribute named in input String s.
     * @param s The attribute to check.
     * @param tmpstudent The object to compare with.
     * @return True if changed, false if not.
     * @deprecated use ObjectSelectionNode#isChanged(String)
     */
    public boolean isChanged(String s, Student tmpstudent) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean bChanged = false;
        if(isMarkedChanged) return true;
    if (s.equals("age")) {
        if (isMarkedChangedage) bChanged = true;
        if (tmpstudent != null && oldstudent != null) {
        if (!TypeTool.equals(tmpstudent.getAge(), oldstudent.getAge())) {
            bChanged = true;
            isMarkedChangedage = true;
            }
        }
    }    
    if (s.equals("id")) {
        if (isMarkedChangedid) bChanged = true;
        if (tmpstudent != null && oldstudent != null) {
        if (!TypeTool.equals(tmpstudent.getId(), oldstudent.getId())) {
            bChanged = true;
            isMarkedChangedid = true;
            }
        }
    }    
    if (s.equals("name")) {
        if (isMarkedChangedname) bChanged = true;
        if (tmpstudent != null && oldstudent != null) {
        if (!TypeTool.equals(tmpstudent.getName(), oldstudent.getName())) {
            bChanged = true;
            isMarkedChangedname = true;
            }
        }
    }    
    if (s.equals("studentNr")) {
        if (isMarkedChangedstudentNr) bChanged = true;
        if (tmpstudent != null && oldstudent != null) {
        if (!TypeTool.equals(tmpstudent.getStudentNr(), oldstudent.getStudentNr())) {
            bChanged = true;
            isMarkedChangedstudentNr = true;
            }
        }
    }    
         return bChanged;
     }
    
    
    /** 
     * Returns whether student has changed state since last call on
     * resetstudent().  It will both parse the current state of the
     * block and compare with the dialogattributes of tmpstudent.  
     * @param tmpstudent The object to compare with.
     * @return <code>true</code> if changed, <code>false</code> if not.
     * @deprecated use ObjectSelection#getState()
     */
    public boolean isChanged(Student tmpstudent) {
        if(isMarkedChanged) return true;
    if (isMarkedChangedage) isMarkedChanged = true;
    if (oldstudent != null) {
        if (!TypeTool.equals(tmpstudent.getAge(), oldstudent.getAge())) {
            isMarkedChanged = true;
            isMarkedChangedage = true;
        }
    }
    if (isMarkedChangedid) isMarkedChanged = true;
    if (oldstudent != null) {
        if (!TypeTool.equals(tmpstudent.getId(), oldstudent.getId())) {
            isMarkedChanged = true;
            isMarkedChangedid = true;
        }
    }
    if (isMarkedChangedname) isMarkedChanged = true;
    if (oldstudent != null) {
        if (!TypeTool.equals(tmpstudent.getName(), oldstudent.getName())) {
            isMarkedChanged = true;
            isMarkedChangedname = true;
        }
    }
    if (isMarkedChangedstudentNr) isMarkedChanged = true;
    if (oldstudent != null) {
        if (!TypeTool.equals(tmpstudent.getStudentNr(), oldstudent.getStudentNr())) {
            isMarkedChanged = true;
            isMarkedChangedstudentNr = true;
        }
    }
    if(false) {
        tmpstudent.getClass();
    }
        return isMarkedChanged;
    }

    public Set getChangedFields() {
        Set changedFields = new HashSet();
        Object component = null;

        component = controller.view.fromNameToComponent("student.age");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("age");
            }
        }
        component = controller.view.fromNameToComponent("student.id");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("id");
            }
        }
        component = controller.view.fromNameToComponent("student.name");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("name");
            }
        }
        component = controller.view.fromNameToComponent("student.studentNr");
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
            component = controller.view.fromNameToComponent("student.age");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("age");
                }
            }
        }
        if (isPartOfKey("id")) {
            component = controller.view.fromNameToComponent("student.id");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("id");
                }
            }
        }
        if (isPartOfKey("name")) {
            component = controller.view.fromNameToComponent("student.name");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("name");
                }
            }
        }
        if (isPartOfKey("studentNr")) {
            component = controller.view.fromNameToComponent("student.studentNr");
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

        component = controller.view.fromNameToComponent("student.age");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
        component = controller.view.fromNameToComponent("student.id");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
        component = controller.view.fromNameToComponent("student.name");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
        component = controller.view.fromNameToComponent("student.studentNr");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
    }
    
    /**
     * Displays domain objects which lies above the target in the object selection.
     * @param studentCollection the collection of domain objects to display
     * @param pathToTarget a list of nodes representing the path to the target
     * @param findAll if <code>true</code> displaying is done as part of 
     *      a find all action.
     */
    public void displayAboveTarget(Collection studentCollection, List pathToTarget, boolean findAll) {
        if (pathToTarget.size() == 1 && pathToTarget.get(0) == this) {
            if (!findAll && studentCollection instanceof List) {
                Iterator it = studentCollection.iterator();
                if (it.hasNext()) {
                    Student studentsingle = (Student) it.next();
                    recursiveDisplay(studentsingle);
                }
            } else { 
                recursiveDisplay(studentCollection);
            }
        } else {
            Iterator it = studentCollection.iterator();
            if (it.hasNext()) {
                Student studentsingle = (Student) it.next();
                displayAboveTarget(studentsingle, pathToTarget, findAll);
            }
        }
    }

    /**
     * Displays domain object which lies above the target in the object selection.
     * @param studentObject the domain object to display
     * @param pathToTarget a list of nodes representing the path to the target
     * @param findAll if <code>true</code> the display is a result of a find 
     * all action. CursorCommon.pre
     */
    public void displayAboveTarget(Student studentObject, List pathToTarget, boolean findAll) {
        if (pathToTarget.size() == 1 && pathToTarget.get(0) == this) {
            recursiveDisplay(studentObject);
        } else {
            pathToTarget.remove(this);
            display(studentObject);
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
     * Recursivly displays the object representing the student-role.
     * First, the object is displayed, then, each child is displayed. 
     *
     * @param somestudent the (domain) object to display.
     */
    public void recursiveDisplay(Student somestudent) {
        if (callHookBeforeDisplay(somestudent, "student")) {
            if (somestudent == null) {
                return; // nothing more to display!
            }
            display(somestudent);
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
     * Recursivly obtains the student from the dialog.
     * @param pathToTarget a list of nodes representing the path to the target.
     * @param singleObtain if <code>true</code> obtain on more-related is done
     * from edit-fields.
     * @return the obtained student object.
     */
    public Student recursiveObtain(List pathToTarget, boolean singleObtain) {
        boolean hasValue = getState() != ObjectSelectionNode.CLEARED;
        pathToTarget.remove(this);
        boolean belowTarget = pathToTarget.size() == 0;
        Student thestudentSingle = null;
        if (hasValue) {
            thestudentSingle = obtain();
            saveAssociations(thestudentSingle);
            removeAssociations(thestudentSingle);
        }
        return thestudentSingle;
    }
    public void setAssociation(Object self, String associationRoleName, 
            Object association) {

        Student member = (Student) self;
        if ("studentCourses".equals(associationRoleName)) {
            Set parent = TypeTool.getDefaultSet();
            parent.add(association);
            member.setStudentCourses(parent);
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
        line.insertObject("student", obj);
    }
}
