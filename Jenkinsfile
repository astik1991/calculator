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
		}
	}
