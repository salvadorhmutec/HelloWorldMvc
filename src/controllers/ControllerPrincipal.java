/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelPrincipal;
import views.ViewPrincipal;

/**
 *
 * @author Zeo
 */
public class ControllerPrincipal implements ActionListener{
    ModelPrincipal model_principal;
    ViewPrincipal view_principal;

    public ControllerPrincipal(ModelPrincipal model_principal, ViewPrincipal view_principal) {
        this.model_principal = model_principal;
        this.view_principal = view_principal;
        this.view_principal.jbt_say_hello.addActionListener(this);
        this.initComponets();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view_principal.jbt_say_hello){
            this.sayHello();
        }
    }
    
    private void getName(){
        model_principal.setName(view_principal.jtf_name.getText());
    }
    
    private void sayHello(){
        this.getName();
        view_principal.jl_hello.setText("Hello " + model_principal.getName());
    }
    
    private void initComponets(){
        view_principal.setVisible(true);
        view_principal.jtf_name.setText(model_principal.getName());
    }
}
