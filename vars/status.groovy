def check(Map config=[:], Closure body={}){

checkout([$class: 'GitSCM',

          branches: [[name: config.branch]],

          extensions: [],

          userRemoteConfigs: [[url: config.repo ]]])

}

def build(Map config=[:], Closure body={}){

checkout([$class: 'GitSCM',

          branches: [[name: config.branch]],

          extensions: [],

          userRemoteConfigs: [[url: config.repo ]]])

}
