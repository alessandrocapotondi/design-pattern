import java.util.List;

public class ObserverDemo {
  public static void main(String[] args) {
	  
	  Subject s = new Subject();
	  ConcreteValueObserver o1 = new ConcreteValueObserver(s);
	  ValueLoweredObserver o2 = new ValueLoweredObserver(s);
	  ChangedByTenObserver o3 = new ChangedByTenObserver(s);
	  
	  s.changeStateBy(-1);
	  s.changeStateBy(-2);
	  s.changeStateBy(1);
	  s.changeStateBy(100);
  }
}