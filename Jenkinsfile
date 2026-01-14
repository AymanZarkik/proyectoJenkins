pipeline {
    agent any

    tools {
        // Nombre de la instalación de Maven que hayas configurado
        // en "Manage Jenkins → Global Tool Configuration"
        maven 'Maven-3.9.8'

        // Opcional: si también configuraste el JDK 21
        jdk 'Java-21'
    }

    stages {
        stage('Test') {
            steps {
                sh 'mvn clean compile test'
            }
        }

        stage('Build application') {
            steps {
                sh 'mvn -f pom.xml clean install -Dmaven.test.skip=true'
            }
        }

        stage('Pasamos a producción') {
            steps {
                echo 'Movemos al servidor y lo ponemos en producción'
            }
        }
    }
}
