import java.util.List;

public class DecoratorDemo {
  public static void main(String[] args) {
    final IStatisticsLogger statisticsLogger = new WithMeanStatisticsLogger(
                                              new SimpleStatistics(List.of(1.2, 2.2, 3.4)));
    statisticsLogger.displayStatistics();
  }
}
