package homework01;

public class BluetoothConnection implements NetworkConnection {

	@Override
	public void connect() {
		// 블루투스는 컨테이너만 구현
	}

	@Override
	public boolean isConnection() {
		// 연결 가능하다는 것만 보여줌
		return true;
	}

	@Override
	public String getConnectionType() {
		return "BLUETOOTH";
	}
}
