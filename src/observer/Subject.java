package observer;

public interface Subject {
    //각각의 Observer를 등록하고 제거하는 역할을 함.
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
