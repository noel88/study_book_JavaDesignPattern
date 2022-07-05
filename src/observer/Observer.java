package observer;


public interface Observer {
    //NOTE: Observer Pattern 에서는 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들에게 연락이 가고,
    // 자동으로 내용이 갱신되는 방식으로 one-to-many 의존성을 정의한다.

    // 패턴 구현시 Subject 인터페이스와 Observer 인터페이스가 들어있는 클래스 디자인으로 함.

    // 느슨한 결합.
    // - 옵저버를 언제든 새로 추가하거나, 제거할 수 있음.
    // - 새로운 형식의 옵저버라 할 지라도 주제를 변경할 필요 없음.
    // - 주제와 옵저버는 서로 독립적으로 재사용 할 수 있음.
    // - 주제나 옵저버가 바뀌더라도 서로에게 영향을 미치지 않음.

    // 옵저버 패턴을 사용하면 주제가 데이터를 보내거나 (push) 옵저버가 데이터를 가져올 (pull)수 있습니다.
    // 일반적으로 pull방식이 더 옳은 방식이라고 간주함.
    
    // push 방식: 주제가 옵저버에게 상태를 알리는 방식
//   void update(float temp, float humidity, float pressure);

    // pull 방식: 옵저버가 주제로부터 상태를 끌어오는 방식.
   void update();
}
