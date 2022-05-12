import java.util.List;

public interface IStatisticsLogger {
  void displayStatistics();
  List<Double> getExecutionTimes();
}