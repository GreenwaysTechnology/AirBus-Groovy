void startWebServer(Closure<Void> callback) {
    callback('Running') //single parameter
}

startWebServer {
    println "Weberver is $it"
}

void job(Closure<Boolean> callback) {
    def status = callback('job')
    status ? println("job is running") : println("Job is not running")
}

job {
    it == 'job' ? true : false
}
//////////////////////////////////////////////////////////////////////////////////////////////////
//multi clsoure parameter
void login(String name = "", String password = "", Closure<Void> resolve, Closure<Void> reject) {
    (name == 'admin') && (password == 'admin') ? resolve('Login Success') : reject('Login failed')
}

//positional parameters
login("admin", "admin", {
    println it
}, {
    println it
})
login "foo", "bar", {
    println it
} {
    println it
}