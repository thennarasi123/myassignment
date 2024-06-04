package week3.day2;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("connect the connection->from database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("diconnect the connection->from database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("execute the update->from database");
		
	}
	public static void main(String[] args) {
		JavaConnection java=new JavaConnection();
		java.connect();
		java.disconnect();
		java.executeUpdate();
	}
}
