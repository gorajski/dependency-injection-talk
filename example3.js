var Bike = function(id, color, modelYear) {
  this.id = id
  this.color = color
  this.modelYear = modelYear
}

var Station = function(name, location, bikes = [], capacity) {
  this.name = name
  this.location = location
  this.bikes = bikes
  this.capacity = capacity
}

Station.prototype.empty = function() {
  return (this.bikes.length === 0)
}

Station.prototype.take = function(bike) {
  if (this.bikes.length < this.capacity) {
  	this.bikes.push(oneBike)
  } else {
    throw new Error("Station Full - can't add anymore bikes!")
  }
}

Station.prototype.release = function() {
  return this.bikes.shift()
}