package schemaValidering;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public class lectureSchema {
	@JsonPropertyDescription(value="id av felt")
	private long id;
	@JsonPropertyDescription(value="är tvingande")
	@JsonProperty(required=true)
	private String name;
	
	@JsonProperty(required=true)
	private String NameLine2;
	
	@JsonProperty("Beskrivning")
	private String desc;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private boolean pa;
	
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
	
}
