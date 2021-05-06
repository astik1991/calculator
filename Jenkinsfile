pipeline{
 	agent any
	stages{
		stage('Compile Stage'){
			steps{
				withMaven(maven : 'maven'){
					sh 'mvn clean compile'
					}
				}
			}
		stage('Compile Stage'){
			steps{
				withMaven(maven : 'maven'){
					sh 'mvn clean compile'
					}
				}
			}

		stage('Deployment Stage'){
			steps{
				withMaven(maven : 'maven'){
					sh 'mvn deploy'
					}
				}
			}
		}
	}
