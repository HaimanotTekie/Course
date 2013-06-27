// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package no.course.dialog.course;
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

/** 
 * Access methods for Course2. Use variable theCourse2 to access
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
public class Course2Methods extends AbstractNode<Course> {

    CourseDefaultView view;
    GenovaEnums genovaEnums;
    CourseDefaultController controller;
    ObjectSelectionNode parentNode;
    List childNodes = new ArrayList();
    Course2Methods(CourseDefaultView view, CourseDefaultController controller, GenovaEnums genovaEnums) {
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
        return "Course2";
    }


    public void addChild(ObjectSelectionNode child) {
        childNodes.add(child);
    }
    public boolean callHookBeforeDisplay(Object objectToDisplay, String roleName) {
       return controller.hookBeforeDisplay(objectToDisplay, roleName);
    }


    public boolean callCheckSaveHook() {
        return controller.callCheckSaveHook("Course2");
    }


    public boolean callCheckDeleteHook() {
        return controller.callCheckDeleteHook("Course2");
    }


    public boolean callCheckCloseHook() {
        return controller.callCheckCloseHook("Course2");
    }


    public boolean callCheckClearHook() {
        return controller.callCheckClearHook("Course2");
    }


    public boolean callCheckFindHook() {
        return controller.callCheckFindHook("Course2");
    }


    public boolean callCheckChangeHook() {
        return controller.callCheckChangeHook("Course2");
    }


    public boolean callCheckRowSelectHook(int currentSelectionIndex, int newSelectionIndex) {
        return controller.callCheckRowSelectHook("Course2", currentSelectionIndex, newSelectionIndex);
    }


    public GenovaDialogController getController() {
        return controller;
    }


    /**
     * Returns an object representing the relation Course2 from the
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
     * Returns an object representing the relation Course2 from the
     * dialog. If Course2 is displayed in the dialog, 
     * the Course2 domain object is used, else a new Course2 object 
     * is created. Attributes present in the dialog are then 
     * copied into the Course2 object. 
     * 
     * <p>Before returning, the controller's hookAfterObtainCourse2 method 
     * is invoked, giving the application programmer 
     * the possibility to manipulate or replace the object.
     * 
     * @return Object of Course updated from the dialog.
     */
    public Course obtain() {
        if (objectProxy == null) {
            Course tmpCourse2 = new Course();
            objectProxy = controller
                    .getProxy(tmpCourse2, "Course2");
        }
        objectProxy.setAttribute
            ("code", view.Course2_code.getValue());
        objectProxy.setAttribute
            ("id", view.Course2_id.getValue());
        objectProxy.setAttribute
            ("name", view.Course2_name.getValue());
   
    /* Her kommer generert kode for CheckButton:ObtainData*/
    
//        tmpCourse2.isActive=TypeTool.convert(view.Course2_isActive.getText(), tmpCourse2.isActive);
    // controller.reflectAssign(tmpCourse2, "isActive", TypeTool.convertToString(view.Course2_isActive.isSelected())); /* Check Button */
    objectProxy.setAttribute("isActive", new Boolean(view.Course2_isActive.isSelected()));

       Course obtainedObject = (Course) objectProxy.getObject();
       Course manipulated = controller.hookAfterObtainCourse2(obtainedObject);
       if (manipulated != null) {
           obtainedObject = manipulated;
       }
       return obtainedObject;
    }

    public String obtain(String attr) {
        attr = TypeTool.stripRoleNamePrefix(attr, getRoleName());
        if ("code".equals(attr)) {
            return view.Course2_code.format();
        }
        if ("id".equals(attr)) {
            return view.Course2_id.format();
        }
        if ("name".equals(attr)) {
            return view.Course2_name.format();
        }
    if ("isActive".equals(attr)) {
        return view.Course2_isActive.isSelected() ? "true" : "false";
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
    * @param tmpCourse2 Attributes are copied from this object.
    */
    public void display(Course tmpCourse2) {
        if (!SwingUtilities.isEventDispatchThread()) {
            displayOnEDT(tmpCourse2);
            return;
        }
        if (tmpCourse2 == null) {
            tmpCourse2= new Course();
        }
        controller.resetProxy();
        objectProxy = controller.getNewProxy(tmpCourse2, "Course2");
        boolean resetState = true;
        display("code", TypeTool.toObject(tmpCourse2.getCode()), resetState);
        display("id", TypeTool.toObject(tmpCourse2.getId()), resetState);
        display("name", TypeTool.toObject(tmpCourse2.getName()), resetState);
        display("isActive", TypeTool.toObject(tmpCourse2.getIsActive()), resetState);
        setState(ObjectSelectionNode.CLEAN, false);
    }
    public boolean isConsistant() {
    if(!TypeTool.isConsistant(view.Course2_code.getText(), oldCourse2.getCode())) {
        return false;
    }
    if(!TypeTool.isConsistant(view.Course2_id.getText(), oldCourse2.getId())) {
        return false;
    }
    if(!TypeTool.isConsistant(view.Course2_name.getText(), oldCourse2.getName())) {
        return false;
    }
        return true;
     }    

    public boolean hasValue() {
    if(view.Course2_code.getText() == null || view.Course2_code.getText().length() == 0) {
        return false;
    }
    if(view.Course2_id.getText() == null || view.Course2_id.getText().length() == 0) {
        return false;
    }
    if(view.Course2_name.getText() == null || view.Course2_name.getText().length() == 0) {
        return false;
    }
       return true;
    }
    public boolean hasOneValue() {
    if(view.Course2_code.getText() != null && view.Course2_code.getText().trim().length() > 0) {
        return true;
    }
    if(view.Course2_id.getText() != null && view.Course2_id.getText().trim().length() > 0) {
        return true;
    }
    if(view.Course2_name.getText() != null && view.Course2_name.getText().trim().length() > 0) {
        return true;
    }
       return false;
    }

    public boolean hasValue(String field) {
        field = TypeTool.stripRoleNamePrefix(field, getRoleName());
    if(field.equals("code") && (view.Course2_code.getText() == null || view.Course2_code.getText().length() == 0)) {
        return false;
    }
    if(field.equals("id") && (view.Course2_id.getText() == null || view.Course2_id.getText().length() == 0)) {
        return false;
    }
    if(field.equals("name") && (view.Course2_name.getText() == null || view.Course2_name.getText().length() == 0)) {
        return false;
    }
       return true;
    }

    public void setStyle(Color foreground, Color background) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setStyleOnEDT(foreground, background);
            return;
        }
    view.Course2_code.setForeground(foreground);
    view.Course2_code.setBackground(background);
    view.Course2_id.setForeground(foreground);
    view.Course2_id.setBackground(background);
    view.Course2_name.setForeground(foreground);
    view.Course2_name.setBackground(background);
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
                valueObject = view.Course2_code.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.Course2_code.setInitialValue(valueObject);
            }
            view.Course2_code.setValue(valueObject);
            view.Course2_code.setCaretPosition(0);
        }
        if ("id".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.Course2_id.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.Course2_id.setInitialValue(valueObject);
            }
            view.Course2_id.setValue(valueObject);
            view.Course2_id.setCaretPosition(0);
        }
        if ("name".equals(attributeName)) {
            Object valueObject = null;
            if (value instanceof String) {
                valueObject = view.Course2_name.parse((String) value);
            } else {
                valueObject = value;
            }
            if (resetState) {
                view.Course2_name.setInitialValue(valueObject);
            }
            view.Course2_name.setValue(valueObject);
            view.Course2_name.setCaretPosition(0);
        }
        if ("isActive".equals(attributeName)) {
            view.countUpBlocKSelectionEventCourse2isActive();
            if (resetState) {
                view.Course2_isActive.setInitialValue(value);
            }
            if (value != null) {
                view.Course2_isActive.setSelected(((Boolean) value).booleanValue());
            } else {
                view.Course2_isActive.setSelected(false);
            }
            view.oldValueCourse2isActive = TypeTool.convertToString(value);
            view.countDownBlocKSelectionEventCourse2isActive();
        }
        view.noFocusException--;
    }

    /**
     * Updates data of given attriubte in object selection in the dialog.
     *
     * @param tmpCourse2 Attributes are copied from this object.
     * @param s The attribute to set.
     */
    public void display(Course tmpCourse2, String s) {
        display(tmpCourse2, s, true);
    }

    @Override
    public void display(Course tmpCourse2, String attributeName, boolean resetState) {
        if (!SwingUtilities.isEventDispatchThread()){
            displayOnEDT(tmpCourse2, attributeName, resetState);
            return;
        }
        attributeName = TypeTool
                .stripRoleNamePrefix(attributeName, getRoleName());
       if (tmpCourse2 != null) {
           Object value = null;
            if (attributeName.equals("code")) {
                value = TypeTool.toObject(tmpCourse2.getCode());
            }
            if (attributeName.equals("id")) {
                value = TypeTool.toObject(tmpCourse2.getId());
            }
            if (attributeName.equals("name")) {
                value = TypeTool.toObject(tmpCourse2.getName());
            }
            if (attributeName.equals("isActive")) {
                value = TypeTool.toObject(tmpCourse2.getIsActive());
            }
           display(attributeName, value, resetState);
       }
    }
    boolean zeroCourse2code = false;
    boolean zeroCourse2id = false;
    boolean zeroCourse2name = false;
    boolean zeroCourse2isActive = false;
    /**
     * @param s the name of the attribute
     * @param val the setShowZero property
     * @deprecated - use display rules to set this display rule.
     */
    public void setShowZero(String s, boolean val) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
       val = !val;
    if(s.equals("code")) {
        zeroCourse2code = val;
    }
    if(s.equals("id")) {
        zeroCourse2id = val;
    }
    if(s.equals("name")) {
        zeroCourse2name = val;
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
    view.Course2_code.setInitialValue(null);
    view.oldValueCourse2code = "";
    view.Course2_code.setValue(null);
    view.Course2_code.resetState();
    view.Course2_id.setInitialValue(null);
    view.oldValueCourse2id = "";
    view.Course2_id.setValue(null);
    view.Course2_id.resetState();
    view.Course2_name.setInitialValue(null);
    view.oldValueCourse2name = "";
    view.Course2_name.setValue(null);
    view.Course2_name.resetState();
    view.countUpBlocKSelectionEventCourse2isActive();
    view.Course2_isActive.setSelected(false) ;
    view.oldValueCourse2isActive = TypeTool.convertToString(false);
    view.countDownBlocKSelectionEventCourse2isActive();
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
        view.oldValueCourse2code = "";
        view.Course2_code.setInitialValue(null);
        view.Course2_code.setValue(null);
        view.Course2_code.resetState();
    }
    if (s.equals("id")) {
        view.oldValueCourse2id = "";
        view.Course2_id.setInitialValue(null);
        view.Course2_id.setValue(null);
        view.Course2_id.resetState();
    }
    if (s.equals("name")) {
        view.oldValueCourse2name = "";
        view.Course2_name.setInitialValue(null);
        view.Course2_name.setValue(null);
        view.Course2_name.resetState();
    }
    if (s.equals("isActive")) {
        view.countUpBlocKSelectionEventCourse2isActive();
        view.Course2_isActive.setSelected(false) ;
        view.oldValueCourse2isActive = TypeTool.convertToString(false);
        view.countDownBlocKSelectionEventCourse2isActive();
    }
        view.noFocusException--;
    }
    public void setEnabled(boolean b) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setEnabledOnEDT(b);
            return;
        }
    view.Course2_code.setEnabled(b);
    view.Course2_id.setEnabled(b);
    view.Course2_name.setEnabled(b);
    view.Course2_isActive.setEnabled(b);
    }
    public void setEnabled(boolean b, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setEnabledOnEDT(b, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("code")) {
        view.Course2_code.setEnabled(b);
    }
    if (s.equals("id")) {
        view.Course2_id.setEnabled(b);
    }
    if (s.equals("name")) {
        view.Course2_name.setEnabled(b);
    }
        if (s.equals("isActive")) {
            view.Course2_isActive.setEnabled(b);
        }
    }
    public boolean isEnabled() {
        boolean b = false;
    if (view.Course2_code.isEnabled()) b=true;
    if (view.Course2_id.isEnabled()) b=true;
    if (view.Course2_name.isEnabled()) b=true;
    if (view.Course2_isActive.isEnabled()) b=true;
       return b;
    }
    public boolean isEnabled(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (s.equals("code")) {
        if (view.Course2_code.isEnabled()) b=true;
    }
    if (s.equals("id")) {
        if (view.Course2_id.isEnabled()) b=true;
    }
    if (s.equals("name")) {
        if (view.Course2_name.isEnabled()) b=true;
    }
        if (s.equals("isActive")) {
            if (view.Course2_isActive.isEnabled()) b=true;
        }
       return b;
    }
    public void setShown(boolean b) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setShownOnEDT(b);
            return;
        }
    view.Course2_code.setVisible(b);
    view.Course2_id.setVisible(b);
    view.Course2_name.setVisible(b);
    view.Course2_isActive.setVisible(b);
    
    /* Her kommer generert kode for SimpleBlock:setShown*/
    
    view.tableBlock.setVisible(b);
    }
    public void setShown(boolean b, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            setShownOnEDT(b, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
    if (s.equals("code")) {
        view.Course2_code.setVisible(b);
    }
    if (s.equals("id")) {
        view.Course2_id.setVisible(b);
    }
    if (s.equals("name")) {
        view.Course2_name.setVisible(b);
    }
        if (s.equals("isActive")) {
            view.Course2_isActive.setVisible(b);
        }
    
    /* Her kommer generert kode for SimpleBlock:setShownField*/
    
    if (s.equals("tableBlock")) {
        view.tableBlock.setVisible(b);
    }
    }
    public boolean isShown() {
        boolean b = false;
    if (view.Course2_code.isEnabled()) b=true;
    if (view.Course2_id.isEnabled()) b=true;
    if (view.Course2_name.isEnabled()) b=true;
    if (view.Course2_isActive.isEnabled()) b=true;
        return b;
    }
    public boolean isShown(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (s.equals("code")) {
        if (view.Course2_code.hasFocus()) b=true;
    }
    if (s.equals("id")) {
        if (view.Course2_id.hasFocus()) b=true;
    }
    if (s.equals("name")) {
        if (view.Course2_name.hasFocus()) b=true;
    }
        if (s.equals("isActive")) {
            if (view.Course2_isActive.hasFocus()) b=true;
        }
    
    /* Her kommer generert kode for SimpleBlock:isShown*/
    
    if (view.tableBlock.isEnabled()) b=true;
    
    /* Her kommer generert kode for SimpleBlock:isShownField*/
    
    if (s.equals("tableBlock")) {
        if (view.tableBlock.hasFocus()) b=true;
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
        view.Course2_code.requestFocusInWindow();
    }
    if (s.equals("id")) {
        view.Course2_id.requestFocusInWindow();
    }
    if (s.equals("name")) {
        view.Course2_name.requestFocusInWindow();
    }
        if (s.equals("isActive")) {
            view.Course2_isActive.requestFocus();
        }
    }
    public boolean hasFocus(String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean b = false;
    if (view.Course2_code.hasFocus()) b=true;
    if (view.Course2_id.hasFocus()) b=true;
    if (view.Course2_name.hasFocus()) b=true;
    if (view.Course2_isActive.hasFocus()) b=true;
        return b;
    }
    @Override
    public void append(Course tmpCourse2, String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            appendOnEDT(tmpCourse2, s);
            return;
        }
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        view.noFocusException++;
        if(tmpCourse2 == null) {
            tmpCourse2= new Course();
        }
        view.noFocusException--;
    }
    /** Resets current state of relation Course2 in the dialog. Sets changed to false and sets old object to be the current object. 
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
    private Course oldCourse2 = new Course();
    private boolean isMarkedChanged = false;
    
    
    /** Sets the old version of the object selection node.
     * NOTE: The object is not copied, it is referenced.
     * @param inst The new object to be used as the old. 
     * 
     */
    public void setOld(Course inst) {
        oldCourse2 = inst;
    }
    
    
   /** 
    * Returns the old object. The object is not copied.
    * @return The object.
    */
    public Course getOld() {
        return oldCourse2;
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
    boolean isMarkedChangedname = false;
       boolean isMarkedChangedisActive = false;
    public void setChanged (boolean b, String s) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());        
    if (s.equals("code")) {
        isMarkedChangedcode = b;
    }    
    if (s.equals("id")) {
        isMarkedChangedid = b;
    }    
    if (s.equals("name")) {
        isMarkedChangedname = b;
    }    
        if (s.equals("isActive")) {
                isMarkedChangedisActive = b;
        }    
     }
    public void setChanged(boolean b) {
        isMarkedChanged = b;
    isMarkedChangedcode = b;
    isMarkedChangedid = b;
    isMarkedChangedname = b;
         isMarkedChangedisActive = b;
     }
    /** 
     * Returns whether Course2 has changed state since last 
     * call on resetCourse2().<br>
     * It will both parse the current state of the block
     * and compare with the dialogattribute named in input String s.
     * @param s The attribute to check.
     * @param tmpCourse2 The object to compare with.
     * @return True if changed, false if not.
     * @deprecated use ObjectSelectionNode#isChanged(String)
     */
    public boolean isChanged(String s, Course tmpCourse2) {
        s = TypeTool.stripRoleNamePrefix(s, getRoleName());
        boolean bChanged = false;
        if(isMarkedChanged) return true;
    if (s.equals("code")) {
        if (isMarkedChangedcode) bChanged = true;
        if (tmpCourse2 != null && oldCourse2 != null) {
        if (!TypeTool.equals(tmpCourse2.getCode(), oldCourse2.getCode())) {
            bChanged = true;
            isMarkedChangedcode = true;
            }
        }
    }    
    if (s.equals("id")) {
        if (isMarkedChangedid) bChanged = true;
        if (tmpCourse2 != null && oldCourse2 != null) {
        if (!TypeTool.equals(tmpCourse2.getId(), oldCourse2.getId())) {
            bChanged = true;
            isMarkedChangedid = true;
            }
        }
    }    
    if (s.equals("name")) {
        if (isMarkedChangedname) bChanged = true;
        if (tmpCourse2 != null && oldCourse2 != null) {
        if (!TypeTool.equals(tmpCourse2.getName(), oldCourse2.getName())) {
            bChanged = true;
            isMarkedChangedname = true;
            }
        }
    }    
        if (s.equals("isActive")) {
            if (isMarkedChangedisActive) bChanged = true;
            if (tmpCourse2 != null && oldCourse2 != null) {
            // Her m� vi sammenligne p� en annen m�te enn = ( for strings) ???
            if (!TypeTool.equals(tmpCourse2.getIsActive(), oldCourse2.getIsActive())) {
                bChanged = true;
                isMarkedChangedisActive = true;
                }
            }
        }    
         return bChanged;
     }
    
    
    /** 
     * Returns whether Course2 has changed state since last call on
     * resetCourse2().  It will both parse the current state of the
     * block and compare with the dialogattributes of tmpCourse2.  
     * @param tmpCourse2 The object to compare with.
     * @return <code>true</code> if changed, <code>false</code> if not.
     * @deprecated use ObjectSelection#getState()
     */
    public boolean isChanged(Course tmpCourse2) {
        if(isMarkedChanged) return true;
    if (isMarkedChangedcode) isMarkedChanged = true;
    if (oldCourse2 != null) {
        if (!TypeTool.equals(tmpCourse2.getCode(), oldCourse2.getCode())) {
            isMarkedChanged = true;
            isMarkedChangedcode = true;
        }
    }
    if (isMarkedChangedid) isMarkedChanged = true;
    if (oldCourse2 != null) {
        if (!TypeTool.equals(tmpCourse2.getId(), oldCourse2.getId())) {
            isMarkedChanged = true;
            isMarkedChangedid = true;
        }
    }
    if (isMarkedChangedname) isMarkedChanged = true;
    if (oldCourse2 != null) {
        if (!TypeTool.equals(tmpCourse2.getName(), oldCourse2.getName())) {
            isMarkedChanged = true;
            isMarkedChangedname = true;
        }
    }
        if (isMarkedChangedisActive) isMarkedChanged = true;
        if (tmpCourse2 != null && oldCourse2 != null) {
            if (!TypeTool.equals(tmpCourse2.getIsActive(), oldCourse2.getIsActive())) {
             isMarkedChanged = true;
             isMarkedChangedisActive = true;
            }
        }
    if(false) {
        tmpCourse2.getClass();
    }
        return isMarkedChanged;
    }

    public Set getChangedFields() {
        Set changedFields = new HashSet();
        Object component = null;

        component = controller.view.fromNameToComponent("Course2.code");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("code");
            }
        }
        component = controller.view.fromNameToComponent("Course2.id");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("id");
            }
        }
        component = controller.view.fromNameToComponent("Course2.name");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("name");
            }
        }
        component = controller.view.fromNameToComponent("Course2.isActive");
        if (component instanceof GenovaValueState) {
            if (((GenovaValueState) component).isChanged()) {
                changedFields.add("isActive");
            }
        }

        return changedFields;
    }

    public Set getChangedKeyFields() {
        Set changedFields = new HashSet();
        Object component = null;

        if (isPartOfKey("code")) {
            component = controller.view.fromNameToComponent("Course2.code");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("code");
                }
            }
        }
        if (isPartOfKey("id")) {
            component = controller.view.fromNameToComponent("Course2.id");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("id");
                }
            }
        }
        if (isPartOfKey("name")) {
            component = controller.view.fromNameToComponent("Course2.name");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("name");
                }
            }
        }
        if (isPartOfKey("isActive")) {
            component = controller.view.fromNameToComponent("Course2.isActive");
            if (component instanceof GenovaValueState) {
                if (((GenovaValueState) component).isChanged()) {
                    changedFields.add("isActive");
                }
            }
        }

        return changedFields;
    }

    public void resetFields() {
        Object component = null;

        component = controller.view.fromNameToComponent("Course2.code");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
        component = controller.view.fromNameToComponent("Course2.id");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
        component = controller.view.fromNameToComponent("Course2.name");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
        component = controller.view.fromNameToComponent("Course2.isActive");
        if (component instanceof GenovaValueState) {
            ((GenovaValueState) component).resetState();
        }
    }
    
    /**
     * Displays domain objects which lies above the target in the object selection.
     * @param Course2Collection the collection of domain objects to display
     * @param pathToTarget a list of nodes representing the path to the target
     * @param findAll if <code>true</code> displaying is done as part of 
     *      a find all action.
     */
    public void displayAboveTarget(Collection Course2Collection, List pathToTarget, boolean findAll) {
        if (pathToTarget.size() == 1 && pathToTarget.get(0) == this) {
            if (!findAll && Course2Collection instanceof List) {
                Iterator it = Course2Collection.iterator();
                if (it.hasNext()) {
                    Course Course2single = (Course) it.next();
                    recursiveDisplay(Course2single);
                }
            } else { 
                recursiveDisplay(Course2Collection);
            }
        } else {
            Iterator it = Course2Collection.iterator();
            if (it.hasNext()) {
                Course Course2single = (Course) it.next();
                displayAboveTarget(Course2single, pathToTarget, findAll);
            }
        }
    }

    /**
     * Displays domain object which lies above the target in the object selection.
     * @param Course2Object the domain object to display
     * @param pathToTarget a list of nodes representing the path to the target
     * @param findAll if <code>true</code> the display is a result of a find 
     * all action. CursorCommon.pre
     */
    public void displayAboveTarget(Course Course2Object, List pathToTarget, boolean findAll) {
        if (pathToTarget.size() == 1 && pathToTarget.get(0) == this) {
            recursiveDisplay(Course2Object);
        } else {
            pathToTarget.remove(this);
            display(Course2Object);
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
            return;
        }

        // Since pathToTarget is destroyed on the way, keep a reference
        // to the node next in line.
        Object nextOnPath = pathToTarget.get(0);

        // Merge next node on path befor other children (depth first)

       // Replace children not on path with stored children.
   }

    /** 
     * Recursivly displays the object representing the Course2-role.
     * First, the object is displayed, then, each child is displayed. 
     *
     * @param someCourse2 the (domain) object to display.
     */
    public void recursiveDisplay(Course someCourse2) {
        if (callHookBeforeDisplay(someCourse2, "Course2")) {
            if (someCourse2 == null) {
                return; // nothing more to display!
            }
            display(someCourse2);
        }
    }
    /**
     * Displays a Collection of Course2 objects.
     * Each instance of Course2 is inserted in the corresponding
     * list block (courseList).
     * @param Course2Collection the Collection containing the (domain) objects to display.
     */
    public void recursiveDisplay(Collection Course2Collection) {
        controller.listblockMethodscourseList.purgeAllLines();
        Iterator it = Course2Collection.iterator();
        List allLines = TypeTool.getDefaultList();
        while (it.hasNext()) {
            Course Course2Object = (Course) it.next();
            LineListblockcourseList line = controller
                .listblockMethodscourseList
                    .createListblockLine();
            insertInListblockLine(Course2Object, line);
            if (controller.listblockMethodscourseList
                    .callHooksBeforeInsert(line)) {
                allLines.add(line);
            }
        }
        controller.listblockMethodscourseList.initialSort(allLines);
        it = allLines.iterator();
        while (it.hasNext()) {
            LineListblockcourseList line = (LineListblockcourseList) it.next();
            controller.listblockMethodscourseList
                    .insertListblockLine(line);
        }
        controller.listblockMethodscourseList.forceClean();
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
     * Obtains a Set of Course2 objects from the courseList listblock.
     * Note that roles that are not represented in a coluumn will not
     * be created (compatible with old version). Other roles will
     * be created.
     * @return the obtained set of Course2 objects
     * @deprecated use {@link #obtainSet(boolean)} instead.
     */
    public Set obtainSet() {
        Set Course2Set = TypeTool.getDefaultSet();
        List allLines = controller.listblockMethodscourseList.allLines();
        Iterator it = allLines.iterator();
        while (it.hasNext()) {
            LineListblockcourseList line = (LineListblockcourseList) it.next();
            Object o = null;
            o = line.getObject("Course2");
            if (o != null) {
                Course2Set.add(o);
            }
        }
        return Course2Set;
    }


    /**
     * Obtains a Set of Course2 objects from the courseList listblock. The
     * parameter controlls wheter objects are created when getting them from 
     * the listblock line or not.
     * @param createIfNull if <code>true</code> objects are created.
     * @return the obtained set of Course2 objects.
     * @see ListblockLine#getObject(String, boolean)
     */
    public Set obtainSet(boolean createIfNull) {
        Set Course2Set = TypeTool.getDefaultSet();
        List allLines = controller.listblockMethodscourseList.allLines();
        Iterator it = allLines.iterator();
        while (it.hasNext()) {
            LineListblockcourseList line = (LineListblockcourseList) it.next();
            Object o = null;
            o = line.getObject("Course2", createIfNull);
            if (o != null) {
                Course2Set.add(o);
            }
        }
        return Course2Set;
    }

    /**
     * Recursivly obtains the Course2 from the dialog.
     * If the Course2 is previously displayed and is unchanged, 
     * no obtain is performed, and the returned value is null. The <code>singleObtain</code>
     * parameter is used to singal if obtain from more-related should be done on edit fields, 
     * or the entire set of domain objects (e.g the listblock).
     * @param pathToTarget a list of nodes representing the path to the target.
     * @param singleObtain if <code>true</code>, obtain on more-related is done from edit-fields.
     * @return the obtained Course2 object.
     */
    public Course recursiveObtain(List pathToTarget, boolean singleObtain) {
        return recursiveObtain(pathToTarget, singleObtain, false);
    }

    /**
     * Recursivly obtains the Course2 from the dialog.
     * If the Course2 is previously displayed and is unchanged, the
     * no obtain is performed, and the returned value is null. The <code>singleObtain</code>
     * parameter is used to singal if obtain from more-related should be done on edit fields, 
     * or the entire set of domain objects (e.g the listblock).
     * @param pathToTarget a list of nodes representing the path to the target.
     * @param singleObtain if <code>true</code>, obtain on more-related is done from edit-fields.
     * @param forceObtain if <code>true</code> obtain is always done.
     * @return the obtained Course2 object.
     */
    public Course recursiveObtain(List pathToTarget, boolean singleObtain, boolean forceObtain) {
        boolean hasValue = forceObtain || getState() != ObjectSelectionNode.CLEARED;
        pathToTarget.remove(this);
        boolean belowTarget = pathToTarget.size() == 0;
        Course theCourse2Single = null;
        if (hasValue) {
            theCourse2Single = obtain();
            saveAssociations(theCourse2Single);
            removeAssociations(theCourse2Single);
        }
        return theCourse2Single;
    }
    public boolean inListblock() {
        return true;
    }        
    public void setAssociation(Object self, String associationRoleName, 
            Object association) {

        Course member = (Course) self;
        // Might be generated empty - silence compiler warnings
        if (member != null) {
            member = null;
        }
    }
    public boolean isNavigableToParent() {
        return false;
    }


    private void saveAssociations(Course parentObject) {
        // might be generated empty, silience any warnings...
        int foo = 0;
        foo++;
    }


    private void removeAssociations(Course parentObject) {
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
        line.insertObject("Course2", obj);
    }


    public void resetAssociations(Object o) {
        resetAssociations((Course) o);
    }


    private void resetAssociations(Course rootObject) {
        if (rootObject == null) {
            return;
        }
        // might be generated empty - silience any warnings:
        int foo = 0;
        foo++;
    }       
}