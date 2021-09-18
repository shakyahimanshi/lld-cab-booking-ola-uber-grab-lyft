package com.arunabh.olabooking.strategies;

import com.arunabh.olabooking.model.Location;

public interface PricingStrategy {
  Double findPrice(Location fromPoint, Location toPoint);
}
