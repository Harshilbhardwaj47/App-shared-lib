
def check(Map config=[:], Closure body={}){
 bat 'mvn %config.command% -f pom.xml'

}
