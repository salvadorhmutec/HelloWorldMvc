package main;

import models.ModelPrincipal;
import views.ViewPrincipal;
import controllers.ControllerPrincipal;

/**
 *
 * @author Zeo
 */
public class Main {
    private static ModelPrincipal model_principal;
    private static ViewPrincipal view_principal;
    private static ControllerPrincipal controller_principal;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        model_principal = new ModelPrincipal();
        view_principal = new ViewPrincipal();
        controller_principal = new ControllerPrincipal(model_principal, view_principal);
    }
}
