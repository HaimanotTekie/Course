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
 * Access methods for Course. Use variable theCourse to access
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
public class CourseMethods extends AbstractNode<Course> {

    AddStudentsToCourseDefaultView view;
    GenovaEnums genovaEnums;
    AddStudentsToCourseDefaultController controller;
    ObjectSelectionNode parentNode;
    List childNodes = new ArrayList();
    CourseMethods(AddStudentsToCourseDefaultView view, AddStudentsToCourseDefaultController controller, GenovaEnums genovaEnums) {
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
        return "Course";
    }


    public void addChild(ObjectSelectionNode child) {
        childNodes.add(child);
    }
    public boolean callHookBeforeDisplay(Object objectToDisplay, String roleName) {
       return controller.hookBeforeDisplay(objectToDisplay, roleName);
    }


    public boolean callCheckSaveHook() {
        return controller.callCheckSaveHook("Course");
    }


    public boolean callCheckDeleteHook() {
        return controller.callCheckDeleteHook("Course");
    }


    public boolean callCheckCloseHook() {
        return controller.callCheckCloseHook("Course");
    }


    public boolean callCheckClearHook() {
        return controller.callCheckClearHook("Course");
    }


    public boolean callCheckFindHook() {
        return controller.callCheckFindHook("Course");
    }


    public boolean callCheckChangeHook() {
        return controller.callCheckChangeHook("Course");
    }


    public boolean callCheckRowSelectHook(int currentSelectionIndex, int newSelectionIndex) {
        return controller.callCheckRowSelectHook("Course", currentSelectionIndex, newSelectionIndex);
    }


    public GenovaDialogController getController() {
        return controller;
    }


    /**
     * Returns an object representing the relation Course from the
     * dialog. This method does exactly the same as {@link #obtain()}, and
     * differs only in the return type, specified in the interface.
     * @return Object of Course with attributes from the OS.
     */
    public Object obtainAsObject() {
        return obtain();
    }    
    public Object getEmptyDomainObject() {
        return new Course();
    }
    public Class getRepresentingClass() {
        return Course.class;
    }
    /** 
     * Returns an object representing the relation Course from the
     * dialog. If Course is displayed in the dialog, 
     * the Course domain object is used, else a new Course object 
     * is created. Attributes present in the dialog are then 
     * copied into the Course object. 
     * 
     * <p>Before returning, the controller's hookAfterObtainCourse method 
     * is invoked, giving the application programmer 
     * the possibility to manipulate or replace the object.
     * 
     * @return Object of Course updated from the dialog.
     */
    public Course obtain() {
        if (objectProxy == null) {
            Course tmpCourse = new Course();
            objectProxy = controller
                    .getProxy(tmpCourse, "Course");
        }
        objectProxy.setAttribute
            ("code", view.Course_code.getValue());
        objectProxy.setAttribute
            ("id", view.Course_id.getValue());
   
    /* Her kommer generert kode for CheckButton:ObtainData*/
    
//        tmpCourse.isActive=TypeTool.convert(view.Course_isActive.getText(), tmpCourse.isActive);
    // controller.reflectAssign(tmpCourse, "isActive", TypeTool.convertToString(view.Course_isActive.isSelected())); /* Check Button */
    objectProxy.setAttribute("isActive", new Boolean(view.Course_isActive.isSelected()));
        objectProxy.setAttribute
            ("name", view.Course_name.getValue());

       Course obtainedObject = (Course) objectProxy.getObject();
       Course manipulated = controller.hookAfterObtainCourse(obtainedObject);
       if (manipulated != null) {
           obtainedObject = manipulated;
       }
       return obtainedObject;
    }

    public String obtain(String attr) {
        attr = TypeTool.stripRoleNamePrefix(attr, getRoleName());
        if ("code".equals(attr)) {
            return view.Course_code.format();
        }
        if ("id".equals(attr)) {
            return view.Course_id.format();
        }
    if ("isActive".equals(attr)) {
        return view.Course_isActive.isSelected() ? "true" : "false";
    }
        if ("name".equals(attr)) {
            return view.Course_name.format();
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
        if (domainObject instanceof Course) {
            display((Course) domainObject);
        }
    }

   /**
    * Updates data of the Course node in the dialog, and sets
    * the state to CLEAN.
    *
    * @param tmpCourse Attributes are copied from this object.
    */
    public void display(Course tmpCourse) {
        if (!SwingUtilities.isEventDispatchThread()) {
            displayOnEDT(tmpCourse);
            return;
        }
        if (tmpCourse == null) {
            tmpCourse= new Course();
        }
        controller.resetProxy();
        objectProxy = controller.getNewProxy(tmpCourse, "Course");
        boolean resetState = true;
        display("code", TypeTool.toObject(tmpCourse.getCode()), resetState);
        display("id", TypeTool.toObject(tmpCourse.getId()), resetState);
        display("isActive", TypeTool.toObject(tmpCourse.getIsActive()), resetState);
        display("name", TypeTool.toObject(tmpCourse.getName()), resetState);
        setState(ObjectSelectionNode.CLEAN, false);
    }
    public boolean isConsistant() {
    if(!TypeTool.isConsistant(view.Course_code.getText(), oldCourse.getCode())) {
        return false;
    }
    if(!TypeTool.isConsistant(view.Course_id.getText(), oldCourse.getId())) {
        return false;
    }
    if(!TypeTool.isConsistant(view.Course_name.getText(), oldCourse.getName())) {
        return false;
    }
        return true;
     }    

    public boolean hasValue() {
    if(view.Course_code.getText() == null || view.Course_code.getText().length() == 0) {
        return false;
    }
    if(view.Course_id.getText() == null || view.Course_id.getText().length() == 0) {
        return false;
    }
    if(view.Course_name.getText() == null || view.Course_name.getText().length() == 0) {
        return false;
    }
       return true;
    }
    public boolean hasOneValue() {
    if(view.Course_code.getText() != null && view.Course_code.getText().trim().length() > 0) {
        return true;
    }
    if(view.Course_id.getText() != null && view.Course_id.getText().trim().length() > 0) {
        return true;
    }
    if(view.Course_name.getText() != null && view.Course_name.getText().trim().length() > 0) {
        return true;
    }
       return false;
    }

    public boolean hasValue(String field) {
        field = TypeTool.stripRoleNamePrefix(field, getRoleName());
    if(field.equals("code") && (view.Course_code.getText() == null || view.Course_code.getText().length() == 0)) {
        return false;
    }
    if(field.equals("id") && (view.Course_id.getText() == null || view.Course_id.getText().length() == 0)) {
        return false;
    }
    if(field.equals("name") && (view.Course_name.getText() == null || view.Course_name.getText().length() == 0)) {
        return false;
    }
       return true;
    }

    public void setStyle(Color foreground, Color background) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setStyleOnEDT(foreground, background);
            return;
        }
    view.Course_code.setForeground(foreground);
    view.Course_code.setBackground(background);
    view.Course_id.setForeground(foreground);
    view.Course_id.setBackground(background);
    view.Course_name.setForeground(foreground);
    view.Course_name.setBackground(background);
    }
    public void osDisplay(Object value, String attribute, 
            boolean resetState) {
        if (value instanceof Course) {
            display(((Course) value), attribute, resetState);
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
        if ("code".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.Course_code.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.Course_code.setInitialValue(valueObject);
            }
            view.Course_code.setValue(valueObject);
            view.Course_code.setCaretPosition(0);
        }
        if ("id".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.Course_id.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.Course_id.setInitialValue(valueObject);
            }
            view.Course_id.setValue(valueObject);
            view.Course_id.setCaretPosition(0);
        }
        if ("isActive".equals(attributeName)) {
            view.countUpBlocKSelectionEventCourseisActive();
            if (resetState) {
                view.Course_isActive.setInitialValue(value);
            }
            if (value != null) {
                view.Course_isActive.setSelected(((Boolean) value).booleanValue());
            } else {
                view.Course_isActive.setSelected(false);
            }
            view.oldValueCourseisActive = TypeTool.convertToString(value);
            view.countDownBlocKSelectionEventCourseisActive();
        }
        if ("name".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.Course_name.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.Course_name.setInitialValue(valueObject);
            }
            view.Course_name.setValue(valueObject);
            view.Course_name.setCaretPosition(0);
        }
        view.noFocusException--;
    }

    /**
     * Updates data of given attriubte in object selection in the dialog.
     *
     * @param tmpCourse Attributes are copied from this object.
     * @param s The attribute to set.
     */
    public void display(Course tmpCourse, String s) {
        display(tmpCourse, s, true);
    }

    @Override
    public void display(Course tmpCourse, String attributeName, boolean resetState) {
        if (!SwingUtilities.isEventDispatchThread()){
            displayOnEDT(tmpCourse, attributeName, resetState);
            return;
        }
        attributeName = TypeTool
                .stripRoleNamePrefix(attributeName, getRoleName());
       if (tmpCourse != null) {
           Object value = null;
            if (attributeName.equals("code")) {
                value = TypeTool.toObject(tmpCourse.getCode());
            }
            if (attributeName.equals("id")) {
                value = TypeTool.toObject(tmpCourse.getId());
            }
            if (attributeName.equals("isActive")) {
                value = TypeTool.toObject(tmpCourse.getIsActive());
            }
            if (attributeName.equals("name")) {
                value = TypeTool.toObject(tmpCourse.getName());
            }
           display(attributeName, value, resetState);
       }
    }
    boolean zeroCoursecode = false;
    boolean zeroCourseid = false;
    boolean zeroCourseisActive = false;
    boolean zeroCoursename = false;
    /**
     * @param s the name of the attribute
     * @param val the setShowZero property
     * @deprecated - use display rules to set this display rule.
     */
    public void setShowZero(String s, boolean val) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
       val = !val;
    if(s.equals("code")) {
        zeroCoursecode = val;
    }
    if(s.equals("id")) {
        zeroCourseid = val;
    }
    if(s.equals("name")) {
        zeroCoursename = val;
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
    view.Course_code.setInitialValue(null);
    view.oldValueCoursecode = "";
    view.Course_code.setValue(null);
    view.Course_code.resetState();
    view.Course_id.setInitialValue(null);
    view.oldValueCourseid = "";
    view.Course_id.setValue(null);
    view.Course_id.resetState();
    view.countUpBlocKSelectionEventCourseisActive();
    view.Course_isActive.setSelected(false) ;
    view.oldValueCourseisActive = TypeTool.convertToString(false);
    view.countDownBlocKSelectionEventCourseisActive();
    view.Course_name.setInitialValue(null);
    view.oldValueCoursename = "";
    view.Course_name.setValue(null);
    view.Course_name.resetState();
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
        clear("id");
        clear("isActive");
        clear("name");
        view.noFocusException--;
    }
    public void clear(String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            clearOnEDT(s);
            return;
        }
        view.noFocusException++;
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("code")) {
        view.oldValueCoursecode = "";
        view.Course_code.setInitialValue(null);
        view.Course_code.setValue(null);
        view.Course_code.resetState();
    }
    if (s.equals("id")) {
        view.oldValueCourseid = "";
        view.Course_id.setInitialValue(null);
        view.Course_id.setValue(null);
        view.Course_id.resetState();
    }
    if (s.equals("isActive")) {
        view.countUpBlocKSelectionEventCourseisActive();
        view.Course_isActive.setSelected(false) ;
        view.oldValueCourseisActive = TypeTool.convertToString(false);
        view.countDownBlocKSelectionEventCourseisActive();
    }
    if (s.equals("name")) {
        view.oldValueCoursename = "";
        view.Course_name.setInitialValue(null);
        view.Course_name.setValue(null);
        view.Course_name.resetState();
    }
        view.noFocusException--;
    }
    public void setEnabled(boolean b) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setEnabledOnEDT(b);
            return;
        }
    view.Course_code.setEnabled(b);
    view.Course_id.setEnabled(b);
    view.Course_isActive.setEnabled(b);
    view.Course_name.setEnabled(b);
    }
    public void setEnabled(boolean b, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setEnabledOnEDT(b, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("code")) {
        view.Course_code.setEnabled(b);
    }
    if (s.equals("id")) {
        view.Course_id.setEnabled(b);
    }
        if (s.equals("isActive")) {
            view.Course_isActive.setEnabled(b);
        }
    if (s.equals("name")) {
        view.Course_name.setEnabled(b);
    }
    }
    public boolean isEnabled() {
        boolean b = false;
    if (view.Course_code.isEnabled()) b=true;
    if (view.Course_id.isEnabled()) b=true;
    if (view.Course_isActive.isEnabled()) b=true;
    if (view.Course_name.isEnabled()) b=true;
       return b;
    }
    public boolean isEnabled(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (s.equals("code")) {
        if (view.Course_code.isEnabled()) b=true;
    }
    if (s.equals("id")) {
        if (view.Course_id.isEnabled()) b=true;
    }
        if (s.equals("isActive")) {
            if (view.Course_isActive.isEnabled()) b=true;
        }
    if (s.equals("name")) {
        if (view.Course_name.isEnabled()) b=true;
    }
       return b;
    }
    public void setShown(boolean b) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setShownOnEDT(b);
            return;
        }
    view.Course_code.setVisible(b);
    view.Course_id.setVisible(b);
    view.Course_isActive.setVisible(b);
    view.Course_name.setVisible(b);
    
    /* Her kommer generert kode for SimpleBlock:setShown*/
    
    view.CourseClass.setVisible(b);
    
    /* Her kommer generert kode for SimpleBlock:setShown*/
    
    view.CourseData.setVisible(b);
    view.CourseCodeLabelLabel.setVisible(b);
    view.CourseIdLabelLabel.setVisible(b);
    view.CourseNameLabelLabel.setVisible(b);
    
    /* Her kommer generert kode for SimpleBlock:setShown*/
    
    view.CourseButton.setVisible(b);
    }
    public void setShown(boolean b, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setShownOnEDT(b, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("code")) {
        view.Course_code.setVisible(b);
    }
    if (s.equals("id")) {
        view.Course_id.setVisible(b);
    }
        if (s.equals("isActive")) {
            view.Course_isActive.setVisible(b);
        }
    if (s.equals("name")) {
        view.Course_name.setVisible(b);
    }
    
    /* Her kommer generert kode for SimpleBlock:setShownField*/
    
    if (s.equals("CourseClass")) {
        view.CourseClass.setVisible(b);
    }
    
    /* Her kommer generert kode for SimpleBlock:setShownField*/
    
    if (s.equals("CourseData")) {
        view.CourseData.setVisible(b);
    }
        if (s.equals("CourseCodeLabel")) {
            view.CourseCodeLabelLabel.setVisible(b);
        }
        if (s.equals("CourseIdLabel")) {
            view.CourseIdLabelLabel.setVisible(b);
        }
        if (s.equals("CourseNameLabel")) {
            view.CourseNameLabelLabel.setVisible(b);
        }
    
    /* Her kommer generert kode for SimpleBlock:setShownField*/
    
    if (s.equals("CourseButton")) {
        view.CourseButton.setVisible(b);
    }
    }
    public boolean isShown() {
        boolean b = false;
    if (view.Course_code.isEnabled()) b=true;
    if (view.Course_id.isEnabled()) b=true;
    if (view.Course_isActive.isEnabled()) b=true;
    if (view.Course_name.isEnabled()) b=true;
        return b;
    }
    public boolean isShown(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (s.equals("code")) {
        if (view.Course_code.hasFocus()) b=true;
    }
    if (s.equals("id")) {
        if (view.Course_id.hasFocus()) b=true;
    }
        if (s.equals("isActive")) {
            if (view.Course_isActive.hasFocus()) b=true;
        }
    if (s.equals("name")) {
        if (view.Course_name.hasFocus()) b=true;
    }
    
    /* Her kommer generert kode for SimpleBlock:isShown*/
    
    if (view.CourseClass.isEnabled()) b=true;
    
    /* Her kommer generert kode for SimpleBlock:isShownField*/
    
    if (s.equals("CourseClass")) {
        if (view.CourseClass.hasFocus()) b=true;
    }
    
    /* Her kommer generert kode for SimpleBlock:isShown*/
    
    if (view.CourseData.isEnabled()) b=true;
    if (view.CourseCodeLabelLabel.isEnabled()) b=true;
    if (view.CourseIdLabelLabel.isEnabled()) b=true;
    if (view.CourseNameLabelLabel.isEnabled()) b=true;
    
    /* Her kommer generert kode for SimpleBlock:isShownField*/
    
    if (s.equals("CourseData")) {
        if (view.CourseData.hasFocus()) b=true;
    }
        if (s.equals("CourseCodeLabel")) {
            if (view.CourseCodeLabelLabel.hasFocus()) b=true;
        }
        if (s.equals("CourseIdLabel")) {
            if (view.CourseIdLabelLabel.hasFocus()) b=true;
        }
        if (s.equals("CourseNameLabel")) {
            if (view.CourseNameLabelLabel.hasFocus()) b=true;
        }
    
    /* Her kommer generert kode for SimpleBlock:isShown*/
    
    if (view.CourseButton.isEnabled()) b=true;
    
    /* Her kommer generert kode for SimpleBlock:isShownField*/
    
    if (s.equals("CourseButton")) {
        if (view.CourseButton.hasFocus()) b=true;
    }
       return b;
    }

    public void setFocus(String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setFocusOnEDT(s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("code")) {
        view.Course_code.requestFocusInWindow();
    }
    if (s.equals("id")) {
        view.Course_id.requestFocusInWindow();
    }
        if (s.equals("isActive")) {
            view.Course_isActive.requestFocus();
        }
    if (s.equals("name")) {
        view.Course_name.requestFocusInWindow();
    }
    }
    public boolean hasFocus(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (view.Course_code.hasFocus()) b=true;
    if (view.Course_id.hasFocus()) b=true;
    if (view.Course_isActive.hasFocus()) b=true;
    if (view.Course_name.hasFocus()) b=true;
        return b;
    }
    @Override
    public void append(Course tmpCourse, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            appendOnEDT(tmpCourse, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        view.noFocusException++;
        if(tmpCourse == null) {
            tmpCourse= new Course();
        }
        view.noFocusException--;
    }
    /** Resets current state of relation Course in the dialog. Sets changed to false and sets old object to be the current object. 
     * @return Reference to the object that was the new object, that now is the old. 
     */
    public Course reset() {
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
        if ("code".equals(attributeName)) {
            return true;
        }

        return false;
   }  
    private Course oldCourse = new Course();
    private boolean isMarkedChanged = false;
    
    
    /** Sets the old version of the object selection node.
     * NOTE: The object is not copied, it is referenced.
     * @param inst The new object to be used as the old. 
     * 
     */
    public void setOld(Course inst) {
        oldCourse = inst;
    }
    
    
   /** 
    * Returns the old object. The object is not copied.
    * @return The object.
    */
    public Course getOld() {
        return oldCourse;
    }
    
    
    /**
     * Returns the string representing the main key attribute of this role.
     * @return the main key
     */
    public String getTargetMainKey() {
        return "code";
    }
    boolean isMarkedChangedcode = false;
    boolean isMarkedChangedid = false;
       boolean isMarkedChangedisActive = false;
    boolean isMarkedChangedname = false;
    public void setChanged (boolean b, String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());        
    if (s.equals("code")) {
        isMarkedChangedcode = b;
    }    
    if (s.equals("id")) {
        isMarkedChangedid = b;
    }    
        if (s.equals("isActive")) {
                isMarkedChangedisActive = b;
        }    
    if (s.equals("name")) {
        isMarkedChangedname = b;
    }    
     }
    public void setChanged(boolean b) {
        isMarkedChanged = b;
    isMarkedChangedcode = b;
    isMarkedChangedid = b;
         isMarkedChangedisActive = b;
    isMarkedChangedname = b;
     }
    /** 
     * Returns whether Course has changed state since last 
     * call on resetCourse().<br>
     * It will both parse the current state of the block
     * and compare with the dialogattribute named in input String s.
     * @param s The attribute to check.
     * @param tmpCourse The object to compare with.
     * @return True if changed, false if not.
     * @deprecated use ObjectSelectionNode#isChanged(String)
     */
    public boolean isChanged(String s, Course tmpCourse) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean bChanged = false;
        if(isMarkedChanged) return true;
    if (s.equals("code")) {
        if (isMarkedChangedcode) bChanged = true;
        if (tmpCourse != null && oldCourse != null) {
        if (!TypeTool.equals(tmpCourse.getCode(), oldCourse.getCode())) {
            bChanged = true;
            isMarkedChangedcode = true;
            }
        }
    }    
    if (s.equals("id")) {
        if (isMarkedChangedid) bChanged = true;
        if (tmpCourse != null && oldCourse != null) {
        if (!TypeTool.equals(tmpCourse.getId(), oldCourse.getId())) {
            bChanged = true;
            isMarkedChangedid = true;
            }
        }
    }    
        if (s.equals("isActive")) {
            if (isMarkedChangedisActive) bChanged = true;
            if (tmpCourse != null && oldCourse != null) {
            // Her må vi sammenligne på en annen måte enn = ( for strings) ???
            if (!TypeTool.equals(tmpCourse.getIsActive(), oldCourse.getIsActive())) {
                bChanged = true;
                isMarkedChangedisActive = true;
                }
            }
        }    
    if (s.equals("name")) {
        if (isMarkedChangedname) bChanged = true;
        if (tmpCourse != null && oldCourse != null) {
        if (!TypeTool.equals(tmpCourse.getName(), oldCourse.getName())) {
            bChanged = true;
            isMarkedChangedname = true;
            }
        }
    }    
         return bChanged;
     }
    
    
    /** 
     * Returns whether Course has changed state since last call on
     * resetCourse().  It will both parse the current state of the
     * block and compare with the dialogattributes of tmpCourse.  
     * @param tmpCourse The object to compare with.
     * @return <code>true</code> if changed, <code>false</code> if not.
     * @deprecated use ObjectSelection#getState()
     */
    public boolean isChanged(Course tmpCourse) {
        if(isMarkedChanged) return true;
    if (isMarkedChangedcode) isMarkedChanged = true;
    if (oldCourse != null) {
        if (!TypeTool.equals(tmpCourse.getCode(), oldCourse.getCode())) {
            isMarkedChanged = true;
            isMarkedChangedcode = true;
        }
    }
    if (isMarkedChangedid) isMarkedChanged = true;
    if (oldCourse != null) {
        if (!TypeTool.equals(tmpCourse.getId(), oldCourse.getId())) {
            isMarkedChanged = true;
            isMarkedChangedid = true;
        }
    }
        if (isMarkedChangedisActive) isMarkedChanged = true;
        if (tmpCourse != null && oldCourse != null) {
            if (!TypeTool.equals(tmpCourse.getIsActive(), oldCourse.getIsActive())) {
             isMarkedChanged = true;
             isMarkedChangedisActive = true;
            }
        }
    if (isMarkedChangedname) isMarkedChanged = true;
    if (oldCourse != null) {
        if (!TypeTool.equals(tmpCourse.getName(), oldCourse.getName())) {
            isMarkedChanged = true;
            isMarkedChangedname = true;
        }
    }
    if(false) {
        tmpCourse.getClass();
    }
        return isMarkedChanged;
    }

    public Set getChangedFields() {
        Set changedFields = new HashSet();
        Object component = null;

        component = controller.view.fromNameToComponent("Course.code");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("code");
            }
        }
        component = controller.view.fromNameToComponent("Course.id");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("id");
            }
        }
        component = controller.view.fromNameToComponent("Course.isActive");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("isActive");
            }
        }
        component = controller.view.fromNameToComponent("Course.name");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("name");
            }
        }

        return changedFields;
    }

    public Set getChangedKeyFields() {
        Set changedFields = new HashSet();
        Object component = null;

        if (isPartOfKey("code")) {
            component = controller.view.fromNameToComponent("Course.code");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("code");
                }
            }
        }
        if (isPartOfKey("id")) {
            component = controller.view.fromNameToComponent("Course.id");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("id");
                }
            }
        }
        if (isPartOfKey("isActive")) {
            component = controller.view.fromNameToComponent("Course.isActive");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("isActive");
                }
            }
        }
        if (isPartOfKey("name")) {
            component = controller.view.fromNameToComponent("Course.name");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("name");
                }
            }
        }

        return changedFields;
    }

    public void resetFields() {
        Object component = null;

        component = controller.view.fromNameToComponent("Course.code");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
        component = controller.view.fromNameToComponent("Course.id");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
        component = controller.view.fromNameToComponent("Course.isActive");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
        component = controller.view.fromNameToComponent("Course.name");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
    }
    
    /**
     * Displays domain objects which lies above the target in the object selection.
     * @param CourseCollection the collection of domain objects to display
     * @param pathToTarget a list of nodes representing the path to the target
     * @param findAll if <code>true</code> displaying is done as part of 
     *      a find all action.
     */
    public void displayAboveTarget(Collection CourseCollection, List pathToTarget, boolean findAll) {
        if (pathToTarget.size() == 1 && pathToTarget.get(0) == this) {
            if (!findAll && CourseCollection instanceof List) {
                Iterator it = CourseCollection.iterator();
                if (it.hasNext()) {
                    Course Coursesingle = (Course) it.next();
                    recursiveDisplay(Coursesingle);
                }
            } else { 
                recursiveDisplay(CourseCollection);
            }
        } else {
            Iterator it = CourseCollection.iterator();
            if (it.hasNext()) {
                Course Coursesingle = (Course) it.next();
                displayAboveTarget(Coursesingle, pathToTarget, findAll);
            }
        }
    }

    /**
     * Displays domain object which lies above the target in the object selection.
     * @param CourseObject the domain object to display
     * @param pathToTarget a list of nodes representing the path to the target
     * @param findAll if <code>true</code> the display is a result of a find 
     * all action. CursorCommon.pre
     */
    public void displayAboveTarget(Course CourseObject, List pathToTarget, boolean findAll) {
        if (pathToTarget.size() == 1 && pathToTarget.get(0) == this) {
            recursiveDisplay(CourseObject);
        } else {
            pathToTarget.remove(this);
            display(CourseObject);
            boolean studentCoursesupRelated = false;
            if (studentCoursesupRelated || pathToTarget.contains(controller.thestudentCourses)) {
                Object child = null;
                if (CourseObject != null) {
                    child = CourseObject.getStudentCourses();
                }
                if (child instanceof StudentCourse) {
                    StudentCourse childStudentCourse = (StudentCourse) child;
                    controller.thestudentCourses.displayAboveTarget
                            (childStudentCourse, pathToTarget, findAll);
                } else if (child instanceof Collection) {
                    Collection childCollection = (Collection) child;
                    controller.thestudentCourses.displayAboveTarget
                            (childCollection, pathToTarget, findAll);
                }
            }
        }
    }


    public void mergeAssociations(Object domainObject, List pathToTarget, boolean error) {
        mergeAssociations((Course) domainObject, pathToTarget,error);
    }


    /**
     * Internal use.
     * Merges the association on the specified parent object
     * @param parentObject the parent object
     * @param pathToTarget the list representing path to target
     */
    protected void mergeAssociations(Course parentObject, List pathToTarget,boolean error) {
        pathToTarget.remove(this);

        if (pathToTarget.size() <= 1) {      
            Object targetNode = pathToTarget.size() > 0 ? pathToTarget.get(0) : null;
  
            // Merging db set of studentCourses with stored set
            Set dbstudentCoursesSet = (controller.thestudentCourses == targetNode && error) ? null : parentObject.getStudentCourses();
            Set storedstudentCoursesSet = (Set) getAssociation("studentCourses", parentObject);
            if (storedstudentCoursesSet != null) {
                if (dbstudentCoursesSet != null && !DomainUtil.isLazy(dbstudentCoursesSet)) {
                    // Merge stored set and db set

                    // BUGFIX - since dbstudentCoursesSet might be a de-serialized set, 
                    // and internal hashing is broken on de-serialization, we must
                    // re-hash the entire set.
                    // Fortunately, the dbstudentCoursesSet is not
                    // likely to contain many objects...
                    dbstudentCoursesSet = TypeTool.reHash(dbstudentCoursesSet);

                    dbstudentCoursesSet.addAll(storedstudentCoursesSet);
                    storedstudentCoursesSet = dbstudentCoursesSet;
                }
                
                // Set association to new parent.
                Iterator studentCoursesIterator = storedstudentCoursesSet.iterator();
                while (studentCoursesIterator.hasNext()) {
                    StudentCourse studentCoursesSingle = (StudentCourse) studentCoursesIterator.next();
                    studentCoursesSingle.setCourse(parentObject);
                    controller.thestudentCourses.mergeAssociations(studentCoursesSingle, pathToTarget,error);
                }
                parentObject.setStudentCourses(storedstudentCoursesSet);
            }
            return;
        }

        // Since pathToTarget is destroyed on the way, keep a reference
        // to the node next in line.
        Object nextOnPath = pathToTarget.get(0);

        // Merge next node on path befor other children (depth first)
        if (controller.thestudentCourses == nextOnPath) {
            Set dbstudentCoursesSet = parentObject.getStudentCourses();
            if (dbstudentCoursesSet != null && !DomainUtil.isLazy(dbstudentCoursesSet)) {
                Iterator it = dbstudentCoursesSet.iterator();
                while (it.hasNext()) {
                    StudentCourse dbstudentCoursesSingle = (StudentCourse) it.next();
                    controller.thestudentCourses.mergeAssociations(dbstudentCoursesSingle, pathToTarget,error);
                }
            }
            
            Set storedstudentCoursesSet = (Set) getAssociation("studentCourses", parentObject);
            if (storedstudentCoursesSet != null) {
                if (!DomainUtil.isLazy(dbstudentCoursesSet)) {
                    // Merge stored set and db set

                    // BUGFIX - since dbstudentCoursesSet might be a de-serialized set, 
                    // and internal hashing is broken on de-serialization, we must
                    // re-hash the entire set.
                    // Fortunately, the dbstudentCoursesSet is not
                    // likely to contain many objects...
                    dbstudentCoursesSet = TypeTool.reHash(dbstudentCoursesSet);

                    dbstudentCoursesSet.addAll(storedstudentCoursesSet);
                    storedstudentCoursesSet = dbstudentCoursesSet;
                }
            
                {   // studentCourses is navigable to parent - fix association. Limit scope of iterator
                    Iterator it = storedstudentCoursesSet.iterator();
                    while (it.hasNext()) {
                        StudentCourse singlestudentCourses = (StudentCourse) it.next();
                        singlestudentCourses.setCourse(parentObject);
                    } 
                } 
                parentObject.setStudentCourses(storedstudentCoursesSet);
            }
        }

       // Replace children not on path with stored children.
        if (controller.thestudentCourses != nextOnPath) {
            Set storedstudentCoursesSet = (Set) getAssociation("studentCourses", parentObject);
            // set association to new parent
            if (storedstudentCoursesSet != null) {
                Iterator it = storedstudentCoursesSet.iterator();
                while (it.hasNext()) {
                    StudentCourse studentCoursesSingle = (StudentCourse) it.next();
                    studentCoursesSingle.setCourse(parentObject);
                }
            } else {
                storedstudentCoursesSet = TypeTool.getDefaultSet();
            }
            // replace parent's set.
            parentObject.setStudentCourses(storedstudentCoursesSet);
        }
   }

    /** 
     * Recursivly displays the object representing the Course-role.
     * First, the object is displayed, then, each child is displayed. 
     *
     * @param someCourse the (domain) object to display.
     */
    public void recursiveDisplay(Course someCourse) {
        if (callHookBeforeDisplay(someCourse, "Course")) {
            if (someCourse == null) {
                return; // nothing more to display!
            }
            display(someCourse);
        }
        Object objectstudentCourses = someCourse.getStudentCourses();
        if (objectstudentCourses instanceof StudentCourse) {
            StudentCourse tmp = (StudentCourse) objectstudentCourses;
            controller.thestudentCourses.recursiveDisplay(tmp);
        } else if (objectstudentCourses instanceof Collection) {
            Collection tmp = (Collection) objectstudentCourses;
            controller.thestudentCourses.recursiveDisplay(tmp);
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
     * Recursivly obtains the Course from the dialog.
     * If the Course is previously displayed and is unchanged, 
     * no obtain is performed, and the returned value is null. The <code>singleObtain</code>
     * parameter is used to singal if obtain from more-related should be done on edit fields, 
     * or the entire set of domain objects (e.g the listblock).
     * @param pathToTarget a list of nodes representing the path to the target.
     * @param singleObtain if <code>true</code>, obtain on more-related is done from edit-fields.
     * @return the obtained Course object.
     */
    public Course recursiveObtain(List pathToTarget, boolean singleObtain) {
        return recursiveObtain(pathToTarget, singleObtain, false);
    }

    /**
     * Recursivly obtains the Course from the dialog.
     * If the Course is previously displayed and is unchanged, the
     * no obtain is performed, and the returned value is null. The <code>singleObtain</code>
     * parameter is used to singal if obtain from more-related should be done on edit fields, 
     * or the entire set of domain objects (e.g the listblock).
     * @param pathToTarget a list of nodes representing the path to the target.
     * @param singleObtain if <code>true</code>, obtain on more-related is done from edit-fields.
     * @param forceObtain if <code>true</code> obtain is always done.
     * @return the obtained Course object.
     */
    public Course recursiveObtain(List pathToTarget, boolean singleObtain, boolean forceObtain) {
        boolean hasValue = forceObtain || getState() != ObjectSelectionNode.CLEARED;
        pathToTarget.remove(this);
        boolean belowTarget = pathToTarget.size() == 0;
        Set thestudentCoursesSet = null;
        boolean isstudentCoursesUpRelated = false;
        boolean isstudentCoursesOnPath = pathToTarget.contains(controller.thestudentCourses);
        if (isstudentCoursesUpRelated || belowTarget || isstudentCoursesOnPath) {

            thestudentCoursesSet = controller.thestudentCourses.recursiveObtain(pathToTarget, singleObtain);
            hasValue = hasValue || !thestudentCoursesSet.isEmpty();
        }
        Course theCourseSingle = null;
        if (hasValue) {
            theCourseSingle = obtain();
            saveAssociations(theCourseSingle);
            removeAssociations(theCourseSingle);
            if (isstudentCoursesUpRelated || belowTarget || isstudentCoursesOnPath) {

                if (theCourseSingle.getStudentCourses() == null) {
                    Set<StudentCourse> tmp = TypeTool.getDefaultSet();
                    theCourseSingle.setStudentCourses(tmp);
                }
                theCourseSingle.getStudentCourses().addAll(thestudentCoursesSet);   
                Iterator thestudentCoursesIt = thestudentCoursesSet.iterator();
                while (thestudentCoursesIt.hasNext()) {
                    StudentCourse thestudentCoursesSingle = (StudentCourse) thestudentCoursesIt.next();
                    thestudentCoursesSingle.setCourse(theCourseSingle);
                }
            }
        }
        return theCourseSingle;
    }
    public void setAssociation(Object self, String associationRoleName, 
            Object association) {

        Course member = (Course) self;
        if ("studentCourses".equals(associationRoleName)) {
            member.setStudentCourses((Set) association);
            return;
        }
        // Might be generated empty - silence compiler warnings
        if (member != null) {
            member = null;
        }
    }
    public boolean isNavigableToParent() {
        return false;
    }


    private void saveAssociations(Course parentObject) {
        saveAssociation("studentCourses", parentObject, parentObject.getStudentCourses());
        // might be generated empty, silience any warnings...
        int foo = 0;
        foo++;
    }


    private void removeAssociations(Course parentObject) {
        parentObject.setStudentCourses(null);
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
    public Course createObjectCopy(Course fromObject) {
        Course retVal = new Course();
        retVal.setCode(fromObject.getCode());
        retVal.setId(fromObject.getId());
        retVal.setIsActive(fromObject.getIsActive());
        retVal.setName(fromObject.getName());
        return retVal;
    }
    /**
     * Inserts the specified instance in the specified listblock line.
     * @param obj the object to insert
     * @param line the line to insert in.
     */
    public void insertInListblockLine(Course obj, ListblockLine line) {
        if (obj == null) {
            return;
        }
        line.insertObject("Course", obj);
    }


    public void resetAssociations(Object o) {
        resetAssociations((Course) o);
    }


    private void resetAssociations(Course rootObject) {
        if (rootObject == null) {
            return;
        }
        Set studentCoursesAssociation = (Set) getAssociation("studentCourses", rootObject);
        rootObject.setStudentCourses(studentCoursesAssociation);
        // might be generated empty - silience any warnings:
        int foo = 0;
        foo++;
    }       
}
