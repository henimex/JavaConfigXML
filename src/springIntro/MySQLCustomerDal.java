package springIntro;

public class MySQLCustomerDal implements ICustomerDal{

	String connectionString;
	
	@Override
	public void add() {
		System.out.println("Connection String : " + this.connectionString);
		System.out.println("MySQL DB Added");
	}
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
