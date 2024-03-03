node {
    stage('Checkout') {
      git url: 'C:\\jenkinslabs\\vulabrepos\\vulab-simple-java-app'
    }

    stage('Maven build') {
      bat 'mvn clean install'
    }
    
	stage('User Acceptance Test') {
	
	  def response= input message: 'Is this build good to go?',
	   parameters: [choice(choices: 'Yes\nNo', 
	   description: '', name: 'Pass')]
	
	  if(response=="Yes") {
	    stage('Package App') {
	      bat 'mvn package'
	    }
	  }
}	    
    
}

