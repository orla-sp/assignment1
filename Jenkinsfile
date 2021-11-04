pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
				echo 'Building...'
                bat 'gradle build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
				bat 'gradle war'
				bat 'xcopy C:\\Users\\orlam\\Documents\\4th_year\\Software_Eng\\A1A\\build\\libs\\A1A-1.0-SNAPSHOT.war C:\\Users\\orlam\\apache-tomcat-8.5.72\\webapps'
				bat 'set JAVA_HOME=C:\\Program Files\\Java\\jdk-11.0.11'
				bat 'set CATALINA_HOME=C:\\Users\\orlam\\apache-tomcat-8.5.72'
				bat 'C:\\Users\\orlam\\apache-tomcat-8.5.72\\bin\\startup.bat'
            }
        }
    }
}
