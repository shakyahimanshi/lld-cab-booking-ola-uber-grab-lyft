package com.arunabh.olabooking.strategies;

import java.util.List;
import com.arunabh.olabooking.model.Cab;
import com.arunabh.olabooking.model.Location;
import com.arunabh.olabooking.model.Rider;

public interface CabMatchingStrategy {

  Cab matchCabToRider(Rider rider, List<Cab> candidateCabs, Location fromPoint, Location toPoint);
}
