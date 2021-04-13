
def check(Map config=[:], Closure body={}){
 bat 'mvn %config.command1% -f pom.xml'
 bat 'mvn %config.command2% -f pom.xml'
 bat 'mvn %config.command3% -f pom.xml'
}
