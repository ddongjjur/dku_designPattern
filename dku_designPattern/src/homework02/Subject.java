package homework02;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {	// observer 추가
        observers.add(observer);
    }

    public void detach(Observer observer) {	// observer 제거
        observers.remove(observer);
    }
    
    // 메시지 전하는 함수
    public void notifyObservers(String message, Observer sender) {
        for (Observer observer : observers) {
            if (observer != sender) {	// sender를 제외
                observer.update(message);
            }
        }
    }
}
