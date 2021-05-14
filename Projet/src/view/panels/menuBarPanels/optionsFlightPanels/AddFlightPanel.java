package view.panels.menuBarPanels.optionsFlightPanels;


import controller.ApplicationController;
import model.Flight;
import view.forms.flightForms.FlightForm;
import view.panels.buttons.ButtonsPanel;
import view.windows.MenuWindow;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AddFlightPanel extends JPanel {
    private ApplicationController controller;
    private MenuWindow menuWindow;
    private JButton retour, validation, réinit;

    public AddFlightPanel(MenuWindow menuWindow) {
        this.menuWindow = menuWindow;
        this.setLayout(new BorderLayout());
        this.add(new FlightForm(), BorderLayout.CENTER);
     /*
        retour = new JButton("Retour");
        validation =  new JButton("Validation");
        réinit = new JButton("Réinitialiser");

        retour.addActionListener(new ButtonsPanel.RetourListener());
        validation.addActionListener(new ValidationListener());
        réinit.addActionListener(new RéinitListener());

        this.add(retour);
        this.add(validation);
        this.add(réinit);*/
        //this.add(new ButtonsPanel(menuWindow), BorderLayout.SOUTH);

    }


    // bouton de validation
   /* private class ValidationListener(Flight flightForm) implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){
          Flight flight = flightForm.getFlight();
            try {
                flight = flightForm.getFlight();
                controller.addFlight(flight);
                JOptionPane.showMessageDialog(null, "Vol ajouté", "Succès", JOptionPane.INFORMATION_MESSAGE);
                takeOut();
            } catch (FlightException.NumberFlightException e) {
                e.printStackTrace();
            } catch (FlightException.MealDescriptionException e) {
                e.printStackTrace();
            }
        }
    }*/

    // bouton de réinitialisation
   /* private class RéinitListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){
            takeOut();
        }
    }

    public void takeOut(){
        menuWindow.getCont().removeAll();
        menuWindow.getCont().add(new AddFlightPanel(menuWindow),BorderLayout.CENTER);
        menuWindow.getCont().repaint();
        menuWindow.setVisible(true);
    }*/


}
