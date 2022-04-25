println "Closure as parameter to another closure"
def auth = { userName, password, resolve, reject ->
    if (userName.equals('admin') && password.equals('admin')) {
        resolve('Login Success')
    } else {
        reject('Login failed')
    }
};
auth('admin', 'admin', { println "$it" }, { println "$it" });

//more dsl code, strings are enclosed within bracket and used common, but closure not necessary
auth('admin', 'admin') { println "$it" } { println "$it" }