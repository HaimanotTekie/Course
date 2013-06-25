// Generated with Genova.

package no.course.domain.generated;

import java.util.Set;
import no.course.domain.StudentCourse;
import no.course.domain.Assignment;
import java.io.Serializable;

/**
 * This file will be overwritten the next time it is generated from Genova.
 */
@SuppressWarnings("all")
public abstract class CourseDefault implements Serializable {
    
    private String code;
    private int id;
    private boolean isActive;
    private String name;
    private Set<StudentCourse> studentCourses;
    private Set<Assignment> assignments;
    
    /** Default constructor. */
    protected CourseDefault() {
        super();
    }
    
    /**
     * Access method for code.
     *
     * @return the current value of code
     */
    public String getCode() {
        return code;
    }
    
    /**
     * Setter method for code.
     *
     * @param aCode the new value for code
     */
    public void setCode(final String aCode) {
        code = aCode;
    }
    
    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }
    
    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(final int aId) {
        id = aId;
    }
    
    /**
     * Access method for isActive.
     *
     * @return true if and only if isActive is currently true
     */
    public boolean getIsActive() {
        return isActive;
    }
    
    /**
     * Setter method for isActive.
     *
     * @param aIsActive the new value for isActive
     */
    public void setIsActive(final boolean aIsActive) {
        isActive = aIsActive;
    }
    
    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(final String aName) {
        name = aName;
    }
    
    /**
     * Access method for studentCourses.
     *
     * @return the current value of studentCourses
     */
    public Set<StudentCourse> getStudentCourses() {
        return studentCourses;
    }
    
    /**
     * Setter method for studentCourses.
     *
     * @param aStudentCourses the new value for studentCourses
     */
    public void setStudentCourses(final Set<StudentCourse> aStudentCourses) {
        studentCourses = aStudentCourses;
    }
    
    /**
     * Access method for assignments.
     *
     * @return the current value of assignments
     */
    public Set<Assignment> getAssignments() {
        return assignments;
    }
    
    /**
     * Setter method for assignments.
     *
     * @param aAssignments the new value for assignments
     */
    public void setAssignments(final Set<Assignment> aAssignments) {
        assignments = aAssignments;
    }
    
}
