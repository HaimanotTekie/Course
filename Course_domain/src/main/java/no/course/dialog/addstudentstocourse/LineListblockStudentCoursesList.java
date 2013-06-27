// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
    
    /* Her kommer generert kode for Listblock:ListblockLineClass*/
    
    
package no.course.dialog.addstudentstocourse;

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
import no.course.domain.Student;
import no.course.domain.StudentCourse;


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
 * StudentCoursesList.
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
public class LineListblockStudentCoursesList implements ListblockLine {
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
        column = ((Integer)controller.view.StudentCoursesList_indexes.elementAt(column)).intValue();
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
    final LineListblockStudentCoursesList pointerToListblockLine = this;

    AddStudentsToCourseDefaultController controller;

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
     *     variable listblockMethodsStudentCoursesList! 
     * @param c Internal use.
     */
    LineListblockStudentCoursesList(AddStudentsToCourseDefaultController c) {
        controller = c;
        domainProxy = new DomainProxy(true, controller.applicationEnums);
    }

    /**
     * Returns true if the line in the listblock StudentCoursesList is deleted 
     * See documentation about state on class LineListblockStudentCoursesList.
     * @return True if deleted, false if not.
     */
    public boolean isDeleted() {
        return isdeleted;
    }

    /**
     * Returns true if the line in the listblock StudentCoursesList is disabled 
     * See documentation about state on class LineListblockStudentCoursesList.
     * @return True if disabled, false if not.
     */
    public boolean isDisabled() {
       return isdisabled;
    }

    /** Returns true if the line in the listblock StudentCoursesList is new.
     * @return Ture if new, false if not.
     */
    public boolean isNew() {
        return isnew;
    }

    /**
     * Returns true if the line in the listblock StudentCoursesList is changed 
     * See documentation about state on class LineListblockStudentCoursesList.
     * @return True if changed, false if not.
     */
    public boolean isChanged() {
        return ischanged;
    }

    /** 
     * Returns true if the line in the listblock StudentCoursesList was
     * deleted last time reset was called.
     * See documentation about state on class LineListblockStudentCoursesList.
     * @return True if deleted, false if not.
     */
    public boolean oldIsDeleted() {
        return oldIsdeleted;
    }

    /**
     * Returns true if the line in the listblock StudentCoursesList had the status
     * new last time reset was called.
     * @return True if new, false if not.
     */
    public boolean oldIsNew() {
        return oldIsnew;
    }

    /**
     * Returns true if the line in the listblock StudentCoursesList was
     * deleted last time reset was called. 
     * See documentation about state on class LineListblockStudentCoursesList.
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
     * See documentation about state on class LineListblockStudentCoursesList.
     */
    public void forceMarkAsNew() {
        ischanged = false;
        isnew = true;
        isdeleted = false;
    }

    /** Clears new, changed and deleted flags. 
     * See documentation about state on class LineListblockStudentCoursesList.
     */
    public void forceClean() {
        ischanged = false;
        isnew = false;
        isdeleted = false;
    }

    /** Marks line as new unless it already has been marked as
     * changed or deleted. 
     * See documentation about state on class LineListblockStudentCoursesList.
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
     * See documentation about state on class LineListblockStudentCoursesList.
     */
    public void forceMarkAsChanged() {
        ischanged = true;
        isnew = false;
        isdeleted = false;
    }

    /** Marks line as changed unless it already has been marked as
     * new or deleted. 
     * See documentation about state on class LineListblockStudentCoursesList.
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
     * See documentation about state on class LineListblockStudentCoursesList.
     * @param src The listblockline to copy state flags from.
     */
    public void copyStateFlags(LineListblockStudentCoursesList src) {
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
        /** Internal use. 
         * @param column Internal use.
         */
        void fromCellToListblockLine(int column) {
            DomainObjectProxy objectProxy = domainProxy.getProxy(newstudentCourses, "studentCourses");
    /** Column Match ? */
    if(controller.view.StudentCoursesList_indexes.indexOf(new Integer(0)) == column) {
        Object workValue = null;
        // Object convert = TypeTool.convert(newstudentCourses.getId());
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
        if(TypeTool.isEnumeratorMethod(newstudentCourses,"id")) {
            String enumName = TypeTool.getAttributeClassNameMethod(newstudentCourses,"id");
            if(enumName == null) {
                System.out.println("Failed to name class for StudentCourse.getId().");
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
            objectProxy = domainProxy.getProxy(newstudentCourses, "studentCourses");
            objectProxy.setAttribute("id", workValue.toString());
        }
        fromListblockLineToCell(column, false);
    }
    /** Column Match ? */
    if(controller.view.StudentCoursesList_indexes.indexOf(new Integer(1)) == column) {
        Object workValue = null;
        // Object convert = TypeTool.convert(newstudent.getAge());
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
        if(TypeTool.isEnumeratorMethod(newstudent,"age")) {
            String enumName = TypeTool.getAttributeClassNameMethod(newstudent,"age");
            if(enumName == null) {
                System.out.println("Failed to name class for Student.getAge().");
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
            objectProxy = domainProxy.getProxy(newstudent, "student");
            objectProxy.setAttribute("age", workValue.toString());
        }
        fromListblockLineToCell(column, false);
    }
    /** Column Match ? */
    if(controller.view.StudentCoursesList_indexes.indexOf(new Integer(2)) == column) {
        Object workValue = null;
        // Object convert = TypeTool.convert(newstudent.getId());
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
        if(TypeTool.isEnumeratorMethod(newstudent,"id")) {
            String enumName = TypeTool.getAttributeClassNameMethod(newstudent,"id");
            if(enumName == null) {
                System.out.println("Failed to name class for Student.getId().");
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
            objectProxy = domainProxy.getProxy(newstudent, "student");
            objectProxy.setAttribute("id", workValue.toString());
        }
        fromListblockLineToCell(column, false);
    }
    /** Column Match ? */
    if(controller.view.StudentCoursesList_indexes.indexOf(new Integer(3)) == column) {
        Object workValue = null;
        // Object convert = TypeTool.convert(newstudent.getName());
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
        if(TypeTool.isEnumeratorMethod(newstudent,"name")) {
            String enumName = TypeTool.getAttributeClassNameMethod(newstudent,"name");
            if(enumName == null) {
                System.out.println("Failed to name class for Student.getName().");
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
            objectProxy = domainProxy.getProxy(newstudent, "student");
            objectProxy.setAttribute("name", workValue.toString());
        }
        fromListblockLineToCell(column, false);
    }
    /** Column Match ? */
    if(controller.view.StudentCoursesList_indexes.indexOf(new Integer(4)) == column) {
        Object workValue = null;
        // Object convert = TypeTool.convert(newstudent.getStudentNr());
        if(cellValueColumn4 instanceof JComboBox) {
            workValue = ((JComboBox)cellValueColumn4).getSelectedItem();
        }
        else if(cellValueColumn4 instanceof JCheckBox) {
            workValue = new Boolean(((JCheckBox)cellValueColumn4).isSelected());
        }
        else {
            workValue = cellValueColumn4;
        }
        /* Convert the Genova enumerator from a text string to the 
         * int value as a string */
        if(TypeTool.isEnumeratorMethod(newstudent,"studentNr")) {
            String enumName = TypeTool.getAttributeClassNameMethod(newstudent,"studentNr");
            if(enumName == null) {
                System.out.println("Failed to name class for Student.getStudentNr().");
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
            objectProxy = domainProxy.getProxy(newstudent, "student");
            objectProxy.setAttribute("studentNr", workValue.toString());
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
        // int correctedCol = ((Integer)controller.view.StudentCoursesList_indexes.elementAt(column)).intValue();
        // Column match
        if(controller.view.StudentCoursesList_indexes.indexOf(new Integer(0)) == column) {
            if (newstudentCourses == null) {
                cellValueColumn0 = null;
            } else {
                Object convert = TypeTool.toObject(newstudentCourses.getId());
                Object assignValue = null;
                if(TypeTool.isEnumeratorMethod(newstudentCourses,"id")) {
                    assignValue = controller.convertToString(newstudentCourses.getId(), TypeTool.getAttributeClassNameMethod(newstudentCourses,"id"));
                } else {
                    assignValue = convert;
                }
                cellValueColumn0 = assignValue;
            }
            return;
        }
        // Column match
        if(controller.view.StudentCoursesList_indexes.indexOf(new Integer(1)) == column) {
            if (newstudent == null) {
                cellValueColumn1 = null;
            } else {
                Object convert = TypeTool.toObject(newstudent.getAge());
                Object assignValue = null;
                if(TypeTool.isEnumeratorMethod(newstudent,"age")) {
                    assignValue = controller.convertToString(newstudent.getAge(), TypeTool.getAttributeClassNameMethod(newstudent,"age"));
                } else {
                    assignValue = convert;
                }
                cellValueColumn1 = assignValue;
            }
            return;
        }
        // Column match
        if(controller.view.StudentCoursesList_indexes.indexOf(new Integer(2)) == column) {
            if (newstudent == null) {
                cellValueColumn2 = null;
            } else {
                Object convert = TypeTool.toObject(newstudent.getId());
                Object assignValue = null;
                if(TypeTool.isEnumeratorMethod(newstudent,"id")) {
                    assignValue = controller.convertToString(newstudent.getId(), TypeTool.getAttributeClassNameMethod(newstudent,"id"));
                } else {
                    assignValue = convert;
                }
                cellValueColumn2 = assignValue;
            }
            return;
        }
        // Column match
        if(controller.view.StudentCoursesList_indexes.indexOf(new Integer(3)) == column) {
            if (newstudent == null) {
                cellValueColumn3 = null;
            } else {
                Object convert = TypeTool.toObject(newstudent.getName());
                Object assignValue = null;
                if(TypeTool.isEnumeratorMethod(newstudent,"name")) {
                    assignValue = controller.convertToString(newstudent.getName(), TypeTool.getAttributeClassNameMethod(newstudent,"name"));
                } else {
                    assignValue = convert;
                }
                cellValueColumn3 = assignValue;
            }
            return;
        }
        // Column match
        if(controller.view.StudentCoursesList_indexes.indexOf(new Integer(4)) == column) {
            if (newstudent == null) {
                cellValueColumn4 = null;
            } else {
                Object convert = TypeTool.toObject(newstudent.getStudentNr());
                Object assignValue = null;
                if(TypeTool.isEnumeratorMethod(newstudent,"studentNr")) {
                    assignValue = controller.convertToString(newstudent.getStudentNr(), TypeTool.getAttributeClassNameMethod(newstudent,"studentNr"));
                } else {
                    assignValue = convert;
                }
                cellValueColumn4 = assignValue;
            }
            return;
        }
        }
        public void reset() {
            oldstudentCourses = new StudentCourse ();
            TypeTool.reflectCopyMethod(newstudentCourses, "id",oldstudentCourses);
            oldstudent = new Student ();
            TypeTool.reflectCopyMethod(newstudent, "age",oldstudent);
            TypeTool.reflectCopyMethod(newstudent, "id",oldstudent);
            TypeTool.reflectCopyMethod(newstudent, "name",oldstudent);
            TypeTool.reflectCopyMethod(newstudent, "studentNr",oldstudent);
            oldIschanged = ischanged;
            ischanged = false;
            oldIsnew = isnew;
            isnew = false;
            oldIsdeleted = isdeleted;
            isdeleted = false;
        }
        public void previousState() {
            controller.view.block.increaseListblockStudentCoursesList();
            boolean isDis = isdisabled;
            isdisabled = false;
            TypeTool.reflectCopyMethod(oldstudentCourses, "id",newstudentCourses);
            TypeTool.reflectCopyMethod(oldstudent, "age",newstudent);
            TypeTool.reflectCopyMethod(oldstudent, "id",newstudent);
            TypeTool.reflectCopyMethod(oldstudent, "name",newstudent);
            TypeTool.reflectCopyMethod(oldstudent, "studentNr",newstudent);
            ischanged = oldIschanged;
            isnew = oldIsnew;
            isdeleted = oldIsdeleted;
            fromListblockLineToCells(false);
            controller.view.StudentCoursesListtheModel.fireTableDataChanged();
            fromCellsToListblockLine();
            isdisabled = isDis;
            controller.view.block.decreaseListblockStudentCoursesList();
        }

    public Object obtain(String identifier) {
        if (identifier.indexOf(".") == -1) {
            return getDisplayedObject(identifier);
        } else {
            int colNumber = controller.listblockMethodsStudentCoursesList
                    .getColumnIndex(identifier);
            return controller.view.StudentCoursesList_table
                    .getValueAt(getLineNumber(), colNumber);
        }
    }

    public ListblockLine obtain() {
        obtain("studentCourses");
        obtain("student");
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
        if (controller.listblockMethodsStudentCoursesList
                .getRoleNamesInUse().contains(roleName)) {
            return getObject(roleName, true);
        } else {
            return roleNameToObject.get(roleName);
        }
    }


    public Object getObject(String roleName, boolean createIfNull) {
        if ("studentCourses".equals(roleName)) {
            return getstudentCourses(createIfNull);
        }
        if ("student".equals(roleName)) {
            return getstudent(createIfNull);
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
        if (obj instanceof StudentCourse && "studentCourses".equals(roleName)) {
            setstudentCourses((StudentCourse) obj);
        }
        if (obj instanceof Student && "student".equals(roleName)) {
            setstudent((Student) obj);
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
        case  4:
            if (TypeTool.differ(value, cellValueColumn4)) {
                markAsChanged();
                cellValueColumn4 = value;
            }            
            break;
        }
    }
    private Object getDisplayedObject(String roleName) {
        if ("studentCourses".equals(roleName)) {
            return getDisplayedstudentCourses();
        }
        if ("student".equals(roleName)) {
            return getDisplayedstudent();
        }
        return roleNameToObject.get(roleName);
    }


    /**
     * Gets the studentCourses instance from this listblock line. The
     * instance is updated with the displayed cell values before returning.
     * @return the displayed object
     */
    protected StudentCourse getDisplayedstudentCourses() {
        StudentCourse singlestudentCourses = (StudentCourse) roleNameToObject.get("studentCourses");
        if (singlestudentCourses == null) {
            return null;
        }
        DomainObjectProxy proxy = controller.getProxy(singlestudentCourses, "studentCourses");
        int rowNumber = getLineNumber();
        int colNumber;
        Object value;
        
        colNumber = controller.listblockMethodsStudentCoursesList.getColumnIndex("studentCourses.id");
        value = controller.view.StudentCoursesList_table.getValueAt(rowNumber, colNumber);
        proxy.setAttribute("id", value);

        return (StudentCourse) proxy.getObject();
    }


    /**
     * Gets the student instance from this listblock line. The
     * instance is updated with the displayed cell values before returning.
     * @return the displayed object
     */
    protected Student getDisplayedstudent() {
        Student singlestudent = (Student) roleNameToObject.get("student");
        if (singlestudent == null) {
            return null;
        }
        DomainObjectProxy proxy = controller.getProxy(singlestudent, "student");
        int rowNumber = getLineNumber();
        int colNumber;
        Object value;
        
        colNumber = controller.listblockMethodsStudentCoursesList.getColumnIndex("student.age");
        value = controller.view.StudentCoursesList_table.getValueAt(rowNumber, colNumber);
        proxy.setAttribute("age", value);
        
        colNumber = controller.listblockMethodsStudentCoursesList.getColumnIndex("student.id");
        value = controller.view.StudentCoursesList_table.getValueAt(rowNumber, colNumber);
        proxy.setAttribute("id", value);
        
        colNumber = controller.listblockMethodsStudentCoursesList.getColumnIndex("student.name");
        value = controller.view.StudentCoursesList_table.getValueAt(rowNumber, colNumber);
        proxy.setAttribute("name", value);
        
        colNumber = controller.listblockMethodsStudentCoursesList.getColumnIndex("student.studentNr");
        value = controller.view.StudentCoursesList_table.getValueAt(rowNumber, colNumber);
        proxy.setAttribute("studentNr", value);

        return (Student) proxy.getObject();
    }
    public boolean hasPreviousState() {
       return true 
             && oldstudentCourses != null
             && oldstudent != null
;
    }
    /** Edits cell in the given listblock line, where the object is
     *  'type' and column is 'fieldName'. The type object is not modified,
     *  and only used to decide which field is to be edited in the
     *  listblock. Valid type and fieldName combinations are:
     *  <ul>
     *  </ul>
     * @deprecated Use editFieldOS insted.
     * @param type The object selection to use
     * @param fieldName The field name to use.
     */    
    public void editField(Object type, String fieldName) {
        controller.view.block.increaseListblockStudentCoursesList();
        if(false) {
            /* Needed */
        }
             else if(type instanceof StudentCourse && fieldName.equals("id")) {
                 controller.view.StudentCoursesList_table.editCellAt(lineNumber, controller.view.StudentCoursesList_indexes.indexOf(new Integer(0)));   
             }
             else if(type instanceof Student && fieldName.equals("age")) {
                 controller.view.StudentCoursesList_table.editCellAt(lineNumber, controller.view.StudentCoursesList_indexes.indexOf(new Integer(1)));   
             }
             else if(type instanceof Student && fieldName.equals("id")) {
                 controller.view.StudentCoursesList_table.editCellAt(lineNumber, controller.view.StudentCoursesList_indexes.indexOf(new Integer(2)));   
             }
             else if(type instanceof Student && fieldName.equals("name")) {
                 controller.view.StudentCoursesList_table.editCellAt(lineNumber, controller.view.StudentCoursesList_indexes.indexOf(new Integer(3)));   
             }
             else if(type instanceof Student && fieldName.equals("studentNr")) {
                 controller.view.StudentCoursesList_table.editCellAt(lineNumber, controller.view.StudentCoursesList_indexes.indexOf(new Integer(4)));   
             }
            controller.view.block.decreaseListblockStudentCoursesList();
        }
    /** Edits cell in the given listblock line, where the object is
     *  'type' (the related object node) and column is 'fieldName'
     *  (named in Genova). The type object is not modified, and only
     *  used to decide which field is to be edited in the
     *  listblock. The valid combinations of type and fieldName are: *
     *  <ul>
     * </ul>
     * @param type The object selection node to use.
     * @param fieldName The fieldname to use.
     */
    public void editFieldOS(Object type, String fieldName) {
        controller.view.block.increaseListblockStudentCoursesList();
        if (false) {
            /* NEEDED */
        }
             else if(type == controller.thestudentCourses && fieldName.equals("id")) {
                 controller.view.StudentCoursesList_table.editCellAt(lineNumber, controller.view.StudentCoursesList_indexes.indexOf(new Integer(0)));   
             }
             else if(type == controller.thestudent && fieldName.equals("age")) {
                 controller.view.StudentCoursesList_table.editCellAt(lineNumber, controller.view.StudentCoursesList_indexes.indexOf(new Integer(1)));   
             }
             else if(type == controller.thestudent && fieldName.equals("id")) {
                 controller.view.StudentCoursesList_table.editCellAt(lineNumber, controller.view.StudentCoursesList_indexes.indexOf(new Integer(2)));   
             }
             else if(type == controller.thestudent && fieldName.equals("name")) {
                 controller.view.StudentCoursesList_table.editCellAt(lineNumber, controller.view.StudentCoursesList_indexes.indexOf(new Integer(3)));   
             }
             else if(type == controller.thestudent && fieldName.equals("studentNr")) {
                 controller.view.StudentCoursesList_table.editCellAt(lineNumber, controller.view.StudentCoursesList_indexes.indexOf(new Integer(4)));   
             }
            controller.view.block.decreaseListblockStudentCoursesList();
        }
        /** Internal use */
        void fromCellsToListblockLine() {
            for(int i=0;i<controller.view.StudentCoursesList_table.getColumnCount();i++) {
                fromCellToListblockLine(i);
            }
        }
        public void refresh() {
            controller.view.block.increaseListblockStudentCoursesList();
            fromListblockLineToCells(false);
            int[] selected = controller.listblockMethodsStudentCoursesList.getSelectedLines();
            controller.view.StudentCoursesListtheModel.fireTableDataChanged();
            controller.listblockMethodsStudentCoursesList.setSelectedLines(selected);
            controller.view.block.decreaseListblockStudentCoursesList();
        }
        /** Internal use. 
         *  @param defaultInsert internal use.
         */
        void fromListblockLineToCells(boolean defaultInsert) {
            for(int i= 0; i < controller.view
                    .StudentCoursesList_table.getColumnCount();i++) {
                fromListblockLineToCell(i, defaultInsert);
            }
        }

    public void displayInEditField() {
        new ClearTool(controller.roleObjects).clearMembers("studentCourses");
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
        objectList.add(getstudentCourses(false));
        objectList.add(getstudent(false));
        return objectList;
    }

    public int hashCode() {
        int hash = "StudentCoursesList".hashCode();
        if (getstudentCourses(false) != null) {
            hash += getstudentCourses(false).hashCode();
        }
        if (getstudent(false) != null) {
            hash += getstudent(false).hashCode();
        }

        return hash;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true; // base case
        }
        if (o == null || 
                !(o instanceof LineListblockStudentCoursesList)) {
            return false;
        }

        LineListblockStudentCoursesList line = 
            (LineListblockStudentCoursesList) o;
        if (getstudentCourses(false) != null && 
                !getstudentCourses(false).equals(
                        line.getstudentCourses(false))) {
            return false;
        }
        if (getstudent(false) != null && 
                !getstudent(false).equals(
                        line.getstudent(false))) {
            return false;
        }

        return true;
    }
    public void addDomainObject(Object domainObject) {
        if (domainObject instanceof StudentCourse) {
            setstudentCourses((StudentCourse) domainObject);
        }
        if (domainObject instanceof Student) {
            setstudent((Student) domainObject);
        }
    }
    public Listblock getListblock() {
        return controller.listblockMethodsStudentCoursesList;
    }


    /**
     * Returns the studentCourses object held by this line. 
     * If the object does not exist, a new object is created. 
     * @return the object held by this line
     * @deprecated use {@link #getstudentCourses(boolean)} instead
     */
    public StudentCourse getstudentCourses() {
        return getstudentCourses(true);
    }


    /**
     * Returns the studentCourses object held by this line.
     * If <code>createIfNull</code> is true, and the line does
     * not hold a reference to the object, a new instance is 
     * created using the default constructor. <em>Please note</em> 
     * that the created object does not have any relations set - which migth
     * lead to unwanted "line is changed" messages when the line is selected and then
     * unselected. 
     *
     * @param createIfNull flag indicating if missing object should be created.
     * @return the studentCourses instance displayed by this line
     */
    public StudentCourse getstudentCourses(boolean createIfNull) {
        StudentCourse astudentCourses = (StudentCourse) roleNameToObject.get("studentCourses");
        if (astudentCourses == null && createIfNull) {
            astudentCourses = new StudentCourse();
            roleNameToObject.put("studentCourses", astudentCourses);
        }
        return astudentCourses;
     }


    /** 
     * Returns the studentCourses registered as marked with latest reset() call
     * @return The 'old' object.
     */
    public StudentCourse getOldstudentCourses() {
        return (StudentCourse) domainProxy.getProxy(newstudentCourses, "studentCourses").getCleanVersionOfObject();
    }
    /** 
     * Sets current object of studentCourses in this listblock line. 
     * After chaning the data you need to in this listblock line you would 
     * probably want to refresh the UI using the refresh() method.
     * @param pstudentCourses The object to set. Attributes are copied.
     */
    public void setstudentCourses (StudentCourse pstudentCourses) {
        if (pstudentCourses == null && newstudentCourses != null) {
            domainProxy.removeProxy(domainProxy.getProxy(
                    newstudentCourses, 
                    "studentCourses")); 
            newstudentCourses = null;
        } else if (pstudentCourses != null) {
            newstudentCourses = pstudentCourses;
            domainProxy.getNewProxy(
                    newstudentCourses, 
                    "studentCourses"); 
        }
        roleNameToObject.put("studentCourses", newstudentCourses);
    }


    /**
     * Returns the student object held by this line. 
     * If the object does not exist, a new object is created. 
     * @return the object held by this line
     * @deprecated use {@link #getstudent(boolean)} instead
     */
    public Student getstudent() {
        return getstudent(true);
    }


    /**
     * Returns the student object held by this line.
     * If <code>createIfNull</code> is true, and the line does
     * not hold a reference to the object, a new instance is 
     * created using the default constructor. <em>Please note</em> 
     * that the created object does not have any relations set - which migth
     * lead to unwanted "line is changed" messages when the line is selected and then
     * unselected. 
     *
     * @param createIfNull flag indicating if missing object should be created.
     * @return the student instance displayed by this line
     */
    public Student getstudent(boolean createIfNull) {
        Student astudent = (Student) roleNameToObject.get("student");
        if (astudent == null && createIfNull) {
            astudent = new Student();
            roleNameToObject.put("student", astudent);
        }
        return astudent;
     }


    /** 
     * Returns the student registered as marked with latest reset() call
     * @return The 'old' object.
     */
    public Student getOldstudent() {
        return (Student) domainProxy.getProxy(newstudent, "student").getCleanVersionOfObject();
    }
    /** 
     * Sets current object of student in this listblock line. 
     * After chaning the data you need to in this listblock line you would 
     * probably want to refresh the UI using the refresh() method.
     * @param pstudent The object to set. Attributes are copied.
     */
    public void setstudent (Student pstudent) {
        if (pstudent == null && newstudent != null) {
            domainProxy.removeProxy(domainProxy.getProxy(
                    newstudent, 
                    "student")); 
            newstudent = null;
        } else if (pstudent != null) {
            newstudent = pstudent;
            domainProxy.getNewProxy(
                    newstudent, 
                    "student"); 
        }
        roleNameToObject.put("student", newstudent);
    }
// Controller

         /** Object used for the editor/value of the cell. */
         Object cellValueColumn0 = new String("");
         /** Set if this cell in the lisblock line should not be editable */
         boolean cellNotEditable0 = false;
         /** Old value for this node in the listblock */
         String oldValuestudentCoursesid;
         StudentCourse newstudentCourses;
         StudentCourse oldstudentCourses;
// Controller

         /** Object used for the editor/value of the cell. */
         Object cellValueColumn1 = new String("");
         /** Set if this cell in the lisblock line should not be editable */
         boolean cellNotEditable1 = false;
         /** Old value for this node in the listblock */
         String oldValuestudentage;
         Student newstudent;
         Student oldstudent;
// Controller

         /** Object used for the editor/value of the cell. */
         Object cellValueColumn2 = new String("");
         /** Set if this cell in the lisblock line should not be editable */
         boolean cellNotEditable2 = false;
         /** Old value for this node in the listblock */
         String oldValuestudentid;
// Controller

         /** Object used for the editor/value of the cell. */
         Object cellValueColumn3 = new String("");
         /** Set if this cell in the lisblock line should not be editable */
         boolean cellNotEditable3 = false;
         /** Old value for this node in the listblock */
         String oldValuestudentname;
// Controller

         /** Object used for the editor/value of the cell. */
         Object cellValueColumn4 = new String("");
         /** Set if this cell in the lisblock line should not be editable */
         boolean cellNotEditable4 = false;
         /** Old value for this node in the listblock */
         String oldValuestudentstudentNr;
    public void setDisabledField(Object owner, String field, boolean setting) {
        if(owner instanceof StudentCourse && field.equals("id")) {
            cellNotEditable0 = setting;
            return;
        }
        if(owner instanceof Student && field.equals("age")) {
            cellNotEditable1 = setting;
            return;
        }
        if(owner instanceof Student && field.equals("id")) {
            cellNotEditable2 = setting;
            return;
        }
        if(owner instanceof Student && field.equals("name")) {
            cellNotEditable3 = setting;
            return;
        }
        if(owner instanceof Student && field.equals("studentNr")) {
            cellNotEditable4 = setting;
            return;
        }
        if(owner == null) {
            throw new Error("No owner in setDisabledField.");
        }
        if(field == null || field.equals("")) {
            throw new Error("No name given to setDisabledField.");
        } 
        throw new Error("Class "+owner.getClass().toString()+" and field "+field+" isn't valid in setDisabledField for the listblock 'StudentCoursesList'\n");
    }
    /** Disables/enables a given field in the listblock line
     *  represented by the object selection node object owner. The
     *  field name is the field name given in Genova. Legal
     *  combinations of owner and field are: <ul>
        </ul>
     * @param owner The object selection to use
     * @param field The field name 
     * @param setting True if the field should be disabled, false if not.
     */
    public void setDisabledFieldOS(Object owner, String field, boolean setting) {
        if(owner.equals(controller.thestudentCourses) && field.equals("id")) {
            cellNotEditable0 = setting;
            return;
        }
        if(owner.equals(controller.thestudent) && field.equals("age")) {
            cellNotEditable1 = setting;
            return;
        }
        if(owner.equals(controller.thestudent) && field.equals("id")) {
            cellNotEditable2 = setting;
            return;
        }
        if(owner.equals(controller.thestudent) && field.equals("name")) {
            cellNotEditable3 = setting;
            return;
        }
        if(owner.equals(controller.thestudent) && field.equals("studentNr")) {
            cellNotEditable4 = setting;
            return;
        }
        if(owner == null) {
            throw new Error("No owner in setDisabledField.");
        }
        if(field == null || field.equals("")) {
            throw new Error("No name given to setDisabledField.");
        } 
        throw new Error("Class "+owner.getClass().toString()+" and field "+field+" isn't valid in setDisabledField for the listblock 'StudentCoursesList'\n");
    }
}  /* End of listblock line for StudentCoursesList */
