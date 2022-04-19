
// i have method , but i has less args, dynamically i pass more parameters : VarArgs

def log(String ...args){
    println args
}
log('This is warning')
log('This is warning','This is error','This is something')

def logger(...args){
    println(args)
}
logger(1,"Hello",true,false,198.89)