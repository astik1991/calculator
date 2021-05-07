pipeline {  
    agent any  
    stages {  
            stage ('Compile') {  
                  steps{
                    bat label: '', script: 'mvn compile'
                    echo "test successful";
                    
                } 
            }
            stage ('Build') {  
                  steps{
                    bat label: '', script: 'mvn clean'
                    bat label: '', script: 'mvn package'
                    echo "build successful";
                    
                } 
            }
             stage ('Test') {  
                  steps{
                    bat label: '', script: 'mvn test'
                    echo "test successful";
                } 
            }
            
        stage ('Deploy') {
            steps{
            deploy adapters: [tomcat8(credentialsId: 'a7971616-2bc3-4f38-86c6-e3cb0164e6ec', path: '', url: 'http://localhost:9090')], contextPath: null, war: '**/*.war'
             echo "Deploy successful";
            }
        }
        post {
        always {
            junit allowEmptyResults: true, testResults:  'target/surefire-reports/**/*.xml'
        }
    }
        stage ('Monitor') { 
           steps{ 
             echo "Now you can monitor!";
           }
        }
    }
}
