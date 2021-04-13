def check(Map config=[:], Closure body={}){

checkout([$class: 'GitSCM',

          branches: [[name: config.branch]],

          extensions: [ [$class: 'CheckoutOption', timeout: 120]],

          userRemoteConfigs: [[url: config.repo ]]])

}

