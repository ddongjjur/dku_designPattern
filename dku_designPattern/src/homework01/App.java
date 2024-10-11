package homework01;

public class App {
	
	public static void main(String[] args) {
		
		// Wifi 네트워크 연결만 구현하였습니다.
		// Wifi 네트워크 중 비밀번호를 설정하여 연결하는 것은 제외하였습니다.
		// bluetooth와 directConnection은 연결하는 것까지는 구현하지 않았습니다.
		
		NetworkConnection wifi = new WifiConnection();
		NetworkManager manager = new NetworkManager(wifi);
		manager.connect();
		
		NetworkConnection bluetooth = new BluetoothConnection();
		manager = new NetworkManager(bluetooth);
		manager.connect();
		
		NetworkConnection direct = new DirectConnection();
		manager = new NetworkManager(direct);
		manager.connect();
	}
	
}
