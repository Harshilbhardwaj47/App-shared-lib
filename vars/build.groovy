
def check(Map config=[:], Closure body={}){
 bat 'mvn %config.command1%  pom.xml'
 bat 'mvn %config.command2%  pom.xml'
 bat 'mvn %config.command3%  pom.xml'
}
