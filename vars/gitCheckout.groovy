def call(Map configParams) {
    
    checkout([
        $class: 'GitSCM',
        doGenerateSubmoduleConfigurations: false,
        branches: [[name:  configParams.branch ]],
        extensions: [[$class: 'CleanCheckout']],
        submoduleCfg: [], 
        userRemoteConfigs: [[ url: configParams.url, credentialsId: configParams.credentialsId ]]
    ])
  }
