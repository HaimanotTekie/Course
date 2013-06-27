// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------

package no.course.dialog.student;

import no.genova.client.support.ApplicationMethods;
import no.genova.domain.GenovaEnums;

/** Skeleton class of Student. This class will only be
 * generated once. Add all user specific code here. (This should be
 * overriding of event methods). */
public class StudentController extends StudentDefaultController {

    /** Internal use. Use window open event defined in genova to add
     * code to dialog startup.
     * @param m The application methods.
     */
    public StudentController(ApplicationMethods m) {
        super(m);
    }
    /**
     * This method is invoked <em>after</em> the dialog is 
     * fully realized and drawn on screen, so that you
     * might modify fields, set values etc.
     * <p><em>Note</em>This method is called from the EDT, thus
     * if you need to do some time consuming task, you should set up
     * a dedicated thread and let the gui carry on (you might want to block
     * the dialog though...). 
     * <p>The pattern below show how to both set up a dedicated thread for 
     * the (possibly) time consuming task, and how to get back to the EDT for
     * updating the dialog window.:
     * <code>
     * // SET UP NEW THREAD CODE
     * Runnable longTask = new Runnable() {
     *          public void run() {
     *              final Object someObject = LINES WITH TIME CONSUMING CODE...
     *              
     *              // DISPLAY CODE - GET BACK TO EDT
     *              SwingUtilities.invokeLater(new Runnable() {
     *                  public void run() {
     *                      // GUI CODE
     *                      display(someObject); 
     *                  }
     *              });
     *          }
     *     };
     * 
     * // INIT THREAD
     * Thread longTimeThread = new Thread(longTask, "thread name");
     * longTimeThread.setPriority(Thread.NORM_PRIORITY);
     *
     * // START THREAD
     * longTimeThread.start();
     * 
     * </code>
     */
    @Override
    public void setAccessPolicy() {
        // Add own implementation.
    }
    @Override
    protected StudentDefaultView hookInstantiateView(StudentDefaultController controller, GenovaEnums applicationEnums) {
        return new StudentView(controller, applicationEnums);
    }
}
