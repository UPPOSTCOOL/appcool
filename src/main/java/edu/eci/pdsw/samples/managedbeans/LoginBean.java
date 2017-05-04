/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbeans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Carol
 */
@ManagedBean(name = "loginBean")
@SessionScoped
    public class LoginBean
{
    private String name;
    private String password;
    private boolean logeado = false;


    public String getName ()
    {
        return name;
    }


    public void setName (final String name)
    {
        this.name = name;
    }


    public String getPassword ()
    {
        return password;
    }


    public void setPassword (final String password)
    {
        this.password = password;
    }
    public void login(ActionEvent actionEvent) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage msg = null;
        if (name != null && name.equals("admin") && name != null
                && password.equals("admin")) {
            logeado = true;
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenid@", name);
        } else {
            logeado = false;
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error",
                    "Credenciales no válidas");
        }
        FacesContext.getCurrentInstance().addMessage(null, msg);
        context.addCallbackParam("estaLogeado", logeado);
        if (logeado) {
            context.addCallbackParam("view", "gauge.xhtml");
        }
    }

    public void logout() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(false);
        session.invalidate();
        logeado = false;
    }

}
