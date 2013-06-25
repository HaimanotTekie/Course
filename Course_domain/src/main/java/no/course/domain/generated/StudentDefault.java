// Generated with Genova.

package no.course.domain.generated;

import java.util.Set;
import no.course.domain.StudentCourse;
import no.course.domain.Answer;
import java.io.Serializable;

/**
 * This file will be overwritten the next time it is generated from Genova.
 */
@SuppressWarnings("all")
public abstract class StudentDefault implements Serializable {
    
    private int age;
    private int id;
    private String name;
    private int studentNr;
    private Set<StudentCourse> studentCourses;
    private Set<Answer> answers;
    
    /** Default constructor. */
    protected StudentDefault() {
        super();
    }
    
    /**
     * Access method for age.
     *
     * @return the current value of age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Setter method for age.
     *
     * @param aAge the new value for age
     */
    public void setAge(final int aAge) {
        age = aAge;
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
     * Access method for studentNr.
     *
     * @return the current value of studentNr
     */
    public int getStudentNr() {
        return studentNr;
    }
    
    /**
     * Setter method for studentNr.
     *
     * @param aStudentNr the new value for studentNr
     */
    public void setStudentNr(final int aStudentNr) {
        studentNr = aStudentNr;
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
     * Access method for answers.
     *
     * @return the current value of answers
     */
    public Set<Answer> getAnswers() {
        return answers;
    }
    
    /**
     * Setter method for answers.
     *
     * @param aAnswers the new value for answers
     */
    public void setAnswers(final Set<Answer> aAnswers) {
        answers = aAnswers;
    }
    
}
