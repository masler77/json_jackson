package json;

import java.awt.Frame;
import java.awt.List;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({"fragor","pa","name","desc"})
public class lecture {


	private long id;

	private String name;
	private String NameLine2;
	@JsonProperty("Beskrivning")
	private String desc;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private boolean pa;
	
	
	public class Quiz {
		private String fraga;
		private String svar;
		private long id;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFraga() {
			return fraga;
		}
		public void setFraga(String fraga) {
			this.fraga = fraga;
		}
		public String getSvar() {
			return svar;
		}
		public void setSvar(String svar) {
			this.svar = svar;
		}

	}

	public enum gratis_titt {gratis_pa, gratis_av}
	
	public ArrayList fragor = new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameLine2() {
		return NameLine2;
	}

	public void setNameLine2(String nameLine2) {
		NameLine2 = nameLine2;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isPa() {
		return pa;
	}

	public void setPa(boolean pa) {
		this.pa = pa;
	}

	public ArrayList getFragor() {
		return fragor;
	}

	public void setFragor(ArrayList fragor) {
		this.fragor = fragor;
	}




}
