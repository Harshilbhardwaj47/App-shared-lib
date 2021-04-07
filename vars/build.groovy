
def check(Map config=[:], Closure body={}){

check([$class: 'GitSCM',

          branches: [[name: config.branch]],

          extensions: [],

          userRemoteConfigs: [[url: config.repo ]]])

}
