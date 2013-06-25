// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package no.course.dialog;
import java.lang.reflect.Field;
import no.genova.client.support.Application;
import no.genova.domain.GenovaEnums;
import no.genova.message.CRuntimeMsg;
import no.genova.message.Message;
import no.genova.message.MessageFactory;
import no.genova.message.MessageSystem;
import no.genova.exception.GenovaClientException;
import java.util.LinkedList;
import java.util.List;
/**
 * This class has methods for converting between enum value and enum text
 * for domain classes inheriting from GenovaEnumerator.
 */
@SuppressWarnings("all")
public class CourseApp_applEnums implements GenovaEnums {
    /** Returns the int value for the enumeration from class 'name',
     *  with a given title. Used in autogenerated code - in your code,
     *  please use the function toValue.
     * @param name The name of the enumeration.
     * @param title The title of the enum to convert as defined in Rose.
     * @return The int value (currentValue) of the enumerator.
     */
    public int toValue(String name, String title) {
        return GenovaEnums.NO_VALUE;
    }
    /** Converts the enumeration value to its title for the
     *  enumeration from the class name. Used in autogenerated code -
     *  in your code, please use the function toName. 
     * @param name The name of the enumeration.
     * @param value The currentValue of the enumeration.
     * @return The title, as defined in Rose.
     */
    public String toName(String name, int value) {
        return "";
    }
    /** 
     * Assigns value to enum based on in object owner.
     * @param owner The object to set.
     * @param attribute The attribute to set value for.
     * @param enumObject The enum object to set.
     */
   public void enumAssign(Object owner, String attribute, 
            Object enumObject) {
        Class ownerClass = owner.getClass();
        Exception ex = null;
        String msgID = null;
        try {
            Field f = ownerClass.getField(attribute);
            f.set(owner, enumObject);
        }
        catch(NullPointerException e) {
            msgID = CRuntimeMsg.CF_UNABLE_TO_ACCESS_FIELD_OR_METHOD;
            ex = e;
        } catch (SecurityException e) {
            msgID = CRuntimeMsg.CF_UNABLE_TO_ACCESS_FIELD_OR_METHOD;
            ex = e;
        } catch (NoSuchFieldException e) {
            msgID = CRuntimeMsg.CF_UNABLE_TO_ACCESS_FIELD_OR_METHOD;
            ex = e;
        } catch (IllegalArgumentException e) {
            msgID = CRuntimeMsg.CF_UNABLE_TO_ACCESS_FIELD_OR_METHOD;
            ex = e;
        } catch (IllegalAccessException e) {
            msgID = CRuntimeMsg.CF_UNABLE_TO_ACCESS_FIELD_OR_METHOD;
            ex = e;
        } finally {
            if (ex != null) {
                Object[] msgArgs = {CourseApp_applEnums.class, attribute, ownerClass, ex.getMessage()};
                Message msg = MessageSystem.getMessageFactory().getMessage(msgID, msgArgs);
                MessageSystem.getMessageDispatcher(MessageSystem.NO_INTERACTION).dispatch(msg);
                throw new GenovaClientException(ex, msg);
            }
        }
    }

    /**
     * Returns the list of all enumeration values for a given enumeration.
     * @param name The name of the enumeration (class)
     * @return List of genova enumeration objects with currentValue set.
     */
    public List allEnums(String name) {
       LinkedList all = new LinkedList();
        return all;
    }
}
