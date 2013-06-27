// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
    
    /* Her kommer generert kode for Listblock:ListblockLineClass*/
    
    
package no.course.dialog.choosestudents;

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

import no.course.domain.Student;


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
 * chooseStudentsListBloack.
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
public class LineListblockchooseStudentsListBloack implements ListblockLine {
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
        column = ((Integer)controller.view.chooseStudentsListBloack_indexes.elementAt(column)).intValue();
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
    final LineListblockchooseStudentsListBloack pointerToListblockLine = this;

    ChooseStudentsDefaultController controller;

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
     *     variable listblockMethodschooseStudentsListBloack! 
     * @param c Internal use.
     */
    LineListblockchooseStudentsListBloack(ChooseStudentsDefaultController c) {
        controller = c;
        domainProxy = new DomainProxy(true, controller.applicationEnums);
    }

    /**
     * Returns true if the line in the listblock chooseStudentsListBloack is deleted 
     * See documentation about state on class LineListblockchooseStudentsListBloack.
     * @return True if deleted, false if not.
     */
    public boolean isDeleted() {
        return isdeleted;
    }

    /**
     * Returns true if the line in the listblock chooseStudentsListBloack is disabled 
     * See documentation about state on class LineListblockchooseStudentsListBloack.
     * @return True if disabled, false if not.
     */
    public boolean isDisabled() {
       return isdisabled;
    }

    /** Returns true if the line in the listblock chooseStudentsListBloack is new.
     * @return Ture if new, false if not.
     */
    public boolean isNew() {
        return isnew;
    }

    /**
     * Returns true if the line in the listblock chooseStudentsListBloack is changed 
     * See documentation about state on class LineListblockchooseStudentsListBloack.
     * @return True if changed, false if not.
     */
    public boolean isChanged() {
        return ischanged;
    }

    /** 
     * Returns true if the line in the listblock chooseStudentsListBloack was
     * deleted last time reset was called.
     * See documentation about state on class LineListblockchooseStudentsListBloack.
     * @return True if deleted, false if not.
     */
    public boolean oldIsDeleted() {
        return oldIsdeleted;
    }

    /**
     * Returns true if the line in the listblock chooseStudentsListBloack had the status
     * new last time reset was called.
     * @return True if new, false if not.
     */
    public boolean oldIsNew() {
        return oldIsnew;
    }

    /**
     * Returns true if the line in the listblock chooseStudentsListBloack was
     * deleted last time reset was called. 
     * See documentation about state on class LineListblockchooseStudentsListBloack.
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
     * See documentation about state on class LineListblockchooseStudentsListBloack.
     */
    public void forceMarkAsNew() {
        ischanged = false;
        isnew = true;
        isdeleted = false;
    }

    /** Clears new, changed and deleted flags. 
     * See documentation about state on class LineListblockchooseStudentsListBloack.
     */
    public void forceClean() {
        ischanged = false;
        isnew = false;
        isdeleted = false;
    }

    /** Marks line as new unless it already has been marked as
     * changed or deleted. 
     * See documentation about state on class LineListblockchooseStudentsListBloack.
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
     * See documentation about state on class LineListblockchooseStudentsListBloack.
     */
    public void forceMarkAsChanged() {
        ischanged = true;
        isnew = false;
        isdeleted = false;
    }

    /** Marks line as changed unless it already has been marked as
     * new or deleted. 
     * See documentation about state on class LineListblockchooseStudentsListBloack.
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
     * See documentation about state on class LineListblockchooseStudentsListBloack.
     * @param src The listblockline to copy state flags from.
     */
    public void copyStateFlags(LineListblockchooseStudentsListBloack src) {
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
     * @param theStudent the name of the class
     */
     void comboboxStudentageAddItem(Student theStudent) {
           ((JComboBox)cellValueColumn0).addItem(controller.convertToString(theStudent.getAge(), TypeTool.getAttributeClassNameMethod(theStudent,"age")));
        }
    /** 
     * Removes all elements from ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     */
     void comboboxStudentageRemoveAllItems() {
        ((JComboBox)cellValueColumn0).removeAllItems();
     }
    /** 
     * Returns item count of ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     * @return the item count.
     */
     int comboboxStudentageGetItemCount() {
        return ((JComboBox)cellValueColumn0).getItemCount();
     }
    /** 
     * Inserts element into ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     * @param theStudent the name of the class
     */
     void comboboxStudentnameAddItem(Student theStudent) {
           ((JComboBox)cellValueColumn1).addItem(controller.convertToString(theStudent.getName(), TypeTool.getAttributeClassNameMethod(theStudent,"name")));
        }
    /** 
     * Removes all elements from ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     */
     void comboboxStudentnameRemoveAllItems() {
        ((JComboBox)cellValueColumn1).removeAllItems();
     }
    /** 
     * Returns item count of ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     * @return the item count.
     */
     int comboboxStudentnameGetItemCount() {
        return ((JComboBox)cellValueColumn1).getItemCount();
     }
    /** 
     * Inserts element into ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     * @param theStudent the name of the class
     */
     void comboboxStudentstudentNrAddItem(Student theStudent) {
           ((JComboBox)cellValueColumn2).addItem(controller.convertToString(theStudent.getStudentNr(), TypeTool.getAttributeClassNameMethod(theStudent,"studentNr")));
        }
    /** 
     * Removes all elements from ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     */
     void comboboxStudentstudentNrRemoveAllItems() {
        ((JComboBox)cellValueColumn2).removeAllItems();
     }
    /** 
     * Returns item count of ComboxField. 
     * Note that this method is generated for all attributes, 
     * regardless if it is a Combobox. 
     * Though if their owner isn't a combobox, it has no effect 
     * @return the item count.
     */
     int comboboxStudentstudentNrGetItemCount() {
        return ((JComboBox)cellValueColumn2).getItemCount();
     }
        /** Internal use. 
         * @param column Internal use.
         */
        void fromCellToListblockLine(int column) {
            DomainObjectProxy objectProxy = domainProxy.getProxy(newStudent, "Student");
    /** Column Match ? */
    if(controller.view.chooseStudentsListBloack_indexes.indexOf(new Integer(0)) == column) {
        Object workValue = null;
        // Object convert = TypeTool.convert(newStudent.getAge());
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
        if(TypeTool.isEnumeratorMethod(newStudent,"age")) {
            String enumName = TypeTool.getAttributeClassNameMethod(newStudent,"age");
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
            objectProxy = domainProxy.getProxy(newStudent, "Student");
            objectProxy.setAttribute("age", workValue.toString());
        }
        fromListblockLineToCell(column, false);
    }
    /** Column Match ? */
    if(controller.view.chooseStudentsListBloack_indexes.indexOf(new Integer(1)) == column) {
        Object workValue = null;
        // Object convert = TypeTool.convert(newStudent.getName());
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
        if(TypeTool.isEnumeratorMethod(newStudent,"name")) {
            String enumName = TypeTool.getAttributeClassNameMethod(newStudent,"name");
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
            objectProxy = domainProxy.getProxy(newStudent, "Student");
            objectProxy.setAttribute("name", workValue.toString());
        }
        fromListblockLineToCell(column, false);
    }
    /** Column Match ? */
    if(controller.view.chooseStudentsListBloack_indexes.indexOf(new Integer(2)) == column) {
        Object workValue = null;
        // Object convert = TypeTool.convert(newStudent.getStudentNr());
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
        if(TypeTool.isEnumeratorMethod(newStudent,"studentNr")) {
            String enumName = TypeTool.getAttributeClassNameMethod(newStudent,"studentNr");
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
            objectProxy = domainProxy.getProxy(newStudent, "Student");
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
        // int correctedCol = ((Integer)controller.view.chooseStudentsListBloack_indexes.elementAt(column)).intValue();
        // Column match
        if(controller.view.chooseStudentsListBloack_indexes.indexOf(new Integer(0)) == column) {
            if (newStudent == null) {
                cellValueColumn0 = null;
            } else {
                Object convert = TypeTool.toObject(newStudent.getAge());
                Object assignValue = null;
                if(TypeTool.isEnumeratorMethod(newStudent,"age")) {
                    assignValue = controller.convertToString(newStudent.getAge(), TypeTool.getAttributeClassNameMethod(newStudent,"age"));
                } else {
                    assignValue = convert;
                }
                cellValueColumn0 = assignValue;
            }
            return;
        }
        // Column match
        if(controller.view.chooseStudentsListBloack_indexes.indexOf(new Integer(1)) == column) {
            if (newStudent == null) {
                cellValueColumn1 = null;
            } else {
                Object convert = TypeTool.toObject(newStudent.getName());
                Object assignValue = null;
                if(TypeTool.isEnumeratorMethod(newStudent,"name")) {
                    assignValue = controller.convertToString(newStudent.getName(), TypeTool.getAttributeClassNameMethod(newStudent,"name"));
                } else {
                    assignValue = convert;
                }
                cellValueColumn1 = assignValue;
            }
            return;
        }
        // Column match
        if(controller.view.chooseStudentsListBloack_indexes.indexOf(new Integer(2)) == column) {
            if (newStudent == null) {
                cellValueColumn2 = null;
            } else {
                Object convert = TypeTool.toObject(newStudent.getStudentNr());
                Object assignValue = null;
                if(TypeTool.isEnumeratorMethod(newStudent,"studentNr")) {
                    assignValue = controller.convertToString(newStudent.getStudentNr(), TypeTool.getAttributeClassNameMethod(newStudent,"studentNr"));
                } else {
                    assignValue = convert;
                }
                cellValueColumn2 = assignValue;
            }
            return;
        }
        }
        public void reset() {
            oldStudent = new Student ();
            TypeTool.reflectCopyMethod(newStudent, "age",oldStudent);
            TypeTool.reflectCopyMethod(newStudent, "name",oldStudent);
            TypeTool.reflectCopyMethod(newStudent, "studentNr",oldStudent);
            oldIschanged = ischanged;
            ischanged = false;
            oldIsnew = isnew;
            isnew = false;
            oldIsdeleted = isdeleted;
            isdeleted = false;
        }
        public void previousState() {
            controller.view.block.increaseListblockchooseStudentsListBloack();
            boolean isDis = isdisabled;
            isdisabled = false;
            TypeTool.reflectCopyMethod(oldStudent, "age",newStudent);
            TypeTool.reflectCopyMethod(oldStudent, "name",newStudent);
            TypeTool.reflectCopyMethod(oldStudent, "studentNr",newStudent);
            ischanged = oldIschanged;
            isnew = oldIsnew;
            isdeleted = oldIsdeleted;
            fromListblockLineToCells(false);
            controller.view.chooseStudentsListBloacktheModel.fireTableDataChanged();
            fromCellsToListblockLine();
            isdisabled = isDis;
            controller.view.block.decreaseListblockchooseStudentsListBloack();
        }

    public Object obtain(String identifier) {
        if (identifier.indexOf(".") == -1) {
            return getDisplayedObject(identifier);
        } else {
            int colNumber = controller.listblockMethodschooseStudentsListBloack
                    .getColumnIndex(identifier);
            return controller.view.chooseStudentsListBloack_table
                    .getValueAt(getLineNumber(), colNumber);
        }
    }

    public ListblockLine obtain() {
        obtain("Student");
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
        if (controller.listblockMethodschooseStudentsListBloack
                .getRoleNamesInUse().contains(roleName)) {
            return getObject(roleName, true);
        } else {
            return roleNameToObject.get(roleName);
        }
    }


    public Object getObject(String roleName, boolean createIfNull) {
        if ("Student".equals(roleName)) {
            return getStudent(createIfNull);
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
        if (obj instanceof Student && "Student".equals(roleName)) {
            setStudent((Student) obj);
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
        }
    }
    private Object getDisplayedObject(String roleName) {
        if ("Student".equals(roleName)) {
            return getDisplayedStudent();
        }
        return roleNameToObject.get(roleName);
    }


    /**
     * Gets the Student instance from this listblock line. The
     * instance is updated with the displayed cell values before returning.
     * @return the displayed object
     */
    protected Student getDisplayedStudent() {
        Student singleStudent = (Student) roleNameToObject.get("Student");
        if (singleStudent == null) {
            return null;
        }
        DomainObjectProxy proxy = controller.getProxy(singleStudent, "Student");
        int rowNumber = getLineNumber();
        int colNumber;
        Object value;
        
        colNumber = controller.listblockMethodschooseStudentsListBloack.getColumnIndex("Student.age");
        value = controller.view.chooseStudentsListBloack_table.getValueAt(rowNumber, colNumber);
        proxy.setAttribute("age", value);
        
        colNumber = controller.listblockMethodschooseStudentsListBloack.getColumnIndex("Student.name");
        value = controller.view.chooseStudentsListBloack_table.getValueAt(rowNumber, colNumber);
        proxy.setAttribute("name", value);
        
        colNumber = controller.listblockMethodschooseStudentsListBloack.getColumnIndex("Student.studentNr");
        value = controller.view.chooseStudentsListBloack_table.getValueAt(rowNumber, colNumber);
        proxy.setAttribute("studentNr", value);

        return (Student) proxy.getObject();
    }
    public boolean hasPreviousState() {
       return true 
             && oldStudent != null
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
        controller.view.block.increaseListblockchooseStudentsListBloack();
        if(false) {
            /* Needed */
        }
             else if(type instanceof Student && fieldName.equals("age")) {
                 controller.view.chooseStudentsListBloack_table.editCellAt(lineNumber, controller.view.chooseStudentsListBloack_indexes.indexOf(new Integer(0)));   
             }
             else if(type instanceof Student && fieldName.equals("name")) {
                 controller.view.chooseStudentsListBloack_table.editCellAt(lineNumber, controller.view.chooseStudentsListBloack_indexes.indexOf(new Integer(1)));   
             }
             else if(type instanceof Student && fieldName.equals("studentNr")) {
                 controller.view.chooseStudentsListBloack_table.editCellAt(lineNumber, controller.view.chooseStudentsListBloack_indexes.indexOf(new Integer(2)));   
             }
            controller.view.block.decreaseListblockchooseStudentsListBloack();
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
        controller.view.block.increaseListblockchooseStudentsListBloack();
        if (false) {
            /* NEEDED */
        }
             else if(type == controller.theStudent && fieldName.equals("age")) {
                 controller.view.chooseStudentsListBloack_table.editCellAt(lineNumber, controller.view.chooseStudentsListBloack_indexes.indexOf(new Integer(0)));   
             }
             else if(type == controller.theStudent && fieldName.equals("name")) {
                 controller.view.chooseStudentsListBloack_table.editCellAt(lineNumber, controller.view.chooseStudentsListBloack_indexes.indexOf(new Integer(1)));   
             }
             else if(type == controller.theStudent && fieldName.equals("studentNr")) {
                 controller.view.chooseStudentsListBloack_table.editCellAt(lineNumber, controller.view.chooseStudentsListBloack_indexes.indexOf(new Integer(2)));   
             }
            controller.view.block.decreaseListblockchooseStudentsListBloack();
        }
        /** Internal use */
        void fromCellsToListblockLine() {
            for(int i=0;i<controller.view.chooseStudentsListBloack_table.getColumnCount();i++) {
                fromCellToListblockLine(i);
            }
        }
        public void refresh() {
            controller.view.block.increaseListblockchooseStudentsListBloack();
            fromListblockLineToCells(false);
            int[] selected = controller.listblockMethodschooseStudentsListBloack.getSelectedLines();
            controller.view.chooseStudentsListBloacktheModel.fireTableDataChanged();
            controller.listblockMethodschooseStudentsListBloack.setSelectedLines(selected);
            controller.view.block.decreaseListblockchooseStudentsListBloack();
        }
        /** Internal use. 
         *  @param defaultInsert internal use.
         */
        void fromListblockLineToCells(boolean defaultInsert) {
            for(int i= 0; i < controller.view
                    .chooseStudentsListBloack_table.getColumnCount();i++) {
                fromListblockLineToCell(i, defaultInsert);
            }
        }

    public void displayInEditField() {
        new ClearTool(controller.roleObjects).clearMembers("Student");
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
        objectList.add(getStudent(false));
        return objectList;
    }

    public int hashCode() {
        int hash = "chooseStudentsListBloack".hashCode();
        if (getStudent(false) != null) {
            hash += getStudent(false).hashCode();
        }

        return hash;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true; // base case
        }
        if (o == null || 
                !(o instanceof LineListblockchooseStudentsListBloack)) {
            return false;
        }

        LineListblockchooseStudentsListBloack line = 
            (LineListblockchooseStudentsListBloack) o;
        if (getStudent(false) != null && 
                !getStudent(false).equals(
                        line.getStudent(false))) {
            return false;
        }

        return true;
    }
    public void addDomainObject(Object domainObject) {
        if (domainObject instanceof Student) {
            setStudent((Student) domainObject);
        }
    }
    public Listblock getListblock() {
        return controller.listblockMethodschooseStudentsListBloack;
    }


    /**
     * Returns the Student object held by this line. 
     * If the object does not exist, a new object is created. 
     * @return the object held by this line
     * @deprecated use {@link #getStudent(boolean)} instead
     */
    public Student getStudent() {
        return getStudent(true);
    }


    /**
     * Returns the Student object held by this line.
     * If <code>createIfNull</code> is true, and the line does
     * not hold a reference to the object, a new instance is 
     * created using the default constructor. <em>Please note</em> 
     * that the created object does not have any relations set - which migth
     * lead to unwanted "line is changed" messages when the line is selected and then
     * unselected. 
     *
     * @param createIfNull flag indicating if missing object should be created.
     * @return the Student instance displayed by this line
     */
    public Student getStudent(boolean createIfNull) {
        Student aStudent = (Student) roleNameToObject.get("Student");
        if (aStudent == null && createIfNull) {
            aStudent = new Student();
            roleNameToObject.put("Student", aStudent);
        }
        return aStudent;
     }


    /** 
     * Returns the Student registered as marked with latest reset() call
     * @return The 'old' object.
     */
    public Student getOldStudent() {
        return (Student) domainProxy.getProxy(newStudent, "Student").getCleanVersionOfObject();
    }
    /** 
     * Sets current object of Student in this listblock line. 
     * After chaning the data you need to in this listblock line you would 
     * probably want to refresh the UI using the refresh() method.
     * @param pStudent The object to set. Attributes are copied.
     */
    public void setStudent (Student pStudent) {
        if (pStudent == null && newStudent != null) {
            domainProxy.removeProxy(domainProxy.getProxy(
                    newStudent, 
                    "Student")); 
            newStudent = null;
        } else if (pStudent != null) {
            newStudent = pStudent;
            domainProxy.getNewProxy(
                    newStudent, 
                    "Student"); 
        }
        roleNameToObject.put("Student", newStudent);
    }
// Controller

         /** Object used for the editor/value of the cell. */
         Object cellValueColumn0 = new String("");
         /** Set if this cell in the lisblock line should not be editable */
         boolean cellNotEditable0 = false;
         /** Old value for this node in the listblock */
         String oldValueStudentage;
         Student newStudent;
         Student oldStudent;
// Controller

         /** Object used for the editor/value of the cell. */
         Object cellValueColumn1 = new String("");
         /** Set if this cell in the lisblock line should not be editable */
         boolean cellNotEditable1 = false;
         /** Old value for this node in the listblock */
         String oldValueStudentname;
// Controller

         /** Object used for the editor/value of the cell. */
         Object cellValueColumn2 = new String("");
         /** Set if this cell in the lisblock line should not be editable */
         boolean cellNotEditable2 = false;
         /** Old value for this node in the listblock */
         String oldValueStudentstudentNr;
    public void setDisabledField(Object owner, String field, boolean setting) {
        if(owner instanceof Student && field.equals("age")) {
            cellNotEditable0 = setting;
            return;
        }
        if(owner instanceof Student && field.equals("name")) {
            cellNotEditable1 = setting;
            return;
        }
        if(owner instanceof Student && field.equals("studentNr")) {
            cellNotEditable2 = setting;
            return;
        }
        if(owner == null) {
            throw new Error("No owner in setDisabledField.");
        }
        if(field == null || field.equals("")) {
            throw new Error("No name given to setDisabledField.");
        } 
        throw new Error("Class "+owner.getClass().toString()+" and field "+field+" isn't valid in setDisabledField for the listblock 'chooseStudentsListBloack'\n");
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
        if(owner.equals(controller.theStudent) && field.equals("age")) {
            cellNotEditable0 = setting;
            return;
        }
        if(owner.equals(controller.theStudent) && field.equals("name")) {
            cellNotEditable1 = setting;
            return;
        }
        if(owner.equals(controller.theStudent) && field.equals("studentNr")) {
            cellNotEditable2 = setting;
            return;
        }
        if(owner == null) {
            throw new Error("No owner in setDisabledField.");
        }
        if(field == null || field.equals("")) {
            throw new Error("No name given to setDisabledField.");
        } 
        throw new Error("Class "+owner.getClass().toString()+" and field "+field+" isn't valid in setDisabledField for the listblock 'chooseStudentsListBloack'\n");
    }
}  /* End of listblock line for chooseStudentsListBloack */
