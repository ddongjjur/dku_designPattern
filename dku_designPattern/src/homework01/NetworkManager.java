package homework01;

public class NetworkManager {
	private NetworkConnection networkConnection;
	private String currentConnectionType;
	
	public NetworkManager(NetworkConnection networkConnection) {
		this.networkConnection = networkConnection;
	}
	
	public void connect() {
		networkConnection.connect();
		currentConnectionType = networkConnection.getConnectionType();
		
		if (networkConnection.isConnection()) {
			System.out.println(currentConnectionType + "형식의 네트워크에 연결되었습니다!");
			System.out.println();
		}
	}
	
	public String getCurrentConnectionType() {
		return currentConnectionType;
	}
}
