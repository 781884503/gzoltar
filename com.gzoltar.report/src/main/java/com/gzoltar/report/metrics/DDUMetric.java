package com.gzoltar.report.metrics;

import com.gzoltar.core.spectrum.ISpectrum;
import com.gzoltar.report.metrics.RhoMetric.NormalizedRho;
import com.gzoltar.report.metrics.SimpsonMetric.GlobalInvertedSimpsonMetric;
import com.gzoltar.report.metrics.SimpsonMetric.InvertedSimpsonMetric;
import com.gzoltar.report.metrics.reducers.MultiplicationReducer;

public class DDUMetric implements Metric {

  private final Metric metric;

  public DDUMetric() {
    this.metric = generateMetric();
  }

  protected Metric generateMetric() {
    return new MultiplicationReducer(new NormalizedRho(), new InvertedSimpsonMetric(),
        new AmbiguityMetric());
  }

  @Override
  public double calculate(final ISpectrum spectrum) {
    return metric.calculate(spectrum);
  }

  @Override
  public String getName() {
    return "DDU";
  }

  public static class GlobalDDUMetric extends DDUMetric {
    @Override
    protected Metric generateMetric() {
      return new MultiplicationReducer(new NormalizedRho(), new GlobalInvertedSimpsonMetric(),
          new AmbiguityMetric());
    }
  }
}
