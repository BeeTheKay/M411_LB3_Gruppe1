package sorting.algorithms;

import sorting.SortArray;

/**
 * Base interface for the sort algorithms
 *
 * @author Bastian Kappeler
 */
public interface ISortAlgorithm {

  public String getName();

  public void runSort(SortArray array);

  public double getDuration();

  public int getAmountOfComparisons();

  public long getMemoryUsage();

  public long getLoopRuns();
}
