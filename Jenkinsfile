

pipeline {
  agent any
  

  tools {
    // Nombre dado a la instalación de Maven en "Tools configuration"
    maven "Maven_normal"
  }

  stages {
    
    stage('Git fetch') { 
      steps {
        git 'https://github.com/Claudio1812/Practica7Maven'
      }
    }
    stage('Compile, Test, Package') { 
      steps {
       
         sh "mvn  -f 'pom.xml' clean package " 
      }
      post { 
        success {
          junit '**/target/surefire-reports/TEST-*.xml'
          archiveArtifacts '**/target/*.jar'
          
          jacoco( 
            execPattern: '**/target/jacoco.exec',
            classPattern: '**/target/classes',
            sourcePattern: '**/src/',
            exclusionPattern: '**/test/'
              )
             publishCoverage adapters: [jacocoAdapter('**/target/site/jacoco/jacoco.xml')] 
        }
      }
    }
    
    
    


       
  
  }
}
