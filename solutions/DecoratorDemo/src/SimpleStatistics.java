import java.util.List;

public class SimpleStatistics implements IStatisticsLogger {
	private final List<Double> executionTimes;

	public SimpleStatistics(final List<Double> executionTimes) {
		this.executionTimes = executionTimes;
	}

	@Override
	public void displayStatistics() {
		final StringBuilder stringBuilder = new StringBuilder();
		executionTimes
				.forEach(executionTime -> stringBuilder.append("Execution time: ").append(executionTime).append("\n"));
		System.out.println(stringBuilder.toString());
	}

	@Override
	public List<Double> getExecutionTimes() {
		return executionTimes;
	}
}