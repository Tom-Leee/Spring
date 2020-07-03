package mybatis.domain;

import java.util.Date;

//@Data
public class MovieVO {
	private int code;
	private String name;
	private Date regdate;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "MovieVO [code=" + code + ", name=" + name + ", regdate=" + regdate + "]";
	}
	
}
