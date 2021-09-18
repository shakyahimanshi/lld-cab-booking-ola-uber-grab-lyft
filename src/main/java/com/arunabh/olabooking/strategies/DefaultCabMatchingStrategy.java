package com.arunabh.olabooking.strategies;

import java.util.List;
import com.arunabh.olabooking.model.Cab;
import com.arunabh.olabooking.model.Location;
import com.arunabh.olabooking.model.Rider;
import lombok.NonNull;

public class DefaultCabMatchingStrategy implements CabMatchingStrategy {

  @Override
  public Cab matchCabToRider(
      @NonNull final Rider rider,
      @NonNull final List<Cab> candidateCabs,
      @NonNull final Location fromPoint,
      @NonNull final Location toPoint) {
    if (candidateCabs.isEmpty()) {
      return null;
    }
    return candidateCabs.get(0);
  }
}
