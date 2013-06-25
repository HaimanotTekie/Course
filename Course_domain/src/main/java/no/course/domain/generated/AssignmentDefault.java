// Generated with Genova.

package no.course.domain.generated;

import java.util.Set;
import no.course.domain.Answer;
import java.io.Serializable;

/**
 * This file will be overwritten the next time it is generated from Genova.
 */
@SuppressWarnings("all")
public abstract class AssignmentDefault implements Serializable {
    
    private String assignmentText;
    private int id;
    private Set<Answer> answers;
    
    /** Default constructor. */
    protected AssignmentDefault() {
        super();
    }
    
    /**
     * Access method for assignmentText.
     *
     * @return the current value of assignmentText
     */
    public String getAssignmentText() {
        return assignmentText;
    }
    
    /**
     * Setter method for assignmentText.
     *
     * @param aAssignmentText the new value for assignmentText
     */
    public void setAssignmentText(final String aAssignmentText) {
        assignmentText = aAssignmentText;
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
