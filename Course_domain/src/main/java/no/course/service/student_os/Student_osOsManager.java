// Generated with Genova.

package no.course.service.student_os;

import no.genova.exception.GenovaBaseException;
import no.genova.exception.GenovaServiceException;
import no.genova.jgrape.OsManager;
import no.genova.jgrape.Role;
import no.genova.message.Message;
import no.genova.message.CRuntimeMsg;
import no.genova.message.MessageFactory;
import no.genova.message.MessageSystem;
import no.genova.support.Registry;

/**
 * The <code>Student_osOsManager</code> class was generated by the Genova Service Generator from the object selection <code>Student_os</code>.
 * <p>
 * The java file containing this class should not be altered. All changes will be lost when the class is regenerated.
 * <p>
 * Object selection dokumentation:
 * <br>
 * 
 */
@SuppressWarnings("all")
public class Student_osOsManager extends OsManager {

    /**
     * Get name of object selection manager
     * @return String
     */
    public static String getStaticName() { 
        return "Student_osOsManager"; 
    } 

    /**
     * Create a new manager for an objectselection role
     * @param applicationName
     * @param roleName
     * @return Role
     */
    public static Role newRoleManager(String applicationName, String roleName) {
        Role role = null;
        Registry reg = Registry.getRegistry();
        String fullName = OsManager.createManagerClassName(roleName,"no.course.service.student_os");
        try {
            Class classDefinition = Class.forName(fullName);
            role = (Role)classDefinition.newInstance();
        } catch (Exception e) {
            // Could be InstantiationException
            //          IllegalAccessException
            //          ClassNotFoundException
            //          SecurityException
            Object[] args = {fullName,e.getMessage()};
            Message msg = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.SM_UNABLE_TO_CREATE_ROLE_INSTANCE, args);
            MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
            throw new GenovaServiceException(e, msg);
        }
        if (role != null) {
            role.initializeRole(applicationName,roleName,null);
        }
        return role;
    }

    public Role newManager(String applicationName, String roleName) {
        return Student_osOsManager.newRoleManager(applicationName,roleName);
    }

}
