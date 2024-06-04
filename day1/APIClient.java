package week3.day1;

public class APIClient {
	String endpoint;
	String requestBody;
	String requestStatus;
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);	
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus){
		System.out.println(endpoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);
	}
	public static void main(String[] args) {
		APIClient client=new APIClient();
		client.sendRequest("firstclass");
		client.sendRequest("secondclass","thirdclass",true);	
	}
}
