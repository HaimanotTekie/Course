// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package no.course.dialog.student;
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
 * Access methods for Student2. Use variable theStudent2 to access
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
public class Student2Methods extends AbstractNode<Student> {

    StudentDefaultView view;
    GenovaEnums genovaEnums;
    StudentDefaultController controller;
    ObjectSelectionNode parentNode;
    List childNodes = new ArrayList();
    Student2Methods(StudentDefaultView view, StudentDefaultController controller, GenovaEnums genovaEnums) {
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
        return "Student2";
    }


    public void addChild(ObjectSelectionNode child) {
        childNodes.add(child);
    }
    public boolean callHookBeforeDisplay(Object objectToDisplay, String roleName) {
       return controller.hookBeforeDisplay(objectToDisplay, roleName);
    }


    public boolean callCheckSaveHook() {
        return controller.callCheckSaveHook("Student2");
    }


    public boolean callCheckDeleteHook() {
        return controller.callCheckDeleteHook("Student2");
    }


    public boolean callCheckCloseHook() {
        return controller.callCheckCloseHook("Student2");
    }


    public boolean callCheckClearHook() {
        return controller.callCheckClearHook("Student2");
    }


    public boolean callCheckFindHook() {
        return controller.callCheckFindHook("Student2");
    }


    public boolean callCheckChangeHook() {
        return controller.callCheckChangeHook("Student2");
    }


    public boolean callCheckRowSelectHook(int currentSelectionIndex, int newSelectionIndex) {
        return controller.callCheckRowSelectHook("Student2", currentSelectionIndex, newSelectionIndex);
    }


    public GenovaDialogController getController() {
        return controller;
    }


    /**
     * Returns an object representing the relation Student2 from the
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
     * Returns an object representing the relation Student2 from the
     * dialog. If Student2 is displayed in the dialog, 
     * the Student2 domain object is used, else a new Student2 object 
     * is created. Attributes present in the dialog are then 
     * copied into the Student2 object. 
     * 
     * <p>Before returning, the controller's hookAfterObtainStudent2 method 
     * is invoked, giving the application programmer 
     * the possibility to manipulate or replace the object.
     * 
     * @return Object of Student updated from the dialog.
     */
    public Student obtain() {
        if (objectProxy == null) {
            Student tmpStudent2 = new Student();
            objectProxy = controller
                    .getProxy(tmpStudent2, "Student2");
        }
        objectProxy.setAttribute
            ("age", view.Student2_age.getValue());
        objectProxy.setAttribute
            ("id", view.Student2_id.getValue());
        objectProxy.setAttribute
            ("name", view.Student2_name.getValue());
        objectProxy.setAttribute
            ("studentNr", view.Student2_studentNr.getValue());

       Student obtainedObject = (Student) objectProxy.getObject();
       Student manipulated = controller.hookAfterObtainStudent2(obtainedObject);
       if (manipulated != null) {
           obtainedObject = manipulated;
       }
       return obtainedObject;
    }

    public String obtain(String attr) {
        attr = TypeTool.stripRoleNamePrefix(attr, getRoleName());
        if ("age".equals(attr)) {
            return view.Student2_age.format();
        }
        if ("id".equals(attr)) {
            return view.Student2_id.format();
        }
        if ("name".equals(attr)) {
            return view.Student2_name.format();
        }
        if ("studentNr".equals(attr)) {
            return view.Student2_studentNr.format();
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
    * @param tmpStudent2 Attributes are copied from this object.
    */
    public void display(Student tmpStudent2) {
        if (!SwingUtilities.isEventDispatchThread()) {
            displayOnEDT(tmpStudent2);
            return;
        }
        if (tmpStudent2 == null) {
            tmpStudent2= new Student();
        }
        controller.resetProxy();
        objectProxy = controller.getNewProxy(tmpStudent2, "Student2");
        boolean resetState = true;
        display("age", TypeTool.toObject(tmpStudent2.getAge()), resetState);
        display("id", TypeTool.toObject(tmpStudent2.getId()), resetState);
        display("name", TypeTool.toObject(tmpStudent2.getName()), resetState);
        display("studentNr", TypeTool.toObject(tmpStudent2.getStudentNr()), resetState);
        setState(ObjectSelectionNode.CLEAN, false);
    }
    public boolean isConsistant() {
    if(!TypeTool.isConsistant(view.Student2_age.getText(), oldStudent2.getAge())) {
        return false;
    }
    if(!TypeTool.isConsistant(view.Student2_id.getText(), oldStudent2.getId())) {
        return false;
    }
    if(!TypeTool.isConsistant(view.Student2_name.getText(), oldStudent2.getName())) {
        return false;
    }
    if(!TypeTool.isConsistant(view.Student2_studentNr.getText(), oldStudent2.getStudentNr())) {
        return false;
    }
        return true;
     }    

    public boolean hasValue() {
    if(view.Student2_age.getText() == null || view.Student2_age.getText().length() == 0) {
        return false;
    }
    if(view.Student2_id.getText() == null || view.Student2_id.getText().length() == 0) {
        return false;
    }
    if(view.Student2_name.getText() == null || view.Student2_name.getText().length() == 0) {
        return false;
    }
    if(view.Student2_studentNr.getText() == null || view.Student2_studentNr.getText().length() == 0) {
        return false;
    }
       return true;
    }
    public boolean hasOneValue() {
    if(view.Student2_age.getText() != null && view.Student2_age.getText().trim().length() > 0) {
        return true;
    }
    if(view.Student2_id.getText() != null && view.Student2_id.getText().trim().length() > 0) {
        return true;
    }
    if(view.Student2_name.getText() != null && view.Student2_name.getText().trim().length() > 0) {
        return true;
    }
    if(view.Student2_studentNr.getText() != null && view.Student2_studentNr.getText().trim().length() > 0) {
        return true;
    }
       return false;
    }

    public boolean hasValue(String field) {
        field = TypeTool.stripRoleNamePrefix(field, getRoleName());
    if(field.equals("age") && (view.Student2_age.getText() == null || view.Student2_age.getText().length() == 0)) {
        return false;
    }
    if(field.equals("id") && (view.Student2_id.getText() == null || view.Student2_id.getText().length() == 0)) {
        return false;
    }
    if(field.equals("name") && (view.Student2_name.getText() == null || view.Student2_name.getText().length() == 0)) {
        return false;
    }
    if(field.equals("studentNr") && (view.Student2_studentNr.getText() == null || view.Student2_studentNr.getText().length() == 0)) {
        return false;
    }
       return true;
    }

    public void setStyle(Color foreground, Color background) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setStyleOnEDT(foreground, background);
            return;
        }
    view.Student2_age.setForeground(foreground);
    view.Student2_age.setBackground(background);
    view.Student2_id.setForeground(foreground);
    view.Student2_id.setBackground(background);
    view.Student2_name.setForeground(foreground);
    view.Student2_name.setBackground(background);
    view.Student2_studentNr.setForeground(foreground);
    view.Student2_studentNr.setBackground(background);
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
                valueObject = view.Student2_age.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.Student2_age.setInitialValue(valueObject);
            }
            view.Student2_age.setValue(valueObject);
            view.Student2_age.setCaretPosition(0);
        }
        if ("id".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.Student2_id.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.Student2_id.setInitialValue(valueObject);
            }
            view.Student2_id.setValue(valueObject);
            view.Student2_id.setCaretPosition(0);
        }
        if ("name".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.Student2_name.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.Student2_name.setInitialValue(valueObject);
            }
            view.Student2_name.setValue(valueObject);
            view.Student2_name.setCaretPosition(0);
        }
        if ("studentNr".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.Student2_studentNr.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.Student2_studentNr.setInitialValue(valueObject);
            }
            view.Student2_studentNr.setValue(valueObject);
            view.Student2_studentNr.setCaretPosition(0);
        }
        view.noFocusException--;
    }

    /**
     * Updates data of given attriubte in object selection in the dialog.
     *
     * @param tmpStudent2 Attributes are copied from this object.
     * @param s The attribute to set.
     */
    public void display(Student tmpStudent2, String s) {
        display(tmpStudent2, s, true);
    }

    @Override
    public void display(Student tmpStudent2, String attributeName, boolean resetState) {
        if (!SwingUtilities.isEventDispatchThread()){
            displayOnEDT(tmpStudent2, attributeName, resetState);
            return;
        }
        attributeName = TypeTool
                .stripRoleNamePrefix(attributeName, getRoleName());
       if (tmpStudent2 != null) {
           Object value = null;
            if (attributeName.equals("age")) {
                value = TypeTool.toObject(tmpStudent2.getAge());
            }
            if (attributeName.equals("id")) {
                value = TypeTool.toObject(tmpStudent2.getId());
            }
            if (attributeName.equals("name")) {
                value = TypeTool.toObject(tmpStudent2.getName());
            }
            if (attributeName.equals("studentNr")) {
                value = TypeTool.toObject(tmpStudent2.getStudentNr());
            }
           display(attributeName, value, resetState);
       }
    }
    boolean zeroStudent2age = false;
    boolean zeroStudent2id = false;
    boolean zeroStudent2name = false;
    boolean zeroStudent2studentNr = false;
    /**
     * @param s the name of the attribute
     * @param val the setShowZero property
     * @deprecated - use display rules to set this display rule.
     */
    public void setShowZero(String s, boolean val) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
       val = !val;
    if(s.equals("age")) {
        zeroStudent2age = val;
    }
    if(s.equals("id")) {
        zeroStudent2id = val;
    }
    if(s.equals("name")) {
        zeroStudent2name = val;
    }
    if(s.equals("studentNr")) {
        zeroStudent2studentNr = val;
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
    view.Student2_age.setInitialValue(null);
    view.oldValueStudent2age = "";
    view.Student2_age.setValue(null);
    view.Student2_age.resetState();
    view.Student2_id.setInitialValue(null);
    view.oldValueStudent2id = "";
    view.Student2_id.setValue(null);
    view.Student2_id.resetState();
    view.Student2_name.setInitialValue(null);
    view.oldValueStudent2name = "";
    view.Student2_name.setValue(null);
    view.Student2_name.resetState();
    view.Student2_studentNr.setInitialValue(null);
    view.oldValueStudent2studentNr = "";
    view.Student2_studentNr.setValue(null);
    view.Student2_studentNr.resetState();
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
        view.oldValueStudent2age = "";
        view.Student2_age.setInitialValue(null);
        view.Student2_age.setValue(null);
        view.Student2_age.resetState();
    }
    if (s.equals("id")) {
        view.oldValueStudent2id = "";
        view.Student2_id.setInitialValue(null);
        view.Student2_id.setValue(null);
        view.Student2_id.resetState();
    }
    if (s.equals("name")) {
        view.oldValueStudent2name = "";
        view.Student2_name.setInitialValue(null);
        view.Student2_name.setValue(null);
        view.Student2_name.resetState();
    }
    if (s.equals("studentNr")) {
        view.oldValueStudent2studentNr = "";
        view.Student2_studentNr.setInitialValue(null);
        view.Student2_studentNr.setValue(null);
        view.Student2_studentNr.resetState();
    }
        view.noFocusException--;
    }
    public void setEnabled(boolean b) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setEnabledOnEDT(b);
            return;
        }
    view.Student2_age.setEnabled(b);
    view.Student2_id.setEnabled(b);
    view.Student2_name.setEnabled(b);
    view.Student2_studentNr.setEnabled(b);
    }
    public void setEnabled(boolean b, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setEnabledOnEDT(b, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("age")) {
        view.Student2_age.setEnabled(b);
    }
    if (s.equals("id")) {
        view.Student2_id.setEnabled(b);
    }
    if (s.equals("name")) {
        view.Student2_name.setEnabled(b);
    }
    if (s.equals("studentNr")) {
        view.Student2_studentNr.setEnabled(b);
    }
    }
    public boolean isEnabled() {
        boolean b = false;
    if (view.Student2_age.isEnabled()) b=true;
    if (view.Student2_id.isEnabled()) b=true;
    if (view.Student2_name.isEnabled()) b=true;
    if (view.Student2_studentNr.isEnabled()) b=true;
       return b;
    }
    public boolean isEnabled(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (s.equals("age")) {
        if (view.Student2_age.isEnabled()) b=true;
    }
    if (s.equals("id")) {
        if (view.Student2_id.isEnabled()) b=true;
    }
    if (s.equals("name")) {
        if (view.Student2_name.isEnabled()) b=true;
    }
    if (s.equals("studentNr")) {
        if (view.Student2_studentNr.isEnabled()) b=true;
    }
       return b;
    }
    public void setShown(boolean b) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setShownOnEDT(b);
            return;
        }
    view.Student2_age.setVisible(b);
    view.Student2_id.setVisible(b);
    view.Student2_name.setVisible(b);
    view.Student2_studentNr.setVisible(b);
    }
    public void setShown(boolean b, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setShownOnEDT(b, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("age")) {
        view.Student2_age.setVisible(b);
    }
    if (s.equals("id")) {
        view.Student2_id.setVisible(b);
    }
    if (s.equals("name")) {
        view.Student2_name.setVisible(b);
    }
    if (s.equals("studentNr")) {
        view.Student2_studentNr.setVisible(b);
    }
    }
    public boolean isShown() {
        boolean b = false;
    if (view.Student2_age.isEnabled()) b=true;
    if (view.Student2_id.isEnabled()) b=true;
    if (view.Student2_name.isEnabled()) b=true;
    if (view.Student2_studentNr.isEnabled()) b=true;
        return b;
    }
    public boolean isShown(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (s.equals("age")) {
        if (view.Student2_age.hasFocus()) b=true;
    }
    if (s.equals("id")) {
        if (view.Student2_id.hasFocus()) b=true;
    }
    if (s.equals("name")) {
        if (view.Student2_name.hasFocus()) b=true;
    }
    if (s.equals("studentNr")) {
        if (view.Student2_studentNr.hasFocus()) b=true;
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
        view.Student2_age.requestFocusInWindow();
    }
    if (s.equals("id")) {
        view.Student2_id.requestFocusInWindow();
    }
    if (s.equals("name")) {
        view.Student2_name.requestFocusInWindow();
    }
    if (s.equals("studentNr")) {
        view.Student2_studentNr.requestFocusInWindow();
    }
    }
    public boolean hasFocus(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (view.Student2_age.hasFocus()) b=true;
    if (view.Student2_id.hasFocus()) b=true;
    if (view.Student2_name.hasFocus()) b=true;
    if (view.Student2_studentNr.hasFocus()) b=true;
        return b;
    }
    @Override
    public void append(Student tmpStudent2, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            appendOnEDT(tmpStudent2, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        view.noFocusException++;
        if(tmpStudent2 == null) {
            tmpStudent2= new Student();
        }
        view.noFocusException--;
    }
    /** Resets current state of relation Student2 in the dialog. Sets changed to false and sets old object to be the current object. 
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
    private Student oldStudent2 = new Student();
    private boolean isMarkedChanged = false;
    
    
    /** Sets the old version of the object selection node.
     * NOTE: The object is not copied, it is referenced.
     * @param inst The new object to be used as the old. 
     * 
     */
    public void setOld(Student inst) {
        oldStudent2 = inst;
    }
    
    
   /** 
    * Returns the old object. The object is not copied.
    * @return The object.
    */
    public Student getOld() {
        return oldStudent2;
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
     * Returns whether Student2 has changed state since last 
     * call on resetStudent2().<br>
     * It will both parse the current state of the block
     * and compare with the dialogattribute named in input String s.
     * @param s The attribute to check.
     * @param tmpStudent2 The object to compare with.
     * @return True if changed, false if not.
     * @deprecated use ObjectSelectionNode#isChanged(String)
     */
    public boolean isChanged(String s, Student tmpStudent2) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean bChanged = false;
        if(isMarkedChanged) return true;
    if (s.equals("age")) {
        if (isMarkedChangedage) bChanged = true;
        if (tmpStudent2 != null && oldStudent2 != null) {
        if (!TypeTool.equals(tmpStudent2.getAge(), oldStudent2.getAge())) {
            bChanged = true;
            isMarkedChangedage = true;
            }
        }
    }    
    if (s.equals("id")) {
        if (isMarkedChangedid) bChanged = true;
        if (tmpStudent2 != null && oldStudent2 != null) {
        if (!TypeTool.equals(tmpStudent2.getId(), oldStudent2.getId())) {
            bChanged = true;
            isMarkedChangedid = true;
            }
        }
    }    
    if (s.equals("name")) {
        if (isMarkedChangedname) bChanged = true;
        if (tmpStudent2 != null && oldStudent2 != null) {
        if (!TypeTool.equals(tmpStudent2.getName(), oldStudent2.getName())) {
            bChanged = true;
            isMarkedChangedname = true;
            }
        }
    }    
    if (s.equals("studentNr")) {
        if (isMarkedChangedstudentNr) bChanged = true;
        if (tmpStudent2 != null && oldStudent2 != null) {
        if (!TypeTool.equals(tmpStudent2.getStudentNr(), oldStudent2.getStudentNr())) {
            bChanged = true;
            isMarkedChangedstudentNr = true;
            }
        }
    }    
         return bChanged;
     }
    
    
    /** 
     * Returns whether Student2 has changed state since last call on
     * resetStudent2().  It will both parse the current state of the
     * block and compare with the dialogattributes of tmpStudent2.  
     * @param tmpStudent2 The object to compare with.
     * @return <code>true</code> if changed, <code>false</code> if not.
     * @deprecated use ObjectSelection#getState()
     */
    public boolean isChanged(Student tmpStudent2) {
        if(isMarkedChanged) return true;
    if (isMarkedChangedage) isMarkedChanged = true;
    if (oldStudent2 != null) {
        if (!TypeTool.equals(tmpStudent2.getAge(), oldStudent2.getAge())) {
            isMarkedChanged = true;
            isMarkedChangedage = true;
        }
    }
    if (isMarkedChangedid) isMarkedChanged = true;
    if (oldStudent2 != null) {
        if (!TypeTool.equals(tmpStudent2.getId(), oldStudent2.getId())) {
            isMarkedChanged = true;
            isMarkedChangedid = true;
        }
    }
    if (isMarkedChangedname) isMarkedChanged = true;
    if (oldStudent2 != null) {
        if (!TypeTool.equals(tmpStudent2.getName(), oldStudent2.getName())) {
            isMarkedChanged = true;
            isMarkedChangedname = true;
        }
    }
    if (isMarkedChangedstudentNr) isMarkedChanged = true;
    if (oldStudent2 != null) {
        if (!TypeTool.equals(tmpStudent2.getStudentNr(), oldStudent2.getStudentNr())) {
            isMarkedChanged = true;
            isMarkedChangedstudentNr = true;
        }
    }
    if(false) {
        tmpStudent2.getClass();
    }
        return isMarkedChanged;
    }

    public Set getChangedFields() {
        Set changedFields = new HashSet();
        Object component = null;

        component = controller.view.fromNameToComponent("Student2.age");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("age");
            }
        }
        component = controller.view.fromNameToComponent("Student2.id");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("id");
            }
        }
        component = controller.view.fromNameToComponent("Student2.name");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("name");
            }
        }
        component = controller.view.fromNameToComponent("Student2.studentNr");
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
            component = controller.view.fromNameToComponent("Student2.age");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("age");
                }
            }
        }
        if (isPartOfKey("id")) {
            component = controller.view.fromNameToComponent("Student2.id");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("id");
                }
            }
        }
        if (isPartOfKey("name")) {
            component = controller.view.fromNameToComponent("Student2.name");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("name");
                }
            }
        }
        if (isPartOfKey("studentNr")) {
            component = controller.view.fromNameToComponent("Student2.studentNr");
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

        component = controller.view.fromNameToComponent("Student2.age");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
        component = controller.view.fromNameToComponent("Student2.id");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
        component = controller.view.fromNameToComponent("Student2.name");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
        component = controller.view.fromNameToComponent("Student2.studentNr");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
    }
    
    /**
     * Displays domain objects which lies above the target in the object selection.
     * @param Student2Collection the collection of domain objects to display
     * @param pathToTarget a list of nodes representing the path to the target
     * @param findAll if <code>true</code> displaying is done as part of 
     *      a find all action.
     */
    public void displayAboveTarget(Collection Student2Collection, List pathToTarget, boolean findAll) {
        if (pathToTarget.size() == 1 && pathToTarget.get(0) == this) {
            if (!findAll && Student2Collection instanceof List) {
                Iterator it = Student2Collection.iterator();
                if (it.hasNext()) {
                    Student Student2single = (Student) it.next();
                    recursiveDisplay(Student2single);
                }
            } else { 
                recursiveDisplay(Student2Collection);
            }
        } else {
            Iterator it = Student2Collection.iterator();
            if (it.hasNext()) {
                Student Student2single = (Student) it.next();
                displayAboveTarget(Student2single, pathToTarget, findAll);
            }
        }
    }

    /**
     * Displays domain object which lies above the target in the object selection.
     * @param Student2Object the domain object to display
     * @param pathToTarget a list of nodes representing the path to the target
     * @param findAll if <code>true</code> the display is a result of a find 
     * all action. CursorCommon.pre
     */
    public void displayAboveTarget(Student Student2Object, List pathToTarget, boolean findAll) {
        if (pathToTarget.size() == 1 && pathToTarget.get(0) == this) {
            recursiveDisplay(Student2Object);
        } else {
            pathToTarget.remove(this);
            display(Student2Object);
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
     * Recursivly displays the object representing the Student2-role.
     * First, the object is displayed, then, each child is displayed. 
     *
     * @param someStudent2 the (domain) object to display.
     */
    public void recursiveDisplay(Student someStudent2) {
        if (callHookBeforeDisplay(someStudent2, "Student2")) {
            if (someStudent2 == null) {
                return; // nothing more to display!
            }
            display(someStudent2);
        }
    }
    /**
     * Displays a Collection of Student2 objects.
     * Each instance of Student2 is inserted in the corresponding
     * list block (StudentsListBlock).
     * @param Student2Collection the Collection containing the (domain) objects to display.
     */
    public void recursiveDisplay(Collection Student2Collection) {
        controller.listblockMethodsStudentsListBlock.purgeAllLines();
        Iterator it = Student2Collection.iterator();
        List allLines = TypeTool.getDefaultList();
        while (it.hasNext()) {
            Student Student2Object = (Student) it.next();
            LineListblockStudentsListBlock line = controller
                .listblockMethodsStudentsListBlock
                    .createListblockLine();
            insertInListblockLine(Student2Object, line);
            if (controller.listblockMethodsStudentsListBlock
                    .callHooksBeforeInsert(line)) {
                allLines.add(line);
            }
        }
        controller.listblockMethodsStudentsListBlock.initialSort(allLines);
        it = allLines.iterator();
        while (it.hasNext()) {
            LineListblockStudentsListBlock line = (LineListblockStudentsListBlock) it.next();
            controller.listblockMethodsStudentsListBlock
                    .insertListblockLine(line);
        }
        controller.listblockMethodsStudentsListBlock.forceClean();
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
     * Obtains a Set of Student2 objects from the StudentsListBlock listblock.
     * Note that roles that are not represented in a coluumn will not
     * be created (compatible with old version). Other roles will
     * be created.
     * @return the obtained set of Student2 objects
     * @deprecated use {@link #obtainSet(boolean)} instead.
     */
    public Set obtainSet() {
        Set Student2Set = TypeTool.getDefaultSet();
        List allLines = controller.listblockMethodsStudentsListBlock.allLines();
        Iterator it = allLines.iterator();
        while (it.hasNext()) {
            LineListblockStudentsListBlock line = (LineListblockStudentsListBlock) it.next();
            Object o = null;
            o = line.getObject("Student2");
            if (o != null) {
                Student2Set.add(o);
            }
        }
        return Student2Set;
    }


    /**
     * Obtains a Set of Student2 objects from the StudentsListBlock listblock. The
     * parameter controlls wheter objects are created when getting them from 
     * the listblock line or not.
     * @param createIfNull if <code>true</code> objects are created.
     * @return the obtained set of Student2 objects.
     * @see ListblockLine#getObject(String, boolean)
     */
    public Set obtainSet(boolean createIfNull) {
        Set Student2Set = TypeTool.getDefaultSet();
        List allLines = controller.listblockMethodsStudentsListBlock.allLines();
        Iterator it = allLines.iterator();
        while (it.hasNext()) {
            LineListblockStudentsListBlock line = (LineListblockStudentsListBlock) it.next();
            Object o = null;
            o = line.getObject("Student2", createIfNull);
            if (o != null) {
                Student2Set.add(o);
            }
        }
        return Student2Set;
    }

    /**
     * Recursivly obtains the Student2 from the dialog.
     * If the Student2 is previously displayed and is unchanged, 
     * no obtain is performed, and the returned value is null. The <code>singleObtain</code>
     * parameter is used to singal if obtain from more-related should be done on edit fields, 
     * or the entire set of domain objects (e.g the listblock).
     * @param pathToTarget a list of nodes representing the path to the target.
     * @param singleObtain if <code>true</code>, obtain on more-related is done from edit-fields.
     * @return the obtained Student2 object.
     */
    public Student recursiveObtain(List pathToTarget, boolean singleObtain) {
        return recursiveObtain(pathToTarget, singleObtain, false);
    }

    /**
     * Recursivly obtains the Student2 from the dialog.
     * If the Student2 is previously displayed and is unchanged, the
     * no obtain is performed, and the returned value is null. The <code>singleObtain</code>
     * parameter is used to singal if obtain from more-related should be done on edit fields, 
     * or the entire set of domain objects (e.g the listblock).
     * @param pathToTarget a list of nodes representing the path to the target.
     * @param singleObtain if <code>true</code>, obtain on more-related is done from edit-fields.
     * @param forceObtain if <code>true</code> obtain is always done.
     * @return the obtained Student2 object.
     */
    public Student recursiveObtain(List pathToTarget, boolean singleObtain, boolean forceObtain) {
        boolean hasValue = forceObtain || getState() != ObjectSelectionNode.CLEARED;
        pathToTarget.remove(this);
        boolean belowTarget = pathToTarget.size() == 0;
        Student theStudent2Single = null;
        if (hasValue) {
            theStudent2Single = obtain();
            saveAssociations(theStudent2Single);
            removeAssociations(theStudent2Single);
        }
        return theStudent2Single;
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
        line.insertObject("Student2", obj);
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
