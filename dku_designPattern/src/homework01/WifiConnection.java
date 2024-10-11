package homework01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WifiConnection implements NetworkConnection {
    private String bestNetwork;
    private boolean isConnected;

    @Override
    public void connect() {
        List<String> availableNetworks = scanWifiNetworks();	// 함수 설명은 밑에 적혀있음
        bestNetwork = findBestNetwork(availableNetworks);		// 함수 설명은 밑에 적혀있음

        if (bestNetwork != null) {
            // 윈도우에서 사용하는 Wifi 연결 명령어
            String command = "netsh wlan connect name=\"" + bestNetwork + "\"";
            try {
                Process process = Runtime.getRuntime().exec(command);
                process.waitFor();
                isConnected = true;
                System.out.println("연결된 네트워크의 이름: " + bestNetwork);
            } catch (Exception e) {	// 그냥 Exception으로 처리
                e.printStackTrace();
                isConnected = false;
            }
        } else {
            System.out.println("연결할 수 있는 Wi-Fi 네트워크가 없습니다.");
            isConnected = false;
        }
    }

    @Override
    public boolean isConnection() {		// 연결됨을 전달
        return isConnected;
    }

    @Override
    public String getConnectionType() {	// 연결된 네트워크의 타입을 전달
        return "WiFi";
    }

    private List<String> scanWifiNetworks() {		// 와이파이 종류와 서비스 세트 식별자(네트워크의 이름)을 알려주는 함수
        List<String> networks = new ArrayList<>();
        try {
            Process process = Runtime.getRuntime().exec("netsh wlan show networks");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream(), "EUC-KR"));
            String line;
            while ((line = reader.readLine()) != null) {
            	System.out.println(line);	// 내트워크 종류를 보여준다.
                if (line.contains("SSID")) {
                    String ssid = line.split(":")[1].trim();
                    networks.add(ssid); // SSID 추가 (서비스 세트 식별자)
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return networks;
    }

    private String findBestNetwork(List<String> networks) {
        // 보통 첫 번째 네트워크가 가장 연결이 좋기에, 첫 번째를 선택.
        return networks.isEmpty() ? null : networks.get(0);
    }
}

