import groovy.json.JsonBuilder
import groovy.json.JsonOutput

JsonBuilder builder = new JsonBuilder()
builder.records {
    car {
        name 'HSV Maloo'
        make 'Holden'
        year 2006
        country 'Australia'
        homepage new URL('http://example.org')
        record {
            type 'speed'
            description 'production pickup truck with speed of 271kph'
        }
    }
}
String json = JsonOutput.prettyPrint(builder.toString())
println json