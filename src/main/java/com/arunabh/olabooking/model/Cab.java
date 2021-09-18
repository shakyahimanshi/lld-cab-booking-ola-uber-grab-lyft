package com.arunabh.olabooking.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Cab {
  String id;
  String driverName;

  @Setter Trip currentTrip;
  @Setter Location currentLocation;
  @Setter Boolean isAvailable;

  public Cab(String id, String driverName) {
    this.id = id;
    this.driverName = driverName;
    this.isAvailable = true;
  }

  @Override
  public String toString() {
    return "Cab{" +
        "id='" + id + '\'' +
        ", driverName='" + driverName + '\'' +
        ", currentLocation=" + currentLocation +
        ", isAvailable=" + isAvailable +
        '}';
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public Trip getCurrentTrip() {
    return currentTrip;
  }

  public void setCurrentTrip(Trip currentTrip) {
    this.currentTrip = currentTrip;
  }

  public Location getCurrentLocation() {
    return currentLocation;
  }

  public void setCurrentLocation(Location currentLocation) {
    this.currentLocation = currentLocation;
  }

  public Boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }
  
}
