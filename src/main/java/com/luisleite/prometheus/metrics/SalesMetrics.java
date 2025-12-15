package com.luisleite.prometheus.metrics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class SalesMetrics {

	private final Counter salesCounter;

	public SalesMetrics(MeterRegistry registry) {
		this.salesCounter = Counter.builder("sales_total").description("Total number of sales made").register(registry);
	}

	@GetMapping("/makeSale")
	public void makeSale() {
		// Logic to process the sale would go here

		// Increment the sales counter
		salesCounter.increment();
	}
}
