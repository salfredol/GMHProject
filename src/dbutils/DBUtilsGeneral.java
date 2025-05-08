package dbutils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JPanel;

public class DBUtilsGeneral 
{
    public static void toggleFormMode(Container root, boolean editMode) 
    {
        toggleComponents(root, editMode);

        updatePanelNav(root, editMode);
        updateFormLockButton(root, editMode);
    }

    private static void toggleComponents(Container container, boolean enabled) 
    {
        for (Component comp : container.getComponents()) 
        {
            if (comp instanceof Container) 
            {
                toggleComponents((Container) comp, enabled);
            }

            if (comp instanceof JButton && "btn_formlock".equals(comp.getName())) 
            {
                comp.setEnabled(true);
                continue;
            }

            comp.setEnabled(enabled);
        }
    }

    private static void updatePanelNav(Container container, boolean editMode) 
    {
           for (Component comp : container.getComponents()) 
           {
               if (comp instanceof JPanel && "panel_nav".equals(comp.getName())) 
               {
                   comp.setBackground(editMode ? new Color(0, 51, 102) : Color.GRAY);
               }

               if (comp instanceof Container) 
               {
                   updatePanelNav((Container) comp, editMode);
               }
           }
       }

       private static void updateFormLockButton(Container container, boolean editMode) 
       {
           for (Component comp : container.getComponents()) 
           {
               if (comp instanceof JButton && "btn_formlock".equals(comp.getName())) 
               {
                   ((JButton) comp).setText(editMode ? "EDIT MODE" : "VIEW MODE");
                   comp.setEnabled(true);
               }

               if (comp instanceof Container) 
               {
                   updateFormLockButton((Container) comp, editMode);
               }
           }
       }
}
