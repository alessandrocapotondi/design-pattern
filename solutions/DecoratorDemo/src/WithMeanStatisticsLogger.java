import java.util.List;

public class WithMeanStatisticsLogger implements IStatisticsLogger {

  private final IStatisticsLogger statisticsLogger;

  public WithMeanStatisticsLogger(final IStatisticsLogger statisticsLogger) {
    this.statisticsLogger = statisticsLogger;
  }

  @Override
  public void displayStatistics() {
//    final double mean = getExecutionTimes().stream().mapToDouble(x -> x).sum() / getExecutionTimes().size();
	double mean = 0;
    for(Double i : getExecutionTimes()) {
    	mean += i;
    }
    mean /= getExecutionTimes().size();	
    
    System.out.println("Mean is " + mean);
    statisticsLogger.displayStatistics();
  }

  @Override
  public List<Double> getExecutionTimes() {
    return statisticsLogger.getExecutionTimes();
  }
}	