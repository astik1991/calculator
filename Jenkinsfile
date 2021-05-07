node{

   def tomcatWeb = 'E:\\SW\\apache-tomcat-8.5.65\\apache-tomcat-8.5.65\\webapps'
  // def tomcatBin = 'D:\\Auto_deployment\\apache-tomcat-9.0.30\\apache-tomcat-9.0.30\\bin'
   def tomcatStatus = ''
   
   stage('Compile-Package-create-war-file'){
      steps{
                  bat label: '', script: 'mvn clean package'
                } 
      }
/*   stage ('Stop Tomcat Server') {
               bat ''' @ECHO OFF
               wmic process list brief | find /i "tomcat" > NUL
               IF ERRORLEVEL 1 (
                    echo  Stopped
               ) ELSE (
               echo running
                  "${tomcatBin}\\shutdown.bat"
                  sleep(time:10,unit:"SECONDS") 
               )
'''
   }*/
   stage('Deploy to Tomcat'){
     bat "copy target\\calculator-web-services.war \"${tomcatWeb}\\calculator-web-services.war\""
   }
}
