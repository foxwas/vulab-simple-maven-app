node {
    stage('Checkout') {
      git url: '/opt/vulab/localrepos/vulab-simple-maven-app'
    }

    stage('Maven build') {
      sh 'mvn clean build'
    }
    
	stage('User Acceptance Test') {
	
	  def response= input message: 'Is this build good to go?',
	   parameters: [choice(choices: 'Yes\nNo', 
	   description: '', name: 'Pass')]
	
	  if(response=="Yes") {
	    stage('Package App') {
	      sh 'mvn package'
	    }
	  }
}	    
    
}


