import com.airbus.oo.groovy.objectdestructuring.Coordinates

def coordinate = new Coordinates(latitutde: 12, longitude: 45)
println(coordinate.latitutde)

def (lat, lng) = coordinate
println("$lat $lng")
