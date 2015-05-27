package smok.springmvc.model.tmodel;

import java.util.Date;

public class User {

	private long id;
	private String name;
	private int age;
	private int sex;
	private String address;
	private String comment;
	private Date addtime;
	private Date updatetime;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=").append(id).append(", ");
		if (name != null)
			builder.append("name=").append(name).append(", ");
		builder.append("age=").append(age).append(", sex=").append(sex).append(", ");
		if (address != null)
			builder.append("address=").append(address).append(", ");
		if (comment != null)
			builder.append("comment=").append(comment);
		builder.append("]");
		return builder.toString();
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

}
