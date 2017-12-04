package Prueba2;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;

//import net.javabeat.primefaces.data.Player;
//import net.javabeat.primefaces.util.PlayerDataSource;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

@ManagedBean
@SessionScoped
public class AutoCompletado {
	@ManagedProperty("#{personaDatos}")
	private PersonaDatos ds;

	private List<Persona> personas;

	public AutoCompletado (){

	}

	public List<Persona> complete(String query){
		// Assumed Datasource
		return ds.queryByName(query);
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public PersonaDatos getDs() {
		return ds;
	}

	public void setDs(PersonaDatos ds) {
		this.ds = ds;
	}

	public void handleSelect(SelectEvent e){
		Persona p = (Persona)e.getObject();
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Se selecciono a " + p.getNombre()+ " Y su id es" + p.getId(),""));
	}

	public void handleUnSelect(UnselectEvent e){
		Persona p = (Persona)e.getObject();
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_WARN,
					"Se removido a " + p.getNombre()+ " Y su id es" + p.getId(),""));
	}

	public void phaseListener(PhaseEvent e){
		List<FacesMessage> messages = e.getFacesContext().getMessageList();
		System.out.println(messages.size());
	}

}