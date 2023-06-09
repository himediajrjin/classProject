package contact.ver2;

public class Contact {
	private String name; // 친구의 이름
	private String phoneNumber; // 전화번호
	private String email; // 이메일
	private String address; // 주소
	private String birthday; // 생일
	private String group; // 그룹

	public Contact() {
		
	} // shift alt s -> constructor from superclass

	// 인스턴스 생성과 함께 데이터를 초기화 할 수 있도록 생성자 정의
	public Contact(String name, String phoneNumber, String email, String address, String birthday, String group) {
		super();	// shift alt s -> constructor using field
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void printInfo() {
		System.out.println("친구정보==================");
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber);
		System.out.println("이메일 : " + this.email);
		System.out.println("주소 : " + this.address);
		System.out.println("생일 : " + this.birthday);
		System.out.println("그룹 : " + this.group);
	}

	// shift alt s -> tostring
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address
				+ ", birthday=" + birthday + ", group=" + group + "]";
	}

	public static void main(String[] args) {
		Contact Contact = new Contact();
	}
}
