// var/CommonBuild.groovy
def call() {
    pipeline {
        agent any

        stages {
            stage('Checkout') {
                steps {
		    checkout scm
                }
            }
            stage('Test') {
                steps {
                    echo "Testing..."
		    sh './gradlew.sh'
                }
            }
        }
    }
}
