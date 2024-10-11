package homework01;

public class DirectConnection implements NetworkConnection {

	@Override
	public void connect() {
		// DirectConnection도 컨테이너만 구현
	}

	@Override
	public boolean isConnection() {
		// 연결 가능하다는 것만 보여줌
		return true;
	}

	@Override
	public String getConnectionType() {
		
		return "DirectConnection";
	}

}
