public class ChangedByTenObserver extends Observer {

  private int previousState;

  public ChangedByTenObserver(final Subject subject) {
    super(subject);
    previousState = subject.getState();
  }

  @Override
  public void update() {
    if (Math.abs(subject.getState() - previousState) >= 10) {
      System.out.println("Value changed by ten and is now: " + subject.getState());
    }
    previousState = subject.getState();
  }
}