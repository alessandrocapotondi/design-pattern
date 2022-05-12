public class ConcreteValueObserver extends Observer {

  public ConcreteValueObserver(final Subject subject) {
    super(subject);
  }

  @Override
  public void update() {
    System.out.println("Specific value observer: " + subject.getState());
  }
}
