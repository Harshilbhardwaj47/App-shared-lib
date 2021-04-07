
def chek(Map config=[:], Closure body={}){

checkout([$class: 'GitSCM',

          branches: [[name: config.branch]],

          extensions: [],

          userRemoteConfigs: [[url: config.repo ]]])

}
