pipeline{
 	agent any
	stages{
		stage ('Compile Stage'){
			steps{
				withMaven(maven : 'maven'){
					bat 'mvn clean compile'
					}
				}
			}
		stage ('Testing Stage'){
			steps{
				withMaven(maven : 'maven'){
					bat 'mvn test'
					}
				}
			}
		stage('Install stage'){
			steps{
			withMaven(maven : 'maven'){
			bat 'mvn install'
					}
				}
			}
		
		stage('deploy to Tomcat'){
steps{
deploy adapters: [tomcat8(credentialsId: '7ca12bd3-9274-4ad3-9b1f-9b30847bb96e', path: '', url: 'http://localhost:9090/')], contextPath: 'calculator-web-services', war: '**/*.war'
}
}
}
 post {
        always {
            junit allowEmptyResults: true, testResults:  'target/surefire-reports/**/*.xml'
        }
		}
	}
