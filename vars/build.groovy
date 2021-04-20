
def check(Map config=[:], Closure body={}){
 echo config.command1
 bat 'mvn'+' '+config.command1


}
