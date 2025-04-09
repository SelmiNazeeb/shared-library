// var/CommonBuild.groovy
def call(String appName = 'DefaultApp') {
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    echo "Simulating checkout for: ${appName}"
                    // In a real scenario, you would use 'checkout scm' here
                    sh 'mkdir -p workspace && cd workspace && echo "Source code placeholder" > workspace/source.txt'
                }
            }
            stage('Build') {
                steps {
                    echo "Simulating build for: ${appName}"
                    sh 'cd workspace && echo "Building..." > build_output.txt'
                }
            }
        }
    }
}
