// vars/CommonBuild.groovy
def call(String appName) {
    pipeline {
        agent any
        stages {
            stage('Run') {
                steps {
                    echo "Running for: ${appName}"
                }
            }
        }
    }
}
