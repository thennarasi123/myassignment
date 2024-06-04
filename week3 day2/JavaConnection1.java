package week3.day2;

public class JavaConnection1 extends MySqlConnection implements DatabaseConnection{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		JavaConnection1 connect=new JavaConnection1();
		connect.connect();
		connect.disconnect();
		connect.executeUpdate();
		connect.executeQuery();
		
	}
	
}
