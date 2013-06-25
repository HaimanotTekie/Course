// ---------------------------------------------------------------------
// Generated with Genova.
// ---------------------------------------------------------------------
package no.course.dialog;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import no.genova.client.support.FontTools;
import no.genova.client.support.GenovaRepository;
import no.genova.client.support.ImageProxy;

/**
 * This class holds the repository information for the dialogs. The content of
 * this class is generated based on resources in Genova and might change
 * after a regeneration.
 *
 * Images are not loaded until they are used.
 */
@SuppressWarnings("all")
public class ChooseStudents_applRepository implements GenovaRepository {

    private Map colors = new HashMap();
    private Map fonts = new HashMap();
    private Map images = new HashMap();

    /** Default constructor */
    public ChooseStudents_applRepository() {
        colors.put("Black", new Color(0,0,0));
        fonts.put("Standard", new Font("Tahoma", Font.PLAIN, FontTools.calcFontSize(8)));
        images.put("GenovaIcon", 
                new ImageProxy(GenovaRepository.DEFAULT_GENOVA_ICON));
        /* The DefaultIcon will be changed to the icon set by the application
           window if defined. Genova8 icon is the super default. */
        images.put("DefaultIcon", 
                new ImageProxy(GenovaRepository.DEFAULT_GENOVA_ICON));
    }

    /**
     * @see no.genova.client.support.GenovaRepository#getColor(java.lang.String)
     */
    public Color getColor(String name) {
        return (Color)colors.get(name);
    }

    /**
     * @see no.genova.client.support.GenovaRepository#getFont(java.lang.String)
     */
    public Font getFont(String name) {
        return (Font)fonts.get(name);
    }

    /**
     * @see no.genova.client.support.GenovaRepository#getImage(java.lang.String)
     */
    public ImageIcon getImage(String name) {
        ImageProxy ip = (ImageProxy) images.get(name);
        return ip != null ? ip.getImage() : null;
    }

    /**
     * @see no.genova.client.support.GenovaRepository#setDefaultImage(java.lang.String)
     */
    public void setDefaultImage(String defaultIcon) {
        ImageProxy image = (ImageProxy)images.get(defaultIcon);
        images.put("DefaultIcon", image);
    }
}
