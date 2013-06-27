// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
    
    /* Her kommer generert kode for Listblock:ListblockLineClass*/
    
    
package no.course.dialog.course;

import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.SwingConstants;
import javax.swing.JComponent;
import java.util.Enumeration;
import java.io.Serializable;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

import no.course.domain.Course;


/**
 * The following imports are known to be used. To avoid potentially
 * errors due to lack of imports no.genova.client.support.*; 
 * is added last.
 */ 
import no.genova.client.support.ListblockLine;
import no.genova.client.component.GenovaComboBox;
import no.genova.client.support.*;

import no.genova.domain.DomainUtil;
import no.genova.domain.DomainProxy;
import no.genova.domain.DomainObjectProxy;

import no.genova.exception.GenovaClientException;

import no.genova.message.CRuntimeMsg;
import no.genova.message.Message;

/*
 * The following imports are known to be used. To avoid potentially
 * errors due to lack of imports no.genova.support.*; 
 * is added last.
 */ 
import no.genova.support.TypeTool;
import no.genova.support.Numeric;
import no.genova.domain.DomainUtil;
import no.genova.support.*;

/** Class for holding one line of information for the listblock
 * courseList.
 *
 * <p><strong>State handling in listblock</strong></p> A listblock
 * line has three different states new, deleted and changed. If a
 * line has gotten a given state, it will keep that state until
 * the state is cleared or become reset. The transitions from 'no'
 * state are:
 *
 * <ul>
 * <li>new : A listblock line is flagged as new after it has been inserted into the listblock.
 * <li>changed: A listblock line is edited by the user.
 * <li>deleted: Call to delete listblock method.
 * </ul>
 * Upon startup of a dialog, after filling its content, normal use
 * would be to perform forceClean() to zero all state.
 *
 * <p><strong>Undo support</strong></p>
 *
 * A listblock line has one level of undo. When the method reset()
 * is called the 'current' data will be copied to the 'old'. In
 * each line there are getters for both the current data and the
 * old data. To restore the previous state of a listblock line, use the method
 * previousState().
 *
 */
@SuppressWarnings("all")
public class LineListblockcourseList implements ListblockLine {
    HashMap cellObjects = new HashMap();

    // key = roleName, value = object
    private Map roleNameToObject = new HashMap();

    /**
     * Returns the object used for editing at a given column. The
     * object currently available for getting like this would be
     * the checkboxes used for editing and displaying booleans.
     * @return The editor object of null if none on that column number.
     * @param column The column number to get the editor for, zero if none.
     */
    public Object getCellObject(int column) {
        column = ((Integer)controller.view.courseList_indexes.elementAt(column)).intValue();
        return cellObjects.get(new Integer(column));
    }

    /** Internal use */
    class CheckItemListener implements ItemListener {
        /** Internal use.
         * @param e Internal use.
         */
        public void itemStateChanged(ItemEvent e) { 
            /* Silence code checkers */
            if(false) {e.getClass(); }
        }
    }

    /** Internal use */
    final LineListblockcourseList pointerToListblockLine = this;

    CourseDefaultController controller;

    DomainProxy domainProxy;
    private boolean ischanged;
    private boolean isnew;
    private boolean isdeleted;
    private boolean isdisabled;

    private boolean oldIschanged;
    private boolean oldIsnew;
    private boolean oldIsdeleted;

    int lineNumber;

    /** Do not use this constructor! Use insert methods on the
     *     variable listblockMethodscourseList! 
     * @param c Internal use.
     */
    LineListblockcourseList(CourseDefaultController c) {
        controller = c;
        domainProxy = new DomainProxy(true, controller.applicationEnums);
    }

    /**
     * Returns true if the line in the listblock courseList is deleted 
     * See documentation about state on class LineListblockcourseList.
     * @return True if deleted, false if not.
     */
    public boolean isDeleted() {
        return isdeleted;
    }

    /**
     * Returns true if the line in the listblock courseList is disabled 
     * See documentation about state on class LineListblockcourseList.
     * @return True if disabled, false if not.
     */
    public boolean isDisabled() {
       return isdisabled;
    }

    /** Returns true if the line in the listblock courseList is new.
     * @return Ture if new, false if not.
     */
    public boolean isNew() {
        return isnew;
    }

    /**
     * Returns true if the line in the listblock courseList is changed 
     * See documentation about state on class LineListblockcourseList.
     * @return True if changed, false if not.
     */
    public boolean isChanged() {
        return ischanged;
    }

    /** 
     * Returns true if the line in the listblock courseList was
     * deleted last time reset was called.
     * See documentation about state on class LineListblockcourseList.
     * @return True if deleted, false if not.
     */
    public boolean oldIsDeleted() {
        return oldIsdeleted;
    }

    /**
     * Returns true if the line in the listblock courseList had the status
     * new last time reset was called.
     * @return True if new, false if not.
     */
    public boolean oldIsNew() {
        return oldIsnew;
    }

    /**
     * Returns true if the line in the listblock courseList was
     * deleted last time reset was called. 
     * See documentation about state on class LineListblockcourseList.
     * @return True if it was changed, false if not.
     */
    public boolean oldIsChanged() {
        return oldIschanged;
    }

    /** The line number of this list block. Internal use only.
     * @return The line number in the listblock.
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /** Internal use.
     * @param n Internal useage.
     */
    void setLineNumber(int n) {
        lineNumber = n;
    }

    /** Marks line as new and removes changed and deleted flags. 
     * See documentation about state on class LineListblockcourseList.
     */
    public void forceMarkAsNew() {
        ischanged = false;
        isnew = true;
        isdeleted = false;
    }

    /** Clears new, changed and deleted flags. 
     * See documentation about state on class LineListblockcourseList.
     */
    public void forceClean() {
        ischanged = false;
        isnew = false;
        isdeleted = false;
    }

    /** Marks line as new unless it already has been marked as
     * changed or deleted. 
     * See documentation about state on class LineListblockcourseList.
     */
    public void markAsNew() {
        if(ischanged || isdeleted) {
            return;
        }
        ischanged = false;
        isnew = true;
        isdeleted = false;
    }

    /** Marks the line as changed and clears new and deleted flags. 
     * See documentation about state on class LineListblockcourseList.
     */
    public void forceMarkAsChanged() {
        ischanged = true;
        isnew = false;
        isdeleted = false;
    }

    /** Marks line as changed unless it already has been marked as
     * new or deleted. 
     * See documentation about state on class LineListblockcourseList.
     */
    public void markAsChanged() {
        if(isdeleted || isnew) {
            return;
        }
        ischanged = true;
        isdeleted = false;
    }
    /** 
     * Copies state flags from the given listblock line to this
     * listblock line. Both old and new state are copied.
     * See documentation about state on class LineListblockcourseList.
     * @param src The listblockline to copy state flags from.
     */
    public void copyStateFlags(LineListblockcourseList src) {
        ischanged = src.ischanged;
        isnew = src.isnew;
        isdeleted = src.isdeleted;
        isdisabled = src.isdisabled;
        oldIschanged = src.oldIschanged;
        oldIsnew = src.oldIsnew;
        oldIsdeleted = src.oldIsdeleted;
    }

    /** Sets a listblock line as disabled/enabled for editing.
     * @param setting True hvis disabled.
     **/
    public void setDisabled(boolean setting) {
        isdisabled = setting;
    }
    /** Marks line as deleted. */
    public void markAsDeleted() {
        ischanged = false;
        isnew = false;
        isdeleted = true;
    }
    /** Marks line as deleted */
    public void forceMarkAsDeleted() {
        ischanged = false;
        isnew = false;
        isdeleted = true;
    }
    public boolean contains(Object domainObject) {
        return roleNameToObject.containsValue(domainObject);
    }

    public void setSelected(boolean select) {
        List currentSelection = new ArrayList();
        getListblock().clearEditFields();
        if (getListblock().getSelectedLinesObject() != null) {
            currentSelection.addAll(getListblock().getSelectedLinesObject());
        }
        if (!select) {
            currentSelection.remove(this);
        } else {
            currentSelection.add(this);
        }
        ListblockLine displayLine = select ? this : null;
        int[] selectedLines = new int[currentSelection.size()];
        if (currentSelection.size() > 0) {
            int lastSelectedLine = Integer.MAX_VALUE;
            for (int i = 0; i < currentSelection.size(); i++) {
                ListblockLine line = (ListblockLine) currentSelection.get(i);
                selectedLines[i] = line.getLineNumber();
                if (!select && line.getLineNumber() < lastSelectedLine) {
                    lastSelectedLine = line.getLineNumber();
                    displayLine = line;
                }
            }
        }
        getListblock().setSelectedLines(selectedLines);
        if (displayLine != null) {
            displayLine.displayInEditField();
        }
    }

    public boolean isSelected() {
        List selectedLines = getListblock().getSelectedLinesObject();
        return selectedLines != null ? selectedLines.contains(this) : false;
    }
    /** 
     * Inserts element into ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     * @param theCourse the name of the class
     */
     void comboboxCourse2codeAddItem(Course theCourse) {
           ((JComboBox)cellValueColumn0).addItem(controller.convertToString(theCourse.getCode(), TypeTool.getAttributeClassNameMethod(theCourse,"code")));
        }
    /** 
     * Removes all elements from ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     */
     void comboboxCourse2codeRemoveAllItems() {
        ((JComboBox)cellValueColumn0).removeAllItems();
     }
    /** 
     * Returns item count of ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     * @return the item count.
     */
     int comboboxCourse2codeGetItemCount() {
        return ((JComboBox)cellValueColumn0).getItemCount();
     }
    /** 
     * Inserts element into ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     * @param theCourse the name of the class
     */
     void comboboxCourse2idAddItem(Course theCourse) {
           ((JComboBox)cellValueColumn1).addItem(controller.convertToString(theCourse.getId(), TypeTool.getAttributeClassNameMethod(theCourse,"id")));
        }
    /** 
     * Removes all elements from ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     */
     void comboboxCourse2idRemoveAllItems() {
        ((JComboBox)cellValueColumn1).removeAllItems();
     }
    /** 
     * Returns item count of ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     * @return the item count.
     */
     int comboboxCourse2idGetItemCount() {
        return ((JComboBox)cellValueColumn1).getItemCount();
     }
    /** 
     * Inserts element into ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     * @param theCourse the name of the class
     */
     void comboboxCourse2nameAddItem(Course theCourse) {
           ((JComboBox)cellValueColumn2).addItem(controller.convertToString(theCourse.getName(), TypeTool.getAttributeClassNameMethod(theCourse,"name")));
        }
    /** 
     * Removes all elements from ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     */
     void comboboxCourse2nameRemoveAllItems() {
        ((JComboBox)cellValueColumn2).removeAllItems();
     }
    /** 
     * Returns item count of ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     * @return the item count.
     */
     int comboboxCourse2nameGetItemCount() {
        return ((JComboBox)cellValueColumn2).getItemCount();
     }
    /** 
     * Inserts element into ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     * @param theCourse the name of the class
     */
     void comboboxCourse2isActiveAddItem(Course theCourse) {
           ((JComboBox)cellValueColumn3).addItem(controller.convertToString(theCourse.getIsActive(), TypeTool.getAttributeClassNameMethod(theCourse,"isActive")));
        }
    /** 
     * Removes all elements from ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     */
     void comboboxCourse2isActiveRemoveAllItems() {
        ((JComboBox)cellValueColumn3).removeAllItems();
     }
    /** 
     * Returns item count of ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     * @return the item count.
     */
     int comboboxCourse2isActiveGetItemCount() {
        return ((JComboBox)cellValueColumn3).getItemCount();
     }
        /** Internal use. 
         * @param column Internal use.
         */
        void fromCellToListblockLine(int column) {
            DomainObjectProxy objectProxy = domainProxy.getProxy(newCourse2, "Course2");
    /** Column Match ? */
    if(controller.view.courseList_indexes.indexOf(new Integer(0)) == column) {
        Object workValue = null;
        // Object convert = TypeTool.convert(newCourse2.getCode());
        if(cellValueColumn0 instanceof JComboBox) {
            workValue = ((JComboBox)cellValueColumn0).getSelectedItem();
        }
        else if(cellValueColumn0 instanceof JCheckBox) {
            workValue = new Boolean(((JCheckBox)cellValueColumn0).isSelected());
        }
        else {
            workValue = cellValueColumn0;
        }
        /* Convert the Genova enumerator from a text string to the 
         * int value as a string */
        if(TypeTool.isEnumeratorMethod(newCourse2,"code")) {
            String enumName = TypeTool.getAttributeClassNameMethod(newCourse2,"code");
            if(enumName == null) {
                System.out.println("Failed to name class for Course.getCode().");
                workValue = "";
            }
            else {
                if(workValue != null) {
                    int intVal = controller.applicationEnums.toValue(enumName, (String)workValue);
                    workValue = ""+intVal;
                }
            }
        }
        if(workValue != null) {
            objectProxy = domainProxy.getProxy(newCourse2, "Course2");
            objectProxy.setAttribute("code", workValue.toString());
        }
        fromListblockLineToCell(column, false);
    }
    /** Column Match ? */
    if(controller.view.courseList_indexes.indexOf(new Integer(1)) == column) {
        Object workValue = null;
        // Object convert = TypeTool.convert(newCourse2.getId());
        if(cellValueColumn1 instanceof JComboBox) {
            workValue = ((JComboBox)cellValueColumn1).getSelectedItem();
        }
        else if(cellValueColumn1 instanceof JCheckBox) {
            workValue = new Boolean(((JCheckBox)cellValueColumn1).isSelected());
        }
        else {
            workValue = cellValueColumn1;
        }
        /* Convert the Genova enumerator from a text string to the 
         * int value as a string */
        if(TypeTool.isEnumeratorMethod(newCourse2,"id")) {
            String enumName = TypeTool.getAttributeClassNameMethod(newCourse2,"id");
            if(enumName == null) {
                System.out.println("Failed to name class for Course.getId().");
                workValue = "";
            }
            else {
                if(workValue != null) {
                    int intVal = controller.applicationEnums.toValue(enumName, (String)workValue);
                    workValue = ""+intVal;
                }
            }
        }
        if(workValue != null) {
            objectProxy = domainProxy.getProxy(newCourse2, "Course2");
            objectProxy.setAttribute("id", workValue.toString());
        }
        fromListblockLineToCell(column, false);
    }
    /** Column Match ? */
    if(controller.view.courseList_indexes.indexOf(new Integer(2)) == column) {
        Object workValue = null;
        // Object convert = TypeTool.convert(newCourse2.getName());
        if(cellValueColumn2 instanceof JComboBox) {
            workValue = ((JComboBox)cellValueColumn2).getSelectedItem();
        }
        else if(cellValueColumn2 instanceof JCheckBox) {
            workValue = new Boolean(((JCheckBox)cellValueColumn2).isSelected());
        }
        else {
            workValue = cellValueColumn2;
        }
        /* Convert the Genova enumerator from a text string to the 
         * int value as a string */
        if(TypeTool.isEnumeratorMethod(newCourse2,"name")) {
            String enumName = TypeTool.getAttributeClassNameMethod(newCourse2,"name");
            if(enumName == null) {
                System.out.println("Failed to name class for Course.getName().");
                workValue = "";
            }
            else {
                if(workValue != null) {
                    int intVal = controller.applicationEnums.toValue(enumName, (String)workValue);
                    workValue = ""+intVal;
                }
            }
        }
        if(workValue != null) {
            objectProxy = domainProxy.getProxy(newCourse2, "Course2");
            objectProxy.setAttribute("name", workValue.toString());
        }
        fromListblockLineToCell(column, false);
    }
    /** Column Match ? */
    if(controller.view.courseList_indexes.indexOf(new Integer(3)) == column) {
        Object workValue = null;
        // Object convert = TypeTool.convert(newCourse2.getIsActive());
        if(cellValueColumn3 instanceof JComboBox) {
            workValue = ((JComboBox)cellValueColumn3).getSelectedItem();
        }
        else if(cellValueColumn3 instanceof JCheckBox) {
            workValue = new Boolean(((JCheckBox)cellValueColumn3).isSelected());
        }
        else {
            workValue = cellValueColumn3;
        }
        /* Convert the Genova enumerator from a text string to the 
         * int value as a string */
        if(TypeTool.isEnumeratorMethod(newCourse2,"isActive")) {
            String enumName = TypeTool.getAttributeClassNameMethod(newCourse2,"isActive");
            if(enumName == null) {
                System.out.println("Failed to name class for Course.getIsActive().");
                workValue = "";
            }
            else {
                if(workValue != null) {
                    int intVal = controller.applicationEnums.toValue(enumName, (String)workValue);
                    workValue = ""+intVal;
                }
            }
        }
        if(workValue != null) {
            objectProxy = domainProxy.getProxy(newCourse2, "Course2");
            objectProxy.setAttribute("isActive", workValue.toString());
        }
        fromListblockLineToCell(column, false);
    }
        }
    /** 
     * Internal use.
     * @param column Internal use.
     * @param defaultInsert Internal use.
     */
    void fromListblockLineToCell(int column, boolean defaultInsert) {
        // int correctedCol = ((Integer)controller.view.courseList_indexes.elementAt(column)).intValue();
        // Column match
        if(controller.view.courseList_indexes.indexOf(new Integer(0)) == column) {
            if (newCourse2 == null) {
                cellValueColumn0 = null;
            } else {
                Object convert = TypeTool.toObject(newCourse2.getCode());
                Object assignValue = null;
                if(TypeTool.isEnumeratorMethod(newCourse2,"code")) {
                    assignValue = controller.convertToString(newCourse2.getCode(), TypeTool.getAttributeClassNameMethod(newCourse2,"code"));
                } else {
                    assignValue = convert;
                }
                cellValueColumn0 = assignValue;
            }
            return;
        }
        // Column match
        if(controller.view.courseList_indexes.indexOf(new Integer(1)) == column) {
            if (newCourse2 == null) {
                cellValueColumn1 = null;
            } else {
                Object convert = TypeTool.toObject(newCourse2.getId());
                Object assignValue = null;
                if(TypeTool.isEnumeratorMethod(newCourse2,"id")) {
                    assignValue = controller.convertToString(newCourse2.getId(), TypeTool.getAttributeClassNameMethod(newCourse2,"id"));
                } else {
                    assignValue = convert;
                }
                cellValueColumn1 = assignValue;
            }
            return;
        }
        // Column match
        if(controller.view.courseList_indexes.indexOf(new Integer(2)) == column) {
            if (newCourse2 == null) {
                cellValueColumn2 = null;
            } else {
                Object convert = TypeTool.toObject(newCourse2.getName());
                Object assignValue = null;
                if(TypeTool.isEnumeratorMethod(newCourse2,"name")) {
                    assignValue = controller.convertToString(newCourse2.getName(), TypeTool.getAttributeClassNameMethod(newCourse2,"name"));
                } else {
                    assignValue = convert;
                }
                cellValueColumn2 = assignValue;
            }
            return;
        }
        // Column match
        if(controller.view.courseList_indexes.indexOf(new Integer(3)) == column) {
            if (newCourse2 == null) {
                cellValueColumn3 = null;
            } else {
                Object convert = TypeTool.toObject(newCourse2.getIsActive());
                Object assignValue = null;
                if(TypeTool.isEnumeratorMethod(newCourse2,"isActive")) {
                    assignValue = controller.convertToString(newCourse2.getIsActive(), TypeTool.getAttributeClassNameMethod(newCourse2,"isActive"));
                } else {
                    assignValue = convert;
                }
                cellValueColumn3 = assignValue;
            }
            return;
        }
        }
        public void reset() {
            oldCourse2 = new Course ();
            TypeTool.reflectCopyMethod(newCourse2, "code",oldCourse2);
            TypeTool.reflectCopyMethod(newCourse2, "id",oldCourse2);
            TypeTool.reflectCopyMethod(newCourse2, "name",oldCourse2);
            TypeTool.reflectCopyMethod(newCourse2, "isActive",oldCourse2);
            oldIschanged = ischanged;
            ischanged = false;
            oldIsnew = isnew;
            isnew = false;
            oldIsdeleted = isdeleted;
            isdeleted = false;
        }
        public void previousState() {
            controller.view.block.increaseListblockcourseList();
            boolean isDis = isdisabled;
            isdisabled = false;
            TypeTool.reflectCopyMethod(oldCourse2, "code",newCourse2);
            TypeTool.reflectCopyMethod(oldCourse2, "id",newCourse2);
            TypeTool.reflectCopyMethod(oldCourse2, "name",newCourse2);
            TypeTool.reflectCopyMethod(oldCourse2, "isActive",newCourse2);
            ischanged = oldIschanged;
            isnew = oldIsnew;
            isdeleted = oldIsdeleted;
            fromListblockLineToCells(false);
            controller.view.courseListtheModel.fireTableDataChanged();
            fromCellsToListblockLine();
            isdisabled = isDis;
            controller.view.block.decreaseListblockcourseList();
        }

    public Object obtain(String identifier) {
        if (identifier.indexOf(".") == -1) {
            return getDisplayedObject(identifier);
        } else {
            int colNumber = controller.listblockMethodscourseList
                    .getColumnIndex(identifier);
            return controller.view.courseList_table
                    .getValueAt(getLineNumber(), colNumber);
        }
    }

    public ListblockLine obtain() {
        obtain("Course2");
         return this;
    }               


    /**
     * Returns the <em>roleName</em> object held by this line.
     * If the object does not exist a new object is created. Invoking
     * this method has the same effect as invoking {@link #getObject(String, boolean)}.
     * @param roleName the role name of the object to return
     * @return the object held by this line.
     * @deprecated use {@link #getObject(String, boolean)} 
     */
    public Object getObject(String roleName) {
        if (controller.listblockMethodscourseList
                .getRoleNamesInUse().contains(roleName)) {
            return getObject(roleName, true);
        } else {
            return roleNameToObject.get(roleName);
        }
    }


    public Object getObject(String roleName, boolean createIfNull) {
        if ("Course2".equals(roleName)) {
            return getCourse2(createIfNull);
        }
        Object o = roleNameToObject.get(roleName);
        if (o == null && createIfNull) {
            AbstractNode node = (AbstractNode) controller
                    .getObjectSelectionNode(roleName);
            if (node != null) {
                o = node.getEmptyDomainObject();
                roleNameToObject.put(roleName, o);
            }
        }
        return o;        
    }

    public void insertObject(String roleName, Object obj) {
        roleNameToObject.put(roleName, obj);
        if (obj instanceof Course && "Course2".equals(roleName)) {
            setCourse2((Course) obj);
        }
    }

    /**
     * Internal use. 
     * Sets the value for a specified column.
     */
    void setValueAt(int col, Object value) {
        switch (col) {
        case  0:
            if (TypeTool.differ(value, cellValueColumn0)) {
                markAsChanged();
                cellValueColumn0 = value;
            }            
            break;
        case  1:
            if (TypeTool.differ(value, cellValueColumn1)) {
                markAsChanged();
                cellValueColumn1 = value;
            }            
            break;
        case  2:
            if (TypeTool.differ(value, cellValueColumn2)) {
                markAsChanged();
                cellValueColumn2 = value;
            }            
            break;
        case  3:
            if (TypeTool.differ(value, cellValueColumn3)) {
                markAsChanged();
                cellValueColumn3 = value;
            }            
            break;
        }
    }
    private Object getDisplayedObject(String roleName) {
        if ("Course2".equals(roleName)) {
            return getDisplayedCourse2();
        }
        return roleNameToObject.get(roleName);
    }


    /**
     * Gets the Course2 instance from this listblock line. The
     * instance is updated with the displayed cell values before returning.
     * @return the displayed object
     */
    protected Course getDisplayedCourse2() {
        Course singleCourse2 = (Course) roleNameToObject.get("Course2");
        if (singleCourse2 == null) {
            return null;
        }
        DomainObjectProxy proxy = controller.getProxy(singleCourse2, "Course2");
        int rowNumber = getLineNumber();
        int colNumber;
        Object value;
        
        colNumber = controller.listblockMethodscourseList.getColumnIndex("Course2.code");
        value = controller.view.courseList_table.getValueAt(rowNumber, colNumber);
        proxy.setAttribute("code", value);
        
        colNumber = controller.listblockMethodscourseList.getColumnIndex("Course2.name");
        value = controller.view.courseList_table.getValueAt(rowNumber, colNumber);
        proxy.setAttribute("name", value);
        
        colNumber = controller.listblockMethodscourseList.getColumnIndex("Course2.isActive");
        value = controller.view.courseList_table.getValueAt(rowNumber, colNumber);
        proxy.setAttribute("isActive", value);

        return (Course) proxy.getObject();
    }
    public boolean hasPreviousState() {
       return true 
             && oldCourse2 != null
;
    }
    /** Edits cell in the given listblock line, where the object is
     *  'type' and column is 'fieldName'. The type object is not modified,
     *  and only used to decide which field is to be edited in the
     *  listblock. Valid type and fieldName combinations are:
     *  <ul>
    * <li> Object of type Course with fieldName "id".
     *  </ul>
     * @deprecated Use editFieldOS insted.
     * @param type The object selection to use
     * @param fieldName The field name to use.
     */    
    public void editField(Object type, String fieldName) {
        controller.view.block.increaseListblockcourseList();
        if(false) {
            /* Needed */
        }
             else if(type instanceof Course && fieldName.equals("code")) {
                 controller.view.courseList_table.editCellAt(lineNumber, controller.view.courseList_indexes.indexOf(new Integer(0)));   
             }
             else if(type instanceof Course && fieldName.equals("id")) {
                 controller.view.courseList_table.editCellAt(lineNumber, controller.view.courseList_indexes.indexOf(new Integer(1)));   
             }
             else if(type instanceof Course && fieldName.equals("name")) {
                 controller.view.courseList_table.editCellAt(lineNumber, controller.view.courseList_indexes.indexOf(new Integer(2)));   
             }
             else if(type instanceof Course && fieldName.equals("isActive")) {
                 controller.view.courseList_table.editCellAt(lineNumber, controller.view.courseList_indexes.indexOf(new Integer(3)));   
             }
            controller.view.block.decreaseListblockcourseList();
        }
    /** Edits cell in the given listblock line, where the object is
     *  'type' (the related object node) and column is 'fieldName'
     *  (named in Genova). The type object is not modified, and only
     *  used to decide which field is to be edited in the
     *  listblock. The valid combinations of type and fieldName are: *
     *  <ul>
    * <li> Objectselection  theCourse with fieldName "id".
     * </ul>
     * @param type The object selection node to use.
     * @param fieldName The fieldname to use.
     */
    public void editFieldOS(Object type, String fieldName) {
        controller.view.block.increaseListblockcourseList();
        if (false) {
            /* NEEDED */
        }
             else if(type == controller.theCourse2 && fieldName.equals("code")) {
                 controller.view.courseList_table.editCellAt(lineNumber, controller.view.courseList_indexes.indexOf(new Integer(0)));   
             }
             else if(type == controller.theCourse2 && fieldName.equals("id")) {
                 controller.view.courseList_table.editCellAt(lineNumber, controller.view.courseList_indexes.indexOf(new Integer(1)));   
             }
             else if(type == controller.theCourse2 && fieldName.equals("name")) {
                 controller.view.courseList_table.editCellAt(lineNumber, controller.view.courseList_indexes.indexOf(new Integer(2)));   
             }
             else if(type == controller.theCourse2 && fieldName.equals("isActive")) {
                 controller.view.courseList_table.editCellAt(lineNumber, controller.view.courseList_indexes.indexOf(new Integer(3)));   
             }
            controller.view.block.decreaseListblockcourseList();
        }
        /** Internal use */
        void fromCellsToListblockLine() {
            for(int i=0;i<controller.view.courseList_table.getColumnCount();i++) {
                fromCellToListblockLine(i);
            }
        }
        public void refresh() {
            controller.view.block.increaseListblockcourseList();
            fromListblockLineToCells(false);
            int[] selected = controller.listblockMethodscourseList.getSelectedLines();
            controller.view.courseListtheModel.fireTableDataChanged();
            controller.listblockMethodscourseList.setSelectedLines(selected);
            controller.view.block.decreaseListblockcourseList();
        }
        /** Internal use. 
         *  @param defaultInsert internal use.
         */
        void fromListblockLineToCells(boolean defaultInsert) {
            for(int i= 0; i < controller.view
                    .courseList_table.getColumnCount();i++) {
                fromListblockLineToCell(i, defaultInsert);
            }
        }

    public void displayInEditField() {
        new ClearTool(controller.roleObjects).clearMembers("Course2");
        Iterator it = roleNameToObject.keySet().iterator();
        while (it.hasNext()) {
            String roleName = (String) it.next();
            ObjectSelectionNode node = controller.getObjectSelectionNode(roleName);
            Object clean = roleNameToObject.get(roleName);
            if (clean != null) {
                  node.display(getDisplayedObject(roleName));
            }
        }
    }

    public Collection getDomainObjects() {
        List objectList = new ArrayList();
        objectList.add(getCourse2(false));
        return objectList;
    }

    public int hashCode() {
        int hash = "courseList".hashCode();
        if (getCourse2(false) != null) {
            hash += getCourse2(false).hashCode();
        }

        return hash;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true; // base case
        }
        if (o == null || 
                !(o instanceof LineListblockcourseList)) {
            return false;
        }

        LineListblockcourseList line = 
            (LineListblockcourseList) o;
        if (getCourse2(false) != null && 
                !getCourse2(false).equals(
                        line.getCourse2(false))) {
            return false;
        }

        return true;
    }
    public void addDomainObject(Object domainObject) {
        if (domainObject instanceof Course) {
            setCourse2((Course) domainObject);
        }
    }
    public Listblock getListblock() {
        return controller.listblockMethodscourseList;
    }


    /**
     * Returns the Course2 object held by this line. 
     * If the object does not exist, a new object is created. 
     * @return the object held by this line
     * @deprecated use {@link #getCourse2(boolean)} instead
     */
    public Course getCourse2() {
        return getCourse2(true);
    }


    /**
     * Returns the Course2 object held by this line.
     * If <code>createIfNull</code> is true, and the line does
     * not hold a reference to the object, a new instance is 
     * created using the default constructor. <em>Please note</em> 
     * that the created object does not have any relations set - which migth
     * lead to unwanted "line is changed" messages when the line is selected and then
     * unselected. 
     *
     * @param createIfNull flag indicating if missing object should be created.
     * @return the Course2 instance displayed by this line
     */
    public Course getCourse2(boolean createIfNull) {
        Course aCourse2 = (Course) roleNameToObject.get("Course2");
        if (aCourse2 == null && createIfNull) {
            aCourse2 = new Course();
            roleNameToObject.put("Course2", aCourse2);
        }
        return aCourse2;
     }


    /** 
     * Returns the Course2 registered as marked with latest reset() call
     * @return The 'old' object.
     */
    public Course getOldCourse2() {
        return (Course) domainProxy.getProxy(newCourse2, "Course2").getCleanVersionOfObject();
    }
    /** 
     * Sets current object of Course2 in this listblock line. 
     * After chaning the data you need to in this listblock line you would 
     * probably want to refresh the UI using the refresh() method.
     * @param pCourse2 The object to set. Attributes are copied.
     */
    public void setCourse2 (Course pCourse2) {
        if (pCourse2 == null && newCourse2 != null) {
            domainProxy.removeProxy(domainProxy.getProxy(
                    newCourse2, 
                    "Course2")); 
            newCourse2 = null;
        } else if (pCourse2 != null) {
            newCourse2 = pCourse2;
            domainProxy.getNewProxy(
                    newCourse2, 
                    "Course2"); 
        }
        roleNameToObject.put("Course2", newCourse2);
    }
// Controller

         /** Object used for the editor/value of the cell. */
         Object cellValueColumn0 = new String("");
         /** Set if this cell in the lisblock line should not be editable */
         boolean cellNotEditable0 = false;
         /** Old value for this node in the listblock */
         String oldValueCourse2code;
         Course newCourse2;
         Course oldCourse2;
// Controller

         /** Object used for the editor/value of the cell. */
         Object cellValueColumn1 = new String("");
         /** Set if this cell in the lisblock line should not be editable */
         boolean cellNotEditable1 = false;
         /** Old value for this node in the listblock */
         String oldValueCourse2id;
// Controller

         /** Object used for the editor/value of the cell. */
         Object cellValueColumn2 = new String("");
         /** Set if this cell in the lisblock line should not be editable */
         boolean cellNotEditable2 = false;
         /** Old value for this node in the listblock */
         String oldValueCourse2name;
// Controller

         /** Object used for the editor/value of the cell. */
         Object cellValueColumn3 = new String("");
         /** Set if this cell in the lisblock line should not be editable */
         boolean cellNotEditable3 = false;
         /** Old value for this node in the listblock */
         String oldValueCourse2isActive;
    public void setDisabledField(Object owner, String field, boolean setting) {
        if(owner instanceof Course && field.equals("code")) {
            cellNotEditable0 = setting;
            return;
        }
        if(owner instanceof Course && field.equals("id")) {
            cellNotEditable1 = setting;
            return;
        }
        if(owner instanceof Course && field.equals("name")) {
            cellNotEditable2 = setting;
            return;
        }
        if(owner instanceof Course && field.equals("isActive")) {
            cellNotEditable3 = setting;
            return;
        }
        if(owner == null) {
            throw new Error("No owner in setDisabledField.");
        }
        if(field == null || field.equals("")) {
            throw new Error("No name given to setDisabledField.");
        } 
        throw new Error("Class "+owner.getClass().toString()+" and field "+field+" isn't valid in setDisabledField for the listblock 'courseList'\n");
    }
    /** Disables/enables a given field in the listblock line
     *  represented by the object selection node object owner. The
     *  field name is the field name given in Genova. Legal
     *  combinations of owner and field are: <ul>
    * <li> Objectselection  theCourse with field "id".
        </ul>
     * @param owner The object selection to use
     * @param field The field name 
     * @param setting True if the field should be disabled, false if not.
     */
    public void setDisabledFieldOS(Object owner, String field, boolean setting) {
        if(owner.equals(controller.theCourse2) && field.equals("code")) {
            cellNotEditable0 = setting;
            return;
        }
        if(owner.equals(controller.theCourse2) && field.equals("id")) {
            cellNotEditable1 = setting;
            return;
        }
        if(owner.equals(controller.theCourse2) && field.equals("name")) {
            cellNotEditable2 = setting;
            return;
        }
        if(owner.equals(controller.theCourse2) && field.equals("isActive")) {
            cellNotEditable3 = setting;
            return;
        }
        if(owner == null) {
            throw new Error("No owner in setDisabledField.");
        }
        if(field == null || field.equals("")) {
            throw new Error("No name given to setDisabledField.");
        } 
        throw new Error("Class "+owner.getClass().toString()+" and field "+field+" isn't valid in setDisabledField for the listblock 'courseList'\n");
    }
}  /* End of listblock line for courseList */