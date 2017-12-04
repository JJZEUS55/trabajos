package Prueba2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@ManagedBean
@RequestScoped
@FacesConverter
public class PersonaConvertidor implements Converter{
	@ManagedProperty(value="#{personaDatos}")
	private PersonaDatos ds;

	public PersonaDatos getDs() {
		return ds;
	}

	public void setDs(PersonaDatos ds) {
		this.ds = ds;
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,String value) {
		for(Persona p : ds.getPersonas()){
			if(p.getId().equals(value)){
				return p;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,Object value) {
		if(value instanceof Persona){
			Persona persona = (Persona)value;
			return persona.getId();
		}
		return "";
	}

}